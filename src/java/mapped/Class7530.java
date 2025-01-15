// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7530
{
    private static String[] field29904;
    public final Class<? extends Class4484> field29905;
    public final int field29906;
    public int field29907;
    public final int field29908;
    public final boolean field29909;
    
    public Class7530(final Class<? extends Class4484> field29905, final int field29906, final int field29907, final boolean field29908) {
        this.field29905 = field29905;
        this.field29906 = field29906;
        this.field29908 = field29907;
        this.field29909 = field29908;
    }
    
    public Class7530(final Class<? extends Class4484> clazz, final int n, final int n2) {
        this(clazz, n, n2, false);
    }
    
    public boolean method23589(final int n) {
        return this.field29908 == 0 || this.field29907 < this.field29908;
    }
    
    public boolean method23590() {
        return this.field29908 == 0 || this.field29907 < this.field29908;
    }
}
