// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3476 extends Class3446
{
    private static String[] field16380;
    private int field16381;
    public final /* synthetic */ Class851 field16382;
    
    private Class3476(final Class851 field16382) {
        this.field16382 = field16382;
    }
    
    @Override
    public boolean method11013() {
        return this.field16382.method4152() != null && this.field16382.method2647(this.field16382.method4152(), Class7843.field32117);
    }
    
    @Override
    public void method11015() {
        this.field16381 = 10;
        Class851.method5103(this.field16382, Class2129.field12430);
        this.method11041();
    }
    
    @Override
    public void method11018() {
        Class851.method5101(this.field16382, this.field16382.field2391.method6958(Class2020.field11525, Class851.method5100(this.field16382)).method1138(10 + Class851.method5104(this.field16382).nextInt(20)));
    }
    
    @Override
    public void method11016() {
        if (Class851.method5091(this.field16382) == Class2129.field12430) {
            --this.field16381;
            if (this.field16381 <= 0) {
                Class851.method5103(this.field16382, Class2129.field12431);
                this.method11041();
                this.field16381 = (8 + Class851.method5105(this.field16382).nextInt(4)) * 20;
                this.field16382.method1695(Class8520.field35459, 10.0f, 0.95f + Class851.method5106(this.field16382).nextFloat() * 0.1f);
            }
        }
    }
    
    private void method11041() {
        Class851.method5101(this.field16382, new Class354(this.field16382.method4152()).method1138(20 + Class851.method5107(this.field16382).nextInt(20)));
        if (Class851.method5100(this.field16382).method1075() < this.field16382.field2391.method6743()) {
            Class851.method5101(this.field16382, new Class354(Class851.method5100(this.field16382).method1074(), this.field16382.field2391.method6743() + 1, Class851.method5100(this.field16382).method1076()));
        }
    }
}
