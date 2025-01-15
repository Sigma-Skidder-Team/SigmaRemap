// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5905 extends Class5901
{
    public static final Class1932 field24278;
    private final Class6300 field24279;
    
    public Class5905() {
        super(Class6332::method18767);
        (this.field24279 = new Class6300(32, 32, 0, 6)).method18638(-0.5f, 2.0f, -0.5f, 1.0f, 25.0f, 1.0f, 0.0f);
        final Class6300 class6300 = new Class6300(32, 32, 4, 0);
        class6300.method18636(-1.5f, 0.0f, -0.5f, 3.0f, 2.0f, 1.0f);
        this.field24279.method18633(class6300);
        final Class6300 class6301 = new Class6300(32, 32, 4, 3);
        class6301.method18636(-2.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f);
        this.field24279.method18633(class6301);
        final Class6300 class6302 = new Class6300(32, 32, 0, 0);
        class6302.method18638(-0.5f, -4.0f, -0.5f, 1.0f, 4.0f, 1.0f, 0.0f);
        this.field24279.method18633(class6302);
        final Class6300 class6303 = new Class6300(32, 32, 4, 3);
        class6303.field25186 = true;
        class6303.method18636(1.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f);
        this.field24279.method18633(class6303);
    }
    
    @Override
    public void method17564(final Class7351 class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        this.field24279.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
    }
    
    static {
        field24278 = new Class1932("textures/entity/trident.png");
    }
}
