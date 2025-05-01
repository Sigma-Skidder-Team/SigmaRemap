// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

import com.google.gson.JsonSyntaxException;

public class BlurManager {
    private static Minecraft field36586;
    private static Class1884 field36587;
    public static Class6153 field36588;
    public static Class6153 field36589;
    public static int field36590;
    public static int field36591;
    public static int field36592;
    public static int field36593;

    public void method29895() {
        Client.getInstance().getEventBus().registerInstance(this);
    }

    public static void method29896(final int a, final int a2, final int n, final int n2) {
        BlurManager.field36590 = Math.min(a, BlurManager.field36590);
        BlurManager.field36591 = Math.min(a2, BlurManager.field36591);
        BlurManager.field36592 = Math.max(a + n, BlurManager.field36592);
        BlurManager.field36593 = Math.max(a2 + n2, BlurManager.field36593);
    }

    @EventListener
    public void method29897(final EventReceivePacket eventReceivePacket) {
        if (eventReceivePacket.getPacket() instanceof Class4284) {
            AllUtils.method19172();
        }
    }

    @EventListener
    @LowestPriority
    public void method29898(final Custom3DRenderEvent custom3DRenderEvent) {
        if (Client.getInstance().getScreenManager().method32146() && BlurManager.field36590 < BlurManager.field36592 && BlurManager.field36591 < BlurManager.field36593) {
            if (BlurManager.field36588 == null) {
                try {
                    (BlurManager.field36587 = new Class1884(BlurManager.field36586.method5290(), new Class6584(), BlurManager.field36586.method5234(), new ResourceLocation("jelloblur"))).method7246(BlurManager.field36586.field4667.field24886, BlurManager.field36586.field4667.field24887);
                    BlurManager.field36587.field10255.get(0).method7605().method7715("Radius").method7163(35.0f);
                    BlurManager.field36587.field10255.get(1).method7605().method7715("Radius").method7163(35.0f);
                    BlurManager.field36588 = BlurManager.field36587.method7249("jello");
                    BlurManager.field36589 = BlurManager.field36587.method7249("jelloswap");
                } catch (final JsonSyntaxException | IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (BlurManager.field36588.field24887 != BlurManager.field36586.field4667.field24887 || BlurManager.field36588.field24886 != BlurManager.field36586.field4667.field24886) {
                BlurManager.field36587.method7246(BlurManager.field36586.field4667.field24886, BlurManager.field36586.field4667.field24887);
            }
            RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
            RenderSystem.enableBlend();
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            RenderSystem.disableBlend();
            BlurManager.field36588.method18402(true);
            BlurManager.field36589.method18402(true);
            RenderSystem.method30056(256, Minecraft.field4623);
            RenderSystem.method30057(5889);
            RenderSystem.method30058();
            RenderSystem.method30061(0.0, BlurManager.field36586.window.method7692() / BlurManager.field36586.window.getGuiScaleFactor(), BlurManager.field36586.window.method7693() / BlurManager.field36586.window.getGuiScaleFactor(), 0.0, 1000.0, 3000.0);
            RenderSystem.method30057(5888);
            RenderSystem.method30058();
            RenderSystem.translatef(0.0f, 0.0f, -2000.0f);
            GL11.glScaled(1.0 / BlurManager.field36586.window.getGuiScaleFactor() * ScreenManager.guiScale, 1.0 / BlurManager.field36586.window.getGuiScaleFactor() * ScreenManager.guiScale, 1.0);
            final int n = 35;
            RenderUtil.method26870(BlurManager.field36590, BlurManager.field36591 - n, BlurManager.field36592, BlurManager.field36593 + n);
            BlurManager.field36587.method7247(BlurManager.field36586.timer.field26528);
            RenderUtil.endScissor();
            GL11.glEnable(3008);
            BlurManager.field36588.method18395(true);
            BlurManager.field36586.field4667.method18395(true);
        }
        BlurManager.field36590 = BlurManager.field36586.field4667.field24886;
        BlurManager.field36591 = BlurManager.field36586.field4667.field24887;
        BlurManager.field36592 = 0;
        BlurManager.field36593 = 0;
    }

    public static void method29899() {
        if (BlurManager.field36588 != null) {
            GL11.glPushMatrix();
            BlurManager.field36588.method18393();
            BlurManager.field36588.method18399(BlurManager.field36586.field4667.field24886, BlurManager.field36586.field4667.field24887);
            GL11.glPopMatrix();
            RenderSystem.method30056(256, Minecraft.field4623);
            RenderSystem.method30057(5889);
            RenderSystem.method30058();
            RenderSystem.method30061(0.0, BlurManager.field36586.window.method7692() / BlurManager.field36586.window.getGuiScaleFactor(), BlurManager.field36586.window.method7693() / BlurManager.field36586.window.getGuiScaleFactor(), 0.0, 1000.0, 3000.0);
            RenderSystem.method30057(5888);
            RenderSystem.method30058();
            RenderSystem.translatef(0.0f, 0.0f, -2000.0f);
            GL11.glScaled(1.0 / BlurManager.field36586.window.getGuiScaleFactor() * ScreenManager.guiScale, 1.0 / BlurManager.field36586.window.getGuiScaleFactor() * ScreenManager.guiScale, 1.0);
            BlurManager.field36586.field4667.method18395(true);
        }
    }

    static {
        BlurManager.field36586 = Minecraft.getInstance();
        BlurManager.field36590 = BlurManager.field36586.field4667.field24886;
        BlurManager.field36591 = BlurManager.field36586.field4667.field24887;
        BlurManager.field36592 = 0;
        BlurManager.field36593 = 0;
    }
}
