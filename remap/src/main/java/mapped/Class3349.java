// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3349 extends Class3167
{
    private boolean field15959;
    private double field15960;
    private double field15961;
    private double field15962;
    private int field15963;
    
    public Class3349() {
        super(Class8013.field32990, "YPort", "YPort speed");
        this.method9881(new Class5001("Mode", "YPort mode", 0, new String[] { "NCP", "OldNCP" }));
        this.method9881(new Class4999("OnGround", "See yourself on ground", true));
    }
    
    @Class6753
    public void method10596(final Class5744 class5744) {
        if (this.method9906()) {
            if (Class3349.field15514.field4684 != null) {
                if (!Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
                    if (Class3349.field15514.field4684.onGround) {
                        if (class5744.method17046()) {
                            if (Class6430.method19146()) {
                                class5744.method17037(class5744.method17036() + 1.0E-14);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method9879() {
        this.field15959 = false;
        this.field15963 = 0;
        this.field15961 = ((Class3349.field15514.field4684 != null) ? Class7482.method23136() : 0.2873);
        this.field15960 = Class3349.field15514.field4684.posY;
    }
    
    @Override
    public void method9897() {
        this.field15959 = false;
        if (Class3349.field15514.field4684.getMotion().y > 0.33) {
            Class6430.method19155(-0.43 + Class7482.method23140() * 0.1);
            Class7482.method23151(Class7482.method23136());
        }
    }
    
    @Class6753
    public void method10597(final Class5717 class5717) {
        if (!this.method9906() || Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
            return;
        }
        if (Class3349.field15514.field4684.field2967) {
            return;
        }
        final String method9887 = this.method9887("Mode");
        switch (method9887) {
            case "NCP": {
                if (Class7482.method23148() && Class3349.field15514.field4684.onGround) {
                    Class3349.field15514.field4684.method2725();
                    class5717.method16975(Class3349.field15514.field4684.getMotion().y);
                    Class7482.method23149(class5717, 0.461);
                    this.field15959 = true;
                    Class3349.field15514.field4684.stepHeight = 0.5f;
                    break;
                }
                if (this.field15959 && Class6430.method19160(Class3349.field15514.field4684, (float)(Class7482.method23141() + Class7482.method23140() * 0.1 + 0.0010000000474974513))) {
                    this.field15959 = !this.field15959;
                    Class7482.method23149(class5717, 0.312);
                    class5717.method16975(-0.43 + Class7482.method23140() * 0.1);
                    Class6430.method19155(class5717.method16974());
                    Class3349.field15514.field4684.stepHeight = 0.0f;
                    break;
                }
                if (this.field15959) {
                    class5717.method16975(-0.1);
                    this.field15959 = !this.field15959;
                    break;
                }
                break;
            }
            case "OldNCP": {
                if (Class3349.field15514.field4684.onGround && Class6430.method19114()) {
                    this.field15963 = 2;
                }
                if (this.field15963 == 1 && Class6430.method19114()) {
                    this.field15963 = 2;
                    this.field15961 = 1.38 * Class7482.method23136() - 0.01;
                }
                else if (this.field15963 == 2) {
                    this.field15963 = 3;
                    class5717.method16975((0.401448482 + 0.002 * Math.random()) * (1.0 + Math.sqrt(Class7482.method23140() / 2.0f) / 2.0));
                    this.field15961 *= 2.149;
                }
                else if (this.field15963 == 3) {
                    this.field15963 = 4;
                    this.field15961 = this.field15962 - 0.66 * (this.field15962 - Class7482.method23136());
                }
                else {
                    if (Class3349.field15514.field4683.method6981(Class3349.field15514.field4684, Class3349.field15514.field4684.boundingBox.method18499(0.0, Class3349.field15514.field4684.getMotion().y, 0.0)).count() > 0L || Class3349.field15514.field4684.collidedVertically) {
                        this.field15963 = 1;
                    }
                    this.field15961 = this.field15962 - this.field15962 / 159.0;
                }
                Class7482.method23149(class5717, this.field15961 = Math.max(this.field15961, Class7482.method23136()));
                Class3349.field15514.field4684.stepHeight = 0.6f;
                Class6430.method19155(class5717.method16974());
                break;
            }
        }
    }
    
    @Class6753
    private void method10598(final Class5747 class5747) {
        if (this.method9906()) {
            if (!this.method9887("Mode").equalsIgnoreCase("NCP")) {
                if (!Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
                    if (!Class3349.field15514.field4684.method1706()) {
                        if (!Class3349.field15514.field4684.method1723()) {
                            if (!Class3349.field15514.field4684.method2688()) {
                                if (!Class3349.field15514.field4648.field23439.field2162) {
                                    if (!Class3349.field15514.field4684.method2688()) {
                                        if (!Class7482.method23142()) {
                                            if (!Class3349.field15514.field4684.method1706()) {
                                                if (Class6430.method19160(Class3349.field15514.field4684, 1.0f)) {
                                                    if (!Class3349.field15514.field4684.onGround) {
                                                        if (this.field15963 == 3) {
                                                            Class6430.method19155(-0.3994);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                final double n = Class3349.field15514.field4684.posX - Class3349.field15514.field4684.prevPosX;
                                final double n2 = Class3349.field15514.field4684.posZ - Class3349.field15514.field4684.prevPosZ;
                                this.field15962 = Math.sqrt(n * n + n2 * n2);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10599(final Class5741 class5741) {
        if (this.method9906()) {
            if (Class6430.method19160(Class3349.field15514.field4684, 0.43f)) {
                if (Class3349.field15514.field4684.fallDistance <= 0.09) {
                    if (this.method9883("OnGround")) {
                        if (!Class3349.field15514.field4648.field23439.field2162) {
                            if (!Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
                                if (Class3349.field15514.field4684.onGround) {
                                    if (Class6430.method19160(Class3349.field15514.field4684, 0.001f)) {
                                        this.field15960 = Class3349.field15514.field4684.posY;
                                    }
                                }
                                Class3349.field15514.field4684.posY = this.field15960;
                                Class3349.field15514.field4684.lastTickPosY = this.field15960;
                                Class3349.field15514.field4684.field3019 = this.field15960;
                                Class3349.field15514.field4684.prevPosY = this.field15960;
                                if (Class7482.method23148()) {
                                    Class3349.field15514.field4684.field3013 = 0.099999994f;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10600(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15962 = 0.0;
            }
        }
    }
}
