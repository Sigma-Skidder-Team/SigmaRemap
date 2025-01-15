// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.SlickException;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.util.Properties;

public class Class9385
{
    public int field40267;
    public String field40268;
    public String field40269;
    public int field40270;
    public int field40271;
    public int field40272;
    public int field40273;
    private String field40274;
    public Properties field40275;
    public final /* synthetic */ Class5025 field40276;
    
    public Class9385(final Class5025 field40276, final Element element) throws SlickException {
        this.field40276 = field40276;
        this.field40268 = element.getAttribute("name");
        this.field40269 = element.getAttribute("type");
        this.field40270 = Integer.parseInt(element.getAttribute("x"));
        this.field40271 = Integer.parseInt(element.getAttribute("y"));
        this.field40272 = Integer.parseInt(element.getAttribute("width"));
        this.field40273 = Integer.parseInt(element.getAttribute("height"));
        final Element element2 = (Element)element.getElementsByTagName("image").item(0);
        if (element2 != null) {
            this.field40274 = element2.getAttribute("source");
        }
        final Element element3 = (Element)element.getElementsByTagName("properties").item(0);
        if (element3 != null) {
            final NodeList elementsByTagName = element3.getElementsByTagName("property");
            if (elementsByTagName != null) {
                this.field40275 = new Properties();
                for (int i = 0; i < elementsByTagName.getLength(); ++i) {
                    final Element element4 = (Element)elementsByTagName.item(i);
                    this.field40275.setProperty(element4.getAttribute("name"), element4.getAttribute("value"));
                }
            }
        }
    }
}
