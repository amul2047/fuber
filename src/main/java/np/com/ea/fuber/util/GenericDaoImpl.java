package np.com.ea.fuber.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    @Autowired
    private SessionFactory sf;

    protected Class<? extends T> daoType;

    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }
    
    public T create(T t) {
        sf.getCurrentSession().merge(t);
        return t;
    }
 
    public void delete(Long id) {

        T t = (T) sf.getCurrentSession()
                .load(daoType, id);
        if (null != t) {
            sf.getCurrentSession().delete(t);
        }

    }

    public T find(Long id) {
        return (T) sf.getCurrentSession().get(daoType, id);
    }


    public T update(T t) {
        return (T) sf.getCurrentSession().merge(t);
    }


    public List<T> getList() {
        return sf.getCurrentSession().createCriteria(daoType).list();
    }

}