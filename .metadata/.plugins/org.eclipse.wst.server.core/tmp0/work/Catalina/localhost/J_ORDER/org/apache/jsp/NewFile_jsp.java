/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-01-08 08:20:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1704264575640L));
    _jspx_dependants.put("jar:file:/C:/Users/user/Desktop/Course/jsp/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/J_ORDER/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1704702038641L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<style>\r\n");
      out.write("body, html {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	width: 100vw;\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("	background-position: center;\r\n");
      out.write("	background-color: #000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-box {\r\n");
      out.write("	width: 1280px;\r\n");
      out.write("	height: 720px;\r\n");
      out.write("	background: url('img/bg.png') center/cover no-repeat;\r\n");
      out.write("	background-color: #ffffff;\r\n");
      out.write("	border: 1px solid #000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".brand {\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	top: 5px;\r\n");
      out.write("	left: 50%;\r\n");
      out.write("	transform: translateX(-50%);\r\n");
      out.write("	background-color: color: #fff;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	width: 500px; /* 필요에 따라 너비를 조절하세요. */\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 50px;\r\n");
      out.write("	margin-top: 140px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-container {\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	top: 50%;\r\n");
      out.write("	left: 50%;\r\n");
      out.write("	transform: translate(-50%, -50%);\r\n");
      out.write("	background-color: rgba(255, 255, 255, 0.8); /* 투명한 백그라운드 색상 */\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-form {\r\n");
      out.write("	max-width: 300px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-form input {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-form button {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	background-color: #3498db;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	border: none;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-form button:hover {\r\n");
      out.write("	background-color: #2980b9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signup-button {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("	color: #3498db;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<title>제이오더 입니다.</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>");
      out.write("  \r\n");
      out.write("	<div class=\"brand\">J-Order</div>  \r\n");
      out.write("	<div class=\"custom-box\"></div>\r\n");
      out.write("	<div class=\"login-container\">\r\n");
      out.write("    <h2>로그인</h2>\r\n");
      out.write("    <form class=\"login-form\">\r\n");
      out.write("        <input type=\"text\" placeholder=\"아이디\" required>\r\n");
      out.write("        <input type=\"password\" placeholder=\"비밀번호\" required>\r\n");
      out.write("<!--         <input type=\"text\" placeholder=\"이름\" required>\r\n");
      out.write("        <input type=\"email\" placeholder=\"이메일\" required> -->\r\n");
      out.write("        <button type=\"submit\">로그인</button>\r\n");
      out.write("        <a class=\"signup-button\" href=\"#\">회원가입</a>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
