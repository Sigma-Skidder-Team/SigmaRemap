// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5920 extends Class5918
{
    private static String[] field24319;
    private final Class6300 field24320;
    
    public Class5920() {
        super(0, 0, 64, 64);
        (this.field24320 = new Class6300(this, 32, 0)).method18638(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, 0.25f);
        this.field24320.method18642(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void method17790(final float n, final float n2, final float n3) {
        super.method17790(n, n2, n3);
        this.field24320.field25184 = this.field24316.field25184;
        this.field24320.field25183 = this.field24316.field25183;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        super.method17564(class7351, class7352, n, n2, n3, n4, n5, n6);
        this.field24320.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
    }
}
