// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class5611 extends Class5610<Class665>
{
    public static final ResourceLocation field22980;
    private final int field22981;
    private final Class665 field22982;
    
    public Class5611(final int n, final int n2, final int n3, final String s) {
        this(n, n2, n3, 200, 20, s);
    }
    
    public Class5611(final int field22981, final int n, final int n2, final int n3, final int n4, final String s) {
        this.field22981 = field22981;
        this.field22982 = new Class665(this, n, n2, s, n3, n4, class654 -> this.method16932());
    }
    
    public Class665 method16923() {
        return this.field22982;
    }
    
    public int method16924() {
        return this.field22981;
    }
    
    public void method16925(final String s) {
        this.field22982.method3367(s);
    }
    
    public int method16926() {
        return this.field22982.method3364();
    }
    
    public int method16927() {
        return this.field22982.method3730();
    }
    
    public int method16928() {
        return this.field22982.method3726();
    }
    
    public int method16929() {
        return this.field22982.field3426;
    }
    
    public void method16930(final int n, final int n2) {
    }
    
    public int method16931(final boolean b) {
        return this.field22982.method3729(b);
    }
    
    public abstract void method16932();
    
    public void method16933(final double n, final double n2) {
    }
    
    public void method16934(final int n, final int n2, final float n3) {
        this.method16923().method3727(n, n2, n3);
    }
    
    public void method16935(final String s, final int n, final int n2, final int n3) {
        this.method16923().method3295(Class869.method5277().field4643, s, n, n2, n3);
    }
    
    static {
        field22980 = new ResourceLocation("textures/gui/widgets.png");
    }
}
