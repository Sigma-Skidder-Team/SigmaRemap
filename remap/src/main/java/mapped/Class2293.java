// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2293 extends Class2290 implements Serializable
{
    private static String[] field13925;
    public static final long field13926 = -4801347926528714435L;
    
    public Class2293(final float n, final float n2) {
        super(n, n2);
    }
    
    public Class2293(final float[] array) {
        super(array);
    }
    
    public Class2293(final Class2293 class2293) {
        super(class2293);
    }
    
    public Class2293(final Class2299 class2299) {
        super(class2299);
    }
    
    public Class2293(final Class2297 class2297) {
        super(class2297);
    }
    
    public Class2293(final Class2290 class2290) {
        super(class2290);
    }
    
    public Class2293() {
    }
    
    public final float method9027(final Class2293 class2293) {
        final float n = this.field13920 - class2293.field13920;
        final float n2 = this.field13921 - class2293.field13921;
        return n * n + n2 * n2;
    }
    
    public final float method9028(final Class2293 class2293) {
        final float n = this.field13920 - class2293.field13920;
        final float n2 = this.field13921 - class2293.field13921;
        return (float)Math.sqrt(n * n + n2 * n2);
    }
    
    public final float method9029(final Class2293 class2293) {
        return Math.abs(this.field13920 - class2293.field13920) + Math.abs(this.field13921 - class2293.field13921);
    }
    
    public final float method9030(final Class2293 class2293) {
        return Math.max(Math.abs(this.field13920 - class2293.field13920), Math.abs(this.field13921 - class2293.field13921));
    }
}
