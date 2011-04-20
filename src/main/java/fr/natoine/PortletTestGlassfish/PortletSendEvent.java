package fr.natoine.PortletTestGlassfish;
import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class PortletSendEvent extends GenericPortlet 
{
	protected void doView(RenderRequest rRequest, RenderResponse rResponse)
	throws IOException, PortletException {
		rResponse.setContentType("text/html");
		PortletRequestDispatcher prd;
		//System.out.println("[PortletSendEvent.doView] chemin du jsp : " + rResponse.encodeURL("/WEB-INF/jsp/sendevent.jsp"));
		prd = getPortletContext().getRequestDispatcher(rResponse.encodeURL("/WEB-INF/jsp/sendevent.jsp"));
		prd.include(rRequest, rResponse);
	}
	public void processAction(ActionRequest request, ActionResponse response)
	throws PortletException, IOException {
		//System.out.println("processAction");
		String op = request.getParameter("op");
		if(op!= null && op.equalsIgnoreCase("sendevent")) this.sendEvent(response);
		else response.setPortletMode(PortletMode.VIEW);
	}
	
	public void sendEvent(ActionResponse response)
	{
		String _toto = "passée en event";
		response.setEvent("totoString", _toto);
		//System.out.println("envoi Event toto");
	}
}
