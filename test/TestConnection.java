
import br.com.ifmt.dao.Factory;
import br.com.ifmt.dao.UsuarioDao;
import br.com.ifmt.model.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Junior.erdmann
 */
public class TestConnection {

    public static void main(String[] args) {
        try {
//            Connection conn = Factory.getConnection();
//            System.out.println(conn);
            UsuarioDao dao = new UsuarioDao();
            Usuario usr = new Usuario();
            usr.setLogin("junior");
            usr.setSenha("1234");

            if (dao.login(usr)) {
                JOptionPane.showMessageDialog(null, "Logou");
            } else {
                JOptionPane.showMessageDialog(null, "é Hacker");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
