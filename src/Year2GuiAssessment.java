

//Imports
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ray
 */


public class Year2GuiAssessment extends javax.swing.JFrame {

    String line = "";
    // Creates an array list call stats
    private ArrayList<ElectionStat> stats = new ArrayList<ElectionStat>();



    private Container contentPane = this.getContentPane();

    ValidationGui validationGui = new ValidationGui();


    /**
     * Creates new form FinalAssessment
     */
    public Year2GuiAssessment() {
        initComponents();  // calls InitComponents below
        this.setLocationRelativeTo(null); // Makes window launch in the centre
        setResizable(false); // Stops window from resizing
        init(); //calls init


        // This creates a window that gets the user to select the required csv file to import the data
        try {
            File selectedFile = null;

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(".\\"));

            int result = fileChooser.showOpenDialog(contentPane);

            if (result == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();

            }

// The scanner reads the selected file and adds the line to the Array list stats
            Scanner readFile = new Scanner(selectedFile);

            if (readFile.hasNextLine()) {
                readFile.nextLine(); //skips the headings
                readFile.nextLine();
            }

            // keeps reading the file while it has more lines
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();

                stats.add(new ElectionStat(line));
            }
//            readFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }


    }

    // searces through the arraylist for getArea and stores it in the string area
    public void init() {
//
        ArrayList<String> areaList = new ArrayList<String>();


        for (ElectionStat el : stats) {

            String area = el.getArea();

            if (!areaList.contains(area)) {
                areaList.add(area);
            }

        }


    }


    // Initialises all the components of the GUI
    // These were auto generated from the design I made in Netbeans GUI Builder
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        CentrePanel = new javax.swing.JPanel();
        DisplayAllPanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TabbedPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        AddNewPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        DeletePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        UpdateFile = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 28, 33));

        jPanel2.setBackground(new java.awt.Color(19, 28, 33));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nominations for Local Elections 2009");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(19, 28, 33));

        jButton1.setBackground(new java.awt.Color(19, 28, 33));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Display Candidates");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(19, 28, 33));
        jButton2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Add New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(19, 28, 33));
        jButton3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(19, 28, 33));
        jButton4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("Update File");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(19, 28, 33));
        jButton7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 153, 153));
        jButton7.setText("Display by Attribute");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CentrePanel.setLayout(new java.awt.CardLayout());

        DisplayAllPanel.setBackground(new java.awt.Color(19, 28, 33));

        jComboBox1.setBackground(new java.awt.Color(19, 28, 33));
        jComboBox1.setEditable(true);
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setFont(new java.awt.Font("0",0,24));

        // Sets the Electoral Areas in the comboBox1 drop down menu
        // These are hardcoded here to show how to do it but I have dynamically created the content in other combo boxes below

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Please Select", "Artane/Whitehall", "Ballyfermot/Drimnagh", "Ballymun/Finglas", "Cabra/Glasnevin", "Clontarf", "Crumlin/Kimmage", "Donaghmede", "North Inner City", "Pembroke/Rathmines", "South East Inner City", "South West Inner City"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(19, 28, 33));
        jButton5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });


        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Please use the DropDown Menu to select an Electorial area and then press Submit");

        jTextArea1.setBackground(new java.awt.Color(19, 28, 33));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 153, 153));
        jTextArea1.setRows(5);
        jTextArea1.setFont(new java.awt.Font("sansserif", 0, 26));
        jScrollPane8.setViewportView(jTextArea1);

        javax.swing.GroupLayout DisplayAllPanelLayout = new javax.swing.GroupLayout(DisplayAllPanel);
        DisplayAllPanel.setLayout(DisplayAllPanelLayout);
        DisplayAllPanelLayout.setHorizontalGroup(
                DisplayAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DisplayAllPanelLayout.createSequentialGroup()
                                .addGroup(DisplayAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(DisplayAllPanelLayout.createSequentialGroup()
                                                .addGap(267, 267, 267)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(122, 122, 122)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(DisplayAllPanelLayout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        DisplayAllPanelLayout.setVerticalGroup(
                DisplayAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DisplayAllPanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(DisplayAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        CentrePanel.add(DisplayAllPanel, "card3");

        TabbedPanel.setBackground(new java.awt.Color(19, 28, 33));

        jTabbedPane1.setBackground(new java.awt.Color(19, 28, 33));
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setOpaque(true);

        jTextArea2.setBackground(new java.awt.Color(19, 28, 33));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setFont((new java.awt.Font("0", 0, 24)));
        jTextArea2.setForeground((new java.awt.Color(0,153,153)));
        jScrollPane1.setViewportView(jTextArea2);

        jTabbedPane1.addTab("First Name", jScrollPane1);

        jTextArea3.setBackground(new java.awt.Color(19, 28, 33));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setFont((new java.awt.Font("0", 0, 24)));
        jTextArea3.setForeground((new java.awt.Color(0,153,153)));
        jScrollPane9.setViewportView(jTextArea3);

        jTabbedPane1.addTab("Last Name", jScrollPane9);

        jTextArea4.setBackground(new java.awt.Color(19, 28, 33));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setFont((new java.awt.Font("0", 0, 24)));
        jTextArea4.setForeground((new java.awt.Color(0,153,153)));
        jScrollPane10.setViewportView(jTextArea4);

        jTabbedPane1.addTab("Address", jScrollPane10);

        jTextArea5.setBackground(new java.awt.Color(19, 28, 33));
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setFont((new java.awt.Font("0", 0, 24)));
        jTextArea5.setForeground((new java.awt.Color(0,153,153)));
        jScrollPane11.setViewportView(jTextArea5);

        jTabbedPane1.addTab("Party", jScrollPane11);

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(19, 28, 33));
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setFont((new java.awt.Font("0", 0, 24)));
        jTextArea6.setForeground((new java.awt.Color(0,153,153)));
        jScrollPane12.setViewportView(jTextArea6);

        jTabbedPane1.addTab("Electoral Area", jScrollPane12);

        jLabel2.setBackground(new java.awt.Color(19, 28, 33));
        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Click on a tab to sort the list by the corresponding heading");

        javax.swing.GroupLayout TabbedPanelLayout = new javax.swing.GroupLayout(TabbedPanel);
        TabbedPanel.setLayout(TabbedPanelLayout);
        TabbedPanelLayout.setHorizontalGroup(
                TabbedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TabbedPanelLayout.createSequentialGroup()
                                .addGroup(TabbedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabbedPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jTabbedPane1))
                                        .addGroup(TabbedPanelLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        TabbedPanelLayout.setVerticalGroup(
                TabbedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabbedPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        CentrePanel.add(TabbedPanel, "card2");

        AddNewPanel.setBackground(new java.awt.Color(19, 28, 33));


        // Various labels used in the panels and cards.  Setting font size, colour, alignment and text

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Please fill out the details below and click submit to Add");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("First Name");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Last Name");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("House Number");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Dublin Regions");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Party");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Electorial Area");

        jTextField1.setEditable(true);
        jTextField1.setBackground(new java.awt.Color(19, 28, 33));
        jTextField1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 153, 153));

        jTextField2.setEditable(true);
        jTextField2.setBackground(new java.awt.Color(19, 28, 33));
        jTextField2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 153, 153));

        jTextField3.setEditable(true);
        jTextField3.setBackground(new java.awt.Color(19, 28, 33));
        jTextField3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 153, 153));

        jTextField4.setEditable(true);
        jTextField4.setBackground(new java.awt.Color(19, 28, 33));
        jTextField4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 153, 153));

        jComboBox2.setBackground(new java.awt.Color(19, 28, 33));
        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "25", "25"}));

        jComboBox3.setBackground(new java.awt.Color(19, 28, 33));
        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Fianna Fail", "Fine Gail", "Sinn Fein", "Labour Party", "Green Party", "People Before Profit", "Workers Party", "Non Party"}));

        jComboBox4.setBackground(new java.awt.Color(19, 28, 33));
        jComboBox4.setEditable(true);
        jComboBox4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Artane/Whitehall", "Ballyfermot/Drimnagh", "Ballymun/Finglas", "Cabra/Glasnevin", "Clontarf", "Crumlin/Kimmage", "Donaghmede", "North Inner City", "Pembroke/Rathmines", "South East Inner City", "South West Inner City"}));

        jButton6.setBackground(new java.awt.Color(19, 28, 33));
        jButton6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 153));
        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(19, 28, 33));
        jTextField7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 0, 0));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("");
        jTextField7.setBorder(null);

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Candidate ID");

        jTextField8.setEditable(true);
        jTextField8.setBackground(new java.awt.Color(19, 28, 33));
        jTextField8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout AddNewPanelLayout = new javax.swing.GroupLayout(AddNewPanel);
        AddNewPanel.setLayout(AddNewPanelLayout);
        AddNewPanelLayout.setHorizontalGroup(
                AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                                .addGap(108, 108, 108)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                                .addGap(142, 142, 142)
                                                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(177, 177, 177)
                                                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                                .addGap(506, 506, 506)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(90, Short.MAX_VALUE))
        );
        AddNewPanelLayout.setVerticalGroup(
                AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddNewPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110)
                                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)
                                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addGap(202, 202, 202))
        );

        CentrePanel.add(AddNewPanel, "card4");

        DeletePanel.setBackground(new java.awt.Color(19, 28, 33));

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Please Enter the ID of the Candidate that you would like to Delete ");

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Candidate ID");

