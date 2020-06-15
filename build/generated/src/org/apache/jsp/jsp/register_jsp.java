package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_type_theme_requiredLabel_onfocus_label_key_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_type_theme_placeholder_name_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_for;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_theme_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_style_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_theme_requiredLabel_placeholder_name_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_theme_for;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_theme_placeholder_name_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_cssClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_type_theme_label_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_textfield_type_theme_requiredLabel_onfocus_label_key_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_type_theme_placeholder_name_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_label_for = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_theme_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_style_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_password_theme_requiredLabel_placeholder_name_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_label_theme_for = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_password_theme_placeholder_name_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_cssClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_type_theme_label_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_textfield_type_theme_requiredLabel_onfocus_label_key_cssClass_nobody.release();
    _jspx_tagPool_s_textfield_type_theme_placeholder_name_cssClass_nobody.release();
    _jspx_tagPool_s_label_for.release();
    _jspx_tagPool_s_div_cssClass.release();
    _jspx_tagPool_s_div_theme_cssClass.release();
    _jspx_tagPool_s_div_style_cssClass.release();
    _jspx_tagPool_s_password_theme_requiredLabel_placeholder_name_cssClass_nobody.release();
    _jspx_tagPool_s_label_theme_for.release();
    _jspx_tagPool_s_password_theme_placeholder_name_cssClass_nobody.release();
    _jspx_tagPool_s_form_cssClass_action.release();
    _jspx_tagPool_s_submit_value_type_theme_label_cssClass_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\t\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\t<meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("\t\t<meta name=\"generator\" content=\"Jekyll v3.8.5\">\n");
      out.write("\t\t<title>Registro</title>\n");
      out.write("\t\t<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.3/examples/checkout/\">\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\t.bd-placeholder-img {\n");
      out.write("\t\t\tfont-size: 1.125rem;\n");
      out.write("\t\t\ttext-anchor: middle;\n");
      out.write("\t\t\t-webkit-user-select: none;\n");
      out.write("\t\t\t-moz-user-select: none;\n");
      out.write("\t\t\t-ms-user-select: none;\n");
      out.write("\t\t\tuser-select: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t@media (min-width: 768px) {\n");
      out.write("\t\t\t.bd-placeholder-img-lg {\n");
      out.write("\t\t\tfont-size: 3.5rem;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tbody {\n");
      out.write("\t\t\tbackground-image: url('../img/background.jpg');\n");
      out.write("\t\t\tbackground-position: right;\n");
      out.write("\t\t\tbackground-repeat: no-repeat\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<!-- Custom styles for this template -->\n");
      out.write("\t\t<link href=\"../css/form-validation.css\" rel=\"stylesheet\">\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"bg-light\">\n");
      out.write("\t\t");
      if (_jspx_meth_s_div_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\t\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t<script>window.jQuery || document.write('<script src=\"/docs/4.3/assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script><script src=\"/docs/4.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t<script src=\"../js/form-validation.js\"></script>\n");
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

  private boolean _jspx_meth_s_div_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_0 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_0.setPageContext(_jspx_page_context);
    _jspx_th_s_div_0.setParent(null);
    _jspx_th_s_div_0.setCssClass("container");
    int _jspx_eval_s_div_0 = _jspx_th_s_div_0.doStartTag();
    if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_div_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_div_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<footer class=\"my-5 pt-5 text-muted text-center text-small\">\n");
        out.write("\t\t\t\t<p>&copy; Instituto Politécnico Nacional. Escuela Superior de Cómputo &middot; <a href=\"#\">Acerca de</a> &middot; <a href=\"#\">Ayuda</a></p>\n");
        out.write("\t\t\t</footer>\n");
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
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_1 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_theme_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_1.setPageContext(_jspx_page_context);
    _jspx_th_s_div_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_1.setCssClass("py-5 text-center");
    _jspx_th_s_div_1.setTheme("simple");
    int _jspx_eval_s_div_1 = _jspx_th_s_div_1.doStartTag();
    if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<img class=\"d-block mx-auto mb-4\" src=\"../img/systemName.gif\" alt=\"\" width=\"72\" height=\"72\">\n");
        out.write("\t\t\t\t<h2>Registro</h2>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_theme_cssClass.reuse(_jspx_th_s_div_1);
      return true;
    }
    _jspx_tagPool_s_div_theme_cssClass.reuse(_jspx_th_s_div_1);
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
    _jspx_th_s_div_2.setCssClass("row");
    int _jspx_eval_s_div_2 = _jspx_th_s_div_2.doStartTag();
    if (_jspx_eval_s_div_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_div_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_s_div_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_3 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_3.setPageContext(_jspx_page_context);
    _jspx_th_s_div_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_2);
    _jspx_th_s_div_3.setCssClass("col-md-6 order-md-4 offset-md-3");
    int _jspx_eval_s_div_3 = _jspx_th_s_div_3.doStartTag();
    if (_jspx_eval_s_div_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_cssClass_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_3);
    _jspx_th_s_form_0.setCssClass("needs-validation form-signin");
    _jspx_th_s_form_0.setAction("Register");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<!-- Agregar novalidate -->\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_div_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_div_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_div_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_div_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_div_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t<hr class=\"mb-3\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_cssClass_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_cssClass_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_div_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_4 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_4.setPageContext(_jspx_page_context);
    _jspx_th_s_div_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_4.setCssClass("mb-3");
    int _jspx_eval_s_div_4 = _jspx_th_s_div_4.doStartTag();
    if (_jspx_eval_s_div_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_4);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_4);
    return false;
  }

  private boolean _jspx_meth_s_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_0 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_theme_for.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_0.setPageContext(_jspx_page_context);
    _jspx_th_s_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_4);
    _jspx_th_s_label_0.setTheme("simple");
    _jspx_th_s_label_0.setFor("username");
    int _jspx_eval_s_label_0 = _jspx_th_s_label_0.doStartTag();
    if (_jspx_eval_s_label_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_label_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_label_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_label_0.doInitBody();
      }
      do {
        out.write("Correo electrónico <span class=\"text-muted\">(Obligatorio)</span>");
        int evalDoAfterBody = _jspx_th_s_label_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_label_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_theme_for.reuse(_jspx_th_s_label_0);
      return true;
    }
    _jspx_tagPool_s_label_theme_for.reuse(_jspx_th_s_label_0);
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
    _jspx_th_s_div_5.setCssClass("input-group");
    int _jspx_eval_s_div_5 = _jspx_th_s_div_5.doStartTag();
    if (_jspx_eval_s_div_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_6 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_6.setPageContext(_jspx_page_context);
    _jspx_th_s_div_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_5);
    _jspx_th_s_div_6.setCssClass("input-group-prepend");
    int _jspx_eval_s_div_6 = _jspx_th_s_div_6.doStartTag();
    if (_jspx_eval_s_div_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-text\">@</span>\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_6);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_6);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_type_theme_requiredLabel_onfocus_label_key_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_5);
    _jspx_th_s_textfield_0.setKey("username");
    _jspx_th_s_textfield_0.setType("email");
    _jspx_th_s_textfield_0.setCssClass("form-control");
    _jspx_th_s_textfield_0.setLabel("Correo electrónico");
    _jspx_th_s_textfield_0.setTheme("simple");
    _jspx_th_s_textfield_0.setRequiredLabel("true");
    _jspx_th_s_textfield_0.setOnfocus("true");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_type_theme_requiredLabel_onfocus_label_key_cssClass_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_type_theme_requiredLabel_onfocus_label_key_cssClass_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_div_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_7 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_style_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_7.setPageContext(_jspx_page_context);
    _jspx_th_s_div_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_5);
    _jspx_th_s_div_7.setCssClass("invalid-feedback");
    _jspx_th_s_div_7.setDynamicAttribute(null, "style", new String("width: 100%;"));
    int _jspx_eval_s_div_7 = _jspx_th_s_div_7.doStartTag();
    if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\tYour username is required.\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_style_cssClass.reuse(_jspx_th_s_div_7);
      return true;
    }
    _jspx_tagPool_s_div_style_cssClass.reuse(_jspx_th_s_div_7);
    return false;
  }

  private boolean _jspx_meth_s_div_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_8 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_8.setPageContext(_jspx_page_context);
    _jspx_th_s_div_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_8.setCssClass("mb-3");
    int _jspx_eval_s_div_8 = _jspx_th_s_div_8.doStartTag();
    if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_8);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_8);
    return false;
  }

  private boolean _jspx_meth_s_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_1 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_theme_for.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_1.setPageContext(_jspx_page_context);
    _jspx_th_s_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_8);
    _jspx_th_s_label_1.setTheme("simple");
    _jspx_th_s_label_1.setFor("password");
    int _jspx_eval_s_label_1 = _jspx_th_s_label_1.doStartTag();
    if (_jspx_eval_s_label_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_label_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_label_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_label_1.doInitBody();
      }
      do {
        out.write("Contraseña <span class=\"text-muted\">(Obligatorio)</span>");
        int evalDoAfterBody = _jspx_th_s_label_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_label_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_theme_for.reuse(_jspx_th_s_label_1);
      return true;
    }
    _jspx_tagPool_s_label_theme_for.reuse(_jspx_th_s_label_1);
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
    _jspx_th_s_div_9.setCssClass("input-group");
    int _jspx_eval_s_div_9 = _jspx_th_s_div_9.doStartTag();
    if (_jspx_eval_s_div_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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
    _jspx_th_s_div_10.setCssClass("input-group-prepend");
    int _jspx_eval_s_div_10 = _jspx_th_s_div_10.doStartTag();
    if (_jspx_eval_s_div_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-text\">&#x1f512</span>\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_0 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_theme_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_0.setPageContext(_jspx_page_context);
    _jspx_th_s_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_9);
    _jspx_th_s_password_0.setName("password");
    _jspx_th_s_password_0.setCssClass("form-control");
    _jspx_th_s_password_0.setDynamicAttribute(null, "placeholder", new String("Contraseña"));
    _jspx_th_s_password_0.setTheme("simple");
    int _jspx_eval_s_password_0 = _jspx_th_s_password_0.doStartTag();
    if (_jspx_th_s_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_theme_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_password_0);
      return true;
    }
    _jspx_tagPool_s_password_theme_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_password_0);
    return false;
  }

  private boolean _jspx_meth_s_div_11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_11 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_style_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_11.setPageContext(_jspx_page_context);
    _jspx_th_s_div_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_9);
    _jspx_th_s_div_11.setCssClass("invalid-feedback");
    _jspx_th_s_div_11.setDynamicAttribute(null, "style", new String("width: 100%;"));
    int _jspx_eval_s_div_11 = _jspx_th_s_div_11.doStartTag();
    if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_11.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\tPlease enter a valid email address for shipping updates.\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_div_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_style_cssClass.reuse(_jspx_th_s_div_11);
      return true;
    }
    _jspx_tagPool_s_div_style_cssClass.reuse(_jspx_th_s_div_11);
    return false;
  }

  private boolean _jspx_meth_s_div_12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_12 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_12.setPageContext(_jspx_page_context);
    _jspx_th_s_div_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_12.setCssClass("");
    int _jspx_eval_s_div_12 = _jspx_th_s_div_12.doStartTag();
    if (_jspx_eval_s_div_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_label_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_label_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_2 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_theme_for.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_2.setPageContext(_jspx_page_context);
    _jspx_th_s_label_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_12);
    _jspx_th_s_label_2.setTheme("simple");
    _jspx_th_s_label_2.setFor("password2");
    int _jspx_eval_s_label_2 = _jspx_th_s_label_2.doStartTag();
    if (_jspx_eval_s_label_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_label_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_label_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_label_2.doInitBody();
      }
      do {
        out.write("Repetir contraseña");
        int evalDoAfterBody = _jspx_th_s_label_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_label_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_label_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_theme_for.reuse(_jspx_th_s_label_2);
      return true;
    }
    _jspx_tagPool_s_label_theme_for.reuse(_jspx_th_s_label_2);
    return false;
  }

  private boolean _jspx_meth_s_div_13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_13 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_13.setPageContext(_jspx_page_context);
    _jspx_th_s_div_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_12);
    _jspx_th_s_div_13.setCssClass("input-group");
    int _jspx_eval_s_div_13 = _jspx_th_s_div_13.doStartTag();
    if (_jspx_eval_s_div_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_13.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_div_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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
    _jspx_th_s_div_14.setCssClass("input-group-prepend");
    int _jspx_eval_s_div_14 = _jspx_th_s_div_14.doStartTag();
    if (_jspx_eval_s_div_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_14.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-text\">&#x1f512</span>\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_1 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_theme_requiredLabel_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_1.setPageContext(_jspx_page_context);
    _jspx_th_s_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_13);
    _jspx_th_s_password_1.setName("password2");
    _jspx_th_s_password_1.setCssClass("form-control");
    _jspx_th_s_password_1.setDynamicAttribute(null, "placeholder", new String("Repetir contraseña"));
    _jspx_th_s_password_1.setTheme("simple");
    _jspx_th_s_password_1.setRequiredLabel("true");
    int _jspx_eval_s_password_1 = _jspx_th_s_password_1.doStartTag();
    if (_jspx_th_s_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_theme_requiredLabel_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_password_1);
      return true;
    }
    _jspx_tagPool_s_password_theme_requiredLabel_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_password_1);
    return false;
  }

  private boolean _jspx_meth_s_div_15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_15 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_15.setPageContext(_jspx_page_context);
    _jspx_th_s_div_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_13);
    _jspx_th_s_div_15.setCssClass("invalid-feedback");
    int _jspx_eval_s_div_15 = _jspx_th_s_div_15.doStartTag();
    if (_jspx_eval_s_div_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_15.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\tPlease enter your shipping address.\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_div_16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_16 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_16.setPageContext(_jspx_page_context);
    _jspx_th_s_div_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_16.setCssClass("mb-3");
    int _jspx_eval_s_div_16 = _jspx_th_s_div_16.doStartTag();
    if (_jspx_eval_s_div_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_16.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_label_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_16, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<select name=\"role\" class=\"custom-select d-block w-100\" required>\n");
        out.write("\t\t\t\t\t\t\t\t<option value=\"\">Tipo de usuario</option>\n");
        out.write("\t\t\t\t\t\t\t\t<option>Estudiante</option>\n");
        out.write("\t\t\t\t\t\t\t\t<option>Profesor</option>\n");
        out.write("\t\t\t\t\t\t\t</select>\n");
        out.write("\t\t\t\t\t\t\t<br>\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_label_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_3 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_for.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_3.setPageContext(_jspx_page_context);
    _jspx_th_s_label_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_16);
    _jspx_th_s_label_3.setFor("country");
    int _jspx_eval_s_label_3 = _jspx_th_s_label_3.doStartTag();
    if (_jspx_eval_s_label_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_label_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_label_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_label_3.doInitBody();
      }
      do {
        out.write("Tipo de usuario");
        int evalDoAfterBody = _jspx_th_s_label_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_label_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_label_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_for.reuse(_jspx_th_s_label_3);
      return true;
    }
    _jspx_tagPool_s_label_for.reuse(_jspx_th_s_label_3);
    return false;
  }

  private boolean _jspx_meth_s_div_17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_17 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_17.setPageContext(_jspx_page_context);
    _jspx_th_s_div_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_17.setCssClass("mb-3");
    int _jspx_eval_s_div_17 = _jspx_th_s_div_17.doStartTag();
    if (_jspx_eval_s_div_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_17.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_label_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_17, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_17, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_label_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_4 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_theme_for.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_4.setPageContext(_jspx_page_context);
    _jspx_th_s_label_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_17);
    _jspx_th_s_label_4.setTheme("simple");
    _jspx_th_s_label_4.setFor("clave");
    int _jspx_eval_s_label_4 = _jspx_th_s_label_4.doStartTag();
    if (_jspx_eval_s_label_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_label_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_label_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_label_4.doInitBody();
      }
      do {
        out.write("Clave de grupo <span class=\"text-muted\">(Opcional)</span>");
        int evalDoAfterBody = _jspx_th_s_label_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_label_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_label_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_theme_for.reuse(_jspx_th_s_label_4);
      return true;
    }
    _jspx_tagPool_s_label_theme_for.reuse(_jspx_th_s_label_4);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_type_theme_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_17);
    _jspx_th_s_textfield_1.setName("groupkey");
    _jspx_th_s_textfield_1.setType("text");
    _jspx_th_s_textfield_1.setCssClass("form-control");
    _jspx_th_s_textfield_1.setDynamicAttribute(null, "placeholder", new String("Clave de grupo"));
    _jspx_th_s_textfield_1.setTheme("simple");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_type_theme_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_type_theme_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_type_theme_label_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setCssClass("btn btn-success btn-lg btn-block");
    _jspx_th_s_submit_0.setType("submit");
    _jspx_th_s_submit_0.setTheme("simple");
    _jspx_th_s_submit_0.setLabel("Completar registro");
    _jspx_th_s_submit_0.setValue("Completar Registro");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_type_theme_label_cssClass_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_type_theme_label_cssClass_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }
}
