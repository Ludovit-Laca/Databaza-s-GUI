/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lacal
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    String driver = "com.mysql.jdbc.Driver";
    String db = "jdbc:mysql://localhost/filmy_a_herci";
    String pw = "";
    String login = "root";
    Connection con;
    SimpleTableModel myTabModel;
    SimpleTableModel FilmyTabModel;
    JTable table;
    boolean start = false;

    public Frame() {
        initComponents();
    }

    Boolean Pripojenie() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(db, login, pw);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    private void filter(String query) {
        TableRowSorter<SimpleTableModel> tr = new TableRowSorter<SimpleTableModel>(myTabModel);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
        jTable1.changeSelection(0, 0, false, false);
    }

    private void filterFilmy(String query) {
        TableRowSorter<SimpleTableModel> tr = new TableRowSorter<SimpleTableModel>(FilmyTabModel);
        jTable3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
        jTable3.changeSelection(0, 0, false, false);
    }

    private void sort(JTable table) {
        TableRowSorter sorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setSortable(0, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        filterTxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Databáza filmov a hercov");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Štart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jButton3.setText("Pridaj");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Uprav");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Vymaž herca");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        filterTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filterTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTxtActionPerformed(evt);
            }
        });
        filterTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterTxtKeyReleased(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hľadaj herca");

        jButton6.setText("Pridaj");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Uprav");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Vymaž film");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hľadaj film");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton9.setText("Vymaž film od herca");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Pripojenie()) {
            myTabModel = new SimpleTableModel(con);
            FilmyTabModel = new SimpleTableModel(con);
            myTabModel.RefreshResultSet("Select * from herci");
            jTable1.setModel(myTabModel);

            sort(jTable1);
            jTable1.getTableHeader().setReorderingAllowed(false);
            start = true;

