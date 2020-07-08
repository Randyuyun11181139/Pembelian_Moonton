<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>
<h1>Data Master User</h1>
<table border="0">
    <form action="UserServlet" method="post" onsubmit="return validasi_inputUser(this)">
        <input type="hidden" name="aksi" value="${param.aksi}"/>
        <tr>
            <td>Id</td> <td>: <input type="text" name="id" value="${param.id}"/> </td>
        </tr>
            <td>Id User</td> <td>: <input type="text" name="iduser" value="${param.id_user}"/> </td>
        </tr>
        <tr>
            <td>Nama User</td> <td>: <input type="text" name="nmuser" value="${param.nm_user}"/></td>
        </tr>
         <tr>
            <td>Hak Akses</td> <td>: <input type="text" name="hakakses" value="${param.hak_akses}"/></td>
        </tr>
         <tr>
            <td>Password</td> <td>: <input type="text" name="password" onkeypress="return hanyaAngka(event)" value="${param.pass}"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Simpan" class="button"/></td> <td></td>
        </tr>
    </form>
        </td></tr></table><br>
    <form action="" method="post">
        Cari Data User : <input type="text" name="cari" value="${param.cari}"/>
        <input type="submit" value="Cari" class="button"/> <br>
    </form>
    <sql:query var="queryuser" dataSource="${dataSource}">
        SELECT * from user where id like '%${param.cari}%' or nm_user like '%${param.cari}%'
    </sql:query>
    <br><table border="1" width="100%" cellpadding="0" cellspacing="0">
        <tr class="head">
            <td>Id</td><td>Id User</td><td>Nama User</td><td>Hak Akses</td><td>Password</td><td>Action</td>
        </tr>
        <c:forEach var="rowuser" items="${queryuser.rowsByIndex}">
            <tr class="isi">
                <td valign='top'>${rowuser[0]}</td>
                <td valign='top'>${rowuser[1]}</td>
                <td valign='top'>${rowuser[2]}</td>
                <td valign='top'>${rowuser[3]}</td>
                <td valign='top'>${rowuser[4]}</td>
                <td valign='top'><a href='UserServlet?aksi=HAPUS&id=${rowuser[0]}'> Hapus </a> | <a href='beranda.jsp?halaman=tampiluser&aksi=GANTI&id=${rowuser[0]}&id_user=${rowuser[1]}&nm_user=${rowuser[2]}&hak_akses=${rowuser[3]}&pass=${rowuser[4]}'> Edit </a>
                </td>    
            </tr>
        </c:forEach>
    </table>
