// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3351 extends Class3167
{
    private int field15969;
    private int field15970;
    private double field15971;
    private double field15972;
    private double field15973;
    private double field15974;
    private double field15975;
    private double field15976;
    
    public Class3351() {
        super(Class8013.field32990, "OmegaCraft", "A fly for OmegaCraft");
    }
    
    @Override
    public void method9879() {
        this.field15971 = Class3351.field15514.field4684.posX;
        this.field15972 = Class3351.field15514.field4684.posY;
        this.field15973 = Class3351.field15514.field4684.posZ;
        this.field15974 = Class3351.field15514.field4684.posX;
        this.field15975 = Class3351.field15514.field4684.posY;
        this.field15976 = Class3351.field15514.field4684.posZ;
        this.field15969 = 0;
        this.field15970 = 0;
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3351.field15514.field4684.getMotion().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @Class6753
    @Class6759
    public void method10605(final Class5717 class5717) {
        if (this.method9906()) {
            ++this.field15970;
            final double max = Math.max(0.35, 0.0);
            if (this.field15969 <= 2) {
                if (this.field15969 != -1) {
                    if (this.field15969 == 0) {
                        if (!Class3351.field15514.field4648.field23439.method1056()) {
                            if (class5717.method16974() > 0.0) {
                                class5717.method16975(-Class7482.method23141());
                            }
                        }
                        Class6430.method19155(class5717.method16974());
                        Class7482.method23149(class5717, max - 0.01);
                    }
                }
                else {
                    class5717.method16975(Class7482.method23141());
                    if (Class3351.field15514.field4648.field23440.method1056()) {
                        if (!Class3351.field15514.field4648.field23439.method1056()) {
                            class5717.method16975(-Class7482.method23141());
                        }
                    }
                    Class6430.method19155(class5717.method16974());
                    Class7482.method23149(class5717, max);
                }
            }
            else {
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @Class6753
    public void method10606(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15969;
            if (this.field15969 == 1) {
                class5744.method17045(true);
            }
            if (this.field15969 != 2) {
                if (this.field15969 > 2) {
                    if (this.field15969 != 40) {
                        class5744.method16961(true);
                    }
                    else {
                        class5744.method17037(-(150.0 + Math.random() * 150.0));
                    }
                }
            }
            else {
                class5744.method17037(-(150.0 + Math.random() * 150.0));
            }
            class5744.method17033(true);
        }
    }
    
    @Class6753
    public void method10607(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15969 >= 1) {
                    this.field15969 = -1;
                }
                this.field15974 = this.field15971;
                this.field15975 = this.field15972;
                this.field15976 = this.field15973;
                this.field15971 = class5724.field19377;
                this.field15972 = class5724.field19378;
                this.field15973 = class5724.field19379;
                class5724.field19380 = Class3351.field15514.field4684.rotationYaw;
                class5724.field19381 = Class3351.field15514.field4684.rotationPitch;
            }
        }
    }
    
    @Class6753
    public void method10608(final Class5741 class5741) {
        if (this.method9906()) {
            double n = this.field15971 - this.field15974;
            double n2 = this.field15972 - this.field15975;
            double n3 = this.field15973 - this.field15976;
            double field15974 = this.field15974;
            double field15975 = this.field15975;
            double field15976 = this.field15976;
            if (this.field15969 == -1) {
                n *= 0.0;
                n2 *= 0.0;
                n3 *= 0.0;
            }
            if (this.field15969 != 0) {
                if (this.field15969 != 1) {
                    if (this.field15969 > 1) {
                        field15974 += n;
                        field15975 += n2;
                        field15976 += n3;
                        n2 = (n = (n3 = 0.0));
                    }
                }
                else {
                    field15974 += n * 2.0 / 3.0;
                    field15975 += n2 * 2.0 / 3.0;
                    field15976 += n3 * 2.0 / 3.0;
                    n *= 0.0;
                    n2 *= 0.0;
                    n3 *= 0.0;
                }
            }
            else {
                field15974 += n * 1.0 / 3.0;
                field15975 += n2 * 1.0 / 3.0;
                field15976 += n3 * 1.0 / 3.0;
                n *= 0.0;
                n2 *= 0.0;
                n3 *= 0.0;
            }
            final double n4 = field15974 + n * Class3351.field15514.method5314();
            final double n5 = field15975 + n2 * Class3351.field15514.method5314();
            final double n6 = field15976 + n3 * Class3351.field15514.method5314();
            Class3351.field15514.field4684.posY = n5;
            Class3351.field15514.field4684.lastTickPosY = n5;
            Class3351.field15514.field4684.field3019 = n5;
            Class3351.field15514.field4684.prevPosY = n5;
            Class3351.field15514.field4684.posX = n4;
            Class3351.field15514.field4684.lastTickPosX = n4;
            Class3351.field15514.field4684.field3018 = n4;
            Class3351.field15514.field4684.prevPosX = n4;
            Class3351.field15514.field4684.posZ = n6;
            Class3351.field15514.field4684.lastTickPosZ = n6;
            Class3351.field15514.field4684.field3020 = n6;
            Class3351.field15514.field4684.prevPosZ = n6;
        }
    }
}
