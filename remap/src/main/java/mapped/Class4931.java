// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.glfw.GLFW;

public class Class4931 extends Class4800
{
    public Class4832 field21115;
    public Class4832 field21116;
    public Class4909 field21117;
    public Class4909 field21118;
    public Class4909 field21119;
    public AltManager field21120;
    private String field21121;
    
    public Class4931() {
        super("Alt Manager");
        this.field21120 = Client.getInstance().getAltManager();
        this.field21121 = "§7Idle...";
        this.setListening(false);
        final int n = 400;
        int n2 = 114;
        final int n3 = (this.method14276() - n) / 2;
        this.addToList(this.field21115 = new Class4832(this, "username", n3, n2, n, 45, Class4832.field20670, "", "Username / E-Mail", ClientFonts.Default));
        n2 += 80;
        this.addToList(this.field21116 = new Class4832(this, "password", n3, n2, n, 45, Class4832.field20670, "", "Password", ClientFonts.Default));
        n2 += 190;
        this.addToList(this.field21117 = new Class4909(this, "login", n3, n2, n, 40, "Login", ClientColors.MID_GREY.color));
        n2 += 50;
        this.addToList(this.field21118 = new Class4909(this, "back", n3, n2, n, 40, "Back", ClientColors.MID_GREY.color));
        n2 += 50;
        this.addToList(this.field21119 = new Class4909(this, "import", n3, n2, n, 40, "Import user:pass", ClientColors.MID_GREY.color));
        this.field21116.method14477(true);
        this.field21116.method14470("*");
        this.field21117.doThis((class4803, n) -> {
            this.field21121 = "§bLogging in...";
            new Thread(() -> {
                final Class7971 class4804 = new Class7971(this.field21115.getTypedText(), this.field21116.getTypedText());
                if (!this.field21120.method25463(class4804)) {
                    this.field21121 = "§cLogin failed!";
                }
                else {
                    this.field21121 = "Logged in. (" + class4804.method25888() + (class4804.method25912() ? " - offline name" : "") + ")";
                }
            }).start();
        });
        this.field21118.doThis((class4803, n) -> Client.getInstance().getScreenManager().method32156(new Class4936()));
        this.field21119.doThis((class4803, n) -> {
            String glfwGetClipboardString = "";
            try {
                glfwGetClipboardString = GLFW.glfwGetClipboardString(Minecraft.getInstance().window.getHandle());
            }
            catch (final Exception ex) {}
            if (glfwGetClipboardString != "" && glfwGetClipboardString.contains(":")) {
                final String[] split = glfwGetClipboardString.split(":");
                if (split.length == 2) {
                    this.field21115.setTypedText(split[0].replace("\n", ""));
                    this.field21116.setTypedText(split[1].replace("\n", ""));
                }
            }
        });
    }
    
    @Override
    public void draw(final float partialTicks) {
        RenderUtil.drawImage(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), ClassicAssets.field40801);
        RenderUtil.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), AllUtils.applyAlpha(ClientColors.PALE_RED.color, 0.1f));
        RenderUtil.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.95f));
        RenderUtil.method26890(ClientFonts.Default, (float)(this.method14276() / 2), 38.0f, "Add Login", ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11734);
        RenderUtil.method26891(ClientFonts.Default, (float)(this.method14276() / 2), 58.0f, this.field21121, ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11734, true);
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
