import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.MyBean;

public class SpringImpl {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		MyBean obj = (MyBean) factory.getBean("myBeanObj");
		obj.display();
	}

}
