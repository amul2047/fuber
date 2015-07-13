package np.com.ea.fuber.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FeedOrder")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_id")
	private int id;
	
	@OneToMany(mappedBy="order",  cascade =CascadeType.ALL)
	private List<OrderItem> orderItem = new ArrayList<OrderItem>();
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDateTime;
	
	@Enumerated
	private OrderStatus status;

	public int getId() 
	{
		return id;
	}
	
	public void setId(int orderId1) {
		id = orderId1;
	}
	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	@Column(name="orderDate" )
	public Date getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	
	public void addOrderItem(OrderItem oi){
		this.orderItem.add(oi);
		oi.setOrder(this);
	}
	
	public void removeOrderItem(OrderItem oi){
		this.orderItem.remove(oi);
		oi.setOrder(null);
	}
	

}
