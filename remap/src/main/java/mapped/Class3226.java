// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class3226 extends Class3167
{
    private List<IPacket<?>> field15683;
    private boolean field15684;
    private Class7617 field15685;
    
    public Class3226() {
        super(Class8013.field32989, "Hypixel", "Disable watchdog.");
        this.field15683 = new ArrayList<IPacket<?>>();
        this.field15685 = new Class7617();
    }
    
    @Override
    public void method9879() {
        if (Class9171.field38852) {
            if (!Class3226.field15514.player.onGround) {
                this.field15684 = false;
            }
            else {
                final double field2395 = Class3226.field15514.player.posX;
                final double field2396 = Class3226.field15514.player.posY;
                final double field2397 = Class3226.field15514.player.posZ;
                this.field15684 = false;
                Class3226.field15514.method5269().method17292(new Class4354(field2395, field2396 + 0.2, field2397, false));
                Class3226.field15514.method5269().method17292(new Class4354(field2395, field2396 + 0.1, field2397, false));
                this.field15684 = true;
                this.field15685.method23934();
                this.field15685.method23932();
                if (!this.method9883("Instant")) {
                    Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "Wait 5s..."));
                }
                else {
                    Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "Move where you want"));
                }
            }
            return;
        }
        Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "Set Hypixel mode before playing"));
    }
    
    @Override
    public void method9897() {
        this.field15685.method23934();
        this.field15685.method23932();
        if (this.field15684) {
            for (int size = this.field15683.size(), i = 0; i < size; ++i) {
                Class3226.field15514.method5269().method17292(this.field15683.get(i));
            }
            Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "Disabler canceled"));
        }
        this.field15683.clear();
    }
    
    @Class6753
    public void method10162(final Class5744 class5744) {
        if (Class3226.field15514.player != null && Class9171.field38852) {
            if (!this.field15684) {
                if (Class3226.field15514.player.onGround) {
                    if (!this.method9883("Instant")) {
                        Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "Wait 5s..."));
                    }
                    else {
                        Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "Move where you want"));
                    }
                    this.field15685.method23934();
                    this.field15685.method23932();
                    this.field15684 = true;
                }
            }
        }
    }
    
    @Class6753
    public void method10163(final Class5717 class5717) {
        if (Class3226.field15514.player == null || !Class9171.field38852) {
            return;
        }
        if (!this.method9883("Instant")) {
            if (this.field15684) {
                class5717.method16973(0.0);
                class5717.method16975(0.0);
                class5717.method16977(0.0);
            }
        }
        if (this.field15685.method23935() > 10000L && this.field15684) {
            this.field15684 = false;
            for (int size = this.field15683.size(), i = 0; i < size; ++i) {
                Class3226.field15514.method5269().method17292(this.field15683.get(i));
            }
            this.field15683.clear();
            this.field15685.method23934();
            this.field15685.method23933();
            this.method9914().method9910();
            Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "Disabler failed"));
        }
    }
    
    @Class6753
    private void method10164(final Class5721 class5721) {
        if (Class3226.field15514.method5269() == null || !Class9171.field38852) {
            return;
        }
        if (this.field15684) {
            if (!(class5721.method16990() instanceof Class4336)) {
                if (!(class5721.method16990() instanceof Class4353)) {
                    if (!(class5721.method16990() instanceof Class4381)) {
                        if (!(class5721.method16990() instanceof Class4380)) {
                            if (!(class5721.method16990() instanceof Class4307)) {
                                return;
                            }
                        }
                    }
                }
            }
            if (this.method9883("Instant")) {
                this.field15683.add(class5721.method16990());
            }
            class5721.method16961(true);
        }
    }
    
    @Class6753
    public void method10165(final Class5723 class5723) {
        if (Class3226.field15514.player != null) {
            if (this.field15684) {
                if (Class9171.field38852) {
                    if (!this.method9906() && !this.method9883("Instant")) {
                        return;
                    }
                    if (class5723.method16998() instanceof Class4328) {
                        this.method9914().method9910();
                        if (!this.method9883("Instant")) {
                            Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "You can do what you want for 5s"));
                        }
                        else {
                            final Class4328 class5724 = (Class4328)class5723.method16998();
                            class5723.method16961(true);
                            Class3226.field15514.method5269().method17292(new Class4355(class5724.field19377, class5724.field19378, class5724.field19379, class5724.field19380, class5724.field19381, false));
                            for (int size = this.field15683.size(), i = 0; i < size; ++i) {
                                Class3226.field15514.method5269().method17292(this.field15683.get(i));
                            }
                            this.field15683.clear();
                            Class9463.method35173().method35197().method25776(new Class6224("Hypixel disabler", "Successfully sent packets"));
                        }
                        this.field15684 = false;
                    }
                }
            }
        }
    }
}
