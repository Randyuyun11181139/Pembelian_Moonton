package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;

public final class akun_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<h1>Data Master Akun</h1>\n");
      out.write("<table border=\"0\">\n");
      out.write("    <from action=\"AkunServlet\" method=\"post\" onsubmit=\"return validasi_inputAkun(this)\">\n");
      out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("        <tr>\n");
      out.write("            <td>Nomor Akun</td> <td>: <input type=\"text\" name=\"noakun\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.no_akun}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> </td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td>Nama Akun</td> <td>: <input type=\"text\" name=\"nmakun\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nm_akun}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td></td>\n");
      out.write("        </tr>\n");
      out.write("    </form>\n");
      out.write("    </td></tr></table><br>\n");
      out.write("    <form action=\"\" method=\"post\">\n");
      out.write("        Cari Data Akun : <input type=\"text\" name=\"cari\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("        <input type=\"submit\" value=\"Cari\" class=\"button\"/><br>\n");
      out.write("    </form>\n");
      out.write("        <sql:query var=\"queryakun\" dataSource=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            SELECT*from akun where no_akun like '%");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("%' or nm_akun like '%");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("%'\n");
      out.write("        </sql:query>\n");
      out.write("        <br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("            <tr class=\"head\">\n");
      out.write("                <td>Nomor Akun</td><td>Nama Akun</td><td>Action</td>\n");
      out.write("            </tr>\n");
      out.write("            <c:forEach var=\"rowakun\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${queryakun.rowsByIndex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <tr class=\"isi\">\n");
      out.write("                <td valign='top'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td valign='top'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td valign='top'><a href='AkunServlet?aksi=HAPUS&kode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'> Hapus </a> | <a href='beranda.jsp?halaman=tampilakun&aksi=GANTI&no_akun=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&nm_akun=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'> Edit </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            </c:forEach>\n");
      out.write("        </table>\n");
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
