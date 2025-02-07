// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class6120 implements Class6113
{
    private static String[] field24839;
    private final List<BlockPos> field24840;
    private final List<Float> field24841;
    private final List<Float> field24842;
    private final List<Float> field24843;
    private final List<Float> field24844;
    private final List<Float> field24845;
    
    public Class6120() {
        this.field24840 = Lists.newArrayList();
        this.field24841 = Lists.newArrayList();
        this.field24842 = Lists.newArrayList();
        this.field24843 = Lists.newArrayList();
        this.field24844 = Lists.newArrayList();
        this.field24845 = Lists.newArrayList();
    }
    
    public void method18315(final BlockPos class354, final float f, final float f2, final float f3, final float f4, final float f5) {
        this.field24840.add(class354);
        this.field24841.add(f);
        this.field24842.add(f5);
        this.field24843.add(f2);
        this.field24844.add(f3);
        this.field24845.add(f4);
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        method22695.begin(5, DefaultVertexFormats.POSITION_COLOR);
        for (int i = 0; i < this.field24840.size(); ++i) {
            final BlockPos class7353 = this.field24840.get(i);
            final float n4 = this.field24841.get(i) / 2.0f;
            Class1656.method5734(method22695, class7353.getX() + 0.5f - n4 - n, class7353.getY() + 0.5f - n4 - n2, class7353.getZ() + 0.5f - n4 - n3, class7353.getX() + 0.5f + n4 - n, class7353.getY() + 0.5f + n4 - n2, class7353.getZ() + 0.5f + n4 - n3, this.field24843.get(i), this.field24844.get(i), this.field24845.get(i), this.field24842.get(i));
        }
        method22694.draw();
        RenderSystem.enableTexture();
        RenderSystem.popMatrix();
    }
}
