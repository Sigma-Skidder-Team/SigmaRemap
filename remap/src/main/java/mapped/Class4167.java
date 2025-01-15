// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.Calendar;

public class Class4167<T extends Class436 & Class476> extends Class4158<T>
{
    private static String[] field18567;
    private final Class6300 field18568;
    private final Class6300 field18569;
    private final Class6300 field18570;
    private final Class6300 field18571;
    private final Class6300 field18572;
    private final Class6300 field18573;
    private final Class6300 field18574;
    private final Class6300 field18575;
    private final Class6300 field18576;
    private boolean field18577;
    
    public Class4167(final Class9550 class9550) {
        super(class9550);
        final Calendar instance = Calendar.getInstance();
        if (instance.get(2) + 1 == 12) {
            if (instance.get(5) >= 24) {
                if (instance.get(5) <= 26) {
                    this.field18577 = true;
                }
            }
        }
        (this.field18569 = new Class6300(64, 64, 0, 19)).method18638(1.0f, 0.0f, 1.0f, 14.0f, 10.0f, 14.0f, 0.0f);
        (this.field18568 = new Class6300(64, 64, 0, 0)).method18638(1.0f, 0.0f, 0.0f, 14.0f, 5.0f, 14.0f, 0.0f);
        this.field18568.field25181 = 9.0f;
        this.field18568.field25182 = 1.0f;
        (this.field18570 = new Class6300(64, 64, 0, 0)).method18638(7.0f, -1.0f, 15.0f, 2.0f, 4.0f, 1.0f, 0.0f);
        this.field18570.field25181 = 8.0f;
        (this.field18572 = new Class6300(64, 64, 0, 19)).method18638(1.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f, 0.0f);
        (this.field18571 = new Class6300(64, 64, 0, 0)).method18638(1.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f, 0.0f);
        this.field18571.field25181 = 9.0f;
        this.field18571.field25182 = 1.0f;
        (this.field18573 = new Class6300(64, 64, 0, 0)).method18638(15.0f, -1.0f, 15.0f, 1.0f, 4.0f, 1.0f, 0.0f);
        this.field18573.field25181 = 8.0f;
        (this.field18575 = new Class6300(64, 64, 0, 19)).method18638(0.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f, 0.0f);
        (this.field18574 = new Class6300(64, 64, 0, 0)).method18638(0.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f, 0.0f);
        this.field18574.field25181 = 9.0f;
        this.field18574.field25182 = 1.0f;
        (this.field18576 = new Class6300(64, 64, 0, 0)).method18638(0.0f, -1.0f, 15.0f, 1.0f, 4.0f, 1.0f, 0.0f);
        this.field18576.field25181 = 8.0f;
    }
    
    @Override
    public void method12454(final T t, final float n, final Class7351 class7351, final Class7807 class7352, final int n2, final int n3) {
        final Class1847 method2186 = t.method2186();
        final boolean b = method2186 != null;
        final Class7096 class7353 = b ? t.method2194() : ((Class7097<O, Class7096>)Class7521.field29292.method11878()).method21773((Class7111<Comparable>)Class3865.field17497, Class179.field514);
        final Class180 class7354 = class7353.method21771(Class3865.field17498) ? class7353.method21772(Class3865.field17498) : Class180.field530;
        final Class3833 method2187 = class7353.method21696();
        if (method2187 instanceof Class3864) {
            final Class3864 class7355 = (Class3864)method2187;
            final boolean b2 = class7354 != Class180.field530;
            class7351.method22567();
            final float method2188 = class7353.method21772((Class7111<Class179>)Class3865.field17497).method797();
            class7351.method22564(0.5, 0.5, 0.5);
            class7351.method22566(Class9138.field38718.method33328(-method2188));
            class7351.method22564(-0.5, -0.5, -0.5);
            Class7191 method2189;
            if (!b) {
                method2189 = Class6389::method19072;
            }
            else {
                method2189 = class7355.method11929(class7353, method2186, t.method2193(), true);
            }
            final float n4 = 1.0f - ((Float2FloatFunction)method2189.method22074(Class3865.method11937(t))).get(n);
            final float n5 = 1.0f - n4 * n4 * n4;
            final int applyAsInt = ((Int2IntFunction)method2189.method22074(new Class6388<Object>())).applyAsInt(n2);
            final Class4150 method2190 = Class8752.method30270(t, class7354, this.field18577).method11334(class7352, Class6332::method18768);
            if (!b2) {
                this.method12475(class7351, method2190, this.field18568, this.field18570, this.field18569, n5, applyAsInt, n3);
            }
            else if (class7354 != Class180.field531) {
                this.method12475(class7351, method2190, this.field18571, this.field18573, this.field18572, n5, applyAsInt, n3);
            }
            else {
                this.method12475(class7351, method2190, this.field18574, this.field18576, this.field18575, n5, applyAsInt, n3);
            }
            class7351.method22568();
        }
    }
    
    private void method12475(final Class7351 class7351, final Class4150 class7352, final Class6300 class7353, final Class6300 class7354, final Class6300 class7355, final float n, final int n2, final int n3) {
        class7353.field25183 = -(n * 1.5707964f);
        class7354.field25183 = class7353.field25183;
        class7353.method18643(class7351, class7352, n2, n3);
        class7354.method18643(class7351, class7352, n2, n3);
        class7355.method18643(class7351, class7352, n2, n3);
    }
}
