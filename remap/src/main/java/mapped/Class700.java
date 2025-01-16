// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.glfw.GLFW;
import java.util.List;

public class Class700 extends Class698
{
    private Class606 field3849;
    private static Class6469[] field3850;
    private int field3851;
    private Screen field3852;
    private Class5760 field3853;
    private static Class6469[] field3854;
    private Class8297 field3855;
    private List<Widget> field3856;
    private Widget field3857;
    private Class5760 field3858;
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        final int field23473 = this.field3858.field23473;
        if (!super.mouseClicked(n, n2, n3)) {
            return false;
        }
        if (this.field3858.field23473 != field23473) {
            this.minecraft.method5248();
        }
        return true;
    }
    
    public Class700(final Screen field3852, final Class5760 field3853) {
        super(new Class2259("options.videoTitle", new Object[0]));
        this.field3855 = new Class8297(this, new Class7298());
        this.field3856 = this.buttons;
        this.field3858 = Minecraft.method5277().gameSettings;
        this.field3852 = field3852;
        this.field3853 = field3853;
    }
    
    @Override
    public void init() {
        this.field3856.clear();
        for (int i = 0; i < Class700.field3854.length; ++i) {
            final Class6469 class6469 = Class700.field3854[i];
            if (class6469 != null) {
                final Widget method3029 = this.addButton(class6469.method19362(this.minecraft.gameSettings, this.width / 2 - 155 + i % 2 * 160, this.height / 6 + 21 * (i / 2) - 12, 150));
                if (class6469 == Class6469.field25724) {
                    this.field3857 = method3029;
                }
            }
        }
        final int n = this.height / 6 + 21 * (Class700.field3854.length / 2) - 12;
        this.addButton(new Class678(231, this.width / 2 - 155 + 0, n, Class4647.method13876("of.options.shaders")));
        this.addButton(new Class678(202, this.width / 2 - 155 + 160, n, Class4647.method13876("of.options.quality")));
        final int n2 = n + 21;
        this.addButton(new Class678(201, this.width / 2 - 155 + 0, n2, Class4647.method13876("of.options.details")));
        this.addButton(new Class678(212, this.width / 2 - 155 + 160, n2, Class4647.method13876("of.options.performance")));
        final int n3 = n2 + 21;
        this.addButton(new Class678(211, this.width / 2 - 155 + 0, n3, Class4647.method13876("of.options.animations")));
        this.addButton(new Class678(222, this.width / 2 - 155 + 160, n3, Class4647.method13876("of.options.other")));
        this.addButton(new Class673(200, this.width / 2 - 100, this.height / 6 + 168 + 11, Class8822.method30773("gui.done", new Object[0])));
    }
    
    @Override
    public void method3896(final Widget class573) {
        if (class573 == this.field3857) {
            this.method3899();
        }
        if (class573 instanceof Class673) {
            this.method3900((Class673)class573, 1);
        }
    }
    
    @Override
    public void method3897(final Widget class573) {
        if (class573 == this.field3857) {
            Class6469.field25724.method19485(this.field3853, -1);
            this.method3899();
        }
    }
    
    private void method3899() {
        this.minecraft.method5248();
        final Class1925 method5332 = this.minecraft.method5332();
        final int method5333 = Class9563.method35784(this.field3857);
        final int method5334 = Class9563.method35785(this.field3857);
        GLFW.glfwSetCursorPos(method5332.method7690(), (this.field3857.field3426 + (method5333 - method5334)) * method5332.method7700(), (this.field3857.field3427 + method5334 / 2) * method5332.method7700());
    }
    
    private void method3900(final Class673 class673, final int n) {
        if (class673.field3431) {
            if (class673.field3708 == 200) {
                this.minecraft.gameSettings.method17121();
                this.minecraft.displayGuiScreen(this.field3852);
            }
            if (class673.field3708 == 201) {
                this.minecraft.gameSettings.method17121();
                this.minecraft.displayGuiScreen(new Class699(this, this.field3853));
            }
            if (class673.field3708 == 202) {
                this.minecraft.gameSettings.method17121();
                this.minecraft.displayGuiScreen(new Class714(this, this.field3853));
            }
            if (class673.field3708 == 211) {
                this.minecraft.gameSettings.method17121();
                this.minecraft.displayGuiScreen(new Class712(this, this.field3853));
            }
            if (class673.field3708 == 212) {
                this.minecraft.gameSettings.method17121();
                this.minecraft.displayGuiScreen(new Class717(this, this.field3853));
            }
            if (class673.field3708 == 222) {
                this.minecraft.gameSettings.method17121();
                this.minecraft.displayGuiScreen(new Class701(this, this.field3853));
            }
            if (class673.field3708 == 231) {
                if (Config.method28926() || Config.method28927()) {
                    Config.method28996(Class4647.method13876("of.message.shaders.aa1"), Class4647.method13876("of.message.shaders.aa2"));
                    return;
                }
                if (Config.method28924()) {
                    Config.method28996(Class4647.method13876("of.message.shaders.af1"), Class4647.method13876("of.message.shaders.af2"));
                    return;
                }
                if (Config.method28953()) {
                    Config.method28996(Class4647.method13876("of.message.shaders.fr1"), Class4647.method13876("of.message.shaders.fr2"));
                    return;
                }
                this.minecraft.gameSettings.method17121();
                this.minecraft.displayGuiScreen(new Class716(this, this.field3853));
            }
        }
    }
    
    @Override
    public void removed() {
        this.minecraft.gameSettings.method17121();
        super.removed();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.minecraft.fontRenderer, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        String method28814 = Config.method28814();
        final String s = "HD_U";
        if (s.equals("HD")) {
            method28814 = "OptiFine HD G1_pre18";
        }
        if (s.equals("HD_U")) {
            method28814 = "OptiFine HD G1_pre18 Ultra";
        }
        if (s.equals("L")) {
            method28814 = "OptiFine G1_pre18 Light";
        }
        this.drawString(this.minecraft.fontRenderer, method28814, 2, this.height - 10, 8421504);
        final String s2 = "Minecraft 1.15.2";
        this.drawString(this.minecraft.fontRenderer, s2, this.width - this.minecraft.fontRenderer.getStringWidth(s2) - 2, this.height - 10, 8421504);
        super.render(n, n2, n3);
        this.field3855.method27577(n, n2, this.field3856);
    }
    
    public static String method3901(final Class535 class535) {
        return class535.field3192.method3378();
    }
    
    static {
        Class700.field3854 = new Class6469[] { Class6469.field25723, Class6469.field25717, Class6469.field25720, Class6469.field25712, Class6469.field25762, Class6469.field25748, Class6469.field25724, Class6469.field25822, Class6469.field25713, Class6469.field25721, Class6469.field25811, Class6469.field25810 };
    }
}
