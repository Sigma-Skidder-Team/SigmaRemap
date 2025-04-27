// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4900 extends Panel
{
    public TextField field20956;
    
    public Class4900(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, ColorHelper.field25964, "", false);
        this.field20496 = ClientFonts.JelloLight20;
        this.addToList(this.field20956 = new TextField(this, "chat", 14, 0, n3 - 28, n4, TextField.field20670, "", "Chat..."));
        this.field20956.method14478(false);
        this.field20956.setFont(ClientFonts.JelloLight20);
        this.field20956.method14307(true);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        super.method14228();
        RenderUtil.method26917(this.x, this.y, this.field20480, this.field20481, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        super.draw(n);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 257) {
            ((JelloChat)this.getParent()).method14804(this.field20956.getTypedText());
            Client.getInstance().getNetworkManager().IRCManager.sendMessage("SF4FSERFERF", this.field20956.getTypedText());
            this.field20956.setTypedText("");
            this.field20956.method14307(true);
        }
    }
}
