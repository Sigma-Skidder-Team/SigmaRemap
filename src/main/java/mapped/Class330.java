// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class330 implements Class328
{
    private static String[] field2047;
    private String field2048;
    private Class6300 field2049;
    private Class2187 field2050;
    
    public Class330(final String field2048, final Class6300 field2049, final Class2187 field2050) {
        this.field2048 = field2048;
        this.field2049 = field2049;
        this.field2050 = field2050;
    }
    
    @Override
    public float method1009() {
        return this.method1011();
    }
    
    public float method1011() {
        return this.field2050.method8354(this.field2049);
    }
    
    public void method1012(final float n) {
        this.field2050.method8355(this.field2049, n);
    }
    
    @Override
    public String toString() {
        return this.field2048;
    }
}
