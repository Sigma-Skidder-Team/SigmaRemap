// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class Class3276 extends Class3167
{
    public static Class755 field15771;
    private List<IPacket<?>> field15772;
    private Vec3d field15773;
    public float field15774;
    public float field15775;
    
    public Class3276() {
        super(Class8013.field32985, "Blink", "Stops your packets to blink");
        this.field15772 = new ArrayList<IPacket<?>>();
    }
    
    @Override
    public void method9879() {
        this.field15773 = new Vec3d(Class3276.field15514.field4684.posX, Class3276.field15514.field4684.posY, Class3276.field15514.field4684.posZ);
        this.field15774 = Class3276.field15514.field4684.rotationYaw;
        this.field15775 = Class3276.field15514.field4684.rotationPitch;
        Class3276.field15771 = new Class755(Class3276.field15514.world, Class3276.field15514.field4684.method2844());
        Class3276.field15771.field3006 = Class3276.field15514.field4684.field3006;
        Class3276.field15771.method1728(this.field15773.x, this.field15773.y, this.field15773.z, this.field15774, this.field15775);
        Class3276.field15771.field2953 = Class3276.field15514.field4684.field2953;
        Class3276.field15514.world.method6819(-1, Class3276.field15771);
    }
    
    @Override
    public void method9897() {
        for (int size = this.field15772.size(), i = 0; i < size; ++i) {
            Class3276.field15514.method5269().method17292(this.field15772.get(i));
        }
        this.field15772.clear();
        Class3276.field15514.world.method6821(-1);
    }
    
    @Class6753
    private void method10323(final Class5721 class5721) {
        if (this.method9906()) {
            if (Class3276.field15514.field4684 == null || !(class5721.method16990() instanceof Class4336)) {
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
            this.field15772.add(class5721.method16990());
            class5721.method16961(true);
        }
    }
}
