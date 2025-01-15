// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3508 extends Class3507
{
    private static String[] field16498;
    private final Class830 field16499;
    
    public Class3508(final Class768 class768, final double n, final int n2, final float n3) {
        super(class768, n, n2, n3);
        this.field16499 = (Class830)class768;
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && this.field16499.method2713().method27622() == Class7739.field31607;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16499.method4213(true);
        this.field16499.method2762(Class316.field1877);
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16499.method2770();
        this.field16499.method4213(false);
    }
}
