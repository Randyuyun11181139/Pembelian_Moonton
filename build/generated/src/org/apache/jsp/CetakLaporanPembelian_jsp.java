package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CetakLaporanPembelian_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Laporan Pembelian</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tampilan Laporan Pembelian Berdasarkan Bulan dan Tahun</h1>\n");
      out.write("        <form action=\"TampilLapPembelian.jsp\">\n");
      out.write("            Masukkan Bulan :\n");
      out.write("            <select name=\"bulan\" id=\"bulan\">\n");
      out.write("                <option value=\"1\">Januari</option>\n");
      out.write("                <option value=\"2\">Februari</option>\n");
      out.write("                <option value=\"3\">Maret</option>\n");
      out.write("                <option value=\"4\">April</option>\n");
      out.write("                <option value=\"5\">Mei</option>\n");
      out.write("                <option value=\"6\">Juni</option>\n");
      out.write("                <option value=\"7\">Juli</option>\n");
      out.write("                <option value=\"8\">Agustus</option>\n");
      out.write("                <option value=\"9\">September</option>\n");
      out.write("                <option value=\"10\">Oktober</option>\n");
      out.write("                <option value=\"11\">November</option>\n");
      out.write("                <option value=\"12\">Desember</option>\n");
      out.write("            </select><br>\n");
      out.write("            Masukkan Tahun :\n");
      out.write("            <select name=\"tahun\" id=\"tahun\">\n");
      out.write("                <option value=\"2019\">2019</option>\n");
      out.write("                <option value=\"2020\">2020</option>\n");
      out.write("                <option value=\"2021\">2021</option>\n");
      out.write("                <option value=\"2022\">2022</option>\n");
      out.write("                <option value=\"2023\">2023</option>\n");
      out.write("                <option value=\"2024\">2024</option>\n");
      out.write("                <option value=\"2025\">2025</option>\n");
      out.write("                <option value=\"2026\">2026</option>\n");
      out.write("                <option value=\"2027\">2027</option>\n");
      out.write("                <option value=\"2028\">2028</option>\n");
      out.write("                <option value=\"2029\">2029</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"TAMPIL\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
