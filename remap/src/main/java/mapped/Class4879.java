// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import org.newdawn.slick.TrueTypeFont;

public class Class4879 extends Class4868
{
    private final Class4892 field20871;
    private final Animation field20872;
    
    public Class4879(final Class4892 field20871, final int n) {
        super(field20871, "sliderButton", 0, 0, n, n, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color));
        (this.field20872 = new Animation(125, 125)).changeDirection(Direction.FORWARDS);
        this.method14385(true);
        this.field20602 = true;
        this.field20871 = field20871;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20871.method14675();
        final float n3 = this.method14272() / (float)(this.field20475.method14276() - this.method14276());
        Label_0093: {
            if (!this.method14309()) {
                if (!this.method14308()) {
                    if (!this.method14386()) {
                        this.field20872.changeDirection(Direction.FORWARDS);
                        break Label_0093;
                    }
                }
            }
            this.field20872.changeDirection(Direction.BACKWARDS);
        }
        this.field20871.method14676(n3);
    }
    
    @Override
    public void draw(final float n) {
        final float n2 = this.isHovered() ? (this.method14386() ? 0.0f : (this.method14309() ? 1.5f : Math.max(n * this.field20845, 0.0f))) : 0.3f;
        final int n3 = 5;
        final float n4 = (float)this.method14276();
        RenderUtil.method26913((float)(this.method14272() + n3), (float)(this.method14274() + n3), (float)(this.method14276() - n3 * 2), (float)(this.method14278() - n3 * 2), 10.0f, n * 0.8f);
        RenderUtil.method26888((float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14276() / 2), n4, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        if (this.getTypedText() == null) {}
        final TrueTypeFont field40310 = ClientFonts.JelloLight12;
        super.method14229(n);
    }
}
