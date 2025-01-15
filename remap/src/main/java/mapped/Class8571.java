// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.nio.IntBuffer;
import java.net.URI;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.nio.ByteBuffer;
import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.util.StringTokenizer;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import org.lwjgl.opengl.GL30;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.InputStream;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.glfw.GLFW;
import org.apache.logging.log4j.Logger;

public class Class8571
{
    public static final String field36010 = "OptiFine";
    public static final String field36011 = "1.15.2";
    public static final String field36012 = "HD_U";
    public static final String field36013 = "G1_pre18";
    public static final String field36014 = "OptiFine_1.15.2_HD_U_G1_pre18";
    private static String field36015;
    private static String field36016;
    private static boolean field36017;
    public static String field36018;
    public static String field36019;
    public static String field36020;
    public static String[] field36021;
    public static Class6435 field36022;
    public static Class6435 field36023;
    public static int field36024;
    public static boolean field36025;
    public static boolean field36026;
    private static Class5760 field36027;
    private static Class869 field36028;
    private static boolean field36029;
    private static Thread field36030;
    private static int field36031;
    private static int field36032;
    public static boolean field36033;
    private static int field36034;
    private static boolean field36035;
    private static boolean field36036;
    public static final Float field36037;
    private static final Logger field36038;
    public static final boolean field36039;
    private static String field36040;
    private static int field36041;
    public static final Class1932 field36042;
    private static Class1774 field36043;
    
    private Class8571() {
    }
    
    public static String method28814() {
        return "OptiFine_1.15.2_HD_U_G1_pre18";
    }
    
    public static String method28815() {
        final StringBuffer sb = new StringBuffer(32);
        if (method29002()) {
            sb.append("DL: ");
            sb.append(String.valueOf(Class8850.method30998()));
            sb.append(", ");
        }
        sb.append("OptiFine_1.15.2_HD_U_G1_pre18");
        final String method33891 = Class9216.method33891();
        if (method33891 != null) {
            sb.append(", ");
            sb.append(method33891);
        }
        return sb.toString();
    }
    
    public static void method28816(final Class5760 field36027) {
        if (Class8571.field36027 == null) {
            Class8571.field36027 = field36027;
            method28970();
            Class7667.method24301("optifine.ForgeSplashCompatible", Boolean.TRUE);
            Class8571.field36031 = Class8571.field36027.field23487;
        }
    }
    
    public static void method28817() {
        method28818();
        Class8571.field36030 = Thread.currentThread();
        method28832();
        Class9216.method33746(Class869.method5277());
    }
    
    public static void method28818() {
        if (!Class8571.field36029) {
            if (Class869.method5277().method5332() != null) {
                Class8571.field36029 = true;
                method28819();
                method28835();
            }
        }
    }
    
