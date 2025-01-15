// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.SlickException;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.util.Properties;
import java.util.ArrayList;

public class Class8315
{
    public int field34156;
    public String field34157;
    public ArrayList field34158;
    public int field34159;
    public int field34160;
    public Properties field34161;
    public final /* synthetic */ Class5025 field34162;
    
    public Class8315(final Class5025 field34162, final Element element) throws SlickException {
        this.field34162 = field34162;
        this.field34157 = element.getAttribute("name");
        this.field34159 = Integer.parseInt(element.getAttribute("width"));
        this.field34160 = Integer.parseInt(element.getAttribute("height"));
        this.field34158 = new ArrayList();
        final Element element2 = (Element)element.getElementsByTagName("properties").item(0);
        if (element2 != null) {
            final NodeList elementsByTagName = element2.getElementsByTagName("property");
            if (elementsByTagName != null) {
                this.field34161 = new Properties();
                for (int i = 0; i < elementsByTagName.getLength(); ++i) {
                    final Element element3 = (Element)elementsByTagName.item(i);
                    this.field34161.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
                }
            }
        }
        final NodeList elementsByTagName2 = element.getElementsByTagName("object");
        for (int j = 0; j < elementsByTagName2.getLength(); ++j) {
            final Class9385 e = new Class9385(field34162, (Element)elementsByTagName2.item(j));
            e.field40267 = j;
            this.field34158.add(e);
        }
    }
}
