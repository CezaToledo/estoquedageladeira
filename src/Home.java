
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author samuel.toledo
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
    
    public Home() {
        initComponents();
    }
            
    public Home(String role) {
        initComponents();
        setLocationRelativeTo(null);
        if(role.equals("Admin")) {
            b_usuários.setVisible(true);
        }
    }     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_usuários = new javax.swing.JButton();
        b_clientes = new javax.swing.JButton();
        b_categorias = new javax.swing.JButton();
        b_produtos = new javax.swing.JButton();
        b_logout = new javax.swing.JButton();
        b_pedidos1 = new javax.swing.JButton();
        b_vpedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_usuários.setText("Usuários");
        b_usuários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_usuáriosActionPerformed(evt);
            }
        });
        getContentPane().add(b_usuários, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        b_clientes.setText("Clientes");
        b_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clientesActionPerformed(evt);
            }
        });
        getContentPane().add(b_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 100, -1));

        b_categorias.setText("Categorias");
        b_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_categoriasActionPerformed(evt);
            }
        });
        getContentPane().add(b_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, -1));

        b_produtos.setText("Produtos");
        b_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_produtosActionPerformed(evt);
            }
        });
        getContentPane().add(b_produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, -1));

        b_logout.setText("Sair");
        b_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(b_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        b_pedidos1.setText("Vendas");
        b_pedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pedidos1ActionPerformed(evt);
            }
        });
        getContentPane().add(b_pedidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, -1));

        b_vpedidos.setText("Ver vendas");
        b_vpedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_vpedidosActionPerformed(evt);
            }
        });
        getContentPane().add(b_vpedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_usuáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_usuáriosActionPerformed
        // TODO add your handling code here:
        new ManageUser().setVisible(true);
    }//GEN-LAST:event_b_usuáriosActionPerformed

    private void b_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clientesActionPerformed
        // TODO add your handling code here:
        new ManageClients().setVisible(true);
    }//GEN-LAST:event_b_clientesActionPerformed

    private void b_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_categoriasActionPerformed
        // TODO add your handling code here:
        new ManageCathegories().setVisible(true);
    }//GEN-LAST:event_b_categoriasActionPerformed

    private void b_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_produtosActionPerformed
        // TODO add your handling code here:
        new ManageProducts().setVisible(true);
    }//GEN-LAST:event_b_produtosActionPerformed

    private void b_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_logoutActionPerformed
        // Se o botão de sair for apertado
        int a = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fazer log out?","select",JOptionPane.YES_NO_OPTION); // define o integral a(int a =) a partir de uma janela de confirmação(JOptionPane.showConfirmDialog) que pergunta se deseja fazer logout("Tem certeza que deseja fazer log out?") e espera uma seleção("select") de opções de sim ou não("YES_OR_NO_OPTION")
        if(a==0) { //checa se o int a é 0(se o usuário apertou sim/yes)
            setVisible(false); // esconde esta janela
            new Login_page().setVisible(true); // exibi a janela de login
        }
    }//GEN-LAST:event_b_logoutActionPerformed

    private void b_pedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pedidos1ActionPerformed
        // TODO add your handling code here:
        new ManageOrder().setVisible(true);
    }//GEN-LAST:event_b_pedidos1ActionPerformed

    private void b_vpedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_vpedidosActionPerformed
        // TODO add your handling code here:
        new telaLapis().setVisible(true);
    }//GEN-LAST:event_b_vpedidosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_categorias;
    private javax.swing.JButton b_clientes;
    private javax.swing.JButton b_logout;
    private javax.swing.JButton b_pedidos1;
    private javax.swing.JButton b_produtos;
    private javax.swing.JButton b_usuários;
    private javax.swing.JButton b_vpedidos;
    // End of variables declaration//GEN-END:variables
}