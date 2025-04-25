// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public class Class9316
{
    private static final ResourceLocation field40007;
    
    public static void method34477(final Minecraft class869, final MatrixStack class870) {
        RenderSystem.disableAlphaTest();
        final ClientPlayerEntity field4684 = class869.player;
        if (!field4684.noClip) {
            final BlockState method34478 = method34478(field4684);
            if (method34478 != null) {
                method34479(class869, class869.method5305().method5787().method35427(method34478), class870);
            }
        }
        if (!class869.player.isSpectator()) {
            if (class869.player.method1720(Class7324.field28319)) {
                method34480(class869, class870);
            }
            if (class869.player.method1804()) {
                method34481(class869, class870);
            }
        }
        RenderSystem.enableAlphaTest();
    }
    
    @Nullable
    private static BlockState method34478(final PlayerEntity playerEntity) {
        final Mutable class513 = new Mutable();
        for (int i = 0; i < 8; ++i) {
            class513.method1286(playerEntity.getPosX() + ((i >> 0) % 2 - 0.5f) * playerEntity.method1930() * 0.8f, playerEntity.method1944() + ((i >> 1) % 2 - 0.5f) * 0.1f, playerEntity.getPosZ() + ((i >> 2) % 2 - 0.5f) * playerEntity.method1930() * 0.8f);
            final BlockState method6701 = playerEntity.world.getBlockState(class513);
            if (method6701.method21710() != Class2115.field12305 && method6701.method21747(playerEntity.world, class513)) {
                return method6701;
            }
        }
        return null;
    }
    
    private static void method34479(final Minecraft class869, final TextureAtlasSprite class870, final MatrixStack class871) {
        if (Class7663.method24283()) {
            Class7663.method24285(class870);
        }
        class869.method5290().method5849(class870.method7504().method6340());
        final BufferBuilder method22696 = Tessellator.getInstance().getBuffer();
        final float method22697 = class870.method7497();
        final float method22698 = class870.method7498();
        final float method22699 = class870.method7500();
        final float method22700 = class870.method7501();
        final Matrix4f method22701 = class871.getLast().getMatrix();
        method22696.begin(7, DefaultVertexFormats.field39618);
        method22696.pos(method22701, -1.0f, -1.0f, -0.5f).color(0.1f, 0.1f, 0.1f, 1.0f).tex(method22698, method22700).endVertex();
        method22696.pos(method22701, 1.0f, -1.0f, -0.5f).color(0.1f, 0.1f, 0.1f, 1.0f).tex(method22697, method22700).endVertex();
        method22696.pos(method22701, 1.0f, 1.0f, -0.5f).color(0.1f, 0.1f, 0.1f, 1.0f).tex(method22697, method22699).endVertex();
        method22696.pos(method22701, -1.0f, 1.0f, -0.5f).color(0.1f, 0.1f, 0.1f, 1.0f).tex(method22698, method22699).endVertex();
        method22696.finishDrawing();
        WorldVertexBufferUploader.draw(method22696);
    }
    
    private static void method34480(final Minecraft class869, final MatrixStack class870) {
        class869.method5290().method5849(Class9316.field40007);
        if (Class7663.method24283()) {
            Class7663.method24289(class869.method5290().method5853(Class9316.field40007).method5869());
        }
        final BufferBuilder method22696 = Tessellator.getInstance().getBuffer();
        final float method22697 = class869.player.method1726();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        final float n = -class869.player.rotationYaw / 64.0f;
        final float n2 = class869.player.rotationPitch / 64.0f;
        final Matrix4f method22698 = class870.getLast().getMatrix();
        method22696.begin(7, DefaultVertexFormats.field39618);
        method22696.pos(method22698, -1.0f, -1.0f, -0.5f).color(method22697, method22697, method22697, 0.1f).tex(4.0f + n, 4.0f + n2).endVertex();
        method22696.pos(method22698, 1.0f, -1.0f, -0.5f).color(method22697, method22697, method22697, 0.1f).tex(0.0f + n, 4.0f + n2).endVertex();
        method22696.pos(method22698, 1.0f, 1.0f, -0.5f).color(method22697, method22697, method22697, 0.1f).tex(0.0f + n, 0.0f + n2).endVertex();
        method22696.pos(method22698, -1.0f, 1.0f, -0.5f).color(method22697, method22697, method22697, 0.1f).tex(4.0f + n, 0.0f + n2).endVertex();
        method22696.finishDrawing();
        WorldVertexBufferUploader.draw(method22696);
        RenderSystem.disableBlend();
    }
    
    private static void method34481(final Minecraft class869, final MatrixStack class870) {
        final BufferBuilder method22696 = Tessellator.getInstance().getBuffer();
        RenderSystem.method30009(519);
        RenderSystem.method30010(false);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        final TextureAtlasSprite method22697 = Class7637.field30238.method11332();
        if (Class7663.method24283()) {
            Class7663.method24285(method22697);
        }
        class869.method5290().method5849(method22697.method7504().method6340());
        final float method22698 = method22697.method7497();
        final float method22699 = method22697.method7498();
        final float n = (method22698 + method22699) / 2.0f;
        final float method22700 = method22697.method7500();
        final float method22701 = method22697.method7501();
        final float n2 = (method22700 + method22701) / 2.0f;
        final float method22702 = method22697.method7509();
        final float method22703 = MathHelper.method35700(method22702, method22698, n);
        final float method22704 = MathHelper.method35700(method22702, method22699, n);
        final float method22705 = MathHelper.method35700(method22702, method22700, n2);
        final float method22706 = MathHelper.method35700(method22702, method22701, n2);
        final Class5746 class871 = new Class5746(0.9f);
        Client.getInstance().getEventBus().post(class871);
        for (int i = 0; i < 2; ++i) {
            class870.method22567();
            class870.method22564(-(i * 2 - 1) * 0.24f, -0.30000001192092896, 0.0);
            class870.method22566(Vector3f.YP.rotationDegrees((i * 2 - 1) * 10.0f));
            final Matrix4f method22707 = class870.getLast().getMatrix();
            method22696.begin(7, DefaultVertexFormats.field39618);
            method22696.pos(method22707, -0.5f, -0.5f, -0.5f).color(1.0f, 1.0f, 1.0f, class871.method17054()).tex(method22704, method22706).endVertex();
            method22696.pos(method22707, 0.5f, -0.5f, -0.5f).color(1.0f, 1.0f, 1.0f, class871.method17054()).tex(method22703, method22706).endVertex();
            method22696.pos(method22707, 0.5f, 0.5f, -0.5f).color(1.0f, 1.0f, 1.0f, class871.method17054()).tex(method22703, method22705).endVertex();
            method22696.pos(method22707, -0.5f, 0.5f, -0.5f).color(1.0f, 1.0f, 1.0f, class871.method17054()).tex(method22704, method22705).endVertex();
            method22696.finishDrawing();
            WorldVertexBufferUploader.draw(method22696);
            class870.method22568();
        }
        RenderSystem.disableBlend();
        RenderSystem.method30010(true);
        RenderSystem.method30009(515);
    }
    
    static {
        field40007 = new ResourceLocation("textures/misc/underwater.png");
    }
}
