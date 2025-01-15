// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class705 extends Class703
{
    public Class350 field3874;
    public long field3875;
    private Class607 field3876;
    private Class654 field3877;
    
    public Class705(final Class527 class527, final Class5760 class528) {
        super(class527, class528, new Class2259("controls.title", new Object[0]));
    }
    
    @Override
    public void method2969() {
        this.method3029(new Class654(this.field3152 / 2 - 155, 18, 150, 20, Class8822.method30773("options.mouse_settings", new Object[0]), class654 -> this.field3150.method5244(new Class706(this, this.field3869))));
        this.method3029(Class6469.field25730.method19362(this.field3869, this.field3152 / 2 - 155 + 160, 18, 150));
        this.field3876 = new Class607(this, this.field3150);
        this.field3149.add(this.field3876);
        this.field3877 = this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 - 29, 150, 20, Class8822.method30773("controls.resetAll", new Object[0]), class654 -> {
            for (final Class350 class655 : this.field3869.field23460) {
                class655.method1062(class655.method1061());
            }
            Class350.method1055();
        }));
        this.method3029(new Class654(this.field3152 / 2 - 155 + 160, this.field3153 - 29, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.field3150.method5244(this.field3868)));
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (this.field3874 == null) {
            return super.method2982(n, n2, n3);
        }
        this.field3869.method17117(this.field3874, Class2136.field12469.method8289(n3));
        this.field3874 = null;
        Class350.method1055();
        return true;
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (this.field3874 == null) {
            return super.method2972(n, n2, n3);
        }
        if (n != 256) {
            this.field3869.method17117(this.field3874, Class8341.method27796(n, n2));
        }
        else {
            this.field3869.method17117(this.field3874, Class8341.field34248);
        }
        this.field3874 = null;
        this.field3875 = Class8349.method27837();
        Class350.method1055();
        return true;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.field3876.method2975(n, n2, n3);
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 8, 16777215);
        boolean field3431 = false;
        final Class350[] field3432 = this.field3869.field23460;
        for (int length = field3432.length, i = 0; i < length; ++i) {
            if (!field3432[i].method1069()) {
                field3431 = true;
                break;
            }
        }
        this.field3877.field3431 = field3431;
        super.method2975(n, n2, n3);
    }
}
