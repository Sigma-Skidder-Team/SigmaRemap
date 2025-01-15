// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;

import java.util.List;

public class Class4159 extends Class4158<Class497>
{
    private final Class5902 field18542;
    private static double field18543;
    
    public Class4159(final Class9550 class9550) {
        super(class9550);
        this.field18542 = new Class5902();
    }
    
    public void method12460(final Class497 class497, final float n, final Class7351 class498, final Class7807 class499, final int n2, final int n3) {
        final Class7096 method2194 = class497.method2194();
        class498.method22567();
        if (!(method2194.method21696() instanceof Class3861)) {
            class498.method22564(0.5, 0.5, 0.5);
            class498.method22566(Vector3f.field38718.rotationDegrees(-method2194.method21772((Class7111<Direction>)Class3862.field17489).getHorizontalAngle()));
            class498.method22564(0.0, -0.3125, -0.4375);
            this.field18542.field24273.field25187 = false;
        }
        else {
            class498.method22564(0.5, 0.5, 0.5);
            class498.method22566(Vector3f.field38718.rotationDegrees(-(method2194.method21772((Class7111<Integer>)Class3861.field17487) * 360 / 16.0f)));
            this.field18542.field24273.field25187 = true;
        }
        class498.method22567();
        class498.method22565(0.6666667f, -0.6666667f, -0.6666667f);
        final Class4150 method2195 = method12461(method2194.method21696()).method11334(class499, this.field18542::method17647);
        this.field18542.field24272.method18643(class498, method2195, n2, n3);
        this.field18542.field24273.method18643(class498, method2195, n2, n3);
        class498.method22568();
        if (method12462(class497)) {
            final Class1844 method2196 = this.field18539.method35731();
            class498.method22564(0.0, 0.3333333432674408, 0.046666666865348816);
            class498.method22565(0.010416667f, -0.010416667f, 0.010416667f);
            int n4 = class497.method2529().method818();
            if (Class8571.method28945()) {
                n4 = Class8763.method30386(n4);
            }
            final int method2197 = Class1846.method6673(0, (int)(Class1846.method6672(n4) * 0.4), (int)(Class1846.method6671(n4) * 0.4), (int)(Class1846.method6670(n4) * 0.4));
            for (int i = 0; i < 4; ++i) {
                final String method2198 = class497.method2522(i, class502 -> {
                    Class8936.method31697(class502, 90, class500, (boolean)(0 != 0), (boolean)(1 != 0));
                    final List list;
                    return list.isEmpty() ? "" : list.get(0).method8461();
                });
                if (method2198 != null) {
                    method2196.method6613(method2198, (float)(-method2196.method6617(method2198) / 2), (float)(i * 10 - class497.field2850.length * 5), method2197, false, class498.method22569().method32111(), class499, false, 0, n2);
                }
            }
        }
        class498.method22568();
    }
    
    public static Class3687 method12461(final Class3833 class3833) {
        Class8289 class3834;
        if (!(class3833 instanceof Class3860)) {
            class3834 = Class8289.field34085;
        }
        else {
            class3834 = ((Class3860)class3833).method11928();
        }
        return Class8752.method30268(class3834);
    }
    
    private static boolean method12462(final Class497 class497) {
        if (!Class9216.field39049) {
            if (!Class8571.field36033) {
                final Entity method5303 = Class869.method5277().method5303();
                if (class497.method2191(method5303.method1938(), method5303.method1941(), method5303.method1945()) > Class4159.field18543) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static void method12463() {
        final Class869 method5277 = Class869.method5277();
        final double max = Math.max(1.5 * method5277.method5332().method7695() / Class8571.method28867(method5277.field4648.field23471, 1.0, 120.0), 16.0);
        Class4159.field18543 = max * max;
    }
    
    static {
        Class4159.field18543 = 4096.0;
    }
}
