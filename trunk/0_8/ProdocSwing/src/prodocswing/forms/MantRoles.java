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

import prodoc.Attribute;
import prodoc.PDException;
import prodoc.PDRoles;
import prodoc.Record;

/**
 *
 * @author jhierrot
 */
public class MantRoles extends javax.swing.JDialog
{
private Record Role;
private boolean Cancel;

/** Creates new form MantUsers
 * @param parent 
 * @param modal
 */
public MantRoles(java.awt.Frame parent, boolean modal)
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
    private void initComponents()
    {

        LabelOperation = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        RoleNameTextField = new javax.swing.JTextField();
        DescriptionTextField = new javax.swing.JTextField();
        CreateACLCheck = new javax.swing.JCheckBox();
        ModifyACLCheck = new javax.swing.JCheckBox();
        CreateUserCheck = new javax.swing.JCheckBox();
        ModifyUserCheck = new javax.swing.JCheckBox();
        CreateGroupCheck = new javax.swing.JCheckBox();
        ModifyGroupCheck = new javax.swing.JCheckBox();
        CreateRoleCheck = new javax.swing.JCheckBox();
        ModifyRoleCheck = new javax.swing.JCheckBox();
        CreateObjectCheck = new javax.swing.JCheckBox();
        ModifyObjectCheck = new javax.swing.JCheckBox();
        CreateReposCheck = new javax.swing.JCheckBox();
        ModifyReposCheck = new javax.swing.JCheckBox();
        CreateFoldCheck = new javax.swing.JCheckBox();
        ModifyFoldCheck = new javax.swing.JCheckBox();
        CreateDocCheck = new javax.swing.JCheckBox();
        ModifyDocCheck = new javax.swing.JCheckBox();
        CreateMimeCheck = new javax.swing.JCheckBox();
        ModifyMimeCheck = new javax.swing.JCheckBox();
        CreateThesCheck = new javax.swing.JCheckBox();
        ModifyThesCheck = new javax.swing.JCheckBox();
        ButtonAcept = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("Roles_Maintenance"));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        LabelOperation.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        LabelOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOperation.setText("jLabel1");

        UserNameLabel.setFont(MainWin.getFontDialog());
        UserNameLabel.setText("jLabel1");

        DescriptionLabel.setFont(MainWin.getFontDialog());
        DescriptionLabel.setText("jLabel1");

        RoleNameTextField.setFont(MainWin.getFontDialog());

        DescriptionTextField.setFont(MainWin.getFontDialog());

        CreateACLCheck.setFont(MainWin.getFontDialog());
        CreateACLCheck.setText("CACL");
        CreateACLCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyACLCheck.setFont(MainWin.getFontDialog());
        ModifyACLCheck.setText("MACL");

        CreateUserCheck.setFont(MainWin.getFontDialog());
        CreateUserCheck.setText("CUser");
        CreateUserCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyUserCheck.setFont(MainWin.getFontDialog());
        ModifyUserCheck.setText("MUser");

        CreateGroupCheck.setFont(MainWin.getFontDialog());
        CreateGroupCheck.setText("CGroup");
        CreateGroupCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyGroupCheck.setFont(MainWin.getFontDialog());
        ModifyGroupCheck.setText("MGroup");

        CreateRoleCheck.setFont(MainWin.getFontDialog());
        CreateRoleCheck.setText("CRole");
        CreateRoleCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyRoleCheck.setFont(MainWin.getFontDialog());
        ModifyRoleCheck.setText("MRole");

        CreateObjectCheck.setFont(MainWin.getFontDialog());
        CreateObjectCheck.setText("CObject");
        CreateObjectCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyObjectCheck.setFont(MainWin.getFontDialog());
        ModifyObjectCheck.setText("MObject");

        CreateReposCheck.setFont(MainWin.getFontDialog());
        CreateReposCheck.setText("CRepos");
        CreateReposCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyReposCheck.setFont(MainWin.getFontDialog());
        ModifyReposCheck.setText("MRepos");

        CreateFoldCheck.setFont(MainWin.getFontDialog());
        CreateFoldCheck.setText("CFold");
        CreateFoldCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyFoldCheck.setFont(MainWin.getFontDialog());
        ModifyFoldCheck.setText("MFold");

        CreateDocCheck.setFont(MainWin.getFontDialog());
        CreateDocCheck.setText("CDoc");
        CreateDocCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyDocCheck.setFont(MainWin.getFontDialog());
        ModifyDocCheck.setText("MDoc");

        CreateMimeCheck.setFont(MainWin.getFontDialog());
        CreateMimeCheck.setText("CMime");
        CreateMimeCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyMimeCheck.setFont(MainWin.getFontDialog());
        ModifyMimeCheck.setText("MMime");

        CreateThesCheck.setFont(MainWin.getFontDialog());
        CreateThesCheck.setText("CThes");
        CreateThesCheck.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        ModifyThesCheck.setFont(MainWin.getFontDialog());
        ModifyThesCheck.setText("MThes");

