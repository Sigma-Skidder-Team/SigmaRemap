// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class737 extends Class527
{
    private final Class498 field3999;
    private Class576 field4000;
    private Class576 field4001;
    private Class576 field4002;
    private Class654 field4003;
    
    public Class737(final Class498 field3999) {
        super(Class7895.field32402);
        this.field3999 = field3999;
    }
    
    @Override
    public void method2992() {
        this.field4000.method3376();
        this.field4001.method3376();
        this.field4002.method3376();
    }
    
    private void method4046() {
        this.method4048();
        this.field3150.method5244(null);
    }
    
    private void method4047() {
        this.field3150.method5244(null);
    }
    
    private void method4048() {
        this.field3150.method5269().method17292(new Class4270(this.field3999.method2193(), new Class1932(this.field4000.method3378()), new Class1932(this.field4001.method3378()), this.field4002.method3378()));
    }
    
    @Override
    public void method3028() {
        this.method4047();
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        this.field4003 = this.method3029(new Class654(this.field3152 / 2 - 4 - 150, 210, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.method4046()));
        this.method3029(new Class654(this.field3152 / 2 + 4, 210, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.method4047()));
        (this.field4001 = new Class576(this.field3156, this.field3152 / 2 - 152, 40, 300, 20, Class8822.method30773("jigsaw_block.target_pool", new Object[0]))).method3397(128);
        this.field4001.method3377(this.field3999.method2532().toString());
        this.field4001.method3374(p0 -> this.method4049());
        this.field3149.add(this.field4001);
        (this.field4000 = new Class576(this.field3156, this.field3152 / 2 - 152, 80, 300, 20, Class8822.method30773("jigsaw_block.attachement_type", new Object[0]))).method3397(128);
        this.field4000.method3377(this.field3999.method2531().toString());
        this.field4000.method3374(p0 -> this.method4049());
        this.field3149.add(this.field4000);
        (this.field4002 = new Class576(this.field3156, this.field3152 / 2 - 152, 120, 300, 20, Class8822.method30773("jigsaw_block.final_state", new Object[0]))).method3397(256);
        this.field4002.method3377(this.field3999.method2533());
        this.field3149.add(this.field4002);
        this.method3476(this.field4001);
        this.method4049();
    }
    
    public void method4049() {
        this.field4003.field3431 = (Class1932.method7803(this.field4000.method3378()) & Class1932.method7803(this.field4001.method3378()));
    }
    
    @Override
    public void method2970(final Class869 class869, final int n, final int n2) {
        final String method3378 = this.field4000.method3378();
        final String method3379 = this.field4001.method3378();
        final String method3380 = this.field4002.method3378();
        this.method3038(class869, n, n2);
        this.field4000.method3377(method3378);
        this.field4001.method3377(method3379);
        this.field4002.method3377(method3380);
    }
    
    @Override
    public void method2971() {
        this.field3150.field4651.method22505(false);
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (super.method2972(n, n2, n3)) {
            return true;
        }
        if (this.field4003.field3431 && (n == 257 || n == 335)) {
            this.method4046();
            return true;
        }
        return false;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3297(this.field3156, Class8822.method30773("jigsaw_block.target_pool", new Object[0]), this.field3152 / 2 - 153, 30, 10526880);
        this.field4001.method2975(n, n2, n3);
        this.method3297(this.field3156, Class8822.method30773("jigsaw_block.attachement_type", new Object[0]), this.field3152 / 2 - 153, 70, 10526880);
        this.field4000.method2975(n, n2, n3);
        this.method3297(this.field3156, Class8822.method30773("jigsaw_block.final_state", new Object[0]), this.field3152 / 2 - 153, 110, 10526880);
        this.field4002.method2975(n, n2, n3);
        super.method2975(n, n2, n3);
    }
}
