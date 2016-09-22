package Interfaz_Grafica;

import Archivos.Archivos;
import Logica_Notas.Asignatura;
import Logica_Notas.ConsolidadoNotas;
import Logica_Notas.Estudiante;
import Logica_Notas.Notas;
import Logica_Notas.Registros;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Interfaz_Grafica extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
//abrimos espacio de memoria para las clases de Registros y Archivos
    Registros reg = new Registros();
    Archivos ars = new Archivos();

    public Interfaz_Grafica() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ARCHIVO DE NOTAS");
        //reg.llenar_comboBox(jcombo);
        panelmostrar.setVisible(false);
        definitiva.setEditable(false);//con esta variable inpedimos que se modifique la nota defintiva mostarda en el jtextfield definitiva
        //editamos con la clase DefaultTablaModel la tabla con la que mostraremos la informacion
        
        //hacemos el llamado a los metodos de la  clase Registros para cargar los archivos a las respectivas listas declaradas en dicha clase
        try {

            reg.obtenerListaEstudiantes("Estudiante.txt");
            reg.obtener_Lista_Asignaturas("Asignaturas.txt");
            
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //damos el nombre a cada una de las columnas de la tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("CODIGO ESTUDIANTE");
        modeloTabla.addColumn("CODIGO ASIGNATURA");
        modeloTabla.addColumn("NOMBRE ASIGNATURA");
        modeloTabla.addColumn("NOTA 1");
        modeloTabla.addColumn("NOTA 2");
        modeloTabla.addColumn("NOTA 3");
        modeloTabla.addColumn("DEFINITIVA");
        tabla.setModel(modeloTabla);//la tabla de la interfaz adopta o toma el modelo que instanciamos
        
        
        
        ArrayList aux=reg.asignauturas();
            for (int i=0;i<aux.size();i++) {
                Asignatura asg=(Asignatura)aux.get(i);
                jcombo.addItem(asg.getNombreMateria());
            }

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelingresa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        jcombo = new javax.swing.JComboBox();
        nota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        definitiva = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        panelmostrar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mostrar = new javax.swing.JMenuItem();
        volver = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelingresa.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identificacion");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Asignatura");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Parcial 1");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Parcial 2");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parcial Final");

        txtidentificacion.setBackground(new java.awt.Color(0, 153, 204));
        txtidentificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtidentificacion.setForeground(new java.awt.Color(255, 255, 255));
        txtidentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentificacionKeyTyped(evt);
            }
        });

        nota1.setBackground(new java.awt.Color(0, 153, 204));
        nota1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nota1.setForeground(new java.awt.Color(255, 255, 255));
        nota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nota1KeyTyped(evt);
            }
        });

        nota2.setBackground(new java.awt.Color(0, 153, 204));
        nota2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nota2.setForeground(new java.awt.Color(255, 255, 255));
        nota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nota2KeyTyped(evt);
            }
        });

        nota3.setBackground(new java.awt.Color(0, 153, 204));
        nota3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nota3.setForeground(new java.awt.Color(255, 255, 255));
        nota3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nota3KeyTyped(evt);
            }
        });

        btncalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/calcular.png"))); // NOI18N
        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Definitiva");

        definitiva.setBackground(new java.awt.Color(0, 153, 204));
        definitiva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        definitiva.setForeground(new java.awt.Color(255, 255, 255));
        definitiva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                definitivaKeyTyped(evt);
            }
        });

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/guardar5.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/fup.png"))); // NOI18N

        javax.swing.GroupLayout panelingresaLayout = new javax.swing.GroupLayout(panelingresa);
        panelingresa.setLayout(panelingresaLayout);
        panelingresaLayout.setHorizontalGroup(
            panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelingresaLayout.createSequentialGroup()
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelingresaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)))
                    .addGroup(panelingresaLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel7)))
                .addGap(30, 30, 30)
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelingresaLayout.createSequentialGroup()
                        .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nota2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(nota1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelingresaLayout.createSequentialGroup()
                                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelingresaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnguardar))
                                    .addGroup(panelingresaLayout.createSequentialGroup()
                                        .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addComponent(btncalcular)))
                                .addGap(14, 14, 14)))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(panelingresaLayout.createSequentialGroup()
                        .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(definitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelingresaLayout.setVerticalGroup(
            panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelingresaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncalcular))
                .addGap(49, 49, 49)
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(definitiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelingresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelingresaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnguardar))
                    .addGroup(panelingresaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelmostrar.setBackground(new java.awt.Color(0, 51, 204));

        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout panelmostrarLayout = new javax.swing.GroupLayout(panelmostrar);
        panelmostrar.setLayout(panelmostrarLayout);
        panelmostrarLayout.setHorizontalGroup(
            panelmostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmostrarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelmostrarLayout.setVerticalGroup(
            panelmostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmostrarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/menu.png"))); // NOI18N
        jMenu1.setText("Menu");

        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/ver.png"))); // NOI18N
        mostrar.setText("Ver notas");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jMenu1.add(mostrar);

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/atras.png"))); // NOI18N
        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jMenu1.add(volver);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelingresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(panelmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelingresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        DecimalFormat decimales = new DecimalFormat("0.00");//patron o formato que damos para la salida de un numero de coma flotante
        if (!nota1.getText().isEmpty() && !nota2.getText().isEmpty() && !nota3.getText().isEmpty()) {

            Double n1 = Double.parseDouble(nota1.getText());
            Double n2 = Double.parseDouble(nota2.getText());
            Double n3 = Double.parseDouble(nota3.getText());
            if (n1 >= 0 && n1 <= 5) {
                if (n2 >= 0 && n2 <= 5) {
                    if (n3 >= 0 && n3 <= 5) {
                        Notas ns = new Notas(n1, n2, n3);
                        Double def = ns.CalcularDefinitiva(n1, n2, n3);//enviamos al metodo calcular definitiva las notas capturadas en la interfaz

                        definitiva.setText(decimales.format(def));//el campo de texto definitiva tomara el valor retornado del metodo calcular definitiva
                    } else {
                        JOptionPane.showMessageDialog(null, "TERCER NOTA INCORRECTA SOLO VALIDA DE 0-5", "VALIDAR NOTA", JOptionPane.ERROR_MESSAGE);
                        nota3.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "SEGUNDA NOTA INCORRECTA SOLO VALIDA DE 0-5", "VALIDAR NOTA", JOptionPane.ERROR_MESSAGE);
                    nota2.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "PRIMER NOTA INCORRECTA SOLO VALIDA DE 0-5", "VALIDAR NOTA", JOptionPane.ERROR_MESSAGE);
                nota1.requestFocus();

            }
        } else {
            JOptionPane.showMessageDialog(null, "FALTAN CASILLAS POR LLENAR", "VALIDAR USUARIO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String[] datos = new String[7];//arreglo en el cual se guardara la informacion que se mostrara la tabla
        if (!txtidentificacion.getText().isEmpty() && !nota1.getText().isEmpty() && !nota2.getText().isEmpty() && !nota3.getText().isEmpty()) {

            int CodAsig = reg.BuscarCodAsig(jcombo.getSelectedIndex());//enviamos el entero numero de posicion de la materia capturada en el combo box para buscar el cod de la asignatura
            int codEst = reg.BuscarcodEst(Integer.parseInt(txtidentificacion.getText()));//enviamos como tipo entero lo que captura el txtidentificacion para que compare las identificaciones guardadas en la lista y determine si se encuentra y me capture el cod del estudiante
            String nomasg = reg.nombreMateria(jcombo.getSelectedIndex());//buscamos el nombre de la materia que se eligio en el comboBox

            try {

                if (reg.BuscarcodEst(Integer.parseInt(txtidentificacion.getText())) != 0) {//si el retorno no es igual a cero es por que trae un dato que sera el cod del estudiante
                    datos[0] = "" + codEst;
                    txtidentificacion.setText(null);
                    String cdest = Integer.toString(codEst);
                    String cdasg = Integer.toString(CodAsig);
                    String nt1 = nota1.getText();
                    String nt2 = nota2.getText();
                    String nt3 = nota3.getText();
                    String fnl = definitiva.getText();

                    String dts = (cdest + "," + cdasg + "," + nomasg + "," + nt1 + "," + nt2 + "," + nt3 + "," + fnl);//y como la identificacion se encontro en el archivo podemos escribir el archivo de notas la informacion respectiva
                    ars.abrirArchivo("Notas.txt", true);//abrimos el archivo "Notas.txt" y enviamos true debido a que se escribira en el archivo
                    ars.escribirArchivo(dts);//enviamos los datos a escribir en el archivo
                    ars.cerrarArchivo();//cerramos el archivo

                    if (reg.BuscarCodAsig(jcombo.getSelectedIndex()) != 0) {//si el retorno no es igual a cero entonces el metodo retorno un dato que sera almacenado en la 1 posicion de arreglo
                        datos[1] = "" + CodAsig;

                    }
                    if (reg.nombreMateria(jcombo.getSelectedIndex()) != null) {//si el retorno del metodo que busca el nomre de la materia no es null entonces en la posicion 2 guardara el nombre de la asignatura encontrada

                        datos[2] = nomasg;
                    }
                    //el resto de datos son los capturados en la interfaz y el calculo de la nota definitiva
                    ArrayList lstestudiantes=reg.ListaEstudiantes();
                    
                    for (int i = 0; i < lstestudiantes.size(); i++) {
                        Estudiante est = (Estudiante)lstestudiantes.get(i);
                        int cod=est.getCodigo();
                       // if(cod==){
                            
                       // }
                        
                    }
                    
                    datos[3] = nota1.getText();
                    nota1.setText(null);
                    datos[4] = nota2.getText();
                    nota2.setText(null);
                    datos[5] = nota3.getText();
                    nota3.setText(null);
                    datos[6] = definitiva.getText();
                    definitiva.setText(null);
                    modeloTabla.addRow(datos);//agregamos a la tabla el arreglo datos de 7 posiciones para que nos muestre la informacion requerida 
                    jcombo.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, "La identificacion es correcta,los datos seran guardados");
                } //si la identificacion no se encuentra se ejecutara el siguiente bloque else  
                else {
                    JOptionPane.showMessageDialog(null, "la identificacion ingresada NO se encuentra en en el archivo de ESTUDIANTES, por lo tanto no se registrara ninguna nota");
                    txtidentificacion.setText(null);
                    jcombo.setSelectedIndex(0);
                    nota1.setText(null);
                    nota2.setText(null);
                    nota3.setText(null);
                    definitiva.setText(null);
                }
            } catch (IOException ex) {
                Logger.getLogger(Interfaz_Grafica.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "FALTAN CASILLAS POR LLENAR", "VALIDAR USUARIO", JOptionPane.ERROR_MESSAGE);
            txtidentificacion.getText();
            nota1.requestFocus();
            nota2.requestFocus();
            nota3.requestFocus();
            txtidentificacion.getText();

        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtidentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentificacionKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtidentificacionKeyTyped

    private void nota1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (nota1.getText().length() > 20) {
            evt.consume();
        }
        if ((c < '0' || c > '9') && c != '.') {
            evt.consume();
        }


    }//GEN-LAST:event_nota1KeyTyped

    private void nota2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (nota2.getText().length() > 20) {
            evt.consume();
        }
        if ((c < '0' || c > '9') && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_nota2KeyTyped

    private void nota3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (nota3.getText().length() > 20) {
            evt.consume();
        }
        if ((c < '0' || c > '9') && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_nota3KeyTyped

    private void definitivaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_definitivaKeyTyped

        char c = evt.getKeyChar();
        if (definitiva.getText().length() > -1) {
            evt.consume();
        }
    }//GEN-LAST:event_definitivaKeyTyped

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        panelingresa.setVisible(false);
        panelmostrar.setVisible(true);
        try{
        reg.obtener_Lista_Notas("Notas.txt");
        int cont=0;
        int aux=modeloTabla.getRowCount();
        while(cont!=aux){
            modeloTabla.removeRow(cont);
            cont++;
        }
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
        ArrayList aux=reg.obtenerNotas();
        for (int i = 0; i < aux.size(); i++) {
            ConsolidadoNotas notas = (ConsolidadoNotas)aux.get(i);
            String []fila=new String[7];
            fila[0]=String.valueOf(notas.getCodest());
            fila[1]=String.valueOf(notas.getCodasg());
            fila[2]=notas.getNomasg();
            fila[3]=String.valueOf(notas.getNota1());
            fila[4]=String.valueOf(notas.getNota2());
            fila[5]=String.valueOf(notas.getNota3());
            fila[6]=notas.getDefinitiva();
            modeloTabla.addRow(fila);
        }
        
    }//GEN-LAST:event_mostrarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        panelingresa.setVisible(true);
        panelmostrar.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "En realidad desea  cerrar la aplicacion", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField definitiva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcombo;
    private javax.swing.JMenuItem mostrar;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JPanel panelingresa;
    private javax.swing.JPanel panelmostrar;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JMenuItem volver;
    // End of variables declaration//GEN-END:variables
}
