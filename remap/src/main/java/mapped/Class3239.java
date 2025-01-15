// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class3239 extends Class3167
{
    private int field15727;
    private boolean field15728;
    
    public Class3239() {
        super(Class8013.field32990, "TargetStrafe", "Allows you to strafe arround targets with speed");
        this.field15727 = 1;
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Basic", "Ninja", "Random" }));
        this.method9881(new Class4996("Radius", "Radius of the circle", 2.0f, Float.class, 1.0f, 6.0f, 0.01f));
        this.method9881(new Class4999("Only speed", "Use target strafe only when speed is enabled", true));
        this.method9881(new Class4999("Avoid void", "Avoid you from falling into void", true));
    }
    
    @Class6753
    public void method10227(final Class5739 class5739) {
        if (this.method9906()) {
            Entity class5740 = null;
            if ((Class9463.method35173().method35189().method21551(Class3256.class).method9906() && !Class3347.field15955) || !this.method9883("Only speed")) {
                if (Class3376.field16061 == null) {
                    if (Class3376.field16060 != null) {
                        class5740 = Class3376.field16060;
                    }
                }
                else {
                    class5740 = Class3376.field16061.method26798();
                }
            }
            if (class5740 == null) {}
        }
    }
    
    @Class6753
    @Class6759
    public void method10228(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        Entity class5718 = null;
        if ((Class9463.method35173().method35189().method21551(Class3256.class).method9906() || !this.method9883("Only speed")) && !Class3347.field15955) {
            if (Class3376.field16061 != null) {
                class5718 = Class3376.field16061.method26798();
            }
            else if (Class3376.field16060 != null) {
                class5718 = Class3376.field16060;
            }
        }
        if (class5718 != null) {
            final double sqrt = Math.sqrt(class5717.method16972() * class5717.method16972() + class5717.method16976() * class5717.method16976());
            final float method9886 = this.method9886("Radius");
            final String method9887 = this.method9887("Mode");
            switch (method9887) {
                case "Basic": {
                    this.method10229(class5718, sqrt, method9886, class5717);
                    break;
                }
                case "Ninja": {
                    final float n2 = (float)Math.toRadians(class5718.method1844() - 180.0f);
                    final double n3 = class5718.field2395 - MathHelper.sin(n2) * method9886;
                    final double n4 = class5718.field2397 + MathHelper.cos(n2) * method9886;
                    class5717.method16973(n3 - Class3239.field15514.field4684.field2395);
                    class5717.method16977(n4 - Class3239.field15514.field4684.field2397);
                    break;
                }
                case "Random": {
                    final float n5 = (float)(Math.random() * 2.0 * 3.141592653589793);
                    final double n6 = class5718.field2395 - MathHelper.sin(n5) * method9886;
                    final double n7 = class5718.field2397 + MathHelper.cos(n5) * method9886;
                    class5717.method16973(n6 - Class3239.field15514.field4684.field2395);
                    class5717.method16977(n7 - Class3239.field15514.field4684.field2397);
                    break;
                }
            }
        }
    }
    
    public void method10229(final Entity class399, final double n, final double n2, final Class5717 class400) {
        final float field32884 = Class8845.method30922(class399).field32884;
        if (Class3239.field15514.field4684.field2405) {
            this.field15727 *= -1;
        }
        final float n3 = (float)(n / (n2 * 3.141592653589793 * 2.0)) * 360.0f * this.field15727;
        final float[] method30920;
        final float[] array = method30920 = Class8845.method30920(class399.method1934(), Class3239.field15514.field4684.method1934());
        final int n4 = 0;
        method30920[n4] += n3;
        final float n5 = array[0] * 0.017453292f;
        final float n6 = Class8845.method30920(Class3239.field15514.field4684.method1934(), new Vec3d(class399.field2395 - MathHelper.sin(n5) * n2, class399.field2396, class399.field2397 + MathHelper.cos(n5) * n2))[0] * 0.017453292f;
        class400.method16973(-MathHelper.sin(n6) * n);
        class400.method16977(MathHelper.cos(n6) * n);
        final Vec3d class401 = new Vec3d(Class3239.field15514.field4684.field2395 + class400.method16972(), Class3239.field15514.field4684.field2396 + class400.method16974(), Class3239.field15514.field4684.field2397 + class400.method16976());
        if (this.method9883("Avoid void")) {
            if (!this.field15728 && this.method10230(class401)) {
                this.field15727 *= -1;
                this.field15728 = true;
            }
            else if (this.field15728) {
                if (!this.method10230(class401)) {
                    this.field15728 = false;
                }
            }
        }
    }
    
    private boolean method10230(final Vec3d class5487) {
        return Class3239.field15514.field4684.method1895().y < 1.0 || Class3239.field15514.field4683.method6981(Class3239.field15514.field4684, new AxisAlignedBB(class5487.add(-0.15, 0.0, -0.15), class5487.add(0.15, Class3239.field15514.field4684.method1931(), 0.15)).method18494(0.0, -Class3239.field15514.field4684.method1934().y, 0.0)).count() == 0L;
    }
}
