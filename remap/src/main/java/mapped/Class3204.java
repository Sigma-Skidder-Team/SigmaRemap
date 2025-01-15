// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

public class Class3204 extends Class3167
{
    private float field15621;
    private float field15622;
    private Class9301 field15623;
    private int field15624;
    private int field15625;
    private int field15626;
    private Class316 field15627;
    private Class3260 field15628;
    private boolean field15629;
    private boolean field15630;
    private double field15631;
    
    public Class3204() {
        super(Class8013.field32990, "NCP", "Places block underneath");
        this.field15624 = -1;
        this.field15628 = null;
        this.field15630 = false;
        this.method9881(new Class5001("Speed Mode", "Speed mode", 0, new String[] { "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak" }));
        this.method9881(new Class4999("KeepRotations", "Keeps your rotations.", true));
        this.method9881(new Class4996("Extend", "Extend value", 0.0f, Float.class, 0.0f, 6.0f, 0.1f));
        this.method9881(new Class4999("Downwards", "Allows you to go down when sneaking.", true));
    }
    
    @Override
    public void method9917() {
        this.field15628 = (Class3260)this.method9914();
    }
    
    @Override
    public void method9879() {
        this.field15624 = Class3204.field15514.field4684.field3006.field2743;
        final float n = 999.0f;
        this.field15621 = n;
        this.field15622 = n;
        ((Class3260)this.method9914()).field15750 = -1;
        if (Class3204.field15514.field4648.field23440.method1056()) {
            if (this.method9883("Downwards")) {
                Class3204.field15514.field4648.field23440.field2162 = false;
                this.field15629 = true;
            }
        }
        if (!Class3204.field15514.field4648.field23440.method1056()) {
            this.field15629 = false;
        }
        this.field15631 = -1.0;
        this.field15630 = false;
        if (Class3204.field15514.field4684.field2404) {
            this.field15631 = Class3204.field15514.field4684.field2396;
        }
        this.field15626 = -1;
    }
    
    @Override
    public void method9897() {
        if (this.field15624 != -1) {
            if (this.method9914().method9887("ItemSpoof").equals("Switch")) {
                Class3204.field15514.field4684.field3006.field2743 = this.field15624;
            }
        }
        this.field15624 = -1;
        if (((Class3260)this.method9914()).field15750 >= 0) {
            Class3204.field15514.method5269().method17292(new Class4321(Class3204.field15514.field4684.field3006.field2743));
            ((Class3260)this.method9914()).field15750 = -1;
        }
        Class7482.method23151(Class7482.method23136() * 0.9);
        Class3204.field15514.field4633.field26532 = 1.0f;
        if (this.method9887("Speed Mode").equals("Cubecraft")) {
            if (this.field15626 == 0) {
                Class6430.method19155(-0.0789);
            }
        }
    }
    
