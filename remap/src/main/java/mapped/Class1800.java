// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Quaternion;

public class Class1800 extends Class1799<Class841, Class5876<Class841>>
{
    private static String[] field9967;
    
    public Class1800(final Class4778<Class841, Class5876<Class841>> class4778) {
        super(class4778);
    }
    
    public void method6561(final Class7351 class7351, final Class7807 class7352, final int n, final Class841 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        class7351.method22567();
        class7351.method22564(0.0, 1.0, 0.0);
        class7351.method22565(-1.0f, -1.0f, 1.0f);
        final Quaternion method778 = class7353.method5018().getOpposite().getRotation();
        method778.conjugate();
        class7351.method22566(method778);
        class7351.method22565(-1.0f, -1.0f, 1.0f);
        class7351.method22564(0.0, -1.0, 0.0);
        final Class6300 method779 = ((Class1799<T, Class5876>)this).method6559().method17624();
        method779.field25184 = n6 * 0.017453292f;
        method779.field25183 = n7 * 0.017453292f;
        final Class181 method780 = class7353.method5027();
        Class1932 field20315;
        if (method780 != null) {
            field20315 = Class4714.field20316[method780.method813()];
        }
        else {
            field20315 = Class4714.field20315;
        }
        method779.method18643(class7351, class7352.method25214(Class6332.method18767(field20315)), n, Class4710.method13982(class7353, 0.0f));
        class7351.method22568();
    }
}
