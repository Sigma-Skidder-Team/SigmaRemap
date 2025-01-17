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
    public Class7861 field21204;
    private String field21205;
    
    public Class4938() {
        super("Alt Manager");
        this.field21204 = Client.method35173().method35198();
        this.field21205 = "§7Idle...";
        this.method14311(false);
        final int n = 400;
        int n2 = 114;
        final int n3 = (this.method14276() - n) / 2;
        this.addVisualThing(this.field21199 = new Class4832(this, "username", n3, n2, n, 45, Class4832.field20670, "", "Username / E-Mail", ClientFonts.Default));
        n2 += 80;
        this.addVisualThing(this.field21200 = new Class4832(this, "password", n3, n2, n, 45, Class4832.field20670, "", "Password", ClientFonts.Default));
        n2 += 190;
        this.addVisualThing(this.field21201 = new Class4909(this, "login", n3, n2, n, 40, "Login", Class265.field1281.field1292));
        n2 += 50;
        this.addVisualThing(this.field21202 = new Class4909(this, "back", n3, n2, n, 40, "Back", Class265.field1281.field1292));
        n2 += 50;
        this.addVisualThing(this.field21203 = new Class4909(this, "import", n3, n2, n, 40, "Import user:pass", Class265.field1281.field1292));
        this.field21200.method14477(true);
        this.field21200.method14470("*");
        this.field21201.method14260((class4803, n) -> {
            this.field21205 = "§bLogging in...";
            new Thread(() -> {
                final Class7971 class4804 = new Class7971(this.field21199.method14314(), this.field21200.method14314());
                if (!this.field21204.method25464(class4804)) {
                    this.field21205 = "§cAlt failed!";
                }
                else {
                    this.field21204.method25459(class4804);
                    this.field21205 = "Alt added. (" + class4804.method25888() + (class4804.method25912() ? " - offline name" : "") + ")";
                }
            }).start();
        });
        this.field21202.method14260((class4803, n) -> Client.method35173().method35193().method32156(new Class4936()));
        this.field21203.method14260((class4803, n) -> {
            String glfwGetClipboardString = "";
            try {
                glfwGetClipboardString = GLFW.glfwGetClipboardString(Minecraft.method5277().field4632.method7690());
            }
            catch (final Exception ex) {}
            if (glfwGetClipboardString != "" && glfwGetClipboardString.contains(":")) {
                final String[] split = glfwGetClipboardString.split(":");
                if (split.length == 2) {
                    this.field21199.method14315(split[0].replace("\n", ""));
                    this.field21200.method14315(split[1].replace("\n", ""));
                }
            }
        });
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26905(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class9493.field40801);
        Class8154.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class6430.method19118(Class265.field1290.field1292, 0.1f));
        Class8154.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class6430.method19118(Class265.field1273.field1292, 0.95f));
        Class8154.method26890(ClientFonts.Default, (float)(this.method14276() / 2), 38.0f, "Add Alt", Class265.field1278.field1292, Class2056.field11738, Class2056.field11734);
        Class8154.method26891(ClientFonts.Default, (float)(this.method14276() / 2), 58.0f, this.field21205, Class265.field1278.field1292, Class2056.field11738, Class2056.field11734, true);
        super.method14205(n);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Client.method35173().method35193().method32156(new Class4936());
        }
    }
}
