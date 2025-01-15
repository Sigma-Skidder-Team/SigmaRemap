// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class336 implements Class335
{
    private Class305 field2060;
    private Class327[] field2061;
    
    public Class336(final Class305 field2060, final Class327[] field2061) {
        this.field2060 = field2060;
        this.field2061 = field2061;
    }
    
    @Override
    public float[] method1014() {
        return this.field2060.method974(this.field2061);
    }
    
    @Override
    public String toString() {
        return "" + this.field2060 + "()";
    }
}
