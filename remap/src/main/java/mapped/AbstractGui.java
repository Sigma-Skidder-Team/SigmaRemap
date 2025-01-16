// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;

public abstract class AbstractGui
{
    public static final ResourceLocation BACKGROUND_LOCATION;
    public static final ResourceLocation STATS_ICON_LOCATION;
    public static final ResourceLocation GUI_ICONS_LOCATION;
    private int blitOffset;
    
    public void method3291(int n, int n2, final int n3, final int n4) {
        if (n2 < n) {
            final int n5 = n;
            n = n2;
            n2 = n5;
        }
        fill(n, n3, n2 + 1, n3 + 1, n4);
    }
    
    public void method3292(final int n, int n2, int n3, final int n4) {
        if (n3 < n2) {
            final int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        fill(n, n2 + 1, n + 1, n3, n4);
    }
    
    public static void fill(final int n, final int n2, final int n3, final int n4, final int n5) {
        method3294(TransformationMatrix.identity().getMatrix(), n, n2, n3, n4, n5);
    }
    
    public static void method3294(final Matrix4f class6789, int n, int n2, int n3, int n4, final int n5) {
        if (n < n3) {
            final int n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            final int n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        final float n8 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n10 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n11 = (n5 & 0xFF) / 255.0f;
        final BufferBuilder bufferbuilder = Tessellator.getInstance().getBuffer();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.defaultBlendFunc();
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(class6789, (float)n, (float)n4, 0.0f).color(n9, n10, n11, n8).endVertex();
        bufferbuilder.pos(class6789, (float)n3, (float)n4, 0.0f).color(n9, n10, n11, n8).endVertex();
        bufferbuilder.pos(class6789, (float)n3, (float)n2, 0.0f).color(n9, n10, n11, n8).endVertex();
        bufferbuilder.pos(class6789, (float)n, (float)n2, 0.0f).color(n9, n10, n11, n8).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public void fillGradient(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n8 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n10 = (n5 & 0xFF) / 255.0f;
        final float n11 = (n6 >> 24 & 0xFF) / 255.0f;
        final float n12 = (n6 >> 16 & 0xFF) / 255.0f;
        final float n13 = (n6 >> 8 & 0xFF) / 255.0f;
        final float n14 = (n6 & 0xFF) / 255.0f;
        RenderSystem.disableTexture();
        RenderSystem.enableBlend();
        RenderSystem.disableAlphaTest();
        RenderSystem.defaultBlendFunc();
        RenderSystem.shadeModel(7425);
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(n3, n2, this.blitOffset).color(n8, n9, n10, n7).endVertex();
        bufferbuilder.pos(n, n2, this.blitOffset).color(n8, n9, n10, n7).endVertex();
        bufferbuilder.pos(n, n4, this.blitOffset).color(n12, n13, n14, n11).endVertex();
        bufferbuilder.pos(n3, n4, this.blitOffset).color(n12, n13, n14, n11).endVertex();
        tessellator.draw();
        RenderSystem.shadeModel(7424);
        RenderSystem.disableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableTexture();
    }
    
    public void drawCenteredString(final FontRenderer class1844, final String s, final int n, final int n2, final int n3) {
        class1844.drawStringWithShadow(s, (float)(n - class1844.getStringWidth(s) / 2), (float)n2, n3);
    }
    
    public void drawRightAlignedString(final FontRenderer class1844, final String s, final int n, final int n2, final int n3) {
        class1844.drawStringWithShadow(s, (float)(n - class1844.getStringWidth(s)), (float)n2, n3);
    }
    
    public void drawString(final FontRenderer class1844, final String s, final int n, final int n2, final int n3) {
        class1844.drawStringWithShadow(s, (float)n, (float)n2, n3);
    }
    
    public static void blit(final int n, final int n2, final int n3, final int n4, final int n5, final TextureAtlasSprite class1912) {
        innerBlit(n, n + n4, n2, n2 + n5, n3, class1912.method7497(), class1912.method7498(), class1912.method7500(), class1912.method7501());
    }
    
    public void blit(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        blit(n, n2, this.blitOffset, (float)n3, (float)n4, n5, n6, 256, 256);
    }
    
    public static void blit(final int n, final int n2, final int n3, final float n4, final float n5, final int n6, final int n7, final int n8, final int n9) {
        innerBlit(n, n + n6, n2, n2 + n7, n3, n6, n7, n4, n5, n9, n8);
    }
    
    public static void blit(final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final int n7, final int n8, final int n9, final int n10) {
        innerBlit(n, n + n3, n2, n2 + n4, 0, n7, n8, n5, n6, n9, n10);
    }
    
    public static void blit(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8) {
        blit(n, n2, n5, n6, n3, n4, n5, n6, n7, n8);
    }
    
    private static void innerBlit(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final float n8, final float n9, final int n10, final int n11) {
        innerBlit(n, n2, n3, n4, n5, (n8 + 0.0f) / n10, (n8 + n6) / n10, (n9 + 0.0f) / n11, (n9 + n7) / n11);
    }
    
    public static void innerBlit(final int n, final int n2, final int n3, final int n4, final int n5, final float n6, final float n7, final float n8, final float n9) {
        final BufferBuilder method22696 = Tessellator.getInstance().getBuffer();
        method22696.begin(7, DefaultVertexFormats.field39617);
        method22696.pos(n, n4, n5).tex(n6, n9).endVertex();
        method22696.pos(n2, n4, n5).tex(n7, n9).endVertex();
        method22696.pos(n2, n3, n5).tex(n7, n8).endVertex();
        method22696.pos(n, n3, n5).tex(n6, n8).endVertex();
        method22696.finishDrawing();
        RenderSystem.enableAlphaTest();
        WorldVertexBufferUploader.draw(method22696);
    }
    
    public int getBlitOffset() {
        return this.blitOffset;
    }
    
    public void setBlitOffset(final int field3364) {
        this.blitOffset = field3364;
    }
    
    static {
        BACKGROUND_LOCATION = new ResourceLocation("textures/gui/options_background.png");
        STATS_ICON_LOCATION = new ResourceLocation("textures/gui/container/stats_icons.png");
        GUI_ICONS_LOCATION = new ResourceLocation("textures/gui/icons.png");
    }
}
