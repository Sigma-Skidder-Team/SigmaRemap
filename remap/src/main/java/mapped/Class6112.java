// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class6112 implements Class6113
{
    private static String[] field24819;
    private final Minecraft field24820;
    
    public Class6112(final Minecraft field24820) {
        this.field24820 = field24820;
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        RenderSystem.enableDepthTest();
        RenderSystem.shadeModel(7425);
        RenderSystem.enableAlphaTest();
        RenderSystem.method30118();
        final Entity method18166 = this.field24820.field4644.method5833().method18166();
        final Tessellator method18167 = Tessellator.getInstance();
        final BufferBuilder method18168 = method18167.getBuffer();
        final double n4 = 0.0 - n2;
        final double n5 = 256.0 - n2;
        RenderSystem.disableTexture();
        RenderSystem.disableBlend();
        final double n6 = (method18166.chunkCoordX << 4) - n;
        final double n7 = (method18166.chunkCoordZ << 4) - n3;
        RenderSystem.method30072(1.0f);
        method18168.begin(3, DefaultVertexFormats.POSITION_COLOR);
        for (int i = -16; i <= 32; i += 16) {
            for (int j = -16; j <= 32; j += 16) {
                method18168.pos(n6 + i, n4, n7 + j).color(1.0f, 0.0f, 0.0f, 0.0f).endVertex();
                method18168.pos(n6 + i, n4, n7 + j).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                method18168.pos(n6 + i, n5, n7 + j).color(1.0f, 0.0f, 0.0f, 0.5f).endVertex();
                method18168.pos(n6 + i, n5, n7 + j).color(1.0f, 0.0f, 0.0f, 0.0f).endVertex();
            }
        }
        for (int k = 2; k < 16; k += 2) {
            method18168.pos(n6 + k, n4, n7).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
            method18168.pos(n6 + k, n4, n7).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6 + k, n5, n7).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6 + k, n5, n7).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
            method18168.pos(n6 + k, n4, n7 + 16.0).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
            method18168.pos(n6 + k, n4, n7 + 16.0).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6 + k, n5, n7 + 16.0).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6 + k, n5, n7 + 16.0).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
        }
        for (int l = 2; l < 16; l += 2) {
            method18168.pos(n6, n4, n7 + l).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
            method18168.pos(n6, n4, n7 + l).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6, n5, n7 + l).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6, n5, n7 + l).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
            method18168.pos(n6 + 16.0, n4, n7 + l).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
            method18168.pos(n6 + 16.0, n4, n7 + l).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6 + 16.0, n5, n7 + l).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6 + 16.0, n5, n7 + l).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
        }
        for (int n8 = 0; n8 <= 256; n8 += 2) {
            final double n9 = n8 - n2;
            method18168.pos(n6, n9, n7).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
            method18168.pos(n6, n9, n7).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6, n9, n7 + 16.0).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6 + 16.0, n9, n7 + 16.0).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6 + 16.0, n9, n7).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6, n9, n7).color(1.0f, 1.0f, 0.0f, 1.0f).endVertex();
            method18168.pos(n6, n9, n7).color(1.0f, 1.0f, 0.0f, 0.0f).endVertex();
        }
        method18167.draw();
        RenderSystem.method30072(2.0f);
        method18168.begin(3, DefaultVertexFormats.POSITION_COLOR);
        for (int n10 = 0; n10 <= 16; n10 += 16) {
            for (int n11 = 0; n11 <= 16; n11 += 16) {
                method18168.pos(n6 + n10, n4, n7 + n11).color(0.25f, 0.25f, 1.0f, 0.0f).endVertex();
                method18168.pos(n6 + n10, n4, n7 + n11).color(0.25f, 0.25f, 1.0f, 1.0f).endVertex();
                method18168.pos(n6 + n10, n5, n7 + n11).color(0.25f, 0.25f, 1.0f, 1.0f).endVertex();
                method18168.pos(n6 + n10, n5, n7 + n11).color(0.25f, 0.25f, 1.0f, 0.0f).endVertex();
            }
        }
        for (int n12 = 0; n12 <= 256; n12 += 16) {
            final double n13 = n12 - n2;
            method18168.pos(n6, n13, n7).color(0.25f, 0.25f, 1.0f, 0.0f).endVertex();
            method18168.pos(n6, n13, n7).color(0.25f, 0.25f, 1.0f, 1.0f).endVertex();
            method18168.pos(n6, n13, n7 + 16.0).color(0.25f, 0.25f, 1.0f, 1.0f).endVertex();
            method18168.pos(n6 + 16.0, n13, n7 + 16.0).color(0.25f, 0.25f, 1.0f, 1.0f).endVertex();
            method18168.pos(n6 + 16.0, n13, n7).color(0.25f, 0.25f, 1.0f, 1.0f).endVertex();
            method18168.pos(n6, n13, n7).color(0.25f, 0.25f, 1.0f, 1.0f).endVertex();
            method18168.pos(n6, n13, n7).color(0.25f, 0.25f, 1.0f, 0.0f).endVertex();
        }
        method18167.draw();
        RenderSystem.method30072(1.0f);
        RenderSystem.enableBlend();
        RenderSystem.enableTexture();
        RenderSystem.shadeModel(7424);
    }
}
