/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifmt.dao;

import br.com.ifmt.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author Junior.erdmann
 */
public class UsuarioDao {

    public boolean login(Usuario usr) throws SQLException {

        if (usr != null) {
            try (Connection con = Factory.getConnection()) {

                PreparedStatement pst
                        = con.prepareStatement("select * from new_table where login_usuario = ? and senha = ? ; ");

                pst.setString(1, usr.getLogin());
                pst.setString(2, usr.getSenha());
                ResultSet rs = pst.executeQuery();
                return rs.next();
            }
        }

        return false;
    }

    public void insert(Usuario usr) {
    }

    public void update(Usuario usr) {
    }

    public void delete(Usuario usr) {

    }

    public Usuario findById(Integer id) {
        return null;
    }

    public Collection<Usuario> findAll() {

        return null;
    }

}
