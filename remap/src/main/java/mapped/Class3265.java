// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class3265 extends Class3247
{
    public static int field15758;
    
    public Class3265() {
        super(Class8013.field32990, "Step", "Allows you to step up more than 0.5 block", new Class3167[] { new Class3382(), new Class3327(), new Class3326(), new Class3282() });
    }
    
    @Override
    public void method9897() {
        super.method9897();
        Class3265.field15514.field4684.stepHeight = 0.6f;
    }
    
    @Class6753
    @Class6754
    private void method10297(final Class5745 class5745) {
        if (class5745.method17049() >= 0.1) {
            Class3265.field15758 = 0;
        }
    }
    
    @Class6753
    @Class6754
    private void method10298(final Class5744 class5744) {
        if (class5744.method17046()) {
            ++Class3265.field15758;
        }
    }
    
    public Class2166 method10299(final Class5745 class5745) {
        final double n = Class3265.field15514.field4684.posX + class5745.method17052().x;
        final double n2 = Class3265.field15514.field4684.posZ + class5745.method17052().z;
        final double n3 = 0.41;
        final double n4 = class5745.method17049() - class5745.method17051();
        final Object[] array = Class3265.field15514.field4683.method6981(Class3265.field15514.field4684, new AxisAlignedBB(n - n3, Class3265.field15514.field4684.boundingBox.minY, n2 - n3, n + n3, Class3265.field15514.field4684.boundingBox.minY + n4, n2 + n3)).toArray();
        final int length = array.length;
        Class7096 class5746 = null;
        BlockPos class5747 = null;
        double field25077 = 0.0;
        for (int i = 0; i < length; ++i) {
            final VoxelShape class5748 = (VoxelShape)array[i];
            final BlockPos class5749 = new BlockPos(class5748.method24535(Axis.X), class5748.method24535(Axis.Y), class5748.method24535(Axis.Z));
            final Class7096 method6701 = Class3265.field15514.field4683.getBlockState(class5749);
            if (class5746 == null || class5748.method24537().maxY > field25077) {
                class5746 = method6701;
                class5747 = class5749;
                field25077 = class5748.method24537().maxY;
            }
        }
        if (!Class3265.field15514.field4684.method1706() && !Class3265.field15514.field4684.method1723()) {
            if (class5746 != null) {
                if (Class3265.field15514.field4684.onGround) {
                    if (n4 != class5745.method17049()) {
                        if (n4 < 0.5) {
                            if (!(class5746.method21696() instanceof Class3921)) {
                                if (class5746.method21696() instanceof Class3916) {
                                    return Class2166.field12885;
                                }
                            }
                            else if (class5746.method21725(Class3265.field15514.field4683, class5747).method24537().field25077 == 1.0) {
                                return Class2166.field12886;
                            }
                            return Class2166.field12886;
                        }
                    }
                }
                else {
                    if (class5746.method21696() instanceof Class3921 && class5746.method21725(Class3265.field15514.field4683, class5747).method24537().field25077 == 1.0) {
                        return Class2166.field12884;
                    }
                    if (class5746.method21696() instanceof Class3916) {
                        return Class2166.field12885;
                    }
                    return Class2166.field12884;
                }
            }
            return Class2166.field12886;
        }
        return Class2166.field12884;
    }
}
