// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;

import java.util.List;

public class Class730 extends Screen
{
    private final Class5902 field3980;
    private final Class497 field3981;
    private int field3982;
    private int field3983;
    private Class7343 field3984;
    
    public Class730(final Class497 field3981) {
        super(new Class2259("sign.edit"));
        this.field3980 = new Class5902();
        this.field3981 = field3981;
    }
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        this.addButton(new Class654(this.width / 2 - 100, this.height / 4 + 120, 200, 20, Class8822.method30773("gui.done"), class654 -> this.method4031()));
        this.field3981.method2524(false);
        this.field3984 = new Class7343(this.minecraft, () -> this.field3981.method2520(this.field3983).getString(), s -> this.field3981.method2521(this.field3983, new StringTextComponent(s)), 90);
    }
    
    @Override
    public void removed() {
        this.minecraft.field4651.method22505(false);
        final Class5799 method5269 = this.minecraft.method5269();
        if (method5269 != null) {
            method5269.method17292(new Class4344(this.field3981.getPos(), this.field3981.method2520(0), this.field3981.method2520(1), this.field3981.method2520(2), this.field3981.method2520(3)));
        }
        this.field3981.method2524(true);
    }
    
    @Override
    public void tick() {
        ++this.field3982;
        if (!this.field3981.getType().method16523(this.field3981.method2194().getBlock())) {
            this.method4031();
        }
    }
    
    private void method4031() {
        this.field3981.method2161();
        this.minecraft.displayGuiScreen(null);
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        this.field3984.method22551(c);
        return true;
    }
    
    @Override
    public void onClose() {
        this.method4031();
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (keyCode != 265) {
            if (keyCode != 264) {
                if (keyCode != 257) {
                    if (keyCode != 335) {
                        return this.field3984.method22553(keyCode) || super.keyPressed(keyCode, n2, n3);
                    }
                }
            }
            this.field3983 = (this.field3983 + 1 & 0x3);
            this.field3984.method22556();
            return true;
        }
        this.field3983 = (this.field3983 - 1 & 0x3);
        this.field3984.method22556();
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        Class8317.method27611();
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 40, 16777215);
        final MatrixStack class7351 = new MatrixStack();
        class7351.method22567();
        class7351.method22564(this.width / 2, 0.0, 50.0);
        class7351.method22565(93.75f, -93.75f, 93.75f);
        class7351.method22564(0.0, -1.3125, 0.0);
        final BlockState method2194 = this.field3981.method2194();
        final boolean b = method2194.getBlock() instanceof Class3861;
        if (!b) {
            class7351.method22564(0.0, -0.3125, 0.0);
        }
        final boolean b2 = this.field3982 / 6 % 2 == 0;
        class7351.method22567();
        class7351.method22565(0.6666667f, -0.6666667f, -0.6666667f);
        final IRenderTypeBuffer.Impl method2195 = this.minecraft.method5333().method11006();
        final Class4150 method2196 = Class4159.method12461(method2194.getBlock()).method11334(method2195, this.field3980::method17647);
        this.field3980.field24272.method18643(class7351, method2196, 15728880, Class1904.field10335);
        if (b) {
            this.field3980.field24273.method18643(class7351, method2196, 15728880, Class1904.field10335);
        }
        class7351.method22568();
        class7351.method22564(0.0, 0.3333333432674408, 0.046666666865348816);
        class7351.method22565(0.010416667f, -0.010416667f, 0.010416667f);
        final int method2197 = this.field3981.method2529().method818();
        final String[] array = new String[4];
        for (int i = 0; i < array.length; ++i) {
            array[i] = this.field3981.method2522(i, class7353 -> {
                Class8936.method31697(class7353, 90, this.minecraft.fontRenderer, 0 != 0, 1 != 0);
                final List list;
                return list.isEmpty() ? "" : list.get(0).method8461();
            });
        }
        final Matrix4f method2198 = class7351.getLast().getMatrix();
        final int method2199 = this.field3984.method22557();
        final int method2200 = this.field3984.method22558();
        final int n4 = this.minecraft.fontRenderer.method6630() ? -1 : 1;
        final int n5 = this.field3983 * 10 - this.field3981.field2850.length * 5;
        for (int j = 0; j < array.length; ++j) {
            final String s = array[j];
            if (s != null) {
                this.minecraft.fontRenderer.renderString(s, (float)(-this.minecraft.fontRenderer.getStringWidth(s) / 2), (float)(j * 10 - this.field3981.field2850.length * 5), method2197, false, method2198, method2195, false, 0, 15728880);
                if (j == this.field3983) {
                    if (method2199 >= 0) {
                        if (b2) {
                            final int n6 = (this.minecraft.fontRenderer.getStringWidth(s.substring(0, Math.max(Math.min(method2199, s.length()), 0))) - this.minecraft.fontRenderer.getStringWidth(s) / 2) * n4;
                            if (method2199 >= s.length()) {
                                this.minecraft.fontRenderer.renderString("_", (float)n6, (float)n5, method2197, false, method2198, method2195, false, 0, 15728880);
                            }
                        }
                    }
                }
            }
        }
        method2195.finish();
        for (int k = 0; k < array.length; ++k) {
            final String s2 = array[k];
            if (s2 != null) {
                if (k == this.field3983) {
                    if (method2199 >= 0) {
                        final int n7 = (this.minecraft.fontRenderer.getStringWidth(s2.substring(0, Math.max(Math.min(method2199, s2.length()), 0))) - this.minecraft.fontRenderer.getStringWidth(s2) / 2) * n4;
                        if (b2) {
                            if (method2199 < s2.length()) {
                                AbstractGui.method3294(method2198, n7, n5 - 1, n7 + 1, n5 + 9, 0xFF000000 | method2197);
                            }
                        }
                        if (method2200 != method2199) {
                            final int min = Math.min(method2199, method2200);
                            final int max = Math.max(method2199, method2200);
                            final int n8 = (this.minecraft.fontRenderer.getStringWidth(s2.substring(0, min)) - this.minecraft.fontRenderer.getStringWidth(s2) / 2) * n4;
                            final int n9 = (this.minecraft.fontRenderer.getStringWidth(s2.substring(0, max)) - this.minecraft.fontRenderer.getStringWidth(s2) / 2) * n4;
                            final int min2 = Math.min(n8, n9);
                            final int max2 = Math.max(n8, n9);
                            final BufferBuilder method2201 = Tessellator.getInstance().getBuffer();
                            RenderSystem.disableTexture();
                            RenderSystem.method30036();
                            RenderSystem.method30038(Class2188.field12992);
                            method2201.begin(7, DefaultVertexFormats.POSITION_COLOR);
                            method2201.pos(method2198, (float)min2, (float)(n5 + 9), 0.0f).method12399(0, 0, 255, 255).endVertex();
                            method2201.pos(method2198, (float)max2, (float)(n5 + 9), 0.0f).method12399(0, 0, 255, 255).endVertex();
                            method2201.pos(method2198, (float)max2, (float)n5, 0.0f).method12399(0, 0, 255, 255).endVertex();
                            method2201.pos(method2198, (float)min2, (float)n5, 0.0f).method12399(0, 0, 255, 255).endVertex();
                            method2201.finishDrawing();
                            WorldVertexBufferUploader.draw(method2201);
                            RenderSystem.method30037();
                            RenderSystem.enableTexture();
                        }
                    }
                }
            }
        }
        class7351.method22568();
        Class8317.method27612();
        super.render(n, n2, n3);
    }
}
