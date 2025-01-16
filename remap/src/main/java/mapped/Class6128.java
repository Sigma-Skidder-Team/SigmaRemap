// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Iterator;

public class Class6128 implements Class6113
{
    private static String[] field24872;
    private final Minecraft field24873;
    
    public Class6128(final Minecraft field24873) {
        this.field24873 = field24873;
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        final World field2391 = this.field24873.player.world;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.method30072(2.0f);
        RenderSystem.disableTexture();
        RenderSystem.method30010(false);
        final BlockPos class7353 = new BlockPos(n, n2, n3);
        for (final BlockPos class7354 : BlockPos.getAllInBoxMutable(class7353.add(-6, -6, -6), class7353.add(6, 6, 6))) {
            final BlockState method6701 = field2391.getBlockState(class7354);
            if (method6701.getBlock() == Class7521.field29147) {
                continue;
            }
            final Iterator<AxisAlignedBB> iterator2 = method6701.getShape(field2391, class7354).toBoundingBoxList().iterator();
            while (iterator2.hasNext()) {
                final AxisAlignedBB method6702 = iterator2.next().offset(class7354).intersect(0.002).offset(-n, -n2, -n3);
                final double field2392 = method6702.minX;
                final double field2393 = method6702.minY;
                final double field2394 = method6702.minZ;
                final double field2395 = method6702.maxX;
                final double field2396 = method6702.maxY;
                final double field2397 = method6702.maxZ;
                if (method6701.isSolidSide(field2391, class7354, Direction.WEST)) {
                    final Tessellator method6703 = Tessellator.getInstance();
                    final BufferBuilder method6704 = method6703.getBuffer();
                    method6704.begin(5, DefaultVertexFormats.POSITION_COLOR);
                    method6704.pos(field2392, field2393, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6704.pos(field2392, field2393, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6704.pos(field2392, field2396, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6704.pos(field2392, field2396, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6703.draw();
                }
                if (method6701.isSolidSide(field2391, class7354, Direction.SOUTH)) {
                    final Tessellator method6705 = Tessellator.getInstance();
                    final BufferBuilder method6706 = method6705.getBuffer();
                    method6706.begin(5, DefaultVertexFormats.POSITION_COLOR);
                    method6706.pos(field2392, field2396, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6706.pos(field2392, field2393, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6706.pos(field2395, field2396, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6706.pos(field2395, field2393, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6705.draw();
                }
                if (method6701.isSolidSide(field2391, class7354, Direction.EAST)) {
                    final Tessellator method6707 = Tessellator.getInstance();
                    final BufferBuilder method6708 = method6707.getBuffer();
                    method6708.begin(5, DefaultVertexFormats.POSITION_COLOR);
                    method6708.pos(field2395, field2393, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6708.pos(field2395, field2393, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6708.pos(field2395, field2396, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6708.pos(field2395, field2396, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6707.draw();
                }
                if (method6701.isSolidSide(field2391, class7354, Direction.NORTH)) {
                    final Tessellator method6709 = Tessellator.getInstance();
                    final BufferBuilder method6710 = method6709.getBuffer();
                    method6710.begin(5, DefaultVertexFormats.POSITION_COLOR);
                    method6710.pos(field2395, field2396, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6710.pos(field2395, field2393, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6710.pos(field2392, field2396, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6710.pos(field2392, field2393, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6709.draw();
                }
                if (method6701.isSolidSide(field2391, class7354, Direction.DOWN)) {
                    final Tessellator method6711 = Tessellator.getInstance();
                    final BufferBuilder method6712 = method6711.getBuffer();
                    method6712.begin(5, DefaultVertexFormats.POSITION_COLOR);
                    method6712.pos(field2392, field2393, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6712.pos(field2395, field2393, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6712.pos(field2392, field2393, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6712.pos(field2395, field2393, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                    method6711.draw();
                }
                if (!method6701.isSolidSide(field2391, class7354, Direction.UP)) {
                    continue;
                }
                final Tessellator method6713 = Tessellator.getInstance();
                final BufferBuilder method6714 = method6713.getBuffer();
                method6714.begin(5, DefaultVertexFormats.POSITION_COLOR);
                method6714.pos(field2392, field2396, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                method6714.pos(field2392, field2396, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                method6714.pos(field2395, field2396, field2394).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                method6714.pos(field2395, field2396, field2397).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                method6713.draw();
            }
        }
        RenderSystem.method30010(true);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
}
