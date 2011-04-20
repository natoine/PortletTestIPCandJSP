package fr.natoine.PortletTestGlassfish;
import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.Event;
import javax.portlet.EventPortlet;


public class PortletReceptEvent extends GenericPortlet implements EventPortlet
{
	protected void doView(RenderRequest rRequest, RenderResponse rResponse) throws IOException,
	PortletException
	{
		if(rRequest.getParameter("stringEvent")!=null)//Action avec Event
		{
			rResponse.setContentType("text/html");
			PrintWriter writer = rResponse.getWriter();
			writer.write("Event value of totoString : " + rRequest.getParameter("stringEvent"));
			writer.close();
		}
		else //Action sans Event
		{
			rResponse.setContentType("text/html");
			PrintWriter writer = rResponse.getWriter();
			writer.write("Pas d'event pour l'instant !!!");
			writer.close();
		}
	}

	public void processEvent(EventRequest request, EventResponse response) {
		Event event = request.getEvent();
		String _toto = "vide";
		if (event.getName().equals("totoString")) {
			// traitement de l'event
			_toto = (String) event.getValue();
			response.setRenderParameter("stringEvent", _toto);
		}
	}
}
