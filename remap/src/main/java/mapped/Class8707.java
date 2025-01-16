// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import org.lwjgl.opengl.GL11;
import java.io.IOException;
import com.google.gson.JsonSyntaxException;

public class Class8707
{
    private static Minecraft field36586;
    private static Class1884 field36587;
    public static Class6153 field36588;
    public static Class6153 field36589;
    public static int field36590;
    public static int field36591;
    public static int field36592;
    public static int field36593;
    
    public void method29895() {
        Client.method35173().method35188().method21094(this);
    }
    
    public static void method29896(final int a, final int a2, final int n, final int n2) {
        Class8707.field36590 = Math.min(a, Class8707.field36590);
        Class8707.field36591 = Math.min(a2, Class8707.field36591);
        Class8707.field36592 = Math.max(a + n, Class8707.field36592);
        Class8707.field36593 = Math.max(a2 + n2, Class8707.field36593);
    }
    
    @EventListener
    public void method29897(final Class5723 class5723) {
        if (class5723.method16998() instanceof Class4284) {
            Class6430.method19172();
        }
    }
    
    @EventListener
    @Class6755
    public void method29898(final Class5739 class5739) {
        if (Client.method35173().method35193().method32146() && Class8707.field36590 < Class8707.field36592 && Class8707.field36591 < Class8707.field36593) {
            if (Class8707.field36588 == null) {
                try {
                    (Class8707.field36587 = new Class1884(Class8707.field36586.method5290(), new Class6584(), Class8707.field36586.method5234(), new ResourceLocation("jelloblur"))).method7246(Class8707.field36586.field4667.field24886, Class8707.field36586.field4667.field24887);
                    Class8707.field36587.field10255.get(0).method7605().method7715("Radius").method7163(35.0f);
                    Class8707.field36587.field10255.get(1).method7605().method7715("Radius").method7163(35.0f);
                    Class8707.field36588 = Class8707.field36587.method7249("jello");
                    Class8707.field36589 = Class8707.field36587.method7249("jelloswap");
                }
                catch (final JsonSyntaxException | IOException ex) {
                    ((Throwable)ex).printStackTrace();
                }
            }
            if (Class8707.field36588.field24887 != Class8707.field36586.field4667.field24887 || Class8707.field36588.field24886 != Class8707.field36586.field4667.field24886) {
                Class8707.field36587.method7246(Class8707.field36586.field4667.field24886, Class8707.field36586.field4667.field24887);
            }
            RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
            RenderSystem.enableBlend();
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            RenderSystem.disableBlend();
            Class8707.field36588.method18402(true);
            Class8707.field36589.method18402(true);
            RenderSystem.method30056(256, Minecraft.field4623);
            RenderSystem.method30057(5889);
            RenderSystem.method30058();
            RenderSystem.method30061(0.0, Class8707.field36586.field4632.method7692() / Class8707.field36586.field4632.method7700(), Class8707.field36586.field4632.method7693() / Class8707.field36586.field4632.method7700(), 0.0, 1000.0, 3000.0);
            RenderSystem.method30057(5888);
            RenderSystem.method30058();
            RenderSystem.method30065(0.0f, 0.0f, -2000.0f);
            GL11.glScaled(1.0 / Class8707.field36586.field4632.method7700() * Class9000.field37993, 1.0 / Class8707.field36586.field4632.method7700() * Class9000.field37993, 1.0);
            final int n = 35;
            Class8154.method26870(Class8707.field36590, Class8707.field36591 - n, Class8707.field36592, Class8707.field36593 + n);
            Class8707.field36587.method7247(Class8707.field36586.timer.field26528);
            Class8154.method26872();
            GL11.glEnable(3008);
            Class8707.field36588.method18395(true);
            Class8707.field36586.field4667.method18395(true);
        }
        Class8707.field36590 = Class8707.field36586.field4667.field24886;
        Class8707.field36591 = Class8707.field36586.field4667.field24887;
        Class8707.field36592 = 0;
        Class8707.field36593 = 0;
    }
    
    public static void method29899() {
        if (Class8707.field36588 != null) {
            GL11.glPushMatrix();
            Class8707.field36588.method18393();
            Class8707.field36588.method18399(Class8707.field36586.field4667.field24886, Class8707.field36586.field4667.field24887);
            GL11.glPopMatrix();
            RenderSystem.method30056(256, Minecraft.field4623);
            RenderSystem.method30057(5889);
            RenderSystem.method30058();
            RenderSystem.method30061(0.0, Class8707.field36586.field4632.method7692() / Class8707.field36586.field4632.method7700(), Class8707.field36586.field4632.method7693() / Class8707.field36586.field4632.method7700(), 0.0, 1000.0, 3000.0);
            RenderSystem.method30057(5888);
            RenderSystem.method30058();
            RenderSystem.method30065(0.0f, 0.0f, -2000.0f);
            GL11.glScaled(1.0 / Class8707.field36586.field4632.method7700() * Class9000.field37993, 1.0 / Class8707.field36586.field4632.method7700() * Class9000.field37993, 1.0);
            Class8707.field36586.field4667.method18395(true);
        }
    }
    
    static {
        Class8707.field36586 = Minecraft.method5277();
        Class8707.field36590 = Class8707.field36586.field4667.field24886;
        Class8707.field36591 = Class8707.field36586.field4667.field24887;
        Class8707.field36592 = 0;
        Class8707.field36593 = 0;
    }
}
