// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3585 extends Class3574
{
    private static String[] field16711;
    
    public Class3585(final Class846 class846) {
        super(class846, 1.0, true);
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && !this.field16685.method1806();
    }
    
    @Override
    public boolean method11017() {
        if (this.field16685.method1726() >= 0.5f && this.field16685.method2633().nextInt(100) == 0) {
            this.field16685.method4153(null);
            return false;
        }
        return super.method11017();
    }
    
    @Override
    public double method11117(final Class511 class511) {
        return 4.0f + class511.method1930();
    }
}
