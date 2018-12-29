
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Update extends javax.swing.JFrame {
   maintable amain;
   public String catchID;
    Connection con=null;
  PreparedStatement pst = null;
  String path="jdbc:mysql://localhost:3306/student_information";
   String user="root";
    String pass="";

    public Update(maintable aThis) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.amain=aThis;
       
    }
    
    public void update_database(){
         
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection(path,user,pass);
           
           String sql = "update student_information.student set id=?, name=?, age=?, department=?, faculty=?, gender=?, religion=?, martial=?, email=?, blood=?, contactnumber=? where id=?";  
           pst = con.prepareStatement(sql);
            pst.setString(1, idfield.getText());
           pst.setString(2, namefield.getText());
           pst.setString(3, agefield.getText());
           pst.setString(4,departmentcombo.getSelectedItem().toString());
           pst.setString(5,facultycombo.getSelectedItem().toString());
           pst.setString(6,gendercombo.getSelectedItem().toString());
            pst.setString(7,religioncombo.getSelectedItem().toString());
           if(marriedcheckbox.isSelected()){
               pst.setString(8,"Married");
           }
           else{
               pst.setString(8,"Unmarried");
           }
            pst.setString(9,emailfield.getText());
           pst.setString(10,bloodgroupcombo.getSelectedItem().toString());
           pst.setString(11,contactnumfield.getText());
          
           pst.setString(12,catchID);
           pst.execute();
            this.hide();
            amain.show();
          JOptionPane.showMessageDialog(null,"DONE !!!"); 
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(null,"This ID is not available !! ");
       }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        namefield = new javax.swing.JTextField();
        agefield = new javax.swing.JTextField();
        departmentcombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        facultycombo = new javax.swing.JComboBox<>();
        marriedcheckbox = new javax.swing.JCheckBox();
        unmarriedcheckbox = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        gendercombo = new javax.swing.JComboBox<>();
        religioncombo = new javax.swing.JComboBox<>();
        emailfield = new javax.swing.JTextField();
        bloodgroupcombo = new javax.swing.JComboBox<>();
        contactnumfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Department:");

        idfield.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        namefield.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        agefield.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        departmentcombo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        departmentcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "Textile", "BBA" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("ID:");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Name:");

        done.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setText("     Update Frame");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Faculty:");

        facultycombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        facultycombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FSIT", "FBE", "FE", "FAHS", "FHSS" }));

        marriedcheckbox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        marriedcheckbox.setText("Married");
        marriedcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marriedcheckboxActionPerformed(evt);
            }
        });

        unmarriedcheckbox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unmarriedcheckbox.setText("Unmarried");
        unmarriedcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unmarriedcheckboxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Marital Status");

        gendercombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gendercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        religioncombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        religioncombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Hindu", "Christian", "Buddho" }));

        emailfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        bloodgroupcombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bloodgroupcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-" }));

        contactnumfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Gender:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Religion:\n\n");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Email:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Blood Group:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("ContactNum:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idfield)
                            .addComponent(namefield)
                            .addComponent(agefield)
                            .addComponent(departmentcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facultycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(jLabel11))))
                                            .addComponent(jLabel13))
                                        .addGap(0, 34, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel12)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bloodgroupcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gendercombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(religioncombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailfield)
                                    .addComponent(contactnumfield, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(marriedcheckbox)
                                        .addGap(61, 61, 61)
                                        .addComponent(unmarriedcheckbox)
                                        .addGap(16, 16, 16)))))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agefield, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departmentcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(facultycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(gendercombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(religioncombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bloodgroupcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactnumfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marriedcheckbox)
                            .addComponent(unmarriedcheckbox))
                        .addGap(18, 18, 18)
                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        setBounds(0, 0, 987, 643);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.hide();
        amain.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // amain.imessage.setText("");
        DefaultTableModel model = (DefaultTableModel) amain.table1.getModel();
        if(!idfield.getText().trim().equals(""))
        {
            if(!namefield.getText().trim().equals(""))
            {
                if(!agefield.getText().trim().equals(""))
                {
                    model.setValueAt(idfield.getText(),amain.table1.getSelectedRow(),0);
                    model.setValueAt(namefield.getText(),amain.table1.getSelectedRow(),1);
                    model.setValueAt(agefield.getText(),amain.table1.getSelectedRow(),2);
                    model.setValueAt(departmentcombo.getSelectedItem(),amain.table1.getSelectedRow(),3);
                    model.setValueAt(facultycombo.getSelectedItem(),amain.table1.getSelectedRow(),4);
                    model.setValueAt(gendercombo.getSelectedItem(),amain.table1.getSelectedRow(),5);
                    model.setValueAt(religioncombo.getSelectedItem(),amain.table1.getSelectedRow(),6);
                    if(marriedcheckbox.isSelected()){
                        model.setValueAt("Married",amain.table1.getSelectedRow(),7);
                    }
                    else{
                         model.setValueAt("Unmarried",amain.table1.getSelectedRow(),7);
                    }
                    model.setValueAt(emailfield.getText(),amain.table1.getSelectedRow(),8);
                    model.setValueAt(bloodgroupcombo.getSelectedItem(),amain.table1.getSelectedRow(),9);
                    model.setValueAt(contactnumfield.getText(),amain.table1.getSelectedRow(),10);
                    
                    
                    update_database();
                }
                else{
                    JOptionPane.showMessageDialog(null,"please input Age!!!!!!!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"please input Name!!!!!!!!");
            }
        }
        else
        {
           JOptionPane.showMessageDialog(null,"please input id!!!!!!!"); 
        }
    }//GEN-LAST:event_doneActionPerformed

    private void marriedcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marriedcheckboxActionPerformed
       unmarriedcheckbox.setSelected(false);
    }//GEN-LAST:event_marriedcheckboxActionPerformed

    private void unmarriedcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unmarriedcheckboxActionPerformed
        marriedcheckbox.setSelected(false);
    }//GEN-LAST:event_unmarriedcheckboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField agefield;
    public javax.swing.JComboBox<String> bloodgroupcombo;
    public javax.swing.JTextField contactnumfield;
    public javax.swing.JComboBox<String> departmentcombo;
    private javax.swing.JButton done;
    public javax.swing.JTextField emailfield;
    public javax.swing.JComboBox<String> facultycombo;
    public javax.swing.JComboBox<String> gendercombo;
    public javax.swing.JTextField idfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JCheckBox marriedcheckbox;
    public javax.swing.JTextField namefield;
    public javax.swing.JComboBox<String> religioncombo;
    public javax.swing.JCheckBox unmarriedcheckbox;
    // End of variables declaration//GEN-END:variables
}
