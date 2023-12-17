package View;

import DTO.ProdutosDTO;
import DAO.ProdutosDAO;
import java.awt.event.KeyEvent;

public class cadastroVIEW extends javax.swing.JFrame {

    public cadastroVIEW() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        lbl_title2 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_valor = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_valor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_cadastrar = new javax.swing.JButton();
        btn_produtos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        lbl_title.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        lbl_title.setText("Sistema de Leilões");

        lbl_title2.setText("Cadastre um novo produto");

        lbl_nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nome.setText("Nome:");

        lbl_valor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        txt_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nomeKeyReleased(evt);
            }
        });

        txt_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_valorKeyReleased(evt);
            }
        });

        btn_cadastrar.setBackground(new java.awt.Color(153, 255, 255));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_produtos.setText("Consultar Produtos");
        btn_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_produtosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btn_cadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lbl_title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(lbl_title2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_nome)
                                .addComponent(lbl_valor))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nome)
                                .addComponent(txt_valor, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbl_title)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_title2)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_valor)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_cadastrar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btn_produtos)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        ProdutosDTO produto = new ProdutosDTO();
        String nome = txt_nome.getText();
        String valor = txt_valor.getText();
        String status = "A Venda";

        produto.setNome(nome);
        produto.setValor(Integer.parseInt(valor));
        produto.setStatus(status);

        ProdutosDAO produtodao = new ProdutosDAO();
        produtodao.cadastrarProduto(produto);
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_produtosActionPerformed
        /*listagemVIEW listagem = new listagemVIEW();
        listagem.setVisible(true);*/
    }//GEN-LAST:event_btn_produtosActionPerformed

    private void txt_valorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_cadastrar.doClick();
        }
    }//GEN-LAST:event_txt_valorKeyReleased

    private void txt_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomeKeyReleased
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_valor.requestFocus();
        }
    }//GEN-LAST:event_txt_nomeKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_produtos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_title2;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
