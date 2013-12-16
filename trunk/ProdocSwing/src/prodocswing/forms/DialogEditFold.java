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
 * DialogEditFold.java
 *
 * Created on 28-mar-2010, 20:14:35
 */

package prodocswing.forms;

import java.awt.Component;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.*;
import prodoc.*;
import prodocswing.ThesField;

/**
 *
 * @author jhierrot
 */
public class DialogEditFold extends javax.swing.JDialog
{

private Record Folder;
private boolean Cancel;
private boolean Modif=false;
private boolean Delete=false;
private boolean SetRecordFolderChanged=false;
private Vector InputFields=new Vector();
private HashSet AttrExcluded=new HashSet();


/** Creates new form DialogEditFold
 * @param parent
 * @param modal
 */
public DialogEditFold(JDialog parent, boolean modal)
{
super(parent, modal);
initComponents();
}
/** Creates new form DialogEditFold
 * @param parent
 * @param modal
 */
public DialogEditFold(JFrame parent, boolean modal)
{
super(parent, modal);
initComponents();
try {
PDFolders newFolder=new PDFolders(MainWin.getSession());
Folder=newFolder.getRecord();
setRecord(Folder);
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelOperation = new javax.swing.JLabel();
        LabelFoldType = new javax.swing.JLabel();
        FoldTypeCB = new javax.swing.JComboBox();
        Attributes = new javax.swing.JTabbedPane();
        AttrBasic = new javax.swing.JPanel();
        IdLabel = new javax.swing.JLabel();
        IdField = new javax.swing.JTextField();
        ACLDescripLabel = new javax.swing.JLabel();
        ACLComboBox = new javax.swing.JComboBox();
        TitleLabel = new javax.swing.JLabel();
        TitleTextField = new javax.swing.JTextField();
        ButtonAcept = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("Maintenance_Folders"));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        LabelOperation.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        LabelOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOperation.setText("jLabel1");

        LabelFoldType.setFont(MainWin.getFontDialog());
        LabelFoldType.setText(MainWin.TT("Folder_Type"));

        FoldTypeCB.setFont(MainWin.getFontDialog());
        FoldTypeCB.setModel(getComboModelFold());
        FoldTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoldTypeCBActionPerformed(evt);
            }
        });

        IdLabel.setFont(MainWin.getFontDialog());
        IdLabel.setText("Id");

        IdField.setEditable(false);
        IdField.setFont(MainWin.getFontDialog());
        IdField.setEnabled(false);

        ACLDescripLabel.setFont(MainWin.getFontDialog());
        ACLDescripLabel.setText(MainWin.TT("Folder_ACL"));

        ACLComboBox.setFont(MainWin.getFontDialog());
        ACLComboBox.setModel(getComboModel());

        TitleLabel.setFont(MainWin.getFontDialog());
        TitleLabel.setText(MainWin.TT("Title"));

        TitleTextField.setFont(MainWin.getFontDialog());

        javax.swing.GroupLayout AttrBasicLayout = new javax.swing.GroupLayout(AttrBasic);
        AttrBasic.setLayout(AttrBasicLayout);
        AttrBasicLayout.setHorizontalGroup(
            AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttrBasicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ACLDescripLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(IdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TitleTextField)
                    .addComponent(IdField)
                    .addComponent(ACLComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        AttrBasicLayout.setVerticalGroup(
            AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttrBasicLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdLabel))
                .addGap(18, 18, 18)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACLComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACLDescripLabel))
                .addGap(18, 18, 18)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleLabel))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        Attributes.addTab(MainWin.TT("Common_Attributes"), AttrBasic);

        ButtonAcept.setFont(MainWin.getFontDialog());
        ButtonAcept.setText(MainWin.TT("Ok"));
        ButtonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptActionPerformed(evt);
            }
        });

        ButtonCancel.setFont(MainWin.getFontDialog());
        ButtonCancel.setText(MainWin.TT("Cancel"));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(ButtonAcept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCancel)
                .addContainerGap())
            .addComponent(Attributes, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelFoldType, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FoldTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LabelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOperation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFoldType)
                    .addComponent(FoldTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Attributes, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancel)
                    .addComponent(ButtonAcept))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonCancelActionPerformed
    {//GEN-HEADEREND:event_ButtonCancelActionPerformed
Cancel=true;
this.dispose();
}//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonAceptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAceptActionPerformed
    {//GEN-HEADEREND:event_ButtonAceptActionPerformed
try {
if (!Delete)  
    {
    Attribute Attr = Folder.getAttr(PDFolders.fACL);
    Attr.setValue(ACLComboBox.getSelectedItem());
    Attr = Folder.getAttr(PDFolders.fFOLDTYPE);
    Attr.setValue(FoldTypeCB.getSelectedItem());
    Attr = Folder.getAttr(PDFolders.fTITLE);
    Attr.setValue(TitleTextField.getText());
    RetrieveFields(Folder, AttrExcluded, InputFields, Modif);
    }
Cancel = false;
this.dispose();
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
}//GEN-LAST:event_ButtonAceptActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
Cancel=true;
    }//GEN-LAST:event_formWindowClosed

    private void FoldTypeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoldTypeCBActionPerformed
