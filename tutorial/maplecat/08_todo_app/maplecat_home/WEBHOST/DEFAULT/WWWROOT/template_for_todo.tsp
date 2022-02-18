<%@page content_type="text/html; charset=ISO-8859-1"%>
<%  let view_src_url = request.getWebletFullPath() + ";server_view_src=true" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
  <HEAD>
    <title>Maplecat TODO List Sample</title>
    <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
    <link rel="icon" href="favicon.ico" type="image/x-icon">
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="default.css" />
  </HEAD>

  <BODY>
    <style type="text/css">
    body, font {
    font-family: "lucida sans unicode", "lucida grande", sans-serif;
    }
      a.noline:link { color: #fff; text-decoration: none; }
      a.noline:visited { color: #fff; text-decoration: none;  }
      a.noline:hover  { color: #d60012; text-decoration: none; font-family: "lucida sans unicode", "lucida grande", sans-serif;  }
      table.left_page_border {margin-left: 10px;}
      .kyokaisen {border-top-style: solid; border-top-width:1px; color: #51B5E0; width: 100%}
      .white_spacer {border-top-style: solid; border-top-width:3px; color: #fff; width: 100%}
      .border_spacer {margin-left: 10px;}
      .page {margin: 0px auto; width: 980px;}

      table.header_top td.far_right {
        text-align: right;
        vertical-align: bottom;
      }

      ul.topnav {
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        background-color: #333;
      }

      ul.topnav li {float: left;}

      ul.topnav li a {
        display: block;
        color: white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
      }

      ul.topnav li a:hover:not(.active) {background-color: #111;}

      ul.topnav li a.active {background-color: #04AA6D;}

      ul.topnav li.right {float: right;}

      @media screen and (max-width: 600px) {
        ul.topnav li.right,
        ul.topnav li {float: none;}
      }
    </style>

    <div class="page">
      <table class="left_page_border" width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr style="background-color: #ffffff;">
          <td><b><a class="noline" href="">
            <img src="images/canada.png" width="72" border="0" alt="canadian flag">
            <font size="7" color="#d60012">&emsp; Maplecat Tutorial </font>
            <font size="5" color="#5c3e41">&emsp; TODO List </font>
            <font size="3" color="#d60012">&emsp; Sample</font>
          </a></b></td>
        </tr>
      </table>

      <ul class="topnav">
        <li><a class="active" href="#home">Home</a></li>
        <li><a href="#news">News</a></li>
        <li><a href="#contact">Account</a></li>
        <li class="right"><a href="#about">About</a></li>
      </ul>

      <font color="#5D7992">
        <nsp:PageTemplateBodyContent />
      </font>

      <ul class="topnav">
        <li><a class="active" href="#home">Home</a></li>
        <li><a href="#news">News</a></li>
        <li><a href="#contact">Account</a></li>
        <li class="right"><a href="#about">About</a></li>
      </ul>

      <P><table>
        <tr>
          <td align="left">
            <a class="powered" href="">
              <img src="images/powered_by.png" border="0" alt="Powered by Maplecat" />
            </a>
          </td>
        </tr>
      </table></P>

  </BODY>
</html>
