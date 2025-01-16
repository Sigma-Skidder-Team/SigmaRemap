// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class679 extends Class654
{
    private final ResourceLocation field3714;
    private final int field3715;
    private final int field3716;
    private final int field3717;
    private final int field3718;
    private final int field3719;
    
    public Class679(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final ResourceLocation class1932, final Class6887 class1933) {
        this(n, n2, n3, n4, n5, n6, n7, class1932, 256, 256, class1933);
    }
    
    public Class679(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final ResourceLocation class1932, final int n8, final int n9, final Class6887 class1933) {
        this(n, n2, n3, n4, n5, n6, n7, class1932, n8, n9, class1933, "");
    }
    
    public Class679(final int n, final int n2, final int n3, final int n4, final int field3715, final int field3716, final int field3717, final ResourceLocation field3718, final int field3719, final int field3720, final Class6887 class6887, final String s) {
        super(n, n2, n3, n4, s, class6887);
        this.field3718 = field3719;
        this.field3719 = field3720;
        this.field3715 = field3715;
        this.field3716 = field3716;
        this.field3717 = field3717;
        this.field3714 = field3718;
    }
    
    public void method3742(final int field3426, final int field3427) {
        this.field3426 = field3426;
        this.field3427 = field3427;
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        Minecraft.method5277().method5290().method5849(this.field3714);
        Class8726.method30007();
        int field3716 = this.field3716;
        if (this.method3360()) {
            field3716 += this.field3717;
        }
        Class565.method3188(this.field3426, this.field3427, (float)this.field3715, (float)field3716, this.field3424, this.field3425, this.field3718, this.field3719);
        Class8726.method30008();
    }
}
