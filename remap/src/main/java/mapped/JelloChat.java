// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.auth.agora.PlayerInfo;
import com.mentalfrostbyte.jello.util.system.network.ImageUtil;
import org.newdawn.slick.Texture;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public class JelloChat extends Class4800 {
    private static Minecraft mc;
    private float field21104;
    private final JelloChatInput chat;
    private final ScrollablePane scrollablePane;
    private final JelloChatMessages messages;
    private final int field21108;
    private int field21109;
    private final int field21110;
    private final int field21111;
    private final int field21112;
    public boolean field21113;
    private Texture blur;

    public JelloChat() {
        super("JelloChat");
        this.field21108 = 20;
        this.field21109 = 642;
        this.field21110 = 410;
        this.field21111 = 55;
        this.field21112 = 200;
        this.field21113 = true;
        this.addToList(this.chat = new JelloChatInput(this, "input", this.field21108, this.method14278() - this.field21111 - this.field21108, this.field21109, this.field21111));
        this.addToList(this.scrollablePane = new ScrollablePane(this, "navbar", this.field21108, this.method14278() - this.field21111 - this.field21108 * 2 - this.field21110 + 80, this.field21112, this.field21110 - 90));
        this.addToList(this.messages = new JelloChatMessages(this, "chatView", this.field21108 + this.field21112, this.method14278() - this.field21111 - this.field21108 * 2 - this.field21110, this.field21109 - this.field21112, this.field21110));
        System.out.println("loading");
        for (final Map.Entry<UUID, PlayerInfo> entry : Client.getInstance().getNetworkManager().irc.getPlayerInfoMap().entrySet()) {
            System.out.println("added " + entry.getValue().accountId);
            this.scrollablePane.addToList(new IRCMessage(this.scrollablePane, entry.getValue().uuidString + "_" + this.scrollablePane.method14250().size(), 0, 0, this.scrollablePane.method14276(), 55, entry.getValue().username, entry.getValue().tag));
        }
    }

    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.setListening(false);
        this.field21109 = 642;
        this.chat.method14277(this.field21109);
    }

    @Override
    public int getFPS() {
        return 60;
    }

    public void method14804(final String s) {
        this.messages.method14522(s);
    }

    @Override
    public void onKeyPress(final int key) {
        super.onKeyPress(key);

        if (key == 256) {
            JelloChat.mc.displayGuiScreen(null);
        }
    }

    @Override
    public void draw(float partialTicks) {
        this.field21104 = Math.min(1.0f, this.field21104 + 0.1f);
        this.chat.drawBackground(this.field21111 + this.field21108 - (int) (Class7707.method24584(this.field21104, 0.0f, 1.0f, 1.0f) * (this.field21111 + this.field21108)));
        this.drawBackground((int) ((1.0f - this.field21104) * 10.0f));
        this.translate();
        final int field21108 = this.field21108;
        final int n = this.method14278() - this.field21111 - this.field21108 * 2 - 410;
        final int field21109 = this.field21109;
        final int field21110 = this.field21110;
        try {
            if (this.field21113) {
                this.blur = BufferedImageUtil.getTexture("blur", ImageUtil.method20836(ImageUtil.method20830(field21108, n, 200, field21110, 10, 14, 0, true), 0.0f, 1.1f, 1.3f));
            }
        } catch (final IOException ex) {
            ex.printStackTrace();
        }
        this.field21113 = !this.field21113;
        partialTicks = Class7791.method25031(this.field21104, 0.0f, 1.0f, 1.0f);
        RenderUtil.method26913((float) (field21108 + 5), (float) (n + 5), (float) (this.field21112 - 10), (float) (field21110 - 10), 25.0f, partialTicks * 0.4f);
        RenderUtil.method26921((float) field21108, (float) n, (float) field21109, (float) field21110, 10.0f);
        if (this.blur != null) {
            RenderUtil.drawImage((float) field21108, (float) n, (float) this.field21112, (float) field21110, this.blur, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        }
        RenderUtil.method26876((float) field21108, (float) n, (float) (field21108 + this.field21112), (float) (n + 80), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.14f));
        RenderUtil.method26928();
        RenderUtil.method26870(field21108 + this.field21112, n - this.field21108, field21108 + field21109 + this.field21108, n + field21110 + this.field21108);
        RenderUtil.draw(field21108, n, field21109, field21110, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        RenderUtil.endScissor();
        RenderUtil.method26870(field21108 - this.field21108, n - this.field21108, field21108 + this.field21112, n + field21110 + this.field21108);
        RenderUtil.draw(field21108, n, field21109, field21110, AllUtils.applyAlpha(-2236963, partialTicks * 0.75f));
        RenderUtil.method26876((float) (field21108 + this.field21112 - 1), (float) n, (float) (field21108 + this.field21112), (float) (n + field21110), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.05f));
        RenderUtil.endScissor();
        super.draw(partialTicks);
    }

    static {
        JelloChat.mc = Minecraft.getInstance();
    }
}
