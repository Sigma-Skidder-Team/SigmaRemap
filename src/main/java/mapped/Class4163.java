// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4163 extends Class4158<Class448>
{
    private static String[] field18550;
    
    public Class4163(final Class9550 class9550) {
        super(class9550);
    }
    
    public void method12469(final Class448 class448, final float n, final Class7351 class449, final Class7807 class450, final int n2, final int n3) {
        final Class179 class451 = class448.method2194().method21772((Class7111<Class179>)Class3918.field17763);
        final Class2265<Class8321> method2270 = class448.method2270();
        for (int i = 0; i < method2270.size(); ++i) {
            final Class8321 class452 = method2270.get(i);
            if (class452 != Class8321.field34174) {
                class449.method22567();
                class449.method22564(0.5, 0.44921875, 0.5);
                class449.method22566(Class9138.field38718.method33328(-Class179.method793((i + class451.method780()) % 4).method797()));
                class449.method22566(Class9138.field38716.method33328(90.0f));
                class449.method22564(-0.3125, -0.3125, 0.0);
                class449.method22565(0.375f, 0.375f, 0.375f);
                Class869.method5277().method5307().method6536(class452, Class2016.field11494, n2, n3, class449, class450);
                class449.method22568();
            }
        }
    }
}
