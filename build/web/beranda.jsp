<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dataSource"
                   driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/pembelian"
                   user="root"password=""/>


<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Aplikasi Pembelian</title>
    <link href="config/stylespd.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="config/setting.js"></script>
    <link href="config/cssTable.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <!--
    This is a free CSS template provided by templatemo.com
    -->
    <div id="wrap">
        <div id="header">
            <img src="images/moonton.png">
                <h1><a>Pembelian Moonton</a></h1>
                <h2> <marquee behavior="alternate">Pembelian Alat-alat Elektronik</marquee></h2>
                    </div>
            <div id="content">
                <div class="left">
                    <ul>
                    <li><a href="beranda.jsp">Home</a></li>
                    <li><a href="beranda.jsp?halaman=tampilbrg&aksi=SIMPAN">Data Barang</a></li>
                    <li><a href="beranda.jsp?halaman=tampilsup&aksi=SIMPAN">Data Supplier</a></li>
                    <li><a href="beranda.jsp?halaman=tampilakun&aksi=SIMPAN">Data Akun</a></li>
                    <li><a href="beranda.jsp?halaman=tampiluser&aksi=SIMPAN">Data User</a></li>
                    <li><a href="beranda.jsp?halaman=pesan">Pemesanan</a></li>
                    <li><a href="beranda.jsp?halaman=returbeli">Retur Pembelian</a></li>
                    <li><a href="beranda.jsp?halaman=beli">Pembelian</a></li>
                    <li><a href="beranda.jsp?halaman=cetaklapbarang">Laporan Barang</a></li>
                    <li><a href="beranda.jsp?halaman=cetaklappembelian">Laporan Pembelian</a></li>
                    <li><a href="index.jsp">Logout</a></li>
                    </ul>
                <div class="box" align="justify">
                    <div class="subtitle">Date and Time</div>
                    <marquee direction="left"> <%=new java.util.Date()%>
                    </marquee>
                    <br/>
                </div>
                <div class="box" align="justify">
                    <div class="subtitle">About this website</div>
                    <marquee behavior="scroll" direction="up" scrollamount="5">
                        MEMBER OF MOONTON :
                        <br>
                        *RANDY SAEFUL UYUN
                        <br>
                        *RIFANDO SIREGAR
                        <br>
                        *DIA'UL MUNIR
                    </marquee>
                </div>
            </div>
                    
                    <div class="right">
                <div class="text_area" align="justify">

                    <c:choose>
                        <c:when test="${param.halaman=='home'}">
                            <%@include file="home.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='tampilbrg'}">
                            <%@include file="barang.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='tampilsup'}">
                            <%@include file="supplier.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='tampilakun'}">
                            <%@include file="akun.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='tampiluser'}">
                            <%@include file="user.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='pesan'}">
                            <%@include file="pemesanan.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='returbeli'}">
                            <%@include file="retur.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='beli'}">
                            <%@include file="pembelian.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='cetaklapbarang'}">
                            <%@include file="CetakLaporanBarang.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='cetaklappembelian'}">
                            <%@include file="CetakLaporanPembelian.jsp" %>
                        </c:when>
                        <c:otherwise>
                            <%@include file="home.jsp" %>
                        </c:otherwise>
                        </c:choose>
                </div>
            </div>
        </div>
        <div class="spacer"></div>
    </div> 
</body>
</html>