// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6190 extends Class6159
{
    private static String[] field25004;
    
    private Class6190(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3);
        this.field24951 = 4;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25660;
    }
    
    @Override
    public void method18432(final Class4150 class4150, final Class6092 class4151, final float n) {
        this.method18436(0.6f - (this.field24950 + n - 1.0f) * 0.25f * 0.5f);
        super.method18432(class4150, class4151, n);
    }
    
    @Override
    public float method18430(final float n) {
        return 7.1f * Class9546.method35638((this.field24950 + n - 1.0f) * 0.25f * 3.1415927f);
    }
}
