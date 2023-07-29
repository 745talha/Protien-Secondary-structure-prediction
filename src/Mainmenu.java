
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
//import java.awt.Graphics;
//import java.awt.Image;
//import javax.swing.ImageIcon;


public class Mainmenu extends javax.swing.JFrame {
    
    
    public Mainmenu() {
        
        initComponents();
    }
    
    public void seqcompare()
    {
        panel1.setVisible(false);
        panel2.setVisible(true);
        String get=textarea1.getText();
         String input = get.replaceAll("\\s+", "");
        String inputu=input.toUpperCase();
        
        int len = inputu.length();
     
        char[] seq= new char[len];
    
       for (int i = 0; i < len; i++) { 
            seq[i] = inputu.charAt(i); 
        } 
          
        
        char[] seq2= new char[len];
        for(int i=0;i<len;i++)
	{
		switch(seq[i])
		{
                    case 'A':
                        seq2[i]='H';
		 	break;
		 	
		 case 'R':
                     seq2[i]='H';
                     break;
		 	
		case 'N':
                    seq2[i]='T';
                    break;
		 	
		case 'D':
                    seq2[i]='T';
                    break;
		 	
		case 'C':
                    seq2[i]='T';
                    break;
		 	
		case 'E':
                    seq2[i]='H';
                    break;
		 	
		case 'Q':
                    seq2[i]='H';
                    break;
		 	
		case 'G':
                    seq2[i]='T';
                    break;
		 	
		case 'H':
                    seq2[i]='H';
                    break;
		 	
		case 'I':
                    seq2[i]='E';
                    break;
		 	
		case 'L':
                    seq2[i]='E';
                    break;
		 	
		case 'K':
                    seq2[i]='H';
                    break;
		 	
		case 'M':
                    seq2[i]='H';
                    break;
		 	
		case 'F':
                    seq2[i]='E';
                    break;
		 	
		case 'P':
                    seq2[i]='T';
                    break;
		 	
		case 'S':
                    seq2[i]='T';
                    break;
		 	
		case 'T':
                    seq2[i]='E';
                    break;
		 	
		case 'W':
                    seq2[i]='E';
                    break;
		 	
		case 'Y':
                    seq2[i]='E';
                    break;
		 	
		case 'V':
                    seq2[i]='E';
                    break; 	 	
		}
	}
        String str2 = String.valueOf(seq2);
       
        
       
        structure.setText(str2);
        int length= seq2.length;
        //full  Structure
        String fullstruct="";
        String turns="";
        String helix="";
        String sheet="";
        String printlen=String.valueOf(length);
        lengthbox.setText(printlen);
        int hc=0,sc=0,tc=0;
 	for(int i=0;i<length;i++)
	{
            int k=0;
            if(i<=length-4)
            {
                if(seq2[i]=='H'&&seq2[i+1]=='H'&&seq2[i+2]=='H'&&seq2[i+3]=='H')
		{
                    
                    fullstruct=fullstruct+"<Helix>";
                     turns=turns+"_ _ _ _";
                     helix=helix+"Helix";
                     sheet=sheet+"_ _ _ _";
                    i=i+3;
                    k++;
                    hc++;
		}
                else if(seq2[i]=='T'&&seq2[i+1]=='T'&&seq2[i+2]=='T'&&seq2[i+3]=='T')
		{
                 
                    fullstruct=fullstruct+"<Turn>";
                     turns=turns+"Turn";
                     helix=helix+"_ _ _ _";
                     sheet=sheet+"_ _ _ _";
                    i=i+3;
                    k++;
                    tc++;
		}
                
            }
            if(i<=length-3)
            {
                if(seq2[i]=='E'&&seq2[i+1]=='E'&&seq2[i+2]=='E')
		{
                   
                    fullstruct=fullstruct+"<Beta Sheet>";
                    turns=turns+"_ _ _";
                    helix=helix+"_ _ _";
                    sheet=sheet+"Sheet";
                    i=i+2;
                    k++;
                    sc++;
		}
            }
            if(k==0)
            {
               
                fullstruct=fullstruct+"C";
                turns=turns+" _ ";
                helix=helix+" _ ";
                sheet=sheet+" _ ";
            }
	}
        fullstructurebox.setText(fullstruct);
        turnsbox.setText(turns);
        helixbox.setText(helix);
        sheetbox.setText(sheet);
        String shc=String.valueOf(hc);
        String ssc=String.valueOf(sc);
        String stc=String.valueOf(tc);
        helixc.setText(shc);
        sheetc.setText(ssc);
        turnc.setText(stc);
        
        
    }
  public int validity()
  {
      String data=textarea1.getText();
      String val = data.toUpperCase();
      
       int len = val.length();
        char[] vseq= new char[len];
       for (int i = 0; i < len; i++) 
       { 
            vseq[i] = val.charAt(i); 
       } 
       int ret=0;
       int k =1;
      for(int i=0;i<len;i++)
      {
          
          switch(vseq[i])
          {
              case 'A':
                  k++;
                  break;
		 
              case 'R':
                  k++;
                  break;
		 	
		case 'N':
                    k++;
                    break;
		 	
		case 'D':
                    k++;
                    break;
		 	
		case 'C':
                    k++;
                    break;
		 	
		case 'E':
                    k++;
                    break;
		 	
		case 'Q':
                    k++;
                    break;
		 	
		case 'G':
                    k++;
                    break;
		 	
		case 'H':
                    k++;
                    break;
		 	
		case 'I':
                    k++;
                    break;
		 	
		case 'L':
                    k++;
                    break;
		 	
		case 'K':
                    k++;
                    break;
		 	
		case 'M':
                    k++;
                    break;
		 	
		case 'F':
                    k++;
                    break;
		 	
		case 'P':
                    k++;
                    break;
		 	
		case 'S':
                    k++;
                    break;
		 	
		case 'T':
                    k++;
                    break;
		 	
		case 'W':
                    k++;
                    break;
		 	
		case 'Y':
                    k++;
                    break;
		 	
		case 'V':
                    k++;
                    break; 	 	
		}
         
      }
      if(k==len)
      {
          ret++;
      }
      return ret;
  }
  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        structure = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fullstructurebox = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lengthbox = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        helixbox = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        sheetbox = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        turnsbox = new javax.swing.JTextArea();
        backbutton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        helixc = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        turnc = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        sheetc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("<html>PROTIEN SECONDARY STRUCTURE  <br> &nbsp;  &emsp   &emsp &emsp  PREDICTION</html>");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 22)); // NOI18N
        jLabel2.setText("Enter or paste Protien sequence");

        textarea1.setColumns(20);
        textarea1.setRows(5);
        jScrollPane1.setViewportView(textarea1);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 22)); // NOI18N
        jLabel3.setText("or upload a file(txt) : ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Browse...");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Enter");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(panel1);

        structure.setEditable(false);
        structure.setColumns(20);
        jScrollPane2.setViewportView(structure);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel4.setText("Structure");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel5.setText("Full structure");

        fullstructurebox.setEditable(false);
        fullstructurebox.setColumns(20);
        jScrollPane3.setViewportView(fullstructurebox);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel6.setText("Sequence length");

        lengthbox.setEditable(false);
        lengthbox.setBackground(new java.awt.Color(240, 240, 240));
        lengthbox.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        jScrollPane4.setViewportView(lengthbox);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel7.setText("Alpha Helix");

        helixbox.setEditable(false);
        helixbox.setColumns(20);
        jScrollPane5.setViewportView(helixbox);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setText("Beta Sheet");

        sheetbox.setEditable(false);
        sheetbox.setColumns(20);
        jScrollPane6.setViewportView(sheetbox);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel9.setText("Turns");

        turnsbox.setEditable(false);
        turnsbox.setColumns(20);
        jScrollPane7.setViewportView(turnsbox);

        backbutton.setForeground(new java.awt.Color(240, 240, 240));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton_28x54.png"))); // NOI18N
        backbutton.setBorderPainted(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel10.setText("Result");

        helixc.setEditable(false);
        helixc.setBackground(new java.awt.Color(240, 240, 240));
        helixc.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        jScrollPane9.setViewportView(helixc);

        turnc.setEditable(false);
        turnc.setBackground(new java.awt.Color(240, 240, 240));
        turnc.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        jScrollPane10.setViewportView(turnc);

        sheetc.setEditable(false);
        sheetc.setBackground(new java.awt.Color(240, 240, 240));
        sheetc.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        jScrollPane11.setViewportView(sheetc);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9)
                                .addComponent(jLabel5)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(231, 231, 231)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(panel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
       
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        try
        {
            FileReader reader =new FileReader(filename);
            BufferedReader br=  new BufferedReader(reader);
  
            textarea1.read(br,null);
            br.close();
            textarea1.requestFocus();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        String chk=textarea1.getText();
        if(chk.equals(""))
        {
          
              JOptionPane.showMessageDialog(this,"Text Area is Empty","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else if(validity()==1)
        {
            JOptionPane.showMessageDialog(this,"Invalid Input","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            seqcompare();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        textarea1.setText("");
        panel1.setVisible(true);
        panel2.setVisible(false);
    }//GEN-LAST:event_backbuttonActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JTextArea fullstructurebox;
    private javax.swing.JTextArea helixbox;
    private javax.swing.JTextArea helixc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea lengthbox;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextArea sheetbox;
    private javax.swing.JTextArea sheetc;
    private javax.swing.JTextArea structure;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextArea turnc;
    private javax.swing.JTextArea turnsbox;
    // End of variables declaration//GEN-END:variables
}
