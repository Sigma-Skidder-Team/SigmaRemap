// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.UglyClickGUICategory;

public class Class4886 extends Class4841
{
    private static String[] field20591;
    public Class9572 field20886;
    
    public Class4886(final Class4803 class4803, final String s, final int n, final int n2) {
        super(class4803, s, n, n2, 30, 30, false);
        this.field20886 = new Class9572(1200, 1200, Direction.FORWARDS);
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26905((float)this.field20478, (float)this.field20479, 30.0f, 30.0f, this.method14308() ? UglyClickGUICategory.xmark2 : UglyClickGUICategory.xmark);
        super.draw(n);
    }
}
