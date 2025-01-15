// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1814<T extends Class805> extends Class1799<T, Class5931<T>>
{
    private Class6300 field9986;
    private static final Class1932 field9987;
    private static final Class1932 field9988;
    private static boolean field9989;
    private static boolean field9990;
    
    public Class1814(final Class4778<T, Class5931<T>> class4778) {
        super(class4778);
        (this.field9986 = new Class6300(((Class4710<T, Class5901>)class4778).method13979())).method18647(16, 16);
        this.field9986.field25180 = -6.0f;
        this.field9986.field25182 = -8.0f;
        this.field9986.field25184 = Class9546.field41099 / 4.0f;
        this.field9986.method18654(new int[][] { null, null, { 16, 16, 0, 0 }, { 16, 16, 0, 0 }, null, null }, 0.0f, 0.0f, 10.0f, 20.0f, 16.0f, 0.0f, 0.0f);
        this.field9986.method18654(new int[][] { null, null, null, null, { 16, 16, 0, 0 }, { 16, 16, 0, 0 } }, 10.0f, 0.0f, 0.0f, 0.0f, 16.0f, 20.0f, 0.0f);
    }
    
    public void method6575(final Class7351 class7351, final Class7807 class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!t.method2625()) {
            if (!t.method1823()) {
                final Class1658 method5305 = Class869.method5277().method5305();
                final Class7096 method5306 = t.method4708().method7992();
                final Class1932 method5307 = this.method6576(method5306);
                Class4150 method5308 = null;
                if (method5307 != null) {
                    method5308 = class7352.method25214(Class6332.method18770(method5307));
                }
                final int method5309 = Class4710.method13982(t, 0.0f);
                class7351.method22567();
                class7351.method22564(0.20000000298023224, -0.3499999940395355, 0.5);
                class7351.method22566(Class9138.field38718.method33328(-48.0f));
                class7351.method22565(-1.0f, -1.0f, 1.0f);
                class7351.method22564(-0.5, -0.5, -0.5);
                if (method5307 == null) {
                    method5305.method5795(method5306, class7351, class7352, n, method5309);
                }
                else {
                    this.field9986.method18643(class7351, method5308, n, method5309);
                }
                class7351.method22568();
                class7351.method22567();
                class7351.method22564(0.20000000298023224, -0.3499999940395355, 0.5);
                class7351.method22566(Class9138.field38718.method33328(42.0f));
                class7351.method22564(0.10000000149011612, 0.0, -0.6000000238418579);
                class7351.method22566(Class9138.field38718.method33328(-48.0f));
                class7351.method22565(-1.0f, -1.0f, 1.0f);
                class7351.method22564(-0.5, -0.5, -0.5);
                if (method5307 == null) {
                    method5305.method5795(method5306, class7351, class7352, n, method5309);
                }
                else {
                    this.field9986.method18643(class7351, method5308, n, method5309);
                }
                class7351.method22568();
                class7351.method22567();
                this.method6559().method17803().method18645(class7351);
                class7351.method22564(0.0, -0.699999988079071, -0.20000000298023224);
                class7351.method22566(Class9138.field38718.method33328(-78.0f));
                class7351.method22565(-1.0f, -1.0f, 1.0f);
                class7351.method22564(-0.5, -0.5, -0.5);
                if (method5307 == null) {
                    method5305.method5795(method5306, class7351, class7352, n, method5309);
                }
                else {
                    this.field9986.method18643(class7351, method5308, n, method5309);
                }
                class7351.method22568();
            }
        }
    }
    
    private Class1932 method6576(final Class7096 class7096) {
        final Class3833 method21696 = class7096.method21696();
        if (method21696 == Class7521.field29279 && Class1814.field9989) {
            return Class1814.field9987;
        }
        return (method21696 == Class7521.field29278 && Class1814.field9990) ? Class1814.field9988 : null;
    }
    
    public static void method6577() {
        Class1814.field9989 = Class8571.method28900(Class1814.field9987);
        Class1814.field9990 = Class8571.method28900(Class1814.field9988);
    }
    
    static {
        field9987 = new Class1932("textures/entity/cow/red_mushroom.png");
        field9988 = new Class1932("textures/entity/cow/brown_mushroom.png");
        Class1814.field9989 = false;
        Class1814.field9990 = false;
    }
}
