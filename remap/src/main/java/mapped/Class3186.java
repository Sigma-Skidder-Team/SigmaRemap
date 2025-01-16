// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3186 extends Class3167
{
    private int field15585;
    private double field15586;
    private boolean field15587;
    
    public Class3186() {
        super(Class8013.field32990, "Reloaded", "A fly for AnticheatReloaded");
        this.method9881(new Class4996("Speed", "Fly speed", 4.0f, Float.class, 0.3f, 8.0f, 0.1f));
        this.method9881(new Class4999("Offset", "Offset while flying", false));
        this.method9881(new Class4999("NoFall", "Avoid getting fall damage when flying down", true));
    }
    
    @Override
    public void method9879() {
        this.field15586 = Class3186.field15514.player.posY;
        this.field15585 = 0;
        if (!Class3186.field15514.gameSettings.field23440.method1056()) {
            if (!Class3186.field15514.gameSettings.field23440.method1056()) {
                this.field15587 = false;
            }
        }
        else {
            Class3186.field15514.gameSettings.field23440.field2162 = false;
            this.field15587 = true;
        }
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3186.field15514.player.getMotion().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @Class6753
    private void method9993(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == Class3186.field15514.gameSettings.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field15587 = true;
            }
        }
    }
    
    @Class6753
    private void method9994(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == Class3186.field15514.gameSettings.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field15587 = false;
            }
        }
    }
    
    @Class6753
    @Class6759
    public void method9995(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15585 != -1) {
                if (this.field15585 == 0) {
                    if (Math.abs(class5717.method16974()) < 0.08) {
                        class5717.method16975(this.method9883("Offset") ? -0.01 : 0.0);
                    }
                    Class6430.method19155(class5717.method16974());
                    Class7482.method23149(class5717, 0.35);
                }
            }
            else {
                double n = this.method9883("Offset") ? 0.01 : 0.0;
                if (this.field15587) {
                    n -= this.method9886("Speed") / 2.0f;
                }
                if (Class3186.field15514.gameSettings.field23439.method1056()) {
                    n += this.method9886("Speed") / 2.0f;
                }
                class5717.method16975(n);
                Class6430.method19155(class5717.method16974());
                Class7482.method23149(class5717, this.method9886("Speed"));
            }
        }
    }
    
    @Class6753
    public void method9996(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15585;
            if (this.field15585 != 2) {
                if (this.field15585 > 2) {
                    if (this.field15585 >= 20) {
                        if (this.field15585 % 20 == 0) {
                            class5744.method17037(-150.0 - Math.random() * 150.0);
                        }
                    }
                }
            }
            else {
                class5744.method17037(-150.0 - Math.random() * 150.0);
            }
            if (this.method9883("NoFall")) {
                class5744.method17045(true);
            }
            class5744.method17033(true);
        }
    }
    
    @Class6753
    public void method9997(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15585 >= 1) {
                    this.field15585 = -1;
                }
                this.field15586 = class5724.field19378;
                class5724.field19380 = Class3186.field15514.player.rotationYaw;
                class5724.field19381 = Class3186.field15514.player.rotationPitch;
            }
        }
    }
    
    @Class6753
    public void method9998(final Class5721 class5721) {
        if (this.method9906()) {
            final IPacket method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15585 == -1) {
                    if (this.method9883("NoFall")) {
                        class5722.field19504 = true;
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method9999(final Class5741 class5741) {
        if (this.method9906()) {
            final double field15586 = this.field15586;
            Class3186.field15514.player.posY = field15586;
            Class3186.field15514.player.lastTickPosY = field15586;
            Class3186.field15514.player.field3019 = field15586;
            Class3186.field15514.player.prevPosY = field15586;
        }
    }
}
