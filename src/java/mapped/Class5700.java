// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Class5700 extends Class5611
{
    private final Supplier<Class7437> field23142;
    private final Consumer<String> field23143;
    private final Class5077 field23144;
    private final int field23145;
    private int field23146;
    private Class9230 field23147;
    
    public Class5700(final int n, final int n2, final int n3, final int n4, final Supplier<Class7437> field23142, final Consumer<String> field23143, final int n5, final int field23144, final Class5077 field23145) {
        super(n5, n, n2, n3, n4, "");
        this.field23142 = field23142;
        this.field23145 = field23144;
        this.field23143 = field23143;
        this.field23144 = field23145;
    }
    
    @Override
    public void method16920(final int n, final int n2, final float n3) {
        super.method16920(n, n2, n3);
    }
    
    @Override
    public void method16922() {
        ++this.field23146;
        final Class7437 class7437 = this.field23142.get();
        if (class7437 != null) {
            final Class7424 class7438 = class7437.field28683.get(this.field23145);
            final boolean b = this.field23145 == 4;
            boolean equals;
            String method22842;
            long field28608;
            String s;
            boolean field28609;
            if (!b) {
                equals = (class7437.field28688 == this.field23145 && !class7437.field28687.equals(Class271.field1472));
                method22842 = class7438.method22842(this.field23145);
                field28608 = class7438.field28608;
                s = class7438.field28609;
                field28609 = class7438.field28611;
            }
            else {
                equals = class7437.field28687.equals(Class271.field1472);
                method22842 = "Minigame";
                field28608 = class7437.field28690;
                s = class7437.field28691;
                field28609 = (class7437.field28690 == -1);
            }
            String s2 = null;
            Class2210 class7439;
            if (!equals) {
                if (!b) {
                    class7439 = Class2210.field13469;
                    s2 = Class7847.method25379("mco.configure.world.slot.tooltip", new Object[0]);
                }
                else if (!class7437.field28684) {
                    class7439 = Class2210.field13469;
                    s2 = Class7847.method25379("mco.configure.world.slot.tooltip.minigame", new Object[0]);
                }
                else {
                    class7439 = Class2210.field13468;
                }
            }
            else {
                final boolean b2 = class7437.field28679 == Class2153.field12792 || class7437.field28679 == Class2153.field12791;
                if (!class7437.field28684 && b2) {
                    class7439 = Class2210.field13470;
                    s2 = Class7847.method25379("mco.configure.world.slot.tooltip.active", new Object[0]);
                }
                else {
                    class7439 = Class2210.field13468;
                }
            }
            this.field23147 = new Class9230(equals, method22842, field28608, s, field28609, b, class7439, s2);
            String s3;
            if (class7439 != Class2210.field13468) {
                if (!b) {
                    s3 = s2 + " " + method22842;
                }
                else if (!field28609) {
                    s3 = s2 + " " + method22842 + " " + class7437.field28689;
                }
                else {
                    s3 = s2;
                }
            }
            else {
                s3 = method22842;
            }
            this.method16925(s3);
        }
    }
    
    @Override
    public void method16934(final int n, final int n2, final float n3) {
        if (this.field23147 != null) {
            final Class665 method16923 = this.method16923();
            this.method16937(method16923.field3426, method16923.field3427, n, n2, this.field23147.field39578, this.field23147.field39579, this.field23145, this.field23147.field39580, this.field23147.field39581, this.field23147.field39582, this.field23147.field39583, this.field23147.field39584, this.field23147.field39585);
        }
    }
    
    private void method16937(final int n, final int n2, final int n3, final int n4, final boolean b, final String s, final int n5, final long n6, final String s2, final boolean b2, final boolean b3, final Class2210 class2210, final String s3) {
        final boolean method3360 = this.method16923().method3360();
        if (this.method16923().method3055(n3, n4)) {
            if (s3 != null) {
                this.field23143.accept(s3);
            }
        }
        if (!b3) {
            if (!b2) {
                if (s2 != null && n6 != -1L) {
                    Class8952.method31758(String.valueOf(n6), s2);
                }
                else if (n5 != 1) {
                    if (n5 != 2) {
                        if (n5 == 3) {
                            Class7847.method25380("textures/gui/title/background/panorama_3.png");
                        }
                    }
                    else {
                        Class7847.method25380("textures/gui/title/background/panorama_2.png");
                    }
                }
                else {
                    Class7847.method25380("textures/gui/title/background/panorama_0.png");
                }
            }
            else {
                Class7847.method25380("realms:textures/gui/realms/empty_frame.png");
            }
        }
        else {
            Class8952.method31758(String.valueOf(n6), s2);
        }
        if (!b) {
            Class8726.method30068(0.56f, 0.56f, 0.56f, 1.0f);
        }
        else {
            final float n7 = 0.85f + 0.15f * Class8269.method27478(this.field23146 * 0.2f);
            Class8726.method30068(n7, n7, n7, 1.0f);
        }
        Class5046.method15411(n + 3, n2 + 3, 0.0f, 0.0f, 74, 74, 74, 74);
        Class7847.method25380("realms:textures/gui/realms/slot_frame.png");
        if (!method3360 || class2210 == Class2210.field13468) {
            if (!b) {
                Class8726.method30068(0.56f, 0.56f, 0.56f, 1.0f);
            }
            else {
                Class8726.method30068(0.8f, 0.8f, 0.8f, 1.0f);
            }
        }
        else {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        }
        Class5046.method15411(n, n2, 0.0f, 0.0f, 80, 80, 80, 80);
        this.method16935(s, n + 40, n2 + 66, 16777215);
    }
    
    @Override
    public void method16932() {
        if (this.field23147 != null) {
            this.field23144.method15686(this.field23145, this.field23147.field39584, this.field23147.field39583, this.field23147.field39582);
        }
    }
}
