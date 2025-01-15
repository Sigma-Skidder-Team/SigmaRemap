// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.EntityResolver;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import org.newdawn.slick.SlickException;
import java.util.ArrayList;

public class Class8812 implements Class8813
{
    public static int field37020;
    private static ArrayList field37021;
    private Class5831 field37022;
    
    public static void method30744(final Class6721 e) {
        Class8812.field37021.add(e);
    }
    
    public static Class5831 method30745(final String s, final boolean b) throws SlickException {
        return method30747(Class8834.method30851(s), b);
    }
    
    public static Class5831 method30746(final String s) throws SlickException {
        return method30747(Class8834.method30851(s), false);
    }
    
    public static Class5831 method30747(final InputStream inputStream, final boolean b) throws SlickException {
        return new Class8812().method30749(inputStream, b);
    }
    
    private Class8812() {
    }
    
    private Class5831 method30748(final InputStream inputStream) throws SlickException {
        return this.method30749(inputStream, false);
    }
    
    private Class5831 method30749(final InputStream is, final boolean b) throws SlickException {
        try {
            final DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
            instance.setValidating(false);
            instance.setNamespaceAware(true);
            final DocumentBuilder documentBuilder = instance.newDocumentBuilder();
            documentBuilder.setEntityResolver(new Class6871(this));
            final Element documentElement = documentBuilder.parse(is).getDocumentElement();
            String s;
            for (s = documentElement.getAttribute("width"); Character.isLetter(s.charAt(s.length() - 1)); s = s.substring(0, s.length() - 1)) {}
            String s2;
            for (s2 = documentElement.getAttribute("height"); Character.isLetter(s2.charAt(s2.length() - 1)); s2 = s2.substring(0, s2.length() - 1)) {}
            final float float1 = Float.parseFloat(s);
            float float2 = Float.parseFloat(s2);
            this.field37022 = new Class5831(float1, float2);
            if (!b) {
                float2 = 0.0f;
            }
            this.method30750(documentElement, Class7310.method22424(0.0f, -float2));
            return this.field37022;
        }
        catch (final Exception ex) {
            throw new Class2324("Failed to load inkscape document", ex);
        }
    }
    
    @Override
    public void method30750(final Element element, final Class7310 class7310) throws ParsingException {
        final NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); ++i) {
            if (childNodes.item(i) instanceof Element) {
                this.method30751((Element)childNodes.item(i), class7310);
            }
        }
    }
    
    private void method30751(final Element element, final Class7310 class7310) throws ParsingException {
        for (int i = 0; i < Class8812.field37021.size(); ++i) {
            final Class6721 class7311 = Class8812.field37021.get(i);
            if (class7311.method20412(element)) {
                class7311.method20411(this, element, this.field37022, class7310);
            }
        }
    }
    
    static {
        Class8812.field37020 = 1;
        Class8812.field37021 = new ArrayList();
        method30744(new Class6722());
        method30744(new Class6724());
        method30744(new Class6726());
        method30744(new Class6729());
        method30744(new Class6723());
        method30744(new Class6727());
        method30744(new Class6725());
        method30744(new Class6728());
    }
}
