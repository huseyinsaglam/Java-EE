package requestattributelistener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class Notes2 implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
	System.out.println("attributeAdded: "+ srae.getName() + " " +srae.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		System.out.println("attributeRemoved: "+ srae.getName() + " " +srae.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		System.out.println("attributeReplaced: "+ srae.getName() + " " +srae.getValue());
	}

}
