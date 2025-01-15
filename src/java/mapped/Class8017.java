// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.newdawn.slick.util.xml.SlickXMLException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Element;

public class Class8017
{
    private Element field33023;
    private Class7595 field33024;
    private String field33025;
    
    public Class8017(final Element field33023) {
        this.field33023 = field33023;
        this.field33025 = this.field33023.getTagName();
    }
    
    public String[] method26272() {
        final NamedNodeMap attributes = this.field33023.getAttributes();
        final String[] array = new String[attributes.getLength()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = attributes.item(i).getNodeName();
        }
        return array;
    }
    
    public String method26273() {
        return this.field33025;
    }
    
    public String method26274(final String s) {
        return this.field33023.getAttribute(s);
    }
    
    public String method26275(final String s, final String s2) {
        final String attribute = this.field33023.getAttribute(s);
        if (attribute != null && attribute.length() != 0) {
            return attribute;
        }
        return s2;
    }
    
    public int method26276(final String s) throws SlickXMLException {
        try {
            return Integer.parseInt(this.method26274(s));
        }
        catch (final NumberFormatException ex) {
            throw new Class2326("Value read: '" + this.method26274(s) + "' is not an integer", ex);
        }
    }
    
    public int method26277(final String s, final int n) throws SlickXMLException {
        try {
            return Integer.parseInt(this.method26275(s, "" + n));
        }
        catch (final NumberFormatException ex) {
            throw new Class2326("Value read: '" + this.method26275(s, "" + n) + "' is not an integer", ex);
        }
    }
    
    public double method26278(final String s) throws SlickXMLException {
        try {
            return Double.parseDouble(this.method26274(s));
        }
        catch (final NumberFormatException ex) {
            throw new Class2326("Value read: '" + this.method26274(s) + "' is not a double", ex);
        }
    }
    
    public double method26279(final String s, final double n) throws SlickXMLException {
        try {
            return Double.parseDouble(this.method26275(s, "" + n));
        }
        catch (final NumberFormatException ex) {
            throw new Class2326("Value read: '" + this.method26275(s, "" + n) + "' is not a double", ex);
        }
    }
    
    public boolean method26280(final String s) throws SlickXMLException {
        final String method26274 = this.method26274(s);
        if (method26274.equalsIgnoreCase("true")) {
            return true;
        }
        if (!method26274.equalsIgnoreCase("false")) {
            throw new Class2326("Value read: '" + this.method26274(s) + "' is not a boolean");
        }
        return false;
    }
    
    public boolean method26281(final String s, final boolean b) throws SlickXMLException {
        final String method26275 = this.method26275(s, "" + b);
        if (method26275.equalsIgnoreCase("true")) {
            return true;
        }
        if (!method26275.equalsIgnoreCase("false")) {
            throw new Class2326("Value read: '" + this.method26275(s, "" + b) + "' is not a boolean");
        }
        return false;
    }
    
    public String method26282() {
        String string = "";
        final NodeList childNodes = this.field33023.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); ++i) {
            if (childNodes.item(i) instanceof Text) {
                string += childNodes.item(i).getNodeValue();
            }
        }
        return string;
    }
    
    public Class7595 method26283() {
        if (this.field33024 == null) {
            final NodeList childNodes = this.field33023.getChildNodes();
            this.field33024 = new Class7595();
            for (int i = 0; i < childNodes.getLength(); ++i) {
                if (childNodes.item(i) instanceof Element) {
                    this.field33024.method23888(new Class8017((Element)childNodes.item(i)));
                }
            }
            return this.field33024;
        }
        return this.field33024;
    }
    
    public Class7595 method26284(final String anObject) {
        final Class7595 class7595 = new Class7595();
        final Class7595 method26283 = this.method26283();
        for (int i = 0; i < method26283.method23889(); ++i) {
            if (method26283.method23890(i).method26273().equals(anObject)) {
                class7595.method23888(method26283.method23890(i));
            }
        }
        return class7595;
    }
    
    @Override
    public String toString() {
        String s = "[XML " + this.method26273();
        final String[] method26272 = this.method26272();
        for (int i = 0; i < method26272.length; ++i) {
            s = s + " " + method26272[i] + "=" + this.method26274(method26272[i]);
        }
        return s + "]";
    }
}
