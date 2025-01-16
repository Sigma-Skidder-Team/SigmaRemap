// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3272 extends Class3167
{
    public float field15763;
    public int field15764;
    
    public Class3272() {
        super(Class8013.field32990, "EntitySpeed", "Speed up your rideable entities");
        this.field15763 = 3.0f;
        this.field15764 = 0;
    }
    
    @Override
    public void method9879() {
    }
    
    @Class6753
    public void method10312(final Class5718 class5718) {
        if (!this.method9906()) {
            return;
        }
        if (Class3272.field15514.field4648.field23439.method1056()) {
            if (!Class3272.field15514.field4684.method1920().onGround) {}
        }
        final Class6093 field4085 = Class3272.field15514.field4684.field4085;
        final float field4086 = field4085.field24722;
        final float field4087 = field4085.field24721;
        if (!Class3272.field15514.field4684.method1920().collidedHorizontally) {
            if (!Class3272.field15514.field4684.method1920().onGround) {
                if (Class6430.method19160(Class3272.field15514.field4684.method1920(), 5.0f)) {
                    if (!Class3272.field15514.field4684.method1920().method1706()) {
                        if (Class3272.field15514.field4683.getBlockState(Class3272.field15514.field4684.method1920().method1894()).method21696() != Class7521.field29173) {
                            class5718.method16983(-2.0);
                        }
                    }
                }
            }
        }
        if (Class3272.field15514.field4684.method1920().method1706()) {
            if (Class3272.field15514.field4684.method1920().collidedHorizontally) {
                class5718.method16983(-1.0);
            }
            else {
                class5718.method16983((Math.floor(Class3272.field15514.field4684.method1920().posY) + 0.7725465413369861 - Class3272.field15514.field4684.method1920().posY) / 2.0);
            }
        }
        if (field4086 == 0.0f && field4087 == 0.0f) {
            class5718.method16981(0.0);
            class5718.method16985(0.0);
            return;
        }
        final float method23147 = Class7482.method23147();
        final double cos = Math.cos(Math.toRadians(method23147));
        final double sin = Math.sin(Math.toRadians(method23147));
        this.field15763 = 2.75f;
        final float field4088 = this.field15763;
        if (Class3272.field15514.field4684.method1920() instanceof Class808) {
            if (((Class808)Class3272.field15514.field4684.method1920()).onGround) {
                if (Class3272.field15514.field4648.field23439.method1056()) {
                    Class3272.field15514.field4684.field4094 = 1.0f;
                }
            }
        }
        class5718.method16981(cos * field4088);
        class5718.method16985(sin * field4088);
        if (this.field15764 < 2 || !Class3272.field15514.field4684.method1920().onGround) {
            Class3272.field15514.field4684.method1920().stepHeight = 0.0f;
        }
    }
    
    @Class6753
    public void method10313(final Class5723 class5723) {
        if (this.method9906()) {
            if (!(class5723.method16998() instanceof Class4263)) {}
        }
    }
    
    @Class6753
    public void method10314(final Class5721 class5721) {
        if (class5721.method16990() instanceof Class4251) {
            if (Class3272.field15514.field4684.method1920() != null) {
                if (this.field15764++ > 2) {
                    if (Class3272.field15514.field4684.method1920().onGround) {
                        Class3272.field15514.field4684.method1920().stepHeight = 1.0f;
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10315(final Class5731 class5731) {
        Class3272.field15514.field4684.method1920().stepHeight = 0.0f;
        this.field15764 = 0;
    }
}
