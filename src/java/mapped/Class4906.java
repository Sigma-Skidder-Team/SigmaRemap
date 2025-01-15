// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4906 extends Class4841
{
    private static String[] field20591;
    private boolean field20985;
    private Class9572 field20986;
    
    public Class4906(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final boolean field20985) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20985 = true;
        this.field20986 = new Class9572(100, 100);
        this.field20985 = field20985;
    }
    
    @Override
    public void method14205(float n) {
        this.field20986.method35855(this.method14308() ? Class2186.field12964 : Class2186.field12965);
        n *= 0.09f + 0.25f * this.field20986.method35858() + (this.field20985 ? 0.0f : 0.2f);
        Class8154.method26874((float)(this.field20478 + 10), (float)(this.field20479 + 16), 5.0f, 14.0f, Class6430.method19118(Class265.field1278.field1292, n));
        Class8154.method26874((float)(this.field20478 + 17), (float)(this.field20479 + 10), 5.0f, 20.0f, Class6430.method19118(Class265.field1278.field1292, n));
        Class8154.method26874((float)(this.field20478 + 24), (float)(this.field20479 + 20), 5.0f, 10.0f, Class6430.method19118(Class265.field1278.field1292, n));
        super.method14205(n);
    }
    
    public void method14738(final boolean field20985) {
        this.field20985 = field20985;
    }
}
