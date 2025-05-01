// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;

public class JelloChatInput extends Panel {
    public TextField message;

    public JelloChatInput(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, ColorHelper.field25964, "", false);
        this.field20496 = ClientFonts.JelloLight20;
        this.addToList(this.message = new TextField(this, "chat", 14, 0, n3 - 28, n4, TextField.field20670, "", "Chat..."));
        this.message.method14478(false);
        this.message.setFont(ClientFonts.JelloLight20);
        this.message.method14307(true);
    }

    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }

    @Override
    public void draw(final float partialTicks) {
        super.translate();
        RenderUtil.draw(this.x, this.y, this.field20480, this.field20481, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        super.draw(partialTicks);
    }

    @Override
    public void onKeyPress(final int key) {
        super.onKeyPress(key);
        if (key == 257) {
            ((JelloChat) this.getParent()).method14804(this.message.getTypedText());
            Client.getInstance().getNetworkManager().irc.sendMessage("SF4FSERFERF", this.message.getTypedText());
            this.message.setTypedText("");
            this.message.method14307(true);
        }
    }
}
