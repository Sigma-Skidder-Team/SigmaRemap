// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.UglyClickGUICategory;

public class Class4886 extends Panel
{
    private static String[] field20591;
    public Animation field20886;
    
    public Class4886(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2) {
        super(customGuiScreen, s, n, n2, 30, 30, false);
        this.field20886 = new Animation(1200, 1200, Direction.FORWARDS);
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26905((float)this.x, (float)this.y, 30.0f, 30.0f, this.method14308() ? UglyClickGUICategory.xmark2 : UglyClickGUICategory.xmark);
        super.draw(n);
    }
}
