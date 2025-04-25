// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;

import java.net.MalformedURLException;
import java.net.URL;

public class Class4939 extends Class4800
{
    public static Animation field21206;
    public static float field21207;
    public static float field21208;
    
    public Class4939() {
        super("Switch");
        this.setListening(false);
        final int n = 537;
        final int n2 = 264;
        final int n3 = 93;
        final int n4 = 61;
        final int n5 = (this.method14276() - n) / 2;
        final int n6 = (this.method14278() - n3) / 2 + 14;
        final Class4876 class4876;
        this.addToList(class4876 = new Class4876(this, "pb", n5, n6, n, n3, ClientAssets.noaddons));
        final Class4876 class4877;
        this.addToList(class4877 = new Class4876(this, "pb2", n5, n3 + n6 + 9, n2, n4, ClientAssets.sigma2));
        final Class4876 class4878;
        this.addToList(class4878 = new Class4876(this, "pb3", n5 + n2 + 9, n3 + n6 + 9, n2, n4, ClientAssets.jello));
        class4876.doThis((class4803, n) -> {
            Client.getInstance().setupClient(ClientMode.NOADDONS);
            Minecraft.getInstance().displayGuiScreen(new MainMenu());
        });
        class4878.doThis((class4803, n) -> {
            Client.getInstance().setupClient(ClientMode.JELLO);
            Minecraft.getInstance().displayGuiScreen(new MainMenu());
        });
        class4877.doThis((class4803, n) -> {
            Client.getInstance().setupClient(ClientMode.CLASSIC);
            Minecraft.getInstance().displayGuiScreen(new MainMenu());
        });
        final CustomGuiScreen class4879 = new CustomGuiScreen(this, "socialbtns", (this.method14276() - 174) / 2, this.method14278() - 70, 174, 34);
        final Class4914 class4880;
        class4879.addToList(class4880 = new Class4914(class4879, "youtube", 0, 0, 65, 34, ClientAssets.youtube));
        final Class4914 class4881;
        class4879.addToList(class4881 = new Class4914(class4879, "reddit", 85, 0, 36, 34, ClientAssets.reddit));
        final Class4914 class4882;
        class4879.addToList(class4882 = new Class4914(class4879, "guilded", 142, 0, 32, 34, ClientAssets.guilded));
        class4880.doThis((class4803, n) -> {
            try {
                Util.method27845().method976(new URL("http://jelloconnect.sigmaclient.info/urls/youtube.php"));
            }
            catch (final MalformedURLException ex) {}
        });
        class4881.doThis((class4803, n) -> {
            try {
                Util.method27845().method976(new URL("http://jelloconnect.sigmaclient.info/urls/reddit.php"));
            }
            catch (final MalformedURLException ex) {}
        });
        class4882.doThis((class4803, n) -> {
            try {
                Util.method27845().method976(new URL("http://jelloconnect.sigmaclient.info/urls/guilded.php"));
            }
            catch (final MalformedURLException ex) {}
        });
        this.addToList(class4879);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final float n3 = n - Class4939.field21207;
        final float n4 = n2 - Class4939.field21208;
        Class4939.field21207 += n3 * 0.09f;
        Class4939.field21208 += n4 * 0.09f;
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        if (Class568.field3391 != null) {
            Class4939.field21206.changeDirection(Direction.BACKWARDS);
            final int n2 = 40;
            RenderUtil.method26905(n2 * (-Class4939.field21207 / Minecraft.getInstance().window.method7694()), n2 * (-Class4939.field21208 / Minecraft.getInstance().window.method7695()), (float)(Minecraft.getInstance().window.method7694() + n2), (float)(Minecraft.getInstance().window.method7695() + n2), Class568.field3391);
            final float method31033 = MathUtils.lerp(Class4939.field21206.calcPercent(), 0.16, 0.71, 0.0, 0.99);
            final int n3 = (Minecraft.getInstance().window.method7694() - 455) / 2;
            final int n4 = (int)((Minecraft.getInstance().window.method7695() - 78) / 2 - 14 - 116.0f * method31033);
            RenderUtil.method26874(0.0f, 0.0f, (float) Minecraft.getInstance().window.method7694(), (float) Minecraft.getInstance().window.method7695(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f));
            super.draw(n);
            RenderUtil.drawImage(0.0f, 0.0f, (float) Minecraft.getInstance().window.method7694(), (float) Minecraft.getInstance().window.method7695(), Class568.field3392, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 1.0f - Class4939.field21206.calcPercent()));
            RenderUtil.method26874(0.0f, 0.0f, (float) Minecraft.getInstance().window.method7694(), (float) Minecraft.getInstance().window.method7695(), ColorUtils.applyAlpha(0, 0.75f * (1.0f - Class4939.field21206.calcPercent())));
            RenderUtil.method26905((float)n3, (float)n4, 455.0f, 78.0f, Class568.field3390);
        }
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Minecraft.getInstance().displayGuiScreen(new MainMenu());
        }
    }
    
    static {
        Class4939.field21206 = new Animation(300, 200, Direction.FORWARDS);
    }
}
