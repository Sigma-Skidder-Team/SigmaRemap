// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4906 extends Panel
{
    private static String[] field20591;
    private boolean field20985;
    private final Animation field20986;
    
    public Class4906(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final boolean field20985) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20985 = true;
        this.field20986 = new Animation(100, 100);
        this.field20985 = field20985;
    }
    
    @Override
    public void draw(float partialTicks) {
        this.field20986.changeDirection(this.method14308() ? Direction.BACKWARDS : Direction.FORWARDS);
        partialTicks *= 0.09f + 0.25f * this.field20986.calcPercent() + (this.field20985 ? 0.0f : 0.2f);
        RenderUtil.method26874((float)(this.x + 10), (float)(this.y + 16), 5.0f, 14.0f, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        RenderUtil.method26874((float)(this.x + 17), (float)(this.y + 10), 5.0f, 20.0f, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        RenderUtil.method26874((float)(this.x + 24), (float)(this.y + 20), 5.0f, 10.0f, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        super.draw(partialTicks);
    }
    
    public void method14738(final boolean field20985) {
        this.field20985 = field20985;
    }
}