        ButtonAcept.setFont(MainWin.getFontDialog());
        ButtonAcept.setText(MainWin.TT("Ok"));
        ButtonAcept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAceptActionPerformed(evt);
            }
        });

        ButtonCancel.setFont(MainWin.getFontDialog());
        ButtonCancel.setText(MainWin.TT("Cancel"));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                        .addContainerGap(74, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreateDocCheck)
                            .addComponent(CreateFoldCheck)
                            .addComponent(CreateReposCheck)
                            .addComponent(CreateMimeCheck)
                            .addComponent(CreateGroupCheck)
                            .addComponent(CreateRoleCheck)
                            .addComponent(CreateObjectCheck)
                            .addComponent(CreateUserCheck)
                            .addComponent(CreateACLCheck)
                            .addComponent(CreateThesCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModifyThesCheck)
                            .addComponent(ModifyMimeCheck)
                            .addComponent(ModifyACLCheck)
                            .addComponent(ModifyUserCheck)
                            .addComponent(ModifyRoleCheck)
                            .addComponent(ModifyGroupCheck)
                            .addComponent(ModifyObjectCheck)
                            .addComponent(ModifyFoldCheck)
                            .addComponent(ModifyDocCheck)
                            .addComponent(ModifyReposCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonAcept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonCancel)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOperation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateACLCheck)
                    .addComponent(ModifyACLCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateUserCheck)
                    .addComponent(ModifyUserCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateGroupCheck)
                    .addComponent(ModifyGroupCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateRoleCheck)
                    .addComponent(ModifyRoleCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateObjectCheck)
                    .addComponent(ModifyObjectCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateReposCheck)
                    .addComponent(ModifyReposCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateFoldCheck)
                    .addComponent(ModifyFoldCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateDocCheck)
                    .addComponent(ModifyDocCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateMimeCheck)
                    .addComponent(ModifyMimeCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateThesCheck)
                    .addComponent(ModifyThesCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancel)
                    .addComponent(ButtonAcept))
                .addGap(32, 32, 32))
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
Attribute Attr=Role.getAttr(PDRoles.fNAME);
Attr.setValue(RoleNameTextField.getText());
Attr=Role.getAttr(PDRoles.fDESCRIPTION);
Attr.setValue(DescriptionTextField.getText());
Boolean Act;
Attr=Role.getAttr(PDRoles.fALLOWCREATEACL); //-----
if (CreateACLCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINACL);
if (ModifyACLCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATEDOC); //-----
if (CreateDocCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINDOC);
if (ModifyDocCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATEFOLD); //-----
if (CreateFoldCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINFOLD);
if (ModifyFoldCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATEGROUP); //-----
if (CreateGroupCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINGROUP);
if (ModifyGroupCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATEMIME); //-----
if (CreateMimeCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINMIME);
if (ModifyMimeCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATEOBJECT); //-----
if (CreateObjectCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINOBJECT);
if (ModifyObjectCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATEREPOS); //-----
if (CreateReposCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINREPOS);
if (ModifyReposCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATEROLE); //-----
if (CreateRoleCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINROLE);
if (ModifyRoleCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATEUSER); //-----
if (CreateUserCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINUSER);
if (ModifyUserCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWCREATETHESAUR); //-----
if (CreateThesCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINTHESAUR);
if (ModifyThesCheck.isSelected())
    Act=true;
else
    Act=false;
Attr.setValue(Act);
this.dispose();
} catch (PDException ex)
    {
    MainWin.Message(MainWin.DrvTT(ex.getLocalizedMessage()));
    }
    }//GEN-LAST:event_ButtonAceptActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
Cancel=true;
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JCheckBox CreateACLCheck;
    private javax.swing.JCheckBox CreateDocCheck;
    private javax.swing.JCheckBox CreateFoldCheck;
    private javax.swing.JCheckBox CreateGroupCheck;
    private javax.swing.JCheckBox CreateMimeCheck;
    private javax.swing.JCheckBox CreateObjectCheck;
    private javax.swing.JCheckBox CreateReposCheck;
    private javax.swing.JCheckBox CreateRoleCheck;
    private javax.swing.JCheckBox CreateThesCheck;
    private javax.swing.JCheckBox CreateUserCheck;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JLabel LabelOperation;
    private javax.swing.JCheckBox ModifyACLCheck;
    private javax.swing.JCheckBox ModifyDocCheck;
    private javax.swing.JCheckBox ModifyFoldCheck;
    private javax.swing.JCheckBox ModifyGroupCheck;
    private javax.swing.JCheckBox ModifyMimeCheck;
    private javax.swing.JCheckBox ModifyObjectCheck;
    private javax.swing.JCheckBox ModifyReposCheck;
    private javax.swing.JCheckBox ModifyRoleCheck;
    private javax.swing.JCheckBox ModifyThesCheck;
    private javax.swing.JCheckBox ModifyUserCheck;
    private javax.swing.JTextField RoleNameTextField;
    private javax.swing.JLabel UserNameLabel;
    // End of variables declaration//GEN-END:variables

