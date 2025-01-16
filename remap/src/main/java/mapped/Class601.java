// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class601 extends Class599
{
    private static String[] field3530;
    private final Class5054 field3531;
    
    public Class601(final Class5054 field3531, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(Minecraft.method5277(), n, n2, n3, n4, n5);
        this.field3531 = field3531;
    }
    
    @Override
    public int method3485() {
        return this.field3531.method15501();
    }
    
    @Override
    public boolean method3486(final int n, final int n2, final double n3, final double n4) {
        return this.field3531.method15502(n, n2, n3, n4);
    }
    
    @Override
    public boolean method3487(final int n) {
        return this.field3531.method15503(n);
    }
    
    @Override
    public void method3489() {
        this.field3531.method15504();
    }
    
    @Override
    public void method3491(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        this.field3531.method15500(n, n2, n3, n4, n5, n6);
    }
    
    public int method3520() {
        return this.field3513;
    }
    
    @Override
    public int method3488() {
        return this.field3531.method15505();
    }
    
    @Override
    public int method3508() {
        return this.field3531.method15506();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (this.field3523) {
            this.method3489();
            final int method3508 = this.method3508();
            final int n4 = method3508 + 6;
            this.method3496();
            final Tessellator method3509 = Tessellator.getInstance();
            final BufferBuilder method3510 = method3509.getBuffer();
            final int n5 = this.field3518 + this.field3513 / 2 - this.method3505() / 2 + 2;
            final int n6 = this.field3515 + 4 - (int)this.field3522;
            if (this.field3525) {
                this.method3492(n5, n6, method3509);
            }
            this.method3506(n5, n6, n, n2, n3);
            RenderSystem.disableDepthTest();
            this.method3509(0, this.field3515, 255, 255);
            this.method3509(this.field3516, this.field3514, 255, 255);
            RenderSystem.enableBlend();
            RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11696, Class2135.field12455);
            RenderSystem.disableAlphaTest();
            RenderSystem.shadeModel(7425);
            RenderSystem.disableTexture();
            final int method3511 = this.method3497();
            if (method3511 > 0) {
                final int method3512 = MathHelper.method35651((this.field3516 - this.field3515) * (this.field3516 - this.field3515) / this.method3488(), 32, this.field3516 - this.field3515 - 8);
                int field3515 = (int)this.field3522 * (this.field3516 - this.field3515 - method3512) / method3511 + this.field3515;
                if (field3515 < this.field3515) {
                    field3515 = this.field3515;
                }
                method3510.begin(7, DefaultVertexFormats.field39619);
                method3510.pos(method3508, this.field3516, 0.0).tex(0.0f, 1.0f).method12399(0, 0, 0, 255).endVertex();
                method3510.pos(n4, this.field3516, 0.0).tex(1.0f, 1.0f).method12399(0, 0, 0, 255).endVertex();
                method3510.pos(n4, this.field3515, 0.0).tex(1.0f, 0.0f).method12399(0, 0, 0, 255).endVertex();
                method3510.pos(method3508, this.field3515, 0.0).tex(0.0f, 0.0f).method12399(0, 0, 0, 255).endVertex();
                method3509.draw();
                method3510.begin(7, DefaultVertexFormats.field39619);
                method3510.pos(method3508, field3515 + method3512, 0.0).tex(0.0f, 1.0f).method12399(128, 128, 128, 255).endVertex();
                method3510.pos(n4, field3515 + method3512, 0.0).tex(1.0f, 1.0f).method12399(128, 128, 128, 255).endVertex();
                method3510.pos(n4, field3515, 0.0).tex(1.0f, 0.0f).method12399(128, 128, 128, 255).endVertex();
                method3510.pos(method3508, field3515, 0.0).tex(0.0f, 0.0f).method12399(128, 128, 128, 255).endVertex();
                method3509.draw();
                method3510.begin(7, DefaultVertexFormats.field39619);
                method3510.pos(method3508, field3515 + method3512 - 1, 0.0).tex(0.0f, 1.0f).method12399(192, 192, 192, 255).endVertex();
                method3510.pos(n4 - 1, field3515 + method3512 - 1, 0.0).tex(1.0f, 1.0f).method12399(192, 192, 192, 255).endVertex();
                method3510.pos(n4 - 1, field3515, 0.0).tex(1.0f, 0.0f).method12399(192, 192, 192, 255).endVertex();
                method3510.pos(method3508, field3515, 0.0).tex(0.0f, 0.0f).method12399(192, 192, 192, 255).endVertex();
                method3509.draw();
            }
            this.method3494(n, n2);
            RenderSystem.enableTexture();
            RenderSystem.shadeModel(7424);
            RenderSystem.enableAlphaTest();
            RenderSystem.disableBlend();
        }
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        return this.field3531.mouseScrolled(n, n2, n3) || super.mouseScrolled(n, n2, n3);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return this.field3531.mouseClicked(n, n2, n3) || super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        return this.field3531.mouseReleased(n, n2, n3);
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        return this.field3531.mouseDragged(n, n2, n3, n4, n5);
    }
}
