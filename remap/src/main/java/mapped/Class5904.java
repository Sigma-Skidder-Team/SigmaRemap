// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5904 extends Class5901
{
    private static String[] field24275;
    private final Class6300 field24276;
    private final Class6300 field24277;
    
    public Class5904() {
        super(Class6332::method18767);
        this.field24269 = 64;
        this.field24270 = 64;
        (this.field24276 = new Class6300(this, 0, 0)).method18638(-6.0f, -11.0f, -2.0f, 12.0f, 22.0f, 1.0f, 0.0f);
        (this.field24277 = new Class6300(this, 26, 0)).method18638(-1.0f, -3.0f, -1.0f, 2.0f, 6.0f, 6.0f, 0.0f);
    }
    
    public Class6300 method17648() {
        return this.field24276;
    }
    
    public Class6300 method17649() {
        return this.field24277;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        this.field24276.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
        this.field24277.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
    }
}