/**
*
*/
public void AddMode()
{
LabelOperation.setText(MainWin.TT("Add_Role"));
}
//----------------------------------------------------------------
/**
*
*/
public void DelMode()
{
LabelOperation.setText(MainWin.TT("Delete_Role"));
RoleNameTextField.setEditable(false);
DescriptionTextField.setEditable(false);
CreateACLCheck.setEnabled(false);
ModifyACLCheck.setEnabled(false);
CreateDocCheck.setEnabled(false);
ModifyDocCheck.setEnabled(false);
CreateFoldCheck.setEnabled(false);
ModifyFoldCheck.setEnabled(false);
CreateGroupCheck.setEnabled(false);
ModifyGroupCheck.setEnabled(false);
CreateMimeCheck.setEnabled(false);
ModifyMimeCheck.setEnabled(false);
CreateObjectCheck.setEnabled(false);
ModifyObjectCheck.setEnabled(false);
CreateReposCheck.setEnabled(false);
ModifyReposCheck.setEnabled(false);
CreateRoleCheck.setEnabled(false);
ModifyRoleCheck.setEnabled(false);
CreateUserCheck.setEnabled(false);
ModifyUserCheck.setEnabled(false);
CreateThesCheck.setEnabled(false);
ModifyThesCheck.setEnabled(false);
}
//----------------------------------------------------------------
/**
*
*/
public void EditMode()
{
LabelOperation.setText(MainWin.TT("Update_Role"));
RoleNameTextField.setEditable(false);
}
//----------------------------------------------------------------
/**
*
*/
public void CopyMode()
{
LabelOperation.setText(MainWin.TT("Copy_Role"));
RoleNameTextField.setText(RoleNameTextField.getText()+"1");
}
//----------------------------------------------------------------
/**
* @return the User
*/
public Record getRecord()
{
return Role;
}
//----------------------------------------------------------------
/**
* @param pUser the User to set
*/
public void setRecord(Record pUser)
{
Role = pUser;
Attribute Attr=Role.getAttr(PDRoles.fNAME);
UserNameLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    RoleNameTextField.setText((String)Attr.getValue());
RoleNameTextField.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fDESCRIPTION);
DescriptionLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    DescriptionTextField.setText((String)Attr.getValue());
DescriptionTextField.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEACL);  //--------------
CreateACLCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateACLCheck.setSelected((Boolean)Attr.getValue());
CreateACLCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINACL);
ModifyACLCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyACLCheck.setSelected((Boolean)Attr.getValue());
ModifyACLCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEDOC);  //--------------
CreateDocCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateDocCheck.setSelected((Boolean)Attr.getValue());
CreateDocCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINDOC);
ModifyDocCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyDocCheck.setSelected((Boolean)Attr.getValue());
ModifyDocCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEFOLD);  //--------------
CreateFoldCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateFoldCheck.setSelected((Boolean)Attr.getValue());
CreateFoldCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINFOLD);
ModifyFoldCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyFoldCheck.setSelected((Boolean)Attr.getValue());
ModifyFoldCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEGROUP);  //--------------
CreateGroupCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateGroupCheck.setSelected((Boolean)Attr.getValue());
CreateGroupCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINGROUP);
ModifyGroupCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyGroupCheck.setSelected((Boolean)Attr.getValue());
ModifyGroupCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEMIME);  //--------------
CreateMimeCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateMimeCheck.setSelected((Boolean)Attr.getValue());
CreateMimeCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINMIME);
ModifyMimeCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyMimeCheck.setSelected((Boolean)Attr.getValue());
ModifyMimeCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEOBJECT);  //--------------
CreateObjectCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateObjectCheck.setSelected((Boolean)Attr.getValue());
CreateObjectCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINOBJECT);
ModifyObjectCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyObjectCheck.setSelected((Boolean)Attr.getValue());
ModifyObjectCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEREPOS);  //--------------
CreateReposCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateReposCheck.setSelected((Boolean)Attr.getValue());
CreateReposCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINREPOS);
ModifyReposCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyReposCheck.setSelected((Boolean)Attr.getValue());
ModifyReposCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEROLE);  //--------------
CreateRoleCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateRoleCheck.setSelected((Boolean)Attr.getValue());
CreateRoleCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINROLE);
ModifyRoleCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyRoleCheck.setSelected((Boolean)Attr.getValue());
ModifyRoleCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATEUSER);  //--------------
CreateUserCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateUserCheck.setSelected((Boolean)Attr.getValue());
CreateUserCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINUSER);
ModifyUserCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyUserCheck.setSelected((Boolean)Attr.getValue());
ModifyUserCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWCREATETHESAUR);  //--------------
CreateThesCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    CreateThesCheck.setSelected((Boolean)Attr.getValue());
CreateThesCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=Role.getAttr(PDRoles.fALLOWMAINTAINTHESAUR);
ModifyThesCheck.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ModifyThesCheck.setSelected((Boolean)Attr.getValue());
ModifyThesCheck.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
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
}
