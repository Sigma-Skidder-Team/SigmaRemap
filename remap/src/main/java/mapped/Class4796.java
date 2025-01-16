// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.Random;

public class Class4796 extends Class4703<Class424>
{
    private static String[] field20448;
    
    public Class4796(final Class8551 class8551) {
        super(class8551);
        this.field20284 = 0.5f;
    }
    
    public void method14188(final Class424 class424, final float n, final float n2, final MatrixStack class425, final IRenderTypeBuffer class426, final int n3) {
        final BlockState method2071 = class424.method2071();
        if (method2071.method21710() == Class2115.field12307) {
            final World method2072 = class424.method2069();
            if (method2071 != method2072.getBlockState(new BlockPos(class424))) {
                if (method2071.method21710() != Class2115.field12305) {
                    class425.method22567();
                    final BlockPos class427 = new BlockPos(class424.getPosX(), class424.getBoundingBox().maxY, class424.getPosZ());
                    class425.method22564(-0.5, 0.0, -0.5);
                    final Class1658 method2073 = Minecraft.method5277().method5305();
                    method2073.method5793().method33353(method2072, method2073.method5794(method2071), method2071, class427, class425, class426.method25214(Class7969.method25824(method2071)), false, new Random(), method2071.method21758(class424.method2068()), Class1904.field10335);
                    class425.method22568();
                    super.method13951(class424, n, n2, class425, class426, n3);
                }
            }
        }
    }
    
    public ResourceLocation method14189(final Class424 class424) {
        return Class1774.field9853;
    }
}
