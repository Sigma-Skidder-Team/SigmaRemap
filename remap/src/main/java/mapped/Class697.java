// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class697 extends Screen
{
    private static final Logger field3146;
    private static final ResourceLocation field3832;
    private static final ResourceLocation field3833;
    private static final ResourceLocation field3834;
    private final boolean field3835;
    private final Runnable field3836;
    private float field3837;
    private List<String> field3838;
    private int field3839;
    private float field3840;
    
    public Class697(final boolean field3835, final Runnable field3836) {
        super(NarratorChatListener.EMPTY);
        this.field3840 = 0.5f;
        this.field3835 = field3835;
        this.field3836 = field3836;
        if (!field3835) {
            this.field3840 = 0.75f;
        }
    }
    
    @Override
    public void tick() {
        this.minecraft.method5259().method26545();
        this.minecraft.method5299().method6428(false);
        if (this.field3837 > (this.field3839 + this.height + this.height + 24) / this.field3840) {
            this.method3894();
        }
    }
    
    @Override
    public void onClose() {
        this.method3894();
    }
    
    private void method3894() {
        this.field3836.run();
        this.minecraft.displayGuiScreen(null);
    }
    
    @Override
    public void init() {
        if (this.field3838 == null) {
            this.field3838 = Lists.newArrayList();
            Class1671 method19933 = null;
            try {
                final String string = "" + TextFormatting.WHITE + TextFormatting.OBFUSCATED + TextFormatting.GREEN + TextFormatting.AQUA;
                if (this.field3835) {
                    method19933 = this.minecraft.method5291().method19933(new ResourceLocation("texts/end.txt"));
                    final InputStream method19934 = method19933.method5887();
                    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(method19934, StandardCharsets.UTF_8));
                    final Random random = new Random(8124371L);
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        String s;
                        int index;
                        for (s = line.replaceAll("PLAYERNAME", this.minecraft.method5287().getUsername()); s.contains(string); s = s.substring(0, index) + TextFormatting.WHITE + TextFormatting.OBFUSCATED + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + s.substring(index + string.length())) {
                            index = s.indexOf(string);
                        }
                        this.field3838.addAll(this.minecraft.fontRenderer.method6626(s, 274));
                        this.field3838.add("");
                    }
                    method19934.close();
                    for (int i = 0; i < 8; ++i) {
                        this.field3838.add("");
                    }
                }
                final InputStream method19935 = this.minecraft.method5291().method19933(new ResourceLocation("texts/credits.txt")).method5887();
                String line2;
                while ((line2 = new BufferedReader(new InputStreamReader(method19935, StandardCharsets.UTF_8)).readLine()) != null) {
                    this.field3838.addAll(this.minecraft.fontRenderer.method6626(line2.replaceAll("PLAYERNAME", this.minecraft.method5287().getUsername()).replaceAll("\t", "    "), 274));
                    this.field3838.add("");
                }
                method19935.close();
                this.field3839 = this.field3838.size() * 12;
            }
            catch (final Exception ex) {
                Class697.field3146.error("Couldn't load credits", ex);
            }
            finally {
                IOUtils.closeQuietly(method19933);
            }
        }
    }
    
    private void method3895(final int n, final int n2, final float n3) {
        this.minecraft.method5290().method5849(AbstractGui.BACKGROUND_LOCATION);
        final int field3152 = this.width;
        final float n4 = -this.field3837 * 0.5f * this.field3840;
        final float n5 = this.height - this.field3837 * 0.5f * this.field3840;
        float n6 = this.field3837 * 0.02f;
        final float n7 = ((this.field3839 + this.height + this.height + 24) / this.field3840 - 20.0f - this.field3837) * 0.005f;
        if (n7 < n6) {
            n6 = n7;
        }
        if (n6 > 1.0f) {
            n6 = 1.0f;
        }
        final float n8 = n6 * n6 * 96.0f / 255.0f;
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        method22695.begin(7, DefaultVertexFormats.field39619);
        method22695.pos(0.0, this.height, this.getBlitOffset()).tex(0.0f, n4 * 0.015625f).color(n8, n8, n8, 1.0f).endVertex();
        method22695.pos(field3152, this.height, this.getBlitOffset()).tex(field3152 * 0.015625f, n4 * 0.015625f).color(n8, n8, n8, 1.0f).endVertex();
        method22695.pos(field3152, 0.0, this.getBlitOffset()).tex(field3152 * 0.015625f, n5 * 0.015625f).color(n8, n8, n8, 1.0f).endVertex();
        method22695.pos(0.0, 0.0, this.getBlitOffset()).tex(0.0f, n5 * 0.015625f).color(n8, n8, n8, 1.0f).endVertex();
        method22694.draw();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method3895(n, n2, n3);
        final int n4 = this.width / 2 - 137;
        final int n5 = this.height + 50;
        this.field3837 += n3;
        final float n6 = -this.field3837 * this.field3840;
        RenderSystem.pushMatrix();
        RenderSystem.translatef(0.0f, n6, 0.0f);
        this.minecraft.method5290().method5849(Class697.field3832);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.enableAlphaTest();
        this.blit(n4, n5, 0, 0, 155, 44);
        this.blit(n4 + 155, n5, 0, 45, 155, 44);
        this.minecraft.method5290().method5849(Class697.field3833);
        AbstractGui.blit(n4 + 88, n5 + 37, 0.0f, 0.0f, 98, 14, 128, 16);
        RenderSystem.disableAlphaTest();
        int n7 = n5 + 100;
        for (int i = 0; i < this.field3838.size(); ++i) {
            if (i == this.field3838.size() - 1) {
                final float n8 = n7 + n6 - (this.height / 2 - 6);
                if (n8 < 0.0f) {
                    RenderSystem.translatef(0.0f, -n8, 0.0f);
                }
            }
            if (n7 + n6 + 12.0f + 8.0f > 0.0f) {
                if (n7 + n6 < this.height) {
                    final String s = this.field3838.get(i);
                    if (!s.startsWith("[C]")) {
                        this.font.field10029.setSeed((long)(i * 4238972211L + this.field3837 / 4.0f));
                        this.font.drawStringWithShadow(s, (float)n4, (float)n7, 16777215);
                    }
                    else {
                        this.font.drawStringWithShadow(s.substring(3), (float)(n4 + (274 - this.font.getStringWidth(s.substring(3))) / 2), (float)n7, 16777215);
                    }
                }
            }
            n7 += 12;
        }
        RenderSystem.popMatrix();
        this.minecraft.method5290().method5849(Class697.field3834);
        RenderSystem.enableBlend();
        RenderSystem.method30013(Class2050.field11696, Class2135.field12461);
        final int field3152 = this.width;
        final int field3153 = this.height;
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        method22695.begin(7, DefaultVertexFormats.field39619);
        method22695.pos(0.0, field3153, this.getBlitOffset()).tex(0.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        method22695.pos(field3152, field3153, this.getBlitOffset()).tex(1.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        method22695.pos(field3152, 0.0, this.getBlitOffset()).tex(1.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        method22695.pos(0.0, 0.0, this.getBlitOffset()).tex(0.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        method22694.draw();
        RenderSystem.disableBlend();
        super.render(n, n2, n3);
    }
    
    static {
        field3146 = LogManager.getLogger();
        field3832 = new ResourceLocation("textures/gui/title/minecraft.png");
        field3833 = new ResourceLocation("textures/gui/title/edition.png");
        field3834 = new ResourceLocation("textures/misc/vignette.png");
    }
}
