// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8340
{
    private static String[] field34242;
    public int field34243;
    public String field34244;
    public long field34245;
    
    public Class8340(final int field34243, final String field34244, final long field34245) {
        this.field34243 = field34243;
        this.field34244 = field34244;
        this.field34245 = field34245;
    }
    
    public float method27792() {
        return (this.field34243 >> 16 & 0xFF) / 255.0f;
    }
    
    public float method27793() {
        return (this.field34243 >> 8 & 0xFF) / 255.0f;
    }
    
    public float method27794() {
        return (this.field34243 & 0xFF) / 255.0f;
    }
    
    public float method27795() {
        return (this.field34243 >> 24 & 0xFF) / 255.0f;
    }
}
