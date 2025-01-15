// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class543 extends Class541
{
    private static String[] field3278;
    private final Class865 field3279;
    
    public Class543(final Class865 field3279) {
        this.field3279 = field3279;
    }
    
    @Override
    public Class865 method3157() {
        return this.field3279;
    }
    
    @Override
    public int method3158() {
        return 150;
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field3269 = this.method3157().method5220();
        this.method3159();
        this.field3264.method3377(this.method3157().method5212());
    }
    
    @Override
    public void method3161(final Class865 class865) {
        if (class865 instanceof Class866) {
            this.field3150.method5269().method17292(new Class4401(((Class866)class865).method5226().method1643(), this.field3264.method3378(), class865.method5220()));
        }
    }
}
