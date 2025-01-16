// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import java.util.Map;

public class Class4771 extends Class4712<Class791, Class5840<Class791>>
{
    private static final Map<Class1965, ResourceLocation> field20399;
    
    public Class4771(final Class8551 class8551) {
        super(class8551, new Class5840(9, 0.0f), 0.9f);
        this.method13978(new Class1808(this));
    }
    
    public ResourceLocation method14119(final Class791 class791) {
        return Class4771.field20399.getOrDefault(class791.method4393(), Class4771.field20399.get(Class1965.field10723));
    }
    
    public void method14120(final Class791 class791, final MatrixStack class792, final float n, final float n2, final float n3) {
        super.method13985(class791, class792, n, n2, n3);
        if (class791.field4218 > 0) {
            final int field4218 = class791.field4218;
            final int n4 = field4218 + 1;
            final float n5 = class791.method2625() ? 0.3f : 0.8f;
            if (field4218 >= 8) {
                if (field4218 >= 16) {
                    if (field4218 >= 24.0f) {
                        if (field4218 < 32) {
                            final float method14121 = this.method14121(270.0f + 90.0f * ((field4218 - 24.0f) / 7.0f), 270.0f + 90.0f * (n4 - 24.0f) / 7.0f, n4, n3, 32.0f);
                            class792.method22564(0.0, n5 * ((360.0f - method14121) / 90.0f), 0.0);
                            class792.method22566(Vector3f.XP.rotationDegrees(-method14121));
                        }
                    }
                    else {
                        final float method14122 = this.method14121(180.0f + 90.0f * ((field4218 - 16.0f) / 7.0f), 180.0f + 90.0f * (n4 - 16.0f) / 7.0f, n4, n3, 24.0f);
                        class792.method22564(0.0, n5 + n5 * (270.0f - method14122) / 90.0f, 0.0);
                        class792.method22566(Vector3f.XP.rotationDegrees(-method14122));
                    }
                }
                else {
                    final float method14123 = this.method14121(90.0f + 90.0f * ((field4218 - 8.0f) / 7.0f), 90.0f + 90.0f * (n4 - 8.0f) / 7.0f, n4, n3, 16.0f);
                    class792.method22564(0.0, n5 + 0.2f + (n5 - 0.2f) * (method14123 - 90.0f) / 90.0f, 0.0);
                    class792.method22566(Vector3f.XP.rotationDegrees(-method14123));
                }
            }
            else {
                final float method14124 = this.method14121(90 * field4218 / 7.0f, 90 * n4 / 7.0f, n4, n3, 8.0f);
                class792.method22564(0.0, (n5 + 0.2f) * (method14124 / 90.0f), 0.0);
                class792.method22566(Vector3f.XP.rotationDegrees(-method14124));
            }
        }
        final float method14125 = class791.method4404(n3);
        if (method14125 > 0.0f) {
            class792.method22564(0.0, 0.8f * method14125, 0.0);
            class792.method22566(Vector3f.XP.rotationDegrees(MathHelper.method35700(method14125, class791.rotationPitch, class791.rotationPitch + 90.0f)));
            class792.method22564(0.0, -1.0f * method14125, 0.0);
            if (class791.method4398()) {
                class792.method22566(Vector3f.YP.rotationDegrees((float)(Math.cos(class791.ticksExisted * 1.25) * 3.141592653589793 * 0.05000000074505806)));
                if (class791.method2625()) {
                    class792.method22564(0.0, 0.800000011920929, 0.550000011920929);
                }
            }
        }
        final float method14126 = class791.method4405(n3);
        if (method14126 > 0.0f) {
            class792.method22564(0.0, (class791.method2625() ? 0.5f : 1.3f) * method14126, 0.0);
            class792.method22566(Vector3f.XP.rotationDegrees(MathHelper.method35700(method14126, class791.rotationPitch, class791.rotationPitch + 180.0f)));
        }
    }
    
    private float method14121(final float n, final float n2, final int n3, final float n4, final float n5) {
        return (n3 >= n5) ? n : MathHelper.method35700(n4, n, n2);
    }
    
    static {
        field20399 = Util.method27851(Maps.newEnumMap((Class)Class1965.class), enumMap -> {
            enumMap.put(Class1965.field10723, new ResourceLocation("textures/entity/panda/panda.png"));
            enumMap.put(Class1965.field10724, new ResourceLocation("textures/entity/panda/lazy_panda.png"));
            enumMap.put(Class1965.field10725, new ResourceLocation("textures/entity/panda/worried_panda.png"));
            enumMap.put(Class1965.field10726, new ResourceLocation("textures/entity/panda/playful_panda.png"));
            enumMap.put(Class1965.field10727, new ResourceLocation("textures/entity/panda/brown_panda.png"));
            enumMap.put(Class1965.field10728, new ResourceLocation("textures/entity/panda/weak_panda.png"));
            enumMap.put(Class1965.field10729, new ResourceLocation("textures/entity/panda/aggressive_panda.png"));
        });
    }
}
