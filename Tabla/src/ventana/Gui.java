/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class Gui extends javax.swing.JFrame {
 
    DefaultTableModel modelo;
    /**
     * Creates new form Gui
     */
    Nodo lista1 = new Nodo();
    Nodo lista2 = new Nodo();
    Nodo lista3 = new Nodo();
    Nodo lista4 = new Nodo();
    
    private int Oferta;
    private int Dema1;
    private int Dema2;
    private int Dema3;
    private int Dema4;
    private int cuad1;
    private int cuad2;
    private int cuad3;
    private int cuad4;
    
     public Gui() {
        initComponents();
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        String si = JOptionPane.showInputDialog("Ingrese la cantidad de demanda" ); 
        int i, j;
        i = Integer.valueOf(si);
        String sj = JOptionPane.showInputDialog("Ingrese la cantidad de demanda" ); 
        j = Integer.valueOf(sj); 
        String sk = JOptionPane.showInputDialog("Ingrese la cantidad de demanda" ); 
        int k, l;
        k = Integer.valueOf(sk);
        String sl = JOptionPane.showInputDialog("Ingrese la cantidad de demanda" ); 
        l = Integer.valueOf(sl); 
        modelo.addColumn(i);
        modelo.addColumn(j);
        modelo.addColumn(k);
        modelo.addColumn(l);
        JOptionPane.showMessageDialog(null, "FUNCIONA SOLO CON PROBLEMAS BALANCEADOS");
        this.Dema1 = i;
        this.Dema2 = j;
        this.Dema3 = k;
        this.Dema4 = l;
        
    }
 public static void rellenar (int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 10);
        }
    }
 public static void Imprimir (int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPrimer = new javax.swing.JLabel();
        txtfldPrimer = new javax.swing.JTextField();
        lblSegun = new javax.swing.JLabel();
        txtfldSegun = new javax.swing.JTextField();
        lblTercer = new javax.swing.JLabel();
        txtfldTercer = new javax.swing.JTextField();
        lblCuart = new javax.swing.JLabel();
        txtfldCuart = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        txtfldOfer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSaveOfer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblOfeActual = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrimer.setBackground(new java.awt.Color(255, 204, 204));
        lblPrimer.setText("Primer costo");
        lblPrimer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPrimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 105, 42));

        txtfldPrimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldPrimerActionPerformed(evt);
            }
        });
        jPanel1.add(txtfldPrimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 19, 105, 42));

        lblSegun.setText("Segundo costo");
        lblSegun.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblSegun, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 105, 42));
        jPanel1.add(txtfldSegun, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 61, 105, 42));

        lblTercer.setText("Tercer costo");
        lblTercer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblTercer, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 103, 105, 42));
        jPanel1.add(txtfldTercer, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 103, 105, 42));

        lblCuart.setText("Cuarto costo");
        lblCuart.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblCuart, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, 105, 42));
        jPanel1.add(txtfldCuart, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 145, 105, 42));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 187, -1, -1));

        jButtonGuardar.setText("Generar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jButtonGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonGuardarKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 105, 42));

        txtfldOfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldOferActionPerformed(evt);
            }
        });
        jPanel1.add(txtfldOfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 90, 30));

        jLabel1.setText("Oferta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, -1));

        btnSaveOfer.setText("Guardar");
        btnSaveOfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOferActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveOfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Oferta actual:");

        jLabel3.setText("*Procure poner primero una oferta");

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOfeActual, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(jButton1)
                                .addGap(27, 27, 27)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEliminar)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblOfeActual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tabla.getSelectedRow();
        if(fila != -1){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
public int DemaT;
    public int mayor;
    public int pena;
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        int []object = new int[4];
        String datoentrada;
        Object[] val = new Object[4];
        ListaDatos miLista = new ListaDatos();
        
        
        datoentrada = txtfldPrimer.getText();
        object[0] = Integer.parseInt(datoentrada);
        val[0] = object[0];
        datoentrada = txtfldSegun.getText();
        object[1] = Integer.parseInt(datoentrada);
        val[1] = object[1];
        datoentrada = txtfldTercer.getText();
        object[2] = Integer.parseInt(datoentrada);
        val[2] = object[2];
        datoentrada = txtfldCuart.getText();
        object[3] = Integer.parseInt(datoentrada);
        val[3] = object[3];
        
        this.cuad1 = Integer.parseInt(txtfldPrimer.getText());
        this.cuad2 = Integer.parseInt(txtfldSegun.getText());
        this.cuad3 = Integer.parseInt(txtfldTercer.getText());
        this.cuad4 = Integer.parseInt(txtfldCuart.getText());
        
        miLista.add(new Nodo(cuad1));
        miLista.add(new Nodo(cuad2));
        miLista.add(new Nodo(cuad3));
        miLista.add(new Nodo(cuad4));
        miLista.print();
        
        lista1.setValor(cuad1);
        lista2.setValor(cuad2);
        lista3.setValor(cuad3);
        lista4.setValor(cuad4);

        modelo.addRow(val);
        limpiar();
        //ordenamiento
        for (int i = 0; i < object.length; i++) {
            for (int j = 0; j < object.length - 1; j++) {
                if (object[j] > object[j +1]) {
                    int temp = object[j];
                    object[j] = object [j+1];
                    object[j + 1] = temp;
                }
            }
        }
        System.out.println("");
        int menor = object[0];
        for (int i = 0; i < object.length; i++) {
            System.out.print(object[i] + "-");
        }
        System.out.println("");
        
        int[] resta = new int[4];
        resta[0] = object[1] - object[0];
        System.out.println("Esta es la resta " + resta[0]);
        pena = resta[0];
        if (menor == cuad1) {
             lista1.setValor(Dema1 - Oferta);
             mayor = lista1.getValor();
                DemaT = Dema1;
            if (lista1.getValor() < 0) {
                lista1.setValor(Math.abs(lista1.getValor()));
                
            }
        }
        else if (menor == cuad2) {
            lista2.setValor(Math.abs(lista2.getValor()));
                mayor = lista2.getValor();
                DemaT = Dema2;
            lista2.setValor(Dema2 - Oferta);
            if (lista2.getValor() < 0) {
                
            }
        }
        else if (menor == cuad3) {
            lista3.setValor(Dema3 - Oferta);
            mayor = lista3.getValor();
                DemaT = Dema3;
            if (lista3.getValor() < 0) {
                lista3.setValor(Math.abs(lista3.getValor()));
                
            }
        }
        else if (menor == cuad4) {
            lista4.setValor(Dema4 - Oferta);
            mayor = lista4.getValor();
                DemaT = Dema4;
            if (lista4.getValor() < 0) {
                lista4.setValor(Math.abs(lista4.getValor()));
                
            }
        }
        imprimirValores();
        
        System.out.println("");
        System.out.println(mayor + "-" + DemaT);
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGuardarKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonGuardarKeyPressed

    private void txtfldOferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldOferActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtfldOferActionPerformed

    private void btnSaveOferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOferActionPerformed
        // TODO add your handling code here:
        this.Oferta = Integer.parseInt(txtfldOfer.getText());
        lblOfeActual.setText(String.valueOf(Oferta));
        limpiarOfer();
    }//GEN-LAST:event_btnSaveOferActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       JOptionPane.showMessageDialog(this, "La mejor solución para su negocio es que utilice " + mayor + " de sus recursos para la línea con " + DemaT + "de demanda. "
                + "\nSu penalización es de " + pena); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiar(){
        txtfldPrimer.setText("");
        txtfldSegun.setText(""); 
        txtfldTercer.setText(""); 
        txtfldCuart.setText(""); 
         
    }
    
    private void limpiarOfer(){
        txtfldOfer.setText("");
    }
    
    private void imprimirValores(){
    System.out.print(lista1.getValor() + "-" + lista2.getValor() + "-" + lista3.getValor() +"-" + lista4.getValor());
    }
    
    public int Result(int mayor){
        this.mayor = mayor;
        return mayor;
    } 
    public int Penita(int pena){
        this.pena = pena;
        return pena;
    } 
    public int Demat(int DemaT){
        this.DemaT = DemaT;
        return DemaT;
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSaveOfer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCuart;
    private javax.swing.JLabel lblOfeActual;
    private javax.swing.JLabel lblPrimer;
    private javax.swing.JLabel lblSegun;
    private javax.swing.JLabel lblTercer;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtfldCuart;
    private javax.swing.JTextField txtfldOfer;
    private javax.swing.JTextField txtfldPrimer;
    private javax.swing.JTextField txtfldSegun;
    private javax.swing.JTextField txtfldTercer;
    // End of variables declaration//GEN-END:variables

    private int miLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}

