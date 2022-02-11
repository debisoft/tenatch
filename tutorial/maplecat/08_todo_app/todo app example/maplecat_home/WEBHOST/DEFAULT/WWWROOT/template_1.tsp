<%@page content_type="text/html; charset=ISO-8859-1"%>
<%
	let view_src_url = request.getWebletFullPath() + ";server_view_src=true"
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN"><html><HEAD>
<title>firecat webserver</title>
<META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
<link rel="icon" href="favicon.ico" type="image/x-icon"> 
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon"> 
<link rel="stylesheet" type="text/css" href="default.css" />
</HEAD>
<BODY>

<style type="text/css">
a.noline:link { color: #fff; text-decoration: none; }
a.noline:visited { color: #fff; text-decoration: none;  }
a.noline:hover  { color: #f00; text-decoration: none;  }
table.left_page_border {margin-left: 10px;}
.kyokaisen {border-top-style: solid; border-top-width:1px; color: #51B5E0; width: 100%}
.white_spacer {border-top-style: solid; border-top-width:3px; color: #fff; width: 100%}
.border_spacer {margin-left: 10px;}
.page {margin: 0px auto; width: 980px;}

table.header_top td.far_right {
	text-align: right;
	vertical-align: bottom;
}

</style>
<div class="page">
<table class="left_page_border" width="100%" border="0" cellspacing="0" cellpadding="0">
<tr style="background-color: #ffffff;"><td><b><a class="noline" href="http://firecat.nihonsoft.org/"><img src="images/icon_32.png" border="0" alt="firecat.nihonsoft.org"> <font size="6" color="#0000ff">au</font><font size="6" color="#ff0000">ssiecat</font></a></b></td><td class="far_right" align="center"><img src="images/aussie.png" width="32" border="0" alt="firecat.nihonsoft.org"></td></tr>
</table>

<table width="100%" border="0" cellspacing="2" cellpadding="0" bgcolor="#3399ff">
<tr><td><div class="border_spacer"/><a class="noline" href="<%=view_src_url%>">Server View Source</a></td></tr>
</table>


<font color="#5D7992">
<nsp:PageTemplateBodyContent />
</font>
<P><table>
<tr><td align="left"><a class="powered" href="http://firecat.nihonsoft.org/"><img src="images/powered_by.png" border="0" alt="Powered by firecat" /></a></td></tr>
</table></P></BODY>
</html>
