// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Map;

public class Class6117 implements Class6113
{
    private static String[] field24830;
    private final Map<BlockPos, BlockPos> field24831;
    private final Map<BlockPos, Float> field24832;
    private final List<BlockPos> field24833;
    
    public Class6117() {
        this.field24831 = Maps.newHashMap();
        this.field24832 = Maps.newHashMap();
        this.field24833 = Lists.newArrayList();
    }
    
    public void method18312(final BlockPos class354, final List<BlockPos> list, final List<Float> list2) {
        for (int i = 0; i < list.size(); ++i) {
            this.field24831.put((BlockPos)list.get(i), class354);
            this.field24832.put((BlockPos)list.get(i), list2.get(i));
        }
        this.field24833.add(class354);
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        final BlockPos class7353 = new BlockPos(n, 0.0, n3);
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        method22695.begin(5, DefaultVertexFormats.POSITION_COLOR);
        for (final Map.Entry<BlockPos, V> entry : this.field24831.entrySet()) {
            final BlockPos class7354 = entry.getKey();
            final BlockPos class7355 = (BlockPos)entry.getValue();
            final float n4 = class7355.getX() * 128 % 256 / 256.0f;
            final float n5 = class7355.getY() * 128 % 256 / 256.0f;
            final float n6 = class7355.getZ() * 128 % 256 / 256.0f;
            final float floatValue = this.field24832.get(class7354);
            if (!class7353.withinDistance(class7354, 160.0)) {
                continue;
            }
            Class1656.method5734(method22695, class7354.getX() + 0.5f - n - floatValue, class7354.getY() + 0.5f - n2 - floatValue, class7354.getZ() + 0.5f - n3 - floatValue, class7354.getX() + 0.5f - n + floatValue, class7354.getY() + 0.5f - n2 + floatValue, class7354.getZ() + 0.5f - n3 + floatValue, n4, n5, n6, 0.5f);
        }
        for (final BlockPos class7356 : this.field24833) {
            if (!class7353.withinDistance(class7356, 160.0)) {
                continue;
            }
            Class1656.method5734(method22695, class7356.getX() - n, class7356.getY() - n2, class7356.getZ() - n3, class7356.getX() + 1.0f - n, class7356.getY() + 1.0f - n2, class7356.getZ() + 1.0f - n3, 1.0f, 1.0f, 1.0f, 1.0f);
        }
        method22694.draw();
        RenderSystem.enableDepthTest();
        RenderSystem.enableTexture();
        RenderSystem.popMatrix();
    }
}
