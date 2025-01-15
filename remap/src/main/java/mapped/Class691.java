// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class691 extends Class527 implements Class692
{
    public final Class527 field3808;
    private Class614 field3809;
    private Class613 field3810;
    private Class609 field3811;
    private final Class7474 field3812;
    private Class608<?> field3813;
    private boolean field3814;
    
    public Class691(final Class527 field3808, final Class7474 field3809) {
        super(new Class2259("gui.stats", new Object[0]));
        this.field3814 = true;
        this.field3808 = field3808;
        this.field3812 = field3809;
    }
    
    @Override
    public void method2969() {
        this.field3814 = true;
        this.field3150.method5269().method17292(new Class4323(Class2218.field13622));
    }
    
    public void method3855() {
        this.field3809 = new Class614(this, this.field3150);
        this.field3810 = new Class613(this, this.field3150);
        this.field3811 = new Class609(this, this.field3150);
    }
    
    public void method3856() {
        this.method3029(new Class654(this.field3152 / 2 - 120, this.field3153 - 52, 80, 20, Class8822.method30773("stat.generalButton", new Object[0]), class654 -> this.method3859(this.field3809)));
        final Class654 class654 = this.method3029(new Class654(this.field3152 / 2 - 40, this.field3153 - 52, 80, 20, Class8822.method30773("stat.itemsButton", new Object[0]), class654 -> this.method3859(this.field3810)));
        final Class654 class655 = this.method3029(new Class654(this.field3152 / 2 + 40, this.field3153 - 52, 80, 20, Class8822.method30773("stat.mobsButton", new Object[0]), class654 -> this.method3859(this.field3811)));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 - 28, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.field3150.method5244(this.field3808)));
        if (this.field3810.method3040().isEmpty()) {
            class654.field3431 = false;
        }
        if (this.field3811.method3040().isEmpty()) {
            class655.field3431 = false;
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        if (!this.field3814) {
            this.method3858().method2975(n, n2, n3);
            this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, 20, 16777215);
            super.method2975(n, n2, n3);
        }
        else {
            this.method3041();
            this.method3295(this.field3156, Class8822.method30773("multiplayer.downloadingStats", new Object[0]), this.field3152 / 2, this.field3153 / 2, 16777215);
            this.method3295(this.field3156, Class691.field3815[(int)(Class8349.method27837() / 150L % Class691.field3815.length)], this.field3152 / 2, this.field3153 / 2 + 18, 16777215);
        }
    }
    
    @Override
    public void method3857() {
        if (this.field3814) {
            this.method3855();
            this.method3856();
            this.method3859(this.field3809);
            this.field3814 = false;
        }
    }
    
    @Override
    public boolean method2991() {
        return !this.field3814;
    }
    
    @Nullable
    public Class608<?> method3858() {
        return this.field3813;
    }
    
    public void method3859(final Class608<?> field3813) {
        this.field3149.remove(this.field3809);
        this.field3149.remove(this.field3810);
        this.field3149.remove(this.field3811);
        if (field3813 != null) {
            this.field3149.add(0, field3813);
            this.field3813 = field3813;
        }
    }
    
    private int method3860(final int n) {
        return 115 + 40 * n;
    }
    
    private void method3861(final int n, final int n2, final Class3820 class3820) {
        this.method3862(n + 1, n2 + 1, 0, 0);
        Class8726.method30046();
        this.field3151.method6538(class3820.method11741(), n + 2, n2 + 2);
        Class8726.method30047();
    }
    
    private void method3862(final int n, final int n2, final int n3, final int n4) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class691.field3362);
        Class565.method3299(n, n2, this.method3303(), (float)n3, (float)n4, 18, 18, 128, 128);
    }
}
