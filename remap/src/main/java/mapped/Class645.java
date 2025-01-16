// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class645 extends Class573
{
    public ResourceLocation field3657;
    public boolean field3658;
    public int field3659;
    public int field3660;
    public int field3661;
    public int field3662;
    
    public Class645(final int n, final int n2, final int n3, final int n4, final boolean field3658) {
        super(n, n2, n3, n4, "");
        this.field3658 = field3658;
    }
    
    public void method3690(final int field3659, final int field3660, final int field3661, final int field3662, final ResourceLocation field3663) {
        this.field3659 = field3659;
        this.field3660 = field3660;
        this.field3661 = field3661;
        this.field3662 = field3662;
        this.field3657 = field3663;
    }
    
    public void method3691(final boolean field3658) {
        this.field3658 = field3658;
    }
    
    public boolean method3692() {
        return this.field3658;
    }
    
    public void method3693(final int field3426, final int field3427) {
        this.field3426 = field3426;
        this.field3427 = field3427;
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        Minecraft.method5277().method5290().method5849(this.field3657);
        Class8726.method30007();
        int field3659 = this.field3659;
        int field3660 = this.field3660;
        if (this.field3658) {
            field3659 += this.field3661;
        }
        if (this.method3360()) {
            field3660 += this.field3662;
        }
        this.method3186(this.field3426, this.field3427, field3659, field3660, this.field3424, this.field3425);
        Class8726.method30008();
    }
}
