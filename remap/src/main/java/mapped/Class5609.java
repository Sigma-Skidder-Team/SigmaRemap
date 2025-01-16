// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public abstract class Class5609 extends Class5610<Class663>
{
    public static final ResourceLocation field22975;
    private final int field22976;
    private final Class663 field22977;
    private final double field22978;
    private final double field22979;
    
    public Class5609(final int field22976, final int n, final int n2, final int n3, final int n4, final double field22977, final double field22978) {
        this.field22976 = field22976;
        this.field22978 = field22977;
        this.field22979 = field22978;
        this.field22977 = new Class663(this, n, n2, n3, 20, this.method16900(n4));
        this.method16906().method3367(this.method16899());
    }
    
    public String method16899() {
        return "";
    }
    
    public double method16900(final double n) {
        return MathHelper.clamp((this.method16902(n) - this.field22978) / (this.field22979 - this.field22978), 0.0, 1.0);
    }
    
    public double method16901(final double n) {
        return this.method16902(MathHelper.method35701(MathHelper.clamp(n, 0.0, 1.0), this.field22978, this.field22979));
    }
    
    public double method16902(final double n) {
        return MathHelper.clamp(n, this.field22978, this.field22979);
    }
    
    public int method16903(final boolean b) {
        return 0;
    }
    
    public void method16904(final double n, final double n2) {
    }
    
    public void method16905(final double n, final double n2) {
    }
    
    public Class663 method16906() {
        return this.field22977;
    }
    
    public double method16907() {
        return this.field22977.method3721();
    }
    
    public void method16908(final double n) {
        this.field22977.method3715(n);
    }
    
    public int method16909() {
        return this.field22976;
    }
    
    public void method16910(final String s) {
        this.field22977.method3367(s);
    }
    
    public int method16911() {
        return this.field22977.method3364();
    }
    
    public int method16912() {
        return this.field22977.method3724();
    }
    
    public int method16913() {
        return this.field22977.method3720();
    }
    
    public abstract void method16898();
    
    public void method16914() {
        this.field22977.method3367(this.method16899());
    }
    
    static {
        field22975 = new ResourceLocation("textures/gui/widgets.png");
    }
}
