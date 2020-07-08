<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cetak Laporan</title>
    </head>
    <body>
        <h2>Cetak Laporan Barang Berdasarkan Stok Tersedia</h2>
        <form action="TampilLapBarang.jsp" method="get">
            stok <= <input type="number" name="jumlah" value="0">
            <input type="submit" name="submit" value="Cetak Laporan"/>
        </form>
    </body>
</html>
