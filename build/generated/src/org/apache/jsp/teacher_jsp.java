package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teacher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_id_data$1ride_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_id_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_div_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_id_data$1ride_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_id_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_div_cssClass.release();
    _jspx_tagPool_s_div_id_data$1ride_cssClass.release();
    _jspx_tagPool_s_div_id.release();
    _jspx_tagPool_s_div_id_cssClass.release();
    _jspx_tagPool_s_div_cssClass_nobody.release();
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

      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Bienvenido Profesor</title>\n");
      out.write("        <style>\n");
      out.write("            .bd-placeholder-img{\n");
      out.write("                font-size: 1.125rem;\n");
      out.write("                text-anchor: middle;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -ms-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("            }\n");
      out.write("            @media (min-width: 768px){\n");
      out.write("                .bd-placeholder-img-lg{\n");
      out.write("                    font-size: 3.5rem;\n");
      out.write("                }                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Collapsible sidebar using Bootstrap 4</title>\n");
      out.write("        <!-- Bootstrap CSS CDN -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Our Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style2.css\">\n");
      out.write("        <!-- Scrollbar Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css\">\n");
      out.write("        <!-- Font Awesome JS -->\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\" integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\" integrity=\"sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_s_div_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Popper.JS -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- jQuery Custom Scroller CDN -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#sidebar\").mCustomScrollbar({\n");
      out.write("                theme: \"minimal\"\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $('#sidebarCollapse').on('click', function () {\n");
      out.write("                $('#sidebar, #content').toggleClass('active');\n");
      out.write("                $('.collapse.in').toggleClass('in');\n");
      out.write("                $('a[aria-expanded=true]').attr('aria-expanded', 'false');\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_s_div_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
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
        out.write("\n");
        out.write("            <!-- Sidebar  -->\n");
        out.write("        <nav id=\"sidebar\">\n");
        out.write("            ");
        if (_jspx_meth_s_div_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_div_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_div_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <ul class=\"list-unstyled components\">\n");
        out.write("                <li>\n");
        out.write("                    <a href=\"#\">Inicio</a>\n");
        out.write("                </li>\n");
        out.write("                <li>\n");
        out.write("                    <a href=\"#\">Mis grupos</a>\n");
        out.write("                </li>\n");
        out.write("                <li>\n");
        out.write("                    <a href=\"#\">Mi cuenta</a>\n");
        out.write("                </li>\n");
        out.write("                <li>\n");
        out.write("                </li>\n");
        out.write("            </ul>\n");
        out.write("            <ul class=\"list-unstyled CTAs\">\n");
        out.write("                <br>\n");
        out.write("                <br>\n");
        out.write("                <li>\n");
        out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\" onclick=\"window.location='register.jsp'\">Crear cuenta</button>\n");
        out.write("                </li>\n");
        out.write("                <br>\n");
        out.write("                <li>\n");
        out.write("                    <button class=\"btn btn-outline-danger my-2 my-sm-0\" type=\"submit\" onclick=\"window.location='index.jsp'\">Cerrar sesión</button>\n");
        out.write("                </li>\n");
        out.write("            </ul>\n");
        out.write("        </nav>\n");
        out.write("        <!-- Sidebar  -->\n");
        out.write("        <!-- Page Content  -->\n");
        out.write("        ");
        if (_jspx_meth_s_div_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_s_div_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_s_div_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_0);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_0);
    return false;
  }

  private boolean _jspx_meth_s_div_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_1 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_1.setPageContext(_jspx_page_context);
    _jspx_th_s_div_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_1.setCssClass("sidebar-header");
    int _jspx_eval_s_div_1 = _jspx_th_s_div_1.doStartTag();
    if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_div_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_1);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_1);
    return false;
  }

  private boolean _jspx_meth_s_div_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_2 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_2.setPageContext(_jspx_page_context);
    _jspx_th_s_div_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_2.setCssClass("sidebar-header");
    int _jspx_eval_s_div_2 = _jspx_th_s_div_2.doStartTag();
    if (_jspx_eval_s_div_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_div_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_2);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_2);
    return false;
  }

  private boolean _jspx_meth_s_div_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_3 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_3.setPageContext(_jspx_page_context);
    _jspx_th_s_div_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_3.setCssClass("sidebar-header");
    int _jspx_eval_s_div_3 = _jspx_th_s_div_3.doStartTag();
    if (_jspx_eval_s_div_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_div_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_3);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_3);
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
        out.write("\n");
        out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
        out.write("                ");
        if (_jspx_meth_s_div_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            </nav>\n");
        out.write("        ");
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
        out.write("\n");
        out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-dark\">\n");
        out.write("                        <i class=\"fa fa-angle-down\"></i>\n");
        out.write("                    </button>\n");
        out.write("                    <a id=\"sidebarCollapse\" class=\"navbar-brand\" href=\"#\">\n");
        out.write("                        <img src=\"./img/applog.gif\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\n");
        out.write("                        Sistema de Apoyo para el Aprendizaje de Lengua de Señas Mexicana\n");
        out.write("                    </a>\n");
        out.write("                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
        out.write("                        <i class=\"fas fa-align-justify\"></i>\n");
        out.write("                    </button>\n");
        out.write("                    ");
        if (_jspx_meth_s_div_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
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
        out.write("\n");
        out.write("                        <ul class=\"nav navbar-nav ml-auto\">\n");
        out.write("                            <li class=\"nav-item active\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Inicio</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Mis grupos</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Mi cuenta</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li>\n");
        out.write("                                <button class=\"btn btn-outline-danger my-2 my-sm-0 btn-sm\" type=\"submit\" onclick=\"window.location='index.jsp'\">Cerrar sesión</button>\n");
        out.write("                            </li>\n");
        out.write("                        </ul>\n");
        out.write("                    ");
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

  private boolean _jspx_meth_s_div_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
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
        out.write("\n");
        out.write("            <!-- Sidebar  -->\n");
        out.write("            <br>\n");
        out.write("            <br>\n");
        out.write("            <br>\n");
        out.write("            ");
        if (_jspx_meth_s_div_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_div_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_div_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <!-- /.container -->\n");
        out.write("            <hr class=\"featurette-divider\">\n");
        out.write("            <footer class=\"container text-center\">\n");
        out.write("                <p>Flores Castro Rodrigo Pavel<br>\n");
        out.write("                    Rodriguez García Daniela<br>\n");
        out.write("                    Monroy García José Eduardo<br>\n");
        out.write("                </p>\n");
        out.write("                <p>M. en C. Rubén Peredo Valderrama<br>\n");
        out.write("                    M. en C. Gabriela de Jesús Lopéz Ruiz\n");
        out.write("                </p>\n");
        out.write("                <p>&copy; Instituto Politécnico Nacional. Escuela Superior de Cómputo &middot; <a href=\"#\">Acerca de</a> &middot; <a href=\"#\">Ayuda</a></p>\n");
        out.write("            </footer>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_div_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_id.reuse(_jspx_th_s_div_7);
      return true;
    }
    _jspx_tagPool_s_div_id.reuse(_jspx_th_s_div_7);
    return false;
  }

  private boolean _jspx_meth_s_div_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_8 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_id_data$1ride_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_8.setPageContext(_jspx_page_context);
    _jspx_th_s_div_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_7);
    _jspx_th_s_div_8.setId("myCarousel");
    _jspx_th_s_div_8.setCssClass("carousel slide");
    _jspx_th_s_div_8.setDynamicAttribute(null, "data-ride", new String("carousel"));
    int _jspx_eval_s_div_8 = _jspx_th_s_div_8.doStartTag();
    if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                <ol class=\"carousel-indicators\">\n");
        out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
        out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
        out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
        out.write("                </ol>\n");
        out.write("                ");
        if (_jspx_meth_s_div_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
        out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
        out.write("                    <span class=\"sr-only\">Previous</span>\n");
        out.write("                </a>\n");
        out.write("                <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
        out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
        out.write("                    <span class=\"sr-only\">Next</span>\n");
        out.write("                </a>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_div_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_id_data$1ride_cssClass.reuse(_jspx_th_s_div_8);
      return true;
    }
    _jspx_tagPool_s_div_id_data$1ride_cssClass.reuse(_jspx_th_s_div_8);
    return false;
  }

  private boolean _jspx_meth_s_div_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_9 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_9.setPageContext(_jspx_page_context);
    _jspx_th_s_div_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_8);
    _jspx_th_s_div_9.setCssClass("carousel-inner");
    int _jspx_eval_s_div_9 = _jspx_th_s_div_9.doStartTag();
    if (_jspx_eval_s_div_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_div_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_div_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_div_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_s_div_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_9);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_9);
    return false;
  }

  private boolean _jspx_meth_s_div_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_10 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_10.setPageContext(_jspx_page_context);
    _jspx_th_s_div_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_9);
    _jspx_th_s_div_10.setCssClass("carousel-item active");
    int _jspx_eval_s_div_10 = _jspx_th_s_div_10.doStartTag();
    if (_jspx_eval_s_div_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\">\n");
        out.write("                            <rect width=\"100%\" height=\"100%\" fill=\"#777\"/>\n");
        out.write("                        </svg>\n");
        out.write("                        ");
        if (_jspx_meth_s_div_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_10);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_10);
    return false;
  }

  private boolean _jspx_meth_s_div_11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_11 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_11.setPageContext(_jspx_page_context);
    _jspx_th_s_div_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_10);
    _jspx_th_s_div_11.setCssClass("container");
    int _jspx_eval_s_div_11 = _jspx_th_s_div_11.doStartTag();
    if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_11.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_s_div_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_div_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_11);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_11);
    return false;
  }

  private boolean _jspx_meth_s_div_12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_12 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_12.setPageContext(_jspx_page_context);
    _jspx_th_s_div_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_11);
    _jspx_th_s_div_12.setCssClass("carousel-caption text-left");
    int _jspx_eval_s_div_12 = _jspx_th_s_div_12.doStartTag();
    if (_jspx_eval_s_div_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                <h3>");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_12, _jspx_page_context))
          return true;
        out.write("</h3>\n");
        out.write("                                <p><a class=\"btn btn-sm btn-primary\" href=\"#\" role=\"button\">Aprender más</a></p>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_s_div_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_12);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_12);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_12);
    _jspx_th_s_property_0.setValue("username");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_div_13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_13 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_13.setPageContext(_jspx_page_context);
    _jspx_th_s_div_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_9);
    _jspx_th_s_div_13.setCssClass("carousel-item");
    int _jspx_eval_s_div_13 = _jspx_th_s_div_13.doStartTag();
    if (_jspx_eval_s_div_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_13.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\">\n");
        out.write("                            <rect width=\"100%\" height=\"100%\" fill=\"#777\"/>\n");
        out.write("                        </svg>\n");
        out.write("                        ");
        if (_jspx_meth_s_div_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_13);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_13);
    return false;
  }

  private boolean _jspx_meth_s_div_14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_14 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_14.setPageContext(_jspx_page_context);
    _jspx_th_s_div_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_13);
    _jspx_th_s_div_14.setCssClass("container");
    int _jspx_eval_s_div_14 = _jspx_th_s_div_14.doStartTag();
    if (_jspx_eval_s_div_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_14.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_s_div_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_14, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_div_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_14);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_14);
    return false;
  }

  private boolean _jspx_meth_s_div_15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_15 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_15.setPageContext(_jspx_page_context);
    _jspx_th_s_div_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_14);
    _jspx_th_s_div_15.setCssClass("carousel-caption text-left");
    int _jspx_eval_s_div_15 = _jspx_th_s_div_15.doStartTag();
    if (_jspx_eval_s_div_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_15.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                <h3>Ver progreso</h3>\n");
        out.write("                                <p><a class=\"btn btn-sm btn-primary\" href=\"#\" role=\"button\">Ir</a></p>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_s_div_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_15);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_15);
    return false;
  }

  private boolean _jspx_meth_s_div_16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_16 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_16.setPageContext(_jspx_page_context);
    _jspx_th_s_div_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_9);
    _jspx_th_s_div_16.setCssClass("carousel-item");
    int _jspx_eval_s_div_16 = _jspx_th_s_div_16.doStartTag();
    if (_jspx_eval_s_div_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_16.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\">\n");
        out.write("                            <rect width=\"100%\" height=\"100%\" fill=\"#777\"/>\n");
        out.write("                        </svg>\n");
        out.write("                        ");
        if (_jspx_meth_s_div_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_16, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_16);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_16);
    return false;
  }

  private boolean _jspx_meth_s_div_17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_17 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_17.setPageContext(_jspx_page_context);
    _jspx_th_s_div_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_16);
    _jspx_th_s_div_17.setCssClass("container");
    int _jspx_eval_s_div_17 = _jspx_th_s_div_17.doStartTag();
    if (_jspx_eval_s_div_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_17.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_s_div_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_17, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_div_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_17);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_17);
    return false;
  }

  private boolean _jspx_meth_s_div_18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_18 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_18.setPageContext(_jspx_page_context);
    _jspx_th_s_div_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_17);
    _jspx_th_s_div_18.setCssClass("carousel-caption text-left");
    int _jspx_eval_s_div_18 = _jspx_th_s_div_18.doStartTag();
    if (_jspx_eval_s_div_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_18.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                <h3>Acerca de</h3>\n");
        out.write("                                <p><a class=\"btn btn-sm btn-primary\" href=\"#\" role=\"button\">Ir</a></p>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_s_div_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_18);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_18);
    return false;
  }

  private boolean _jspx_meth_s_div_19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_19 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_19.setPageContext(_jspx_page_context);
    _jspx_th_s_div_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_7);
    _jspx_th_s_div_19.setCssClass("line");
    int _jspx_eval_s_div_19 = _jspx_th_s_div_19.doStartTag();
    if (_jspx_th_s_div_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass_nobody.reuse(_jspx_th_s_div_19);
      return true;
    }
    _jspx_tagPool_s_div_cssClass_nobody.reuse(_jspx_th_s_div_19);
    return false;
  }

  private boolean _jspx_meth_s_div_20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_20 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_20.setPageContext(_jspx_page_context);
    _jspx_th_s_div_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_7);
    _jspx_th_s_div_20.setCssClass("container marketing");
    int _jspx_eval_s_div_20 = _jspx_th_s_div_20.doStartTag();
    if (_jspx_eval_s_div_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_20.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                <!-- Three columns of text below the carousel -->\n");
        out.write("                ");
        if (_jspx_meth_s_div_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_20, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                <!-- /.row -->\n");
        out.write("                <!-- START THE FEATURETTES -->\n");
        out.write("                <!-- /END THE FEATURETTES -->\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_div_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_20);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_20);
    return false;
  }

  private boolean _jspx_meth_s_div_21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_21 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_21.setPageContext(_jspx_page_context);
    _jspx_th_s_div_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_20);
    _jspx_th_s_div_21.setCssClass("row");
    int _jspx_eval_s_div_21 = _jspx_th_s_div_21.doStartTag();
    if (_jspx_eval_s_div_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_21.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_div_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <!-- /.col-lg-4 -->\n");
        out.write("                    ");
        if (_jspx_meth_s_div_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <!-- /.col-lg-4 -->\n");
        out.write("                    ");
        if (_jspx_meth_s_div_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <!-- /.col-lg-4 -->\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_s_div_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_21);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_21);
    return false;
  }

  private boolean _jspx_meth_s_div_22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_22 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_22.setPageContext(_jspx_page_context);
    _jspx_th_s_div_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_21);
    _jspx_th_s_div_22.setCssClass("col-lg-4 text-center");
    int _jspx_eval_s_div_22 = _jspx_th_s_div_22.doStartTag();
    if (_jspx_eval_s_div_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_22.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 140x140\">\n");
        out.write("                            <title>Placeholder</title>\n");
        out.write("                            <rect width=\"100%\" height=\"100%\" fill=\"#777\"/>\n");
        out.write("                            <text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text>\n");
        out.write("                        </svg>\n");
        out.write("                        <h2>Ver módulos</h2>\n");
        out.write("                        <p>Aquí puedes ver los modulos actualmente disponibles</p>\n");
        out.write("                        <p><a class=\"btn btn-secondary\" href=\"#\" role=\"button\">Aprender más &raquo;</a></p>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_22);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_22);
    return false;
  }

  private boolean _jspx_meth_s_div_23(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_23 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_23.setPageContext(_jspx_page_context);
    _jspx_th_s_div_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_21);
    _jspx_th_s_div_23.setCssClass("col-lg-4 text-center");
    int _jspx_eval_s_div_23 = _jspx_th_s_div_23.doStartTag();
    if (_jspx_eval_s_div_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_23.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 140x140\">\n");
        out.write("                            <title>Placeholder</title>\n");
        out.write("                            <rect width=\"100%\" height=\"100%\" fill=\"#777\"/>\n");
        out.write("                            <text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text>\n");
        out.write("                        </svg>\n");
        out.write("                        <h2>Ver progreso</h2>\n");
        out.write("                        <p>Aquí puedes ver estadistícas de tus grupos</p>\n");
        out.write("                        <p><a class=\"btn btn-secondary\" href=\"#\" role=\"button\">Aprender más &raquo;</a></p>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_23);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_23);
    return false;
  }

  private boolean _jspx_meth_s_div_24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_24 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_24.setPageContext(_jspx_page_context);
    _jspx_th_s_div_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_21);
    _jspx_th_s_div_24.setCssClass("col-lg-4 text-center");
    int _jspx_eval_s_div_24 = _jspx_th_s_div_24.doStartTag();
    if (_jspx_eval_s_div_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_24.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 140x140\">\n");
        out.write("                            <title>Placeholder</title>\n");
        out.write("                            <rect width=\"100%\" height=\"100%\" fill=\"#777\"/>\n");
        out.write("                            <text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text>\n");
        out.write("                        </svg>\n");
        out.write("                        <h2>Mis grupos</h2>\n");
        out.write("                        <p>Aquí puedes ver los nombres y progreso de tus alumnos!</p>\n");
        out.write("                        <p><a class=\"btn btn-secondary\" href=\"#\" role=\"button\">Aprender más &raquo;</a></p>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_24);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_24);
    return false;
  }
}
