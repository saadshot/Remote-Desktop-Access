import Server.*;
import Client.*;

public class START_POINT extends javax.swing.JFrame {

    /**
     * Creates new form START_POINT
     */
    public START_POINT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        HOST = new javax.swing.JButton();
        CONTROL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SDP-REMOTE DESKTOP CONTROL(ALPHA)");

        HOST.setBackground(new java.awt.Color(0, 0, 0));
        HOST.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        HOST.setForeground(new java.awt.Color(255, 255, 255));
        HOST.setText("HOST YOUR PC");
        HOST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOSTActionPerformed(evt);
            }
        });

        CONTROL.setBackground(new java.awt.Color(0, 0, 0));
        CONTROL.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        CONTROL.setForeground(new java.awt.Color(255, 255, 255));
        CONTROL.setText("CONTROL OTHER PC");
        CONTROL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTROLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CONTROL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HOST, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(CONTROL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(HOST, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        setSize(new java.awt.Dimension(620, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void HOSTActionPerformed(java.awt.event.ActionEvent evt) {                                     
        this.dispose();
        start.main(new String [] {});
    }                                    

    private void CONTROLActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.dispose();
        Start.main(new String [] {});
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new START_POINT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CONTROL;
    private javax.swing.JButton HOST;
    // End of variables declaration                   
}
