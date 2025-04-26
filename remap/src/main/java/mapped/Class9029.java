// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.SlickException;
import org.w3c.dom.NodeList;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.newdawn.slick.Color;

import java.util.HashMap;

public class Class9029
{
    private final Class5025 field38171;
    public int field38172;
    public String field38173;
    public int field38174;
    public int field38175;
    public int field38176;
    public int field38177;
    public Class7765 field38178;
    public int field38179;
    public int field38180;
    private HashMap field38181;
    public int field38182;
    public int field38183;
    
    public Class9029(final Class5025 field38171, Element documentElement, final boolean b) throws SlickException {
        this.field38175 = Integer.MAX_VALUE;
        this.field38181 = new HashMap();
        this.field38182 = 0;
        this.field38183 = 0;
        this.field38171 = field38171;
        this.field38173 = documentElement.getAttribute("name");
        this.field38174 = Integer.parseInt(documentElement.getAttribute("firstgid"));
        final String attribute = documentElement.getAttribute("source");
        if (attribute != null && !attribute.equals("")) {
            try {
                documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(Class8834.method30851(field38171.method15259() + "/" + attribute)).getDocumentElement();
            }
            catch (final Exception ex) {
                Class8452.method28203(ex);
                throw new Class2324("Unable to load or parse sourced tileset: " + this.field38171.field21539 + "/" + attribute);
            }
        }
        final String attribute2 = documentElement.getAttribute("tilewidth");
        final String attribute3 = documentElement.getAttribute("tileheight");
        if (attribute2.length() == 0 || attribute3.length() == 0) {
            throw new Class2324("TiledMap requires that the map be created with tilesets that use a single image.  Check the WiKi for more complete information.");
        }
        this.field38176 = Integer.parseInt(attribute2);
        this.field38177 = Integer.parseInt(attribute3);
        final String attribute4 = documentElement.getAttribute("spacing");
        if (attribute4 != null && !attribute4.equals("")) {
            this.field38182 = Integer.parseInt(attribute4);
        }
        final String attribute5 = documentElement.getAttribute("margin");
        if (attribute5 != null && !attribute5.equals("")) {
            this.field38183 = Integer.parseInt(attribute5);
        }
        final Element element = (Element)documentElement.getElementsByTagName("image").item(0);
        final String attribute6 = element.getAttribute("source");
        Color color = null;
        final String attribute7 = element.getAttribute("trans");
        if (attribute7 != null && attribute7.length() > 0) {
            color = new Color(Integer.parseInt(attribute7, 16));
        }
        if (b) {
            this.method32358(new Class7764(field38171.method15259() + "/" + attribute6, false, 2, color));
        }
        final NodeList elementsByTagName = documentElement.getElementsByTagName("tile");
        for (int i = 0; i < elementsByTagName.getLength(); ++i) {
            final Element element2 = (Element)elementsByTagName.item(i);
            final int value = Integer.parseInt(element2.getAttribute("id")) + this.field38174;
            final Properties value2 = new Properties();
            final NodeList elementsByTagName2 = ((Element)element2.getElementsByTagName("properties").item(0)).getElementsByTagName("property");
            for (int j = 0; j < elementsByTagName2.getLength(); ++j) {
                final Element element3 = (Element)elementsByTagName2.item(j);
                value2.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
            this.field38181.put(new Integer(value), value2);
        }
    }
    
    public int method32354() {
        return this.field38176;
    }
    
    public int method32355() {
        return this.field38177;
    }
    
    public int method32356() {
        return this.field38182;
    }
    
    public int method32357() {
        return this.field38183;
    }
    
    public void method32358(final Class7764 class7764) {
        this.field38178 = new Class7765(class7764, this.field38176, this.field38177, this.field38182, this.field38183);
        this.field38179 = this.field38178.method24861();
        this.field38180 = this.field38178.method24862();
        if (this.field38179 <= 0) {
            this.field38179 = 1;
        }
        if (this.field38180 <= 0) {
            this.field38180 = 1;
        }
        this.field38175 = this.field38179 * this.field38180 + this.field38174 - 1;
    }
    
    public Properties method32359(final int value) {
        return this.field38181.get(new Integer(value));
    }
    
    public int method32360(final int n) {
        return n % this.field38179;
    }
    
    public int method32361(final int n) {
        return n / this.field38179;
    }
    
    public void method32362(final int field38175) {
        this.field38175 = field38175;
    }
    
    public boolean method32363(final int n) {
        return n >= this.field38174 && n <= this.field38175;
    }
}
