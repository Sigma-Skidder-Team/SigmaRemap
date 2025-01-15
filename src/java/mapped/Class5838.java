// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5838<T extends Class802> extends Class5839<T>
{
    private static String[] field23933;
    private float field23934;
    
    public Class5838() {
        super(12, 0.0f, false, 8.0f, 4.0f, 2.0f, 2.0f, 24);
        (this.field23936 = new Class6300(this, 0, 0)).method18638(-3.0f, -4.0f, -6.0f, 6.0f, 6.0f, 8.0f, 0.0f);
        this.field23936.method18642(0.0f, 6.0f, -8.0f);
        (this.field23937 = new Class6300(this, 28, 8)).method18638(-4.0f, -10.0f, -7.0f, 8.0f, 16.0f, 6.0f, 0.0f);
        this.field23937.method18642(0.0f, 5.0f, 2.0f);
    }
    
    public void method17555(final T t, final float n, final float n2, final float n3) {
        super.method17558(t, n, n2, n3);
        this.field23936.field25181 = 6.0f + t.method4631(n3) * 9.0f;
        this.field23934 = t.method4632(n3);
    }
    
    public void method17556(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17557(t, n, n2, n3, n4, n5);
        this.field23936.field25183 = this.field23934;
    }
}
