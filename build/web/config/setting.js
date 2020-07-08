function hanyaAngka(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode
    if (charCode > 31 && (charCode <48 || charCode > 57))
        return false;
    return true;
}

function validasi_inputBarang(form) {
    if (form.kode.value == "") {
        alert("Kode Barang masih kosong!");
        form.kode.focus();
        return (false);
    } else if (form.nama.value == "") {
        alert("Nama Barang masih kosong!");
        form.nama.focus();
        return (false);
    } else if (form.harga.value == "") {
        alert("Harga masih kosong!");
        form.harga.focus();
        return (false);
    } else if (form.stok.value == "") {
        alert("Stok masih kosong!");
        form.stok.focus();
        return (false);
    }
    return (true);
}

function validasi_inputSupplier(form) {
    if (form.kodesupp.value == "") {
        alert("Kode Supplier masih kosong!");
        form.kodesupp.focus();
        return (false);
    } else if (form.namasupp.value == "") {
        alert("Nama Supplier masih kosong!");
        form.namasupp.focus();
        return (false);
    } else if (form.alamat.value == "") {
        alert("Alamat masih kosong!");
        form.alamat.focus();
        return (false);
    } else if (form.tlp.value == "") {
        alert("Telepon masih kosong!");
        form.tlp.focus();
        return (false);
    }
    return (true);
}

function validasi_inputAkun(form) {
    if (form.noakun.value == "") {
        alert("Nomor Akun masih kosong!");
        form.noakun.focus();
        return (false);
    } else if (form.nmakun.value == "") {
        alert("Nama Akun masih kosong!");
        form.nmakun.focus();
        return (false);
    }
    return (true);
}

function validasi_inputUser(form) {
    if (form.iduser.value == "") {
        alert("Id User masih kosong!");
        form.iduser.focus();
        return (false);
    } else if (form.nmuser.value == "") {
        alert("Nama User masih kosong!");
        form.nmuser.focus();
        return (false);
    } else if (form.hakakses.value == "") {
        alert("Hak Akses masih kosong!");
        form.hakakses.focus();
        return (false);
    } else if (form.password.value == "") {
        alert("Password masih kosong!");
        form.password.focus();
        return (false);
    }
    return (true);
}

function pesan() {
    document.getElementById("nopesan").value = document.getElementById("nopes").value;
}

function retur() {
    document.getElementById("noretur").value = document.getElementById("noret").value;
}

function beli() {
    document.getElementById("no").value = document.getElementById("nopem").value;
}

function showEmp(emp_value)
{
    if (document.getElementById("emp_id").value != "-1")
    {
        xmlHttp = GetXmlHttpObject()
        if (xmlHttp == null)
        {
            alert("Browser does not support HTTP Request")
            return
        }
        var url = "getbarang.jsp"
        url = url + "?emp_id=" + emp_value
        
        xmlHttp.onreadystatechange = stateChanged
        xmlHttp.open("GET", url, true)
        xmlHttp.send(null)
    } else
    {
        alert("Pilih Kode Barang");
    }
}

function stateChanged()
{
    document.getElementById("ename").value = "";
    document.getElementById("emp_id").value = "";
    if (xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
    {
        var showdata = xmlHttp.responseText;
        var strar = showdata.split(":");
        if (strar.length == 1)
        {
            document.getElementById("emp_id").focus();
            alert("Pilih Kode Barang");
            document.getElementById("ename").value = " ";
            document.getElementById("emp_id").value = " ";
        } else if (strar.length > 1)
        { 
            document.getElementById("ename").value = strar[1];
        }
    }
}
function GetXmlHttpObject()
{
    var xmlHttp = null;
    try
    {
        xmlHttp = new XMLHttpRequest();
    } catch (e)
    {
        try
        {
            xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e)
        {
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    return xmlHttp;
}
function sumPesan(){
    var txtFirstNumberValue = document.getElementById('ename').value;
    var txtSecondNumberValue = document.getElementById('jml').value;
    var result = parseFloat(txtFirstNumberValue) * parseFloat(txtSecondNumberValue);
    if(!isNaN(result)) {
        document.getElementById('subtotal').value = result;
    }
}
    
function sumRetur(){
    var txtFirstNumberValue = document.getElementById('ename').value;
    var txtSecondNumberValue = document.getElementById('jml').value;
    var result = parseFloat(txtFirstNumberValue) * parseFloat(txtSecondNumberValue);
    if(!isNaN(result)) {
        document.getElementById('subtotal').value = result;
    }
}

function sumBeli(){
    var txtFirstNumberValue = document.getElementById('ename').value;
    var txtSecondNumberValue = document.getElementById('jml').value;
    var result = parseFloat(txtFirstNumberValue) * parseFloat(txtSecondNumberValue);
    if(!isNaN(result)) {
        document.getElementById('subtotal').value = result;
    }
}
