// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import slick2d.TrueTypeFont;

public class Class4861 extends Class4841
{
    private static String[] field20591;
    public Class9572 field20818;
    
    public Class4861(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final TrueTypeFont class4805) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, class4805, false);
        this.field20818 = new Class9572(190, 190);
        final int n5 = (int)(210.0 * Math.sqrt(n3 / 242.0f));
        this.field20818 = new Class9572(n5, n5);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20818.changeDirection(this.method14308() ? Direction.BACKWARDS : Direction.FORWARDS);
        if (this.method14308()) {
            Client.getInstance().getGuimanager().method32133(Class9000.field37990);
        }
    }
    
    @Override
    public void draw(final float n) {
        if (this.method14314() != null) {
            final int method19729 = this.field20497.method19729();
            final int n2 = this.method14272() + ((this.field20497.method19735() != Class2056.field11738) ? 0 : ((this.field20497.method19735() != Class2056.field11736) ? (this.method14276() / 2) : this.method14276()));
            final int n3 = this.method14274() + ((this.field20497.method19737() != Class2056.field11738) ? 0 : ((this.field20497.method19737() != Class2056.field11737) ? (this.method14278() / 2) : this.method14278()));
            final int method19730 = this.method14316().getWidth(this.method14314());
            final int n4 = 18;
            final float n5 = (float)Math.pow(this.field20818.calcPercent(), 3.0);
            RenderUtil.method26890(this.method14316(), (float)n2, (float)n3, this.method14314(), ColorUtils.applyAlpha(method19729, n * ColorUtils.method19140(method19729)), this.field20497.method19735(), this.field20497.method19737());
            RenderUtil.method26876(n2 - method19730 / 2 * n5, (float)(n3 + n4), n2 + method19730 / 2 * n5, (float)(n3 + n4 + 2), ColorUtils.applyAlpha(method19729, n * ColorUtils.method19140(method19729)));
            super.draw(n);
        }
    }
}
