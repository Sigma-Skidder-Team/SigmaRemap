// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class Class686 extends Class565 implements Class687
{
    private final Class869 field3781;
    private final List<Class8395> field3782;
    private boolean field3783;
    
    public Class686(final Class869 field3781) {
        this.field3782 = Lists.newArrayList();
        this.field3781 = field3781;
    }
    
    public void method3817() {
        if (!this.field3783 && this.field3781.field4648.field23427) {
            this.field3781.method5299().method6433(this);
            this.field3783 = true;
        }
        else if (this.field3783) {
            if (!this.field3781.field4648.field23427) {
                this.field3781.method5299().method6434(this);
                this.field3783 = false;
            }
        }
        if (this.field3783) {
            if (!this.field3782.isEmpty()) {
                Class8726.method30059();
                Class8726.method30011();
                Class8726.method30117();
                final Vec3d class5487 = new Vec3d(this.field3781.field4684.getPosX(), this.field3781.field4684.method1944(), this.field3781.field4684.getPosZ());
                final Vec3d method16755 = new Vec3d(0.0, 0.0, -1.0).rotatePitch(-this.field3781.field4684.field2400 * 0.017453292f).rotateYaw(-this.field3781.field4684.field2399 * 0.017453292f);
                final Vec3d method16756 = method16755.crossProduct(new Vec3d(0.0, 1.0, 0.0).rotatePitch(-this.field3781.field4684.field2400 * 0.017453292f).rotateYaw(-this.field3781.field4684.field2399 * 0.017453292f));
                int n = 0;
                int max = 0;
                final Iterator<Class8395> iterator = this.field3782.iterator();
                while (iterator.hasNext()) {
                    final Class8395 class5488 = iterator.next();
                    if (class5488.method27993() + 3000L > Class8349.method27837()) {
                        max = Math.max(max, this.field3781.field4643.method6617(class5488.method27992()));
                    }
                    else {
                        iterator.remove();
                    }
                }
                final int n2 = max + this.field3781.field4643.method6617("<") + this.field3781.field4643.method6617(" ") + this.field3781.field4643.method6617(">") + this.field3781.field4643.method6617(" ");
                for (final Class8395 class5489 : this.field3782) {
                    final String method16757 = class5489.method27992();
                    final Vec3d method16758 = class5489.method27994().subtract(class5487).normalize();
                    final double n3 = -method16756.dotProduct(method16758);
                    final boolean b = -method16755.dotProduct(method16758) > 0.5;
                    final int n4 = n2 / 2;
                    final int n5 = 9;
                    final int n6 = n5 / 2;
                    final int method16759 = this.field3781.field4643.method6617(method16757);
                    final int method16760 = MathHelper.floor(MathHelper.method35655(255.0, 75.0, (Class8349.method27837() - class5489.method27993()) / 3000.0f));
                    final int n7 = method16760 << 16 | method16760 << 8 | method16760;
                    Class8726.method30059();
                    Class8726.method30065(this.field3781.method5332().method7696() - n4 * 1.0f - 2.0f, this.field3781.method5332().method7697() - 30 - n * (n5 + 1) * 1.0f, 0.0f);
                    Class8726.method30063(1.0f, 1.0f, 1.0f);
                    Class565.method3293(-n4 - 1, -n6 - 1, n4 + 1, n6 + 1, this.field3781.field4648.method17115(0.8f));
                    Class8726.method30011();
                    if (!b) {
                        if (n3 <= 0.0) {
                            if (n3 < 0.0) {
                                this.field3781.field4643.method6610("<", (float)(-n4), (float)(-n6), n7 - 16777216);
                            }
                        }
                        else {
                            this.field3781.field4643.method6610(">", (float)(n4 - this.field3781.field4643.method6617(">")), (float)(-n6), n7 - 16777216);
                        }
                    }
                    this.field3781.field4643.method6610(method16757, (float)(-method16759 / 2), (float)(-n6), n7 - 16777216);
                    Class8726.method30060();
                    ++n;
                }
                Class8726.method30012();
                Class8726.method30060();
            }
        }
    }
    
    @Override
    public void method3818(final Class6834 class6834, final Class7833 class6835) {
        if (class6835.method25313() != null) {
            final String method8461 = class6835.method25313().method8461();
            if (!this.field3782.isEmpty()) {
                for (final Class8395 class6836 : this.field3782) {
                    if (!class6836.method27992().equals(method8461)) {
                        continue;
                    }
                    class6836.method27995(new Vec3d(class6834.method20929(), class6834.method20930(), class6834.method20931()));
                    return;
                }
            }
            this.field3782.add(new Class8395(this, method8461, new Vec3d(class6834.method20929(), class6834.method20930(), class6834.method20931())));
        }
    }
}
