// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3236 extends Class3167
{
    private float field15708;
    private float field15709;
    private Class9301 field15710;
    private int field15711;
    private int field15712;
    private int field15713;
    private Class316 field15714;
    private Class3260 field15715;
    private boolean field15716;
    private boolean field15717;
    private double field15718;
    private int field15719;
    
    public Class3236() {
        super(Class8013.field32990, "Hypixel", "Places block underneath");
        this.field15711 = -1;
        this.field15715 = null;
        this.field15717 = false;
        this.field15719 = 0;
        this.method9881(new Class5001("Speed Mode", "Speed mode", 0, new String[] { "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak" }));
    }
    
    @Override
    public void method9917() {
        this.field15715 = (Class3260)this.method9914();
    }
    
    @Override
    public void method9879() {
        this.field15711 = Class3236.field15514.field4684.field3006.field2743;
        final float n = 999.0f;
        this.field15708 = n;
        this.field15709 = n;
        ((Class3260)this.method9914()).field15750 = -1;
        this.field15718 = -1.0;
        this.field15717 = false;
        if (Class3236.field15514.field4684.field2404) {
            this.field15718 = Class3236.field15514.field4684.field2396;
        }
        this.field15713 = -1;
    }
    
    @Override
    public void method9897() {
        if (this.field15711 != -1) {
            if (this.method9914().method9887("ItemSpoof").equals("Switch")) {
                Class3236.field15514.field4684.field3006.field2743 = this.field15711;
            }
        }
        this.field15711 = -1;
        if (((Class3260)this.method9914()).field15750 >= 0) {
            Class3236.field15514.method5269().method17292(new Class4321(Class3236.field15514.field4684.field3006.field2743));
            ((Class3260)this.method9914()).field15750 = -1;
        }
        Class7482.method23151(Class7482.method23136() * 0.9);
        Class3236.field15514.field4633.field26532 = 1.0f;
        if (this.method9887("Speed Mode").equals("Cubecraft")) {
            if (this.field15713 == 0) {
                Class6430.method19155(-0.0789);
            }
        }
    }
    
    @Class6753
    public void method10208(final Class5738 class5738) {
        if (this.method9906()) {
            if (this.method9887("Speed Mode").equals("Cubecraft") && !Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
                if (Class3236.field15514.field4683.method6981(Class3236.field15514.field4684, Class3236.field15514.field4684.field2403.method18494(0.0, -1.5, 0.0).method18492(0.05, 0.0, 0.05).method18492(-0.05, 0.0, -0.05)).count() == 0L) {
                    if (Class3236.field15514.field4684.field2414 < 1.0f) {
                        class5738.method17026(true);
                    }
                }
            }
            else if (Class3236.field15514.field4684.field2404) {
                if (Class9463.method35173().method35189().method21551(Class3385.class).method9906()) {
                    class5738.method17026(true);
                }
            }
        }
    }
    
    @Class6753
    @Class6759
    public void method10209(final Class5744 class5744) {
        if (this.method9906() && this.field15715.method10281() != 0) {
            if (!class5744.method17046()) {
                if (this.field15709 != 999.0f) {
                    this.field15715.method10282();
                    if (this.field15710 != null) {
                        final Class7005 method13698 = Class4609.method13698(this.field15709, this.field15708, 5.0f, class5744);
                        if (method13698.method21449() == Class2165.field12880) {
                            return;
                        }
                        if (method13698.method21448() == Class179.field512) {
                            if (method13698.method21447().method1075() <= Class3236.field15514.field4684.field2396 - 1.0) {
                                if (Class3236.field15514.field4684.field2404) {
                                    return;
                                }
                            }
                        }
                        final int field2743 = Class3236.field15514.field4684.field3006.field2743;
                        if (!this.method9914().method9887("ItemSpoof").equals("None")) {
                            this.field15715.method10280();
                        }
                        final Class8321 method13699 = Class3236.field15514.field4684.method2715(Class316.field1877);
                        final Class7075 class5745 = new Class7075(Class3236.field15514.field4684, Class316.field1877, method13698);
                        method13699.method27690();
                        Class3236.field15514.field4682.method27319(Class3236.field15514.field4684, Class3236.field15514.field4683, this.field15714, method13698);
                        this.field15710 = null;
                        if (!this.method9914().method9883("NoSwing")) {
                            Class3236.field15514.field4684.method2707(this.field15714);
                        }
                        else {
                            Class3236.field15514.method5269().method17292(new Class4380(this.field15714));
                        }
                        if (this.method9914().method9887("ItemSpoof").equals("Spoof") || this.method9914().method9887("ItemSpoof").equals("LiteSpoof")) {
                            Class3236.field15514.field4684.field3006.field2743 = field2743;
                        }
                    }
                }
            }
            else {
                ++this.field15712;
                --this.field15719;
                class5744.method17033(true);
                this.field15714 = Class316.field1877;
                final Class3260 field2744 = this.field15715;
                Label_0100: {
                    if (Class3260.method10279(Class3236.field15514.field4684.method2715(Class316.field1878).method27622())) {
                        if (!Class3236.field15514.field4684.method2715(this.field15714).method27620()) {
                            final Class3260 field2745 = this.field15715;
                            if (Class3260.method10279(Class3236.field15514.field4684.method2715(this.field15714).method27622())) {
                                break Label_0100;
                            }
                        }
                        this.field15714 = Class316.field1878;
                    }
                }
                double n = class5744.method17034();
                double n2 = class5744.method17038();
                double n3 = class5744.method17036();
                if (!Class3236.field15514.field4684.field2405) {
                    if (!Class3236.field15514.field4648.field23439.field2162) {
                        final double[] method13700 = this.method10214();
                        n = method13700[0];
                        n2 = method13700[1];
                    }
                }
                Label_0176: {
                    if (Class3236.field15514.field4684.method1935().field22771 < 0.0) {
                        if (Class3236.field15514.field4684.field2414 > 1.0f) {
                            if (Class4609.method13697(0.0f, 90.0f, 3.0f).method21449() == Class2165.field12880) {
                                n3 += Math.min(Class3236.field15514.field4684.method1935().field22771 * 2.0, 4.0);
                                break Label_0176;
                            }
                        }
                    }
                    if (this.method9887("Speed Mode").equals("Jump") || this.method9887("Speed Mode").equals("Cubecraft")) {
                        if (!Class3236.field15514.field4648.field23439.method1056()) {
                            n3 = this.field15718;
                        }
                    }
                }
                if (!Class4609.method13708(new Class354(Class3236.field15514.field4684.method1934().method16760(), Class3236.field15514.field4684.method1934().method16761() - 1.0, Class3236.field15514.field4684.method1934().method16762()))) {
                    n = Class3236.field15514.field4684.method1934().method16760();
                    n2 = Class3236.field15514.field4684.method1934().method16762();
                }
                final Class354 class5746 = new Class354(n, n3 - 1.0, n2);
                Label_0589: {
                    if (!Class4609.method13708(class5746)) {
                        if (this.field15715.method10285(this.field15714)) {
                            if (this.field15719 <= 0) {
                                final Class9301 method13701 = Class4609.method13705(class5746, false);
                                this.field15710 = method13701;
                                final float[] method13702 = Class4609.method13695();
                                if (method13701 != null) {
                                    if (method13702 != null) {
                                        this.field15709 = method13702[0];
                                        this.field15708 = method13702[1];
                                    }
                                }
                                break Label_0589;
                            }
                        }
                    }
                    this.field15710 = null;
                }
                if (this.field15709 != 999.0f) {
                    class5744.method17043(this.field15709);
                    class5744.method17041(this.field15708);
                }
                if (Class3236.field15514.field4684.field2399 != class5744.method17042()) {
                    if (Class3236.field15514.field4684.field2400 != class5744.method17040()) {
                        this.field15712 = 0;
                    }
                }
            }
        }
    }
    
    @Class6753
    @Class6757
    public void method10210(final Class5717 class5717) {
        if (!this.method9906() || this.field15715.method10281() == 0) {
            return;
        }
        if (Class3236.field15514.field4684.field2404 || Class6430.method19160(Class3236.field15514.field4684, 0.01f)) {
            this.field15718 = Class3236.field15514.field4684.field2396;
        }
        if (this.method9914().method9883("No Sprint")) {
            Class3236.field15514.field4684.method1816(false);
        }
        if (Class3236.field15514.field4684.field2404) {
            this.field15713 = 0;
        }
        else if (this.field15713 >= 0) {
            ++this.field15713;
        }
        if (this.field15715 == null) {
            this.field15715 = (Class3260)this.method9914();
        }
        final String method9887 = this.method9887("Speed Mode");
        switch (method9887) {
            case "Jump": {
                if (Class3236.field15514.field4684.field2404 && Class6430.method19114() && !Class3236.field15514.field4684.method1809() && !this.field15716) {
                    this.field15717 = false;
                    Class3236.field15514.field4684.method2725();
                    ((Class3256)Class9463.method35173().method35189().method21551(Class3256.class)).method10269();
                    this.field15717 = true;
                    class5717.method16975(Class3236.field15514.field4684.method1935().field22771);
                    class5717.method16973(Class3236.field15514.field4684.method1935().field22770);
                    class5717.method16977(Class3236.field15514.field4684.method1935().field22772);
                    break;
                }
                break;
            }
            case "AAC": {
                if (this.field15712 == 0 && Class3236.field15514.field4684.field2404) {
                    Class7482.method23149(class5717, Class7482.method23136() * 0.82);
                    break;
                }
                break;
            }
            case "Cubecraft": {
                double n2 = 0.2;
                final float method9888 = this.method10217(Class9546.method35668(Class3236.field15514.field4684.field2399));
                if (Class3236.field15514.field4648.field23439.method1056()) {
                    Class3236.field15514.field4633.field26532 = 1.0f;
                }
                else if (Class3236.field15514.field4684.field2404) {
                    if (Class6430.method19114() && !Class3236.field15514.field4684.method1809() && !this.field15716) {
                        class5717.method16975(1.00000000000001);
                    }
                }
                else if (this.field15713 == 1) {
                    if (class5717.method16974() <= 0.9) {
                        this.field15713 = -1;
                    }
                    else {
                        class5717.method16975(0.122);
                        Class3236.field15514.field4633.field26532 = 0.7f;
                        n2 = 2.4;
                    }
                }
                else if (this.field15713 == 2) {
                    if (class5717.method16974() > 0.05) {
                        this.field15713 = -1;
                    }
                    else {
                        Class3236.field15514.field4633.field26532 = 0.7f;
                        n2 = 0.28;
                    }
                }
                else if (this.field15713 == 3) {
                    Class3236.field15514.field4633.field26532 = 0.3f;
                    n2 = 2.4;
                }
                else if (this.field15713 == 4) {
                    n2 = 0.28;
                    Class3236.field15514.field4633.field26532 = 1.0f;
                }
                else if (this.field15713 == 6) {
                    class5717.method16975(-1.023456987345906);
                }
                if (!Class6430.method19114()) {
                    n2 = 0.0;
                }
                if (Class3236.field15514.field4684.field2414 < 1.0f) {
                    Class7482.method23153(class5717, n2, method9888, method9888, 360.0f);
                }
                Class6430.method19155(class5717.method16974());
                break;
            }
            case "Slow": {
                if (Class3236.field15514.field4684.field2404) {
                    class5717.method16973(class5717.method16972() * 0.75);
                    class5717.method16977(class5717.method16976() * 0.75);
                    break;
                }
                class5717.method16973(class5717.method16972() * 0.93);
                class5717.method16977(class5717.method16976() * 0.93);
                break;
            }
            case "Sneak": {
                if (Class3236.field15514.field4684.field2404) {
                    class5717.method16973(class5717.method16972() * 0.65);
                    class5717.method16977(class5717.method16976() * 0.65);
                    break;
                }
                class5717.method16973(class5717.method16972() * 0.85);
                class5717.method16977(class5717.method16976() * 0.85);
                break;
            }
        }
        this.field15715.method10287(class5717);
    }
    
    @Class6753
    @Class6759
    public void method10211(final Class5721 class5721) {
        if (this.method9906() && Class3236.field15514.field4684 != null) {
            if (class5721.method16990() instanceof Class4321) {
                if (((Class3260)this.method9914()).field15750 >= 0) {
                    class5721.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10212(final Class5722 class5722) {
        if (this.method9906() && this.field15717) {
            if (this.method9914().method9887("Tower Mode").equalsIgnoreCase("Cubecraft")) {
                if (!Class6430.method19114() || this.method9914().method9883("Tower while moving")) {
                    class5722.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10213(final Class5741 class5741) {
        if (this.method9906()) {
            if (this.method9887("Speed Mode").equals("Cubecraft")) {
                if (this.field15713 >= 0) {
                    if (Class3236.field15514.field4684.field2414 > 1.2f) {
                        return;
                    }
                    if (Class3236.field15514.field4684.field3019 < this.field15718) {
                        return;
                    }
                    if (!Class3236.field15514.field4684.field2967) {
                        Class3236.field15514.field4684.field2396 = this.field15718;
                        Class3236.field15514.field4684.field2418 = this.field15718;
                        Class3236.field15514.field4684.field3019 = this.field15718;
                        Class3236.field15514.field4684.field2393 = this.field15718;
                        if (Class7482.method23148()) {
                            Class3236.field15514.field4684.field3013 = 0.099999994f;
                        }
                    }
                }
            }
        }
    }
    
    public double[] method10214() {
        final double field2395 = Class3236.field15514.field4684.field2395;
        final double field2396 = Class3236.field15514.field4684.field2397;
        final double n = Class3236.field15514.field4684.field4085.field24722;
        final double n2 = Class3236.field15514.field4684.field4085.field24721;
        final float field2397 = Class3236.field15514.field4684.field2399;
        Class354 class354 = new Class354(field2395, Class3236.field15514.field4684.field2396 - 1.0, field2396);
        double n3 = field2395;
        double n4 = field2396;
        double n5 = 0.0;
        final double n6 = this.method9886("Extend") * 2.0f;
        while (Class4609.method13708(class354)) {
            final double n7 = field2395;
            final double n8 = field2396;
            ++n5;
            if (n5 > n6) {
                n5 = n6;
            }
            n3 = n7 + (n * 0.45 * Math.cos(Math.toRadians(field2397 + 90.0f)) + n2 * 0.45 * Math.sin(Math.toRadians(field2397 + 90.0f))) * n5;
            n4 = n8 + (n * 0.45 * Math.sin(Math.toRadians(field2397 + 90.0f)) - n2 * 0.45 * Math.cos(Math.toRadians(field2397 + 90.0f))) * n5;
            if (n5 == n6) {
                break;
            }
            class354 = new Class354(n3, Class3236.field15514.field4684.field2396 - 1.0, n4);
        }
        return new double[] { n3, n4 };
    }
    
    public static Class5487 method10215(final Class354 class354, final Class179 class355) {
        final double n = class354.method1074() + 0.5;
        final double n2 = class354.method1075() + 0.5;
        final double n3 = class354.method1076() + 0.5;
        double n4 = n + class355.method785() / 2.0;
        double n5 = n3 + class355.method787() / 2.0;
        double n6 = n2 + class355.method786() / 2.0;
        final double n7 = 0.2;
        if (class355 != Class179.field512 && class355 != Class179.field511) {
            n6 += method10216(n7, -n7);
        }
        else {
            n4 += method10216(n7, -n7);
            n5 += method10216(n7, -n7);
        }
        if (class355 == Class179.field515 || class355 == Class179.field516) {
            n5 += method10216(n7, -n7);
        }
        if (class355 == Class179.field514 || class355 == Class179.field513) {
            n4 += method10216(n7, -n7);
        }
        return new Class5487(n4, n6, n5);
    }
    
    public static double method10216(final double n, final double n2) {
        return Math.random() * (n - n2) + n2;
    }
    
    public float method10217(float n) {
        float n2 = 0.0f;
        final float field2968 = Class3236.field15514.field4684.field2968;
        final float field2969 = Class3236.field15514.field4684.field2970;
        if (field2968 <= 0.0f) {
            if (field2968 < 0.0f) {
                if (field2969 <= 0.0f) {
                    if (field2969 >= 0.0f) {
                        n += 90.0f;
                    }
                    else {
                        n -= 45.0f;
                    }
                }
                else {
                    n += 45.0f;
                }
            }
        }
        else if (field2969 <= 0.0f) {
            if (field2969 >= 0.0f) {
                n -= 90.0f;
            }
            else {
                n += 45.0f;
            }
        }
        else {
            n -= 45.0f;
        }
        if (n >= 45.0f && n <= 135.0f) {
            n2 = 90.0f;
        }
        else if (n < 135.0f && n > -135.0f) {
            if (n <= -45.0f && n >= -135.0f) {
                n2 = -90.0f;
            }
            else if (n >= -45.0f) {
                if (n <= 45.0f) {
                    n2 = 0.0f;
                }
            }
        }
        else {
            n2 = 180.0f;
        }
        if (field2969 < 0.0f) {
            n2 -= 180.0f;
        }
        return n2 + 90.0f;
    }
}
