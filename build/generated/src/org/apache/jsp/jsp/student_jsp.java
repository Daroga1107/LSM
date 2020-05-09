package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,no shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <title>Bienvenido: Alumno</title>\n");
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
      out.write("        <link href=\"css/carousel.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-dark fixed-top bg-dark\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">TT2018-B125</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample01\" aria-controls=\"navbarsExample01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                \n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarsExample01\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Inicio <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Mi aprendizaje</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Mi cuenta</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"form-inline mt-2 mt-md-0\">\n");
      out.write("                        <button class=\"btn btn-outline-danger my-2 my-sm-0\" type=\"submit\">Cerrar sesión</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <main role=\"main\">\n");
      out.write("            \n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\"><rect width=\"100%\" height=\"100%\" fill=\"#777\"/></svg>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"carousel-caption text-left\">\n");
      out.write("                                <h1>Lengua de Señas Mexicana</h1>\n");
      out.write("                                <p>La Lengua de Señas Mexicana o LSM, es el medio de comunicación en comunidad Sorda en las regiones urbanas y rurales de México</p>\n");
      out.write("                                <p><a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Aprender más</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\"><rect width=\"100%\" height=\"100%\" fill=\"#777\"/></svg>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"carousel-caption\">\n");
      out.write("                                <h1>Another example headline.</h1>\n");
      out.write("                                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("                                <p><a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Learn more</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\"><rect width=\"100%\" height=\"100%\" fill=\"#777\"/></svg>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"carousel-caption text-right\">\n");
      out.write("                                <h1>One more for good measure.</h1>\n");
      out.write("                                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("                                <p><a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Browse gallery</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!-- Marketing messaging and featurettes\n");
      out.write("              ================================================== -->\n");
      out.write("            <!-- Wrap the rest of the page in another container to center all the content. -->\n");
      out.write("            \n");
      out.write("            <div class=\"container marketing\">\n");
      out.write("                \n");
      out.write("                <!-- Three columns of text below the carousel -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 140x140\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#777\"/><text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text></svg>\n");
      out.write("                        <h2>Continuar aprendiendo</h2>\n");
      out.write("                        <p>Aquí puedes continuar con el curso disponible para tu nivel actual.</p>\n");
      out.write("                        <p><a class=\"btn btn-secondary\" href=\"#\" role=\"button\">Aprender más &raquo;</a></p>\n");
      out.write("                    </div><!-- /.col-lg-4 -->\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 140x140\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#777\"/><text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text></svg>\n");
      out.write("                        <h2>Mi progreso</h2>\n");
      out.write("                        <p>Aquí puedes ver estadistícas de tu progreso durante la realización de los diversos niveles</p>\n");
      out.write("                        <p><a class=\"btn btn-secondary\" href=\"#\" role=\"button\">Aprender más &raquo;</a></p>\n");
      out.write("                    </div><!-- /.col-lg-4 -->\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <svg class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 140x140\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#777\"/><text x=\"50%\" y=\"50%\" fill=\"#777\" dy=\".3em\">140x140</text></svg>\n");
      out.write("                        <h2>Mi grupo</h2>\n");
      out.write("                        <p>Aquí puedes ver los nombres y progreso de tus compañeros de grupo!</p>\n");
      out.write("                        <p><a class=\"btn btn-secondary\" href=\"#\" role=\"button\">Aprender más &raquo;</a></p>\n");
      out.write("                    </div><!-- /.col-lg-4 -->\n");
      out.write("                </div><!-- /.row -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!-- START THE FEATURETTES -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!-- /END THE FEATURETTES -->\n");
      out.write("                \n");
      out.write("            </div><!-- /.container -->\n");
      out.write("            <hr>\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("            <!-- FOOTER -->\n");
      out.write("            <footer class=\"container\">\n");
      out.write("                \n");
      out.write("                <p>&copy; Instituto Politécnico Nacional. Escuela Superior de Cómputo &middot; <a href=\"#\">Acerca de</a> &middot; <a href=\"#\">Ayuda</a></p>\n");
      out.write("            </footer>\n");
      out.write("        </main>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
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
