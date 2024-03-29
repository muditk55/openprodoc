/*
 * OpenProdoc
 * 
 * See the help doc files distributed with
 * this work for additional information regarding copyright ownership.
 * Joaquin Hierro licenses this file to You under:
 * 
 * License GNU GPL v3 http://www.gnu.org/licenses/gpl.html
 * 
 * you may not use this file except in compliance with the License.  
 * Unless agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * author: Joaquin Hierro      2011
 * 
 */

/*
 * MantUsers.java
 *
 * Created on 17-feb-2010, 21:16:33
 */

package prodocswing.forms;

import prodoc.DriverGeneric;
import prodoc.PDException;
import prodoc.PDServer;
import prodoc.Record;

/**
 *
 * @author jhierrot
 */
public class AboutOPD extends javax.swing.JDialog
{
private Record Reposit;
private boolean Cancel;

/** Creates new form ChangePassword
 * @param parent
 * @param modal 
 */
public AboutOPD(java.awt.Frame parent, boolean modal)
{
super(parent, modal);
initComponents();
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Title = new javax.swing.JLabel();
        Repository = new javax.swing.JLabel();
        Application = new javax.swing.JLabel();
        Engine = new javax.swing.JLabel();
        Author = new javax.swing.JLabel();
        ButtonAcept = new javax.swing.JButton();
        Repository1 = new javax.swing.JLabel();
        Application1 = new javax.swing.JLabel();
        Engine1 = new javax.swing.JLabel();
        Author1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Author2 = new javax.swing.JLabel();
        Author3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Title.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("OpenProdoc");

        Repository.setFont(MainWin.getFontDialog());
        Repository.setText("OPD Repository:");

        Application.setFont(MainWin.getFontDialog());
        Application.setText("OPD Swing:");

        Engine.setFont(MainWin.getFontDialog());
        Engine.setText("OPD Engine:");

        Author.setFont(MainWin.getFontDialog());
        Author.setText("Technical Design and Development:");

        ButtonAcept.setFont(MainWin.getFontDialog());
        ButtonAcept.setText(MainWin.TT("Ok"));
        ButtonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptActionPerformed(evt);
            }
        });

        Repository1.setFont(MainWin.getFontDialog());
        Repository1.setText(getServVersion());

        Application1.setFont(MainWin.getFontDialog());
        Application1.setText(MainWin.getVersion());

        Engine1.setFont(MainWin.getFontDialog());
        Engine1.setText(getEngineVersion());

        Author1.setFont(MainWin.getFontDialog());
        Author1.setText("Joaquín Hierro");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoProdoc.jpg"))); // NOI18N

        Author2.setFont(MainWin.getFontDialog());
        Author2.setText("log4j, commons-net.ftp, commons-fileupload:");

        Author3.setFont(MainWin.getFontDialog());
        Author3.setText("licence Apache Software Foundation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(ButtonAcept)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Engine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(Author, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Repository, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(Application, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Repository1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Engine1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(Application1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(Author1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addGap(24, 24, 24))))
                    .addComponent(Author2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Author3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Application, Engine, Repository});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addComponent(Logo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Repository)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Application)
                        .addGap(12, 12, 12)
                        .addComponent(Engine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Author))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Repository1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Application1)
                        .addGap(12, 12, 12)
                        .addComponent(Engine1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Author1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Author2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Author3)
                .addGap(18, 18, 18)
                .addComponent(ButtonAcept)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAceptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAceptActionPerformed
    {//GEN-HEADEREND:event_ButtonAceptActionPerformed
this.dispose();
    }//GEN-LAST:event_ButtonAceptActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
Cancel=true;
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Application;
    private javax.swing.JLabel Application1;
    private javax.swing.JLabel Author;
    private javax.swing.JLabel Author1;
    private javax.swing.JLabel Author2;
    private javax.swing.JLabel Author3;
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JLabel Engine;
    private javax.swing.JLabel Engine1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Repository;
    private javax.swing.JLabel Repository1;
    private javax.swing.JLabel Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
* @return the Cancel
*/
public boolean isCancel()
{
return Cancel;
}
//----------------------------------------------------------------
private String getServVersion()
{
try {
DriverGeneric PDSession=MainWin.getSession();
PDServer Serv=new PDServer(PDSession);
Serv.Load("Prodoc");
return(Serv.getVersion());
} catch (PDException ex)
    {
    return (ex.getLocalizedMessage());
    }
}
//----------------------------------------------------------------
private String getEngineVersion()
{
return(DriverGeneric.getVersion());
}
//----------------------------------------------------------------
}