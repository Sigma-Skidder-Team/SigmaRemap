// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class Class3222 extends Class3167
{
    private Class7617 field15680;
    private boolean field15681;
    
    public Class3222() {
        super(Class8013.field32986, "Packet", "Packet criticals");
        this.field15680 = new Class7617();
        this.method9881(new Class4996("HurtTime", "The hurtTime to crit at", 15.0f, Integer.class, 0.0f, 20.0f, 1.0f));
    }
    
    @Class6753
    private void method10157(final Class5750 class5750) {
        if (this.method9906()) {
            if (class5750.method17057() != null) {
                if (class5750.method17059()) {
                    final Entity method17057 = class5750.method17057();
                    if (method17057 instanceof LivingEntity) {
                        if (method17057.hurtResistantTime <= (int)this.method9886("HurtTime")) {
                            if (Class3265.field15758 > 1) {
                                if (this.field15680.method23935() > 200L || method17057.hurtResistantTime > 0) {
                                    if (Class3222.field15514.field4684.onGround) {
                                        if (Class3222.field15514.field4684.collidedVertically) {
                                            double[] array = { 0.2, 0.0 };
                                            if (this.method9914().method9883("Hypixel")) {
                                                array = new double[] { 0.121600046157806, 0.200000047683686, 0.0 };
                                            }
                                            for (int i = 0; i < array.length; ++i) {
                                                Class3222.field15514.method5269().method17292(new Class4354(Class3222.field15514.field4684.posX, Class3222.field15514.field4684.posY + array[i], Class3222.field15514.field4684.posZ, false));
                                            }
                                            this.field15681 = true;
                                            this.field15680.method23934();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    @Class6757
    private void method10158(final Class5721 class5721) {
        if (this.method9906()) {
            if (class5721.method16990() instanceof Class4353) {
                if (!this.field15680.method23937()) {
                    this.field15680.method23932();
                }
                if (this.field15681) {
                    if (Class3222.field15514.field4684.onGround) {
                        class5721.method16961(true);
                        this.field15681 = false;
                    }
                }
            }
        }
    }
}
