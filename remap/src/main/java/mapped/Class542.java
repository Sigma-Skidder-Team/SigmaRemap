// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class542 extends Class541
{
    private final Class500 field3271;
    private Class654 field3272;
    private Class654 field3273;
    private Class654 field3274;
    private Class2182 field3275;
    private boolean field3276;
    private boolean field3277;
    
    public Class542(final Class500 field3271) {
        this.field3275 = Class2182.field12923;
        this.field3271 = field3271;
    }
    
    @Override
    public Class865 method3157() {
        return this.field3271.method2539();
    }
    
    @Override
    public int method3158() {
        return 135;
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field3272 = this.method3029(new Class654(this.field3152 / 2 - 50 - 100 - 4, 165, 100, 20, Class8822.method30773("advMode.mode.sequence", new Object[0]), class654 -> {
            this.method3169();
            this.method3168();
        }));
        this.field3273 = this.method3029(new Class654(this.field3152 / 2 - 50, 165, 100, 20, Class8822.method30773("advMode.mode.unconditional", new Object[0]), class654 -> {
            this.field3276 = !this.field3276;
            this.method3170();
        }));
        this.field3274 = this.method3029(new Class654(this.field3152 / 2 + 50 + 4, 165, 100, 20, Class8822.method30773("advMode.mode.redstoneTriggered", new Object[0]), class654 -> {
            this.field3277 = !this.field3277;
            this.method3171();
        }));
        this.field3266.field3431 = false;
        this.field3268.field3431 = false;
        this.field3272.field3431 = false;
        this.field3273.field3431 = false;
        this.field3274.field3431 = false;
    }
    
    public void method3167() {
        final Class865 method2539 = this.field3271.method2539();
        this.field3264.method3377(method2539.method5212());
        this.field3269 = method2539.method5220();
        this.field3275 = this.field3271.method2550();
        this.field3276 = this.field3271.method2551();
        this.field3277 = this.field3271.method2542();
        this.method3159();
        this.method3168();
        this.method3170();
        this.method3171();
        this.field3266.field3431 = true;
        this.field3268.field3431 = true;
        this.field3272.field3431 = true;
        this.field3273.field3431 = true;
        this.field3274.field3431 = true;
    }
    
    @Override
    public void method2970(final Class869 class869, final int n, final int n2) {
        super.method2970(class869, n, n2);
        this.method3159();
        this.method3168();
        this.method3170();
        this.method3171();
        this.field3266.field3431 = true;
        this.field3268.field3431 = true;
        this.field3272.field3431 = true;
        this.field3273.field3431 = true;
        this.field3274.field3431 = true;
    }
    
    @Override
    public void method3161(final Class865 class865) {
        this.field3150.method5269().method17292(new Class4266(new Class354(class865.method5222()), this.field3264.method3378(), this.field3275, class865.method5220(), this.field3276, this.field3277));
    }
    
    private void method3168() {
        switch (Class8325.field34198[this.field3275.ordinal()]) {
            case 1: {
                this.field3272.method3367(Class8822.method30773("advMode.mode.sequence", new Object[0]));
                break;
            }
            case 2: {
                this.field3272.method3367(Class8822.method30773("advMode.mode.auto", new Object[0]));
                break;
            }
            case 3: {
                this.field3272.method3367(Class8822.method30773("advMode.mode.redstone", new Object[0]));
                break;
            }
        }
    }
    
    private void method3169() {
        switch (Class8325.field34198[this.field3275.ordinal()]) {
            case 1: {
                this.field3275 = Class2182.field12922;
                break;
            }
            case 2: {
                this.field3275 = Class2182.field12923;
                break;
            }
            case 3: {
                this.field3275 = Class2182.field12921;
                break;
            }
        }
    }
    
    private void method3170() {
        if (!this.field3276) {
            this.field3273.method3367(Class8822.method30773("advMode.mode.unconditional", new Object[0]));
        }
        else {
            this.field3273.method3367(Class8822.method30773("advMode.mode.conditional", new Object[0]));
        }
    }
    
    private void method3171() {
        if (!this.field3277) {
            this.field3274.method3367(Class8822.method30773("advMode.mode.redstoneTriggered", new Object[0]));
        }
        else {
            this.field3274.method3367(Class8822.method30773("advMode.mode.autoexec.bat", new Object[0]));
        }
    }
}
