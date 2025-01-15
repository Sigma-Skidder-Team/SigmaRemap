// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3387 extends Class3167
{
    public Class3387() {
        super(Class8013.field32985, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
    }
    
    @Class6753
    private void method10803(final Class5723 class5723) {
        if (!this.method9906()) {
            return;
        }
        if (Class3387.field15514.field4684 == null) {
            return;
        }
        if (Class3387.field15514.field4684.ticksExisted >= 10) {
            if (Class3387.field15514.field4684 != null) {
                if (class5723.method16998() instanceof Class4328) {
                    final Class4328 class5724 = (Class4328)class5723.method16998();
                    Class3387.field15514.field4684.prevRotationYaw = class5724.field19380;
                    Class3387.field15514.field4684.prevRotationPitch = class5724.field19381;
                    class5724.field19380 = Class3387.field15514.field4684.rotationYaw;
                    class5724.field19381 = Class3387.field15514.field4684.rotationPitch;
                }
            }
        }
    }
}
