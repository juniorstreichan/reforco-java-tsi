/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifmt.service;

import br.com.ifmt.dao.UsuarioDao;
import br.com.ifmt.model.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior.erdmann
 */
public class UsuarioService {

    private UsuarioDao dao;

    public UsuarioService() {
        dao = new UsuarioDao();
    }

    public boolean logar(Usuario usr) {
        try {
            return dao.login(usr);
        } catch (Exception e) {
            erro(e);
            return false;
        }

    }

    private void erro(Exception e) {
        JOptionPane.showMessageDialog(null, "Erro: " + e.getLocalizedMessage());
    }

}
