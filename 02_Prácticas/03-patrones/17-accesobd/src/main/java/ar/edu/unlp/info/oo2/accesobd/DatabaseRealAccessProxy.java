package ar.edu.unlp.info.oo2.accesobd;

import java.util.*;

public class DatabaseRealAccessProxy implements DatabaseAccess {
    private String user;
    private String password;
    private DatabaseRealAccess realAccess;

    public DatabaseRealAccessProxy() {
        realAccess = new DatabaseRealAccess();
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (isLoggedIn()){
            return this.realAccess.getSearchResults(queryString);
        } else  {
            System.out.println("Is not logged in");
            return null;
        }
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (isLoggedIn()){
            return this.realAccess.insertNewRow(rowData);
        } else   {
            System.out.println("Is not logged in");
            return 0;
        }

    }

    public boolean isLoggedIn() {
        return this.user != null && this.password != null;
    }

    public void login(String username, String password) {
        this.user = username;
        this.password = password;
    }
}