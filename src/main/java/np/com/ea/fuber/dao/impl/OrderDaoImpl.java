package np.com.ea.fuber.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import np.com.ea.fuber.dao.OrderDao;
import np.com.ea.fuber.model.Order;
import np.com.ea.fuber.util.GenericDaoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao{

	@Autowired
	private SessionFactory sf;	
	
	public List<Order> getOrdersByFeederId(int feederId){
		Session session = sf.getCurrentSession();
		Query q = session.createQuery(
						"from Order o");
		
				/*LEFT JOIN o.orderItem ol LEFT JOIN ol.food f LEFT JOIN f.feeder fdr WHERE" */
				/*+ " fdr.id="+feederId); */
		//System.out.println(">>>>>QUERY>>>>"+q.toString())
		List<Order> orderList = q.list();
		return orderList;		
	}
	
	public Map<String, Object> getOrderAndOrderList(int orderId){
		Session session = sf.getCurrentSession();
		Order o = (Order) session.createQuery(
				"from Order o where o.id ="+orderId).uniqueResult();
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("Order", o);
		result.put("OrderItems", o.getOrderItem());
		
		return result;
	}
}
