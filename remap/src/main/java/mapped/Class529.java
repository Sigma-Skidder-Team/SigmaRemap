// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class Class529 extends Class527
{
    private Class654 field3163;
    private final Class9575 field3164;
    private Class576 field3165;
    private final BooleanConsumer field3166;
    private final Class527 field3167;
    
    public Class529(final Class527 field3167, final BooleanConsumer field3168, final Class9575 field3169) {
        super(new Class2259("selectServer.direct", new Object[0]));
        this.field3167 = field3167;
        this.field3164 = field3169;
        this.field3166 = field3168;
    }
    
    @Override
    public void method2992() {
        this.field3165.method3376();
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (this.method3471() == this.field3165 && (n == 257 || n == 335)) {
            this.method3058();
            return true;
        }
        return super.method2972(n, n2, n3);
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        this.field3163 = this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 96 + 12, 200, 20, Class8822.method30773("selectServer.select", new Object[0]), class654 -> this.method3058()));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 120 + 12, 200, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3166.accept(false)));
        (this.field3165 = new Class576(this.field3156, this.field3152 / 2 - 100, 116, 200, 20, Class8822.method30773("addServer.enterIp", new Object[0]))).method3397(128);
        this.field3165.method3395(true);
        this.field3165.method3377(this.field3150.field4648.field23469);
        this.field3165.method3374(p0 -> this.method3059());
        this.field3149.add(this.field3165);
        this.method3476(this.field3165);
        this.method3059();
    }
    
    @Override
    public void method2970(final Class869 class869, final int n, final int n2) {
        final String method3378 = this.field3165.method3378();
        this.method3038(class869, n, n2);
        this.field3165.method3377(method3378);
    }
    
    private void method3058() {
        this.field3164.field41613 = this.field3165.method3378();
        this.field3166.accept(true);
    }
    
    @Override
    public void method3028() {
        this.field3150.method5244(this.field3167);
    }
    
    @Override
    public void method2971() {
        this.field3150.field4651.method22505(false);
        this.field3150.field4648.field23469 = this.field3165.method3378();
        this.field3150.field4648.method17121();
    }
    
    private void method3059() {
        final String method3378 = this.field3165.method3378();
        final Class654 field3163 = this.field3163;
        boolean field3164 = false;
        Label_0053: {
            if (!method3378.isEmpty()) {
                if (method3378.split(":").length > 0) {
                    if (method3378.indexOf(32) == -1) {
                        field3164 = true;
                        break Label_0053;
                    }
                }
            }
            field3164 = false;
        }
        field3163.field3431 = field3164;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 20, 16777215);
        this.method3297(this.field3156, Class8822.method30773("addServer.enterIp", new Object[0]), this.field3152 / 2 - 100, 100, 10526880);
        this.field3165.method2975(n, n2, n3);
        super.method2975(n, n2, n3);
    }
}
