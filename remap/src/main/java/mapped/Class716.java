// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.URI;
import java.io.File;
import java.io.IOException;

public class Class716 extends Class698
{
    public Class527 field3910;
    private Class8297 field3911;
    private int field3912;
    private Class603 field3913;
    private boolean field3914;
    private static float[] field3915;
    private static String[] field3916;
    private static float[] field3917;
    private static String[] field3918;
    public static final int field3919 = 0;
    public static final int field3920 = 1;
    public static final int field3921 = 2;
    public static final int field3922 = 3;
    public static final int field3923 = 4;
    
    public Class716(final Class527 field3910, final Class5760 class5760) {
        super(new StringTextComponent(Class8822.method30773("of.options.shadersTitle", new Object[0])));
        this.field3911 = new Class8297(this, new Class7301());
        this.field3912 = -1;
        this.field3914 = false;
        this.field3910 = field3910;
    }
    
    @Override
    public void method2969() {
        if (Class9216.field39294 == null) {
            Class9216.method33703();
        }
        final int n = 120;
        final int n2 = 20;
        final int n3 = this.field3152 - n - 10;
        final int n4 = 30;
        final int n5 = 20;
        final int n6 = this.field3152 - n - 20;
        this.field3913 = new Class603(this, n6, this.field3153, n4, this.field3153 - 50, 16);
        this.field3149.add(this.field3913);
        this.method3029(new Class677(Class2222.field13663, n3, 0 * n5 + n4, n, n2));
        this.method3029(new Class677(Class2222.field13664, n3, 1 * n5 + n4, n, n2));
        this.method3029(new Class677(Class2222.field13665, n3, 2 * n5 + n4, n, n2));
        this.method3029(new Class677(Class2222.field13666, n3, 3 * n5 + n4, n, n2));
        this.method3029(new Class677(Class2222.field13667, n3, 4 * n5 + n4, n, n2));
        this.method3029(new Class677(Class2222.field13668, n3, 5 * n5 + n4, n, n2));
        this.method3029(new Class677(Class2222.field13670, n3, 6 * n5 + n4, n, n2));
        this.method3029(new Class677(Class2222.field13671, n3, 7 * n5 + n4, n, n2));
        final int min = Math.min(150, n6 / 2 - 10);
        final int n7 = n6 / 4 - min / 2;
        final int n8 = this.field3153 - 25;
        this.method3029(new Class673(201, n7, n8, min - 22 + 1, n2, Class4647.method13876("of.options.shaders.shadersFolder")));
        this.method3029(new Class676(210, n7 + min - 22 - 1, n8));
        this.method3029(new Class673(202, n6 / 4 * 3 - min / 2, this.field3153 - 25, min, n2, Class8822.method30773("gui.done", new Object[0])));
        this.method3029(new Class673(203, n3, this.field3153 - 25, n, n2, Class4647.method13876("of.options.shaders.shaderOptions")));
        this.method3470(this.field3913);
        this.method3934();
    }
    
