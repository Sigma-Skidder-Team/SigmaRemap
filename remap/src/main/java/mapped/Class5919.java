// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5919 extends Class5918
{
    private final Class6300 field24317;
    private final Class6300 field24318;
    
    public Class5919(final float n) {
        this.field24269 = 256;
        this.field24270 = 256;
        (this.field24317 = new Class6300(this)).method18635("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16, n, 176, 44);
        this.field24317.method18635("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16, n, 112, 30);
        this.field24317.field25186 = true;
        this.field24317.method18635("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, n, 0, 0);
        this.field24317.method18635("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, n, 112, 0);
        this.field24317.field25186 = false;
        this.field24317.method18635("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, n, 0, 0);
        this.field24317.method18635("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, n, 112, 0);
        (this.field24318 = new Class6300(this)).method18642(0.0f, 4.0f, -8.0f);
        this.field24318.method18635("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16, n, 176, 65);
        this.field24317.method18633(this.field24318);
    }
    
    @Override
    public void method17790(final float n, final float n2, final float n3) {
        this.field24318.field25183 = (float)(Math.sin(n * 3.1415927f * 0.2f) + 1.0) * 0.2f;
        this.field24317.field25184 = n2 * 0.017453292f;
        this.field24317.field25183 = n3 * 0.017453292f;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        class7351.method22567();
        class7351.method22564(0.0, -0.37437498569488525, 0.0);
        class7351.method22565(0.75f, 0.75f, 0.75f);
        this.field24317.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
        class7351.method22568();
    }
}
