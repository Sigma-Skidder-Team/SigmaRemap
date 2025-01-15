// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Properties;

public class Class9099
{
    private String field38535;
    private Class1932[] field38536;
    private int field38537;
    private int field38538;
    private int field38539;
    private int field38540;
    private int field38541;
    private int field38542;
    private int field38543;
    private int field38544;
    
    public Class9099(final String s, final Properties properties) {
        this.field38537 = 1;
        this.field38538 = 64;
        this.field38539 = 3;
        this.field38540 = 3;
        this.field38541 = -2130706433;
        this.field38542 = 16777215;
        this.field38543 = 0;
        this.field38544 = Integer.MIN_VALUE;
        final Class8652 class8652 = new Class8652("CustomPanorama");
        this.field38535 = s;
        this.field38536 = new Class1932[6];
        for (int i = 0; i < this.field38536.length; ++i) {
            this.field38536[i] = new Class1932(s + "/panorama_" + i + ".png");
        }
        this.field38537 = class8652.method29456(properties.getProperty("weight"), 1);
        this.field38538 = class8652.method29456(properties.getProperty("blur1"), 64);
        this.field38539 = class8652.method29456(properties.getProperty("blur2"), 3);
        this.field38540 = class8652.method29456(properties.getProperty("blur3"), 3);
        this.field38541 = Class8652.method29467(properties.getProperty("overlay1.top"), -2130706433);
        this.field38542 = Class8652.method29467(properties.getProperty("overlay1.bottom"), 16777215);
        this.field38543 = Class8652.method29467(properties.getProperty("overlay2.top"), 0);
        this.field38544 = Class8652.method29467(properties.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
    }
    
    public Class1932[] method32884() {
        return this.field38536;
    }
    
    public int method32885() {
        return this.field38537;
    }
    
    public int method32886() {
        return this.field38538;
    }
    
    public int method32887() {
        return this.field38539;
    }
    
    public int method32888() {
        return this.field38540;
    }
    
    public int method32889() {
        return this.field38541;
    }
    
    public int method32890() {
        return this.field38542;
    }
    
    public int method32891() {
        return this.field38543;
    }
    
    public int method32892() {
        return this.field38544;
    }
    
    @Override
    public String toString() {
        return "" + this.field38535 + ", weight: " + this.field38537 + ", blur: " + this.field38538 + " " + this.field38539 + " " + this.field38540 + ", overlay: " + this.field38541 + " " + this.field38542 + " " + this.field38543 + " " + this.field38544;
    }
}
