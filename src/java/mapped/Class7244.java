// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class7244 implements Iterator<Class354>
{
    private Class7245 field28069;
    private Class384 field28070;
    private int field28071;
    private int field28072;
    private int field28073;
    private int field28074;
    private static final int field28075 = 0;
    private static final int field28076 = 1;
    private static final int field28077 = 2;
    
    public Class7244(Class354 method22142, Class354 method22143, final int n, final int n2) {
        this.field28070 = new Class384(0, 0, 0);
        this.field28071 = 0;
        final boolean b = method22142.method1074() > method22143.method1074();
        final boolean b2 = method22142.method1075() > method22143.method1075();
        final boolean b3 = method22142.method1076() > method22143.method1076();
        method22142 = this.method22142(method22142, b, b2, b3);
        method22143 = this.method22142(method22143, b, b2, b3);
        this.field28072 = (b ? -1 : 1);
        this.field28073 = (b2 ? -1 : 1);
        this.field28074 = (b3 ? -1 : 1);
        final Class5487 method22144 = new Class5487(method22143.method1074() - method22142.method1074(), method22143.method1075() - method22142.method1075(), method22143.method1076() - method22142.method1076()).method16738();
        final double abs = Math.abs(method22144.method16739(new Class5487(1.0, 0.0, 0.0)));
        final double abs2 = Math.abs(method22144.method16739(new Class5487(0.0, 1.0, 0.0)));
        final double abs3 = Math.abs(method22144.method16739(new Class5487(0.0, 0.0, 1.0)));
        if (abs3 >= abs2 && abs3 >= abs) {
            this.field28071 = 2;
            final Class354 class354 = new Class354(method22142.method1076(), method22142.method1075() - n, method22142.method1074() - n2);
            final Class354 class355 = new Class354(method22143.method1076(), method22142.method1075() + n + 1, method22142.method1074() + n2 + 1);
            final int n3 = method22143.method1076() - method22142.method1076();
            this.field28069 = new Class7245(class354, class355, (method22143.method1075() - method22142.method1075()) / (1.0 * n3), (method22143.method1074() - method22142.method1074()) / (1.0 * n3));
        }
        else if (abs2 >= abs && abs2 >= abs3) {
            this.field28071 = 1;
            final Class354 class356 = new Class354(method22142.method1075(), method22142.method1074() - n, method22142.method1076() - n2);
            final Class354 class357 = new Class354(method22143.method1075(), method22142.method1074() + n + 1, method22142.method1076() + n2 + 1);
            final int n4 = method22143.method1075() - method22142.method1075();
            this.field28069 = new Class7245(class356, class357, (method22143.method1074() - method22142.method1074()) / (1.0 * n4), (method22143.method1076() - method22142.method1076()) / (1.0 * n4));
        }
        else {
            this.field28071 = 0;
            final Class354 class358 = new Class354(method22142.method1074(), method22142.method1075() - n, method22142.method1076() - n2);
            final Class354 class359 = new Class354(method22143.method1074(), method22142.method1075() + n + 1, method22142.method1076() + n2 + 1);
            final int n5 = method22143.method1074() - method22142.method1074();
            this.field28069 = new Class7245(class358, class359, (method22143.method1075() - method22142.method1075()) / (1.0 * n5), (method22143.method1076() - method22142.method1076()) / (1.0 * n5));
        }
    }
    
    private Class354 method22142(Class354 class354, final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            class354 = new Class354(-class354.method1074(), class354.method1075(), class354.method1076());
        }
        if (b2) {
            class354 = new Class354(class354.method1074(), -class354.method1075(), class354.method1076());
        }
        if (b3) {
            class354 = new Class354(class354.method1074(), class354.method1075(), -class354.method1076());
        }
        return class354;
    }
    
    @Override
    public boolean hasNext() {
        return this.field28069.hasNext();
    }
    
    @Override
    public Class354 next() {
        final Class354 next = this.field28069.next();
        switch (this.field28071) {
            case 0: {
                this.field28070.method1279(next.method1074() * this.field28072, next.method1075() * this.field28073, next.method1076() * this.field28074);
                return this.field28070;
            }
            case 1: {
                this.field28070.method1279(next.method1075() * this.field28072, next.method1074() * this.field28073, next.method1076() * this.field28074);
                return this.field28070;
            }
            case 2: {
                this.field28070.method1279(next.method1076() * this.field28072, next.method1075() * this.field28073, next.method1074() * this.field28074);
                return this.field28070;
            }
            default: {
                this.field28070.method1279(next.method1074() * this.field28072, next.method1075() * this.field28073, next.method1076() * this.field28074);
                return this.field28070;
            }
        }
    }
    
    @Override
    public void remove() {
        throw new RuntimeException("Not supported");
    }
    
    public static void main(final String[] array) {
        final Class7244 class7244 = new Class7244(new Class354(10, 20, 30), new Class354(30, 40, 20), 1, 1);
        while (class7244.hasNext()) {
            System.out.println("" + class7244.next());
        }
    }
}
