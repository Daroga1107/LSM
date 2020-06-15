package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class appUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_id_cssClass;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_div_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_id_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_div_cssClass.release();
    _jspx_tagPool_s_div_id.release();
    _jspx_tagPool_s_div_cssClass_nobody.release();
    _jspx_tagPool_s_div_id_cssClass.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\t\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<!-- Head  -->\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>SAALSM - Usuarios</title>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t.bd-placeholder-img{\r\n");
      out.write("\t\t\tfont-size: 1.125rem;\r\n");
      out.write("\t\t\ttext-anchor: middle ;\r\n");
      out.write("\t\t\t-webkit-user-select: none;\r\n");
      out.write("\t\t\t-moz-user-select: none;\r\n");
      out.write("\t\t\t-ms-user-select: none;\r\n");
      out.write("\t\t\tuser-select: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t@media (min-width: 768px){\r\n");
      out.write("\t\t\t.bd-placeholder-img-lg{\r\n");
      out.write("\t\t\tfont-size: 3.5rem;\r\n");
      out.write("\t\t\t}                \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t\t<title>Collapsible sidebar using Bootstrap 4</title>\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<!-- Bootstrap CSS CDN -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("\t\t<!-- Our Custom CSS --> \r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/style2.css\">\r\n");
      out.write("\t\t<!-- Scrollbar Custom CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("\t\t<!-- Font Awesome JS -->\r\n");
      out.write("\t\t<script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\" integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\" integrity=\"sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<!-- Head  -->\r\n");
      out.write("\t<body>\r\n");
      out.write("            ");
      beanDB.DB manejador = null;
      synchronized (session) {
        manejador = (beanDB.DB) _jspx_page_context.getAttribute("manejador", PageContext.SESSION_SCOPE);
        if (manejador == null){
          manejador = new beanDB.DB();
          _jspx_page_context.setAttribute("manejador", manejador, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\t");
      //  s:div
      org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_0 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
      _jspx_th_s_div_0.setPageContext(_jspx_page_context);
      _jspx_th_s_div_0.setParent(null);
      _jspx_th_s_div_0.setCssClass("wrapper");
      int _jspx_eval_s_div_0 = _jspx_th_s_div_0.doStartTag();
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_div_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_div_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t\t<!-- Barra lateral  -->\r\n");
          out.write("\t\t\t<nav id=\"sidebar\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_s_div_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_s_div_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_s_div_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t<ul class=\"list-unstyled CTAs\">\r\n");
          out.write("\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"admin.jsp\" role=\"button\">\r\n");
          out.write("                                                    <i class=\"material-icons fa fa-home\"></i>  Inicio\r\n");
          out.write("                                                </a>\r\n");
          out.write("\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"myInfo.jsp\" role=\"button\">\r\n");
          out.write("                                                    <i class=\"material-icons fa fa-user-circle\"></i>  Mi cuenta\r\n");
          out.write("                                                </a>\r\n");
          out.write("\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"validateUser.jsp\" role=\"button\">\r\n");
          out.write("                                                    <i class=\"material-icons fa fa-users\"></i>  Validar usuarios\r\n");
          out.write("                                                </a>\r\n");
          out.write("\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"addUser.jsp\" role=\"button\">\r\n");
          out.write("                                                    <i class=\"material-icons fa fa-user-plus\"></i>  Agregar usuario\r\n");
          out.write("                                                </a>\r\n");
          out.write("\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"appUsers.jsp\" role=\"button\">\r\n");
          out.write("                                                    <i class=\"material-icons fa fa-user\"></i>  Ver usuarios\r\n");
          out.write("                                                </a>\r\n");
          out.write("\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t<br>\r\n");
          out.write("\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"sessionClosed.jsp\" role=\"button\">\r\n");
          out.write("                                                    <i class=\"material-icons fa fa-power-off\"></i>  Cerrar sesión\r\n");
          out.write("                                                </a>\r\n");
          out.write("\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t</ul>\r\n");
          out.write("\t\t\t</nav>\r\n");
          out.write("\t\t\t<!-- Barra lateral  -->\r\n");
          out.write("\t\t\t<!-- Menu superior  -->\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_s_div_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<!-- Menu superior  -->\r\n");
          out.write("\t\t\t<!-- Contenido  -->\r\n");
          out.write("\t\t\t");
          //  s:div
          org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_7 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_id.get(org.apache.struts2.views.jsp.ui.DivTag.class);
          _jspx_th_s_div_7.setPageContext(_jspx_page_context);
          _jspx_th_s_div_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
          _jspx_th_s_div_7.setId("content");
          int _jspx_eval_s_div_7 = _jspx_th_s_div_7.doStartTag();
          if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_s_div_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_s_div_7.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\t\t\t<br>\r\n");
              out.write("\t\t\t\t<!-- Carrusel  -->\r\n");
              out.write("\t\t\t\t<!-- Carrusel  -->\r\n");
              out.write("\t\t\t\t<!-- Contenedores  -->\r\n");
              out.write("\t\t\t\t<div align=\"center\">\r\n");
              out.write("\t\t\t");
                
				ResultSet rs=null;
				manejador.setConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/LSM");
				rs=manejador.executeQuery("SELECT * FROM user");
				out.println("<table class=\"table\"><tr><th scope=\"col\">#</th><th scope=\"col\">Nombre</h><th scope=\"col\">Contraseña</th><th scope=\"col\">Tipo</th><th scope=\"col\" colspan=\"2\" colspan=\"text-align: center\">Acciones</th>");
				while(rs.next()){
				    out.println("<tr><td>"+rs.getString("user.idUser")+"</td><td>"+rs.getString("user.email")+"</td><td>"+rs.getString("user.password")+"</td><td>"+manejador.roleToString(rs.getString("user.role"))+"</td>"
				             + "<td><a class=\"btn btn-primary\" href='modifyUser.jsp?idUser="+rs.getString("user.idUser")+"&email="+rs.getString("user.email")+"&password="+rs.getString("user.password")+"&rol="+manejador.roleToString(rs.getString("user.role"))+"'>Modificar</a></td>"
				             + "<td><a class=\"btn btn-danger\" href='deleteUser.action?idUser="+rs.getString("user.idUser")+"'>Eliminar</a></td></tr>");
				System.out.println("MENSAJE: El ID a enviado fue "+rs.getString("user.idUser"));
                                }
				manejador.closeConnection();
				
              out.write("\r\n");
              out.write("\t\t</div>\r\n");
              out.write("\t\t\t\t<!-- Contenedores  -->\r\n");
              out.write("\t\t\t\t<!-- Footer  -->\r\n");
              out.write("\t\t\t\t<footer style=\"position: fixed; bottom: 0px;\">\r\n");
              out.write("\t\t\t\t\t<p>&copy; Instituto Politécnico Nacional. Escuela Superior de Cómputo 2020 &middot  <a href=\"#\">Acerca de</a> &middot; <a href=\"#\">Ayuda</a></p>\r\n");
              out.write("\t\t\t\t</footer>\r\n");
              out.write("\t\t\t\t<!-- Footer  -->            \r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_s_div_7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_s_div_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_s_div_id.reuse(_jspx_th_s_div_7);
            return;
          }
          _jspx_tagPool_s_div_id.reuse(_jspx_th_s_div_7);
          out.write("\r\n");
          out.write("\t\t\t<!-- Contenido  -->\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_s_div_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_s_div_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_0);
        return;
      }
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_0);
      out.write("\r\n");
      out.write("\t\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<!-- Popper.JS -->\r\n");
      out.write("\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<!-- Bootstrap JS -->\r\n");
      out.write("\t\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<!-- jQuery Custom Scroller CDN -->\r\n");
      out.write("\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function () {\r\n");
      out.write("\t\t\t    $(\"#sidebar\").mCustomScrollbar({\r\n");
      out.write("\t\t\t        theme: \"minimal\"\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    $('#sidebarCollapse').on('click', function () {\r\n");
      out.write("\t\t\t        $('#sidebar, #content').toggleClass('active');\r\n");
      out.write("\t\t\t        $('.collapse.in').toggleClass('in');\r\n");
      out.write("\t\t\t        $('a[aria-expanded=true]').attr('aria-expanded', 'false');\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
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

  private boolean _jspx_meth_s_div_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_1 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_1.setPageContext(_jspx_page_context);
    _jspx_th_s_div_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_1.setCssClass("sidebar-header");
    int _jspx_eval_s_div_1 = _jspx_th_s_div_1.doStartTag();
    if (_jspx_th_s_div_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass_nobody.reuse(_jspx_th_s_div_1);
      return true;
    }
    _jspx_tagPool_s_div_cssClass_nobody.reuse(_jspx_th_s_div_1);
    return false;
  }

  private boolean _jspx_meth_s_div_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_2 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_2.setPageContext(_jspx_page_context);
    _jspx_th_s_div_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_2.setCssClass("sidebar-header");
    int _jspx_eval_s_div_2 = _jspx_th_s_div_2.doStartTag();
    if (_jspx_th_s_div_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass_nobody.reuse(_jspx_th_s_div_2);
      return true;
    }
    _jspx_tagPool_s_div_cssClass_nobody.reuse(_jspx_th_s_div_2);
    return false;
  }

  private boolean _jspx_meth_s_div_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_3 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_3.setPageContext(_jspx_page_context);
    _jspx_th_s_div_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_3.setCssClass("sidebar-header");
    int _jspx_eval_s_div_3 = _jspx_th_s_div_3.doStartTag();
    if (_jspx_th_s_div_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass_nobody.reuse(_jspx_th_s_div_3);
      return true;
    }
    _jspx_tagPool_s_div_cssClass_nobody.reuse(_jspx_th_s_div_3);
    return false;
  }

  private boolean _jspx_meth_s_div_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_4 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_id.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_4.setPageContext(_jspx_page_context);
    _jspx_th_s_div_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_4.setId("nav-var");
    int _jspx_eval_s_div_4 = _jspx_th_s_div_4.doStartTag();
    if (_jspx_eval_s_div_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_div_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</nav>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_id.reuse(_jspx_th_s_div_4);
      return true;
    }
    _jspx_tagPool_s_div_id.reuse(_jspx_th_s_div_4);
    return false;
  }

  private boolean _jspx_meth_s_div_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_5 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_5.setPageContext(_jspx_page_context);
    _jspx_th_s_div_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_4);
    _jspx_th_s_div_5.setCssClass("container-fluid");
    int _jspx_eval_s_div_5 = _jspx_th_s_div_5.doStartTag();
    if (_jspx_eval_s_div_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-dark\">\r\n");
        out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-down\"></i>\r\n");
        out.write("\t\t\t\t\t\t</button>\r\n");
        out.write("\t\t\t\t\t\t<a id=\"sidebarCollapse\" class=\"navbar-brand\" href=\"#\">\r\n");
        out.write("                                                    <img src=\"../img/systemName.gif\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\r\n");
        out.write("\t\t\t\t\t\tSistema de Apoyo para el Aprendizaje de Lengua de Señas Mexicana\r\n");
        out.write("\t\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t\t\t<button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
        out.write("\t\t\t\t\t\t<i class=\"fas fa-align-justify\"></i>\r\n");
        out.write("\t\t\t\t\t\t</button>\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_div_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_5);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_5);
    return false;
  }

  private boolean _jspx_meth_s_div_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_6 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_id_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_6.setPageContext(_jspx_page_context);
    _jspx_th_s_div_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_5);
    _jspx_th_s_div_6.setCssClass("collapse navbar-collapse");
    _jspx_th_s_div_6.setId("navbarSupportedContent");
    int _jspx_eval_s_div_6 = _jspx_th_s_div_6.doStartTag();
    if (_jspx_eval_s_div_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav ml-auto\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn nav-link\" href=\"admin.jsp\" role=\"button\"><i class=\"material-icons fa fa-home\"></i>  Inicio</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn nav-link\" href=\"myInfo.jsp\" role=\"button\"><i class=\"material-icons fa fa-user-circle\"></i>  Mi cuenta</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"sessionClosed.jsp\" class=\"btn nav-link\" href=\"#\" role=\"button\"><i class=\"material-icons fa fa-power-off\"></i>  Cerrar sesión</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_id_cssClass.reuse(_jspx_th_s_div_6);
      return true;
    }
    _jspx_tagPool_s_div_id_cssClass.reuse(_jspx_th_s_div_6);
    return false;
  }
}
