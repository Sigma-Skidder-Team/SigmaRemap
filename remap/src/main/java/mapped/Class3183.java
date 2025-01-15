// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3183 extends Class3167
{
    private int field15576;
    private double field15577;
    private double field15578;
    private double field15579;
    
    public Class3183() {
        super(Class8013.field32990, "Hawk", "A fly for Hawk anticheat");
    }
    
    @Override
    public void method9879() {
        this.field15577 = Class3183.field15514.field4684.posX;
        this.field15578 = Class3183.field15514.field4684.posY;
        this.field15579 = Class3183.field15514.field4684.posZ;
        this.field15576 = 0;
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3183.field15514.field4684.getMotion().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @Class6753
    @Class6759
    public void method9987(final Class5717 class5717) {
        if (this.method9906()) {
            final double n = 0.125;
            if (this.field15576 != -1) {
                if (this.field15576 == 0) {
                    Class7482.method23149(class5717, 0.18);
                }
            }
            else {
                class5717.method16975(0.015);
                Class7482.method23149(class5717, n);
            }
            Class6430.method19155(class5717.method16974());
            Class6430.method19154(class5717.method16972());
            Class6430.method19156(class5717.method16976());
        }
    }
    
    @Class6753
    public void method9988(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15576;
            if (this.field15576 == 1) {
                class5744.method17037(0.1);
            }
            class5744.method17033(true);
            class5744.method17045(false);
        }
    }
    
    @Class6753
    public void method9989(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15576 >= 1) {
                    this.field15576 = -1;
                }
                this.field15577 = class5724.field19377;
                this.field15578 = class5724.field19378;
                this.field15579 = class5724.field19379;
                class5724.field19380 = Class3183.field15514.field4684.rotationYaw;
                class5724.field19381 = Class3183.field15514.field4684.rotationPitch;
            }
        }
    }
    
    @Class6753
    public void method9990(final Class5741 class5741) {
        if (this.method9906()) {
            final double field15578 = this.field15578;
            final double field15579 = this.field15577;
            final double field15580 = this.field15579;
            Class3183.field15514.field4684.posY = field15578;
            Class3183.field15514.field4684.lastTickPosY = field15578;
            Class3183.field15514.field4684.field3019 = field15578;
            Class3183.field15514.field4684.prevPosY = field15578;
            Class3183.field15514.field4684.posX = field15579;
            Class3183.field15514.field4684.lastTickPosX = field15579;
            Class3183.field15514.field4684.field3018 = field15579;
            Class3183.field15514.field4684.prevPosX = field15579;
            Class3183.field15514.field4684.posZ = field15580;
            Class3183.field15514.field4684.lastTickPosZ = field15580;
            Class3183.field15514.field4684.field3020 = field15580;
            Class3183.field15514.field4684.prevPosZ = field15580;
        }
    }
}
