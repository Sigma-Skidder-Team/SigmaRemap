// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class Class8065
{
    private final ResourceLocation[] field33227;
    
    public Class8065(final ResourceLocation class1932) {
        this.field33227 = new ResourceLocation[6];
        for (int i = 0; i < 6; ++i) {
            this.field33227[i] = new ResourceLocation(class1932.method7798(), class1932.method7797() + '_' + i + ".png");
        }
    }
    
    public void method26461(final Minecraft class869, final float n, final float n2, final float n3) {
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        RenderSystem.method30057(5889);
        RenderSystem.pushMatrix();
        RenderSystem.method30058();
        RenderSystem.method30067(Matrix4f.method20755(85.0, class869.method5332().method7692() / (float)class869.method5332().method7693(), 0.05f, 10.0f));
        RenderSystem.method30057(5888);
        RenderSystem.pushMatrix();
        RenderSystem.method30058();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.method30062(180.0f, 1.0f, 0.0f, 0.0f);
        RenderSystem.enableBlend();
        RenderSystem.disableAlphaTest();
        RenderSystem.method30029();
        RenderSystem.method30010(false);
        RenderSystem.defaultBlendFunc();
        for (int i = 0; i < 4; ++i) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef((i % 2 / 2.0f - 0.5f) / 256.0f, (i / 2 / 2.0f - 0.5f) / 256.0f, 0.0f);
            RenderSystem.method30062(n, 1.0f, 0.0f, 0.0f);
            RenderSystem.method30062(n2, 0.0f, 1.0f, 0.0f);
            for (int j = 0; j < 6; ++j) {
                class869.method5290().method5849(this.field33227[j]);
                method22695.begin(7, DefaultVertexFormats.field39619);
                final int n4 = Math.round(255.0f * n3) / (i + 1);
                if (j == 0) {
                    method22695.pos(-1.0, -1.0, 1.0).tex(0.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(-1.0, 1.0, 1.0).tex(0.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, 1.0, 1.0).tex(1.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, -1.0, 1.0).tex(1.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                }
                if (j == 1) {
                    method22695.pos(1.0, -1.0, 1.0).tex(0.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, 1.0, 1.0).tex(0.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, 1.0, -1.0).tex(1.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, -1.0, -1.0).tex(1.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                }
                if (j == 2) {
                    method22695.pos(1.0, -1.0, -1.0).tex(0.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, 1.0, -1.0).tex(0.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(-1.0, 1.0, -1.0).tex(1.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(-1.0, -1.0, -1.0).tex(1.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                }
                if (j == 3) {
                    method22695.pos(-1.0, -1.0, -1.0).tex(0.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(-1.0, 1.0, -1.0).tex(0.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(-1.0, 1.0, 1.0).tex(1.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(-1.0, -1.0, 1.0).tex(1.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                }
                if (j == 4) {
                    method22695.pos(-1.0, -1.0, -1.0).tex(0.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(-1.0, -1.0, 1.0).tex(0.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, -1.0, 1.0).tex(1.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, -1.0, -1.0).tex(1.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                }
                if (j == 5) {
                    method22695.pos(-1.0, 1.0, 1.0).tex(0.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(-1.0, 1.0, -1.0).tex(0.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, 1.0, -1.0).tex(1.0f, 1.0f).method12399(255, 255, 255, n4).endVertex();
                    method22695.pos(1.0, 1.0, 1.0).tex(1.0f, 0.0f).method12399(255, 255, 255, n4).endVertex();
                }
                method22694.draw();
            }
            RenderSystem.popMatrix();
            RenderSystem.method30049(true, true, true, false);
        }
        RenderSystem.method30049(true, true, true, true);
        RenderSystem.method30057(5889);
        RenderSystem.popMatrix();
        RenderSystem.method30057(5888);
        RenderSystem.popMatrix();
        RenderSystem.method30010(true);
        RenderSystem.method30028();
        RenderSystem.enableDepthTest();
    }
    
    public CompletableFuture<Void> method26462(final Class1663 class1663, final Executor executor) {
        final CompletableFuture[] cfs = new CompletableFuture[6];
        for (int i = 0; i < cfs.length; ++i) {
            cfs[i] = class1663.method5855(this.field33227[i], executor);
        }
        return CompletableFuture.allOf(cfs);
    }
}
