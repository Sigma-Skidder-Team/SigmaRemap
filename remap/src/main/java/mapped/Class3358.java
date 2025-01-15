// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

public class Class3358 extends Class3355
{
    private int field15992;
    private int field15993;
    private int field15994;
    private double field15995;
    private double field15996;
    private double field15997;
    private boolean field15998;
    private boolean field15999;
    
    public Class3358() {
        super("Mineplex", "Mineplex fly/longjump", Class8013.field32990);
        this.method9881(new Class4996("Boost", "Boost value", 4.0f, Float.class, 1.0f, 8.0f, 0.01f));
        this.method9881(new Class4999("Fake", "Simulate a real fly", false));
    }
    
    @Override
    public void method9879() {
        this.field15992 = -1;
        this.field15995 = Class7482.method23136();
        this.field15993 = 0;
        this.field15999 = false;
        this.field15994 = -1;
        this.field15997 = -1.0;
        this.method10637();
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(Class7482.method23136() * 0.5);
        if (this.field15994 != -1) {
            Class3358.field15514.method5269().method17292(new Class4321(Class3358.field15514.field4684.field3006.field2743));
            this.field15994 = Class3358.field15514.field4684.field3006.field2743;
        }
        Class3358.field15514.field4633.field26532 = 1.0f;
    }
    
