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
    private Class527 field3852;
    private Class5760 field3853;
    private static Class6469[] field3854;
    private Class8297 field3855;
    private List<Class573> field3856;
    private Class573 field3857;
    private Class5760 field3858;
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        final int field23473 = this.field3858.field23473;
        if (!super.method2982(n, n2, n3)) {
            return false;
        }
        if (this.field3858.field23473 != field23473) {
            this.field3150.method5248();
        }
        return true;
    }
    
    public Class700(final Class527 field3852, final Class5760 field3853) {
        super(new Class2259("options.videoTitle", new Object[0]));
        this.field3855 = new Class8297(this, new Class7298());
        this.field3856 = this.field3154;
        this.field3858 = Class869.method5277().field4648;
        this.field3852 = field3852;
        this.field3853 = field3853;
    }
    
    @Override
    public void method2969() {
        this.field3856.clear();
        for (int i = 0; i < Class700.field3854.length; ++i) {
            final Class6469 class6469 = Class700.field3854[i];
            if (class6469 != null) {
                final Class573 method3029 = this.method3029(class6469.method19362(this.field3150.field4648, this.field3152 / 2 - 155 + i % 2 * 160, this.field3153 / 6 + 21 * (i / 2) - 12, 150));
                if (class6469 == Class6469.field25724) {
                    this.field3857 = method3029;
                }
            }
        }
        final int n = this.field3153 / 6 + 21 * (Class700.field3854.length / 2) - 12;
        this.method3029(new Class678(231, this.field3152 / 2 - 155 + 0, n, Class4647.method13876("of.options.shaders")));
        this.method3029(new Class678(202, this.field3152 / 2 - 155 + 160, n, Class4647.method13876("of.options.quality")));
        final int n2 = n + 21;
        this.method3029(new Class678(201, this.field3152 / 2 - 155 + 0, n2, Class4647.method13876("of.options.details")));
        this.method3029(new Class678(212, this.field3152 / 2 - 155 + 160, n2, Class4647.method13876("of.options.performance")));
        final int n3 = n2 + 21;
        this.method3029(new Class678(211, this.field3152 / 2 - 155 + 0, n3, Class4647.method13876("of.options.animations")));
        this.method3029(new Class678(222, this.field3152 / 2 - 155 + 160, n3, Class4647.method13876("of.options.other")));
        this.method3029(new Class673(200, this.field3152 / 2 - 100, this.field3153 / 6 + 168 + 11, Class8822.method30773("gui.done", new Object[0])));
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573 == this.field3857) {
            this.method3899();
        }
        if (class573 instanceof Class673) {
            this.method3900((Class673)class573, 1);
        }
    }
    
    @Override
    public void method3897(final Class573 class573) {
        if (class573 == this.field3857) {
            Class6469.field25724.method19485(this.field3853, -1);
            this.method3899();
        }
    }
    
    private void method3899() {
        this.field3150.method5248();
        final Class1925 method5332 = this.field3150.method5332();
        final int method5333 = Class9563.method35784(this.field3857);
        final int method5334 = Class9563.method35785(this.field3857);
        GLFW.glfwSetCursorPos(method5332.method7690(), (this.field3857.field3426 + (method5333 - method5334)) * method5332.method7700(), (this.field3857.field3427 + method5334 / 2) * method5332.method7700());
    }
    
    private void method3900(final Class673 class673, final int n) {
        if (class673.field3431) {
            if (class673.field3708 == 200) {
                this.field3150.field4648.method17121();
                this.field3150.method5244(this.field3852);
            }
            if (class673.field3708 == 201) {
                this.field3150.field4648.method17121();
                this.field3150.method5244(new Class699(this, this.field3853));
            }
            if (class673.field3708 == 202) {
                this.field3150.field4648.method17121();
                this.field3150.method5244(new Class714(this, this.field3853));
            }
            if (class673.field3708 == 211) {
                this.field3150.field4648.method17121();
                this.field3150.method5244(new Class712(this, this.field3853));
            }
            if (class673.field3708 == 212) {
                this.field3150.field4648.method17121();
                this.field3150.method5244(new Class717(this, this.field3853));
            }
            if (class673.field3708 == 222) {
                this.field3150.field4648.method17121();
                this.field3150.method5244(new Class701(this, this.field3853));
            }
            if (class673.field3708 == 231) {
                if (Class8571.method28926() || Class8571.method28927()) {
                    Class8571.method28996(Class4647.method13876("of.message.shaders.aa1"), Class4647.method13876("of.message.shaders.aa2"));
                    return;
                }
                if (Class8571.method28924()) {
                    Class8571.method28996(Class4647.method13876("of.message.shaders.af1"), Class4647.method13876("of.message.shaders.af2"));
                    return;
                }
                if (Class8571.method28953()) {
                    Class8571.method28996(Class4647.method13876("of.message.shaders.fr1"), Class4647.method13876("of.message.shaders.fr2"));
                    return;
                }
                this.field3150.field4648.method17121();
                this.field3150.method5244(new Class716(this, this.field3853));
            }
        }
    }
    
    @Override
    public void method2971() {
        this.field3150.field4648.method17121();
        super.method2971();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3150.field4643, this.field3148.getFormattedText(), this.field3152 / 2, 15, 16777215);
        String method28814 = Class8571.method28814();
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
        this.method3297(this.field3150.field4643, method28814, 2, this.field3153 - 10, 8421504);
        final String s2 = "Minecraft 1.15.2";
        this.method3297(this.field3150.field4643, s2, this.field3152 - this.field3150.field4643.method6617(s2) - 2, this.field3153 - 10, 8421504);
        super.method2975(n, n2, n3);
        this.field3855.method27577(n, n2, this.field3856);
    }
    
    public static String method3901(final Class535 class535) {
        return class535.field3192.method3378();
    }
    
    static {
        Class700.field3854 = new Class6469[] { Class6469.field25723, Class6469.field25717, Class6469.field25720, Class6469.field25712, Class6469.field25762, Class6469.field25748, Class6469.field25724, Class6469.field25822, Class6469.field25713, Class6469.field25721, Class6469.field25811, Class6469.field25810 };
    }
}
