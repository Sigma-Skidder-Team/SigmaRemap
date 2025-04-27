// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.Color;

import java.util.Properties;

public class Class8299
{
    public static final String field34110 = "id";
    public static final String field34111 = "fill";
    public static final String field34112 = "stroke";
    public static final String field34113 = "opacity";
    public static final String field34114 = "stroke-width";
    public static final String field34115 = "stroke-miterlimit";
    public static final String field34116 = "stroke-dasharray";
    public static final String field34117 = "stroke-dashoffset";
    public static final String field34118 = "stroke-opacity";
    public static final String field34119 = "none";
    private String field34120;
    private final Properties field34121;
    
    public Class8299(final String field34120) {
        this.field34120 = "";
        this.field34121 = new Properties();
        this.field34120 = field34120;
        this.method27582("stroke-width", "1");
    }
    
    private String method27581(final String s) {
        if (s.equals("")) {
            return "#000000";
        }
        if (s.equals("white")) {
            return "#ffffff";
        }
        if (!s.equals("black")) {
            return s;
        }
        return "#000000";
    }
    
    public void method27582(final String key, String value) {
        if (value == null) {
            value = "";
        }
        if (key.equals("fill")) {
            value = this.method27581(value);
        }
        if (key.equals("stroke-opacity")) {
            if (value.equals("0")) {
                this.field34121.setProperty("stroke", "none");
            }
        }
        if (key.equals("stroke-width")) {
            if (value.equals("")) {
                value = "1";
            }
            if (value.endsWith("px")) {
                value = value.substring(0, value.length() - 2);
            }
        }
        if (key.equals("stroke")) {
            if ("none".equals(this.field34121.getProperty("stroke"))) {
                return;
            }
            if ("".equals(this.field34121.getProperty("stroke"))) {
                return;
            }
            value = this.method27581(value);
        }
        this.field34121.setProperty(key, value);
    }
    
    public boolean method27583(final String s) {
        return this.method27579(s).startsWith("#");
    }
    
    public String method27584() {
        return this.field34120;
    }
    
    public String method27579(final String key) {
        return this.field34121.getProperty(key);
    }
    
    public Color method27585(final String str) {
        if (this.method27583(str)) {
            return new Color(Integer.parseInt(this.method27579(str).substring(1), 16));
        }
        throw new RuntimeException("Attribute " + str + " is not specified as a color:" + this.method27579(str));
    }
    
    public String method27586(final String s) {
        final String method27579 = this.method27579(s);
        if (method27579.length() >= 7) {
            return method27579.substring(5, method27579.length() - 1);
        }
        return "";
    }
    
    public float method27587(final String str) {
        final String method27579 = this.method27579(str);
        if (method27579 == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(method27579);
        }
        catch (final NumberFormatException ex) {
            throw new RuntimeException("Attribute " + str + " is not specified as a float:" + this.method27579(str));
        }
    }
    
    public boolean method27588() {
        return this.method27583("fill");
    }
    
    public boolean method27589() {
        return this.method27583("stroke") && this.method27587("stroke-width") > 0.0f;
    }
}