try {
PDFolders newFolder = new PDFolders(MainWin.getSession(), (String) FoldTypeCB.getSelectedItem());
if (!SetRecordFolderChanged)
    {
    Folder=newFolder.getRecord();
    setRecord(Folder);
    }
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
    }//GEN-LAST:event_FoldTypeCBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ACLComboBox;
    private javax.swing.JLabel ACLDescripLabel;
    private javax.swing.JPanel AttrBasic;
    private javax.swing.JTabbedPane Attributes;
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JComboBox FoldTypeCB;
    private javax.swing.JTextField IdField;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel LabelFoldType;
    private javax.swing.JLabel LabelOperation;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField TitleTextField;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
 * Obtains a list of ACL
 * @return a DefaultComboModel with names of ACL
 */
private DefaultComboBoxModel getComboModel()
{
return(ListObjects.getComboModel("ACL"));
}
//----------------------------------------------------------------
/**
 * Obtains a list of clases of type folder allowed to the user
 * @return a DefaultComboModel with names of classes of folder
 */
private DefaultComboBoxModel getComboModelFold()
{
Vector VObjects=new Vector();
try {
DriverGeneric Session=MainWin.getSession();
PDObjDefs Obj = new PDObjDefs(Session);
Cursor CursorId = Obj.getListFold();
Record Res=Session.NextRec(CursorId);
while (Res!=null)
    {
    Attribute Attr=Res.getAttr(PDObjDefs.fNAME);
    VObjects.add(Attr.getValue());
    Res=Session.NextRec(CursorId);
    }
Session.CloseCursor(CursorId);
} catch (PDException ex)
    {
    MainWin.Message("Error"+ex.getLocalizedMessage());
    }
return(new DefaultComboBoxModel(VObjects));
}
//----------------------------------------------------------------
/**
 * sets the Form in mode Add
 * Disabling fields and changint literals
 */
public void AddMode()
{
LabelOperation.setText(MainWin.TT("Add_Folder"));
}
//----------------------------------------------------------------
/**
 * sets the Form in mode Edition
 * Disabling fields and changint literals
 */
