// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class740 extends Class516<Class3424>
{
    private static final Class1932 field4010;
    
    public Class740(final Class3424 class3424, final Class464 class3425, final Class2250 class3426) {
        super(class3424, class3425, class3426);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        super.method2975(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        final String method8461 = this.field3148.method8461();
        this.field3156.method6610(method8461, (float)(this.field3075 / 2 - this.field3156.method6617(method8461) / 2), 6.0f, 4210752);
        this.field3156.method6610(this.field3078.method1871().method8461(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class740.field4010);
        this.method3186((this.field3152 - this.field3075) / 2, (this.field3153 - this.field3076) / 2, 0, 0, this.field3075, this.field3076);
    }
    
    static {
        field4010 = new Class1932("textures/gui/container/dispenser.png");
    }
}
