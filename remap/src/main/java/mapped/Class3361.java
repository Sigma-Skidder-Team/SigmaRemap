// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3i;

import java.util.Iterator;
import java.util.Collections;

public class Class3361 extends Class3355
{
    private int field16005;
    private int field16006;
    private static int field16007;
    private BlockPos field16008;
    
    public Class3361() {
        super("AutoMLG", "Automatically places water when falling", Class8013.field32992);
        this.method9881(new Class4999("Cubecraft", "Cubecraft bypass", true));
        Class3361.field16007 = -1;
    }
    
    public static boolean method10645() {
        return Class3361.field16007 >= 0;
    }
    
    @Override
    public void method9879() {
        Class3361.field16007 = -1;
    }
    
    @Override
    public void method9897() {
        Class3361.field16007 = -1;
    }
    
    @Class6753
    private void method10646(final Class5717 class5717) {
        if (this.method9906()) {
            if (Class3361.field16007 > 0) {
                if (!Class3361.field15514.field4684.onGround) {
                    Class7482.method23149(class5717, 0.0);
                }
            }
        }
    }
    
    @Class6753
    @Class6759
    private void method10647(final Class5744 class5744) {
        if (this.method9906() && Class3361.field15514.field4682.method27330()) {
            if (class5744.method17046()) {
                if (Class3361.field16007 >= 0) {
                    ++Class3361.field16007;
                    final float[] method30919 = Class8845.method30919(this.field16008.getX() + 0.5, this.field16008.getZ() + 0.5, this.field16008.getY() + 0.5);
                    class5744.method17043(method30919[0]);
                    class5744.method17041(method30919[1]);
                }
            }
            if (Class3361.field16007 == (this.method9883("Cubecraft") ? 5 : 3)) {
                if (Class3361.field15514.field4684.field3006.field2743 != this.field16005) {
                    this.field16006 = Class3361.field15514.field4684.field3006.field2743;
                    Class3361.field15514.field4684.field3006.field2743 = this.field16005;
                    Class3361.field15514.field4682.method27318();
                }
                Class3361.field15514.method5269().method17292(new Class4380(Class316.field1877));
                Class3361.field15514.method5269().method17292(new Class4307(Class316.field1877));
                Class3361.field16007 = -1;
                this.field16008 = null;
                Class3361.field15514.field4684.field3006.field2743 = this.field16006;
            }
            final int method30920 = this.method10648();
            if (!Class3229.method10177()) {
                if (method30920 != -1) {
                    if (!Class3361.field15514.field4684.onGround) {
                        if (Class3361.field15514.field4684.fallDistance > 3.0f) {
                            final BlockPos method30921 = this.method10649();
                            if (method30921 != null) {
                                if (class5744.method17046() && Class3361.field16007 == -1) {
                                    final float[] method30922 = Class8845.method30919(method30921.getX() + 0.5, method30921.getZ() + 0.5, method30921.getY() + 0.5);
                                    class5744.method17043(method30922[0]);
                                    class5744.method17041(method30922[1]);
                                    if (method30920 != Class3361.field15514.field4684.field3006.field2743) {
                                        this.field16006 = Class3361.field15514.field4684.field3006.field2743;
                                        Class3361.field15514.field4684.field3006.field2743 = method30920;
                                        Class3361.field15514.field4682.method27318();
                                    }
                                    this.field16005 = method30920;
                                    this.field16008 = method30921;
                                    Class3361.field16007 = 0;
                                    return;
                                }
                                if (this.field16008 != null) {
                                    Class3361.field15514.method5269().method17292(new Class4380(Class316.field1877));
                                    Class3361.field15514.method5269().method17292(new Class4307(Class316.field1877));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int method10648() {
        for (int i = 36; i < 45; ++i) {
            if (Class3361.field15514.field4684.field3008.method10878(i).method20054() && Class3361.field15514.field4684.field3008.method10878(i).method20053().getItem() == Items.field31350) {
                return i - 36;
            }
        }
        for (int j = 9; j < 36; ++j) {
            if (Class3361.field15514.field4684.field3008.method10878(j).method20054() && Class3361.field15514.field4684.field3008.method10878(j).method20053().getItem() == Items.field31350) {
                Class3361.field15514.method5269().method17292(new Class4323(Class2218.field13623));
                Class8639.method29370(j, 6);
                Class3361.field15514.method5269().method17292(new Class4389(-1));
                return 6;
            }
        }
        return -1;
    }
    
    private BlockPos method10649() {
        final double field22770 = Class3361.field15514.field4684.getMotion().x;
        final double field22771 = Class3361.field15514.field4684.getMotion().y;
        final double field22772 = Class3361.field15514.field4684.getMotion().z;
        final Iterator<Object> iterator = Class3361.field15514.world.method6980(Class3361.field15514.field4684, Class3361.field15514.field4684.boundingBox.expand(field22770, 0.0, field22772).offset(0.0, field22771, 0.0), Collections.EMPTY_SET).iterator();
        Vec3i class352 = null;
        while (iterator.hasNext()) {
            final BlockPos class353 = new BlockPos(iterator.next().method24537().method18517());
            if (!Class4609.method13708(class353)) {
                continue;
            }
            if (class353.getY() + 1 >= Class3361.field15514.field4684.posY) {
                continue;
            }
            if (class352 != null && Class3361.field15514.field4684.method1733(class352.getX() + 0.5 - field22770, class352.getY() + 1, class352.getZ() + 0.5 - field22772) <= Class3361.field15514.field4684.method1733(class353.getX() + 0.5 - field22770, class353.getY() + 1, class353.getZ() + 0.5 - field22772)) {
                continue;
            }
            class352 = class353;
        }
        if (class352 == null) {
            final Iterator<Object> iterator2 = Class3361.field15514.world.method6980(Class3361.field15514.field4684, Class3361.field15514.field4684.boundingBox.expand(field22770, 0.0, field22772).offset(0.0, Class3361.field15514.field4684.getMotion().y - 1.0, 0.0), Collections.EMPTY_SET).iterator();
            while (iterator2.hasNext()) {
                final BlockPos class354 = new BlockPos(iterator2.next().method24537().method18517());
                if (!Class4609.method13708(class354)) {
                    continue;
                }
                if (class354.getY() + 1 >= Class3361.field15514.field4684.posY) {
                    continue;
                }
                if (class352 != null && Class3361.field15514.field4684.method1733(class352.getX() + 0.5 - field22770, class352.getY() + 1, class352.getZ() + 0.5 - field22772) <= Class3361.field15514.field4684.method1733(class354.getX() + 0.5 - field22770, class354.getY() + 1, class354.getZ() + 0.5 - field22772)) {
                    continue;
                }
                class352 = class354;
            }
            return (BlockPos)class352;
        }
        return (BlockPos)class352;
    }
}
