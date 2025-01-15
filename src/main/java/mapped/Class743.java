// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class743 extends Class516<Class3421>
{
    private static final Class1932 field4016;
    private static final int[] field4017;
    
    public Class743(final Class3421 class3421, final Class464 class3422, final Class2250 class3423) {
        super(class3421, class3422, class3423);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        super.method2975(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.field3156.method6610(this.field3148.method8461(), (float)(this.field3075 / 2 - this.field3156.method6617(this.field3148.method8461()) / 2), 6.0f, 4210752);
        this.field3156.method6610(this.field3078.method1871().method8461(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class743.field4016);
        final int n4 = (this.field3152 - this.field3075) / 2;
        final int n5 = (this.field3153 - this.field3076) / 2;
        this.method3186(n4, n5, 0, 0, this.field3075, this.field3076);
        final int method35651 = Class9546.method35651((18 * ((Class3421)this.field3077).method10902() + 20 - 1) / 20, 0, 18);
        if (method35651 > 0) {
            this.method3186(n4 + 60, n5 + 44, 176, 29, method35651, 4);
        }
        final int method35652 = ((Class3421)this.field3077).method10903();
        if (method35652 > 0) {
            final int n6 = (int)(28.0f * (1.0f - method35652 / 400.0f));
            if (n6 > 0) {
                this.method3186(n4 + 97, n5 + 16, 176, 0, 9, n6);
            }
            final int n7 = Class743.field4017[method35652 / 2 % 7];
            if (n7 > 0) {
                this.method3186(n4 + 63, n5 + 14 + 29 - n7, 185, 29 - n7, 12, n7);
            }
        }
    }
    
    static {
        field4016 = new Class1932("textures/gui/container/brewing_stand.png");
        field4017 = new int[] { 29, 24, 20, 16, 11, 6, 0 };
    }
}