//        jTextField5.setBackground(new java.awt.Color(19, 28, 33));
//        jTextField5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
//        jTextField5.setForeground(new java.awt.Color(0, 153, 153));
//        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(19, 28, 33));
        jTextField6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 0, 0));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("");
        jTextField6.setBorder(null);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select ID"}));
        jComboBox5.setFont(new java.awt.Font("0",0,24));

        jTextArea7.setBackground(new java.awt.Color(19, 28, 33));
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setForeground(new java.awt.Color(0, 153, 153));
        jTextArea7.setFont(new java.awt.Font("sansserif", 0, 24));
        jScrollPane3.setViewportView(jTextArea7);

        jButton8.setBackground(new java.awt.Color(19, 28, 33));
        jButton8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 153, 153));
        jButton8.setText("Submit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeletePanelLayout = new javax.swing.GroupLayout(DeletePanel);
        DeletePanel.setLayout(DeletePanelLayout);
        DeletePanelLayout.setHorizontalGroup(
                DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DeletePanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane3)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DeletePanelLayout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        DeletePanelLayout.setVerticalGroup(
                DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DeletePanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        CentrePanel.add(DeletePanel, "card5");

        UpdateFile.setBackground(new java.awt.Color(19, 28, 33));

        jLabel14.setText("Your File has been sucessfully updated");
        jLabel14.setFont(new java.awt.Font("sansserif", 0, 32));
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        javax.swing.GroupLayout UpdateFileLayout = new javax.swing.GroupLayout(UpdateFile);
        UpdateFile.setLayout(UpdateFileLayout);
        UpdateFileLayout.setHorizontalGroup(
                UpdateFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UpdateFileLayout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(263, Short.MAX_VALUE))
        );
        UpdateFileLayout.setVerticalGroup(
                UpdateFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UpdateFileLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(688, Short.MAX_VALUE))
        );

        CentrePanel.add(UpdateFile, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CentrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addComponent(CentrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1653, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1244, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Sets visability for the various panels depending on the button pressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton1) {

            DisplayAllPanel.setVisible(true);
            TabbedPanel.setVisible(false);
            AddNewPanel.setVisible(false);
            DeletePanel.setVisible(false);
            UpdateFile.setVisible(false);

        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton2) {

            DisplayAllPanel.setVisible(false);
            TabbedPanel.setVisible(false);
            AddNewPanel.setVisible(true);
            DeletePanel.setVisible(false);
            UpdateFile.setVisible(false);

        }
    }

    // ADD New Candidate functionality
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton3) {

            DisplayAllPanel.setVisible(false);
            TabbedPanel.setVisible(false);
            AddNewPanel.setVisible(false);
            DeletePanel.setVisible(true);
            UpdateFile.setVisible(false);

            jTextArea7.setText(" ");

            // adds the list of ids dynamically to the combobox
            // this is based on the ids directly taken from the CSV file
            ArrayList<String> list = new ArrayList<String>();
            for (ElectionStat el : stats) {

                String id = el.getId();


                if (!list.contains(id)) {
                    list.add(id);
                    jComboBox5.addItem(id);
                }
            }
//
//   Prints the array to the Text area
            for (ElectionStat el : stats) {

//                jTextArea7.setText(line);
                jTextArea7.setText(jTextArea7.getText() + el.toString());

            }
        }
    }

    // This method takes the CSV file, searches through it for the line containing the chosen candidate id.
    //  It then prints the entire file minus that chosen line to a new file called temp.csv
    // finally it deletes the old csv file and renames the temp.csv to the old file name.

    //  ********   This is not currently working as intended,  it is printing to the temp file without the line as required
    // but it cannot delete the old CSV file or rename the new one as it seems that the old file is being called or used somewhere else in the program and I couldnt find it in time
            public static void deleteLine (String path, String deleteTerm,int position, String delimiter){
                int pos = position - 1;
                String temp = "temp.csv";
                File oldFile = new File("DataProject.csv");
                File newFile = new File(temp);

                String currentLine;
                String data[];

                try {

                    FileWriter fw = new FileWriter(temp, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);

                    FileReader fr = new FileReader(path);
                    BufferedReader br = new BufferedReader(fr);

                    while ((currentLine = br.readLine()) != null) {
                        data = currentLine.split(",");
                        if (!(data[pos].equalsIgnoreCase(deleteTerm))) {
                            pw.println(currentLine);
                        }

                    }

                    oldFile.delete();
//                    System.out.println(result);
                    File dump = new File(path);
                    newFile.renameTo(dump);
//                    System.out.println(result2);

                    pw.flush();
                    pw.close();
                    fr.close();
                    br.close();
                    bw.close();
                    fw.close();

                } catch (Exception e) {
                    e.printStackTrace();

                }
            }


