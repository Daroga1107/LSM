package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class pruebaTabla_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n");
      out.write("\t\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t<title>Bienvenido: Administrador </title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t");
      beanDB.DB manejador = null;
      synchronized (session) {
        manejador = (beanDB.DB) _jspx_page_context.getAttribute("manejador", PageContext.SESSION_SCOPE);
        if (manejador == null){
          manejador = new beanDB.DB();
          _jspx_page_context.setAttribute("manejador", manejador, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\t<h1>\n");
      out.write("\t\t\tBienvenido \n");
      out.write("\t\t\t");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t!\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<div align=\"center\">\n");
      out.write("\t\t\t");
                
				ResultSet rs=null;
				manejador.setConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost/LSM");
				rs=manejador.executeQuery("SELECT * FROM user");
				out.println("<table class=\"table\"><tr><th scope=\"col\">#</th><th scope=\"col\">Nombre</h><th scope=\"col\">Contrasena</th><th scope=\"col\">Tipo</th><th scope=\"col\" colspan=\"2\" colspan=\"text-align: center\">Acciones</th>");
				while(rs.next()){
				    out.println("<tr><td>"+rs.getString("user.idUser")+"</td><td>"+rs.getString("user.email")+"</td><td>"+rs.getString("user.password")+"</td><td>"+manejador.roleToString(rs.getString("user.role"))+"</td>"
				             + "<td><a class=\"btn btn-primary\" href='actualizaUsuario.jsp?idUser="+rs.getString("user.idUser")+"&email="+rs.getString("user.email")+"&password="+rs.getString("user.password")+"&rol="+manejador.roleToString(rs.getString("user.role"))+"'>Modificar</a></td>"
				             + "<td><a class=\"btn btn-danger\" href='deleteDiagram.action?idUser="+rs.getString("user.idUser")+"'>Eliminar</a></td></tr>");
				}
				manejador.closeConnection();
				
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>Menu</h1>\n");
      out.write("\t\t\t<a href=\"register.jsp\">Registrar usuario</a>\n");
      out.write("\t\t\t<br />\n");
      out.write("\t\t\t<br />\n");
      out.write("\t\t\t<br />\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("usuario");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }
}
