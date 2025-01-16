// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3322 extends Class3167
{
    public Class3322() {
        super(Class8013.field32990, "Spartan", "Spider for Spartan");
    }
    
    @Class6753
    private void method10523(final Class5744 class5744) {
        if (!this.method9906() || !class5744.method17046()) {
            return;
        }
        final int method10264 = ((Class3249)this.method9914()).method10264();
        if (method10264 != 0 && Class3322.field15514.field4684.collidedHorizontally) {
            final double field2395 = Class3322.field15514.field4684.posX;
            final double field2396 = Class3322.field15514.field4684.posY;
            final double field2397 = Class3322.field15514.field4684.posZ;
            double n = 1.19209289E-8;
            if (Class3322.field15514.field4684.getMotion().y <= -0.22768848754498797 || Class3322.field15514.field4684.onGround) {
                if (!Class3322.field15514.field4684.onGround) {
                    Class3322.field15514.field4684.setPosition(field2395, field2396 - (field2396 - (int)field2396), field2397);
                    class5744.method17037(field2396 - (field2396 - (int)field2396));
                    n = -1.0E-13;
                }
                Class3322.field15514.field4684.method2725();
                class5744.method17045(true);
            }
            switch (method10264) {
                case 1: {
                    if (field2395 < 0.0) {
                        class5744.method17035((int)field2395 - 0.3 - n);
                        break;
                    }
                    class5744.method17035((int)(field2395 + 1.0) - 0.3 - n);
                    break;
                }
                case 2: {
                    if (field2395 < 0.0) {
                        class5744.method17035((int)(field2395 - 1.0) + 0.3 + n);
                        break;
                    }
                    class5744.method17035((int)field2395 + 0.3 + n);
                    break;
                }
                case 3: {
                    if (field2397 < 0.0) {
                        class5744.method17039((int)field2397 - 0.3 - n);
                        break;
                    }
                    class5744.method17039((int)(field2397 + 1.0) - 0.3 - n);
                    break;
                }
                case 4: {
                    if (field2397 < 0.0) {
                        class5744.method17039((int)(field2397 - 1.0) + 0.3 + n);
                        break;
                    }
                    class5744.method17039((int)field2397 + 0.3 + n);
                    break;
                }
            }
        }
    }
    
    @Class6753
    private void method10524(final Class5753 class5753) {
        if (this.method9906() && Class3322.field15514.field4684 != null) {
            if (class5753.method17065() != null) {
                if (!class5753.method17065().isEmpty()) {
                    if (class5753.method17065().getBoundingBox().minY > Class3322.field15514.field4684.boundingBox.minY + 1.0) {
                        class5753.method16961(true);
                    }
                }
            }
        }
    }
}