    @Class6753
    public void method10044(final Class5738 class5738) {
        if (this.method9906()) {
            if (this.method9887("Speed Mode").equals("Cubecraft") && !Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
                if (Class3204.field15514.field4683.method6981(Class3204.field15514.field4684, Class3204.field15514.field4684.field2403.method18494(0.0, -1.5, 0.0).method18492(0.05, 0.0, 0.05).method18492(-0.05, 0.0, -0.05)).count() == 0L) {
                    if (Class3204.field15514.field4684.field2414 < 1.0f) {
                        class5738.method17026(true);
                    }
                }
            }
            else if (Class3204.field15514.field4684.field2404) {
                if (Class9463.method35173().method35189().method21551(Class3385.class).method9906()) {
                    if (!this.field15629 || !this.method9883("Downwards")) {
                        class5738.method17026(true);
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10045(final Class5752 class5752) {
        if (this.method9906() && this.method9883("Downwards")) {
            if (class5752.method17061() == Class3204.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field15629 = true;
            }
        }
    }
    
    @Class6753
    private void method10046(final Class5715 class5715) {
        if (this.method9906() && this.method9883("Downwards")) {
            if (class5715.method16963() == Class3204.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field15629 = false;
            }
        }
    }
    
    @Class6753
    @Class6759
    public void method10047(final Class5744 class5744) {
        if (this.method9906() && this.field15628.method10281() != 0) {
            if (!class5744.method17046()) {
                this.field15628.method10282();
                if (this.field15623 != null) {
                    final Class7005 class5745 = new Class7005(method10053(this.field15623.field39906, this.field15623.field39907), this.field15623.field39907, this.field15623.field39906, false);
                    final int field2743 = Class3204.field15514.field4684.field3006.field2743;
                    if (!this.method9914().method9887("ItemSpoof").equals("None")) {
                        this.field15628.method10280();
                    }
                    Class3204.field15514.field4682.method27319(Class3204.field15514.field4684, Class3204.field15514.field4683, this.field15627, class5745);
                    if (!this.method9914().method9883("NoSwing")) {
                        Class3204.field15514.field4684.method2707(this.field15627);
                    }
                    else {
                        Class3204.field15514.method5269().method17292(new Class4380(this.field15627));
                    }
                    if (this.method9914().method9887("ItemSpoof").equals("Spoof") || this.method9914().method9887("ItemSpoof").equals("LiteSpoof")) {
                        Class3204.field15514.field4684.field3006.field2743 = field2743;
                    }
                }
            }
            else {
                ++this.field15625;
                class5744.method17033(true);
                this.field15627 = Class316.field1877;
                final Class3260 field2744 = this.field15628;
                Label_0094: {
                    if (Class3260.method10279(Class3204.field15514.field4684.method2715(Class316.field1878).method27622())) {
                        if (!Class3204.field15514.field4684.method2715(this.field15627).method27620()) {
                            final Class3260 field2745 = this.field15628;
                            if (Class3260.method10279(Class3204.field15514.field4684.method2715(this.field15627).method27622())) {
                                break Label_0094;
                            }
                        }
                        this.field15627 = Class316.field1878;
                    }
                }
                double n = class5744.method17034();
                double n2 = class5744.method17038();
                double n3 = class5744.method17036();
                if (!Class3204.field15514.field4684.field2405) {
                    if (!Class3204.field15514.field4648.field23439.field2162) {
                        final double[] method10052 = this.method10052();
                        n = method10052[0];
                        n2 = method10052[1];
                    }
                }
                Label_0177: {
                    if (Class3204.field15514.field4684.method1935().field22771 < 0.0) {
                        if (Class3204.field15514.field4684.field2414 > 1.0f) {
                            if (Class4609.method13697(0.0f, 90.0f, 3.0f).method21449() == Class2165.field12880) {
                                n3 += Math.min(Class3204.field15514.field4684.method1935().field22771 * 2.0, 4.0);
                                break Label_0177;
                            }
                        }
                    }
                    if (this.field15629 && this.method9883("Downwards")) {
                        --n3;
                    }
                    else if (this.method9887("Speed Mode").equals("Jump") || this.method9887("Speed Mode").equals("Cubecraft")) {
                        if (!Class3204.field15514.field4648.field23439.method1056()) {
                            n3 = this.field15631;
                        }
                    }
                }
                if (!Class4609.method13708(new BlockPos(Class3204.field15514.field4684.method1934().method16760(), Class3204.field15514.field4684.method1934().method16761() - 1.0, Class3204.field15514.field4684.method1934().method16762()))) {
                    n = Class3204.field15514.field4684.method1934().method16760();
                    n2 = Class3204.field15514.field4684.method1934().method16762();
                }
                final BlockPos class5746 = new BlockPos(n, n3 - 1.0, n2);
                if (!Class4609.method13708(class5746) && this.field15628.method10285(this.field15627)) {
                    if ((this.field15623 = Class4609.method13705(class5746, !this.field15629 && this.method9883("Downwards"))) != null) {
                        final float[] method10053 = Class4609.method13672(this.field15623.field39906, this.field15623.field39907);
                        this.field15622 = method10053[0];
                        this.field15621 = method10053[1];
                        class5744.method17043(this.field15622);
                        class5744.method17041(this.field15621);
                    }
                }
                else {
                    if (this.method9883("KeepRotations")) {
                        if (this.field15621 != 999.0f) {
                            class5744.method17043(this.field15622);
                            class5744.method17041(this.field15621);
                        }
                    }
                    this.field15623 = null;
                }
                if (Class3204.field15514.field4684.field2399 != class5744.method17042()) {
                    if (Class3204.field15514.field4684.field2400 != class5744.method17040()) {
                        this.field15625 = 0;
                    }
                }
            }
        }
    }
    
    @Class6753
    @Class6757
    public void method10048(final Class5717 class5717) {
        if (!this.method9906() || this.field15628.method10281() == 0) {
            return;
        }
        if (Class3204.field15514.field4684.field2404 || Class6430.method19160(Class3204.field15514.field4684, 0.01f)) {
            this.field15631 = Class3204.field15514.field4684.field2396;
        }
        if (this.method9914().method9883("No Sprint")) {
            Class3204.field15514.field4684.method1816(false);
        }
        if (Class3204.field15514.field4684.field2404) {
            this.field15626 = 0;
        }
        else if (this.field15626 >= 0) {
            ++this.field15626;
        }
        if (this.field15628 == null) {
            this.field15628 = (Class3260)this.method9914();
        }
        final String method9887 = this.method9887("Speed Mode");
        switch (method9887) {
            case "Jump": {
                if (Class3204.field15514.field4684.field2404 && Class6430.method19114() && !Class3204.field15514.field4684.method1809() && !this.field15629) {
                    this.field15630 = false;
                    Class3204.field15514.field4684.method2725();
                    ((Class3256)Class9463.method35173().method35189().method21551(Class3256.class)).method10269();
                    this.field15630 = true;
                    class5717.method16975(Class3204.field15514.field4684.method1935().field22771);
                    class5717.method16973(Class3204.field15514.field4684.method1935().field22770);
                    class5717.method16977(Class3204.field15514.field4684.method1935().field22772);
                    break;
                }
                break;
            }
            case "AAC": {
                if (this.field15625 == 0 && Class3204.field15514.field4684.field2404) {
                    Class7482.method23149(class5717, Class7482.method23136() * 0.82);
                    break;
                }
                break;
            }
            case "Cubecraft": {
                double n2 = 0.2;
                final float method9888 = this.method10055(MathHelper.method35668(Class3204.field15514.field4684.field2399));
                if (Class3204.field15514.field4648.field23439.method1056()) {
                    Class3204.field15514.field4633.field26532 = 1.0f;
                }
                else if (Class3204.field15514.field4684.field2404) {
                    if (Class6430.method19114() && !Class3204.field15514.field4684.method1809() && !this.field15629) {
                        class5717.method16975(1.00000000000001);
                    }
                }
                else if (this.field15626 == 1) {
                    if (class5717.method16974() <= 0.9) {
                        this.field15626 = -1;
                    }
                    else {
                        class5717.method16975(0.122);
                        Class3204.field15514.field4633.field26532 = 0.7f;
                        n2 = 2.4;
                    }
                }
                else if (this.field15626 == 2) {
                    if (class5717.method16974() > 0.05) {
                        this.field15626 = -1;
                    }
                    else {
                        Class3204.field15514.field4633.field26532 = 0.7f;
                        n2 = 0.28;
                    }
                }
                else if (this.field15626 == 3) {
                    Class3204.field15514.field4633.field26532 = 0.3f;
                    n2 = 2.4;
                }
                else if (this.field15626 == 4) {
                    n2 = 0.28;
                    Class3204.field15514.field4633.field26532 = 1.0f;
                }
                else if (this.field15626 == 6) {
                    class5717.method16975(-1.023456987345906);
                }
                if (!Class6430.method19114()) {
                    n2 = 0.0;
                }
                if (Class3204.field15514.field4684.field2414 < 1.0f) {
                    Class7482.method23153(class5717, n2, method9888, method9888, 360.0f);
                }
                Class6430.method19155(class5717.method16974());
                break;
            }
            case "Slow": {
                if (Class3204.field15514.field4684.field2404) {
                    class5717.method16973(class5717.method16972() * 0.75);
                    class5717.method16977(class5717.method16976() * 0.75);
                    break;
                }
                class5717.method16973(class5717.method16972() * 0.93);
                class5717.method16977(class5717.method16976() * 0.93);
                break;
            }
            case "Sneak": {
                if (Class3204.field15514.field4684.field2404) {
                    class5717.method16973(class5717.method16972() * 0.65);
                    class5717.method16977(class5717.method16976() * 0.65);
                    break;
                }
                class5717.method16973(class5717.method16972() * 0.85);
                class5717.method16977(class5717.method16976() * 0.85);
                break;
            }
        }
        this.field15628.method10287(class5717);
    }
    
    @Class6753
    @Class6759
    public void method10049(final Class5721 class5721) {
        if (this.method9906() && Class3204.field15514.field4684 != null) {
            if (class5721.method16990() instanceof Class4321) {
                if (((Class3260)this.method9914()).field15750 >= 0) {
                    class5721.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10050(final Class5722 class5722) {
        if (this.method9906() && this.field15630) {
            if (this.method9914().method9887("Tower Mode").equalsIgnoreCase("Cubecraft")) {
                if (!Class6430.method19114() || this.method9914().method9883("Tower while moving")) {
                    class5722.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10051(final Class5741 class5741) {
        if (this.method9906()) {
            if (this.method9887("Speed Mode").equals("Cubecraft")) {
                if (this.field15626 >= 0) {
                    if (Class3204.field15514.field4684.field2414 > 1.2f) {
                        return;
                    }
                    if (Class3204.field15514.field4684.field3019 < this.field15631) {
                        return;
                    }
                    if (!Class3204.field15514.field4684.field2967) {
                        Class3204.field15514.field4684.field2396 = this.field15631;
                        Class3204.field15514.field4684.field2418 = this.field15631;
                        Class3204.field15514.field4684.field3019 = this.field15631;
                        Class3204.field15514.field4684.field2393 = this.field15631;
                        if (Class7482.method23148()) {
                            Class3204.field15514.field4684.field3013 = 0.099999994f;
                        }
                    }
                }
            }
        }
    }
    
    public double[] method10052() {
        final double field2395 = Class3204.field15514.field4684.field2395;
        final double field2396 = Class3204.field15514.field4684.field2397;
        final double n = Class3204.field15514.field4684.field4085.field24722;
        final double n2 = Class3204.field15514.field4684.field4085.field24721;
        final float field2397 = Class3204.field15514.field4684.field2399;
        BlockPos class354 = new BlockPos(field2395, Class3204.field15514.field4684.field2396 - 1.0, field2396);
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
            class354 = new BlockPos(n3, Class3204.field15514.field4684.field2396 - 1.0, n4);
        }
        return new double[] { n3, n4 };
    }
    
    public static Class5487 method10053(final BlockPos class354, final Direction class355) {
        final double n = class354.getX() + 0.5;
        final double n2 = class354.getY() + 0.5;
        final double n3 = class354.getZ() + 0.5;
        double n4 = n + class355.getXOffset() / 2.0;
        double n5 = n3 + class355.getZOffset() / 2.0;
        double n6 = n2 + class355.getYOffset() / 2.0;
        final double n7 = 0.2;
        if (class355 != Direction.UP && class355 != Direction.DOWN) {
            n6 += method10054(n7, -n7);
        }
        else {
            n4 += method10054(n7, -n7);
            n5 += method10054(n7, -n7);
        }
        if (class355 == Direction.WEST || class355 == Direction.EAST) {
            n5 += method10054(n7, -n7);
        }
        if (class355 == Direction.SOUTH || class355 == Direction.NORTH) {
            n4 += method10054(n7, -n7);
        }
        return new Class5487(n4, n6, n5);
    }
    
    public static double method10054(final double n, final double n2) {
        return Math.random() * (n - n2) + n2;
    }
    
    public float method10055(float n) {
        float n2 = 0.0f;
        final float field2968 = Class3204.field15514.field4684.field2968;
        final float field2969 = Class3204.field15514.field4684.field2970;
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
