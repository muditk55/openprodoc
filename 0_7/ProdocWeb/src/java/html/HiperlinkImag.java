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

package html;

import javax.servlet.http.*;

/**
 *
 * @author jhierrot
 */
public class HiperlinkImag extends Image
{
private String Url="";
private String Texto="";
private String CSSClass=null;
private String Target=null;
    
/** Creates a new instance of HiperlinkImag */
public HiperlinkImag(String pUrlImag, String pTextAlt, String pUrl, String pTexto)
{
super(pUrlImag, pTextAlt);
Url=pUrl; 
Texto=pTexto;
}
//-----------------------------------------------------------------------------------------------
public String ToHtml(HttpSession Sess)
{
String retVal="<a href=\""+Url+ "\" ";
if (Target!=null)
    retVal+="target=\""+Target+ "\" ";    
retVal+=">"+super.ToHtml(Sess)
       +((getCSSClass()!=null)?(" class=\""+getCSSClass()+"\" "):"")
       +((Texto!=null && Texto.length()!=0)?"&nbsp;"+Texto:"")
       +"</a>";
return(retVal);
}
//-----------------------------------------------------------------------------------------------
/**
* @return the CSSClass
*/
public String getCSSClass()
{
return CSSClass;
}
//-----------------------------------------------------------------------------------------------
/**
* @param CSSClass the CSSClass to set
*/
@Override
public void setCSSClass(String CSSClass)
{
this.CSSClass = CSSClass;
}
//-----------------------------------------------------------------------------------------------
public String getTarget()
{
return Target;
}
//-----------------------------------------------------------------------------------------------
public void setTarget(String pTarget)
{
Target = pTarget;
}
//-----------------------------------------------------------------------------------------------
    
}
