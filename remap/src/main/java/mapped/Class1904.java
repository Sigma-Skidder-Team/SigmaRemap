// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1904 implements AutoCloseable
{
    private static String[] field10334;
    public static final int field10335;
    private final Class1773 field10336;
    
    public Class1904() {
        this.field10336 = new Class1773(16, 16, false);
        final Class1846 method6328 = this.field10336.method6328();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                if (i >= 8) {
                    method6328.method6648(j, i, (int)((1.0f - j / 15.0f * 0.75f) * 255.0f) << 24 | 0xFFFFFF);
                }
                else {
                    method6328.method6648(j, i, -1308622593);
                }
            }
        }
        RenderSystem.method30039(33985);
        this.field10336.method5872();
        RenderSystem.method30057(5890);
        RenderSystem.method30058();
        RenderSystem.method30063(0.06666667f, 0.06666667f, 0.06666667f);
        RenderSystem.method30057(5888);
        this.field10336.method5872();
        method6328.method6654(0, 0, 0, 0, 0, method6328.method6644(), method6328.method6645(), false, true, false, false);
        RenderSystem.method30039(33984);
    }
    
    @Override
    public void close() {
        this.field10336.close();
    }
    
    public void method7384() {
        if (!Class9216.method33922()) {
            RenderSystem.method30105(this.field10336::method5869, 16);
        }
    }
    
    public static int method7385(final float n) {
        return (int)(n * 15.0f);
    }
    
    public static int method7386(final boolean b) {
        return b ? 3 : 10;
    }
    
    public static int method7387(final int n, final int n2) {
        return n | n2 << 16;
    }
    
    public static int method7388(final float n, final boolean b) {
        return method7387(method7385(n), method7386(b));
    }
    
    public void method7389() {
        if (!Class9216.method33922()) {
            RenderSystem.method30106();
        }
    }
    
    static {
        field10335 = method7387(0, 10);
    }
}
