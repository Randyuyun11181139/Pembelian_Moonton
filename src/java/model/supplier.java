package model;

public class supplier {
    private String kodesupp,namasupp,alamat,tlp;
    
    public supplier(){
        
    }
    
    public supplier(String kodesupp, String namasupp, String alamat, String tlp) {
        this.kodesupp = kodesupp;
        this.namasupp = namasupp;
        this.alamat = alamat;
        this.tlp = tlp;
    }
    
    public String getKodesupp() {
        return kodesupp;
    }
 
    public void setKodesupp(String kodesupp) {
        this.kodesupp = kodesupp;
    }
    
    public String getNamasupp() {
        return namasupp;
    }
    
    public void setNamasupp(String namasupp) {
        this.namasupp = namasupp;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getTlp() {
        return tlp;
    }
    
    public void setTlp(String tlp) {
        this.tlp = tlp;
    }
    
    public String selectAll() {
        String sql = "select * from supplier ";
        return sql;
    }
    
    public String select() {
        String sql = "select * from supplier where "
                + "kd_supp='"+ kodesupp +"'";
        return sql;
    }
    
    public String toUpdate() {
        return " UPDATE supplier SET " +
                 "nm_supp='" + namasupp +
                 "', alamat='" + alamat +
                 "', telpon='" + tlp +
                 "'WHERE kd_supp='" + kodesupp + "'";
    }
 
    public String toDelete() {
        return " DELETE FROM supplier "
                +"WHERE kd_supp='" + kodesupp + "'";
    }
 
    public String toInsert() {
        return " INSERT INTO supplier VALUES ('"
                + kodesupp + "','"
                + namasupp + "','"
                + alamat + "','"
                + tlp + "')";
    }
}
    