//  jTable1.setAutoCreateRowSorter(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (start) {
            int aktRiadok = jTable1.getSelectedRow();
            if (aktRiadok > -1) {
                String id = jTable1.getValueAt(aktRiadok, 0).toString();
                FilmyTabModel.RefreshResultSet("SELECT filmy.ID, filmy.Film, filmy.Kategoria, YEAR(filmy.Rok) AS Rok, filmy.Dlzka FROM `filmy` "
                                             + "INNER JOIN filmy_herci ON filmy.ID = filmy_herci.ID_filmu WHERE filmy_herci.ID_herca = " + id
                                             + " GROUP BY filmy.ID");
                
            } else myTabModel.RefreshResultSet("SELECT * FROM herci");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (start) {
            int aktRiadok = jTable1.getSelectedRow();
            if (aktRiadok > -1) {
                String ID = jTable1.getValueAt(aktRiadok, 0).toString();
                FilmyTabModel.RefreshResultSet("SELECT filmy.ID, filmy.Film, filmy.Kategoria, YEAR(filmy.Rok) AS Rok, filmy.Dlzka FROM `filmy` "
                        + "INNER JOIN filmy_herci ON filmy.ID = filmy_herci.ID_filmu WHERE filmy_herci.ID_herca = " + ID
                        + " GROUP BY filmy.ID");
                jTable3.setModel(FilmyTabModel);
                sort(jTable3);
                jTable3.getTableHeader().setReorderingAllowed(false);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        if (start) {
            int aktRiadok = jTable3.getSelectedRow();
            if (aktRiadok > -1) {
                InternalFrame tab = new InternalFrame(
                        jTable3.getValueAt(aktRiadok, 0).toString(),
                        "Zoznam hercov: " + jTable3.getValueAt(aktRiadok, 1).toString(),
                        con);
                jDesktopPane1.add(tab);
            }
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (start) {
            MyJDialog NewWindow = new MyJDialog(this, true);
            if (NewWindow.BoloStlaceneOK()) {
                String meno = NewWindow.getMeno();
                String priezvisko = NewWindow.getPriezvisko();
                String datum_narodenia = NewWindow.getDatum_narodenia();
                String narodnost = NewWindow.getNarodnost();

                try {
                    Statement stmt = con.createStatement();
                    String mySQL = "INSERT into herci (meno, priezvisko, datum_narodenia, narodnost) values ("
                            + "'" + meno + "',"
                            + "'" + priezvisko + "',"
                            + "'" + datum_narodenia + "',"
                            + "'" + narodnost + "')";

                    int riadky = stmt.executeUpdate(mySQL);
                } catch (Exception e) {
                    System.out.println(e);
                }

                myTabModel.RefreshResultSet("SELECT * FROM herci");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int aktRiadok = jTable1.getSelectedRow();

        if (aktRiadok > -1) {

            MyJDialog NewWindow = new MyJDialog(this, true,
                    jTable1.getValueAt(aktRiadok, 1).toString(),
                    jTable1.getValueAt(aktRiadok, 2).toString(),
                    jTable1.getValueAt(aktRiadok, 3).toString(),
                    jTable1.getValueAt(aktRiadok, 4).toString()
            );

            if (NewWindow.BoloStlaceneOK()) {
                System.out.println("OK");
                String meno = NewWindow.getMeno();
                String priezvisko = NewWindow.getPriezvisko();
                String datum_narodenia = NewWindow.getDatum_narodenia();
                String narodnost = NewWindow.getNarodnost();

                try {
                    Statement stmt = con.createStatement();
                    String mySQL = "UPDATE herci set "
                            + "Meno='" + meno + "',"
                            + "Priezvisko='" + priezvisko + "',"
                            + "Datum_narodenia='" + datum_narodenia + "',"
                            + "Narodnost='" + narodnost + "' WHERE ID = "
                            + jTable1.getValueAt(aktRiadok, 0).toString();

                    int riadky = stmt.executeUpdate(mySQL);
                } catch (Exception e) {
                    System.out.println(e);
                }
                myTabModel.RefreshResultSet("SELECT * FROM herci");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int aktRiadok = jTable1.getSelectedRow();

        if (aktRiadok > -1) {
            try {
                Statement stmt = con.createStatement();
                String hodnota = jTable1.getValueAt(aktRiadok, 0).toString();
                String mySQL = "DELETE FROM herci WHERE ID = "
                        + hodnota;

                int riadky = stmt.executeUpdate(mySQL);

                String mySQL2 = "DELETE FROM filmy_herci WHERE id_herca = " + hodnota;

                int riadky2 = stmt.executeUpdate(mySQL2);

                stmt.close();

            } catch (Exception e) {
                System.out.println(e);
            }

            myTabModel.RefreshResultSet("SELECT * FROM herci");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void filterTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTxtKeyReleased
        String query = filterTxt.getText();
        filter(query);
    }//GEN-LAST:event_filterTxtKeyReleased

    private void filterTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterTxtActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int aktRiadok = jTable1.getSelectedRow();

        if (aktRiadok > -1) {

            MyJDialog_film NewWindow = new MyJDialog_film(this, true);
            if (NewWindow.BoloStlaceneOK()) {
                String zaznam = NewWindow.getZaznam();
                if (!(zaznam.equals("--Nový záznam--"))) {
                    String pole[] = zaznam.split(" ");
                    zaznam = pole[0];
                    String id_herca = jTable1.getValueAt(aktRiadok, 0).toString();
                    try {
                        Statement stmt = con.createStatement();
                        String mySQL2 = "INSERT into filmy_herci (ID_filmu, ID_herca) values ("
                                + "'" + zaznam + "',"
                                + "'" + id_herca + "')";

                        int riadky2 = stmt.executeUpdate(mySQL2);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    FilmyTabModel.RefreshResultSet("SELECT filmy.ID, filmy.Film, filmy.Kategoria, YEAR(filmy.Rok) AS Rok, filmy.Dlzka FROM `filmy` "
                        + "INNER JOIN filmy_herci ON filmy.ID = filmy_herci.ID_filmu WHERE filmy_herci.ID_herca = " + id_herca
                        + " GROUP BY filmy.ID");

                } else {

                    String film = NewWindow.getFilm();
                    String kategoria = NewWindow.getKategoriu();
                    String rok = NewWindow.getRok();
                    String dlzka = NewWindow.getDlzka();

                    try {

                        PreparedStatement mySQL = con.prepareStatement("INSERT into filmy (film, kategoria, rok, dlzka) values ("
                                + "'" + film + "',"
                                + "'" + kategoria + "',"
                                + "'" + rok + "',"
                                + "'" + dlzka + "')", Statement.RETURN_GENERATED_KEYS);

                        mySQL.executeUpdate();

                        int id = 0;
                        ResultSet rs = mySQL.getGeneratedKeys();
                        if (rs.next()) {
                            id = rs.getInt(1);
                        }

                        String id_herca = jTable1.getValueAt(aktRiadok, 0).toString();
                        String id_filmu = "" + id;

                        Statement stmt = con.createStatement();
                        String mySQL2 = "INSERT into filmy_herci (ID_filmu, ID_herca) values ("
                                + "'" + id_filmu + "',"
                                + "'" + id_herca + "')";

                        int riadky2 = stmt.executeUpdate(mySQL2);

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    FilmyTabModel.RefreshResultSet("SELECT filmy.ID, filmy.Film, filmy.Kategoria, YEAR(filmy.Rok) AS Rok, filmy.Dlzka FROM `filmy` "
                        + "INNER JOIN filmy_herci ON filmy.ID = filmy_herci.ID_filmu WHERE filmy_herci.ID_herca = " + jTable1.getValueAt(aktRiadok, 0).toString()
                        + " GROUP BY filmy.ID");
                }
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int aktRiadok = jTable3.getSelectedRow();
        int aktRiadok_herci = jTable1.getSelectedRow();

        if (aktRiadok > -1 && aktRiadok_herci > -1) {

            MyJDialog_film NewWindow = new MyJDialog_film(this, true,
                    jTable3.getValueAt(aktRiadok, 1).toString(),
                    jTable3.getValueAt(aktRiadok, 3).toString(),
                    jTable3.getValueAt(aktRiadok, 4).toString()
            );

            if (NewWindow.BoloStlaceneOK()) {
                System.out.println("OK");
                String film = NewWindow.getFilm();
                String kategoria = NewWindow.getKategoriu();
                String rok = NewWindow.getRok();
                String dlzka = NewWindow.getDlzka();

                try {
                    Statement stmt = con.createStatement();
                    String mySQL = "UPDATE filmy set "
                            + "Film='" + film + "',"
                            + "Kategoria='" + kategoria + "',"
                            + "Rok='" + rok + "',"
                            + "Dlzka='" + dlzka + "' WHERE ID = "
                            + jTable3.getValueAt(aktRiadok, 0).toString();

                    int riadky = stmt.executeUpdate(mySQL);
                } catch (Exception e) {
                    System.out.println(e);
                }
                String id_herca = jTable1.getValueAt(aktRiadok_herci, 0).toString();
                FilmyTabModel.RefreshResultSet("SELECT filmy.ID, filmy.Film, filmy.Kategoria, YEAR(filmy.Rok) AS Rok, filmy.Dlzka FROM `filmy` "
                        + "INNER JOIN filmy_herci ON filmy.ID = filmy_herci.ID_filmu WHERE filmy_herci.ID_herca = " + id_herca
                        + " GROUP BY filmy.ID");
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int aktRiadok = jTable3.getSelectedRow();
        int aktRiadok_herec = jTable1.getSelectedRow();

        if (aktRiadok > -1 && aktRiadok_herec > -1 ) {
            try {
                Statement stmt = con.createStatement();
                String hodnota = jTable3.getValueAt(aktRiadok, 0).toString();
                String mySQL = "DELETE FROM filmy WHERE ID = "
                        + hodnota;

                int riadky = stmt.executeUpdate(mySQL);

                String mySQL2 = "DELETE FROM filmy_herci WHERE id_filmu = "
                        + hodnota;

                int riadky2 = stmt.executeUpdate(mySQL2);

                stmt.close();

            } catch (Exception e) {
                System.out.println(e);
            }
            String id = jTable1.getValueAt(aktRiadok_herec, 0).toString();
            FilmyTabModel.RefreshResultSet("SELECT filmy.ID, filmy.Film, filmy.Kategoria, YEAR(filmy.Rok) AS Rok, filmy.Dlzka FROM `filmy` " +
                                           "INNER JOIN filmy_herci ON filmy.ID = filmy_herci.ID_filmu WHERE filmy_herci.ID_herca = " + id +
                                           " GROUP BY filmy.ID");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String query = jTextField1.getText();
        filterFilmy(query);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int aktRiadok = jTable3.getSelectedRow();
        int aktRiadok_herec = jTable1.getSelectedRow();

        if (aktRiadok > -1 && aktRiadok_herec > -1) {
            String id_herec = jTable1.getValueAt(aktRiadok_herec, 0).toString();
            try {
                Statement stmt = con.createStatement();
                String mySQL = "DELETE FROM filmy_herci WHERE ID_filmu = " + jTable3.getValueAt(aktRiadok, 0).toString() + " AND ID_herca = "
                        + id_herec;

                int riadky = stmt.executeUpdate(mySQL);
                stmt.close();

            } catch (Exception e) {
                System.out.println(e);
            }

            FilmyTabModel.RefreshResultSet("SELECT filmy.ID, filmy.Film, filmy.Kategoria, YEAR(filmy.Rok) AS Rok, filmy.Dlzka FROM `filmy` " +
                                           "INNER JOIN filmy_herci ON filmy.ID = filmy_herci.ID_filmu WHERE filmy_herci.ID_herca = " + id_herec +
                                           " GROUP BY filmy.ID");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filterTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}