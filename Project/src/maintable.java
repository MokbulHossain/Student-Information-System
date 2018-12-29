
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;



public class maintable extends javax.swing.JFrame {

    String id, name, age, department,faculty,gender,religion,marital,email,blood,contactnumber;

    Update up = new Update(this);
    search searchframe=new search();
   //Database connection 
   Connection con=null;
   ResultSet rs=null;
  PreparedStatement pst = null;
  String path="jdbc:mysql://localhost:3306/student_information";
   String user="root";
    String pass="";
    
     public void show_data_in_table_from_database(){
         
         String sql="select * from student order by id asc";
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection(path,user,pass);
           pst= con.prepareStatement(sql);
           rs = pst.executeQuery();
           table1.setModel(DbUtils.resultSetToTableModel(rs));     
       }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
       }
    }
     
    public void delete_data_from_database(){
         try{
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection(path,user,pass);
           String sql="DELETE FROM student WHERE id=?"; 
           pst = con.prepareStatement(sql);
           pst.setString(1,id);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Delete Successfull!!!");
       }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
       }
    }
          
    public String idpass() {
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        id = model.getValueAt(index, 0).toString();
        up.catchID=id;
        return id;
    }

    public String namepass() {
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        name = model.getValueAt(index, 1).toString();
        return name;
    }

    public String agepass() {
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        age = model.getValueAt(index, 2).toString();
        return age;
    }

    public String departmentpass() {
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        department = model.getValueAt(index, 3).toString();
        return department;
    } 
    public String facultypass(){
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        faculty = model.getValueAt(index, 4).toString();
        return faculty;
    }
    public String genderpass(){
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        gender = model.getValueAt(index, 5).toString();
        return gender;
    }
    public String religionpass(){
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        religion = model.getValueAt(index, 6).toString();
        return religion;
    }
    public String maritalpass(){
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        marital = model.getValueAt(index, 7).toString();
        return marital;
    }
    public String emailpass(){
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        email = model.getValueAt(index, 8).toString();
        return email;
    }
    public String bloodpass(){
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        blood = model.getValueAt(index, 9).toString();
        return blood;
    }
    public String contactnumberpass(){
        TableModel model = table1.getModel();
        int index = table1.getSelectedRow();
        contactnumber = model.getValueAt(index, 10).toString();
        return contactnumber;
    }
    //This method will work at the time of program  run...
    public maintable() {
        initComponents();
        show_data_in_table_from_database();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        refreshboutton = new javax.swing.JButton();
        updateboutton = new javax.swing.JButton();
        deleteboutton = new javax.swing.JButton();
        addboutton = new javax.swing.JButton();
        exitboutton = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("  Admission Information of  Daffodil International University");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0, new java.awt.Color(102, 102, 0), new java.awt.Color(102, 0, 0), null, null));

        table1.setBorder(new javax.swing.border.MatteBorder(null));
        table1.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID:", "Name:", "Age:", "Department", "Faculty", "Gender", "Religion", "maritial status", "Email", "Blood group", "contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        table1.setSelectionForeground(new java.awt.Color(204, 204, 255));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        refreshboutton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        refreshboutton.setText("Refresh");
        refreshboutton.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        refreshboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbouttonActionPerformed(evt);
            }
        });

        updateboutton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        updateboutton.setText("Update");
        updateboutton.setBorder(new javax.swing.border.SoftBevelBorder(0));
        updateboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebouttonActionPerformed(evt);
            }
        });

        deleteboutton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        deleteboutton.setText("Delete");
        deleteboutton.setBorder(new javax.swing.border.SoftBevelBorder(0));
        deleteboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebouttonActionPerformed(evt);
            }
        });

        addboutton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        addboutton.setText("Add");
        addboutton.setBorder(new javax.swing.border.SoftBevelBorder(0));
        addboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbouttonActionPerformed(evt);
            }
        });

        exitboutton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        exitboutton.setText("Exit");
        exitboutton.setBorder(new javax.swing.border.SoftBevelBorder(0));
        exitboutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbouttonActionPerformed(evt);
            }
        });

        searchfield.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        searchfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchfieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchfieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(exitboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deleteboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(updateboutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshboutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 315, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refreshboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(updateboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(deleteboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(addboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(exitboutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void exitbouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbouttonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitbouttonActionPerformed

    private void refreshbouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbouttonActionPerformed
        searchfield.setText("");
        table1.clearSelection();
        this.hide();
        show_data_in_table_from_database();
        this.show();
    }//GEN-LAST:event_refreshbouttonActionPerformed

    private void deletebouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebouttonActionPerformed

        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        if (table1.getSelectedRow() == -1) {
            if (table1.getRowCount() == 0) {
              JOptionPane.showMessageDialog(null, "Table is empty!!!!!!!");
            } else {
                 JOptionPane.showMessageDialog(null, "You must Select a row!!!!!!");
            }
        } else {
            
            int response = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Confirm",
           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if (response == JOptionPane.NO_OPTION) {
          //CLOSE POP UP MENU ...
            }
          else if (response == JOptionPane.YES_OPTION)//WILL RUN FOR DELETE DATA ....
         {
              model.removeRow(table1.getSelectedRow());
             delete_data_from_database(); 
        }    
        }
    }//GEN-LAST:event_deletebouttonActionPerformed

    private void updatebouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebouttonActionPerformed

        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        if (table1.getSelectedRow() == -1) {
            if (table1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty!!!!!!!");
            } 
            else {
                JOptionPane.showMessageDialog(null, "You must Select a row!!!!!!");
            }
          }
        else {
          
            int response = JOptionPane.showConfirmDialog(null, "Do you want to update data?", "Confirm",
           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if (response == JOptionPane.NO_OPTION) {
          //CLOSE POP UP MENU ...
            }
          else if (response == JOptionPane.YES_OPTION)//WILL RUN FOR UPADTE DATA ....
         {
             this.hide();
            up.show();
            up.idfield.setText(id);
            up.namefield.setText(name);
            up.agefield.setText(age);
            up.departmentcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{department, "CSE", "BBA", "Textile", "EEE"}));
            up.facultycombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{faculty, "FSIT", "FBI", "FE", "FAHS","FHSS"}));
            up.gendercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{gender, "Male", "Female", "Others"}));
            up.religioncombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{religion, "Islam", "Hindu", "Buddho", "Christian"}));
            up.emailfield.setText(email);
            up.bloodgroupcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{blood, "A+", "A-", "AB+", "AB-","B+","B-","O+","O-"}));
            up.contactnumfield.setText(contactnumber);
            if(marital=="Married"){
                up.marriedcheckbox.setSelected(true);
                up.unmarriedcheckbox.setSelected(false);
            }
            else{
                 up.unmarriedcheckbox.setSelected(true);
            }