// updates the data by asking the user to select the csv file again and thus reloading the new data
    // Disposes of the old window and reloads the program
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton4) {
            dispose();
            new Year2GuiAssessment().setVisible(true);

            // This was causing duplication errors when I ran it as the contents of the old csv were interfeering with new one so I commented and went with the simple approach just above

//            jTextArea1.setText("");
//            DisplayAllPanel.setVisible(false);
//            TabbedPanel.setVisible(false);
//            AddNewPanel.setVisible(false);
//            DeletePanel.setVisible(false);
//            UpdateFile.setVisible(true);
//
//            try {
//                File selectedFile = null;
//
//                JFileChooser fileChooser = new JFileChooser();
//                fileChooser.setCurrentDirectory(new File(".\\"));
//
//                int result = fileChooser.showOpenDialog(contentPane);
//
//                if (result == JFileChooser.APPROVE_OPTION)
//                {
//                    selectedFile = fileChooser.getSelectedFile();
//
//                }
//
//
//
//                Scanner readFile = new Scanner(selectedFile);
//
//                if (readFile.hasNextLine()) {
//                    readFile.nextLine(); //skip the headings
//                    readFile.nextLine();
//                }
////            else System.out.println(" NOT reading file ");
//                while(readFile.hasNextLine())
//                {
//                    String line = readFile.nextLine();
//
//                    stats.add(new ElectionStat(line));
//                }
//            readFile.close();
//            }
//            catch(FileNotFoundException e)
//            {
//                e.printStackTrace();
//
//            }
//
////
//
        }
    }

