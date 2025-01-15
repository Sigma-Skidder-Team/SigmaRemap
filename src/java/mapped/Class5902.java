// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class5902 extends Class5901
{
    private static String[] field24271;
    public final Class6300 field24272;
    public final Class6300 field24273;
    
    public Class5902() {
        super(Class6332::method18770);
        (this.field24272 = new Class6300(64, 32, 0, 0)).method18638(-12.0f, -14.0f, -1.0f, 24.0f, 12.0f, 2.0f, 0.0f);
        (this.field24273 = new Class6300(64, 32, 0, 14)).method18638(-1.0f, -2.0f, -1.0f, 2.0f, 14.0f, 2.0f, 0.0f);
    }
    
    @Override
    public void method17564(final Class7351 class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        this.field24272.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
        this.field24273.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
    }
}