//JOptionPane.showMessageDialog(null,"id is "+up.catchID);
        }     
        }
    }//GEN-LAST:event_updatebouttonActionPerformed

    private void addbouttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbouttonActionPerformed
        ADD add = new ADD(this);
         add.show();
        this.hide();


    }//GEN-LAST:event_addbouttonActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        this.idpass();
        this.namepass();
        this.agepass();
        this.departmentpass();
        this.facultypass();
        this.genderpass();
        this.religionpass();
        this.maritalpass();
        this.emailpass();
        this.bloodpass();
        this.contactnumberpass();
    }//GEN-LAST:event_table1MouseClicked

    private void searchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyReleased

    }//GEN-LAST:event_searchfieldKeyReleased

    private void searchfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyPressed

if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    try{
        String sql = "select * from student where id=?";  
        pst = con.prepareStatement(sql);
        pst.setString(1, searchfield.getText());
        rs=pst.executeQuery();
 
 if(rs.next())
{  
    searchframe.show();
  String showid = rs.getString("id"); 
 searchframe.idfield.setText(showid);
 String showname = rs.getString("name"); 
 searchframe.namefield.setText(showname);
 String showage = rs.getString("age"); 
 searchframe.agefield.setText(showage);
 String showdepartment = rs.getString("department"); 
 searchframe.departmentfield.setText(showdepartment);
 
 String showfaculty = rs.getString("faculty"); 
 searchframe.facultyfield.setText(showfaculty);
 String shoegender = rs.getString("gender"); 
 searchframe.genderfield.setText(shoegender);
 String showreligion = rs.getString("religion"); 
 searchframe.religionfield.setText(showreligion);
 String showmartial = rs.getString("martial"); 
 searchframe.martialfield.setText(showmartial);
 String showemail = rs.getString("email"); 
 searchframe.emailfield.setText(showemail);
 String showblood = rs.getString("blood"); 
 searchframe.bloodfield.setText(showblood);
 String showcontactnumber = rs.getString("contactnumber"); 
 searchframe.contactnumberfield.setText(showcontactnumber);
  
 
}
 else{
     JOptionPane.showMessageDialog(null,"Not Found");
 }
}catch(Exception e){}}
    }//GEN-LAST:event_searchfieldKeyPressed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addboutton;
    private javax.swing.JButton deleteboutton;
    private javax.swing.JButton exitboutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshboutton;
    private javax.swing.JTextField searchfield;
    public javax.swing.JTable table1;
    private javax.swing.JButton updateboutton;
    // End of variables declaration//GEN-END:variables
}
