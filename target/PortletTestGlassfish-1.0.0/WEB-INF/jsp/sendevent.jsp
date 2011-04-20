<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<h4>SendEvent !!!</h4>
	<form id="doSendEvent" method="post" action="<portlet:actionURL/>">
	<input type="hidden" name="op" value="sendevent"></input>
	<input type="submit" value="Envoi de l'EVent" />
	</form>