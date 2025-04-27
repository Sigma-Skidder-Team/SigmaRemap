// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class Class7094
{
    private final int[] field27606;
    private int field27607;
    private String field27608;
    private String[] field27609;
    private String field27610;
    private String[] field27611;
    private int field27612;
    
    public Class7094(final String field27608, final String[] field27609, final String field27610, final String[] field27611, final int i) {
        this.field27606 = null;
        this.field27607 = 0;
        this.field27608 = null;
        this.field27609 = null;
        this.field27610 = null;
        this.field27611 = null;
        this.field27612 = 0;
        this.field27608 = field27608;
        this.field27609 = field27609;
        this.field27610 = field27610;
        this.field27611 = field27611;
        this.field27607 = i;
        if (field27609.length != field27611.length) {
            throw new IllegalArgumentException("Property and user values have different lengths: " + field27609.length + " != " + field27611.length);
        }
        if (i >= 0 && i < field27609.length) {
            this.field27612 = i;
            return;
        }
        throw new IllegalArgumentException("Invalid default value: " + i);
    }
    
    public boolean method21677(final String s) {
        if (s == null) {
            this.field27612 = this.field27607;
            return false;
        }
        this.field27612 = ArrayUtils.indexOf(this.field27609, s);
        if (this.field27612 >= 0 && this.field27612 < this.field27609.length) {
            return true;
        }
        this.field27612 = this.field27607;
        return false;
    }
    
    public void method21678() {
        ++this.field27612;
        if (this.field27612 < 0 || this.field27612 >= this.field27609.length) {
            this.field27612 = 0;
        }
    }
    
    public void method21679(final int field27612) {
        this.field27612 = field27612;
        if (this.field27612 < 0 || this.field27612 >= this.field27609.length) {
            this.field27612 = this.field27607;
        }
    }
    
    public int method21680() {
        return this.field27612;
    }
    
    public String method21681() {
        return this.field27611[this.field27612];
    }
    
    public String method21682() {
        return this.field27609[this.field27612];
    }
    
    public String method21683() {
        return this.field27610;
    }
    
    public String method21684() {
        return this.field27608;
    }
    
    public void method21685() {
        this.field27612 = this.field27607;
    }
    
    public boolean method21686(final Properties properties) {
        this.method21685();
        if (properties != null) {
            final String property = properties.getProperty(this.field27608);
            return property != null && this.method21677(property);
        }
        return false;
    }
    
    public void method21687(final Properties properties) {
        if (properties != null) {
            properties.setProperty(this.method21684(), this.method21682());
        }
    }
    
    @Override
    public String toString() {
        return this.field27608 + "=" + this.method21682() + " [" + Config.method28888(this.field27609) + "], value: " + this.field27612;
    }
}
