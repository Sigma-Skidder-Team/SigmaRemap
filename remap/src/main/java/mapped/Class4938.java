// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.glfw.GLFW;

public class Class4938 extends Class4800
{
    public Class4832 field21199;
    public Class4832 field21200;
    public Class4909 field21201;
    public Class4909 field21202;
    public Class4909 field21203;
    public AltManager field21204;
    private String field21205;
    
    public Class4938() {
        super("Alt Manager");
        this.field21204 = Client.getInstance().getAltManager();
        this.field21205 = "§7Idle...";
        this.setListening(false);
        final int n = 400;
        int n2 = 114;
        final int n3 = (this.method14276() - n) / 2;
        this.addToList(this.field21199 = new Class4832(this, "username", n3, n2, n, 45, Class4832.field20670, "", "Username / E-Mail", ClientFonts.Default));
        n2 += 80;
        this.addToList(this.field21200 = new Class4832(this, "password", n3, n2, n, 45, Class4832.field20670, "", "Password", ClientFonts.Default));
        n2 += 190;
        this.addToList(this.field21201 = new Class4909(this, "login", n3, n2, n, 40, "Login", ClientColors.MID_GREY.color));
        n2 += 50;
        this.addToList(this.field21202 = new Class4909(this, "back", n3, n2, n, 40, "Back", ClientColors.MID_GREY.color));
        n2 += 50;
        this.addToList(this.field21203 = new Class4909(this, "import", n3, n2, n, 40, "Import user:pass", ClientColors.MID_GREY.color));
        this.field21200.method14477(true);
        this.field21200.method14470("*");
        this.field21201.doThis((class4803, n) -> {
            this.field21205 = "§bLogging in...";
            new Thread(() -> {
                final Class7971 class4804 = new Class7971(this.field21199.getTypedText(), this.field21200.getTypedText());
                if (!this.field21204.method25464(class4804)) {
                    this.field21205 = "§cAlt failed!";
                }
                else {
                    this.field21204.method25459(class4804);
                    this.field21205 = "Alt added. (" + class4804.method25888() + (class4804.method25912() ? " - offline name" : "") + ")";
                }
            }).start();
        });
        this.field21202.doThis((class4803, n) -> Client.getInstance().getScreenManager().method32156(new Class4936()));
        this.field21203.doThis((class4803, n) -> {
            String glfwGetClipboardString = "";
            try {
                glfwGetClipboardString = GLFW.glfwGetClipboardString(Minecraft.getInstance().window.getHandle());
            }
            catch (final Exception ex) {}
            if (glfwGetClipboardString != "" && glfwGetClipboardString.contains(":")) {
                final String[] split = glfwGetClipboardString.split(":");
                if (split.length == 2) {
                    this.field21199.setTypedText(split[0].replace("\n", ""));
                    this.field21200.setTypedText(split[1].replace("\n", ""));
                }
            }
        });
    }
    
    @Override
    public void draw(final float partialTicks) {
        RenderUtil.drawImage(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), ClassicAssets.field40801);
        RenderUtil.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), AllUtils.applyAlpha(ClientColors.PALE_RED.color, 0.1f));
        RenderUtil.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.95f));
        RenderUtil.method26890(ClientFonts.Default, (float)(this.method14276() / 2), 38.0f, "Add Alt", ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11734);
        RenderUtil.method26891(ClientFonts.Default, (float)(this.method14276() / 2), 58.0f, this.field21205, ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11734, true);
        super.draw(partialTicks);
    }
    
    @Override
    public void onKeyPress(final int key) {
        super.onKeyPress(key);
        if (key == 256) {
            Client.getInstance().getScreenManager().method32156(new Class4936());
        }
    }
}
