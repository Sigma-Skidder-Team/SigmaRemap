// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1808 extends Class1799<Class791, Class5840<Class791>>
{
    private static String[] field9979;
    
    public Class1808(final Class4778<Class791, Class5840<Class791>> class4778) {
        super(class4778);
    }
    
    public void method6568(final Class7351 class7351, final Class7807 class7352, final int n, final Class791 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final Class8321 method2718 = class7353.method2718(Class2215.field13600);
        if (class7353.method4374()) {
            if (!class7353.method4398()) {
                float n8 = -0.6f;
                float n9 = 1.4f;
                if (class7353.method4378()) {
                    n8 -= 0.2f * Class9546.method35638(n5 * 0.6f) + 0.2f;
                    n9 -= 0.09f * Class9546.method35638(n5 * 0.6f);
                }
                class7351.method22567();
                class7351.method22564(0.10000000149011612, n9, n8);
                Class869.method5277().method5308().method35143(class7353, method2718, Class2016.field11493, false, class7351, class7352, n);
                class7351.method22568();
            }
        }
    }
}
