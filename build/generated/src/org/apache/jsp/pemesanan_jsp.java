package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.koneksi;
import model.barang;
import model.supplier;
import model.pemesanan;
import java.util.Date;
import java.sql.*;
import control.koneksi;

public final class pemesanan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/config/autokode.jsp");
  }

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
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');

    try {
        koneksi kon = new koneksi();
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet nopesan = null;
        nopesan = kon.stmt.executeQuery("select max(right(no_pesan,6)) as no FROM pemesanan");
        while (nopesan.next()) {
            if (nopesan.first() == false) {
                out.println("<input type='hidden' name='no_pesan' value='PS000001' id='nopes'/>");
            } else {
                nopesan.last();
                int autonops = nopesan.getInt(1) + 1;
                String nomorps = String.valueOf(autonops);
                int noLong = nomorps.length();
                
                for (int a = 1; a < 7 - noLong; a++) {
                    nomorps = "0" + nomorps;
                }
                String nomerps = "PS" + nomorps;
                out.println("<input type='hidden' name='no_pesan' id='nopesan' value'" + nomerps + "'/>");
            }
        }
    } catch (Exception e){
        out.println(e);
    }
 
      out.write('\n');
      out.write('\n');
 java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun + "-" + bulan + "-" + tanggal;
    pemesanan pemesanan = new pemesanan();
    barang barang = new barang();
    supplier supplier = new supplier();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    ResultSet qrybarang = null;
    ResultSet qrypemesanan = null;
    
      out.write("\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
      out.write("            <title> Transaksi Pemesanan</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        <sql:query var=\"ttl\" dataSource=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            SELECT SUM(quantity) AS ttl D, SUM(subtotal) AS ttl K FROM sementara\n");
      out.write("        </sql:query>\n");
      out.write("            <h1>Transaksi Pemesanan Barang</h1></br>\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <form action=\"ServletPemesanan\" method=\"post\">\n");
      out.write("                    <h2>Data Barang</h2>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>No Pesan</td>   <td>: <input type=\"text\" name=\"no_pesan\" id=\"nopesan\" value=\"\" readonly=\"readonly\"/>\n");
      out.write("                            <input type=\"button\" onclick=\"pesan()\" value=\"Add No Pesan\" class=\"button\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Tanggal Pesan</td>  <td>: <input type=\"text\" name=\"tanggal\" value =");
      out.print( tgl);
      out.write(" readonly=\"readonly\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Barang</td>     <td>: <select name=\"kode\" onchange=\"showEmp(this.value);\">\n");
      out.write("                                <option value=\"-1\">Pilih Barang</option>\n");
      out.write("                                ");

                                    rs = kon.stmt.executeQuery("SELECT * from barang ");
                                    while (rs.next()) {
                                        barang.setKodebarang(rs.getString("kd_brg"));
                                        barang.setNamabarang(rs.getString("nm_brg"));
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(barang.getKodebarang());
      out.write('"');
      out.write('>');
      out.print(barang.getKodebarang());
      out.write(" || ");
      out.print(barang.getNamabarang());
      out.write("</option>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <input type=\"hidden\" name=\"emp_id\" id=\"emp_id\" value=\"\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Harga Barang</td>   <td>: <input type=\"text\" name=\"harga\" id=\"ename\" value=\"\" readonly=\"readonly\" onkeyup=\"sumPesan();\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Jumlah Pesan</td>   <td>: <input type=\"text\" name=\"jml\" id=\"jml\" onkeyup=\"sumPesan();\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Subtotal</td>   <td>: <input type=\"text\" name=\"sub\" id=\"subtotal\" readonly=\"readonly\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"TAMBAH\" name=\"aksi1\"></td>\n");
      out.write("                    </tr>\n");
      out.write("            </table>\n");
      out.write("            <h2>Data Supplier</h2>\n");
      out.write("            Supplier <select name=\"supplier\">\n");
      out.write("                <option value=\"-1\">Pilih Supplier</option>\n");
      out.write("                ");
 
                    rs = kon.stmt.executeQuery("SELECT * from supplier ");
                    while (rs.next()) {
                        supplier.setKodesupp(rs.getString("kd_supp"));
                        supplier.setNamasupp(rs.getString("nm_supp"));
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(supplier.getKodesupp());
      out.write('"');
      out.write('>');
      out.print(supplier.getNamasupp());
      out.write("</option>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </select><br><br>\n");
      out.write("            \n");
      out.write("            <table width=\"535\" border=\"1\" align=\"center\">\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"5\"><h3>Data Barang Untuk Dipesan</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Kode Barang</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Subtotal</th>\n");
      out.write("                    <th>AKSI</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    rs = kon.stmt.executeQuery("SELECT * from sementara");
                    while (rs.next()) {
                        out.println("<tr class=isi>"
                                + "<td>" + rs.getString(2) + "</td>"
                                + "<td>" + rs.getString(3) + "</td>"
                                + "<td>" + rs.getString(4) + "</td>"
                                + "<td><a href=ServletPemesanan?aksi2=HAPUS&kode=" + rs.getString(2) + ">Hapus</a></td>"
                                + "</tr>");
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("                <c:forEach var='ttlDK'items='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttl.rowsByIndex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'><br>\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tr><td>Total Jumlah Barang Dipesan</td> <td>:\n");
      out.write("                                <input type=\"text\" readonly=\"readonly\" name=\"totjum\" size=\"1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\n");
      out.write("                        <tr><td>Total Bayar</td>\n");
      out.write("                        <input type=\"text\" readonly=\"readonly\" name=\"tobay\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\n");
      out.write("                        </c:forEach>\n");
      out.write("                        ");
kon.close();
      out.write("\n");
      out.write("                        <tr><td><input type=\"submit\" value=\"PROSES\" name=\"aksi3\"> <input type=\"reset\" value=\"CANCEL\"></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("        </body>\n");
      out.write("            </html>\n");
      out.write("    ");
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
