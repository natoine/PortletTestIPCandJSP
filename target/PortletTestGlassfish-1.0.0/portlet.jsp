<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://portlet-container.dev.java.net" prefix="pcdriver"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<span>Premier Portlet :</span>
      <pcdriver:portlet portletName="PortletSendEvent" applicationName="PortletTestGlassfish-1.0.0" >
           <h2 class="portlet-title"><pcdriver:title/></h2>
           <pcdriver:render/>
      </pcdriver:portlet>
</div>
<div>
<span>Deuxième Portlet :</span>
	<pcdriver:portlet portletName="PortletReceptEvent" applicationName="PortletTestGlassfish-1.0.0" >
           <h2 class="portlet-title"><pcdriver:title/></h2>
           <pcdriver:render/>
      </pcdriver:portlet>
</div>
</body>
</html>