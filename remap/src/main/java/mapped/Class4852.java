// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.settings.Setting;

public class Class4852 extends Panel
{
    private static String[] field20591;
    public final Setting field20794;
    
    public Class4852(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Setting field20794) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20794 = field20794;
    }
    
    @Override
    public void draw(final float partialTicks) {
        RenderUtil.method26876((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278()), -3618616);
        RenderUtil.drawString(ClassicAssets.field40808, (float)(this.method14272() + 5), (float)(this.method14274() - 2), this.field20794.method15205(), -14540254);
    }
}
