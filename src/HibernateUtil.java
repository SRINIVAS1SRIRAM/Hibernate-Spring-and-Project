

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static void main(String[] args) {
		try
		{
			Configuration config=new Configuration();
			
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			com.Product product=new com.Product();
			
			product.setProductId(1003);
			product.setProductName("Honor 11N");
			product.setProductPrice(15500);
			
			session.save(product);
			
			transaction.commit();
			
			session.close();
			
			System.out.println("Object is Saved");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured:"+e);
		}

	}

}
