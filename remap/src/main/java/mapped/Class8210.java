// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.SlickException;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;

public class Class8210
{
    private final Class7764 field33747;
    private final HashMap field33748;
    
    public Class8210(final String s, final String s2) throws SlickException {
        this.field33748 = new HashMap();
        this.field33747 = new Class7764(s, false, 2);
        try {
            final NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(Class8834.method30851(s2)).getElementsByTagName("sprite");
            for (int i = 0; i < elementsByTagName.getLength(); ++i) {
                final Element element = (Element)elementsByTagName.item(i);
                this.field33748.put(element.getAttribute("name"), this.field33747.method24836(Integer.parseInt(element.getAttribute("x")), Integer.parseInt(element.getAttribute("y")), Integer.parseInt(element.getAttribute("width")), Integer.parseInt(element.getAttribute("height"))));
            }
        }
        catch (final Exception ex) {
            throw new Class2324("Failed to parse sprite sheet XML", ex);
        }
    }
    
    public Class7764 method27202(final String key) {
        return this.field33748.get(key);
    }
}
