// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.Texture;
import org.newdawn.slick.TrueTypeFont;

public class Class4872 extends Class4871
{
    private static String[] field20854;
    
    public Class4872(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final ColorHelper class4805, final String s2, final TrueTypeFont class4806) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, class4805, s2, class4806);
        this.method14385(true);
    }
    
    public Class4872(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final ColorHelper class4805, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, class4805, s2);
        this.method14385(true);
    }
    
    public Class4872(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final ColorHelper class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, class4805);
        this.method14385(true);
    }
    
    public Class4872(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804);
        this.method14385(true);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        this.field20853 = this.method14386();
        super.method14200(n, n2);
    }
}