public void EditMode()
{
LabelOperation.setText(MainWin.TT("Update_Folder"));
FoldTypeCB.setEnabled(false);
Modif=true;
}
//--------------------------------------------------------------
void DelMode()
{
LabelOperation.setText(MainWin.TT("Delete_Folder"));
FoldTypeCB.setEnabled(false);
TitleTextField.setEnabled(false);
ACLComboBox.setEnabled(false);
Modif=true;
Delete=true;
}
//----------------------------------------------------------------
/**
* @return the Folder edited
*/
public Record getRecord()
{
return Folder;
}
//----------------------------------------------------------------
/**
* @param pFolder the User to set
*/
public void setRecord(Record pFolder) throws PDException
{
Folder = pFolder;
AttrExcluded.clear();
Attribute Attr;
SetRecordFolderChanged=true;
Attr=Folder.getAttr(PDFolders.fFOLDTYPE); //-----------------------------
AttrExcluded.add(PDFolders.fFOLDTYPE);
LabelFoldType.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    FoldTypeCB.setSelectedItem((String)Attr.getValue());
FoldTypeCB.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
SetRecordFolderChanged=false;
Attr=Folder.getAttr(PDFolders.fPDID); //-----------------------------
AttrExcluded.add(PDFolders.fPDID);
IdLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    IdField.setText((String)Attr.getValue());
IdField.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Folder.getAttr(PDFolders.fACL); //-----------------------------
AttrExcluded.add(PDFolders.fACL);
ACLDescripLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ACLComboBox.setSelectedItem((String)Attr.getValue());
ACLComboBox.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Folder.getAttr(PDFolders.fTITLE); //-----------------------------
AttrExcluded.add(PDFolders.fTITLE);
TitleLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    TitleTextField.setText((String)Attr.getValue());
TitleTextField.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
if (!Modif)
    {
    AttrExcluded.add(ObjPD.fPDDATE);
    AttrExcluded.add(ObjPD.fPDAUTOR);
    }
AttrExcluded.add(PDFolders.fPARENTID);
Component[] List=Attributes.getComponents();
for (int i = 0; i < List.length; i++)
    {
    JPanel component =(JPanel) List[i];
    if (component!=this.AttrBasic)
        {
        Attributes.remove(component);
        }
    }
GenerateTabs(Folder, Attributes, 10, MainWin.TT("Other_Attributes"), AttrExcluded, Modif);
}
//----------------------------------------------------------------
/**
* @return the Cancel
*/
public boolean isCancel()
{
return Cancel;
}
//----------------------------------------------------------------
private void GenerateTabs(Record Rec, JTabbedPane Tabs, int MAXFIELDS, String Title, HashSet AttrExcluded, boolean Modif) throws PDException
{
InputFields.clear();
JPanel ActPanel=null;
GroupLayout layout= null;
int CountFields=0;
GroupLayout.SequentialGroup hGroup= null;
GroupLayout.SequentialGroup vGroup= null;
GroupLayout.ParallelGroup LGroup= null;
GroupLayout.ParallelGroup TGroup= null;
Rec.initList();
Attribute Attr=Rec.nextAttr();
while (Attr!=null)
    {
    if (!AttrExcluded.contains(Attr.getName()))
        {
        if (CountFields++%MAXFIELDS==0)
            {
            if (CountFields!=1)
                {
                hGroup.addGroup(LGroup);
                hGroup.addGroup(TGroup);
                layout.setHorizontalGroup(hGroup);
                layout.setVerticalGroup(vGroup);
                }
            ActPanel=new JPanel();
            ActPanel.setName(Title+(int)CountFields/MAXFIELDS);
            Tabs.add(ActPanel);
            layout = new GroupLayout(ActPanel);
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            hGroup = layout.createSequentialGroup();
            vGroup = layout.createSequentialGroup();
            LGroup=layout.createParallelGroup();
            TGroup=layout.createParallelGroup();
            ActPanel.setLayout(layout);
            }
        JLabel Lab=new JLabel(Attr.getUserName());
        Lab.setFont(MainWin.getFontDialog());
        JComponent JTF=genComponent(Attr, Modif);
        if (Delete)
            JTF.setEnabled(false);
        InputFields.add(JTF);
        LGroup.addComponent(Lab);
        TGroup.addComponent(JTF);
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Lab).addComponent(JTF));
        }
    Attr=Rec.nextAttr();
    }
if (CountFields==0)
    return;
hGroup.addGroup(LGroup);
hGroup.addGroup(TGroup);
layout.setHorizontalGroup(hGroup);
layout.setVerticalGroup(vGroup);
}
//----------------------------------------------------------------------
private void ShowEditList(java.awt.event.InputEvent evt)
{
AttrMultiEdit MultAttrDlg = new AttrMultiEdit(new javax.swing.JFrame(), true);
Attribute Attr=((DialogEditFold.MultiField)evt.getComponent()).getAttr();
MultAttrDlg.setAttr(Attr);
MultAttrDlg.setLocationRelativeTo(null);
MultAttrDlg.setVisible(true);
if (MultAttrDlg.isCancel())
    return;
((DialogEditFold.MultiField)evt.getComponent()).setText(Attr.Export());
}
//----------------------------------------------------------------------
/**
 *
 * @param Attr
 * @param Modif
 * @return
 */
private JComponent genComponent(Attribute Attr, boolean Modif) throws PDException
{
JComponent JTF=null;
if (Attr.isMultivalued())
    {
    JTF=new DialogEditFold.MultiField(Attr.Export());
    ((DialogEditFold.MultiField)JTF).setAttr(Attr);
    if (!(Delete || Modif&&!Attr.isModifAllowed()))
        {
        JTF.addKeyListener(
            new java.awt.event.KeyAdapter() 
            {
            public void keyTyped(java.awt.event.KeyEvent evt) 
            {
            ShowEditList(evt);
            }
            });
        JTF.addMouseListener(
            new java.awt.event.MouseAdapter() 
            {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            ShowEditList(evt);
            }
            }); 
        }
    }
else if (Attr.getType()==Attribute.tSTRING)
    {
    if (Attr.getValue()!=null)
        JTF=new JTextField((String)Attr.getValue());
    else
        JTF=new JTextField();
    }
else if (Attr.getType()==Attribute.tTHES)
    {
    PDThesaur UseTerm=new PDThesaur(MainWin.getSession());    
    if (Attr.getValue()!=null)
        UseTerm.Load((String)Attr.getValue());
    JTF=new ThesField(this, UseTerm, ""+Attr.getLongStr());
    }
else if (Attr.getType()==Attribute.tDATE)
    {
    JTF=new JFormattedTextField(MainWin.getFormatterDate());
    if (Attr.getValue()!=null)
        ((JFormattedTextField)JTF).setValue((Date)Attr.getValue());
    else
        ((JFormattedTextField)JTF).setValue(new Date());
    }
