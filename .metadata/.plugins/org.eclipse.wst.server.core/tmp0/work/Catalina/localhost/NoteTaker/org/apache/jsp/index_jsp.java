/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.98
 * Generated at: 2025-01-31 11:42:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1738323381020L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<title>Note Taker: Home Page</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	background-color: #f3f4f6;\r\n");
      out.write("	font-family: 'Arial', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("	background-color: #3f51b5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a {\r\n");
      out.write("	color: white;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a:hover {\r\n");
      out.write("	color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero-section {\r\n");
      out.write("	background-color: #6f42c1;\r\n");
      out.write("	color: white;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding: 80px 30px; /* Increased padding */\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero-section h1 {\r\n");
      out.write("	font-size: 3rem; /* Increased font size */\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero-section p {\r\n");
      out.write("	font-size: 1.2rem; /* Increased font size */\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cta-button {\r\n");
      out.write("	background-color: #ffffff;\r\n");
      out.write("	color: #6f42c1;\r\n");
      out.write("	padding: 15px 30px; /* Increased padding */\r\n");
      out.write("	font-size: 1.1rem;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cta-button:hover {\r\n");
      out.write("	background-color: #ddd;\r\n");
      out.write("	transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("	background-color: #6f42c1;\r\n");
      out.write("	color: white;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".features-section h3 {\r\n");
      out.write("	font-size: 1.5rem; /* Increased font size */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".features-section p {\r\n");
      out.write("	font-size: 1.1rem; /* Increased font size */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container text-center mt-4 mb-4\">\r\n");
      out.write("		");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark purple\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\">Note Taker</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\" >\r\n");
      out.write("        <a class=\"nav-link\" href=\"add_notes.jsp\">Add Notes<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"allNotes.jsp\">All Notes<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Hero Section -->\r\n");
      out.write("	<div class=\"hero-section\">\r\n");
      out.write("		<h1>Welcome to Your Note Taker</h1>\r\n");
      out.write("		<p>Organize your thoughts, ideas, and notes in one simple and\r\n");
      out.write("			secure platform.</p>\r\n");
      out.write("		<button class=\"cta-button\"\r\n");
      out.write("			onclick=\"window.location.href='add_notes.jsp'\">Start Adding\r\n");
      out.write("			Notes</button>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Features Section -->\r\n");
      out.write("	<div class=\"container mt-5 features-section\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-4 text-center\">\r\n");
      out.write("				<h3>Easy to Use</h3>\r\n");
      out.write("				<p>Simple interface for adding and organizing notes with a few\r\n");
      out.write("					clicks.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 text-center\">\r\n");
      out.write("				<h3>Secure</h3>\r\n");
      out.write("				<p>Your notes are stored safely and are only accessible to you.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 text-center\">\r\n");
      out.write("				<h3>Accessible Anywhere</h3>\r\n");
      out.write("				<p>Access your notes from any device at any time.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Footer Section -->\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<p>&copy; 2025 Note Taker. All rights reserved.</p>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Optional JavaScript -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\r\n");
      out.write("		integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
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
