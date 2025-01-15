// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3535 extends Class3531
{
    private static String[] field16571;
    private int field16572;
    public final /* synthetic */ Class769 field16573;
    
    private Class3535(final Class769 field16573) {
        this.field16573 = field16573;
        super(field16573);
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && this.field16573.method4152() != null && this.field16573.method4152().method1643() != this.field16572 && this.field16573.field2391.method6784(new BlockPos(this.field16573)).method35974((float)Class2113.field12292.ordinal());
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16572 = this.field16573.method4152().method1643();
    }
    
    @Override
    public int method11084() {
        return 20;
    }
    
    @Override
    public int method11085() {
        return 180;
    }
    
    @Override
    public void method11082() {
        this.field16573.method4152().method2655(new Class1948(Class9439.field40488, 400));
    }
    
    @Override
    public Class7795 method11086() {
        return Class8520.field35309;
    }
    
    @Override
    public Class2107 method11087() {
        return Class2107.field12218;
    }
}