else if (Attr.getType()==Attribute.tTIMESTAMP)
    {
    JTF=new JFormattedTextField(MainWin.getFormatterTS());
    if (Attr.getValue()!=null)
        ((JFormattedTextField)JTF).setValue((Date)Attr.getValue());
    }
else if (Attr.getType()==Attribute.tBOOLEAN)
    {
    JCheckBox JCB=new JCheckBox( );
    if (Attr.getValue()!=null)
        {
        JCB.setSelected(((Boolean)Attr.getValue()).booleanValue());
        }
    JTF=JCB;
    }
else if (Attr.getType()==Attribute.tINTEGER)
    {
    JTF=new JFormattedTextField(new DecimalFormat("#######0"));
    if (Attr.getValue()!=null)
        ((JFormattedTextField)JTF).setValue((Integer)Attr.getValue());
    else
        ((JFormattedTextField)JTF).setValue((Integer)0);
    }
else
     JTF=new JTextField("Error, unimplemented field type");
//if (Delete || (Modif && (!Attr.isModifAllowed() || Attr.isPrimKey()) ) )
//    JTF.setEnabled(false);
if (Modif && !Attr.isModifAllowed())
    JTF.setEnabled(false);
if (Attr.getType()==Attribute.tDATE )
    JTF.setToolTipText(MainWin.DrvTT(Attr.getDescription()) +"( "+MainWin.getFormatDate()+" )");
else if(Attr.getType() == Attribute.tTIMESTAMP)
    JTF.setToolTipText(MainWin.DrvTT(Attr.getDescription()) +"( "+MainWin.getFormatTS()+" )");
else
    JTF.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
JTF.setFont(MainWin.getFontDialog());
return(JTF);
}
//--------------------------------------------------------------
/**
 *
 */
private void RetrieveFields(Record Rec, HashSet AttrExc, Vector CompList, boolean Modif) throws PDException
{
Rec.initList();
Attribute Attr=Rec.nextAttr();
int FieldNumber=0;
while (Attr!=null)
    {
    if (!AttrExc.contains(Attr.getName()))
        {
        FillAttr(Attr, (JComponent)CompList.get(FieldNumber++), Modif);
        }
    Attr=Rec.nextAttr();
    }
//MainWin.Message("Reg:"+Rec);
}
//--------------------------------------------------------------
/**
 * Fill the value of the attribute with the text o value of the fieldest1
 * @param Attr
 * @param jComponent
 */
private void FillAttr(Attribute Attr, JComponent JTF, boolean Modif) throws PDException
{
if (Modif && !Attr.isModifAllowed())
    return;
if (Attr.isMultivalued())
    return; /// we where editing directly values
if (Attr.getType()==Attribute.tSTRING)
    {
    Attr.setValue(((JTextField)JTF).getText());
    }
else if (Attr.getType()==Attribute.tTHES)
    {
    PDThesaur SelTerm=((ThesField)JTF).getUseTerm();
    if (SelTerm!=null)
        Attr.setValue(SelTerm.getPDId());
    }
else if (Attr.getType()==Attribute.tDATE)
    {
    Attr.setValue((Date)((JFormattedTextField)JTF).getValue());
    }
else if (Attr.getType()==Attribute.tTIMESTAMP)
    {
    Attr.setValue((Date)((JFormattedTextField)JTF).getValue());
    }
else if (Attr.getType()==Attribute.tBOOLEAN)
    {
    Boolean Act;
    if (((JCheckBox)JTF).isSelected())
        Act=true;
    else
        Act=false;
    Attr.setValue(Act);
    }
else if (Attr.getType()==Attribute.tINTEGER)
    {
//    Long l=(Long)((JFormattedTextField)JTF).getValue();
//    Attr.setValue(new Integer(l.intValue()));
    Attr.setValue(((JFormattedTextField)JTF).getValue());
    }
else
    Attr.setValue("Error");
}
//--------------------------------------------------------------
/**
 * Sets the acl in the combo
 * @param Acl
 */
public void setAcl(String Acl)
{
ACLComboBox.setSelectedItem(Acl);
}
//--------------------------------------------------------------
//=========================================
private class MultiField extends JTextField
{
private Attribute Attr;

public MultiField()
{
super();
this.setEditable(false);
}
//--------------------------------------------------------------
public MultiField(String Text)
{
super(Text);
this.setEditable(false);
}
//--------------------------------------------------------------
private void setAttr(Attribute pAttr)
{
Attr=pAttr;
}

/**
* @return the Attr
*/
public Attribute getAttr()
{
return Attr;
}
} //=========================================

}
