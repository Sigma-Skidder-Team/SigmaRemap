// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import org.newdawn.slick.TrueTypeFont;

public class UIButton extends Panel
{
    private static String[] field20591;
    public Animation field20818;
    
    public UIButton(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, class4805, false);
        this.field20818 = new Animation(190, 190);
        final int n5 = (int)(210.0 * Math.sqrt(n3 / 242.0f));
        this.field20818 = new Animation(n5, n5);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20818.changeDirection(this.method14308() ? Direction.BACKWARDS : Direction.FORWARDS);
        if (this.method14308()) {
            Client.getInstance().getScreenManager().method32133(ScreenManager.field37990);
        }
    }
    
    @Override
    public void draw(final float partialTicks) {
        if (this.getTypedText() != null) {
            final int method19729 = this.field20497.method19729();
            final int n2 = this.method14272() + ((this.field20497.method19735() != Class2056.field11738) ? 0 : ((this.field20497.method19735() != Class2056.field11736) ? (this.method14276() / 2) : this.method14276()));
            final int n3 = this.method14274() + ((this.field20497.method19737() != Class2056.field11738) ? 0 : ((this.field20497.method19737() != Class2056.field11737) ? (this.method14278() / 2) : this.method14278()));
            final int method19730 = this.method14316().getWidth(this.getTypedText());
            final int n4 = 18;
            final float n5 = (float)Math.pow(this.field20818.calcPercent(), 3.0);
            RenderUtil.method26890(this.method14316(), (float)n2, (float)n3, this.getTypedText(), AllUtils.applyAlpha(method19729, partialTicks * AllUtils.method19140(method19729)), this.field20497.method19735(), this.field20497.method19737());
            RenderUtil.method26876(n2 - method19730 / 2 * n5, (float)(n3 + n4), n2 + method19730 / 2 * n5, (float)(n3 + n4 + 2), AllUtils.applyAlpha(method19729, partialTicks * AllUtils.method19140(method19729)));
            super.draw(partialTicks);
        }
    }
}