    private static void method28819() {
        method28852("");
        method28852(method28814());
        method28852("Build: " + method28820());
        method28852("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        method28852("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        method28852("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        method28852("LWJGL: " + GLFW.glfwGetVersionString());
        Class8571.field36018 = GL11.glGetString(7938);
        Class8571.field36019 = GL11.glGetString(7937);
        Class8571.field36020 = GL11.glGetString(7936);
        method28852("OpenGL: " + Class8571.field36019 + ", version " + Class8571.field36018 + ", " + Class8571.field36020);
        method28852("OpenGL Version: " + method28825());
        final GLCapabilities capabilities = GL.getCapabilities();
        if (!capabilities.OpenGL12) {
            method28852("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
        }
        Class8571.field36025 = capabilities.GL_NV_fog_distance;
        if (!Class8571.field36025) {
            method28852("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
        }
        Class8571.field36026 = capabilities.GL_ARB_occlusion_query;
        if (!Class8571.field36026) {
            method28852("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
        }
        final int method31846 = Class8969.method31846();
        method28847("Maximum texture size: " + method31846 + "x" + method31846);
    }
    
    public static String method28820() {
        if (Class8571.field36015 == null) {
            try {
                final InputStream method28821 = method28821("/buildof.txt");
                if (method28821 == null) {
                    return null;
                }
                Class8571.field36015 = method28957(method28821)[0];
            }
            catch (final Exception ex) {
                method28848("" + ex.getClass().getName() + ": " + ex.getMessage());
                Class8571.field36015 = "";
            }
        }
        return Class8571.field36015;
    }
    
    public static InputStream method28821(final String name) {
        final InputStream method24302 = Class7667.method24302(name);
        return (method24302 == null) ? Class8571.class.getResourceAsStream(name) : method24302;
    }
    
    public static boolean method28822() {
        return Class8571.field36025;
    }
    
    public static boolean method28823() {
        return Class8571.field36026;
    }
    
    public static int method28824() {
        if (Class8571.field36024 < 0) {
            final String[] method28937 = method28937("1.15.2", ".");
            int field36024 = 0;
            if (method28937.length > 0) {
                field36024 += 10000 * method28933(method28937[0], 0);
            }
            if (method28937.length > 1) {
                field36024 += 100 * method28933(method28937[1], 0);
            }
            if (method28937.length > 2) {
                field36024 += 1 * method28933(method28937[2], 0);
            }
            Class8571.field36024 = field36024;
        }
        return Class8571.field36024;
    }
    
    public static String method28825() {
        final Class6435 method28827 = method28827();
        return "" + method28827.method19197() + "." + method28827.method19198() + "." + method28827.method19199();
    }
    
    private static Class6435 method28826() {
        final GLCapabilities capabilities = GL.getCapabilities();
        if (capabilities.OpenGL44) {
            return new Class6435(4, 4);
        }
        if (capabilities.OpenGL43) {
            return new Class6435(4, 3);
        }
        if (capabilities.OpenGL42) {
            return new Class6435(4, 2);
        }
        if (capabilities.OpenGL41) {
            return new Class6435(4, 1);
        }
        if (capabilities.OpenGL40) {
            return new Class6435(4, 0);
        }
        if (capabilities.OpenGL33) {
            return new Class6435(3, 3);
        }
        if (capabilities.OpenGL32) {
            return new Class6435(3, 2);
        }
        if (capabilities.OpenGL31) {
            return new Class6435(3, 1);
        }
        if (capabilities.OpenGL30) {
            return new Class6435(3, 0);
        }
        if (capabilities.OpenGL21) {
            return new Class6435(2, 1);
        }
        if (capabilities.OpenGL20) {
            return new Class6435(2, 0);
        }
        if (capabilities.OpenGL15) {
            return new Class6435(1, 5);
        }
        if (capabilities.OpenGL14) {
            return new Class6435(1, 4);
        }
        if (capabilities.OpenGL13) {
            return new Class6435(1, 3);
        }
        if (!capabilities.OpenGL12) {
            return capabilities.OpenGL11 ? new Class6435(1, 1) : new Class6435(1, 0);
        }
        return new Class6435(1, 2);
    }
    
    public static Class6435 method28827() {
        if (Class8571.field36022 == null) {
            Class8571.field36022 = method28829(GL11.glGetString(7938), null);
            if (Class8571.field36022 == null) {
                Class8571.field36022 = method28826();
            }
            if (Class8571.field36022 == null) {
                Class8571.field36022 = new Class6435(1, 0);
            }
        }
        return Class8571.field36022;
    }
    
    public static Class6435 method28828() {
        if (Class8571.field36023 == null) {
            Class8571.field36023 = method28829(GL11.glGetString(35724), null);
            if (Class8571.field36023 == null) {
                Class8571.field36023 = new Class6435(1, 10);
            }
        }
        return Class8571.field36023;
    }
    
    public static Class6435 method28829(final String input, final Class6435 class6435) {
        try {
            if (input == null) {
                return class6435;
            }
            final Matcher matcher = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?").matcher(input);
            if (!matcher.matches()) {
                return class6435;
            }
            return new Class6435(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), (matcher.group(4) != null) ? Integer.parseInt(matcher.group(4)) : 0, matcher.group(5));
        }
        catch (final Exception ex) {
            method28851("", ex);
            return class6435;
        }
    }
    
    public static String[] method28830() {
        if (Class8571.field36021 == null) {
            Class8571.field36021 = method28831();
        }
        return Class8571.field36021;
    }
    
    private static String[] method28831() {
        try {
            if (method28827().method19197() >= 3) {
                final int glGetInteger = GL11.glGetInteger(33309);
                if (glGetInteger > 0) {
                    final String[] array = new String[glGetInteger];
                    for (int i = 0; i < glGetInteger; ++i) {
                        array[i] = GL30.glGetStringi(7939, i);
                    }
                    return array;
                }
            }
        }
        catch (final Exception ex) {
            method28851("", ex);
        }
        try {
            return GL11.glGetString(7939).split(" ");
        }
        catch (final Exception ex2) {
            method28851("", ex2);
            return new String[0];
        }
    }
    
    public static void method28832() {
        method28970();
        if (!method28971()) {
            Class8571.field36030.setPriority(10);
            method28833("Server thread", 5);
        }
        else if (!method28972()) {
            Class8571.field36030.setPriority(5);
            method28833("Server thread", 5);
        }
        else {
            Class8571.field36030.setPriority(10);
            method28833("Server thread", 1);
        }
    }
    
    private static void method28833(final String prefix, final int priority) {
        try {
            final ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            if (threadGroup == null) {
                return;
            }
            final Thread[] list = new Thread[(threadGroup.activeCount() + 10) * 2];
            threadGroup.enumerate(list, false);
            for (int i = 0; i < list.length; ++i) {
                final Thread thread = list[i];
                if (thread != null && thread.getName().startsWith(prefix)) {
                    thread.setPriority(priority);
                }
            }
        }
        catch (final Throwable t) {
            method28848(t.getClass().getName() + ": " + t.getMessage());
        }
    }
    
    public static boolean method28834() {
        return Thread.currentThread() == Class8571.field36030;
    }
    
    private static void method28835() {
        new Class933().start();
    }
    
    public static boolean method28836() {
        return Class8571.field36027.field23405 > 0;
    }
    
    public static int method28837() {
        return Class8571.field36027.field23405;
    }
    
    public static int method28838() {
        switch (Class8571.field36027.field23479) {
            case 0: {
                return 9986;
            }
            case 1: {
                return 9986;
            }
            case 2: {
                if (method28928()) {
                    return 9985;
                }
                return 9986;
            }
            case 3: {
                if (method28928()) {
                    return 9987;
                }
                return 9986;
            }
            default: {
                return 9986;
            }
        }
    }
    
    public static boolean method28839() {
        return method28840() > Class8571.field36037 + 1.0E-5f;
    }
    
    public static float method28840() {
        return Class8571.field36037;
    }
    
    public static boolean method28841() {
        return method28822() && Class8571.field36027.field23477 == 2;
    }
    
    public static boolean method28842() {
        return Class8571.field36027.field23477 == 1;
    }
    
    public static boolean method28843() {
        return Class8571.field36027.field23477 == 3;
    }
    
    public static boolean method28844() {
        return Class8571.field36027.field23477 != 3;
    }
    
    public static float method28845() {
        return Class8571.field36027.field23478;
    }
    
    public static void method28846(final String str) {
        if (Class8571.field36039) {
            Class8571.field36038.info("[OptiFine] " + str);
        }
    }
    
    public static void method28847(final String str) {
        Class8571.field36038.info("[OptiFine] " + str);
    }
    
    public static void method28848(final String str) {
        Class8571.field36038.warn("[OptiFine] " + str);
    }
    
    public static void method28849(final String str, final Throwable t) {
        Class8571.field36038.warn("[OptiFine] " + str, t);
    }
    
    public static void method28850(final String str) {
        Class8571.field36038.error("[OptiFine] " + str);
    }
    
    public static void method28851(final String str, final Throwable t) {
        Class8571.field36038.error("[OptiFine] " + str, t);
    }
    
    public static void method28852(final String s) {
        method28847(s);
    }
    
    public static int method28853() {
        return Class8571.field36027.field23504;
    }
    
    public static boolean method28854() {
        return Class8571.field36027.field23505;
    }
    
    public static boolean method28855() {
        if (Class8571.field36027.field23492 != 0) {
            return Class8571.field36027.field23492 == 2;
        }
        return Class8571.field36027.field23385;
    }
    
    public static boolean method28856() {
        return Class8571.field36027.field23492 == 3;
    }
    
    public static boolean method28857() {
        if (Class8571.field36027.field23489 != 0) {
            return Class8571.field36027.field23489 == 2;
        }
        if (method28955() && !Class9216.field39339.method21673()) {
            return Class9216.field39339.method21675();
        }
        if (Class8571.field36034 == 0) {
            return Class8571.field36027.field23385;
        }
        return Class8571.field36034 == 2;
    }
    
    public static boolean method28858() {
        if (Class8571.field36027.field23489 != 0) {
            return Class8571.field36027.field23489 == 3;
        }
        if (method28955() && !Class9216.field39339.method21673()) {
            return Class9216.field39339.method21676();
        }
        return Class8571.field36034 != 0 && Class8571.field36034 == 3;
    }
    
    public static void method28859() {
        Class8571.field36034 = 0;
        final Class6582 method28896 = method28896();
        if (method28896 != null) {
            try {
                final InputStream method28897 = method28896.method19933(new Class1932("optifine/color.properties")).method5887();
                if (method28897 == null) {
                    return;
                }
                final Class27 class27 = new Class27();
                class27.load(method28897);
                method28897.close();
                final String property = class27.getProperty("clouds");
                if (property == null) {
                    return;
                }
                method28847("Texture pack clouds: " + property);
                final String lowerCase = property.toLowerCase();
                if (lowerCase.equals("fast")) {
                    Class8571.field36034 = 1;
                }
                if (lowerCase.equals("fancy")) {
                    Class8571.field36034 = 2;
                }
                if (lowerCase.equals("off")) {
                    Class8571.field36034 = 3;
                }
            }
            catch (final Exception ex) {}
        }
    }
    
    public static Class1790 method28860() {
        return Class8571.field36028.method5307().field9956;
    }
    
    public static boolean method28861() {
        if (Class8571.field36027.field23491 != 0) {
            return Class8571.field36027.field23491 != 1;
        }
        return Class8571.field36027.field23385;
    }
    
    public static boolean method28862() {
        return Class8571.field36027.field23491 == 4;
    }
    
    public static boolean method28863() {
        if (Class8571.field36027.field23491 != 0) {
            return Class8571.field36027.field23491 == 4;
        }
        return !Class8571.field36027.field23385;
    }
    
    public static boolean method28864() {
        if (Class8571.field36027.field23493 != 0) {
            return Class8571.field36027.field23493 == 2;
        }
        return Class8571.field36027.field23385;
    }
    
    public static int method28865(final int n, final int n2, final int n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public static float method28866(final float n, final float n2, final float n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public static double method28867(final double n, final double n2, final double n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public static float method28868(final float n) {
        if (n >= 0.0f) {
            return (n <= 1.0f) ? n : 1.0f;
        }
        return 0.0f;
    }
    
    public static boolean method28869() {
        return Class8571.field36027.field23530 != 2;
    }
    
    public static boolean method28870() {
        return Class8571.field36027.field23530 == 1;
    }
    
    public static boolean method28871() {
        return Class8571.field36027.field23533;
    }
    
    public static boolean method28872() {
        return Class8571.field36027.field23531 != 2;
    }
    
    public static boolean method28873() {
        return Class8571.field36027.field23531 == 1;
    }
    
    public static boolean method28874() {
        return Class8571.field36027.field23532;
    }
    
    public static boolean method28875() {
        return Class8571.field36027.field23534;
    }
    
    public static boolean method28876() {
        return Class8571.field36027.field23535;
    }
    
    public static boolean method28877() {
        return Class8571.field36027.field23536;
    }
    
    public static boolean method28878() {
        return Class8571.field36027.field23537;
    }
    
    public static boolean method28879() {
        return Class8571.field36027.field23538;
    }
    
    public static boolean method28880() {
        return Class8571.field36027.field23539;
    }
    
    public static boolean method28881() {
        return Class8571.field36027.field23540;
    }
    
    public static boolean method28882() {
        return Class8571.field36027.field23541;
    }
    
    public static boolean method28883() {
        return Class8571.field36027.field23542;
    }
    
    public static boolean method28884() {
        return Class8571.field36027.field23543;
    }
    
    public static float method28885() {
        return (method28955() && Class9216.field39374 >= 0.0f) ? Class9216.field39374 : ((float)Class8571.field36027.field23486);
    }
    
    public static String method28886(final List list) {
        return method28887(list, ", ");
    }
    
    public static String method28887(final List list, final String str) {
        if (list != null) {
            final StringBuffer sb = new StringBuffer(list.size() * 5);
            for (int i = 0; i < list.size(); ++i) {
                final Object value = list.get(i);
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(String.valueOf(value));
            }
            return sb.toString();
        }
        return "";
    }
    
    public static String method28888(final Object[] array) {
        return method28889(array, ", ");
    }
    
    public static String method28889(final Object[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final Object obj = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(String.valueOf(obj));
            }
            return sb.toString();
        }
        return "";
    }
    
    public static String method28890(final int[] array) {
        return method28891(array, ", ");
    }
    
    public static String method28891(final int[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final int j = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(String.valueOf(j));
            }
            return sb.toString();
        }
        return "";
    }
    
    public static String method28892(final float[] array) {
        return method28893(array, ", ");
    }
    
    public static String method28893(final float[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final float f = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(String.valueOf(f));
            }
            return sb.toString();
        }
        return "";
    }
    
    public static Class869 method28894() {
        return Class8571.field36028;
    }
    
    public static Class1663 method28895() {
        return Class8571.field36028.method5290();
    }
    
    public static Class6582 method28896() {
        return Class8571.field36028.method5291();
    }
    
    public static InputStream method28897(final Class1932 class1932) throws IOException {
        return method28898(Class8571.field36028.method5291(), class1932);
    }
    
    public static InputStream method28898(final Class6582 class6582, final Class1932 class6583) throws IOException {
        final Class1671 method19933 = class6582.method19933(class6583);
        return (method19933 != null) ? method19933.method5887() : null;
    }
    
    public static Class1671 method28899(final Class1932 class1932) throws IOException {
        return Class8571.field36028.method5291().method19933(class1932);
    }
    
    public static boolean method28900(final Class1932 class1932) {
        return class1932 != null && method28907(class1932) != null;
    }
    
    public static boolean method28901(final Class6582 class6582, final Class1932 class6583) {
        try {
            return class6582.method19933(class6583) != null;
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    public static boolean method28902(final Class1727 class1727, final Class1932 class1728) {
        return class1727 != null && class1728 != null && class1727.method6099(Class346.field2137, class1728);
    }
    
    public static Class1727[] method28903() {
        final Collection<Class1922> method7611 = Class8571.field36028.method5292().method7611();
        final ArrayList list = new ArrayList();
        final Iterator<Class1922> iterator = method7611.iterator();
        while (iterator.hasNext()) {
            final Class1727 method7612 = iterator.next().method7620();
            if (method7612 == method28905()) {
                continue;
            }
            list.add(method7612);
        }
        return (Class1727[])list.toArray(new Class1727[list.size()]);
    }
    
    public static String method28904() {
        if (Class8571.field36028.method5291() == null) {
            return "";
        }
        final Class1727[] method28903 = method28903();
        if (method28903.length > 0) {
            final String[] array = new String[method28903.length];
            for (int i = 0; i < method28903.length; ++i) {
                array[i] = method28903[i].method6102();
            }
            return method28888(array);
        }
        return method28905().method6102();
    }
    
    public static Class1728 method28905() {
        return Class8571.field36028.method5293().method25740();
    }
    
    public static boolean method28906(final Class1932 class1932) {
        return method28907(class1932) == method28905();
    }
    
    public static Class1727 method28907(final Class1932 class1932) {
        final List list = (List)Class8571.field36028.method5292().method7611();
        for (int i = list.size() - 1; i >= 0; --i) {
            final Class1727 method7620 = list.get(i).method7620();
            if (method7620.method6099(Class346.field2137, class1932)) {
                return method7620;
            }
        }
        return null;
    }
    
    public static Class1656 method28908() {
        return Class8571.field36028.field4636;
    }
    
    public static Class1660 method28909() {
        return Class8571.field36028.field4644;
    }
    
    public static boolean method28910() {
        return Class8571.field36027.field23494 != 3;
    }
    
    public static boolean method28911() {
        return Class8571.field36027.field23494 == 2;
    }
    
    public static boolean method28912() {
        return Class8571.field36027.field23499;
    }
    
    public static boolean method28913() {
        return Class8571.field36027.field23500;
    }
    
    public static boolean method28914() {
        return Class8571.field36027.field23502;
    }
    
    public static boolean method28915() {
        return method28914() && (!method28955() || Class9216.method33753());
    }
    
    public static boolean method28916() {
        return method28914() && (!method28955() || Class9216.method33754());
    }
    
    public static boolean method28917() {
        if (method28955() && !Class9216.method33755()) {
            return false;
        }
        if (Class8571.field36027.field23503 != 0) {
            return Class8571.field36027.field23503 == 2;
        }
        return Class8571.field36027.field23385;
    }
    
    public static boolean method28918() {
        return Class8571.field36027.field23501;
    }
    
    public static void method28919(final long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (final InterruptedException ex) {
            method28851("", ex);
        }
    }
    
    public static boolean method28920() {
        return Class8571.field36027.field23506 == 1;
    }
    
    public static boolean method28921() {
        return Class8571.field36027.field23506 == 0;
    }
    
    public static boolean method28922() {
        return Class8571.field36027.field23506 == 2;
    }
    
    public static int method28923() {
        return 1;
    }
    
    public static boolean method28924() {
        return method28923() > 1;
    }
    
    public static int method28925() {
        return 0;
    }
    
    public static boolean method28926() {
        return method28925() > 0;
    }
    
    public static boolean method28927() {
        return method28962().field23487 > 0;
    }
    
    public static boolean method28928() {
        return method28923() > 1 || method28925() > 0;
    }
    
    public static boolean method28929(final int n, final int n2, final int n3) {
        return n >= n2 && n <= n3;
    }
    
    public static boolean method28930(final float n, final float n2, final float n3) {
        return n >= n2 && n <= n3;
    }
    
    public static boolean method28931() {
        return Class8571.field36027.field23544;
    }
    
    public static boolean method28932() {
        return Class8571.field36027.field23507;
    }
    
    public static int method28933(String trim, final int n) {
        try {
            if (trim == null) {
                return n;
            }
            trim = trim.trim();
            return Integer.parseInt(trim);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static float method28934(String trim, final float n) {
        try {
            if (trim == null) {
                return n;
            }
            trim = trim.trim();
            return Float.parseFloat(trim);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static boolean method28935(String trim, final boolean b) {
        try {
            if (trim == null) {
                return b;
            }
            trim = trim.trim();
            return Boolean.parseBoolean(trim);
        }
        catch (final NumberFormatException ex) {
            return b;
        }
    }
    
    public static Boolean method28936(String lowerCase, final Boolean b) {
        try {
            if (lowerCase == null) {
                return b;
            }
            lowerCase = lowerCase.trim().toLowerCase();
            if (lowerCase.equals("true")) {
                return Boolean.TRUE;
            }
            return lowerCase.equals("false") ? Boolean.FALSE : b;
        }
        catch (final NumberFormatException ex) {
            return b;
        }
    }
    
    public static String[] method28937(final String str, final String delim) {
        final StringTokenizer stringTokenizer = new StringTokenizer(str, delim);
        final ArrayList list = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            list.add(stringTokenizer.nextToken());
        }
        return (String[])list.toArray(new String[list.size()]);
    }
    
    public static boolean method28938() {
        return Class8571.field36027.field23545;
    }
    
    public static boolean method28939() {
        return Class8571.field36027.field23546;
    }
    
    public static boolean method28940() {
        return Class8571.field36027.field23508;
    }
    
    public static boolean method28941() {
        return Class8571.field36027.field23509;
    }
    
    public static void method28942(final String s) {
        final int method31662 = Class8933.method31662();
        if (method31662 != 0) {
            if (Class8492.method28378(method31662)) {
                final String method31663 = method29017(method31662);
                method28850(String.format("OpenGL error: %s (%s), at: %s", method31662, method31663, s));
                if (method29013()) {
                    if (Class9419.method35020("ShowGlError", 10000L)) {
                        Class8571.field36028.field4647.method3807().method3761(new Class2260(Class8822.method30773("of.message.openglError", method31662, method31663)));
                    }
                }
            }
        }
    }
    
    public static boolean method28943() {
        return Class8571.field36027.field23410 > 0;
    }
    
    public static int method28944() {
        return Class8571.field36027.field23410;
    }
    
    public static boolean method28945() {
        return Class8571.field36027.field23511;
    }
    
    public static boolean method28946() {
        return Class8571.field36027.field23512;
    }
    
    public static boolean method28947() {
        return Class8571.field36027.field23510;
    }
    
    public static boolean method28948() {
        return Class8571.field36027.field23513;
    }
    
    public static boolean method28949() {
        return Class8571.field36027.field23514 != 3;
    }
    
    public static boolean method28950() {
        return Class8571.field36027.field23516;
    }
    
    public static boolean method28951() {
        return Class8571.field36027.field23517;
    }
    
    public static boolean method28952() {
        return Class8571.field36027.field23514 == 2;
    }
    
    public static boolean method28953() {
        return Class8571.field36027.field23519;
    }
    
    public static boolean method28954() {
        if (Class8571.field36027.field23520 != 0) {
            return Class8571.field36027.field23520 == 2;
        }
        return Class8571.field36027.field23385;
    }
    
    public static boolean method28955() {
        return Class9216.field39325;
    }
    
    public static String[] method28956(final File file) throws IOException {
        return method28957(new FileInputStream(file));
    }
    
    public static String[] method28957(final InputStream in) throws IOException {
        final ArrayList list = new ArrayList();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "ASCII"));
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            list.add(line);
        }
        return (String[])list.toArray(new String[list.size()]);
    }
    
    public static String method28958(final File file) throws IOException {
        return method28960(new FileInputStream(file), "ASCII");
    }
    
    public static String method28959(final InputStream inputStream) throws IOException {
        return method28960(inputStream, "ASCII");
    }
    
    public static String method28960(final InputStream in, final String charsetName) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, charsetName));
        final StringBuffer sb = new StringBuffer();
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public static byte[] method28961(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[1024];
        while (true) {
            final int read = inputStream.read(array);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        inputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
    
    public static Class5760 method28962() {
        return Class8571.field36027;
    }
    
    public static String method28963() {
        return Class8571.field36016;
    }
    
    public static void method28964(final String field36016) {
        Class8571.field36016 = field36016;
    }
    
    public static int method28965(final String s, final String s2) {
        final String[] method28966 = method28966(s);
        final String[] method28967 = method28966(s2);
        final String s3 = method28966[0];
        final String s4 = method28967[0];
        if (!s3.equals(s4)) {
            return s3.compareTo(s4);
        }
        final int method28968 = method28933(method28966[1], -1);
        final int method28969 = method28933(method28967[1], -1);
        if (method28968 == method28969) {
            final String s5 = method28966[2];
            final String s6 = method28967[2];
            if (!s5.equals(s6)) {
                if (s5.isEmpty()) {
                    return 1;
                }
                if (s6.isEmpty()) {
                    return -1;
                }
            }
            return s5.compareTo(s6);
        }
        return method28968 - method28969;
    }
    
    private static String[] method28966(final String input) {
        if (input == null || input.length() <= 0) {
            return new String[] { "", "", "" };
        }
        final Matcher matcher = Pattern.compile("([A-Z])([0-9]+)(.*)").matcher(input);
        if (matcher.matches()) {
            return new String[] { method28980(matcher.group(1)), method28980(matcher.group(2)), method28980(matcher.group(3)) };
        }
        return new String[] { "", "", "" };
    }
    
    public static int method28967(int n) {
        n = (n ^ 0x3D ^ n >> 16);
        n += n << 3;
        n ^= n >> 4;
        n *= 668265261;
        n ^= n >> 15;
        return n;
    }
    
    public static int method28968(final BlockPos class354, final int n) {
        return method28967(method28967(method28967(method28967(n + 37) + class354.getX()) + class354.getZ()) + class354.getY());
    }
    
    public static int method28969() {
        return Class8571.field36032;
    }
    
    public static void method28970() {
        Class8571.field36032 = Runtime.getRuntime().availableProcessors();
    }
    
    public static boolean method28971() {
        return method28969() <= 1;
    }
    
    public static boolean method28972() {
        return Class8571.field36027.field23482;
    }
    
    public static boolean method28973() {
        return Class8571.field36027.field23483;
    }
    
    public static boolean method28974() {
        return Class8571.field36027.field23521;
    }
    
    public static boolean method28975() {
        return Class8571.field36027.field23522;
    }
    
    public static int method28976() {
        if (Class8571.field36027 != null) {
            return Class8571.field36027.field23382;
        }
        return 10;
    }
    
    public static boolean equals(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static boolean method28977(final Object o, final Object[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (equals(o, array[i])) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static boolean method28978(final int n, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method28979(final Object o, final Object[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (o == array[i]) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static String method28980(final String s) {
        return (s != null) ? s : "";
    }
    
    private static ByteBuffer method28981(final InputStream input) throws IOException {
        final BufferedImage read = ImageIO.read(input);
        final int[] rgb = read.getRGB(0, 0, read.getWidth(), read.getHeight(), null, 0, read.getWidth());
        final ByteBuffer allocate = ByteBuffer.allocate(4 * rgb.length);
        for (final int n : rgb) {
            allocate.putInt(n << 8 | (n >> 24 & 0xFF));
        }
        allocate.flip();
        return allocate;
    }
    
    public static Object[] method28982(final Object[] array, final Object o) {
        if (array != null) {
            final int length = array.length;
            final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), length + 1);
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = o;
            return array2;
        }
        throw new NullPointerException("The given array is NULL");
    }
    
    public static Object[] method28983(final Object[] a, final Object o, final int n) {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(a));
        list.add(n, o);
        return list.toArray((Object[])Array.newInstance(a.getClass().getComponentType(), list.size()));
    }
    
    public static Object[] method28984(final Object[] array, final Object[] array2) {
        if (array == null) {
            throw new NullPointerException("The given array is NULL");
        }
        if (array2.length != 0) {
            final int length = array.length;
            final Object[] array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), length + array2.length);
            System.arraycopy(array, 0, array3, 0, length);
            System.arraycopy(array2, 0, array3, length, array2.length);
            return array3;
        }
        return array;
    }
    
    public static Object[] method28985(final Object[] a, final Object o) {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(a));
        list.remove(o);
        return method28986(list, a.getClass().getComponentType());
    }
    
    public static Object[] method28986(final Collection collection, final Class clazz) {
        if (collection == null) {
            return null;
        }
        if (clazz == null) {
            return null;
        }
        if (!clazz.isPrimitive()) {
            return collection.toArray((Object[])Array.newInstance(clazz, collection.size()));
        }
        throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + clazz);
    }
    
    public static boolean method28987() {
        return Class8571.field36027.field23515;
    }
    
    public static void method28988() {
        Class8571.field36028.field4643.method6610("" + Class9570.method35833(Class9570.field41444, -1) + "/" + method28989() + " fps, C: " + Class8571.field36028.field4636.method5757() + ", E: " + Class8571.field36028.field4636.method5758() + "+" + Class8571.field36028.field4636.method5759() + ", U: " + method28990(Class8571.field36028.field4707), 2.0f, 2.0f, -2039584);
    }
    
    public static int method28989() {
        if (Class8571.field36028.field4707 == Class8571.field36040) {
            return Class8571.field36041;
        }
        Class8571.field36040 = Class8571.field36028.field4707;
        final Class9462 method5310 = Class8571.field36028.method5310();
        final long[] method5311 = method5310.method35172();
        final int method5312 = method5310.method35170();
        final int method5313 = method5310.method35169();
        if (method5312 != method5313) {
            int method5314 = Class9570.method35833(Class9570.field41444, -1);
            if (method5314 <= 0) {
                method5314 = 1;
            }
            long n = (long)(1.0 / method5314 * 1.0E9);
            long n2 = 0L;
            long n4;
            for (int n3 = MathHelper.method35664(method5312 - 1, method5311.length); n3 != method5313 && n2 < 1.0E9; n2 += n4, n3 = MathHelper.method35664(n3 - 1, method5311.length)) {
                n4 = method5311[n3];
                if (n4 > n) {
                    n = n4;
                }
            }
            return Class8571.field36041 = (int)(1.0 / (n / 1.0E9));
        }
        return Class8571.field36041;
    }
    
    private static String method28990(final String s) {
        final int index = s.indexOf(40);
        if (index >= 0) {
            final int index2 = s.indexOf(32, index);
            return (index2 >= 0) ? s.substring(index + 1, index2) : "";
        }
        return "";
    }
    
    public static int method28991() {
        return (System.getenv("ProgramFiles(X86)") == null) ? 32 : 64;
    }
    
    public static int method28992() {
        final String[] array = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
        for (int i = 0; i < array.length; ++i) {
            final String property = System.getProperty(array[i]);
            if (property != null && property.contains("64")) {
                return 64;
            }
        }
        return 32;
    }
    
    public static boolean method28993() {
        return Class8571.field36017;
    }
    
    public static void method28994(final boolean field36017) {
        Class8571.field36017 = field36017;
    }
    
    public static boolean method28995() {
        return false;
    }
    
    public static void method28996(final String s, final String s2) {
        Class8571.field36028.method5244(new Class715(Class8571.field36028.field4700, s, s2));
    }
    
    public static int[] method28997(final int[] array, final int n) {
        return method28998(array, new int[] { n });
    }
    
    public static int[] method28998(final int[] array, final int[] array2) {
        if (array != null && array2 != null) {
            final int length = array.length;
            final int[] array3 = new int[length + array2.length];
            System.arraycopy(array, 0, array3, 0, length);
            for (int i = 0; i < array2.length; ++i) {
                array3[i + length] = array2[i];
            }
            return array3;
        }
        throw new NullPointerException("The given array is NULL");
    }
    
    public static void method28999(final File file, final String s) throws IOException {
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(s.getBytes("ASCII"));
        fileOutputStream.close();
    }
    
    public static void method29000(final Class1774 field36043) {
        Class8571.field36043 = field36043;
    }
    
    public static Class1774 method29001() {
        return Class8571.field36043;
    }
    
    public static boolean method29002() {
        return Class8571.field36027.field23523 != 3;
    }
    
    public static boolean method29003() {
        return Class8571.field36027.field23523 == 1;
    }
    
    public static boolean method29004() {
        return method29002() && (!method28955() || Class9216.method33749());
    }
    
    public static boolean method29005() {
        return Class8571.field36027.field23524;
    }
    
    public static boolean method29006() {
        return Class8571.field36027.field23525;
    }
    
    public static int method29007() {
        return Class8571.field36027.field23527;
    }
    
    public static int[] method29008(final Integer[] array) {
        if (array == null) {
            return null;
        }
        if (array.length != 0) {
            final int[] array2 = new int[array.length];
            for (int i = 0; i < array2.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return new int[0];
    }
    
    public static boolean method29009() {
        return false;
    }
    
    public static boolean method29010() {
        return Class8543.method28677();
    }
    
    public static boolean method29011() {
        return Class8571.field36027.field23481;
    }
    
    public static boolean method29012(final URI uri) {
        Class8349.method27862(null);
        Class8349.method27845().method977(uri);
        return Class8349.method27861() == null;
    }
    
    public static boolean method29013() {
        return Class8571.field36027.field23526;
    }
    
    public static String method29014(final boolean[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final boolean b = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(String.valueOf(b));
            }
            return sb.toString();
        }
        return "";
    }
    
    public static boolean method29015() {
        return Class8571.field36028.method5285() != null && Class8571.field36028.method5283();
    }
    
    public static IntBuffer method29016(final int n) {
        return Class9078.method32715(n << 2).asIntBuffer();
    }
    
    public static String method29017(final int n) {
        switch (n) {
            case 0: {
                return "No error";
            }
            case 1280: {
                return "Invalid enum";
            }
            case 1281: {
                return "Invalid value";
            }
            case 1282: {
                return "Invalid operation";
            }
            case 1283: {
                return "Stack overflow";
            }
            case 1284: {
                return "Stack underflow";
            }
            case 1285: {
                return "Out of memory";
            }
            case 1286: {
                return "Invalid framebuffer operation";
            }
            default: {
                return "Unknown";
            }
        }
    }
    
    public static boolean method29018(final int n) {
        return GLFW.glfwGetKey(Class8571.field36028.method5332().method7690(), n) == 1;
    }
    
    public static boolean method29019(final Boolean b) {
        return b != null && b;
    }
    
    public static boolean method29020() {
        return Class8571.field36028.field4701 != null && (!(Class8571.field36028.field4701 instanceof Class567) || !((Class567)Class8571.field36028.field4701).method3311());
    }
    
    public static boolean method29021() {
        return method28955() && !Class9216.method33921();
    }
    
    static {
        Class8571.field36015 = null;
        Class8571.field36016 = null;
        Class8571.field36017 = false;
        Class8571.field36018 = null;
        Class8571.field36019 = null;
        Class8571.field36020 = null;
        Class8571.field36021 = null;
        Class8571.field36022 = null;
        Class8571.field36023 = null;
        Class8571.field36024 = -1;
        Class8571.field36025 = false;
        Class8571.field36026 = false;
        Class8571.field36027 = null;
        Class8571.field36028 = Class869.method5277();
        Class8571.field36029 = false;
        Class8571.field36030 = null;
        Class8571.field36031 = 0;
        Class8571.field36032 = 0;
        Class8571.field36033 = false;
        Class8571.field36034 = 0;
        Class8571.field36035 = false;
        Class8571.field36036 = false;
        field36037 = 0.1f;
        field36038 = LogManager.getLogger();
        field36039 = System.getProperty("log.detail", Class8571.\u6c4f\uc3b9\u486b\u11e9\u3ead\u8b48[44]).equals(Class8571.\u6c4f\uc3b9\u486b\u11e9\u3ead\u8b48[43]);
        Class8571.field36040 = null;
        Class8571.field36041 = 0;
        field36042 = new Class1932("textures/gui/title/mojang.png");
    }
}
