// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.TrueTypeFont;

public class Class4834 extends Class4825 {
    private static String[] field20591;
    public static ColorHelper field20719;

    public Class4834(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, false);
    }

    public Class4834(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, class4805, false);
    }

    @Override
    public void draw(final float n) {
        if (this.field20495 != null) {
            RenderUtil.drawString(this.method14316(), (float) this.method14272(), (float) this.method14274(), this.getTypedText(), ColorUtils.applyAlpha(this.field20497.method19733(), n * ColorUtils.method19140(this.field20497.method19733())));
        }
    }

    static {
        Class4834.field20719 = new ColorHelper(ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, Class2056.field11734, Class2056.field11738);
    }
}
