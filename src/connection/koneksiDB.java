/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author USER
 */
public class koneksiDB {
    public static Connection BukaKoneksi() {
            try {
                MysqlDataSource m = new MysqlDataSource();
                m.setDatabaseName("aplikasi_tiketkonser_qr");
                m.setUser("root");
                m.setPassword("");
                m.setServerName("localhost");
                m.setPortNumber(8111);
                m.setServerTimezone("Asia/Jakarta");
                Connection c = m.getConnection();
                return c;
            } catch (Exception e) {
                
            }
            return null;
        }
    
}