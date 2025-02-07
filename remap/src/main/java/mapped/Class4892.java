// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.TrueTypeFont;

public class Class4892 extends Class4841
{
    private static String[] field20591;
    private float field20914;
    private float field20915;
    private Class4879 field20916;
    private Animation field20917;
    
    public static float method14671(final float n, final float n2, final float n3) {
        return (n3 - n) / (n2 - n);
    }
    
    public static float method14672(final float n, final float n2, final float n3, final float n4, final int n5) {
        return Math.round((n2 + n * (Math.abs(n3 - n2) / n4) * n4) * Math.pow(10.0, n5)) / (float)Math.pow(10.0, n5);
    }
    
    public Class4892(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.method14673();
    }
    
    public Class4892(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, false);
        this.method14673();
    }
    
    public Class4892(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, false);
        this.method14673();
    }
    
    public Class4892(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, class4805, false);
        this.method14673();
    }
    
    private void method14673() {
        this.addToList(this.field20916 = new Class4879(this, this.method14278()));
        this.field20914 = -1.0f;
        this.field20917 = new Animation(114, 114, Direction.FORWARDS);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final Animation field20917 = this.field20917;
        Direction direction = null;
        Label_0064: {
            if (!this.method14308()) {
                if (!this.field20916.method14308()) {
                    if (!this.method14309()) {
                        if (!this.field20916.method14386()) {
                            direction = Direction.FORWARDS;
                            break Label_0064;
                        }
                    }
                }
            }
            direction = Direction.BACKWARDS;
        }
        field20917.changeDirection(direction);
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        final int n2 = this.method14278() / 4;
        final int n3 = this.method14276() - this.field20916.method14276() / 2 - 3;
        final int n4 = this.method14272() + this.field20916.method14276() / 4 + 3;
        final int n5 = this.method14274() + this.method14278() / 2 - n2 / 2;
        final int n6 = this.field20916.method14272() + this.field20916.method14276() / 2 - 6;
        RenderUtil.method26925((float)n4, (float)n5, (float)n6, (float)n2, (float)(n2 / 2), ColorUtils.applyAlpha(this.field20497.method19729(), n * n * n));
        RenderUtil.method26925((float)(n4 + n6), (float)n5, (float)(n3 - n6), (float)n2, (float)(n2 / 2), ColorUtils.applyAlpha(ColorUtils.method19122(this.field20497.method19729(), 0.8f), n * n * n));
        if (this.getTypedText() != null) {
            RenderUtil.drawString(ClientFonts.JelloLight14, (float)(n4 - ClientFonts.JelloLight14.getWidth(this.getTypedText()) - 10 - Math.max(0, 9 - this.field20916.method14272())), (float)(n5 - 5), this.getTypedText(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f * this.field20917.calcPercent() * n));
        }
        super.draw(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        if (!super.method14211(n, n2, n3)) {
            this.field20916.method14387(true);
            return false;
        }
        return true;
    }
    
    public Class4879 method14674() {
        return this.field20916;
    }
    
    @Override
    public void method14235(final float n) {
        if (!this.method14308()) {
            if (!this.field20916.method14308()) {}
        }
        super.method14235(n);
    }
    
    public float method14675() {
        return this.field20915;
    }
    
    public void method14676(final float n) {
        this.method14677(n, true);
    }
    
    public void method14677(float min, final boolean b) {
        min = Math.min(Math.max(min, 0.0f), 1.0f);
        final float field20915 = this.field20915;
        this.field20915 = min;
        this.field20916.method14273((int)((this.method14276() - this.field20916.method14276()) * min + 0.5f));
        if (b) {
            if (field20915 != min) {
                this.method14517();
            }
        }
    }
    
    public boolean method14678() {
        return this.field20914 >= 0.0f && this.field20914 <= 1.0f;
    }
    
    public float method14679() {
        return this.field20914;
    }
    
    public void method14680(float min) {
        min = Math.min(Math.max(min, 0.0f), 1.0f);
        this.field20914 = min;
    }
}
