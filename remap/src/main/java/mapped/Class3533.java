// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3533 extends Class3531
{
    private static String[] field16565;
    private final Class7843 field16566;
    public final /* synthetic */ Class771 field16567;
    
    private Class3533(final Class771 field16567) {
        this.field16567 = field16567;
        super(field16567);
        this.field16566 = new Class7843().method25337(16.0).method25340().method25342().method25338().method25339();
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && Class771.method4273(this.field16567).nextInt(8) + 1 > this.field16567.field2391.method7142((Class<? extends Class511>)Class843.class, this.field16566, (Class511)this.field16567, this.field16567.method1886().method18496(16.0)).size();
    }
    
    @Override
    public int method11084() {
        return 100;
    }
    
    @Override
    public int method11085() {
        return 340;
    }
    
    @Override
    public void method11082() {
        for (int i = 0; i < 3; ++i) {
            final BlockPos method1134 = new BlockPos(this.field16567).method1134(-2 + Class771.method4274(this.field16567).nextInt(5), 1, -2 + Class771.method4275(this.field16567).nextInt(5));
            final Class843 class843 = Class7499.field29041.method23371(this.field16567.field2391);
            class843.method1729(method1134, 0.0f, 0.0f);
            class843.method4188(this.field16567.field2391, this.field16567.field2391.method6784(method1134), Class2101.field12179, null, null);
            class843.method5043(this.field16567);
            class843.method5038(method1134);
            class843.method5044(20 * (30 + Class771.method4276(this.field16567).nextInt(90)));
            this.field16567.field2391.method6886(class843);
        }
    }
    
    @Override
    public Class7795 method11086() {
        return Class8520.field35183;
    }
    
    @Override
    public Class2107 method11087() {
        return Class2107.field12214;
    }
}
