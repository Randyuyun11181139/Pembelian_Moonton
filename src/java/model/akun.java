package model;

public class akun {
    private String noakun,nmakun;
    
    public akun(){
    }

    public akun(String noakun, String nmakun) {
      this.noakun = noakun;
      this.nmakun = nmakun;
    }
    
    public String getNoakun() {
        return noakun;
    }
    
    public void setNoakun(String noakun) {
        this.noakun = noakun;
    }
    
    public String getNmakun() {
        return nmakun;
    }
    
    public void setNmakun(String nmakun) {
        this.nmakun = nmakun;
    }

    public String selectAll() {
        String sql = "select * from akun ";
        return sql;
    }

    public String select() {
        String sql = "select * from akun where "
                + "no_akun='" + noakun + "'";
        return sql;
    }
    
public String toUpdate() {
    return " UPDATE akun SET " +
            " nm_akun='" + nmakun +
            "'WHERE no_akun='" + noakun + "'";
}

public String toDelete() {
    return " DELETE FROM akun "
            + "WHERE no_akun='" + noakun + "'";
}

public String toInsert() {
    return " INSERT INTO akun VALUES ('"
            + noakun + "','"
            + nmakun + "')";
}
}