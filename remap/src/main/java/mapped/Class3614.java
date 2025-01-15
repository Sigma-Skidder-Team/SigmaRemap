// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3614 extends Class3446
{
    private static String[] field16805;
    private final Class839 field16806;
    public final /* synthetic */ Class839 field16807;
    
    public Class3614(final Class839 field16807, final Class839 field16808) {
        this.field16807 = field16807;
        this.field16806 = field16808;
    }
    
    @Override
    public boolean method11013() {
        return true;
    }
    
    @Override
    public void method11016() {
        if (this.field16806.method2640() <= 100) {
            if (this.field16806.method2633().nextInt(50) != 0) {
                if (Class839.method5001(this.field16806)) {
                    if (this.field16806.method5000()) {
                        return;
                    }
                }
            }
            final float n = this.field16806.method2633().nextFloat() * 6.2831855f;
            this.field16806.method4999(Class9546.method35639(n) * 0.2f, -0.1f + this.field16806.method2633().nextFloat() * 0.2f, Class9546.method35638(n) * 0.2f);
        }
        else {
            this.field16806.method4999(0.0f, 0.0f, 0.0f);
        }
    }
}