    public void method3934() {
        final boolean method28955 = Config.method28955();
        for (final Class573 class573 : this.field3842) {
            if (!(class573 instanceof Class673)) {
                continue;
            }
            final Class673 class574 = (Class673)class573;
            if (class574.field3708 == 201) {
                continue;
            }
            if (class574.field3708 == 202) {
                continue;
            }
            if (class574.field3708 == 210) {
                continue;
            }
            if (class574.field3708 == Class2222.field13663.ordinal()) {
                continue;
            }
            class574.field3431 = method28955;
        }
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573.field3431) {
            if (!(class573 instanceof Class677)) {
                if (class573 instanceof Class673) {
                    switch (((Class673)class573).field3708) {
                        case 201: {
                            switch (method3942()) {
                                case 1: {
                                    final String format = String.format("cmd.exe /C start \"Open file\" \"%s\"", Class9216.field39331.getAbsolutePath());
                                    try {
                                        Runtime.getRuntime().exec(format);
                                        return;
                                    }
                                    catch (final IOException ex) {
                                        ex.printStackTrace();
                                        break;
                                    }
                                }
                                case 2: {
                                    try {
                                        Runtime.getRuntime().exec(new String[] { "/usr/bin/open", Class9216.field39331.getAbsolutePath() });
                                        return;
                                    }
                                    catch (final IOException ex2) {
                                        ex2.printStackTrace();
                                    }
                                    break;
                                }
                            }
                            boolean b = false;
                            try {
                                Class8349.method27845().method977(new File(this.field3150.field4652, "shaderpacks").toURI());
                            }
                            catch (final Throwable t) {
                                t.printStackTrace();
                                b = true;
                            }
                            if (b) {
                                Config.method28847("Opening via system class!");
                                Class8349.method27845().method980("file://" + Class9216.field39331.getAbsolutePath());
                                break;
                            }
                            break;
                        }
                        case 202: {
                            Class9216.method33705();
                            this.field3914 = true;
                            this.field3150.method5244(this.field3910);
                            break;
                        }
                        case 203: {
                            Config.method28894().method5244(new Class713(this, Config.method28962()));
                            break;
                        }
                        case 210: {
                            try {
                                Class8349.method27845().method977(new URI("http://optifine.net/shaderPacks"));
                            }
                            catch (final Throwable t2) {
                                t2.printStackTrace();
                            }
                            break;
                        }
                    }
                }
            }
            else {
                final Class677 class574 = (Class677)class573;
                switch (Class8102.field33364[class574.method3739().ordinal()]) {
                    case 1: {
                        Class9216.method33893();
                        Class9216.method33788();
                        break;
                    }
                    case 2: {
                        Class9216.field39313 = !Class9216.field39313;
                        Class9216.method33788();
                        this.field3150.method5278();
                        break;
                    }
                    case 3: {
                        Class9216.field39314 = !Class9216.field39314;
                        Class9216.method33788();
                        this.field3150.method5278();
                        break;
                    }
                    case 4: {
                        final float field39304 = Class9216.field39304;
                        final float[] field39305 = Class716.field3915;
                        final String[] field39306 = Class716.field3916;
                        int method3939 = method3939(field39304, field39305);
                        if (method3047()) {
                            if (--method3939 < 0) {
                                method3939 = field39305.length - 1;
                            }
                        }
                        else if (++method3939 >= field39305.length) {
                            method3939 = 0;
                        }
                        Class9216.field39304 = field39305[method3939];
                        Class9216.method33788();
                        Class9216.method33789();
                        break;
                    }
                    case 5: {
                        final float field39307 = Class9216.field39305;
                        final float[] field39308 = Class716.field3915;
                        final String[] field39309 = Class716.field3916;
                        int method3940 = method3939(field39307, field39308);
                        if (method3047()) {
                            if (--method3940 < 0) {
                                method3940 = field39308.length - 1;
                            }
                        }
                        else if (++method3940 >= field39308.length) {
                            method3940 = 0;
                        }
                        Class9216.field39305 = field39308[method3940];
                        Class9216.method33788();
                        Class9216.method33790();
                        break;
                    }
                    case 6: {
                        final float field39310 = Class9216.field39303;
                        final float[] field39311 = Class716.field3917;
                        final String[] field39312 = Class716.field3918;
                        int method3941 = method3939(field39310, field39311);
                        if (method3047()) {
                            if (--method3941 < 0) {
                                method3941 = field39311.length - 1;
                            }
                        }
                        else if (++method3941 >= field39311.length) {
                            method3941 = 0;
                        }
                        Class9216.field39303 = field39311[method3941];
                        Class9216.method33788();
                        break;
                    }
                    case 7: {
                        Class9216.field39316.method21678();
                        Class9216.method33788();
                        break;
                    }
                    case 8: {
                        Class9216.field39315.method21678();
                        Class9216.method33747();
                        Class9216.method33788();
                        this.field3150.method5278();
                        break;
                    }
                    case 9: {
                        Class9216.field39301 = !Class9216.field39301;
                        break;
                    }
                    case 10: {
                        Class9216.field39302 = !Class9216.field39302;
                        break;
                    }
                    case 11: {
                        Class9216.field39306 = (Class9216.field39306 + 1) % 3;
                        Class9216.field39307 = (Class9216.field39308 = Class9216.field39306);
                        class574.method3367("Tex Min: " + Class9216.field39320[Class9216.field39306]);
                        Class8990.method32073();
                        break;
                    }
                    case 12: {
                        Class9216.field39310 = (Class9216.field39310 + 1) % 2;
                        class574.method3367("Tex_n Mag: " + Class9216.field39321[Class9216.field39310]);
                        Class8990.method32073();
                        break;
                    }
                    case 13: {
                        Class9216.field39311 = (Class9216.field39311 + 1) % 2;
                        class574.method3367("Tex_s Mag: " + Class9216.field39321[Class9216.field39311]);
                        Class8990.method32073();
                        break;
                    }
                    case 14: {
                        Class9216.field39312 = !Class9216.field39312;
                        class574.method3367("ShadowClipFrustrum: " + method3936(Class9216.field39312));
                        Class8990.method32073();
                        break;
                    }
                }
                class574.method3741();
            }
        }
    }
    
    @Override
    public void method2971() {
        if (!this.field3914) {
            Class9216.method33705();
            this.field3914 = true;
        }
        super.method2971();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.field3913.method2975(n, n2, n3);
        if (this.field3912 <= 0) {
            this.field3913.method3522();
            this.field3912 += 20;
        }
        this.method3295(this.field3843, this.field3148.getFormattedText(), this.field3152 / 2, 15, 16777215);
        final String string = "OpenGL: " + Class9216.field39036 + ", " + Class9216.field39037 + ", " + Class9216.field39038;
        if (this.field3843.method6617(string) >= this.field3152 - 5) {
            this.method3297(this.field3843, string, 5, this.field3153 - 40, 8421504);
        }
        else {
            this.method3295(this.field3843, string, this.field3152 / 2, this.field3153 - 40, 8421504);
        }
        super.method2975(n, n2, n3);
        this.field3911.method27577(n, n2, this.field3842);
    }
    
    @Override
    public void method2992() {
        super.method2992();
        --this.field3912;
    }
    
    public Class869 method3935() {
        return this.field3150;
    }
    
    public void method3184(final String s, final int n, final int n2, final int n3) {
        this.method3295(this.field3843, s, n, n2, n3);
    }
    
    public static String method3936(final boolean b) {
        final String method13878 = Class4647.method13878();
        final String method13879 = Class4647.method13879();
        return b ? method13878 : method13879;
    }
    
    public static String method3937(final int n) {
        if (n != 2) {
            return (n != 4) ? Class4647.method13879() : "FXAA 4x";
        }
        return "FXAA 2x";
    }
    
    public static String method3938(final float n, final float[] array, final String[] array2) {
        return array2[method3939(n, array)];
    }
    
    public static int method3939(final float n, final float[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] >= n) {
                return i;
            }
        }
        return array.length - 1;
    }
    
    public static String method3940(final float n) {
        return method3938(n, Class716.field3915, Class716.field3916);
    }
    
    public static String method3941(final float n) {
        return method3938(n, Class716.field3917, Class716.field3918);
    }
    
    public static int method3942() {
        final String lowerCase = System.getProperty("os.name").toLowerCase();
        if (lowerCase.contains("win")) {
            return 1;
        }
        if (lowerCase.contains("mac")) {
            return 2;
        }
        if (lowerCase.contains("solaris")) {
            return 3;
        }
        if (lowerCase.contains("sunos")) {
            return 3;
        }
        if (!lowerCase.contains("linux")) {
            return lowerCase.contains("unix") ? 4 : 0;
        }
        return 4;
    }
    
    static {
        Class716.field3915 = new float[] { 0.5f, 0.70710677f, 1.0f, 1.4142135f, 2.0f };
        Class716.field3916 = new String[] { "0.5x", "0.7x", "1x", "1.5x", "2x" };
        Class716.field3917 = new float[] { 0.0625f, 0.125f, 0.25f };
        Class716.field3918 = new String[] { "0.5x", "1x", "2x" };
    }
}
