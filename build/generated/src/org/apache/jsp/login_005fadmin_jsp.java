package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("    <div class=\"container\" style=\"margin-top:40px\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t<strong> Sign in to continue</strong>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<form role=\"form\" action=\"#\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"center-block\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"profile-img\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-12 col-md-10  col-md-offset-1 \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" placeholder=\"Username\" name=\"loginname\" type=\"text\" autofocus>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-lock\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Sign in\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-footer \">\n");
      out.write("\t\t\t\t\t\tDon't have an account! <a href=\"#\" onClick=\"\"> Sign Up Here </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
