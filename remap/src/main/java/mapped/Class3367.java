// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3367 extends Class3355
{
    private boolean field16030;
    private int field16031;
    private int field16032;
    
    public Class3367() {
        super("NCP", "Phase for NCP anticheat", Class8013.field32990);
        this.method9881(new Class4999("Hypixel", "Hypixel bypass", true));
    }
    
    @Override
    public void method9879() {
        this.field16030 = false;
        if (!Class3367.field15514.field4684.collidedHorizontally) {
            this.field16031 = -1;
        }
        else {
            this.field16031 = 0;
            if (Class3367.field15514.field4684.onGround) {
                Class3367.field15514.method5269().method17292(new Class4354(Class3367.field15514.field4684.posX, Class3367.field15514.field4684.posY + 0.0626, Class3367.field15514.field4684.posZ, false));
            }
        }
    }
    
    @Class6753
    private void method10698(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            if (Class3367.field15514.field4648.field23440.method1056()) {
                final double field2395 = Class3367.field15514.field4684.posX;
                final double field2396 = Class3367.field15514.field4684.posY;
                final double field2397 = Class3367.field15514.field4684.posZ;
                if (!Class6430.method19114()) {
                    if (Class6430.method19160(Class3367.field15514.field4684, 0.001f) && !method10703()) {
                        Class3367.field15514.field4684.setPosition(field2395, field2396 - 1.0, field2397);
                        class5744.method17037(field2396 - 1.0);
                        class5744.method17033(true);
                        class5744.method17043(class5744.method17042() + 10.0f);
                        Class6430.method19155(0.0);
                    }
                    else if (Class3367.field15514.field4684.posY == (int)Class3367.field15514.field4684.posY) {
                        Class3367.field15514.field4684.setPosition(field2395, field2396 - 0.3, field2397);
                    }
                }
            }
            Label_0045: {
                if (this.field16031 > 0) {
                    if (this.field16030) {
                        if (method10703()) {
                            ++this.field16032;
                            final float n = (float)Math.sin(this.field16032) * 5.0f;
                            final float n2 = (float)Math.cos(this.field16032) * 5.0f;
                            class5744.method17043(class5744.method17042() + n);
                            class5744.method17041(class5744.method17040() + n2);
                            break Label_0045;
                        }
                    }
                }
                if (this.field16031 < 0) {
                    return;
                }
            }
            class5744.method17033(true);
        }
    }
    
    @Class6753
    private void method10699(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        if (Class3367.field15514.field4684.collidedHorizontally) {
            if (this.field16031 != 0) {
                this.field16031 = 0;
                if (Class3367.field15514.field4684.onGround) {
                    Class3367.field15514.method5269().method17292(new Class4354(Class3367.field15514.field4684.posX, Class3367.field15514.field4684.posY + 0.0626, Class3367.field15514.field4684.posZ, false));
                }
            }
        }
        if (this.field16031 >= 0) {
            if (this.field16031 != 0) {
                if (!method10703()) {
                    this.field16030 = false;
                    Class7482.method23149(class5717, 0.0);
                    return;
                }
                if (!this.field16030) {
                    Class7482.method23149(class5717, this.method9883("Hypixel") ? 0.03 : 0.0031);
                }
                else {
                    Class7482.method23149(class5717, 0.617);
                }
            }
            else {
                Class7482.method23149(class5717, 0.0);
                this.method10702(6.000000238415E-4);
            }
            ++this.field16031;
        }
    }
    
    @Class6753
    private void method10700(final Class5713 class5713) {
        if (this.method9906()) {
            class5713.method16961(true);
        }
    }
    
    @Class6753
    private void method10701(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                class5724.field19380 = Class3367.field15514.field4684.rotationYaw;
                class5724.field19381 = Class3367.field15514.field4684.rotationPitch;
                this.field16030 = true;
            }
        }
    }
    
    private void method10702(final double n) {
        double n2 = Class3367.field15514.field4684.field4085.field24722;
        double n3 = Class3367.field15514.field4684.field4085.field24721;
        float field2399 = Class3367.field15514.field4684.rotationYaw;
        if (n2 != 0.0) {
            if (n3 <= 0.0) {
                if (n3 < 0.0) {
                    field2399 += ((n2 <= 0.0) ? -45 : 45);
                }
            }
            else {
                field2399 += ((n2 <= 0.0) ? 45 : -45);
            }
            n3 = 0.0;
            if (n2 <= 0.0) {
                if (n2 < 0.0) {
                    n2 = -1.0;
                }
            }
            else {
                n2 = 1.0;
            }
        }
        Class3367.field15514.field4684.setPosition(Class3367.field15514.field4684.posX + (n2 * n * Math.cos(Math.toRadians(field2399 + 90.0f)) + n3 * n * Math.sin(Math.toRadians(field2399 + 90.0f))), Class3367.field15514.field4684.posY, Class3367.field15514.field4684.posZ + (n2 * n * Math.sin(Math.toRadians(field2399 + 90.0f)) - n3 * n * Math.cos(Math.toRadians(field2399 + 90.0f))));
    }
    
    public static boolean method10703() {
        return Class3367.field15514.world.method6981(Class3367.field15514.field4684, Class3367.field15514.field4684.boundingBox).count() != 0L;
    }
}
