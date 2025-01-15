// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3194 extends Class3167
{
    private int field15598;
    private int field15599;
    private double field15600;
    private double field15601;
    private double field15602;
    private double field15603;
    private double field15604;
    private double field15605;
    
    public Class3194() {
        super(Class8013.field32990, "Test", "A fly for OmegaCraft");
    }
    
    @Override
    public void method9879() {
        this.field15600 = Class3194.field15514.field4684.posX;
        this.field15601 = Class3194.field15514.field4684.posY;
        this.field15602 = Class3194.field15514.field4684.posZ;
        this.field15603 = 0.0;
        this.field15598 = 2;
        this.field15599 = 0;
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3194.field15514.field4684.getMotion().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
        Class3194.field15514.field4633.field26532 = 1.0f;
    }
    
    @Class6753
    @Class6759
    public void method10018(final Class5717 class5717) {
        if (this.method9906()) {
            Math.sqrt(class5717.method16972() * class5717.method16972() + class5717.method16976() * class5717.method16976());
            if (this.field15598 <= 1) {
                if (this.field15598 != -1) {
                    if (this.field15598 != 0) {
                        if (this.field15598 < 1) {}
                    }
                    else {
                        Class7482.method23149(class5717, 0.1);
                    }
                }
                else {
                    ++this.field15599;
                    if (this.field15599 != 1) {
                        if (this.field15599 % 3 != 0) {
                            if (this.field15599 % 3 != 1) {}
                        }
                    }
                    Class6430.method19155(class5717.method16974());
                    Class7482.method23149(class5717, 1.0);
                }
            }
            else {
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @Class6753
    public void method10019(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15598;
            if (this.field15598 != 3) {
                if (this.field15598 > 3) {
                    if (this.field15598 >= 20 && this.field15598 % 20 == 0) {
                        class5744.method17037(0.0);
                    }
                    else {
                        class5744.method16961(true);
                    }
                }
            }
            else {
                class5744.method17037(1000.0);
            }
            class5744.method17033(true);
        }
    }
    
    @Class6753
    public void method10020(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15598 >= 1) {
                    this.field15598 = -1;
                }
                this.field15604 = this.field15601;
                this.field15605 = this.field15602;
                this.field15600 = class5724.field19377;
                this.field15601 = class5724.field19378;
                this.field15602 = class5724.field19379;
                class5724.field19380 = Class3194.field15514.field4684.rotationYaw;
                class5724.field19381 = Class3194.field15514.field4684.rotationPitch;
            }
        }
    }
    
    @Class6753
    public void method10021(final Class5721 class5721) {
        if (this.method9906()) {
            final IPacket method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15598 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @Class6753
    public void method10022(final Class5741 class5741) {
        if (this.method9906()) {
            return;
        }
    }
}
