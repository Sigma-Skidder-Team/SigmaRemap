// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import net.minecraft.util.math.Vec3i;

public class Class4846 extends Panel
{
    public int field20760;
    public final Animation field20761;
    public final Animation field20762;
    public String field20763;
    public Vec3i field20764;
    public int field20765;
    public int field20766;
    
    public Class4846(final CustomGuiScreen customGuiScreen, final String s, final int n, final int field20760, final int n2, final int field20761, final String field20762, final Vec3i field20763, final int field20764) {
        super(customGuiScreen, s, n, field20760, n2, field20761, true);
        this.field20760 = field20760;
        this.field20761 = new Animation(114, 114);
        (this.field20762 = new Animation(200, 200)).changeDirection(Direction.FORWARDS);
        this.field20763 = field20762;
        this.field20764 = field20763;
        this.field20765 = field20764;
        this.field20766 = field20761;
        this.field20599 = true;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20761.changeDirection(this.method14386() ? Direction.BACKWARDS : Direction.FORWARDS);
        this.method14385(this.method14386() || n > this.method14280() + this.method14276() - 62);
        if (this.field20762.getDirection() == Direction.BACKWARDS) {
            this.method14385(false);
            this.method14273(Math.round(this.method14276() * Class7791.method25029(this.field20762.calcPercent(), 0.0f, 1.0f, 1.0f)));
            if (this.field20762.calcPercent() == 1.0f) {
                this.method14517();
            }
        }
    }
    
    public void method14533() {
        this.field20762.changeDirection(Direction.BACKWARDS);
    }
    
    @Override
    public void draw(final float partialTicks) {
        RenderUtil.method26874((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, AllUtils.applyAlpha(AllUtils.method19121(ClientColors.LIGHT_GREYISH_BLUE.color, 0.03f), this.field20761.calcPercent()));
        RenderUtil.drawString(ClientFonts.JelloLight20, (float)(this.x + 68), (float)(this.y + 14), this.field20763, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.8f));
        RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.x + 68), (float)(this.y + 38), "x:" + this.field20764.getX() + " z:" + this.field20764.getZ(), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f));
        final int n2 = 27;
        final int n3 = this.field20480 - 43;
        final float n4 = this.method14386() ? 0.4f : 0.2f;
        RenderUtil.method26874((float)(this.x + n3), (float)(this.y + n2), 20.0f, 2.0f, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n4));
        RenderUtil.method26874((float)(this.x + n3), (float)(this.y + n2 + 5), 20.0f, 2.0f, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n4));
        RenderUtil.method26874((float)(this.x + n3), (float)(this.y + n2 + 10), 20.0f, 2.0f, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n4));
        RenderUtil.method26888((float)(this.x + 35), (float)(this.y + this.field20481 / 2), 20.0f, AllUtils.method19120(this.field20765, ClientColors.DEEP_TEAL.color, 0.9f));
        RenderUtil.method26888((float)(this.x + 35), (float)(this.y + this.field20481 / 2), 17.0f, this.field20765);
        RenderUtil.method26913((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, 14.0f, partialTicks * 0.2f * this.field20761.calcPercent());
        super.draw(partialTicks);
    }
}
