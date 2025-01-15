// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4702 extends Class4703<Class858>
{
    private static final Class1932 field20277;
    private static final Class6332 field20278;
    private static final float field20279;
    private final Class6300 field20280;
    private final Class6300 field20281;
    private final Class6300 field20282;
    
    public Class4702(final Class8551 class8551) {
        super(class8551);
        this.field20284 = 0.5f;
        (this.field20281 = new Class6300(64, 32, 0, 0)).method18636(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        (this.field20280 = new Class6300(64, 32, 32, 0)).method18636(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        (this.field20282 = new Class6300(64, 32, 0, 16)).method18636(-6.0f, 0.0f, -6.0f, 12.0f, 4.0f, 12.0f);
    }
    
    public void method13946(final Class858 class858, final float n, final float n2, final Class7351 class859, final Class7807 class860, final int n3) {
        class859.method22567();
        final float method13947 = method13947(class858, n2);
        final float n4 = (class858.field4592 + n2) * 3.0f;
        final Class4150 method13948 = class860.method25214(Class4702.field20278);
        class859.method22567();
        class859.method22565(2.0f, 2.0f, 2.0f);
        class859.method22564(0.0, -0.5, 0.0);
        final int field10335 = Class1904.field10335;
        if (class858.method5185()) {
            this.field20282.method18643(class859, method13948, n3, field10335);
        }
        class859.method22566(Class9138.field38718.method33328(n4));
        class859.method22564(0.0, 1.5f + method13947 / 2.0f, 0.0);
        class859.method22566(new Class9389(new Class9138(Class4702.field20279, 0.0f, Class4702.field20279), 60.0f, true));
        this.field20281.method18643(class859, method13948, n3, field10335);
        class859.method22565(0.875f, 0.875f, 0.875f);
        class859.method22566(new Class9389(new Class9138(Class4702.field20279, 0.0f, Class4702.field20279), 60.0f, true));
        class859.method22566(Class9138.field38718.method33328(n4));
        this.field20281.method18643(class859, method13948, n3, field10335);
        class859.method22565(0.875f, 0.875f, 0.875f);
        class859.method22566(new Class9389(new Class9138(Class4702.field20279, 0.0f, Class4702.field20279), 60.0f, true));
        class859.method22566(Class9138.field38718.method33328(n4));
        this.field20280.method18643(class859, method13948, n3, field10335);
        class859.method22568();
        class859.method22568();
        final Class354 method13949 = class858.method5183();
        if (method13949 != null) {
            final float n5 = method13949.method1074() + 0.5f;
            final float n6 = method13949.method1075() + 0.5f;
            final float n7 = method13949.method1076() + 0.5f;
            final float n8 = (float)(n5 - class858.method1938());
            final float n9 = (float)(n6 - class858.method1941());
            final float n10 = (float)(n7 - class858.method1945());
            class859.method22564(n8, n9, n10);
            Class4794.method14184(-n8, -n9 + method13947, -n10, n2, class858.field4592, class859, class860, n3);
        }
        super.method13951(class858, n, n2, class859, class860, n3);
    }
    
    public static float method13947(final Class858 class858, final float n) {
        final float n2 = Class9546.method35638((class858.field4592 + n) * 0.2f) / 2.0f + 0.5f;
        return (n2 * n2 + n2) * 0.4f - 1.4f;
    }
    
    public Class1932 method13948(final Class858 class858) {
        return Class4702.field20277;
    }
    
    public boolean method13949(final Class858 class858, final Class6664 class859, final double n, final double n2, final double n3) {
        return super.method13952(class858, class859, n, n2, n3) || class858.method5183() != null;
    }
    
    static {
        field20277 = new Class1932("textures/entity/end_crystal/end_crystal.png");
        field20278 = Class6332.method18770(Class4702.field20277);
        field20279 = (float)Math.sin(0.7853981633974483);
    }
}
