// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5918 extends Class5901
{
    private static String[] field24315;
    public final Class6300 field24316;
    
    public Class5918() {
        this(0, 35, 64, 64);
    }
    
    public Class5918(final int n, final int n2, final int field24269, final int field24270) {
        super(Class6332::method18773);
        this.field24269 = field24269;
        this.field24270 = field24270;
        (this.field24316 = new Class6300(this, n, n2)).method18638(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, 0.0f);
        this.field24316.method18642(0.0f, 0.0f, 0.0f);
    }
    
    public void method17790(final float n, final float n2, final float n3) {
        this.field24316.field25184 = n2 * 0.017453292f;
        this.field24316.field25183 = n3 * 0.017453292f;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        this.field24316.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
    }
}
