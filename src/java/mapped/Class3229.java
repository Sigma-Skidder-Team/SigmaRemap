// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3229 extends Class3167
{
    private boolean field15693;
    private boolean field15694;
    private int field15695;
    private static int field15696;
    private Class7617 field15697;
    private double field15698;
    
    public Class3229() {
        super(Class8013.field32990, "Cubecraft", "Fly for Cubecraft");
        this.field15697 = new Class7617();
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Basic", "Fast", "Test" }));
        this.method9881(new Class4999("Damage", "Allows you to go up.", true));
        this.method9881(new Class4999("Smooth fly", "Better look.", true));
    }
    
    public static boolean method10177() {
        return Class3229.field15696 == 1;
    }
    
    @Override
    public void method9879() {
        this.field15695 = 0;
        this.field15693 = false;
        Class3229.field15696 = 0;
        if (Class3229.field15514.field4684.field2404) {
            if (this.method9887("Mode").equalsIgnoreCase("Basic")) {
                Class3229.field15514.field4633.field26532 = 0.3f;
            }
            this.field15694 = true;
            this.method10182();
        }
        else {
            this.field15694 = (Class9367.method34762() != Class7906.field32452.method25613() && !this.method9883("Damage"));
        }
    }
    
    @Override
    public void method9897() {
        this.field15697.method23934();
        this.field15697.method23933();
        if (Class9367.method34762() != Class7906.field32452.method25613()) {
            if (this.field15695 != 0) {
                this.field15695 = -2;
            }
            else {
                Class6430.method19155(-0.078);
                Class7482.method23151(0.2);
            }
        }
        else if (Class3229.field15696 == 1) {
            if (this.field15695 == 0) {
                this.field15695 = -2;
            }
            else {
                Class6430.method19155(-0.078);
                Class7482.method23151(0.2);
                this.field15695 = 0;
            }
        }
        Class3229.field15514.field4633.field26532 = 1.0f;
        Class3229.field15696 = 0;
    }
    
    @Class6753
    @Class6754
    public void method10178(final Class5717 class5717) {
        if (!this.method9906()) {
            if (this.field15695 < 0) {
                if (this.field15695 == -2) {
                    class5717.method16975(0.53);
                }
                else {
                    Class3229.field15514.field4633.field26532 = 1.0f;
                    class5717.method16975(-0.078);
                }
                Class7482.method23149(class5717, 0.26);
                ++this.field15695;
            }
            return;
        }
        if (Class3229.field15514.field4684.field2424 <= 1) {
            this.field15698 = Class3229.field15514.field4684.field2396;
        }
        if (!this.field15694) {
            if (Class3229.field15514.field4684.field2404) {
                Class3229.field15514.field4633.field26532 = 0.3f;
                this.field15694 = true;
                this.method10182();
            }
            return;
        }
        if (Class3229.field15514.field4684.field2430 != 0 && !this.field15693) {
            this.field15693 = !this.field15693;
        }
        if (Class9367.method34762() == Class7906.field32452.method25613()) {
            if (this.field15695 >= 0 && Class3229.field15696 == 1) {
                double a = 0.0;
                float field26532 = 1.0f;
                double n = 0.0;
                final String method9887 = this.method9887("Mode");
                switch (method9887) {
                    case "Basic": {
                        if (this.field15695 == 0) {
                            a = 0.4;
                            n = 2.4;
                            field26532 = 0.3f;
                            break;
                        }
                        if (this.field15695 == 1) {
                            a = -0.4;
                            n = 0.27;
                            field26532 = 0.3f;
                            break;
                        }
                        if (this.field15695 == 2) {
                            a = 0.0;
                            n = 2.4;
                            field26532 = 1.0f;
                            this.field15695 = -1;
                            break;
                        }
                        break;
                    }
                    case "Fast": {
                        if (this.field15695 == 0) {
                            a = 0.52500000000001;
                            n = 3.0;
                            break;
                        }
                        if (this.field15695 == 1) {
                            a = -0.2625;
                            n = 0.2873;
                            break;
                        }
                        if (this.field15695 == 2) {
                            a = -0.2625;
                            n = 0.2;
                            this.field15695 = -1;
                            break;
                        }
                        break;
                    }
                    case "Test": {
                        field26532 = 0.3f;
                        if (this.field15695 == 0) {
                            a = 2.0000000001E-4;
                            n = 2.4;
                            break;
                        }
                        if (this.field15695 == 1) {
                            a = -1.0E-4;
                            n = 0.2873;
                            break;
                        }
                        if (this.field15695 == 2) {
                            a = -1.0E-4;
                            n = 2.3;
                            field26532 = 1.0f;
                            this.field15695 = -1;
                            break;
                        }
                        break;
                    }
                }
                if (this.field15697.method23935() > 2000L) {
                    if (this.field15697.method23937()) {
                        Class3229.field15514.method5269().method17292(new Class4354(Class3229.field15514.field4684.field2395, 3.2E7, Class3229.field15514.field4684.field2397, false));
                        Class9463.method35173().method35197().method25776(new Class6224("Cubecraft fly", "Lagbacked you to avoid ban"));
                        this.field15697.method23933();
                    }
                    class5717.method16975(0.0);
                    Class7482.method23149(class5717, 0.0);
                    return;
                }
                Class3229.field15514.field4633.field26532 = field26532;
                if (Math.abs(a) < 1.0E-5) {
                    Class3229.field15514.field4684.method1656(Class3229.field15514.field4684.field2395, Class3229.field15514.field4684.field2396 + a, Class3229.field15514.field4684.field2397);
                    class5717.method16975(0.0);
                }
                else {
                    class5717.method16975(a);
                }
                Class7482.method23149(class5717, n);
            }
            if (Class3229.field15696 == 1) {
                ++this.field15695;
            }
            else {
                Class7482.method23149(class5717, 0.0);
            }
        }
        else {
            double n3 = 0.0;
            double n4 = 0.0;
            float field26533 = 0.3f;
            ++this.field15695;
            final String method9888 = this.method9887("Mode");
            switch (method9888) {
                case "Basic": {
                    if (this.field15695 == 0) {
                        n3 = 0.4;
                        n4 = 2.4;
                        field26533 = 0.3f;
                        break;
                    }
                    if (this.field15695 == 1) {
                        n3 = -0.4;
                        n4 = 0.27;
                        field26533 = 0.3f;
                        break;
                    }
                    if (this.field15695 == 2) {
                        n3 = 0.0;
                        n4 = 2.4;
                        field26533 = 1.0f;
                        this.field15695 = -1;
                        break;
                    }
                    break;
                }
                case "Fast": {
                    field26533 = 1.0f;
                    if (this.field15695 == 0) {
                        n3 = 0.52500000000001;
                        n4 = 3.0;
                        break;
                    }
                    if (this.field15695 == 1) {
                        n3 = -0.2625;
                        n4 = 0.2873;
                        break;
                    }
                    if (this.field15695 == 2) {
                        n3 = -0.2625;
                        n4 = 0.2;
                        this.field15695 = -1;
                        break;
                    }
                    break;
                }
                case "Test": {
                    field26533 = 1.0f;
                    if (this.field15695 == 0) {
                        n3 = 2.0E-5;
                        n4 = 2.4;
                        break;
                    }
                    if (this.field15695 == 1) {
                        n3 = -9.9E-6;
                        n4 = 0.2873;
                        break;
                    }
                    if (this.field15695 == 2) {
                        n3 = -1.0E-5;
                        n4 = 0.2;
                        this.field15695 = -1;
                        break;
                    }
                    break;
                }
            }
            if (this.field15697.method23935() > 2000L) {
                this.field15697.method23933();
                Class9463.method35173().method35197().method25776(new Class6224("Cubecraft fly", "Lagbacked you to avoid ban"));
                Class3229.field15514.method5269().method17292(new Class4354(Class3229.field15514.field4684.field2395, 3.2E7, Class3229.field15514.field4684.field2397, false));
            }
            if (!Class6430.method19160(Class3229.field15514.field4684, 0.01f) && (Class3229.field15514.method5282() == null || !Class3229.field15514.method5282().field41613.equalsIgnoreCase("play.cubecraft.net"))) {
                n3 = -0.01;
            }
            if (!Class6430.method19160(Class3229.field15514.field4684, (float)(-n3))) {
                class5717.method16975(n3);
            }
            else {
                class5717.method16975(-0.07);
            }
            Class3229.field15514.field4633.field26532 = field26533;
            Class7482.method23149(class5717, n4);
        }
    }
    
    @Class6753
    public void method10179(final Class5744 class5744) {
        if (!this.method9906() || !this.field15694) {
            return;
        }
        class5744.method17033(true);
        if (Class9367.method34762() == Class7906.field32452.method25613() && (Class3229.field15696 == 0 || (Class3229.field15696 == 1 && this.field15697.method23935() > 2000L)) && this.field15694) {
            class5744.method16961(true);
        }
        class5744.method17045(true);
    }
    
    @Class6753
    public void method10180(final Class5723 class5723) {
        if (!this.method9906() || Class3229.field15514.field4683 == null || Class3229.field15514.method5269() == null) {
            return;
        }
        final Class4252 method16998 = class5723.method16998();
        if (method16998 instanceof Class4328) {
            final Class4328 class5724 = (Class4328)method16998;
            if (Class9367.method34762() != Class7906.field32452.method25613()) {
                class5724.field19381 = Class3229.field15514.field4684.field2400;
                class5724.field19380 = Class3229.field15514.field4684.field2399;
                return;
            }
            if (Class3229.field15696 == 0) {
                this.field15697.method23934();
                this.field15697.method23932();
                class5723.method16961(true);
                Class3229.field15514.method5269().method17292(new Class4355(class5724.field19377, class5724.field19378, class5724.field19379, class5724.field19380, class5724.field19381, this.method9883("Damage")));
            }
            ++Class3229.field15696;
        }
    }
    
    @Class6753
    public void method10181(final Class5741 class5741) {
        if (!this.method9906() || !this.field15694 || !this.method9883("Smooth fly")) {
            return;
        }
        if (Class3229.field15514.field4684.field2404 && Class6430.method19160(Class3229.field15514.field4684, 0.001f)) {
            this.field15698 = Class3229.field15514.field4684.field2396;
        }
        Class3229.field15514.field4684.field2396 = this.field15698;
        Class3229.field15514.field4684.field2418 = this.field15698;
        Class3229.field15514.field4684.field3019 = this.field15698;
        Class3229.field15514.field4684.field2393 = this.field15698;
        if (Class7482.method23148()) {
            Class3229.field15514.field4684.field3013 = 0.099999994f;
        }
    }
    
    private void method10182() {
        if (Class6430.method19150()) {
            return;
        }
        if (Class9367.method34762() == Class7906.field32452.method25613()) {
            this.field15698 = Class3229.field15514.field4684.field2396;
            final double field2395 = Class3229.field15514.field4684.field2395;
            final double field2396 = Class3229.field15514.field4684.field2396;
            final double field2397 = Class3229.field15514.field4684.field2397;
            double n = this.method9883("Damage") ? (field2396 - 3.0000001192093) : 3.2E7;
            if (!Class6430.method19148()) {
                n = field2396 - 3.0000001192093;
            }
            Class3229.field15514.method5269().method17292(new Class4354(field2395, n, field2397, false));
        }
        else {
            if (this.method9883("Damage")) {
                final double field2398 = Class3229.field15514.field4684.field2395;
                final double field2399 = Class3229.field15514.field4684.field2396;
                final double field2400 = Class3229.field15514.field4684.field2397;
                for (int n2 = 49 + Class7482.method23140() * 17, i = 0; i < n2; ++i) {
                    Class3229.field15514.method5269().method17292(new Class4354(field2398, field2399 + 0.06248 + (Math.random() - 0.5) * 1.0E-8, field2400, false));
                    Class3229.field15514.method5269().method17292(new Class4354(field2398, field2399 + 1.0E-14 + (Math.random() - 0.5) * 1.0E-8, field2400, false));
                }
                Class3229.field15514.method5269().method17292(new Class4354(field2398, field2399, field2400, true));
            }
            this.field15697.method23932();
        }
    }
}
