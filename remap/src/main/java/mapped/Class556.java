// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class556 extends Screen
{
    private final Class9103 field3335;
    
    public Class556() {
        super(NarratorChatListener.EMPTY);
        this.field3335 = Class9203.method33675();
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (this.field3335 == null) {
            this.renderDirtBackground(0);
        }
        else {
            this.field3335.method32901(this.width, this.height);
        }
        this.drawCenteredString(this.font, Class8822.method30773("multiplayer.downloadingTerrain"), this.width / 2, this.height / 2 - 50, 16777215);
        super.render(n, n2, n3);
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
}
