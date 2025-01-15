// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3308 extends Class3167
{
    private int field15884;
    private boolean field15885;
    private boolean field15886;
    private boolean field15887;
    
    public Class3308() {
        super(Class8013.field32986, "NoGround", "NoGround criticals");
        this.method9881(new Class5001("Offset", "The way you will fake no ground", 0, new String[] { "Vanilla", "OldHypixel" }));
        this.method9881(new Class4999("Avoid Fall Damage", "Avoid fall damages.", true));
    }
    
    @Override
    public void method9879() {
        if (Class6430.method19160(Class3308.field15514.field4684, 0.001f)) {
            this.field15885 = this.method9887("Offset").equals("OldHypixel");
            this.field15884 = (this.field15885 ? 2 : 1);
        }
        this.field15886 = false;
    }
    
    @Class6753
    @Class6757
    private void method10469(final Class5745 class5745) {
        if (this.method9906() && class5745.method17049() >= 0.625) {
            if (this.field15884 == 0) {
                if (this.field15885) {
                    class5745.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    private void method10470(final Class5722 class5722) {
        if (this.method9906()) {
            if (this.field15884 == 1) {
                class5722.method16961(true);
                this.field15886 = true;
            }
        }
    }
    
    @Class6753
    @Class6757
    private void method10471(final Class5744 class5744) {
        if (!this.method9906()) {
            return;
        }
        if (Class3308.field15514.field4684.field2404) {
            this.field15887 = false;
            if (this.field15886 && this.field15884 != 1) {
                this.field15886 = !this.field15886;
                Class3308.field15514.field4684.method2725();
            }
            if (this.method9887("Offset").equals("OldHypixel") != this.field15885) {
                this.field15885 = this.method9887("Offset").equals("OldHypixel");
                this.field15884 = 2;
            }
            double n = this.field15885 ? 1.0E-14 : 0.0;
            boolean b = false;
            final boolean b2 = Class3308.field15514.field4691 != null && Class3308.field15514.field4691.method21449() == Class2165.field12881;
            if (Class3308.field15514.field4682.method27337() || (Class3308.field15514.field4648.field23446.method1056() && b2) || Class3295.method10433()) {
                this.field15884 = 2;
                b = true;
            }
            else {
                switch (this.field15884) {
                    case 0: {
                        class5744.method17033(true);
                        --this.field15884;
                        break;
                    }
                    case 1: {
                        n = 0.065;
                        --this.field15884;
                        break;
                    }
                    case 2: {
                        class5744.method17033(true);
                        n = 0.065;
                        --this.field15884;
                        if (!this.field15885) {
                            n = 1.0E-14;
                            --this.field15884;
                            break;
                        }
                        break;
                    }
                    case 3: {
                        class5744.method17033(true);
                        n = 0.0;
                        b = true;
                        --this.field15884;
                        break;
                    }
                }
            }
            final Class3167 method21551 = Class9463.method35173().method35189().method21551(Class3256.class);
            if (!method21551.method9906() || method21551.method9887("Type").equalsIgnoreCase("Hypixel")) {
                class5744.method17037(class5744.method17036() + n);
            }
            class5744.method17045(b);
        }
        else {
            this.field15884 = ((this.method9883("Avoid Fall Damage") && !this.field15885) ? 3 : 0);
            if (this.method9883("Avoid Fall Damage") && this.field15885 && !this.field15887 && Class3308.field15514.field4684.method1935().y < -0.1) {
                this.field15887 = !this.field15887;
                class5744.method17045(true);
            }
        }
    }
}
