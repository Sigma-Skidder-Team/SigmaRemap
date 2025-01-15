// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1829 extends Class1799<Class808, Class5928<Class808>>
{
    private static String[] field10009;
    private final Class5928<Class808> field10010;
    
    public Class1829(final Class4778<Class808, Class5928<Class808>> class4778) {
        super(class4778);
        this.field10010 = new Class5928<Class808>(0.1f);
    }
    
    public void method6592(final Class7351 class7351, final Class7807 class7352, final int n, final Class808 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final ItemStack method4769 = class7353.method4769();
        if (method4769.method27622() instanceof Class4051) {
            final Class4051 class7354 = (Class4051)method4769.method27622();
            ((Class1799<T, Class5928<Class808>>)this).method6559().method17569(this.field10010);
            this.field10010.method17802(class7353, n2, n3, n4);
            this.field10010.method17801(class7353, n2, n3, n5, n6, n7);
            float n8;
            float n9;
            float n10;
            if (!(class7354 instanceof Class4052)) {
                n8 = 1.0f;
                n9 = 1.0f;
                n10 = 1.0f;
            }
            else {
                final int method4770 = ((Class4052)class7354).method12252(method4769);
                n8 = (method4770 >> 16 & 0xFF) / 255.0f;
                n9 = (method4770 >> 8 & 0xFF) / 255.0f;
                n10 = (method4770 & 0xFF) / 255.0f;
            }
            this.field10010.method17564(class7351, class7352.method25214(Class6332.method18770(class7354.method12249())), n, Class1904.field10335, n8, n9, n10, 1.0f);
        }
    }
}