    @Class6753
    public void method10630(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            class5744.method17033(true);
        }
    }
    
    @Class6753
    public void method10631(final Class5732 class5732) {
        if (this.method9906()) {
            final int n = -1;
            this.field15994 = n;
            this.field15992 = n;
            this.field15997 = n;
            this.field15993 = 0;
            this.field15999 = false;
            this.field15995 = Class7482.method23136();
        }
    }
    
    public boolean method10632() {
        if (this.method9906()) {
            if (this.field15994 != -1) {
                if (this.field15995 < this.method9886("Boost")) {
                    if (Class3358.field15514.field4684.onGround || Class6430.method19160(Class3358.field15514.field4684, 0.001f)) {
                        if (!this.field15999) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Class6753
    public void method10633(final Class5738 class5738) {
        if (this.method9906()) {
            if (this.field15999) {
                if (Class3358.field15514.field4684 != null) {
                    if (Class3358.field15514.field4684.onGround) {
                        class5738.method17026(true);
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10634(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        if (!this.field15999) {
            final float n = Class3358.field15514.field4684.rotationYaw + 90.0f;
            if (!Class3358.field15514.field4684.onGround && !Class6430.method19160(Class3358.field15514.field4684, 0.001f)) {
                if (this.field15992 != -1) {
                    if (this.field15998) {
                        if (!Class6430.method19114()) {
                            this.field15998 = !this.field15998;
                            this.field15995 = 0.5;
                        }
                    }
                    ++this.field15993;
                    this.field15995 *= 0.98;
                    this.field15996 -= 0.04000000000001;
                    if (this.field15993 <= 22) {
                        if (this.field15993 == 10) {
                            if (this.field15998) {
                                this.field15996 = -0.005;
                            }
                        }
                    }
                    else {
                        this.field15996 -= 0.02;
                    }
                    if (this.field15993 > 6) {
                        if (!Class6430.method19114()) {
                            this.field15996 -= 0.05;
                        }
                    }
                    class5717.method16975(this.field15996);
                    if (Class3358.field15514.field4684.collidedHorizontally || !Class6430.method19114()) {
                        this.field15995 = 0.35;
                    }
                    Class7482.method23149(class5717, this.field15995);
                }
            }
            else {
                if (this.field15993 > 0) {
                    Class7482.method23149(class5717, 0.0);
                    this.method9914().method9910();
                    return;
                }
                if (this.field15992 == -1) {
                    this.field15992 = 0;
                    this.field15995 = 0.35;
                    return;
                }
                ++this.field15992;
                if (this.method10637() == -1) {
                    return;
                }
                Class3358.field15514.method5269().method17292(new Class4329(Class316.field1877, new Class7005(new Vec3d(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05), Direction.UP, new BlockPos(Class3358.field15514.field4684).add(0, -1, 0), false)));
                if (this.field15995 >= this.method9886("Boost")) {
                    Class7482.method23149(class5717, 0.0);
                    Class3358.field15514.field4684.method2725();
                    this.field15996 = 0.4299999;
                    this.field15993 = 0;
                    this.field15998 = Class6430.method19114();
                    class5717.method16975(this.field15996);
                    this.field15997 = Class3358.field15514.field4684.posY;
                    ++this.field15992;
                    this.field15995 += 0.5;
                }
                else {
                    Class3358.field15514.field4633.field26532 = Math.min(1.0f, Math.max(0.1f, (float)(1.2 - this.field15995 * 0.15)));
                    if (this.field15992 > 2) {
                        this.field15995 += 0.05;
                    }
                    if (this.field15992 % 2 != 0) {
                        class5717.method16973(Math.cos(Math.toRadians(n)) * this.field15995);
                        class5717.method16977(Math.sin(Math.toRadians(n)) * this.field15995);
                    }
                    else {
                        class5717.method16973(Math.cos(Math.toRadians(n + 180.0f)) * this.field15995);
                        class5717.method16977(Math.sin(Math.toRadians(n + 180.0f)) * this.field15995);
                    }
                }
            }
            return;
        }
        Class7482.method23149(class5717, 0.01);
    }
    
    @Class6753
    public void method10635(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15999 = true;
                Class9463.method35173().method35197().method25776(new Class6224("Mineplex fly", "Please try again"));
            }
        }
    }
    
    @Class6753
    public void method10636(final Class5721 class5721) {
        if (this.method9906()) {
            if (class5721.method16990() instanceof Class4321) {
                if (this.field15994 != -1) {
                    if (this.field15995 < this.method9886("Boost")) {
                        if (Class3358.field15514.field4684.onGround || Class6430.method19160(Class3358.field15514.field4684, 0.001f)) {
                            if (!this.field15999) {
                                class5721.method16961(true);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private int method10637() {
        if (!Class3358.field15514.field4684.getHeldItemMainhand().method27620()) {
            for (int i = 36; i < 45; ++i) {
                final int field15994 = i - 36;
                if (Class3358.field15514.field4684.field3008.method10878(i).method20053().method27620()) {
                    if (Class3358.field15514.field4684.field3006.field2743 != field15994) {
                        if (this.field15994 != field15994) {
                            Class3358.field15514.method5269().method17292(new Class4321(field15994));
                            this.field15994 = field15994;
                        }
                    }
                    return field15994;
                }
            }
            Class8639.method29367(Class3358.field15514.field4684.field3008.field16154, 42, 0, Class2133.field12438, Class3358.field15514.field4684, true);
            if (!Class3358.field15514.field4684.field3008.method10878(42).method20053().method27620()) {
                Class9463.method35173().method35197().method25776(new Class6224("Mineplex Fly", "Please empty a slot in your inventory"));
            }
            else if (Class3358.field15514.field4684.field3006.field2743 != 6) {
                if (this.field15994 != 6) {
                    Class3358.field15514.method5269().method17292(new Class4321(6));
                    return this.field15994 = 6;
                }
            }
            return -1;
        }
        return this.field15994 = Class3358.field15514.field4684.field3006.field2743;
    }
    
    @Class6753
    public void method10638(final Class5741 class5741) {
        if (this.method9906()) {
            if (this.method9883("Fake")) {
                if (this.field15997 >= 0.0) {
                    if (Class3358.field15514.field4684.posY >= this.field15997) {
                        Class3358.field15514.field4684.posY = this.field15997;
                        Class3358.field15514.field4684.lastTickPosY = this.field15997;
                        Class3358.field15514.field4684.field3019 = this.field15997;
                        Class3358.field15514.field4684.prevPosY = this.field15997;
                        if (Class7482.method23148()) {
                            Class3358.field15514.field4684.field3013 = 0.099999994f;
                        }
                    }
                }
            }
        }
    }
}
