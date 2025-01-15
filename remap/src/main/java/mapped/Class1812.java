// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1812 extends Class1799<Class803, Class5927<Class803>>
{
    private static String[] field9983;
    
    public Class1812(final Class4778<Class803, Class5927<Class803>> class4778) {
        super(class4778);
    }
    
    public void method6573(final Class7351 class7351, final Class7807 class7352, final int n, final Class803 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final boolean method2783 = class7353.method2783();
        final boolean method2784 = class7353.method2625();
        class7351.method22567();
        if (method2784) {
            class7351.method22565(0.75f, 0.75f, 0.75f);
            class7351.method22564(0.0, 0.5, 0.20937499403953552);
        }
        class7351.method22564(((Class1799<T, Class5927>)this).method6559().field24363.field25180 / 16.0f, ((Class1799<T, Class5927>)this).method6559().field24363.field25181 / 16.0f, ((Class1799<T, Class5927>)this).method6559().field24363.field25182 / 16.0f);
        class7351.method22566(Vector3f.ZP.method33327(class7353.method4671(n4)));
        class7351.method22566(Vector3f.field38718.rotationDegrees(n6));
        class7351.method22566(Vector3f.XP.rotationDegrees(n7));
        if (!class7353.method2625()) {
            if (!method2783) {
                class7351.method22564(0.05999999865889549, 0.27000001072883606, -0.5);
            }
            else {
                class7351.method22564(0.46000000834465027, 0.25999999046325684, 0.2199999988079071);
            }
        }
        else if (!method2783) {
            class7351.method22564(0.05999999865889549, 0.25999999046325684, -0.5);
        }
        else {
            class7351.method22564(0.4000000059604645, 0.25999999046325684, 0.15000000596046448);
        }
        class7351.method22566(Vector3f.XP.rotationDegrees(90.0f));
        if (method2783) {
            class7351.method22566(Vector3f.ZP.rotationDegrees(90.0f));
        }
        Class869.method5277().method5308().method35143(class7353, class7353.method2718(Class2215.field13600), Class2016.field11493, false, class7351, class7352, n);
        class7351.method22568();
    }
}
