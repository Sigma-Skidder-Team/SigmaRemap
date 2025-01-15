// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1842 extends Class1799<Class754, Class5860<Class754>>
{
    public Class1842(final Class4778<Class754, Class5860<Class754>> class4778) {
        super(class4778);
    }
    
    public void method6584(final Class7351 class7351, final Class7807 class7352, final int n, final Class754 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if ("deadmau5".equals(class7353.method1841().getString())) {
            if (class7353.method4096()) {
                if (!class7353.method1823()) {
                    final Class4150 method25214 = class7352.method25214(Class6332.method18767(class7353.method4097()));
                    final int method25215 = Class4710.method13982(class7353, 0.0f);
                    for (int i = 0; i < 2; ++i) {
                        final float n8 = Class9546.method35700(n4, class7353.field2401, class7353.field2399) - Class9546.method35700(n4, class7353.field2952, class7353.field2951);
                        final float method25216 = Class9546.method35700(n4, class7353.field2402, class7353.field2400);
                        class7351.method22567();
                        class7351.method22566(Class9138.field38718.method33328(n8));
                        class7351.method22566(Class9138.field38716.method33328(method25216));
                        class7351.method22564(0.375f * (i * 2 - 1), 0.0, 0.0);
                        class7351.method22564(0.0, -0.375, 0.0);
                        class7351.method22566(Class9138.field38716.method33328(-method25216));
                        class7351.method22566(Class9138.field38718.method33328(-n8));
                        class7351.method22565(1.3333334f, 1.3333334f, 1.3333334f);
                        ((Class1799<T, Class5860>)this).method6559().method17593(class7351, method25214, n, method25215);
                        class7351.method22568();
                    }
                }
            }
        }
    }
}
