package model;

    public class pembelian {
    
    private String no,tgl,nof, total, nopes, kodebarang,qty,subtotal;
    
    public pembelian(){
    }
    
    public pembelian(String no, String tgl, String nof, String total,
            String nopes,String kodebarang, String qty, String subtotal ){
        this.no = no;
        this.nof = nof;
        this.nopes = nopes;
        this.tgl = tgl;
        this.kodebarang = kodebarang;
        this.total = total;
        this.qty = qty;
        this.subtotal = subtotal;       
    }
    
    
    public String getNo() {
        return no; 
    }
    
    public void seNo(String no) {
        this.no = no;
    }
    
    public String getTgl() {
        return tgl;
    }
    
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
    
    public String getNof() {
        return nof;
    } 
    
    public void setNof(String nof) {
        this.nof = nof;
    }
    
    public String getTotal() {
        return total;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }
    
    public String getNopes() {
        return nopes;
    }
    
    public void setNopes(String nopes) {
        this.nopes = nopes;
    }
    
    public String getKodebarang() {
        return kodebarang;
    }
    
    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }
    
    public String getQty() {
        return qty;
    }
    
    public void setQty(String qty) {
        this.qty = qty;
    }
    
    public String getSubtotal() {
       return subtotal; 
    }
    
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    
    public String selectAll() {
        String sql = "select * from pembelian " ;
        return sql;
    }
    
    public String select() {
        String sql = "select * from pembelian where "
                + "no_beli='"+no+"'";
        return sql;
    }
    
    public String toDelete () {
        return "DELETE FROM sementara "
                + "WHERE kode='" + kodebarang + "'";
    }
    
    public String toInsert() {
        return " INSERT INTO sementara VALUES ('"
                + no + "','"
                + kodebarang + "','"
                + qty + "','"
                + subtotal + "')";
    }
}

 


        




