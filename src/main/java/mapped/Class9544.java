// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9544
{
    private static String[] field41082;
    public static final Class9544 field41083;
    public static final Class9544 field41084;
    public static final Class9544 field41085;
    public static final Class9544 field41086;
    public static final Class9544 field41087;
    public static final Class9544 field41088;
    public static final Class9544 field41089;
    public static final Class9544 field41090;
    public final float field41091;
    public final float field41092;
    
    public Class9544(final float field41091, final float field41092) {
        this.field41091 = field41091;
        this.field41092 = field41092;
    }
    
    public boolean equals(final Class9544 class9544) {
        return this.field41091 == class9544.field41091 && this.field41092 == class9544.field41092;
    }
    
    static {
        field41083 = new Class9544(0.0f, 0.0f);
        field41084 = new Class9544(1.0f, 1.0f);
        field41085 = new Class9544(1.0f, 0.0f);
        field41086 = new Class9544(-1.0f, 0.0f);
        field41087 = new Class9544(0.0f, 1.0f);
        field41088 = new Class9544(0.0f, -1.0f);
        field41089 = new Class9544(Float.MAX_VALUE, Float.MAX_VALUE);
        field41090 = new Class9544(Float.MIN_VALUE, Float.MIN_VALUE);
    }
}
