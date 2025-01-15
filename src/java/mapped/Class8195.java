// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.util.xml.SlickXMLException;
import java.io.InputStream;
import org.newdawn.slick.SlickException;
import javax.xml.parsers.DocumentBuilderFactory;

public class Class8195
{
    private static DocumentBuilderFactory field33717;
    
    public Class8017 method27140(final String s) throws SlickException {
        return this.method27141(s, Class8834.method30851(s));
    }
    
    public Class8017 method27141(final String str, final InputStream is) throws SlickXMLException {
        try {
            if (Class8195.field33717 == null) {
                Class8195.field33717 = DocumentBuilderFactory.newInstance();
            }
            return new Class8017(Class8195.field33717.newDocumentBuilder().parse(is).getDocumentElement());
        }
        catch (final Exception ex) {
            throw new Class2326("Failed to parse document: " + str, ex);
        }
    }
}
