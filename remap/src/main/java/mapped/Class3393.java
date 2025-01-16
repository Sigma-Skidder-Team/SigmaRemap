// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3393 extends Class3167
{
    private boolean field16111;
    private boolean field16112;
    private double field16113;
    private boolean field16114;
    
    public Class3393() {
        super(Class8013.field32985, "NoFall", "Avoid you from getting fall damages");
        this.field16111 = false;
        this.method9881(new Class5001("Mode", "Nofall mode", 0, new String[] { "Vanilla", "Hypixel", "AAC", "NCPSpigot", "OldHypixel", "Vanilla Legit", "Test" }).method15211("Hypixel", "Test"));
    }
    
    @Override
    public void method9879() {
        this.field16111 = false;
        this.field16112 = false;
        this.field16113 = 0.0;
    }
    
    @Class6753
    @Class6759
    private void method10828(final Class5717 class5717) {
        if (this.method9906()) {
            if (class5717.method16974() < -0.5) {
                if (Class3393.field15514.field4684.fallDistance > 2.0 + Class7482.method23140() * 0.5) {
                    if (!Class3393.field15514.field4684.onGround) {
                        if (this.method9887("Mode").equals("Hypixel")) {
                            if (Class6430.method19146()) {
                                final double[] method19177 = Class6430.method19177();
                                final int length = method19177.length;
                                double a = Double.MAX_VALUE;
                                for (final double n : method19177) {
                                    final double field2396 = Class3393.field15514.field4684.posY;
                                    final double a2 = (int)(field2396 + class5717.method16974()) - field2396 - class5717.method16974() + n;
                                    double n2 = 0.02;
                                    final double n3 = -0.05;
                                    if (class5717.method16974() > -0.5 + Class7482.method23140() * 1) {
                                        n2 = 0.0;
                                    }
                                    if (a2 > n3) {
                                        if (a2 < n2) {
                                            if (Class3393.field15514.world.method6981(Class3393.field15514.field4684, Class3393.field15514.field4684.boundingBox.offset(class5717.method16972(), class5717.method16974() + a2 + n3, class5717.method16976())).count() != 0L) {
                                                class5717.method16975(class5717.method16974() + (a2 - 1.0E-5));
                                                Class6430.method19155(class5717.method16974());
                                                a = Double.MAX_VALUE;
                                                break;
                                            }
                                            if (Math.abs(a2) < a) {
                                                a = a2;
                                            }
                                        }
                                    }
                                }
                                if (Math.abs(a) < 0.1) {
                                    class5717.method16975(class5717.method16974() + a);
                                    Class6430.method19155(class5717.method16974());
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10829(final Class5744 class5744) {
        if (!this.method9906() || Class3393.field15514.field4684 == null) {
            return;
        }
        if (Class3393.field15514.field4684.posY < 2.0) {
            return;
        }
        String method9887 = this.method9887("Mode");
        if (!Class6430.method19146() && method9887.equals("Hypixel")) {
            method9887 = "OldHypixel";
        }
        final String s = method9887;
        switch (s) {
            case "Test": {
                if (class5744.method17046()) {
                    break;
                }
                if (Class6430.method19160(Class3393.field15514.field4684, 1.0E-4f)) {
                    this.field16113 = 0.0;
                    return;
                }
                if (Class3393.field15514.field4684.getMotion().y < -0.1) {
                    this.field16113 -= Class3393.field15514.field4684.getMotion().y;
                }
                if (this.field16113 > 2.8 && (Class3393.field15514.field4684.posY % 0.0625 != 0.0 || Class3393.field15514.field4684.posY % 0.015256 != 0.0)) {
                    this.field16113 = 1.0E-14;
                    Class3393.field15514.method5269().method17292(new Class4353(true));
                    break;
                }
                break;
            }
            case "OldHypixel": {
                if (!class5744.method17046()) {
                    break;
                }
                if (Class6430.method19160(Class3393.field15514.field4684, 1.0E-4f)) {
                    this.field16113 = 0.0;
                    return;
                }
                if (Class3393.field15514.field4684.getMotion().y < -0.1) {
                    if (this.field16113 == 0.0) {
                        class5744.method17045(true);
                    }
                    this.field16113 -= Class3393.field15514.field4684.getMotion().y;
                }
                if (this.field16113 > 3.0) {
                    this.field16113 = 1.0E-14;
                    class5744.method17045(true);
                    break;
                }
                break;
            }
            case "Hypixel": {
                if (!class5744.method17046()) {
                    break;
                }
                if (Class3393.field15514.field4684.getMotion().y < 0.0 && !Class3393.field15514.field4684.onGround && Class6430.method19146()) {
                    final double[] method9888 = Class6430.method19177();
                    for (int length = method9888.length, i = 0; i < length; ++i) {
                        if ((int)class5744.method17036() - class5744.method17036() + method9888[i] == 0.0) {
                            class5744.method17045(true);
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            case "AAC": {
                if (!class5744.method17046()) {
                    break;
                }
                if (Class3393.field15514.field4684.ticksExisted == 1) {
                    this.field16111 = false;
                }
                if (!this.field16111 && Class3393.field15514.field4684.fallDistance > 3.0f && this.method9887("Mode").equals("AAC")) {
                    this.field16111 = !this.field16111;
                    Class3393.field15514.method5269().method17292(new Class4354(Class3393.field15514.field4684.posX, Double.NaN, Class3393.field15514.field4684.posZ, true));
                    break;
                }
                break;
            }
            case "Vanilla": {
                if (!class5744.method17046()) {
                    break;
                }
                if (Class3393.field15514.field4684.getMotion().y < -0.1) {
                    class5744.method17045(true);
                    break;
                }
                break;
            }
            case "Vanilla Legit": {
                if (Class3393.field15514.field4684.getMotion().y < -0.1) {
                    class5744.method17045(true);
                }
                if (Class3393.field15514.field4684.fallDistance > 3.0f) {
                    this.field16114 = true;
                }
                if (this.field16114 && Class3393.field15514.field4684.onGround && !Class3393.field15514.field4684.method1706()) {
                    final double field2395 = Class3393.field15514.field4684.posX;
                    final double field2396 = Class3393.field15514.field4684.posY;
                    final double field2397 = Class3393.field15514.field4684.posZ;
                    Class3393.field15514.method5269().method17292(new Class4354(field2395, field2396 + 3.01, field2397, false));
                    Class3393.field15514.method5269().method17292(new Class4354(field2395, field2396, field2397, false));
                    Class3393.field15514.method5269().method17292(new Class4354(field2395, field2396, field2397, true));
                    System.out.println("sent");
                    this.field16114 = false;
                    break;
                }
                break;
            }
            case "NCPSpigot": {
                if (!class5744.method17046()) {
                    break;
                }
                if (Class3393.field15514.field4684.fallDistance > 3.0f) {
                    this.field16112 = true;
                }
                if (this.field16112 && Class9463.method35173().method35194().method29228() == 0 && Class3393.field15514.field4684.onGround) {
                    class5744.method17037(class5744.method17036() - 11.0);
                    this.field16112 = false;
                    break;
                }
                break;
            }
        }
    }
}
