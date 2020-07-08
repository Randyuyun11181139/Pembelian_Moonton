package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.pembelian;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServletPembelian extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String no = request.getParameter("no");
           String nof = request.getParameter("nof");
           String tgl = request.getParameter("tgl");
           String nopes = request.getParameter("nopes");
           String kodebarang = request.getParameter("kodebarang");
           String total = request.getParameter("total");
           String aksi = request.getParameter("aksi");
           String sql = "";
           String sql2 = "";
           switch(aksi){
               case "Delete":
               sql = "DELETE FROM sementara WHERE kode='" + kodebarang + "'";
               break;
               case "Simpan":
               sql = "INSERT INTO pembelian VALUES('"
                       + no + "','"
                       + tgl + "','"
                       + nof + "','"
                       + total + "','"
                       + nopes + "')";
               break;
               case "Cancel":
                   sql = "TRUNCATE TABLE sementara";
                   break;
           }
           boolean eror = false;
           koneksi kon = new koneksi();
           koneksi kon2 = new koneksi();
           if(aksi.equals("Tambah")){
               sql2="SELECT * FROM detail_pesan where "
                       + "no_pesan='" + nopes + "'";
               ResultSet rs = kon.ambilData(sql2);
               while(rs.next()){
                   sql2 = "INSERT INTO sementara VALUES('"
                           + rs.getString(1) + "','"
                           + rs.getString(2) + "',"
                           + rs.getString(3) + ","
                           + rs.getString(4) + ")";
                   try {
                           kon2.stmt.executeUpdate(sql2);
                   } catch (Exception ex) {
                       eror= true;
                   }
               }
           } else 
               if(!aksi.equals("Simpan")){
                   try {
                       kon.stmt.executeUpdate(sql);
                   } catch (Exception ex){
                       eror= true;
                   }
               } else {
                   sql2="SELECT * FROM sementara";
                   ResultSet rs = kon.ambilData(sql2);
                   while(rs.next()){
                       //tambahan ini
                       sql = "INSERT INTO pembelian VALUES('"
                               + no + "','"
                               + tgl + "','"
                               + nof + "','"
                               + total + "','"
                               + rs.getString(1) + "')";
                       String sql1;
                       sql1= "UPDATE barang SET stok = stok +"
                               + rs.getString(3)
                               + " WHERE kd_brg='"
                               + rs.getString(2) + "'";
                       //sampai sini
                       sql2 = "INSERT INTO detail_pembelian VALUES('"
                           + no + "','"
                           + rs.getString(2) + "',"
                           + rs.getString(3) + ","
                           + rs.getString(4) + ")";
                       try {
                           kon2.stmt.executeUpdate(sql1);
                           kon2.stmt.executeUpdate(sql2);
                       } catch (Exception ex){
                           eror= true;
                       }
                   }
                   sql2 = "TRUNCATE TABLE sementara";
                   if(!eror){
                       try {
                           kon.stmt.executeUpdate(sql);
                           kon2.stmt.executeUpdate(sql2);
                       } catch (Exception ex){
                           eror= true;
                       }
                   }
               }
           if(!eror)
               out.print("<script>"
               + "alert('Data Berhasil di " + aksi + "');"
               + "window.location='beranda.jsp?halaman=beli';"
               + "</script>");
           else
               out.print(sql+" "+sql2+"<script>"
               + "alert('Data Gagal di " + aksi + "');" 
               + "</script>");
        } catch (SQLException ex){
            Logger.getLogger(ServletPembelian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletPembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
