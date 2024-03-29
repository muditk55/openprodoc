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
 * ListObjects.java
 *
 * Created on 12-feb-2010, 20:39:16
 */

package prodocswing.forms;

import javax.swing.JDialog;
import prodoc.Cursor;
import prodoc.PDDocs;
import prodoc.PDException;
import prodoc.Record;
import prodocswing.PDTableModel;

/**
 *
 * @author jhierrot
 */
public final class ListDocs extends javax.swing.JDialog
{
PDTableModel DocsList = new PDTableModel();
/**
 * 
 */
protected JDialog MantForm;
String TypeDocRestore="";
String FoldType=null;
private Cursor RetrievedFoldsCur=null;

/** Creates new form ListObjects
 * @param parent 
 * @param modal
 */
public ListDocs(JDialog parent, boolean modal)
{
super(parent, modal);
initComponents();
ObjectsTable.setAutoCreateRowSorter(true);
ObjectsTable.setAutoCreateColumnsFromModel(true);
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
        ObjectsTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        ModButton = new javax.swing.JButton();
        DelButton = new javax.swing.JButton();
        CheckoutButton = new javax.swing.JButton();
        CheckinButton = new javax.swing.JButton();
        CancelCheckoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("Search_Documents"));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ObjectsTable.setAutoCreateRowSorter(true);
        ObjectsTable.setFont(MainWin.getFontList());
        jScrollPane1.setViewportView(ObjectsTable);

        jToolBar1.setRollover(true);

        ModButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        ModButton.setToolTipText(MainWin.TT("Edit_Selected_Document"));
        ModButton.setFocusable(false);
        ModButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ModButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ModButton);

        DelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/del.png"))); // NOI18N
        DelButton.setToolTipText(MainWin.TT("Delete_Selected_Document"));
        DelButton.setFocusable(false);
        DelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DelButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(DelButton);

        CheckoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/checkout.png"))); // NOI18N
        CheckoutButton.setToolTipText(MainWin.TT("Checkout_Selected_Document"));
        CheckoutButton.setFocusable(false);
        CheckoutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CheckoutButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(CheckoutButton);

        CheckinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/checkin.png"))); // NOI18N
        CheckinButton.setToolTipText(MainWin.TT("Checkin_Selected_Document"));
        CheckinButton.setFocusable(false);
        CheckinButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CheckinButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CheckinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckinButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(CheckinButton);

        CancelCheckoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancelcheckout.png"))); // NOI18N
        CancelCheckoutButton.setToolTipText(MainWin.TT("Cancel_Checkout_Selected_Document"));
        CancelCheckoutButton.setFocusable(false);
        CancelCheckoutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CancelCheckoutButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CancelCheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelCheckoutButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(CancelCheckoutButton);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(MainWin.TT("Search_Results"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
{//GEN-HEADEREND:event_formWindowClosing
}//GEN-LAST:event_formWindowClosing

private void ModButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModButtonActionPerformed
if (getObjectsTable().getSelectedRow()==-1)
    return;
try {
Record r = DocsList.getElement(getSelectedRow());
String Id = (String) r.getAttr(PDDocs.fPDID).getValue();
String FType = (String) r.getAttr(PDDocs.fDOCTYPE).getValue();
PDDocs Doc = new PDDocs(MainWin.getSession(), FType);
DialogEditDoc DED = new DialogEditDoc(this, true);
DED.setLocationRelativeTo(null);
DED.EditMode();
Doc.LoadFull(Id);
DED.setRecord(Doc.getRecSum());
DED.setVisible(true);
if (DED.isCancel())
    return;
Doc.assignValues(DED.getRecord());
Doc.update();
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }    
}//GEN-LAST:event_ModButtonActionPerformed

private void DelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelButtonActionPerformed
if (getObjectsTable().getSelectedRow()==-1)
    return;
try {
Record r = DocsList.getElement(getSelectedRow());
String Id = (String) r.getAttr(PDDocs.fPDID).getValue();
String DType = (String) r.getAttr(PDDocs.fDOCTYPE).getValue();
PDDocs Doc = new PDDocs(MainWin.getSession(), DType);
DialogEditDoc DED = new DialogEditDoc(this, true);
DED.setLocationRelativeTo(null);
DED.DelMode();
Doc.LoadFull(Id);
DED.setRecord(Doc.getRecSum());
DED.setVisible(true);
if (DED.isCancel())
    return;
Doc.delete();
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}//GEN-LAST:event_DelButtonActionPerformed

private void CheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutButtonActionPerformed
if (getObjectsTable().getSelectedRow()==-1)
    return;
try {
Record r = DocsList.getElement(getSelectedRow());
String Id = (String) r.getAttr(PDDocs.fPDID).getValue();
String DType = (String) r.getAttr(PDDocs.fDOCTYPE).getValue();
PDDocs Doc = new PDDocs(MainWin.getSession(), DType);
Doc.setPDId(Id);
Doc.Checkout();
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}//GEN-LAST:event_CheckoutButtonActionPerformed

private void CheckinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckinButtonActionPerformed
if (getObjectsTable().getSelectedRow()==-1)
    return;
try {
Record r = DocsList.getElement(getSelectedRow());
String Id = (String) r.getAttr(PDDocs.fPDID).getValue();
String DType = (String) r.getAttr(PDDocs.fDOCTYPE).getValue();
PDDocs Doc = new PDDocs(MainWin.getSession(), DType);
Doc.setPDId(Id);
String VersionLabel=MainWin.DialogReadString(MainWin.TT("Creating_a_new_version_of_document"),
                                            MainWin.TT("Version_identifier"),
                                            MainWin.TT("Type_a_version_name_or_identifier"), "");
if (VersionLabel==null)
    return;
if (VersionLabel.length()==0)
    {
    MainWin.Message(MainWin.TT("Version_identifier_required"));
    return;
    }
Doc.Checkin(VersionLabel);
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}//GEN-LAST:event_CheckinButtonActionPerformed

private void CancelCheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelCheckoutButtonActionPerformed
if (getObjectsTable().getSelectedRow()==-1)
    return;
try {
Record r = DocsList.getElement(getSelectedRow());
String Id = (String) r.getAttr(PDDocs.fPDID).getValue();
String DType = (String) r.getAttr(PDDocs.fDOCTYPE).getValue();
PDDocs Doc = new PDDocs(MainWin.getSession(), DType);
Doc.setPDId(Id);
Doc.CancelCheckout();
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}//GEN-LAST:event_CancelCheckoutButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelCheckoutButton;
    private javax.swing.JButton CheckinButton;
    private javax.swing.JButton CheckoutButton;
    private javax.swing.JButton DelButton;
    private javax.swing.JButton ModButton;
    private javax.swing.JTable ObjectsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
    /**
     * 
     * @return
     */
    protected PDTableModel getPDTableModel()
{
return ((PDTableModel) getObjectsTable().getModel());
}
//----------------------------------------------------------------
    /**
     * 
     * @return
     */
    protected int getSelectedRow()
{
return (getObjectsTable().convertRowIndexToModel(getObjectsTable().getSelectedRow()));
}
//--------------------------------------------------------------------
/**
* @return the ObjectsTable
*/
protected javax.swing.JTable getObjectsTable()
{
return ObjectsTable;
}
//--------------------------------------------------------------------
/**
 * 
 */
protected void RefreshTable()
{
try {
DocsList = new PDTableModel();
DocsList.setDrv(MainWin.getSession());
PDDocs F=new PDDocs(MainWin.getSession(), FoldType);
DocsList.setListFields(F.getRecSum());
DocsList.setCursor(RetrievedFoldsCur);
getObjectsTable().setModel(DocsList);
} catch (PDException ex)
    {
    MainWin.Message(MainWin.TT("Error_assigning_columns_to_table")+":"+MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}
//--------------------------------------------------------------------
/**
 * 
 * @param pFoldType
 * @param C
 */
public void setCursor(String pFoldType, Cursor C)
{
FoldType=pFoldType;
RetrievedFoldsCur=C;
}
//----------------------------------------------------------------

}