// displays the chosen Electoral area based on the selection made in the combo box
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextArea1.setText("");
        if (evt.getSource() == jButton5){

            jTextArea1.setText(line);
                String area = (String)jComboBox1.getSelectedItem();
//            System.out.println(area);
                for (ElectionStat el : stats) {
                    if (el.getArea().equals(area)) {
//                        System.out.println("works");
                        jTextArea1.setText(jTextArea1.getText() + el.toString());

                    }
//                    else System.out.println("Entry not found");

                }
            }
        else
            {
                jTextArea1.setBackground(Color.red);
            }
        }


        // Add new candidate
    // validates every box individually and if they all pass then the csv file is appended with the new data

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)  {
        if (evt.getSource() == jButton6) {
//            ElectionStat el = new ElectionStat(line);

            if(validationGui.validateString(jTextField1.getText())) {
                if (validationGui.validateString(jTextField2.getText())) {
                    if(validationGui.validateHouseNumber(jTextField3.getText())){
                        if(validationGui.validateStringWithNumbers(jTextField4.getText())){
                            if(validationGui.validateID(jTextField8.getText())){
                                String addNewRow ="\n" + jTextField8.getText() + "," + jTextField2.getText() + "," + jTextField1.getText() + ",\"" + jTextField3.getText() + " "  + jTextField4.getText() + ",Dublin " + jComboBox2.getSelectedItem() +"\"," +jComboBox3.getSelectedItem() + "," + jComboBox4.getSelectedItem() + ",,,,,";
                                System.out.println(addNewRow);

                                try{
                                    String content = addNewRow;
                                    //Specify the file name and path here
                                    File file =new File("DataProject.csv");

                                    /* This logic is to create the file if the
                                     * file is not already present
                                     */
                                    if(!file.exists()){
                                        file.createNewFile();
                                    }

                                    FileWriter fw = new FileWriter("DataProject.csv",true);
                                    //BufferedWriter writer give better performance
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write(content);
                                    //Closing BufferedWriter Stream
                                    bw.close();
                                    fw.close();
//
                                    jTextField7.setForeground(new java.awt.Color(0, 153, 153));
                                   jTextField7.setText("New Candidate Sucessfully added, please Update File to see changes");

                                }catch(IOException ioe){
                                    System.out.println("Exception occurred:");
                                    ioe.printStackTrace();
                                }


//

                            }else {
                                jTextField7.setForeground(new java.awt.Color(255, 0, 0));
                                jTextField7.setText("Id must be a number and be between 1-999");
                            }
                        }else {
                            jTextField7.setForeground(new java.awt.Color(255, 0, 0));
                            jTextField7.setText("address must be less than 30 characters long");
                        }
                    }else {
                        jTextField7.setForeground(new java.awt.Color(255, 0, 0));
                        jTextField7.setText("House Numbers can only contain numbers and must be between 1-999");
                    }
                } else {
                    jTextField7.setForeground(new java.awt.Color(255, 0, 0));
                    jTextField7.setText("Surname cannot contain numbers and must be less than 20 characters long");

                }
            }else{
                jTextField7.setForeground(new java.awt.Color(255, 0, 0));
                jTextField7.setText("First name cannot contain numbers and must be less than 20 characters long");
            }
        }
    }


    // Tabbed view
    // This just displays the unsorted CSV file in all tabs,


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton7) {

            DisplayAllPanel.setVisible(false);
            TabbedPanel.setVisible(true);
            AddNewPanel.setVisible(false);
            DeletePanel.setVisible(false);
            UpdateFile.setVisible(false);
            jTextArea2.setText("");
            jTextArea3.setText("");
            jTextArea4.setText("");
            jTextArea5.setText("");
            jTextArea6.setText("");


           //  This should sort based on the switch statement in ElectionStat class but not curently working

            try {
//                Collections.sort(stats);
//                ArrayList<ElectionStat> tempList = (ArrayList<ElectionStat>) stats.clone();
//                ElectionStat.sort = 2;
//                Collections.sort(tempList);

                for (ElectionStat el : stats) {


                    jTextArea2.setText(jTextArea2.getText() + el.toString());

                }
            }catch (Exception e){

            }

            try {
//                Collections.sort(stats, Collections.reverseOrder());
                for (ElectionStat el : stats) {


                    jTextArea3.setText(jTextArea3.getText() + el.toString());

                }
            }catch (Exception e){

            }

            for (ElectionStat el : stats) {


                jTextArea4.setText(jTextArea4.getText() + el.toString());

            }

            for (ElectionStat el : stats) {


                jTextArea5.setText(jTextArea5.getText() + el.toString());

            }

            for (ElectionStat el : stats) {


                jTextArea6.setText(jTextArea6.getText() + el.toString());

            }

        }
    }
// Calls the deleteLine method when button is pressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton8) {

           deleteLine("DataProject.csv", jComboBox5.getSelectedItem().toString(), 1, ",");
        }
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
            java.util.logging.Logger.getLogger(Year2GuiAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Year2GuiAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Year2GuiAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Year2GuiAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Year2GuiAssessment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel AddNewPanel;
    private javax.swing.JPanel CentrePanel;
    private javax.swing.JPanel DeletePanel;
    private javax.swing.JPanel DisplayAllPanel;
    private javax.swing.JPanel TabbedPanel;
    private javax.swing.JPanel UpdateFile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration
}
