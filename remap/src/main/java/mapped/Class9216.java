// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.IdentityHashMap;
import java.nio.charset.StandardCharsets;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.Vector4f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.lwjgl.BufferUtils;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ARBGeometryShader4;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.EXTFramebufferObject;
import java.util.Comparator;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import org.lwjgl.opengl.GL11;
import org.apache.commons.io.IOUtils;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Reader;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.io.File;
import java.util.Properties;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GLCapabilities;

public class Class9216
{
    public static Class869 field39031;
    public static Class1660 field39032;
    public static boolean field39033;
    public static boolean field39034;
    public static GLCapabilities field39035;
    public static String field39036;
    public static String field39037;
    public static String field39038;
    public static boolean field39039;
    public static int field39040;
    private static int field39041;
    private static int field39042;
    public static int field39043;
    public static int field39044;
    public static boolean field39045;
    public static boolean field39046;
    public static boolean field39047;
    public static boolean field39048;
    public static boolean field39049;
    public static boolean field39050;
    public static boolean field39051;
    private static boolean field39052;
    private static boolean field39053;
    private static boolean field39054;
    private static boolean field39055;
    private static boolean field39056;
    public static boolean field39057;
    public static boolean field39058;
    public static boolean field39059;
    public static float[] field39060;
    public static float[] field39061;
    public static float[] field39062;
    public static float[] field39063;
    public static float[] field39064;
    public static float[] field39065;
    public static float[] field39066;
    public static float[] field39067;
    private static float[] field39068;
    public static float field39069;
    public static float field39070;
    public static float field39071;
    public static float field39072;
    public static float field39073;
    public static float field39074;
    public static long field39075;
    public static long field39076;
    public static long field39077;
    public static float field39078;
    public static float field39079;
    public static float field39080;
    public static int field39081;
    public static long field39082;
    public static long field39083;
    public static long field39084;
    public static int field39085;
    public static float field39086;
    public static float field39087;
    public static int field39088;
    public static float field39089;
    public static float field39090;
    public static float field39091;
    public static float field39092;
    public static float field39093;
    public static boolean field39094;
    public static int field39095;
    public static int field39096;
    public static float field39097;
    public static float field39098;
    public static float field39099;
    public static float field39100;
    public static float field39101;
    public static float field39102;
    public static boolean field39103;
    public static int field39104;
    public static float field39105;
    public static float field39106;
    public static boolean field39107;
    public static boolean field39108;
    private static int field39109;
    public static int field39110;
    public static int field39111;
    public static int field39112;
    public static boolean field39113;
    public static boolean field39114;
    public static boolean field39115;
    public static boolean field39116;
    public static boolean field39117;
    public static boolean field39118;
    private static boolean field39119;
    private static int field39120;
    private static boolean field39121;
    public static int field39122;
    public static int field39123;
    private static Class9114 field39124;
    public static Class5155 field39125;
    public static Class5153 field39126;
    public static Class5153 field39127;
    public static Class5153 field39128;
    public static Class5153 field39129;
    public static Class5153 field39130;
    public static Class5153 field39131;
    public static Class5153 field39132;
    public static Class5153 field39133;
    public static Class5153 field39134;
    public static Class5153 field39135;
    public static Class5153 field39136;
    public static Class5153 field39137;
    public static Class5153 field39138;
    public static Class5153 field39139;
    public static Class5153 field39140;
    public static Class5153 field39141;
    public static Class5153 field39142;
    public static Class5153 field39143;
    public static Class5153 field39144;
    public static Class5153 field39145;
    public static Class5153 field39146;
    public static Class5153 field39147;
    public static Class5153 field39148;
    public static Class5153 field39149;
    public static Class5153 field39150;
    public static Class5153 field39151;
    public static Class5153 field39152;
    public static Class5153 field39153;
    public static Class5153 field39154;
    public static Class5153 field39155;
    public static Class5153 field39156;
    public static Class5153 field39157;
    public static Class5153 field39158;
    public static Class5153 field39159;
    public static Class5153 field39160;
    public static Class5153 field39161;
    public static Class5153 field39162;
    public static Class5153 field39163;
    public static Class5153 field39164;
    public static Class5153 field39165;
    public static Class5154 field39166;
    public static Class5151 field39167;
    public static Class5151 field39168;
    public static Class5153 field39169;
    public static Class5153 field39170;
    public static Class5153 field39171;
    public static Class5153 field39172;
    public static Class5154 field39173;
    public static Class5154 field39174;
    public static Class5154 field39175;
    public static Class5154 field39176;
    public static Class5154 field39177;
    public static Class5154 field39178;
    public static Class5154 field39179;
    public static Class5154 field39180;
    public static Class5154 field39181;
    public static Class5154 field39182;
    public static Class5151 field39183;
    public static Class5151 field39184;
    public static Class5151 field39185;
    public static Class5151 field39186;
    public static Class5151 field39187;
    public static Class5151 field39188;
    public static Class5150 field39189;
    public static Class5150 field39190;
    public static Class5150 field39191;
    public static Class5150 field39192;
    public static Class5150 field39193;
    public static Class5150 field39194;
    public static Class5150 field39195;
    public static Class5150 field39196;
    public static Class5150 field39197;
    public static Class5150 field39198;
    public static Class5154 field39199;
    public static Class5154 field39200;
    public static Class5148 field39201;
    public static Class5148 field39202;
    public static Class5148 field39203;
    public static Class5153 field39204;
    public static Class5153 field39205;
    public static Class5154 field39206;
    public static Class5154 field39207;
    public static Class5154 field39208;
    public static Class5153 field39209;
    public static Class5154 field39210;
    public static Class5148 field39211;
    public static Class5152 field39212;
    public static Class5153 field39213;
    public static double field39214;
    public static double field39215;
    public static double field39216;
    public static double field39217;
    public static double field39218;
    public static double field39219;
    public static int field39220;
    public static int field39221;
    public static int field39222;
    public static boolean field39223;
    public static int field39224;
    public static int field39225;
    public static int field39226;
    public static int field39227;
    public static float field39228;
    public static float field39229;
    public static boolean field39230;
    public static float field39231;
    public static int field39232;
    public static boolean field39233;
    public static boolean field39234;
    public static final int field39235 = 8;
    public static final int field39236 = 8;
    public static final int field39237 = 3;
    public static final int field39238 = 8;
    public static final int field39239 = 2;
    public static int field39240;
    public static int field39241;
    public static int field39242;
    public static int field39243;
    public static int field39244;
    public static int field39245;
    public static int field39246;
    public static int field39247;
    private static int[] field39248;
    public static boolean[] field39249;
    public static Vector4f[] field39250;
    private static Class9363 field39251;
    public static final Class9023 field39252;
    public static final Class9023 field39253;
    public static final Class9023 field39254;
    public static final Class9023 field39255;
    public static final Class9023 field39256;
    public static final Class9023 field39257;
    public static final Class9023 field39258;
    public static final Class9023 field39259;
    public static final Class9023 field39260;
    public static final Class9023 field39261;
    public static final Class9023 field39262;
    public static final Class9023 field39263;
    public static final Class9023 field39264;
    public static final Class9023 field39265;
    public static final Class9023 field39266;
    public static final Class9023 field39267;
    public static final Class9023 field39268;
    public static final Class9023 field39269;
    public static final Class9023 field39270;
    public static final Class9023 field39271;
    public static final Class9023 field39272;
    public static final Class9023 field39273;
    public static final Class9023 field39274;
    public static final Class9023 field39275;
    public static final Class9023 field39276;
    public static final Class9023[] field39277;
    public static final Class9023 field39278;
    public static final Class9023 field39279;
    public static final Class9023 field39280;
    public static final Class9023 field39281;
    public static final Class9023[] field39282;
    public static final Class9023 field39283;
    public static final Class9023 field39284;
    public static final int field39285;
    public static final Class9023[] field39286;
    public static Class9023 field39287;
    public static int field39288;
    private static Class9573 field39289;
    private static boolean field39290;
    public static IntBuffer field39291;
    private static int field39292;
    public static Properties field39293;
    public static Properties field39294;
    public static Class1666 field39295;
    public static boolean[] field39296;
    public static boolean[] field39297;
    public static boolean[] field39298;
    public static boolean[] field39299;
    public static boolean[] field39300;
    public static boolean field39301;
    public static boolean field39302;
    public static float field39303;
    public static float field39304;
    public static float field39305;
    public static int field39306;
    public static int field39307;
    public static int field39308;
    public static int field39309;
    public static int field39310;
    public static int field39311;
    public static boolean field39312;
    public static boolean field39313;
    public static boolean field39314;
    public static Class7095 field39315;
    public static Class7095 field39316;
    public static int field39317;
    public static final int field39318 = 3;
    public static final int field39319 = 2;
    public static final String[] field39320;
    public static final String[] field39321;
    public static final int[] field39322;
    public static final int[] field39323;
    private static Class7038 field39324;
    public static boolean field39325;
    public static String field39326;
    public static final String field39327 = "OFF";
    public static final String field39328 = "(internal)";
    public static final String field39329 = "shaderpacks";
    public static final String field39330 = "optionsshaders.txt";
    public static final File field39331;
    public static File field39332;
    private static Class5601[] field39333;
    private static Set<String> field39334;
    public static Class9319[] field39335;
    public static Map<String, Class9442> field39336;
    public static Map<String, Class326> field39337;
    public static final String field39338 = "/shaders/shaders.properties";
    public static Class7093 field39339;
    public static Class7095 field39340;
    public static Class7095 field39341;
    public static Class7095 field39342;
    public static Class7095 field39343;
    public static Class7095 field39344;
    public static Class7095 field39345;
    public static Class7095 field39346;
    public static Class7095 field39347;
    public static Class7095 field39348;
    public static Class7095 field39349;
    public static Class7095 field39350;
    public static Class7095 field39351;
    public static Class7095 field39352;
    public static Class7095 field39353;
    public static Class7095 field39354;
    public static Class7095 field39355;
    private static Map<String, String> field39356;
    private static Class1848 field39357;
    private static List<Integer> field39358;
    private static Class4114[] field39359;
    private static Class4114[] field39360;
    private static Class4114[] field39361;
    private static String field39362;
    private static Class6891 field39363;
    private static final int field39364 = 0;
    private static final int field39365 = 1;
    private static final int field39366 = 2;
    private static final String[] field39367;
    public static final boolean field39368 = true;
    private static final boolean field39369 = true;
    public static final boolean field39370;
    public static float field39371;
    public static float field39372;
    public static float field39373;
    public static float field39374;
    public static float field39375;
    public static float field39376;
    public static int field39377;
    public static float field39378;
    public static float field39379;
    public static float field39380;
    public static float field39381;
    public static float field39382;
    public static int field39383;
    public static int[] field39384;
    private static Class4114 field39385;
    private static boolean field39386;
    private static int field39387;
    public static final int[] field39388;
    private static final int field39389;
    private static final ByteBuffer field39390;
    public static final float[] field39391;
    public static final float[] field39392;
    public static final float[] field39393;
    public static final float[] field39394;
    public static final float[] field39395;
    public static final float[] field39396;
    public static final float[] field39397;
    public static final float[] field39398;
    public static final FloatBuffer field39399;
    public static final FloatBuffer field39400;
    public static final FloatBuffer field39401;
    public static final FloatBuffer field39402;
    public static final FloatBuffer field39403;
    public static final FloatBuffer field39404;
    public static final FloatBuffer field39405;
    public static final FloatBuffer field39406;
    public static final FloatBuffer field39407;
    public static final FloatBuffer field39408;
    public static final FloatBuffer field39409;
    public static final FloatBuffer field39410;
    public static final IntBuffer field39411;
    public static final IntBuffer field39412;
    public static final IntBuffer field39413;
    public static final IntBuffer field39414;
    public static final IntBuffer field39415;
    public static final IntBuffer field39416;
    public static final IntBuffer field39417;
    public static final IntBuffer field39418;
    public static final Class9339 field39419;
    public static Map<Class3833, Integer> field39420;
    private static final String[] field39421;
    private static final int[] field39422;
    private static final Pattern field39423;
    public static int[] field39424;
    public static int field39425;
    
    private Class9216() {
    }
    
    private static ByteBuffer method33699(final int n) {
        final ByteBuffer field39390 = Class9216.field39390;
        final int limit = field39390.limit();
        field39390.position().limit(limit + n);
        return field39390.slice();
    }
    
    public static IntBuffer method33700(final int n) {
        final ByteBuffer field39390 = Class9216.field39390;
        final int limit = field39390.limit();
        field39390.position().limit(limit + n * 4);
        return field39390.asIntBuffer();
    }
    
    private static FloatBuffer method33701(final int n) {
        final ByteBuffer field39390 = Class9216.field39390;
        final int limit = field39390.limit();
        field39390.position().limit(limit + n * 4);
        return field39390.asFloatBuffer();
    }
    
    private static IntBuffer[] method33702(final int n, final int n2) {
        final IntBuffer[] array = new IntBuffer[n];
        for (int i = 0; i < n; ++i) {
            array[i] = method33700(n2);
        }
        return array;
    }
    
    public static void method33703() {
        Class8885.method31272("Load shaders configuration.");
        try {
            if (!Class9216.field39331.exists()) {
                Class9216.field39331.mkdir();
            }
        }
        catch (final Exception ex) {
            Class8885.method31270("Failed to open the shaderpacks directory: " + Class9216.field39331);
        }
        (Class9216.field39294 = new Class27()).setProperty(Class2222.field13672.method8417(), "");
        if (Class9216.field39332.exists()) {
            try {
                final FileReader reader = new FileReader(Class9216.field39332);
                Class9216.field39294.load(reader);
                reader.close();
            }
            catch (final Exception ex2) {}
        }
        if (!Class9216.field39332.exists()) {
            try {
                method33705();
            }
            catch (final Exception ex3) {}
        }
        final Class2222[] values = Class2222.values();
        for (int i = 0; i < values.length; ++i) {
            final Class2222 class2222 = values[i];
            method33704(class2222, Class9216.field39294.getProperty(class2222.method8417(), class2222.method8418()));
        }
        method33708();
    }
    
    private static void method33704(final Class2222 obj, String method8418) {
        if (method8418 == null) {
            method8418 = obj.method8418();
        }
        switch (Class9349.field40124[obj.ordinal()]) {
            case 1: {
                Class9216.field39317 = Class8571.method28933(method8418, 0);
                break;
            }
            case 2: {
                Class9216.field39313 = Class8571.method28935(method8418, true);
                break;
            }
            case 3: {
                Class9216.field39314 = Class8571.method28935(method8418, true);
                break;
            }
            case 4: {
                Class9216.field39304 = Class8571.method28934(method8418, 1.0f);
                break;
            }
            case 5: {
                Class9216.field39305 = Class8571.method28934(method8418, 1.0f);
                break;
            }
            case 6: {
                Class9216.field39303 = Class8571.method28934(method8418, 0.125f);
                break;
            }
            case 7: {
                Class9216.field39302 = Class8571.method28935(method8418, true);
                break;
            }
            case 8: {
                Class9216.field39316.method21677(method8418);
                break;
            }
            case 9: {
                Class9216.field39315.method21677(method8418);
                break;
            }
            case 10: {
                Class9216.field39326 = method8418;
                break;
            }
            case 11: {
                Class9216.field39301 = Class8571.method28935(method8418, true);
                break;
            }
            case 12: {
                Class9216.field39312 = Class8571.method28935(method8418, true);
                break;
            }
            case 13: {
                Class9216.field39306 = Class8571.method28933(method8418, 0);
                break;
            }
            case 14: {
                Class9216.field39307 = Class8571.method28933(method8418, 0);
                break;
            }
            case 15: {
                Class9216.field39308 = Class8571.method28933(method8418, 0);
                break;
            }
            case 16: {
                Class9216.field39309 = Class8571.method28933(method8418, 0);
                break;
            }
            case 17: {
                Class9216.field39309 = Class8571.method28933(method8418, 0);
                break;
            }
            case 18: {
                Class9216.field39309 = Class8571.method28933(method8418, 0);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown option: " + obj);
            }
        }
    }
    
    public static void method33705() {
        Class8885.method31272("Save shaders configuration.");
        if (Class9216.field39294 == null) {
            Class9216.field39294 = new Class27();
        }
        final Class2222[] values = Class2222.values();
        for (int i = 0; i < values.length; ++i) {
            final Class2222 class2222 = values[i];
            Class9216.field39294.setProperty(class2222.method8417(), method33706(class2222));
        }
        try {
            final FileWriter writer = new FileWriter(Class9216.field39332);
            Class9216.field39294.store(writer, null);
            writer.close();
        }
        catch (final Exception ex) {
            Class8885.method31270("Error saving configuration: " + ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
    
    public static String method33706(final Class2222 obj) {
        switch (Class9349.field40124[obj.ordinal()]) {
            case 1: {
                return Integer.toString(Class9216.field39317);
            }
            case 2: {
                return Boolean.toString(Class9216.field39313);
            }
            case 3: {
                return Boolean.toString(Class9216.field39314);
            }
            case 4: {
                return Float.toString(Class9216.field39304);
            }
            case 5: {
                return Float.toString(Class9216.field39305);
            }
            case 6: {
                return Float.toString(Class9216.field39303);
            }
            case 7: {
                return Boolean.toString(Class9216.field39302);
            }
            case 8: {
                return Class9216.field39316.method21682();
            }
            case 9: {
                return Class9216.field39315.method21682();
            }
            case 10: {
                return Class9216.field39326;
            }
            case 11: {
                return Boolean.toString(Class9216.field39301);
            }
            case 12: {
                return Boolean.toString(Class9216.field39312);
            }
            case 13: {
                return Integer.toString(Class9216.field39306);
            }
            case 14: {
                return Integer.toString(Class9216.field39307);
            }
            case 15: {
                return Integer.toString(Class9216.field39308);
            }
            case 16: {
                return Integer.toString(Class9216.field39309);
            }
            case 17: {
                return Integer.toString(Class9216.field39309);
            }
            case 18: {
                return Integer.toString(Class9216.field39309);
            }
            default: {
                throw new IllegalArgumentException("Unknown option: " + obj);
            }
        }
    }
    
    public static void method33707(final String s) {
        Class9216.field39326 = s;
        Class9216.field39294.setProperty(Class2222.field13672.method8417(), s);
        method33708();
    }
    
    public static void method33708() {
        final boolean field39325 = Class9216.field39325;
        final boolean method33750 = method33750();
        if (Class9216.field39031.field4636 != null) {
            Class9216.field39031.field4636.method5766();
        }
        Class9216.field39325 = false;
        if (Class9216.field39324 != null) {
            Class9216.field39324.method21533();
            Class9216.field39324 = null;
            Class9216.field39356.clear();
            Class9216.field39358.clear();
            Class9216.field39333 = null;
            Class9216.field39334 = null;
            Class9216.field39335 = null;
            Class9216.field39336 = null;
            Class9216.field39337.clear();
            Class9216.field39339.method21685();
            Class9216.field39341.method21685();
            Class9216.field39342.method21685();
            Class9216.field39340.method21685();
            method33721();
            Class9216.field39362 = null;
        }
        boolean b = false;
        if (Class8571.method28926()) {
            Class8885.method31272("Shaders can not be loaded, Antialiasing is enabled: " + Class8571.method28925() + "x");
            b = true;
        }
        if (Class8571.method28924()) {
            Class8885.method31272("Shaders can not be loaded, Anisotropic Filtering is enabled: " + Class8571.method28923() + "x");
            b = true;
        }
        if (Class8571.method28953()) {
            Class8885.method31272("Shaders can not be loaded, Fast Render is enabled.");
            b = true;
        }
        final String property = Class9216.field39294.getProperty(Class2222.field13672.method8417(), "(internal)");
        if (!b) {
            Class9216.field39324 = method33709(property);
            Class9216.field39325 = (Class9216.field39324 != null);
        }
        if (Class9216.field39325) {
            Class8885.method31272("Loaded shaderpack: " + method33891());
        }
        else {
            Class8885.method31272("No shaderpack loaded.");
            Class9216.field39324 = new Class7041();
        }
        if (Class9216.field39370) {
            method33772(new File(Class9216.field39331, "debug"));
        }
        method33896();
        method33711();
        Class9216.field39333 = method33733();
        method33712();
        final boolean b2 = Class9216.field39325 != field39325;
        final boolean b3 = method33750() != method33750;
        if (b2 || b3) {
            Class9237.method34060();
            if (Class9570.field41378.method22623()) {
                Class9570.field41379.method22632(null);
                Class9570.field41380.method22632(null);
            }
            method33747();
        }
        if (Class9216.field39031.method5291() != null) {
            Class8929.method31487();
        }
        if (Class9216.field39031.field4636 != null) {
            Class9216.field39031.field4636.method5767();
        }
        if ((b2 || b3) && Class9216.field39031.method5291() != null) {
            Class9216.field39031.method5278();
        }
    }
    
    public static Class7038 method33709(String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (!trim.isEmpty() && !trim.equals("OFF")) {
            if (trim.equals("(internal)")) {
                return new Class7039();
            }
            try {
                final File file = new File(Class9216.field39331, trim);
                if (file.isDirectory()) {
                    return new Class7040(trim, file);
                }
                return (file.isFile() && trim.toLowerCase().endsWith(".zip")) ? new Class7042(trim, file) : null;
            }
            catch (final Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }
    
    public static Class7038 method33710() {
        return Class9216.field39324;
    }
    
    private static void method33711() {
        Class9216.field39358.clear();
        for (int i = -128; i <= 128; ++i) {
            if (Class9216.field39324.method21532("/shaders/world" + i)) {
                Class9216.field39358.add(i);
            }
        }
        if (Class9216.field39358.size() > 0) {
            Class8571.method28847("[Shaders] Worlds: " + Class8571.method28888(Class9216.field39358.toArray(new Integer[Class9216.field39358.size()])));
        }
    }
    
    private static void method33712() {
        Class9216.field39339.method21685();
        Class9216.field39341.method21685();
        Class9216.field39342.method21685();
        Class9216.field39340.method21685();
        Class9216.field39343.method21685();
        Class9216.field39344.method21685();
        Class9216.field39345.method21685();
        Class9216.field39346.method21685();
        Class9216.field39347.method21685();
        Class9216.field39348.method21685();
        Class9216.field39349.method21685();
        Class9216.field39350.method21685();
        Class9216.field39351.method21685();
        Class9216.field39352.method21685();
        Class9216.field39353.method21685();
        Class9216.field39354.method21685();
        Class9216.field39355.method21685();
        Class3660.method11286();
        Class6444.method19221();
        Class8251.method27367();
        Class9216.field39363 = null;
        for (int i = 0; i < Class9216.field39286.length; ++i) {
            Class9216.field39286[i].method32321();
        }
        if (Class9216.field39324 != null) {
            Class3660.method11275(Class9216.field39324);
            Class6444.method19216(Class9216.field39324);
            Class8251.method27362(Class9216.field39324);
            final String str = "/shaders/shaders.properties";
            try {
                final InputStream method21531 = Class9216.field39324.method21531(str);
                if (method21531 == null) {
                    return;
                }
                final InputStream method21532 = Class8121.method26733(method21531, str);
                final Class27 class27 = new Class27();
                class27.load(method21532);
                method21532.close();
                Class9216.field39339.method21686(class27);
                Class9216.field39341.method21686(class27);
                Class9216.field39342.method21686(class27);
                Class9216.field39340.method21686(class27);
                Class9216.field39343.method21686(class27);
                Class9216.field39344.method21686(class27);
                Class9216.field39345.method21686(class27);
                Class9216.field39347.method21686(class27);
                Class9216.field39346.method21686(class27);
                Class9216.field39348.method21686(class27);
                Class9216.field39349.method21686(class27);
                Class9216.field39350.method21686(class27);
                Class9216.field39351.method21686(class27);
                Class9216.field39352.method21686(class27);
                Class9216.field39353.method21686(class27);
                Class9216.field39354.method21686(class27);
                Class9216.field39355.method21686(class27);
                Class9216.field39334 = Class7528.method23558(class27, Class9216.field39333);
                Class9216.field39335 = Class7528.method23555(class27, Class9216.field39333);
                Class9216.field39336 = Class7528.method23560(class27, Class9216.field39335, Class9216.field39333);
                Class9216.field39337 = Class7528.method23556(class27, Class9216.field39333);
                Class9216.field39359 = method33713(class27, 0);
                Class9216.field39360 = method33713(class27, 1);
                Class9216.field39361 = method33713(class27, 2);
                Class9216.field39362 = class27.getProperty("texture.noise");
                if (Class9216.field39362 != null) {
                    Class9216.field39386 = true;
                }
                Class9216.field39363 = Class7528.method23565(class27);
                Class7528.method23568(class27);
                Class7528.method23570(class27);
                Class7528.method23572(class27);
                Class7528.method23574(class27);
            }
            catch (final IOException ex) {
                Class8571.method28848("[Shaders] Error reading: " + str);
            }
        }
    }
    
    private static Class4114[] method33713(final Properties properties, final int n) {
        final String string = "texture." + Class9216.field39367[n] + ".";
        final Set<Object> keySet = properties.keySet();
        final ArrayList list = new ArrayList();
        for (final String str : keySet) {
            if (str.startsWith(string)) {
                final String method35524 = Class9518.method35524(Class9518.method35517(str, string), new String[] { ".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9" });
                final String trim = properties.getProperty(str).trim();
                final int method35525 = method33719(n, method35524);
                if (method35525 < 0) {
                    Class8885.method31271("Invalid texture name: " + str);
                }
                else {
                    final Class4114 method35526 = method33714(method35525, trim);
                    if (method35526 == null) {
                        continue;
                    }
                    Class8885.method31272("Custom texture: " + str + " = " + trim);
                    list.add(method35526);
                }
            }
        }
        if (list.size() <= 0) {
            return null;
        }
        return (Class4114[])list.toArray(new Class4114[list.size()]);
    }
    
    private static Class4114 method33714(final int n, String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (trim.indexOf(58) >= 0) {
            return method33715(n, trim);
        }
        return (trim.indexOf(32) >= 0) ? method33716(n, trim) : method33718(n, trim);
    }
    
    private static Class4114 method33715(final int n, final String s) {
        String s2 = s.trim();
        int n2 = 0;
        if (s2.startsWith("minecraft:textures/")) {
            s2 = Class9518.method35529(s2, ".png");
            if (s2.endsWith("_n.png")) {
                s2 = Class9518.method35519(s2, "_n.png", ".png");
                n2 = 1;
            }
            else if (s2.endsWith("_s.png")) {
                s2 = Class9518.method35519(s2, "_s.png", ".png");
                n2 = 2;
            }
        }
        if (s2.startsWith("minecraft:dynamic/lightmap_")) {
            s2 = s2.replace("lightmap", "light_map");
        }
        return new Class4115(n, new Class1932(s2), n2);
    }
    
    private static Class4114 method33716(final int n, final String s) {
        final Class8652 class8652 = new Class8652("Shaders");
        final ArrayDeque arrayDeque = new ArrayDeque((Collection<? extends E>)Arrays.asList(Class8571.method28937(s, " ")));
        final String s2 = (String)arrayDeque.poll();
        final Class347 obj = (Class347)class8652.method29471((String)arrayDeque.poll(), Class347.values(), "texture type");
        if (obj == null) {
            Class8885.method31271("Invalid raw texture type: " + s);
            return null;
        }
        final Class2110 class8653 = (Class2110)class8652.method29471((String)arrayDeque.poll(), Class2110.values(), "internal format");
        if (class8653 == null) {
            Class8885.method31271("Invalid raw texture internal format: " + s);
            return null;
        }
        int n2 = 0;
        int method29456 = 0;
        int n3 = 0;
        switch (Class9349.field40125[obj.ordinal()]) {
            case 1: {
                n3 = class8652.method29456((String)arrayDeque.poll(), -1);
                break;
            }
            case 2: {
                n3 = class8652.method29456((String)arrayDeque.poll(), -1);
                n2 = class8652.method29456((String)arrayDeque.poll(), -1);
                break;
            }
            case 3: {
                n3 = class8652.method29456((String)arrayDeque.poll(), -1);
                n2 = class8652.method29456((String)arrayDeque.poll(), -1);
                method29456 = class8652.method29456((String)arrayDeque.poll(), -1);
                break;
            }
            case 4: {
                n3 = class8652.method29456((String)arrayDeque.poll(), -1);
                n2 = class8652.method29456((String)arrayDeque.poll(), -1);
                break;
            }
            default: {
                Class8885.method31271("Invalid raw texture type: " + obj);
                return null;
            }
        }
        if (n3 < 0 || n2 < 0 || method29456 < 0) {
            Class8885.method31271("Invalid raw texture size: " + s);
            return null;
        }
        final Class2010 class8654 = (Class2010)class8652.method29471((String)arrayDeque.poll(), Class2010.values(), "pixel format");
        if (class8654 == null) {
            Class8885.method31271("Invalid raw texture pixel format: " + s);
            return null;
        }
        final Class2127 class8655 = (Class2127)class8652.method29471((String)arrayDeque.poll(), Class2127.values(), "pixel type");
        if (class8655 == null) {
            Class8885.method31271("Invalid raw texture pixel type: " + s);
            return null;
        }
        if (!arrayDeque.isEmpty()) {
            Class8885.method31271("Invalid raw texture, too many parameters: " + s);
            return null;
        }
        return method33717(n, s, s2, obj, class8653, n3, n2, method29456, class8654, class8655);
    }
    
    private static Class4114 method33717(final int n, final String s, final String s2, final Class347 class347, final Class2110 class348, final int n2, final int n3, final int n4, final Class2010 class349, final Class2127 class350) {
        try {
            final InputStream method21531 = Class9216.field39324.method21531("shaders/" + Class9518.method35517(s2, "/"));
            if (method21531 == null) {
                Class8885.method31271("Raw texture not found: " + s2);
                return null;
            }
            final byte[] method21532 = Class8571.method28961(method21531);
            IOUtils.closeQuietly(method21531);
            final ByteBuffer method21533 = Class9078.method32715(method21532.length);
            method21533.put(method21532);
            method21533.flip();
            return new Class4116(class347, class348, n2, n3, n4, class349, class350, method21533, n);
        }
        catch (final IOException ex) {
            Class8885.method31271("Error loading raw texture: " + s2);
            Class8885.method31271("" + ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
    }
    
    private static Class4114 method33718(final int n, String str) {
        str = str.trim();
        if (str.indexOf(46) < 0) {
            str += ".png";
        }
        try {
            final String string = "shaders/" + Class9518.method35517(str, "/");
            final InputStream method21531 = Class9216.field39324.method21531(string);
            if (method21531 == null) {
                Class8885.method31271("Texture not found: " + str);
                return null;
            }
            IOUtils.closeQuietly(method21531);
            final Class1766 class1766 = new Class1766(string);
            class1766.method5871(Class9216.field39031.method5291());
            return new Class4117(n, string, class1766);
        }
        catch (final IOException ex) {
            Class8885.method31271("Error loading texture: " + str);
            Class8885.method31271("" + ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
    }
    
    private static int method33719(final int n, final String s) {
        if (n == 0) {
            if (s.equals("texture")) {
                return 0;
            }
            if (s.equals("lightmap")) {
                return 1;
            }
            if (s.equals("normals")) {
                return 2;
            }
            if (s.equals("specular")) {
                return 3;
            }
            if (s.equals("shadowtex0") || s.equals("watershadow")) {
                return 4;
            }
            if (s.equals("shadow")) {
                return Class9216.field39234 ? 5 : 4;
            }
            if (s.equals("shadowtex1")) {
                return 5;
            }
            if (s.equals("depthtex0")) {
                return 6;
            }
            if (s.equals("gaux1")) {
                return 7;
            }
            if (s.equals("gaux2")) {
                return 8;
            }
            if (s.equals("gaux3")) {
                return 9;
            }
            if (s.equals("gaux4")) {
                return 10;
            }
            if (s.equals("depthtex1")) {
                return 12;
            }
            if (s.equals("shadowcolor0") || s.equals("shadowcolor")) {
                return 13;
            }
            if (s.equals("shadowcolor1")) {
                return 14;
            }
            if (s.equals("noisetex")) {
                return 15;
            }
        }
        if (n == 1 || n == 2) {
            if (s.equals("colortex0") || s.equals("colortex0")) {
                return 0;
            }
            if (s.equals("colortex1") || s.equals("gdepth")) {
                return 1;
            }
            if (s.equals("colortex2") || s.equals("gnormal")) {
                return 2;
            }
            if (s.equals("colortex3") || s.equals("composite")) {
                return 3;
            }
            if (s.equals("shadowtex0") || s.equals("watershadow")) {
                return 4;
            }
            if (s.equals("shadow")) {
                return Class9216.field39234 ? 5 : 4;
            }
            if (s.equals("shadowtex1")) {
                return 5;
            }
            if (s.equals("depthtex0") || s.equals("gdepthtex")) {
                return 6;
            }
            if (s.equals("colortex4") || s.equals("gaux1")) {
                return 7;
            }
            if (s.equals("colortex5") || s.equals("gaux2")) {
                return 8;
            }
            if (s.equals("colortex6") || s.equals("gaux3")) {
                return 9;
            }
            if (s.equals("colortex7") || s.equals("gaux4")) {
                return 10;
            }
            if (s.equals("depthtex1")) {
                return 11;
            }
            if (s.equals("depthtex2")) {
                return 12;
            }
            if (s.equals("shadowcolor0") || s.equals("shadowcolor")) {
                return 13;
            }
            if (s.equals("shadowcolor1")) {
                return 14;
            }
            if (s.equals("noisetex")) {
                return 15;
            }
        }
        return -1;
    }
    
    private static void method33720(final Class4114[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class4114 class4114 = array[i];
                Class8933.method31608(33984 + class4114.method12363());
                final int method12362 = class4114.method12362();
                final int method12363 = class4114.method12364();
                if (method12363 == 3553) {
                    Class8933.method31617(method12362);
                }
                else {
                    GL11.glBindTexture(method12363, method12362);
                }
            }
        }
    }
    
    private static void method33721() {
        method33722(Class9216.field39359);
        method33722(Class9216.field39360);
        method33722(Class9216.field39361);
        Class9216.field39359 = null;
        Class9216.field39360 = null;
        Class9216.field39361 = null;
    }
    
    private static void method33722(final Class4114[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                array[i].method12358();
            }
        }
    }
    
    public static Class5601[] method33723(final String str) {
        Class5601[] array = Class9216.field39333.clone();
        if (Class9216.field39336 == null) {
            if (Class9216.field39335 != null) {
                array = (Class5601[])Class8571.method28983(array, new Class5603(Class9216.field39335, array), 0);
            }
            return method33729(array);
        }
        final Class9442 class9442 = Class9216.field39336.get((str != null) ? ("screen." + str) : "screen");
        if (class9442 == null) {
            return new Class5601[0];
        }
        final Class5601[] method35080 = class9442.method35080();
        final ArrayList list = new ArrayList();
        for (int i = 0; i < method35080.length; ++i) {
            final Class5601 class9443 = method35080[i];
            if (class9443 == null) {
                list.add(null);
            }
            else if (class9443 instanceof Class5602) {
                list.addAll(Arrays.asList(method33725(Class9216.field39336, array)));
            }
            else {
                list.add(class9443);
            }
        }
        return (Class5601[])list.toArray(new Class5601[list.size()]);
    }
    
    public static int method33724(final String str, final int n) {
        final String s = (str != null) ? ("screen." + str) : "screen";
        if (Class9216.field39336 == null) {
            return n;
        }
        final Class9442 class9442 = Class9216.field39336.get(s);
        return (class9442 == null) ? n : class9442.method35081();
    }
    
    private static Class5601[] method33725(final Map<String, Class9442> map, final Class5601[] array) {
        final HashSet set = new HashSet();
        final Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            final Class5601[] method35080 = map.get(iterator.next()).method35080();
            for (int i = 0; i < method35080.length; ++i) {
                final Class5601 class5601 = method35080[i];
                if (class5601 != null) {
                    set.add(class5601.method16860());
                }
            }
        }
        final ArrayList list = new ArrayList();
        for (int j = 0; j < array.length; ++j) {
            final Class5601 class5602 = array[j];
            if (class5602.method16875() && !set.contains(class5602.method16860())) {
                list.add(class5602);
            }
        }
        return (Class5601[])list.toArray(new Class5601[list.size()]);
    }
    
    public static Class5601 method33726(final String s) {
        return Class7510.method23440(s, Class9216.field39333);
    }
    
    public static Class5601[] method33727() {
        return Class9216.field39333;
    }
    
    public static boolean method33728(final String s) {
        return Class9216.field39334 != null && Class9216.field39334.contains(s);
    }
    
    private static Class5601[] method33729(final Class5601[] array) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; ++i) {
            final Class5601 class5601 = array[i];
            if (class5601.method16875()) {
                list.add(class5601);
            }
        }
        return (Class5601[])list.toArray(new Class5601[list.size()]);
    }
    
    public static void method33730() {
        method33731(Class9216.field39333, Class9216.field39324);
    }
    
    private static void method33731(final Class5601[] array, final Class7038 class7038) {
        final Class27 class7039 = new Class27();
        if (Class9216.field39333 != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class5601 class7040 = array[i];
                if (class7040.method16874() && class7040.method16872()) {
                    class7039.setProperty(class7040.method16860(), class7040.method16863());
                }
            }
        }
        try {
            method33732(class7038, class7039);
        }
        catch (final IOException ex) {
            Class8571.method28848("[Shaders] Error saving configuration for " + Class9216.field39324.method21530());
            ex.printStackTrace();
        }
    }
    
    private static void method33732(final Class7038 class7038, final Properties properties) throws IOException {
        final File file = new File(Class869.method5277().field4652, "shaderpacks/" + class7038.method21530() + ".txt");
        if (properties.isEmpty()) {
            file.delete();
        }
        else {
            final FileOutputStream out = new FileOutputStream(file);
            properties.store(out, null);
            out.flush();
            out.close();
        }
    }
    
    private static Class5601[] method33733() {
        try {
            final Class5601[] method23548 = Class7528.method23548(Class9216.field39324, Class9216.field39251.method34738(), Class9216.field39358);
            final Properties method23549 = method33734(Class9216.field39324);
            for (int i = 0; i < method23548.length; ++i) {
                final Class5601 class5601 = method23548[i];
                final String property = method23549.getProperty(class5601.method16860());
                if (property != null) {
                    class5601.method16866();
                    if (!class5601.method16864(property)) {
                        Class8571.method28848("[Shaders] Invalid value, option: " + class5601.method16860() + ", value: " + property);
                    }
                }
            }
            return method23548;
        }
        catch (final IOException ex) {
            Class8571.method28848("[Shaders] Error reading configuration for " + Class9216.field39324.method21530());
            ex.printStackTrace();
            return null;
        }
    }
    
    private static Properties method33734(final Class7038 class7038) throws IOException {
        final Class27 class7039 = new Class27();
        final File file = new File(Class869.method5277().field4652, "shaderpacks/" + class7038.method21530() + ".txt");
        if (file.exists() && file.isFile() && file.canRead()) {
            final FileInputStream inStream = new FileInputStream(file);
            class7039.load(inStream);
            inStream.close();
            return class7039;
        }
        return class7039;
    }
    
    public static Class5601[] method33735(final Class5601[] array) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; ++i) {
            final Class5601 class5601 = array[i];
            if (class5601.method16872() && class5601.method16874()) {
                list.add(class5601);
            }
        }
        return (Class5601[])list.toArray(new Class5601[list.size()]);
    }
    
    private static String method33736(String method16883, final Class5601[] array) {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; ++i) {
                final Class5601 class5601 = array[i];
                if (class5601.method16880(method16883)) {
                    method16883 = class5601.method16883();
                    break;
                }
            }
            return method16883;
        }
        return method16883;
    }
    
    public static ArrayList method33737() {
        final ArrayList list = new ArrayList();
        list.add("OFF");
        list.add("(internal)");
        final int size = list.size();
        try {
            if (!Class9216.field39331.exists()) {
                Class9216.field39331.mkdir();
            }
            final File[] listFiles = Class9216.field39331.listFiles();
            for (int i = 0; i < listFiles.length; ++i) {
                final File parent = listFiles[i];
                final String name = parent.getName();
                if (parent.isDirectory()) {
                    if (!name.equals("debug")) {
                        final File file = new File(parent, "shaders");
                        if (file.exists() && file.isDirectory()) {
                            list.add(name);
                        }
                    }
                }
                else if (parent.isFile() && name.toLowerCase().endsWith(".zip")) {
                    list.add(name);
                }
            }
        }
        catch (final Exception ex) {}
        Collections.sort((List<Object>)list.subList(size, list.size()), (Comparator<? super Object>)String.CASE_INSENSITIVE_ORDER);
        return list;
    }
    
    public static int method33738(final String s) {
        final int glCheckFramebufferStatusEXT = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
        if (glCheckFramebufferStatusEXT != 36053) {
            System.err.format("FramebufferStatus 0x%04X at %s\n", glCheckFramebufferStatusEXT, s);
        }
        return glCheckFramebufferStatusEXT;
    }
    
    public static int method33739(final String s) {
        final int method31662 = Class8933.method31662();
        if (method31662 != 0 && Class8492.method28378(method31662)) {
            final String method31663 = Class8571.method29017(method31662);
            Class8885.method31270(String.format("OpenGL error: %s (%s)%s, at: %s", method31662, method31663, method33740(method31662, s), s));
            if (Class8571.method29013() && Class9419.method35020("ShowGlErrorShaders", 10000L)) {
                method33743(Class8822.method30773("of.message.openglError", method31662, method31663));
            }
        }
        return method31662;
    }
    
    private static String method33740(final int n, final String s) {
        final StringBuilder sb = new StringBuilder();
        if (n == 1286) {
            final int glCheckFramebufferStatusEXT = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            sb.append(", fbStatus: " + glCheckFramebufferStatusEXT + " (" + method33742(glCheckFramebufferStatusEXT) + ")");
        }
        String method32326 = Class9216.field39287.method32326();
        if (method32326.isEmpty()) {
            method32326 = "none";
        }
        sb.append(", program: " + method32326);
        final Class9023 method32327 = method33741(Class9216.field39288);
        if (method32327 != Class9216.field39287) {
            String method32328 = method32327.method32326();
            if (method32328.isEmpty()) {
                method32328 = "none";
            }
            sb.append(" (" + method32328 + ")");
        }
        if (s.equals("setDrawBuffers")) {
            sb.append(", drawBuffers: " + Class9216.field39287.method32331());
        }
        return sb.toString();
    }
    
    private static Class9023 method33741(final int n) {
        for (int i = 0; i < Class9216.field39286.length; ++i) {
            final Class9023 class9023 = Class9216.field39286[i];
            if (class9023.method32329() == n) {
                return class9023;
            }
        }
        return Class9216.field39252;
    }
    
    private static String method33742(final int n) {
        switch (n) {
            case 33305: {
                return "Undefined";
            }
            case 36053: {
                return "Complete";
            }
            case 36054: {
                return "Incomplete attachment";
            }
            case 36055: {
                return "Incomplete missing attachment";
            }
            case 36059: {
                return "Incomplete draw buffer";
            }
            case 36060: {
                return "Incomplete read buffer";
            }
            case 36061: {
                return "Unsupported";
            }
            case 36182: {
                return "Incomplete multisample";
            }
            case 36264: {
                return "Incomplete layer targets";
            }
            default: {
                return "Unknown";
            }
        }
    }
    
    private static void method33743(final String s) {
        Class9216.field39031.field4647.method3807().method3761(new StringTextComponent(s));
    }
    
    private static void method33744(final String s) {
        Class8885.method31270(s);
        Class9216.field39031.field4647.method3807().method3761(new StringTextComponent(s));
    }
    
    public static void method33745(final String str, final IntBuffer intBuffer) {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(str).append(" [pos ").append(intBuffer.position()).append(" lim ").append(intBuffer.limit()).append(" cap ").append(intBuffer.capacity()).append(" :");
        for (int limit = intBuffer.limit(), i = 0; i < limit; ++i) {
            sb.append(" ").append(intBuffer.get(i));
        }
        sb.append("]");
        Class8885.method31272(sb.toString());
    }
    
    public static void method33746(Class869 method5277) {
        method33894();
        Class9216.field39031 = method5277;
        method5277 = Class869.method5277();
        Class9216.field39035 = GL.getCapabilities();
        Class9216.field39036 = GL11.glGetString(7938);
        Class9216.field39037 = GL11.glGetString(7936);
        Class9216.field39038 = GL11.glGetString(7937);
        Class8885.method31272("OpenGL Version: " + Class9216.field39036);
        Class8885.method31272("Vendor:  " + Class9216.field39037);
        Class8885.method31272("Renderer: " + Class9216.field39038);
        Class8885.method31272("Capabilities: " + (Class9216.field39035.OpenGL20 ? " 2.0 " : " - ") + (Class9216.field39035.OpenGL21 ? " 2.1 " : " - ") + (Class9216.field39035.OpenGL30 ? " 3.0 " : " - ") + (Class9216.field39035.OpenGL32 ? " 3.2 " : " - ") + (Class9216.field39035.OpenGL40 ? " 4.0 " : " - "));
        Class8885.method31272("GL_MAX_DRAW_BUFFERS: " + GL32.glGetInteger(34852));
        Class8885.method31272("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL32.glGetInteger(36063));
        Class8885.method31272("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL32.glGetInteger(34930));
        Class9216.field39039 = Class9216.field39035.OpenGL30;
        method33703();
    }
    
    public static void method33747() {
        if (method33750()) {
            Class9216.field39371 = 0.5f;
            Class9216.field39372 = 0.6f;
            Class9216.field39373 = 0.8f;
        }
        else {
            Class9216.field39371 = 1.0f;
            Class9216.field39372 = 1.0f;
            Class9216.field39373 = 1.0f;
        }
    }
    
    public static boolean method33748() {
        if (!Class9216.field39316.method21688()) {
            return Class9216.field39316.method21689();
        }
        return Class9216.field39341.method21688() || Class9216.field39341.method21689();
    }
    
    public static boolean method33749() {
        return Class9216.field39342.method21688() || Class9216.field39342.method21689();
    }
    
    public static boolean method33750() {
        if (!Class9216.field39315.method21688()) {
            return Class9216.field39315.method21689();
        }
        return Class9216.field39340.method21688() || Class9216.field39340.method21689();
    }
    
    public static boolean method33751() {
        return !Class9216.field39343.method21690();
    }
    
    public static boolean method33752() {
        return !Class9216.field39344.method21690();
    }
    
    public static boolean method33753() {
        return !Class9216.field39345.method21690();
    }
    
    public static boolean method33754() {
        return !Class9216.field39346.method21690();
    }
    
    public static boolean method33755() {
        return !Class9216.field39347.method21690();
    }
    
    public static boolean method33756(final Class6332 class6332) {
        if (class6332 == Class9484.field40759) {
            return Class9216.field39348.method21689();
        }
        if (class6332 == Class9484.field40761) {
            return Class9216.field39349.method21689();
        }
        if (class6332 == Class9484.field40760) {
            return Class9216.field39350.method21689();
        }
        return class6332 == Class9484.field40762 && Class9216.field39351.method21689();
    }
    
    public static boolean method33757() {
        return Class9216.field39352.method21689();
    }
    
    public static boolean method33758() {
        return Class9216.field39353.method21689();
    }
    
    public static boolean method33759() {
        return Class9216.field39354.method21689();
    }
    
    public static boolean method33760() {
        return !Class9216.field39355.method21690();
    }
    
    public static void method33761() {
        boolean b;
        if (!Class9216.field39033) {
            Class9216.field39033 = true;
            b = true;
        }
        else {
            b = false;
        }
        if (!Class9216.field39034) {
            method33739("Shaders.init pre");
            if (method33891() != null) {}
            if (!Class9216.field39035.OpenGL20) {
                method33744("No OpenGL 2.0");
            }
            if (!Class9216.field39035.GL_EXT_framebuffer_object) {
                method33744("No EXT_framebuffer_object");
            }
            Class9216.field39415.position().limit(8);
            Class9216.field39411.position().limit(16);
            Class9216.field39412.position().limit(3);
            Class9216.field39416.position().limit(8);
            Class9216.field39414.position().limit(2);
            Class9216.field39413.position().limit(8);
            Class9216.field39240 = 4;
            Class9216.field39241 = 1;
            Class9216.field39242 = 0;
            Class9216.field39243 = 0;
            Class9216.field39244 = 1;
            Class9216.field39245 = 1;
            Arrays.fill(Class9216.field39248, 6408);
            Arrays.fill(Class9216.field39249, true);
            Arrays.fill(Class9216.field39250, null);
            Arrays.fill(Class9216.field39296, false);
            Arrays.fill(Class9216.field39297, false);
            Arrays.fill(Class9216.field39298, false);
            Arrays.fill(Class9216.field39299, false);
            Arrays.fill(Class9216.field39300, false);
            Class9216.field39103 = false;
            Class9216.field39386 = false;
            Class9216.field39375 = 0.0f;
            Class9216.field39382 = 2.0f;
            Class9216.field39224 = 1024;
            Class9216.field39225 = 1024;
            Class9216.field39226 = 1024;
            Class9216.field39227 = 1024;
            Class9216.field39228 = 90.0f;
            Class9216.field39229 = 160.0f;
            Class9216.field39230 = true;
            Class9216.field39231 = -1.0f;
            Class9216.field39374 = -1.0f;
            Class9216.field39113 = false;
            Class9216.field39114 = false;
            Class9216.field39115 = false;
            Class9216.field39234 = false;
            Class9216.field39121 = false;
            method33747();
            Class7901.method25572();
            Class9216.field39124.method32968();
            if (Class9216.field39363 != null) {
                Class9216.field39363.method21194();
            }
            final Class9319 method23441 = Class7510.method23441(Class9216.field39335, Class9216.field39333, false);
            String string = "";
            if (Class9216.field39357 != null) {
                final int method23442 = Class9216.field39357.dimension.getType().method1270();
                if (Class9216.field39358.contains(method23442)) {
                    string = "world" + method23442 + "/";
                }
            }
            for (int i = 0; i < Class9216.field39286.length; ++i) {
                final Class9023 class9023 = Class9216.field39286[i];
                class9023.method32322();
                class9023.method32323();
                if (class9023.method32327() != Class2219.field13625) {
                    String str = string + class9023.method32326();
                    boolean b2 = true;
                    if (Class9216.field39337.containsKey(str)) {
                        b2 = (b2 && Class9216.field39337.get(str).method1006());
                    }
                    if (method23441 != null) {
                        b2 = (b2 && !method23441.method34510(str));
                    }
                    if (!b2) {
                        Class8885.method31272("Program disabled: " + str);
                        str = string + "<disabled>";
                    }
                    final String string2 = "/shaders/" + str;
                    method33766(class9023, string2 + ".vsh", string2 + ".gsh", string2 + ".fsh");
                    if (class9023.method32329() > 0) {
                        Class8885.method31272("Program loaded: " + str);
                    }
                    method33762(class9023);
                    method33764(class9023);
                }
            }
            Class9216.field39290 = false;
            for (int j = 0; j < Class9216.field39277.length; ++j) {
                if (Class9216.field39277[j].method32329() != 0) {
                    Class9216.field39290 = true;
                    break;
                }
            }
            Class9216.field39244 = Class9216.field39240;
            Class9216.field39222 = ((Class9216.field39243 > 0) ? 1 : 0);
            Class9216.field39233 = (Class9216.field39243 > 0);
            Class8885.method31272("usedColorBuffers: " + Class9216.field39240);
            Class8885.method31272("usedDepthBuffers: " + Class9216.field39241);
            Class8885.method31272("usedShadowColorBuffers: " + Class9216.field39242);
            Class8885.method31272("usedShadowDepthBuffers: " + Class9216.field39243);
            Class8885.method31272("usedColorAttachs: " + Class9216.field39244);
            Class8885.method31272("usedDrawBuffers: " + Class9216.field39245);
            Class9216.field39415.position().limit(Class9216.field39245);
            Class9216.field39411.position().limit(Class9216.field39240 * 2);
            Class9216.field39419.method34617();
            for (int k = 0; k < Class9216.field39245; ++k) {
                Class9216.field39415.put(k, 36064 + k);
            }
            final int glGetInteger = GL32.glGetInteger(34852);
            if (Class9216.field39245 > glGetInteger) {
                method33744("[Shaders] Error: Not enough draw buffers, needed: " + Class9216.field39245 + ", available: " + glGetInteger);
            }
            Class9216.field39416.position().limit(Class9216.field39242);
            for (int l = 0; l < Class9216.field39242; ++l) {
                Class9216.field39416.put(l, 36064 + l);
            }
            for (int n = 0; n < Class9216.field39286.length; ++n) {
                Class9023 method23443;
                Class9023 class9024;
                for (class9024 = (method23443 = Class9216.field39286[n]); method23443.method32329() == 0 && method23443.method32328() != method23443; method23443 = method23443.method32328()) {}
                if (method23443 != class9024 && class9024 != Class9216.field39253) {
                    class9024.method32324(method23443);
                }
            }
            method33791();
            method33792();
            if (Class9216.field39386) {
                method33785();
            }
            if (Class9216.field39295 == null) {
                Class9216.field39295 = Class8990.method32053();
            }
            final Class7351 class9025 = new Class7351();
            class9025.method22566(Vector3f.YP.rotationDegrees(-90.0f));
            method33810(class9025);
            method33811(class9025);
            Class9216.field39034 = true;
            method33786();
            method33765();
            if (!b) {}
            method33739("Shaders.init");
        }
    }
    
    private static void method33762(final Class9023 class9023) {
        final int glGetInteger = GL32.glGetInteger(34852);
        Arrays.fill(class9023.method32340(), false);
        if (class9023 == Class9216.field39284) {
            class9023.method32344(null);
        }
        else if (class9023.method32329() == 0) {
            if (class9023 == Class9216.field39253) {
                class9023.method32344(Class9216.field39417);
            }
            else {
                class9023.method32344(Class9216.field39418);
            }
        }
        else {
            final String method32331 = class9023.method32331();
            if (method32331 == null) {
                if (class9023 != Class9216.field39253 && class9023 != Class9216.field39254 && class9023 != Class9216.field39255) {
                    class9023.method32344(Class9216.field39415);
                    Class9216.field39245 = Class9216.field39240;
                    Arrays.fill(class9023.method32340(), 0, Class9216.field39240, true);
                }
                else {
                    class9023.method32344(Class9216.field39416);
                }
            }
            else {
                final IntBuffer method32332 = class9023.method32333();
                final int length = method32331.length();
                Class9216.field39245 = Math.max(Class9216.field39245, length);
                final int min = Math.min(length, glGetInteger);
                class9023.method32344(method32332);
                method32332.limit();
                for (int i = 0; i < min; ++i) {
                    method32332.put(i, method33763(class9023, method32331, i));
                }
            }
        }
    }
    
    private static int method33763(final Class9023 class9023, final String s, final int index) {
        int n = 0;
        if (index >= s.length()) {
            return n;
        }
        final int b = s.charAt(index) - '0';
        if (class9023 == Class9216.field39253) {
            if (b >= 0 && b <= 1) {
                n = b + 36064;
                Class9216.field39242 = Math.max(Class9216.field39242, b);
            }
            return n;
        }
        if (b >= 0 && b <= 7) {
            class9023.method32340()[b] = true;
            n = b + 36064;
            Class9216.field39244 = Math.max(Class9216.field39244, b);
            Class9216.field39240 = Math.max(Class9216.field39240, b);
        }
        return n;
    }
    
    private static void method33764(final Class9023 class9023) {
        final boolean[] method32340 = class9023.method32340();
        final Boolean[] method32341 = class9023.method32339();
        for (int i = 0; i < method32341.length; ++i) {
            final Boolean b = method32341[i];
            if (b != null) {
                method32340[i] = b;
            }
        }
    }
    
    public static void method33765() {
        Class8885.method31272("Reset model renderers");
        ++Class9216.field39040;
        Class8885.method31272("Reset world renderers");
        Class9216.field39031.field4636.method5701();
    }
    
    private static void method33766(final Class9023 class9023, final String s, final String s2, final String s3) {
        method33739("pre setupProgram");
        final int glCreateProgramObjectARB = ARBShaderObjects.glCreateProgramObjectARB();
        method33739("create");
        if (glCreateProgramObjectARB != 0) {
            Class9216.field39116 = false;
            Class9216.field39117 = false;
            Class9216.field39118 = false;
            final int method33767 = method33767(class9023, s);
            final int method33768 = method33768(class9023, s2);
            final int method33769 = method33769(class9023, s3);
            method33739("create");
            if (method33767 == 0 && method33768 == 0 && method33769 == 0) {
                ARBShaderObjects.glDeleteObjectARB(glCreateProgramObjectARB);
                class9023.method32322();
            }
            else {
                if (method33767 != 0) {
                    ARBShaderObjects.glAttachObjectARB(glCreateProgramObjectARB, method33767);
                    method33739("attach");
                }
                if (method33768 != 0) {
                    ARBShaderObjects.glAttachObjectARB(glCreateProgramObjectARB, method33768);
                    method33739("attach");
                    if (Class9216.field39119) {
                        ARBGeometryShader4.glProgramParameteriARB(glCreateProgramObjectARB, 36315, 4);
                        ARBGeometryShader4.glProgramParameteriARB(glCreateProgramObjectARB, 36316, 5);
                        ARBGeometryShader4.glProgramParameteriARB(glCreateProgramObjectARB, 36314, Class9216.field39120);
                        method33739("arbGeometryShader4");
                    }
                    Class9216.field39121 = true;
                }
                if (method33769 != 0) {
                    ARBShaderObjects.glAttachObjectARB(glCreateProgramObjectARB, method33769);
                    method33739("attach");
                }
                if (Class9216.field39116) {
                    ARBVertexShader.glBindAttribLocationARB(glCreateProgramObjectARB, Class9216.field39110, (CharSequence)"mc_Entity");
                    method33739("mc_Entity");
                }
                if (Class9216.field39117) {
                    ARBVertexShader.glBindAttribLocationARB(glCreateProgramObjectARB, Class9216.field39111, (CharSequence)"mc_midTexCoord");
                    method33739("mc_midTexCoord");
                }
                if (Class9216.field39118) {
                    ARBVertexShader.glBindAttribLocationARB(glCreateProgramObjectARB, Class9216.field39112, (CharSequence)"at_tangent");
                    method33739("at_tangent");
                }
                ARBShaderObjects.glLinkProgramARB(glCreateProgramObjectARB);
                if (GL32.glGetProgrami(glCreateProgramObjectARB, 35714) != 1) {
                    Class8885.method31270("Error linking program: " + glCreateProgramObjectARB + " (" + class9023.method32326() + ")");
                }
                method33773(glCreateProgramObjectARB, class9023.method32326());
                if (method33767 != 0) {
                    ARBShaderObjects.glDetachObjectARB(glCreateProgramObjectARB, method33767);
                    ARBShaderObjects.glDeleteObjectARB(method33767);
                }
                if (method33768 != 0) {
                    ARBShaderObjects.glDetachObjectARB(glCreateProgramObjectARB, method33768);
                    ARBShaderObjects.glDeleteObjectARB(method33768);
                }
                if (method33769 != 0) {
                    ARBShaderObjects.glDetachObjectARB(glCreateProgramObjectARB, method33769);
                    ARBShaderObjects.glDeleteObjectARB(method33769);
                }
                class9023.method32341(glCreateProgramObjectARB);
                class9023.method32342(glCreateProgramObjectARB);
                method33776(class9023);
                ARBShaderObjects.glValidateProgramARB(glCreateProgramObjectARB);
                method33776(Class9216.field39252);
                method33773(glCreateProgramObjectARB, class9023.method32326());
                if (GL32.glGetProgrami(glCreateProgramObjectARB, 35715) != 1) {
                    final String s4 = "\"";
                    method33744("[Shaders] Error: Invalid program " + s4 + class9023.method32326() + s4);
                    ARBShaderObjects.glDeleteObjectARB(glCreateProgramObjectARB);
                    class9023.method32322();
                }
            }
        }
    }
    
    private static int method33767(final Class9023 class9023, final String s) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(35633);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        final StringBuilder sb = new StringBuilder(131072);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(method33770(s));
        }
        catch (final Exception ex) {
            ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
            return 0;
        }
        final Class5601[] method33735 = method33735(Class9216.field39333);
        final ArrayList list = new ArrayList();
        if (bufferedReader != null) {
            try {
                final BufferedReader method33736 = Class7528.method23562(bufferedReader, s, Class9216.field39324, 0, list, 0);
                final Class7986 class9024 = new Class7986();
                while (true) {
                    final String line = method33736.readLine();
                    if (line == null) {
                        break;
                    }
                    final String method33737 = method33736(line, method33735);
                    sb.append(method33737).append('\n');
                    if (!class9024.method26049(method33737)) {
                        continue;
                    }
                    final Class9004 method33738 = Class8628.method29283(method33737);
                    if (method33738 == null) {
                        continue;
                    }
                    if (method33738.method32184("mc_Entity")) {
                        Class9216.field39113 = true;
                        Class9216.field39116 = true;
                    }
                    else if (method33738.method32184("mc_midTexCoord")) {
                        Class9216.field39114 = true;
                        Class9216.field39117 = true;
                    }
                    else if (method33738.method32184("at_tangent")) {
                        Class9216.field39115 = true;
                        Class9216.field39118 = true;
                    }
                    if (!method33738.method32193("countInstances")) {
                        continue;
                    }
                    class9023.method32346(method33738.method32206());
                    Class8885.method31272("countInstances: " + class9023.method32335());
                }
                method33736.close();
            }
            catch (final Exception ex2) {
                Class8885.method31270("Couldn't read " + s + "!");
                ex2.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
                return 0;
            }
        }
        if (Class9216.field39370) {
            method33771(s, sb.toString());
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)sb);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (GL32.glGetShaderi(glCreateShaderObjectARB, 35713) != 1) {
            Class8885.method31270("Error compiling vertex shader: " + s);
        }
        method33774(glCreateShaderObjectARB, s, list);
        return glCreateShaderObjectARB;
    }
    
    private static int method33768(final Class9023 class9023, final String s) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(36313);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        final StringBuilder sb = new StringBuilder(131072);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(method33770(s));
        }
        catch (final Exception ex) {
            ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
            return 0;
        }
        final Class5601[] method33735 = method33735(Class9216.field39333);
        final ArrayList list = new ArrayList();
        Class9216.field39119 = false;
        Class9216.field39120 = 3;
        if (bufferedReader != null) {
            try {
                final BufferedReader method33736 = Class7528.method23562(bufferedReader, s, Class9216.field39324, 0, list, 0);
                final Class7986 class9024 = new Class7986();
                while (true) {
                    final String line = method33736.readLine();
                    if (line == null) {
                        break;
                    }
                    final String method33737 = method33736(line, method33735);
                    sb.append(method33737).append('\n');
                    if (!class9024.method26049(method33737)) {
                        continue;
                    }
                    final Class9004 method33738 = Class8628.method29283(method33737);
                    if (method33738 == null) {
                        continue;
                    }
                    if (method33738.method32197("GL_ARB_geometry_shader4")) {
                        final String method33739 = Class8571.method28980(method33738.method32180());
                        if (method33739.equals("enable") || method33739.equals("require") || method33739.equals("warn")) {
                            Class9216.field39119 = true;
                        }
                    }
                    if (!method33738.method32193("maxVerticesOut")) {
                        continue;
                    }
                    Class9216.field39120 = method33738.method32206();
                }
                method33736.close();
            }
            catch (final Exception ex2) {
                Class8885.method31270("Couldn't read " + s + "!");
                ex2.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
                return 0;
            }
        }
        if (Class9216.field39370) {
            method33771(s, sb.toString());
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)sb);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (GL32.glGetShaderi(glCreateShaderObjectARB, 35713) != 1) {
            Class8885.method31270("Error compiling geometry shader: " + s);
        }
        method33774(glCreateShaderObjectARB, s, list);
        return glCreateShaderObjectARB;
    }
    
    private static int method33769(final Class9023 class9023, final String s) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(35632);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        final StringBuilder sb = new StringBuilder(131072);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(method33770(s));
        }
        catch (final Exception ex) {
            ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
            return 0;
        }
        final Class5601[] method33735 = method33735(Class9216.field39333);
        final ArrayList list = new ArrayList();
        if (bufferedReader != null) {
            try {
                final BufferedReader method33736 = Class7528.method23562(bufferedReader, s, Class9216.field39324, 0, list, 0);
                final Class7986 class9024 = new Class7986();
                while (true) {
                    final String line = method33736.readLine();
                    if (line == null) {
                        break;
                    }
                    final String method33737 = method33736(line, method33735);
                    sb.append(method33737).append('\n');
                    if (!class9024.method26049(method33737)) {
                        continue;
                    }
                    final Class9004 method33738 = Class8628.method29283(method33737);
                    if (method33738 == null) {
                        continue;
                    }
                    if (method33738.method32181()) {
                        final String method33739 = method33738.method32179();
                        final int method33740;
                        if ((method33740 = Class8628.method29285(method33739)) >= 0) {
                            Class9216.field39243 = Math.max(Class9216.field39243, method33740 + 1);
                        }
                        else {
                            final int method33741;
                            if ((method33741 = Class8628.method29286(method33739)) >= 0) {
                                Class9216.field39242 = Math.max(Class9216.field39242, method33741 + 1);
                            }
                            else {
                                final int method33742;
                                if ((method33742 = Class8628.method29287(method33739)) >= 0) {
                                    Class9216.field39241 = Math.max(Class9216.field39241, method33742 + 1);
                                }
                                else if (method33739.equals("gdepth") && Class9216.field39248[1] == 6408) {
                                    Class9216.field39248[1] = 34836;
                                }
                                else {
                                    final int method33743;
                                    if ((method33743 = Class8628.method29288(method33739)) >= 0) {
                                        Class9216.field39240 = Math.max(Class9216.field39240, method33743 + 1);
                                    }
                                    else {
                                        if (!method33739.equals("centerDepthSmooth")) {
                                            continue;
                                        }
                                        Class9216.field39103 = true;
                                    }
                                }
                            }
                        }
                    }
                    else if (!method33738.method32193("shadowMapResolution") && !method33738.method32191("SHADOWRES")) {
                        if (!method33738.method32195("shadowMapFov") && !method33738.method32191("SHADOWFOV")) {
                            if (!method33738.method32195("shadowDistance") && !method33738.method32191("SHADOWHPL")) {
                                if (method33738.method32195("shadowDistanceRenderMul")) {
                                    Class9216.field39231 = method33738.method32207();
                                    Class8885.method31272("Shadow distance render mul: " + Class9216.field39231);
                                }
                                else if (method33738.method32195("shadowIntervalSize")) {
                                    Class9216.field39382 = method33738.method32207();
                                    Class8885.method31272("Shadow map interval size: " + Class9216.field39382);
                                }
                                else if (method33738.method32202("generateShadowMipmap", true)) {
                                    Arrays.fill(Class9216.field39297, true);
                                    Class8885.method31272("Generate shadow mipmap");
                                }
                                else if (method33738.method32202("generateShadowColorMipmap", true)) {
                                    Arrays.fill(Class9216.field39299, true);
                                    Class8885.method31272("Generate shadow color mipmap");
                                }
                                else if (method33738.method32202("shadowHardwareFiltering", true)) {
                                    Arrays.fill(Class9216.field39296, true);
                                    Class8885.method31272("Hardware shadow filtering enabled.");
                                }
                                else if (method33738.method32202("shadowHardwareFiltering0", true)) {
                                    Class9216.field39296[0] = true;
                                    Class8885.method31272("shadowHardwareFiltering0");
                                }
                                else if (method33738.method32202("shadowHardwareFiltering1", true)) {
                                    Class9216.field39296[1] = true;
                                    Class8885.method31272("shadowHardwareFiltering1");
                                }
                                else if (method33738.method32203("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                                    Class9216.field39297[0] = true;
                                    Class8885.method31272("shadowtex0Mipmap");
                                }
                                else if (method33738.method32202("shadowtex1Mipmap", true)) {
                                    Class9216.field39297[1] = true;
                                    Class8885.method31272("shadowtex1Mipmap");
                                }
                                else if (method33738.method32203("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                                    Class9216.field39299[0] = true;
                                    Class8885.method31272("shadowcolor0Mipmap");
                                }
                                else if (method33738.method32203("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                                    Class9216.field39299[1] = true;
                                    Class8885.method31272("shadowcolor1Mipmap");
                                }
                                else if (method33738.method32204("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                                    Class9216.field39298[0] = true;
                                    Class8885.method31272("shadowtex0Nearest");
                                }
                                else if (method33738.method32203("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                                    Class9216.field39298[1] = true;
                                    Class8885.method31272("shadowtex1Nearest");
                                }
                                else if (method33738.method32204("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                                    Class9216.field39300[0] = true;
                                    Class8885.method31272("shadowcolor0Nearest");
                                }
                                else if (method33738.method32204("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                                    Class9216.field39300[1] = true;
                                    Class8885.method31272("shadowcolor1Nearest");
                                }
                                else if (!method33738.method32195("wetnessHalflife") && !method33738.method32191("WETNESSHL")) {
                                    if (!method33738.method32195("drynessHalflife") && !method33738.method32191("DRYNESSHL")) {
                                        if (method33738.method32195("eyeBrightnessHalflife")) {
                                            Class9216.field39093 = method33738.method32207();
                                            Class8885.method31272("Eye brightness halflife: " + Class9216.field39093);
                                        }
                                        else if (method33738.method32195("centerDepthHalflife")) {
                                            Class9216.field39102 = method33738.method32207();
                                            Class8885.method31272("Center depth halflife: " + Class9216.field39102);
                                        }
                                        else if (method33738.method32195("sunPathRotation")) {
                                            Class9216.field39375 = method33738.method32207();
                                            Class8885.method31272("Sun path rotation: " + Class9216.field39375);
                                        }
                                        else if (method33738.method32195("ambientOcclusionLevel")) {
                                            Class9216.field39374 = Class8571.method28866(method33738.method32207(), 0.0f, 1.0f);
                                            Class8885.method31272("AO Level: " + Class9216.field39374);
                                        }
                                        else if (method33738.method32193("superSamplingLevel")) {
                                            final int method33744 = method33738.method32206();
                                            if (method33744 > 1) {
                                                Class8885.method31272("Super sampling level: " + method33744 + "x");
                                                Class9216.field39104 = method33744;
                                            }
                                            else {
                                                Class9216.field39104 = 1;
                                            }
                                        }
                                        else if (method33738.method32193("noiseTextureResolution")) {
                                            Class9216.field39387 = method33738.method32206();
                                            Class9216.field39386 = true;
                                            Class8885.method31272("Noise texture enabled");
                                            Class8885.method31272("Noise texture resolution: " + Class9216.field39387);
                                        }
                                        else if (method33738.method32194("Format")) {
                                            final String method33745 = Class9518.method35518(method33738.method32179(), "Format");
                                            final String method33746 = method33738.method32180();
                                            final int method33747 = method33783(method33745);
                                            final int method33748 = method33784(method33746);
                                            if (method33747 < 0 || method33748 == 0) {
                                                continue;
                                            }
                                            Class9216.field39248[method33747] = method33748;
                                            Class8885.method31276("%s format: %s", method33745, method33746);
                                        }
                                        else if (method33738.method32199("Clear", false)) {
                                            if (!Class8628.method29290(s) && !Class8628.method29289(s)) {
                                                continue;
                                            }
                                            final String method33749 = Class9518.method35518(method33738.method32179(), "Clear");
                                            final int method33750 = method33783(method33749);
                                            if (method33750 < 0) {
                                                continue;
                                            }
                                            Class9216.field39249[method33750] = false;
                                            Class8885.method31276("%s clear disabled", method33749);
                                        }
                                        else if (method33738.method32205("ClearColor")) {
                                            if (!Class8628.method29290(s) && !Class8628.method29289(s)) {
                                                continue;
                                            }
                                            final String method33751 = Class9518.method35518(method33738.method32179(), "ClearColor");
                                            final int method33752 = method33783(method33751);
                                            if (method33752 < 0) {
                                                continue;
                                            }
                                            final Vector4f method33753 = method33738.method32208();
                                            if (method33753 != null) {
                                                Class9216.field39250[method33752] = method33753;
                                                Class8885.method31276("%s clear color: %s %s %s %s", method33751, method33753.method28595(), method33753.method28596(), method33753.method28597(), method33753.method28598());
                                            }
                                            else {
                                                Class8885.method31271("Invalid color value: " + method33738.method32180());
                                            }
                                        }
                                        else if (method33738.method32192("GAUX4FORMAT", "RGBA32F")) {
                                            Class9216.field39248[7] = 34836;
                                            Class8885.method31272("gaux4 format : RGB32AF");
                                        }
                                        else if (method33738.method32192("GAUX4FORMAT", "RGB32F")) {
                                            Class9216.field39248[7] = 34837;
                                            Class8885.method31272("gaux4 format : RGB32F");
                                        }
                                        else if (method33738.method32192("GAUX4FORMAT", "RGB16")) {
                                            Class9216.field39248[7] = 32852;
                                            Class8885.method31272("gaux4 format : RGB16");
                                        }
                                        else if (method33738.method32199("MipmapEnabled", true)) {
                                            if (!Class8628.method29290(s) && !Class8628.method29289(s) && !Class8628.method29291(s)) {
                                                continue;
                                            }
                                            final String method33754 = Class9518.method35518(method33738.method32179(), "MipmapEnabled");
                                            final int method33755 = method33783(method33754);
                                            if (method33755 < 0) {
                                                continue;
                                            }
                                            class9023.method32345(class9023.method32334() | 1 << method33755);
                                            Class8885.method31276("%s mipmap enabled", method33754);
                                        }
                                        else {
                                            if (!method33738.method32191("DRAWBUFFERS")) {
                                                continue;
                                            }
                                            final String method33756 = method33738.method32180();
                                            if (Class8628.method29292(method33756)) {
                                                class9023.method32343(method33756);
                                            }
                                            else {
                                                Class8885.method31271("Invalid draw buffers: " + method33756);
                                            }
                                        }
                                    }
                                    else {
                                        Class9216.field39092 = method33738.method32207();
                                        Class8885.method31272("Dryness halflife: " + Class9216.field39092);
                                    }
                                }
                                else {
                                    Class9216.field39091 = method33738.method32207();
                                    Class8885.method31272("Wetness halflife: " + Class9216.field39091);
                                }
                            }
                            else {
                                Class9216.field39229 = method33738.method32207();
                                Class9216.field39230 = true;
                                Class8885.method31272("Shadow map distance: " + Class9216.field39229);
                            }
                        }
                        else {
                            Class9216.field39228 = method33738.method32207();
                            Class9216.field39230 = false;
                            Class8885.method31272("Shadow map field of view: " + Class9216.field39228);
                        }
                    }
                    else {
                        Class9216.field39226 = (Class9216.field39227 = method33738.method32206());
                        Class9216.field39224 = (Class9216.field39225 = Math.round(Class9216.field39226 * Class9216.field39305));
                        Class8885.method31272("Shadow map resolution: " + Class9216.field39226);
                    }
                }
                method33736.close();
            }
            catch (final Exception ex2) {
                Class8885.method31270("Couldn't read " + s + "!");
                ex2.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
                return 0;
            }
        }
        if (Class9216.field39370) {
            method33771(s, sb.toString());
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)sb);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (GL32.glGetShaderi(glCreateShaderObjectARB, 35713) != 1) {
            Class8885.method31270("Error compiling fragment shader: " + s);
        }
        method33774(glCreateShaderObjectARB, s, list);
        return glCreateShaderObjectARB;
    }
    
    private static Reader method33770(final String s) {
        return new InputStreamReader(Class9216.field39324.method21531(s));
    }
    
    public static void method33771(final String s, final String s2) {
        try {
            final File file = new File(Class9216.field39331, "debug/" + s);
            file.getParentFile().mkdirs();
            Class8571.method28999(file, s2);
        }
        catch (final IOException ex) {
            Class8571.method28848("Error saving: " + s);
            ex.printStackTrace();
        }
    }
    
    private static void method33772(final File file) {
        if (file.exists() && file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int i = 0; i < listFiles.length; ++i) {
                    final File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        method33772(file2);
                    }
                    file2.delete();
                }
            }
        }
    }
    
    private static boolean method33773(final int n, final String str) {
        final IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
        ARBShaderObjects.glGetObjectParameterivARB(n, 35716, intBuffer);
        final int value = intBuffer.get();
        if (value > 1) {
            final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(value);
            intBuffer.flip();
            ARBShaderObjects.glGetInfoLogARB(n, intBuffer, byteBuffer);
            final byte[] array = new byte[value];
            byteBuffer.get(array);
            if (array[value - 1] == 0) {
                array[value - 1] = 10;
            }
            Class8885.method31272("Info log: " + str + "\n" + Class9518.method35531(new String(array, StandardCharsets.US_ASCII), " \n\r\t"));
            return false;
        }
        return true;
    }
    
    private static boolean method33774(final int n, final String str, final List<String> list) {
        BufferUtils.createIntBuffer(1);
        final int glGetShaderi = GL32.glGetShaderi(n, 35716);
        if (glGetShaderi <= 1) {
            return true;
        }
        for (int i = 0; i < list.size(); ++i) {
            Class8885.method31272("File: " + (i + 1) + " = " + (String)list.get(i));
        }
        Class8885.method31272("Shader info log: " + str + "\n" + Class9518.method35531(GL32.glGetShaderInfoLog(n, glGetShaderi), " \n\r\t"));
        return false;
    }
    
    public static void method33775(IntBuffer field39417) {
        if (field39417 == null) {
            field39417 = Class9216.field39417;
        }
        if (Class9216.field39291 != field39417) {
            GL32.glDrawBuffers(Class9216.field39291 = field39417);
            method33739("setDrawBuffers");
        }
    }
    
    public static void method33776(Class9023 field39287) {
        method33739("pre-useProgram");
        if (Class9216.field39049) {
            field39287 = Class9216.field39253;
        }
        else if (Class9216.field39050) {
            field39287 = Class9216.field39271;
        }
        if (Class9216.field39287 != field39287) {
            method33777(Class9216.field39287, field39287);
            Class9216.field39287 = field39287;
            int n = field39287.method32329();
            ARBShaderObjects.glUseProgramObjectARB(Class9216.field39288 = n);
            if (method33739("useProgram") != 0) {
                field39287.method32341(0);
                n = field39287.method32329();
                ARBShaderObjects.glUseProgramObjectARB(Class9216.field39288 = n);
            }
            Class9216.field39124.method32967(n);
            if (Class9216.field39363 != null) {
                Class9216.field39363.method21191(n);
            }
            if (n != 0) {
                final IntBuffer method32332 = field39287.method32332();
                if (Class9216.field39048) {
                    method33775(method32332);
                }
                Class9216.field39292 = field39287.method32334();
                switch (Class9349.field40126[field39287.method32327().ordinal()]) {
                    case 1: {
                        method33778(Class9216.field39128, 0);
                        method33778(Class9216.field39129, 2);
                        method33778(Class9216.field39130, 1);
                        method33778(Class9216.field39131, 3);
                        method33778(Class9216.field39132, Class9216.field39234 ? 5 : 4);
                        method33778(Class9216.field39133, 4);
                        method33778(Class9216.field39134, 4);
                        method33778(Class9216.field39135, 5);
                        method33778(Class9216.field39136, 6);
                        if (Class9216.field39359 != null || Class9216.field39290) {
                            method33778(Class9216.field39146, 7);
                            method33778(Class9216.field39147, 8);
                            method33778(Class9216.field39148, 9);
                            method33778(Class9216.field39149, 10);
                        }
                        method33778(Class9216.field39137, 11);
                        method33778(Class9216.field39138, 13);
                        method33778(Class9216.field39139, 13);
                        method33778(Class9216.field39140, 14);
                        method33778(Class9216.field39141, 15);
                        break;
                    }
                    case 2:
                    case 3: {
                        method33778(Class9216.field39142, 0);
                        method33778(Class9216.field39143, 1);
                        method33778(Class9216.field39144, 2);
                        method33778(Class9216.field39145, 3);
                        method33778(Class9216.field39146, 7);
                        method33778(Class9216.field39147, 8);
                        method33778(Class9216.field39148, 9);
                        method33778(Class9216.field39149, 10);
                        method33778(Class9216.field39150, 0);
                        method33778(Class9216.field39151, 1);
                        method33778(Class9216.field39152, 2);
                        method33778(Class9216.field39153, 3);
                        method33778(Class9216.field39154, 7);
                        method33778(Class9216.field39155, 8);
                        method33778(Class9216.field39156, 9);
                        method33778(Class9216.field39157, 10);
                        method33778(Class9216.field39132, Class9216.field39234 ? 5 : 4);
                        method33778(Class9216.field39133, 4);
                        method33778(Class9216.field39134, 4);
                        method33778(Class9216.field39135, 5);
                        method33778(Class9216.field39158, 6);
                        method33778(Class9216.field39136, 6);
                        method33778(Class9216.field39137, 11);
                        method33778(Class9216.field39159, 12);
                        method33778(Class9216.field39138, 13);
                        method33778(Class9216.field39139, 13);
                        method33778(Class9216.field39140, 14);
                        method33778(Class9216.field39141, 15);
                        break;
                    }
                    case 4: {
                        method33778(Class9216.field39160, 0);
                        method33778(Class9216.field39128, 0);
                        method33778(Class9216.field39129, 2);
                        method33778(Class9216.field39130, 1);
                        method33778(Class9216.field39131, 3);
                        method33778(Class9216.field39132, Class9216.field39234 ? 5 : 4);
                        method33778(Class9216.field39133, 4);
                        method33778(Class9216.field39134, 4);
                        method33778(Class9216.field39135, 5);
                        if (Class9216.field39359 != null) {
                            method33778(Class9216.field39146, 7);
                            method33778(Class9216.field39147, 8);
                            method33778(Class9216.field39148, 9);
                            method33778(Class9216.field39149, 10);
                        }
                        method33778(Class9216.field39138, 13);
                        method33778(Class9216.field39139, 13);
                        method33778(Class9216.field39140, 14);
                        method33778(Class9216.field39141, 15);
                        break;
                    }
                }
                final ItemStack class8321 = (Class9216.field39031.field4684 != null) ? Class9216.field39031.field4684.getHeldItemMainhand() : null;
                final Item class8322 = (class8321 != null) ? class8321.getItem() : null;
                int method32333 = -1;
                Class3833 method32334 = null;
                if (class8322 != null) {
                    final int method32335 = Class90.field211.method504(class8322);
                    if (class8322 instanceof Class4036) {
                        method32334 = ((Class4036)class8322).method12240();
                    }
                    method32333 = Class6444.method19214(method32335);
                }
                int n2 = (method32334 != null) ? method32334.method11781(method32334.method11878()) : 0;
                final ItemStack class8323 = (Class9216.field39031.field4684 != null) ? Class9216.field39031.field4684.method2714() : null;
                final Item class8324 = (class8323 != null) ? class8323.getItem() : null;
                int method32336 = -1;
                Class3833 method32337 = null;
                if (class8324 != null) {
                    final int method32338 = Class90.field211.method504(class8324);
                    if (class8324 instanceof Class4036) {
                        method32337 = ((Class4036)class8324).method12240();
                    }
                    method32336 = Class6444.method19214(method32338);
                }
                final int n3 = (method32337 != null) ? method32337.method11781(method32337.method11878()) : 0;
                if (method33748() && n3 > n2) {
                    method32333 = method32336;
                    n2 = n3;
                }
                method33778(Class9216.field39161, method32333);
                method33778(Class9216.field39162, n2);
                method33778(Class9216.field39163, method32336);
                method33778(Class9216.field39164, n3);
                method33778(Class9216.field39165, Class9216.field39108 ? Class9216.field39377 : 0);
                method33780(Class9216.field39166, Class9216.field39108 ? Class9216.field39378 : 0.0f);
                method33781(Class9216.field39167, Class9216.field39379, Class9216.field39380, Class9216.field39381);
                method33781(Class9216.field39168, Class9216.field39072, Class9216.field39073, Class9216.field39074);
                method33778(Class9216.field39169, (int)(Class9216.field39075 % 24000L));
                method33778(Class9216.field39170, (int)(Class9216.field39075 / 24000L));
                method33778(Class9216.field39171, Class9216.field39081);
                method33778(Class9216.field39172, Class9216.field39085);
                method33780(Class9216.field39173, Class9216.field39086);
                method33780(Class9216.field39174, Class9216.field39087);
                method33780(Class9216.field39175, Class9216.field39079);
                method33780(Class9216.field39176, Class9216.field39080);
                method33780(Class9216.field39177, Class9216.field39089);
                method33780(Class9216.field39178, Class9216.field39043 / (float)Class9216.field39044);
                method33780(Class9216.field39179, (float)Class9216.field39043);
                method33780(Class9216.field39180, (float)Class9216.field39044);
                method33780(Class9216.field39181, 0.05f);
                method33780(Class9216.field39182, (float)(Class9216.field39031.field4648.field23382 * 16));
                method33781(Class9216.field39183, Class9216.field39060[0], Class9216.field39060[1], Class9216.field39060[2]);
                method33781(Class9216.field39184, Class9216.field39061[0], Class9216.field39061[1], Class9216.field39061[2]);
                method33781(Class9216.field39185, Class9216.field39062[0], Class9216.field39062[1], Class9216.field39062[2]);
                method33781(Class9216.field39186, Class9216.field39063[0], Class9216.field39063[1], Class9216.field39063[2]);
                method33781(Class9216.field39187, (float)Class9216.field39214, (float)Class9216.field39215, (float)Class9216.field39216);
                method33781(Class9216.field39188, (float)Class9216.field39217, (float)Class9216.field39218, (float)Class9216.field39219);
                method33782(Class9216.field39189, false, Class9216.field39401);
                method33782(Class9216.field39190, false, Class9216.field39402);
                method33782(Class9216.field39191, false, Class9216.field39407);
                method33782(Class9216.field39192, false, Class9216.field39399);
                method33782(Class9216.field39193, false, Class9216.field39400);
                method33782(Class9216.field39194, false, Class9216.field39408);
                if (Class9216.field39243 > 0) {
                    method33782(Class9216.field39195, false, Class9216.field39403);
                    method33782(Class9216.field39196, false, Class9216.field39404);
                    method33782(Class9216.field39197, false, Class9216.field39405);
                    method33782(Class9216.field39198, false, Class9216.field39406);
                }
                method33780(Class9216.field39199, Class9216.field39090);
                method33780(Class9216.field39200, Class9216.field39099);
                method33779(Class9216.field39201, Class9216.field39096 & 0xFFFF, Class9216.field39096 >> 16);
                method33779(Class9216.field39202, Math.round(Class9216.field39097), Math.round(Class9216.field39098));
                method33779(Class9216.field39203, Class9216.field39384[0], Class9216.field39384[1]);
                method33778(Class9216.field39204, Class9216.field39383);
                method33778(Class9216.field39205, Class9216.field39095);
                method33780(Class9216.field39206, Class9216.field39105);
                method33780(Class9216.field39207, Class9216.field39106);
                method33780(Class9216.field39208, (float)Class9216.field39031.field4648.field23472);
                method33778(Class9216.field39209, Class9216.field39031.field4648.field23464 ? 1 : 0);
                method33780(Class9216.field39210, Class9216.field39101);
                method33779(Class9216.field39211, Class9216.field39122, Class9216.field39123);
                if (Class9216.field39363 != null) {
                    Class9216.field39363.method21192();
                }
                method33739("end useProgram");
            }
        }
    }
    
    private static void method33777(final Class9023 class9023, final Class9023 class9024) {
        if (class9023.method32336() != null) {
            Class8933.method31673();
        }
        if (class9023.method32337() != null) {
            Class8933.method31677();
        }
        final Class6684 method32336 = class9024.method32336();
        if (method32336 != null) {
            Class8933.method31672(method32336);
        }
        final Class9075 method32337 = class9024.method32337();
        if (method32337 != null) {
            Class8933.method31676(method32337);
        }
    }
    
    private static void method33778(final Class5153 class5153, final int n) {
        class5153.method16099(n);
    }
    
    private static void method33779(final Class5148 class5148, final int n, final int n2) {
        class5148.method16089(n, n2);
    }
    
    private static void method33780(final Class5154 class5154, final float n) {
        class5154.method16101(n);
    }
    
    private static void method33781(final Class5151 class5151, final float n, final float n2, final float n3) {
        class5151.method16095(n, n2, n3);
    }
    
    private static void method33782(final Class5150 class5150, final boolean b, final FloatBuffer floatBuffer) {
        class5150.method16093(b, floatBuffer);
    }
    
    public static int method33783(final String s) {
        if (s.equals("colortex0") || s.equals("gcolor")) {
            return 0;
        }
        if (s.equals("colortex1") || s.equals("gdepth")) {
            return 1;
        }
        if (s.equals("colortex2") || s.equals("gnormal")) {
            return 2;
        }
        if (s.equals("colortex3") || s.equals("composite")) {
            return 3;
        }
        if (s.equals("colortex4") || s.equals("gaux1")) {
            return 4;
        }
        if (s.equals("colortex5") || s.equals("gaux2")) {
            return 5;
        }
        if (!s.equals("colortex6") && !s.equals("gaux3")) {
            return (!s.equals("colortex7") && !s.equals("gaux4")) ? -1 : 7;
        }
        return 6;
    }
    
    private static int method33784(String trim) {
        trim = trim.trim();
        for (int i = 0; i < Class9216.field39421.length; ++i) {
            if (trim.equals(Class9216.field39421[i])) {
                return Class9216.field39422[i];
            }
        }
        return 0;
    }
    
    private static void method33785() {
        if (Class9216.field39385 == null && Class9216.field39362 != null) {
            Class9216.field39385 = method33714(15, Class9216.field39362);
        }
        if (Class9216.field39385 == null) {
            Class9216.field39385 = new Class4113(Class9216.field39387, Class9216.field39387);
        }
    }
    
    private static void method33786() {
        Class9216.field39420 = new IdentityHashMap<Class3833, Integer>(300);
        if (Class9216.field39420.isEmpty()) {
            final Iterator<Class1932> iterator = Class90.field208.method507().iterator();
            while (iterator.hasNext()) {
                final Class3833 class3833 = Class90.field208.method505(iterator.next());
                Class9216.field39420.put(class3833, Class90.field208.method504(class3833));
            }
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Class9216.field39324.method21531("/mc_Entity_x.txt")));
        }
        catch (final Exception ex) {}
        if (bufferedReader != null) {
            try {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    final Matcher matcher = Class9216.field39423.matcher(line);
                    if (matcher.matches()) {
                        final String group = matcher.group(1);
                        final int int1 = Integer.parseInt(matcher.group(2));
                        final Class1932 class3834 = new Class1932(group);
                        if (Class90.field208.method510(class3834)) {
                            Class9216.field39420.put(Class90.field208.method505(class3834), int1);
                        }
                        else {
                            Class8885.method31275("Unknown block name %s", group);
                        }
                    }
                    else {
                        Class8885.method31275("unmatched %s\n", line);
                    }
                }
            }
            catch (final Exception ex2) {
                Class8885.method31271("Error parsing mc_Entity_x.txt");
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            }
            catch (final Exception ex3) {}
        }
    }
    
    private static IntBuffer method33787(final IntBuffer intBuffer) {
        for (int limit = intBuffer.limit(), i = intBuffer.position(); i < limit; ++i) {
            intBuffer.put(i, 0);
        }
        return intBuffer;
    }
    
    public static void method33788() {
        if (Class9216.field39034) {
            method33739("Shaders.uninit pre");
            for (int i = 0; i < Class9216.field39286.length; ++i) {
                final Class9023 class9023 = Class9216.field39286[i];
                if (class9023.method32330() != 0) {
                    ARBShaderObjects.glDeleteObjectARB(class9023.method32330());
                    method33739("del programRef");
                }
                class9023.method32342(0);
                class9023.method32341(0);
                class9023.method32343(null);
                class9023.method32344(null);
                class9023.method32345(0);
            }
            Class9216.field39290 = false;
            if (Class9216.field39246 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(Class9216.field39246);
                Class9216.field39246 = 0;
                method33739("del dfb");
            }
            if (Class9216.field39247 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(Class9216.field39247);
                Class9216.field39247 = 0;
                method33739("del sfb");
            }
            if (Class9216.field39412 != null) {
                Class8933.method31669(Class9216.field39412);
                method33787(Class9216.field39412);
                method33739("del dfbDepthTextures");
            }
            if (Class9216.field39411 != null) {
                Class8933.method31669(Class9216.field39411);
                method33787(Class9216.field39411);
                method33739("del dfbTextures");
            }
            if (Class9216.field39414 != null) {
                Class8933.method31669(Class9216.field39414);
                method33787(Class9216.field39414);
                method33739("del shadow depth");
            }
            if (Class9216.field39413 != null) {
                Class8933.method31669(Class9216.field39413);
                method33787(Class9216.field39413);
                method33739("del shadow color");
            }
            if (Class9216.field39415 != null) {
                method33787(Class9216.field39415);
            }
            if (Class9216.field39385 != null) {
                Class9216.field39385.method12358();
                Class9216.field39385 = null;
            }
            Class8885.method31272("Uninit");
            Class9216.field39222 = 0;
            Class9216.field39233 = false;
            Class9216.field39034 = false;
            method33739("Shaders.uninit");
        }
    }
    
    public static void method33789() {
        Class9216.field39042 = 0;
    }
    
    public static void method33790() {
        Class9216.field39223 = true;
    }
    
    private static void method33791() {
        Class9216.field39041 = Class9216.field39031.method5332().method7692();
        Class9216.field39042 = Class9216.field39031.method5332().method7693();
        Class9216.field39043 = Math.round(Class9216.field39041 * Class9216.field39304);
        Class9216.field39044 = Math.round(Class9216.field39042 * Class9216.field39304);
        method33793();
    }
    
    private static void method33792() {
        Class9216.field39223 = false;
        Class9216.field39224 = Math.round(Class9216.field39226 * Class9216.field39305);
        Class9216.field39225 = Math.round(Class9216.field39227 * Class9216.field39305);
        method33795();
    }
    
    private static void method33793() {
        if (Class9216.field39246 != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(Class9216.field39246);
            Class8933.method31669(Class9216.field39412);
            Class8933.method31669(Class9216.field39411);
        }
        Class9216.field39246 = EXTFramebufferObject.glGenFramebuffersEXT();
        GL32.glGenTextures((IntBuffer)Class9216.field39412.clear().limit(Class9216.field39241));
        GL32.glGenTextures((IntBuffer)Class9216.field39411.clear().limit(16));
        Class9216.field39412.position();
        Class9216.field39411.position();
        EXTFramebufferObject.glBindFramebufferEXT(36160, Class9216.field39246);
        GL32.glDrawBuffers(0);
        GL32.glReadBuffer(0);
        for (int i = 0; i < Class9216.field39241; ++i) {
            Class8933.method31617(Class9216.field39412.get(i));
            GL32.glTexParameteri(3553, 10242, 33071);
            GL32.glTexParameteri(3553, 10243, 33071);
            GL32.glTexParameteri(3553, 10241, 9728);
            GL32.glTexParameteri(3553, 10240, 9728);
            GL32.glTexParameteri(3553, 34891, 6409);
            GL32.glTexImage2D(3553, 0, 6402, Class9216.field39043, Class9216.field39044, 0, 6402, 5126, (FloatBuffer)null);
        }
        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Class9216.field39412.get(0), 0);
        GL32.glDrawBuffers(Class9216.field39415);
        GL32.glReadBuffer(0);
        method33739("FT d");
        for (int j = 0; j < Class9216.field39240; ++j) {
            Class8933.method31617(Class9216.field39419.method34612(j));
            GL32.glTexParameteri(3553, 10242, 33071);
            GL32.glTexParameteri(3553, 10243, 33071);
            GL32.glTexParameteri(3553, 10241, 9729);
            GL32.glTexParameteri(3553, 10240, 9729);
            GL32.glTexImage2D(3553, 0, Class9216.field39248[j], Class9216.field39043, Class9216.field39044, 0, method33794(Class9216.field39248[j]), 33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + j, 3553, Class9216.field39419.method34612(j), 0);
            method33739("FT c");
        }
        for (int k = 0; k < Class9216.field39240; ++k) {
            Class8933.method31617(Class9216.field39419.method34613(k));
            GL32.glTexParameteri(3553, 10242, 33071);
            GL32.glTexParameteri(3553, 10243, 33071);
            GL32.glTexParameteri(3553, 10241, 9729);
            GL32.glTexParameteri(3553, 10240, 9729);
            GL32.glTexImage2D(3553, 0, Class9216.field39248[k], Class9216.field39043, Class9216.field39044, 0, method33794(Class9216.field39248[k]), 33639, (ByteBuffer)null);
            method33739("FT ca");
        }
        int l = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
        if (l == 36058) {
            method33744("[Shaders] Error: Failed framebuffer incomplete formats");
            for (int n = 0; n < Class9216.field39240; ++n) {
                Class8933.method31617(Class9216.field39419.method34612(n));
                GL32.glTexImage2D(3553, 0, 6408, Class9216.field39043, Class9216.field39044, 0, 32993, 33639, (ByteBuffer)null);
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + n, 3553, Class9216.field39419.method34612(n), 0);
                method33739("FT c");
            }
            l = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            if (l == 36053) {
                Class8885.method31272("complete");
            }
        }
        Class8933.method31617(0);
        if (l != 36053) {
            method33744("[Shaders] Error: Failed creating framebuffer! (Status " + l + ")");
        }
        else {
            Class8885.method31272("Framebuffer created.");
        }
    }
    
    private static int method33794(final int n) {
        switch (n) {
            case 33333:
            case 33334:
            case 33339:
            case 33340:
            case 36208:
            case 36209:
            case 36226:
            case 36227: {
                return 36251;
            }
            default: {
                return 32993;
            }
        }
    }
    
    private static void method33795() {
        if (Class9216.field39243 != 0) {
            if (Class9216.field39247 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(Class9216.field39247);
                Class8933.method31669(Class9216.field39414);
                Class8933.method31669(Class9216.field39413);
            }
            EXTFramebufferObject.glBindFramebufferEXT(36160, Class9216.field39247 = EXTFramebufferObject.glGenFramebuffersEXT());
            GL32.glDrawBuffer(0);
            GL32.glReadBuffer(0);
            GL32.glGenTextures((IntBuffer)Class9216.field39414.clear().limit(Class9216.field39243));
            GL32.glGenTextures((IntBuffer)Class9216.field39413.clear().limit(Class9216.field39242));
            Class9216.field39414.position();
            Class9216.field39413.position();
            for (int i = 0; i < Class9216.field39243; ++i) {
                Class8933.method31617(Class9216.field39414.get(i));
                GL32.glTexParameterf(3553, 10242, 33071.0f);
                GL32.glTexParameterf(3553, 10243, 33071.0f);
                final int n = Class9216.field39298[i] ? 9728 : 9729;
                GL32.glTexParameteri(3553, 10241, n);
                GL32.glTexParameteri(3553, 10240, n);
                if (Class9216.field39296[i]) {
                    GL32.glTexParameteri(3553, 34892, 34894);
                }
                GL32.glTexImage2D(3553, 0, 6402, Class9216.field39224, Class9216.field39225, 0, 6402, 5126, (FloatBuffer)null);
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Class9216.field39414.get(0), 0);
            method33739("FT sd");
            for (int j = 0; j < Class9216.field39242; ++j) {
                Class8933.method31617(Class9216.field39413.get(j));
                GL32.glTexParameterf(3553, 10242, 33071.0f);
                GL32.glTexParameterf(3553, 10243, 33071.0f);
                final int n2 = Class9216.field39300[j] ? 9728 : 9729;
                GL32.glTexParameteri(3553, 10241, n2);
                GL32.glTexParameteri(3553, 10240, n2);
                GL32.glTexImage2D(3553, 0, 6408, Class9216.field39224, Class9216.field39225, 0, 32993, 33639, (ByteBuffer)null);
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + j, 3553, Class9216.field39413.get(j), 0);
                method33739("FT sc");
            }
            Class8933.method31617(0);
            if (Class9216.field39242 > 0) {
                GL32.glDrawBuffers(Class9216.field39416);
            }
            final int glCheckFramebufferStatusEXT = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            if (glCheckFramebufferStatusEXT != 36053) {
                method33744("[Shaders] Error: Failed creating shadow framebuffer! (Status " + glCheckFramebufferStatusEXT + ")");
            }
            else {
                Class8885.method31272("Shadow framebuffer created.");
            }
        }
    }
    
    public static void method33796(final Class869 field39031, final Class6092 class6092, final float n, final long n2) {
        method33739("pre beginRender");
        method33798(Class9216.field39031.field4683);
        Class9216.field39031 = field39031;
        Class9216.field39031.method5327().method15297("init");
        Class9216.field39032 = Class9216.field39031.field4644;
        if (!Class9216.field39034) {
            try {
                method33761();
            }
            catch (final IllegalStateException ex) {
                if (Class8571.method28980(ex.getMessage()).equals("Function is not supported")) {
                    method33744("[Shaders] Error: " + ex.getMessage());
                    ex.printStackTrace();
                    method33707("OFF");
                    return;
                }
            }
        }
        if (Class9216.field39031.method5332().method7692() != Class9216.field39041 || Class9216.field39031.method5332().method7693() != Class9216.field39042) {
            method33791();
        }
        if (Class9216.field39223) {
            method33792();
        }
        ++Class9216.field39085;
        if (Class9216.field39085 >= 720720) {
            Class9216.field39085 = 0;
        }
        Class9216.field39082 = System.currentTimeMillis();
        if (Class9216.field39083 == 0L) {
            Class9216.field39083 = Class9216.field39082;
        }
        Class9216.field39084 = Class9216.field39082 - Class9216.field39083;
        Class9216.field39083 = Class9216.field39082;
        Class9216.field39086 = Class9216.field39084 / 1000.0f;
        Class9216.field39087 += Class9216.field39086;
        Class9216.field39087 %= 3600.0f;
        Class8933.method31635();
        Class7778.method24957(class6092, field39031, n);
        Class8933.method31636();
        final Class1848 field39032 = Class9216.field39031.field4683;
        if (field39032 != null) {
            Class9216.field39075 = field39032.method6755();
            Class9216.field39077 = (Class9216.field39075 - Class9216.field39076) % 24000L;
            if (Class9216.field39077 < 0L) {
                Class9216.field39077 += 24000L;
            }
            Class9216.field39076 = Class9216.field39075;
            Class9216.field39081 = field39032.method6953();
            Class9216.field39089 = field39032.method6768(n);
            final float n3 = (float)Math.exp(Math.log(0.5) * (Class9216.field39084 * 0.01f) / ((Class9216.field39090 < Class9216.field39089) ? Class9216.field39092 : Class9216.field39091));
            Class9216.field39090 = Class9216.field39090 * n3 + Class9216.field39089 * (1.0f - n3);
            final Entity method18166 = class6092.method18166();
            if (method18166 != null) {
                Class9216.field39051 = (method18166 instanceof LivingEntity && ((LivingEntity)method18166).method2783());
                Class9216.field39099 = (float)class6092.method18161().getY();
                Class9216.field39096 = Class9216.field39031.method5306().method28695(method18166, n);
                final float n4 = (float)Math.exp(Math.log(0.5) * (Class9216.field39084 * 0.01f) / Class9216.field39093);
                Class9216.field39097 = Class9216.field39097 * n4 + (Class9216.field39096 & 0xFFFF) * (1.0f - n4);
                Class9216.field39098 = Class9216.field39098 * n4 + (Class9216.field39096 >> 16) * (1.0f - n4);
                final Class7099 method18167 = class6092.method18169();
                if (method18167.method21793(Class7324.field28319)) {
                    Class9216.field39095 = 1;
                }
                else if (method18167.method21793(Class7324.field28320)) {
                    Class9216.field39095 = 2;
                }
                else {
                    Class9216.field39095 = 0;
                }
                if (method18166 instanceof LivingEntity) {
                    final LivingEntity class6093 = (LivingEntity)method18166;
                    Class9216.field39105 = 0.0f;
                    if (class6093.method2653(Class9439.field40489)) {
                        final Class1660 field39033 = Class9216.field39032;
                        Class9216.field39105 = Class1660.method5816(class6093, n);
                    }
                    Class9216.field39106 = 0.0f;
                    if (class6093.method2653(Class9439.field40488)) {
                        Class9216.field39106 = Class8571.method28866(class6093.method2654(Class9439.field40488).method7907() / 20.0f, 0.0f, 1.0f);
                    }
                }
                final Vec3d method18168 = Class8763.method30363(field39032.method6843(method18166.method1894(), n), field39032, method18166, n);
                Class9216.field39072 = (float)method18168.x;
                Class9216.field39073 = (float)method18168.y;
                Class9216.field39074 = (float)method18168.z;
            }
        }
        Class9216.field39045 = true;
        Class9216.field39047 = false;
        Class9216.field39049 = false;
        Class9216.field39053 = false;
        Class9216.field39054 = false;
        Class9216.field39055 = false;
        Class9216.field39056 = false;
        method33797();
        Class9216.field39214 = Class9216.field39217;
        Class9216.field39215 = Class9216.field39218;
        Class9216.field39216 = Class9216.field39219;
        Class9216.field39407.position();
        Class9216.field39399.position();
        Class9216.field39407.put(Class9216.field39399);
        Class9216.field39407.position();
        Class9216.field39399.position();
        Class9216.field39408.position();
        Class9216.field39401.position();
        Class9216.field39408.put(Class9216.field39401);
        Class9216.field39408.position();
        Class9216.field39401.position();
        method33739("beginRender");
        Class7778.method24956(Class9216.field39032, class6092, 0, n, n2);
        Class9216.field39031.method5327().method15299();
        EXTFramebufferObject.glBindFramebufferEXT(36160, Class9216.field39246);
        for (int i = 0; i < Class9216.field39240; ++i) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + i, 3553, Class9216.field39419.method34612(i), 0);
        }
        method33739("end beginRender");
    }
    
    private static void method33797() {
        if (Class9216.field39243 >= 1) {
            Class8933.method31608(33988);
            Class8933.method31617(Class9216.field39414.get(0));
            if (Class9216.field39243 >= 2) {
                Class8933.method31608(33989);
                Class8933.method31617(Class9216.field39414.get(1));
            }
        }
        Class8933.method31608(33984);
        for (int i = 0; i < Class9216.field39240; ++i) {
            Class8933.method31617(Class9216.field39419.method34612(i));
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9729);
            Class8933.method31617(Class9216.field39419.method34613(i));
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9729);
        }
        Class8933.method31617(0);
        for (int n = 0; n < 4 && 4 + n < Class9216.field39240; ++n) {
            Class8933.method31608(33991 + n);
            Class8933.method31617(Class9216.field39419.method34612(4 + n));
        }
        Class8933.method31608(33990);
        Class8933.method31617(Class9216.field39412.get(0));
        if (Class9216.field39241 >= 2) {
            Class8933.method31608(33995);
            Class8933.method31617(Class9216.field39412.get(1));
            if (Class9216.field39241 >= 3) {
                Class8933.method31608(33996);
                Class8933.method31617(Class9216.field39412.get(2));
            }
        }
        for (int j = 0; j < Class9216.field39242; ++j) {
            Class8933.method31608(33997 + j);
            Class8933.method31617(Class9216.field39413.get(j));
        }
        if (Class9216.field39386) {
            Class8933.method31608(33984 + Class9216.field39385.method12363());
            Class8933.method31617(Class9216.field39385.method12362());
        }
        method33720(Class9216.field39359);
        Class8933.method31608(33984);
    }
    
    public static void method33798(final Class1848 field39357) {
        if (Class9216.field39357 == field39357) {
            return;
        }
        final Class1848 field39358 = Class9216.field39357;
        Class9216.field39357 = field39357;
        method33808(Class9216.field39031.method5303());
        final int method33799 = method33799(field39358);
        final int method33800 = method33799(field39357);
        if (method33800 != method33799) {
            final boolean contains = Class9216.field39358.contains(method33799);
            final boolean contains2 = Class9216.field39358.contains(method33800);
            if (contains || contains2) {
                method33788();
            }
        }
        Class7901.method25572();
    }
    
    private static int method33799(final World class1847) {
        return (class1847 == null) ? Integer.MIN_VALUE : class1847.dimension.getType().method1270();
    }
    
    public static void method33800(final float n, final long n2) {
        if (!Class9216.field39049) {
            EXTFramebufferObject.glBindFramebufferEXT(36160, Class9216.field39246);
            GL11.glViewport(0, 0, Class9216.field39043, Class9216.field39044);
            Class9216.field39291 = null;
            Class8990.method32046(Class9216.field39295.method5874());
            method33776(Class9216.field39257);
            method33739("end beginRenderPass");
        }
    }
    
    public static void method33801(final int n, final int n2, final int n3, final int n4) {
        Class8933.method31625(true, true, true, true);
        if (Class9216.field39049) {
            GL11.glViewport(0, 0, Class9216.field39224, Class9216.field39225);
        }
        else {
            GL11.glViewport(0, 0, Class9216.field39043, Class9216.field39044);
            EXTFramebufferObject.glBindFramebufferEXT(36160, Class9216.field39246);
            Class9216.field39048 = true;
            Class8933.method31592();
            Class8933.method31515();
            method33775(Class9216.field39417);
            method33776(Class9216.field39257);
            method33739("beginRenderPass");
        }
    }
    
    public static void method33802(final int field39377) {
        Class9216.field39377 = field39377;
        if (Class9216.field39108) {
            method33778(Class9216.field39165, field39377);
        }
    }
    
    public static void method33803(final float field39379, final float field39380, final float field39381) {
        Class9216.field39379 = field39379;
        Class9216.field39380 = field39380;
        Class9216.field39381 = field39381;
        method33781(Class9216.field39167, Class9216.field39379, Class9216.field39380, Class9216.field39381);
    }
    
    public static void method33804(final float field39069, final float field39070, final float field39071, final float n) {
        Class9216.field39069 = field39069;
        Class9216.field39070 = field39070;
        Class9216.field39071 = field39071;
    }
    
    public static void method33805() {
        if (Class9216.field39049) {
            method33739("shadow clear pre");
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Class9216.field39414.get(0), 0);
            GL32.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            GL32.glDrawBuffers(Class9216.field39253.method32332());
            method33738("shadow clear");
            GL32.glClear(16640);
            method33739("shadow clear");
        }
        else {
            method33739("clear pre");
            if (Class9216.field39249[0]) {
                final Vector4f class8526 = Class9216.field39250[0];
                if (class8526 != null) {
                    GL32.glClearColor(class8526.method28595(), class8526.method28596(), class8526.method28597(), class8526.method28598());
                }
                if (Class9216.field39419.method34616(0)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, Class9216.field39419.method34613(0), 0);
                    GL32.glDrawBuffers(36064);
                    GL32.glClear(16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, Class9216.field39419.method34612(0), 0);
                }
                GL32.glDrawBuffers(36064);
                GL32.glClear(16384);
            }
            if (Class9216.field39249[1]) {
                GL32.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
                final Vector4f class8527 = Class9216.field39250[1];
                if (class8527 != null) {
                    GL32.glClearColor(class8527.method28595(), class8527.method28596(), class8527.method28597(), class8527.method28598());
                }
                if (Class9216.field39419.method34616(1)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, Class9216.field39419.method34613(1), 0);
                    GL32.glDrawBuffers(36065);
                    GL32.glClear(16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, Class9216.field39419.method34612(1), 0);
                }
                GL32.glDrawBuffers(36065);
                GL32.glClear(16384);
            }
            for (int i = 2; i < Class9216.field39240; ++i) {
                if (Class9216.field39249[i]) {
                    GL32.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    final Vector4f class8528 = Class9216.field39250[i];
                    if (class8528 != null) {
                        GL32.glClearColor(class8528.method28595(), class8528.method28596(), class8528.method28597(), class8528.method28598());
                    }
                    if (Class9216.field39419.method34616(i)) {
                        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + i, 3553, Class9216.field39419.method34613(i), 0);
                        GL32.glDrawBuffers(36064 + i);
                        GL32.glClear(16384);
                        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + i, 3553, Class9216.field39419.method34612(i), 0);
                    }
                    GL32.glDrawBuffers(36064 + i);
                    GL32.glClear(16384);
                }
            }
            method33775(Class9216.field39415);
            method33738("clear");
            method33739("clear");
        }
    }
    
    public static void method33806(final Class7351 class7351, final Class6092 class7352, final float n) {
        final Entity method18166 = class7352.method18166();
        final Vec3d method18167 = class7352.method18161();
        final double field22770 = method18167.x;
        final double field22771 = method18167.y;
        final double field22772 = method18167.z;
        method33807(method18166);
        Class9216.field39217 = field22770 - Class9216.field39220;
        Class9216.field39218 = field22771;
        Class9216.field39219 = field22772 - Class9216.field39221;
        GL32.glGetFloatv(2983, (FloatBuffer)Class9216.field39399.position());
        Class8425.method28142((FloatBuffer)Class9216.field39400.position(), (FloatBuffer)Class9216.field39399.position(), Class9216.field39392, Class9216.field39391);
        Class9216.field39399.position();
        Class9216.field39400.position();
        final Matrix4f class7353 = new Matrix4f(class7351.method22569().method32111());
        class7353.method20750();
        class7353.method20768(Class9216.field39068);
        Class9216.field39401.position();
        Class9216.field39401.put(Class9216.field39068);
        Class8425.method28142((FloatBuffer)Class9216.field39402.position(), (FloatBuffer)Class9216.field39401.position(), Class9216.field39394, Class9216.field39393);
        Class9216.field39401.position();
        Class9216.field39402.position();
        method33739("setCamera");
    }
    
    private static void method33807(final Entity class399) {
        final double abs = Math.abs(Class9216.field39217 - Class9216.field39214);
        final double abs2 = Math.abs(Class9216.field39219 - Class9216.field39216);
        final double abs3 = Math.abs(Class9216.field39217);
        final double abs4 = Math.abs(Class9216.field39219);
        if (abs > 1000.0 || abs2 > 1000.0 || abs3 > 1000000.0 || abs4 > 1000000.0) {
            method33808(class399);
        }
    }
    
    private static void method33808(final Entity class399) {
        if (class399 == null) {
            Class9216.field39220 = 0;
            Class9216.field39221 = 0;
        }
        else {
            Class9216.field39220 = (int)class399.getPosX() / 1000 * 1000;
            Class9216.field39221 = (int)class399.getPosZ() / 1000 * 1000;
        }
    }
    
    public static void method33809(final Class7351 class7351, final Class6092 class7352, final float n) {
        final Entity method18166 = class7352.method18166();
        final Vec3d method18167 = class7352.method18161();
        final double field22770 = method18167.x;
        final double field22771 = method18167.y;
        final double field22772 = method18167.z;
        method33807(method18166);
        Class9216.field39217 = field22770 - Class9216.field39220;
        Class9216.field39218 = field22771;
        Class9216.field39219 = field22772 - Class9216.field39221;
        GL32.glViewport(0, 0, Class9216.field39224, Class9216.field39225);
        GL32.glMatrixMode(5889);
        GL32.glLoadIdentity();
        if (Class9216.field39230) {
            GL32.glOrtho((double)(-Class9216.field39229), (double)Class9216.field39229, (double)(-Class9216.field39229), (double)Class9216.field39229, 0.05000000074505806, 256.0);
        }
        else {
            Class8933.method31645(Matrix4f.method20755(Class9216.field39228, Class9216.field39224 / (float)Class9216.field39225, 0.05f, 256.0f));
        }
        class7351.method22564(0.0, 0.0, -100.0);
        class7351.method22566(Vector3f.XP.rotationDegrees(90.0f));
        Class9216.field39078 = Class9216.field39031.field4683.method6952(n);
        Class9216.field39079 = ((Class9216.field39078 < 0.75f) ? (Class9216.field39078 + 0.25f) : (Class9216.field39078 - 0.75f));
        final float n2 = Class9216.field39078 * -360.0f;
        final float n3 = (Class9216.field39376 > 0.0f) ? (n2 % Class9216.field39376 - Class9216.field39376 * 0.5f) : 0.0f;
        if (Class9216.field39079 <= 0.5) {
            class7351.method22566(Vector3f.ZP.rotationDegrees(n2 - n3));
            class7351.method22566(Vector3f.XP.rotationDegrees(Class9216.field39375));
            Class9216.field39080 = Class9216.field39079;
        }
        else {
            class7351.method22566(Vector3f.ZP.rotationDegrees(n2 + 180.0f - n3));
            class7351.method22566(Vector3f.XP.rotationDegrees(Class9216.field39375));
            Class9216.field39080 = Class9216.field39079 - 0.5f;
        }
        if (Class9216.field39230) {
            final float field22773 = Class9216.field39382;
            final float n4 = field22773 / 2.0f;
            class7351.method22564((float)field22770 % field22773 - n4, (float)field22771 % field22773 - n4, (float)field22772 % field22773 - n4);
        }
        final float n5 = Class9216.field39079 * 6.2831855f;
        final float n6 = (float)Math.cos(n5);
        final float n7 = (float)Math.sin(n5);
        final float n8 = Class9216.field39375 * 6.2831855f;
        float n9 = n6;
        float n10 = n7 * (float)Math.cos(n8);
        float n11 = n7 * (float)Math.sin(n8);
        if (Class9216.field39079 > 0.5) {
            n9 = -n6;
            n10 = -n10;
            n11 = -n11;
        }
        Class9216.field39064[0] = n9;
        Class9216.field39064[1] = n10;
        Class9216.field39064[2] = n11;
        Class9216.field39064[3] = 0.0f;
        GL32.glGetFloatv(2983, (FloatBuffer)Class9216.field39403.position());
        Class8425.method28142((FloatBuffer)Class9216.field39404.position(), (FloatBuffer)Class9216.field39403.position(), Class9216.field39396, Class9216.field39395);
        Class9216.field39403.position();
        Class9216.field39404.position();
        class7351.method22569().method32111().method20747((FloatBuffer)Class9216.field39405.position());
        Class8425.method28142((FloatBuffer)Class9216.field39406.position(), (FloatBuffer)Class9216.field39405.position(), Class9216.field39398, Class9216.field39397);
        Class9216.field39405.position();
        Class9216.field39406.position();
        method33782(Class9216.field39192, false, Class9216.field39399);
        method33782(Class9216.field39193, false, Class9216.field39400);
        method33782(Class9216.field39191, false, Class9216.field39407);
        method33782(Class9216.field39189, false, Class9216.field39401);
        method33782(Class9216.field39190, false, Class9216.field39402);
        method33782(Class9216.field39194, false, Class9216.field39408);
        method33782(Class9216.field39195, false, Class9216.field39403);
        method33782(Class9216.field39196, false, Class9216.field39404);
        method33782(Class9216.field39197, false, Class9216.field39405);
        method33782(Class9216.field39198, false, Class9216.field39406);
        method33739("setCamera");
    }
    
    public static void method33810(final Class7351 class7351) {
        class7351.method22566(Vector3f.ZP.rotationDegrees(Class9216.field39375 * 1.0f));
        method33739("preCelestialRotate");
    }
    
    public static void method33811(final Class7351 class7351) {
        final Matrix4f class7352 = new Matrix4f(class7351.method22569().method32111());
        class7352.method20750();
        class7352.method20768(Class9216.field39068);
        Class8425.method28140(Class9216.field39060, Class9216.field39068, Class9216.field39066);
        Class8425.method28140(Class9216.field39061, Class9216.field39068, Class9216.field39067);
        System.arraycopy((Class9216.field39080 == Class9216.field39079) ? Class9216.field39060 : Class9216.field39061, 0, Class9216.field39062, 0, 3);
        method33781(Class9216.field39183, Class9216.field39060[0], Class9216.field39060[1], Class9216.field39060[2]);
        method33781(Class9216.field39184, Class9216.field39061[0], Class9216.field39061[1], Class9216.field39061[2]);
        method33781(Class9216.field39185, Class9216.field39062[0], Class9216.field39062[1], Class9216.field39062[2]);
        if (Class9216.field39363 != null) {
            Class9216.field39363.method21192();
        }
        method33739("postCelestialRotate");
    }
    
    public static void method33812(final Class7351 class7351) {
        final Matrix4f class7352 = new Matrix4f(class7351.method22569().method32111());
        class7352.method20750();
        class7352.method20768(Class9216.field39068);
        Class8425.method28140(Class9216.field39063, Class9216.field39068, Class9216.field39065);
        method33781(Class9216.field39186, Class9216.field39063[0], Class9216.field39063[1], Class9216.field39063[2]);
        if (Class9216.field39363 != null) {
            Class9216.field39363.method21192();
        }
    }
    
    public static void method33813() {
        if (Class9216.field39039) {
            for (int i = 0; i < Class9216.field39240; ++i) {
                if ((Class9216.field39292 & 1 << i) != 0x0) {
                    Class8933.method31608(33984 + Class9216.field39388[i]);
                    GL32.glTexParameteri(3553, 10241, 9987);
                    GL32.glGenerateMipmap(3553);
                }
            }
            Class8933.method31608(33984);
        }
    }
    
    public static void method33814() {
        GL32.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        method33815();
        final int method32335 = Class9216.field39287.method32335();
        if (method32335 > 1) {
            for (int i = 1; i < method32335; ++i) {
                Class9216.field39213.method16099(i);
                method33815();
            }
            Class9216.field39213.method16099(0);
        }
    }
    
    private static void method33815() {
        if (!method33921()) {
            GL32.glBegin(5);
            GL32.glTexCoord2f(0.0f, 0.0f);
            GL32.glVertex3f(0.0f, 0.0f, 0.0f);
            GL32.glTexCoord2f(1.0f, 0.0f);
            GL32.glVertex3f(1.0f, 0.0f, 0.0f);
            GL32.glTexCoord2f(0.0f, 1.0f);
            GL32.glVertex3f(0.0f, 1.0f, 0.0f);
            GL32.glTexCoord2f(1.0f, 1.0f);
            GL32.glVertex3f(1.0f, 1.0f, 0.0f);
            GL32.glEnd();
        }
        else {
            GL32.glBegin(7);
            GL32.glTexCoord2f(0.0f, 0.0f);
            GL32.glVertex3f(0.0f, 0.0f, 0.0f);
            GL32.glTexCoord2f(1.0f, 0.0f);
            GL32.glVertex3f(1.0f, 0.0f, 0.0f);
            GL32.glTexCoord2f(1.0f, 1.0f);
            GL32.glVertex3f(1.0f, 1.0f, 0.0f);
            GL32.glTexCoord2f(0.0f, 1.0f);
            GL32.glVertex3f(0.0f, 1.0f, 0.0f);
            GL32.glEnd();
        }
    }
    
    public static void method33816() {
        if (!Class9216.field39049) {
            boolean method33818 = method33818(Class9216.field39276);
            if (Class9216.field39290) {
                method33739("pre-render Deferred");
                method33819(Class9216.field39277, false);
                method33818 = true;
            }
            if (method33818) {
                method33797();
                for (int i = 0; i < Class9216.field39240; ++i) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + i, 3553, Class9216.field39419.method34612(i), 0);
                }
                if (Class9216.field39279.method32332() != null) {
                    method33775(Class9216.field39279.method32332());
                }
                else {
                    method33775(Class9216.field39415);
                }
                Class8933.method31608(33984);
                Class9216.field39031.method5290().method5849(Class1774.field9853);
            }
        }
    }
    
    public static void method33817() {
        if (!Class9216.field39049) {
            method33818(Class9216.field39281);
            method33739("pre-render CompositeFinal");
            method33819(Class9216.field39282, true);
        }
    }
    
    private static boolean method33818(final Class9023 class9023) {
        boolean b = false;
        final Boolean[] method32339 = class9023.method32339();
        for (int i = 0; i < Class9216.field39240; ++i) {
            if (Class8571.method29019(method32339[i])) {
                Class9216.field39419.method34615(i);
                b = true;
            }
        }
        return b;
    }
    
    private static void method33819(final Class9023[] array, final boolean b) {
        if (!Class9216.field39049) {
            GL32.glPushMatrix();
            GL32.glLoadIdentity();
            GL32.glMatrixMode(5889);
            GL32.glPushMatrix();
            GL32.glLoadIdentity();
            GL32.glOrtho(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
            GL32.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            Class8933.method31609();
            Class8933.method31502();
            Class8933.method31518();
            Class8933.method31515();
            Class8933.method31516(519);
            Class8933.method31517(false);
            Class8933.method31506();
            if (Class9216.field39243 >= 1) {
                Class8933.method31608(33988);
                Class8933.method31617(Class9216.field39414.get(0));
                if (Class9216.field39243 >= 2) {
                    Class8933.method31608(33989);
                    Class8933.method31617(Class9216.field39414.get(1));
                }
            }
            for (int i = 0; i < Class9216.field39240; ++i) {
                Class8933.method31608(33984 + Class9216.field39388[i]);
                Class8933.method31617(Class9216.field39419.method34612(i));
            }
            Class8933.method31608(33990);
            Class8933.method31617(Class9216.field39412.get(0));
            if (Class9216.field39241 >= 2) {
                Class8933.method31608(33995);
                Class8933.method31617(Class9216.field39412.get(1));
                if (Class9216.field39241 >= 3) {
                    Class8933.method31608(33996);
                    Class8933.method31617(Class9216.field39412.get(2));
                }
            }
            for (int j = 0; j < Class9216.field39242; ++j) {
                Class8933.method31608(33997 + j);
                Class8933.method31617(Class9216.field39413.get(j));
            }
            if (Class9216.field39386) {
                Class8933.method31608(33984 + Class9216.field39385.method12363());
                Class8933.method31617(Class9216.field39385.method12362());
            }
            if (b) {
                method33720(Class9216.field39360);
            }
            else {
                method33720(Class9216.field39361);
            }
            Class8933.method31608(33984);
            for (int k = 0; k < Class9216.field39240; ++k) {
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + k, 3553, Class9216.field39419.method34613(k), 0);
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Class9216.field39412.get(0), 0);
            GL32.glDrawBuffers(Class9216.field39415);
            method33739("pre-composite");
            for (int l = 0; l < array.length; ++l) {
                final Class9023 class9023 = array[l];
                if (class9023.method32329() != 0) {
                    method33776(class9023);
                    method33739(class9023.method32326());
                    if (Class9216.field39292 != 0) {
                        method33813();
                    }
                    method33820();
                    method33814();
                    method33821();
                    for (int n = 0; n < Class9216.field39240; ++n) {
                        if (class9023.method32340()[n]) {
                            Class9216.field39419.method34615(n);
                            Class8933.method31608(33984 + Class9216.field39388[n]);
                            Class8933.method31617(Class9216.field39419.method34612(n));
                            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + n, 3553, Class9216.field39419.method34613(n), 0);
                        }
                    }
                    Class8933.method31608(33984);
                }
            }
            method33739("composite");
            if (b) {
                method33822();
                Class9216.field39047 = true;
            }
            Class8933.method31505();
            Class8933.method31609();
            Class8933.method31503();
            Class8933.method31519();
            Class8933.method31516(515);
            Class8933.method31517(true);
            GL32.glPopMatrix();
            GL32.glMatrixMode(5888);
            GL32.glPopMatrix();
            method33776(Class9216.field39252);
        }
    }
    
    private static void method33820() {
        final Class9529 method32338 = Class9216.field39287.method32338();
        if (method32338 != null) {
            GL32.glViewport((int)(Class9216.field39043 * method32338.method35581()), (int)(Class9216.field39044 * method32338.method35582()), (int)(Class9216.field39043 * method32338.method35580()), (int)(Class9216.field39044 * method32338.method35580()));
        }
    }
    
    private static void method33821() {
        if (Class9216.field39287.method32338() != null) {
            GL32.glViewport(0, 0, Class9216.field39043, Class9216.field39044);
        }
    }
    
    private static void method33822() {
        Class9216.field39048 = false;
        Class9216.field39031.method5234().method18395(true);
        Class8933.method31563(Class9026.field38160, Class9026.field38162, 3553, Class9216.field39031.method5234().field24890, 0);
        GL32.glViewport(0, 0, Class9216.field39031.method5332().method7692(), Class9216.field39031.method5332().method7693());
        Class8933.method31517(true);
        GL32.glClearColor(Class9216.field39069, Class9216.field39070, Class9216.field39071, 1.0f);
        GL32.glClear(16640);
        GL32.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Class8933.method31609();
        Class8933.method31502();
        Class8933.method31518();
        Class8933.method31515();
        Class8933.method31516(519);
        Class8933.method31517(false);
        method33739("pre-final");
        method33776(Class9216.field39284);
        method33739("final");
        if (Class9216.field39292 != 0) {
            method33813();
        }
        method33814();
        method33739("renderCompositeFinal");
    }
    
    public static void method33823() {
        if (Class9216.field39049) {
            method33739("shadow endRender");
        }
        else {
            if (!Class9216.field39047) {
                method33817();
            }
            Class9216.field39045 = false;
            Class8933.method31625(true, true, true, true);
            method33776(Class9216.field39252);
            Class8317.method27609();
            method33739("endRender end");
        }
    }
    
    public static void method33824() {
        Class9216.field39046 = true;
        Class9216.field39108 = true;
        method33775(Class9216.field39415);
        method33776(Class9216.field39260);
        method33886(-2, 0);
    }
    
    public static void method33825(final Vec3d class5487) {
        Class9216.field39072 = (float)class5487.x;
        Class9216.field39073 = (float)class5487.y;
        Class9216.field39074 = (float)class5487.z;
        method33781(Class9216.field39168, Class9216.field39072, Class9216.field39073, Class9216.field39074);
    }
    
    public static void method33826(final Class7351 class7351) {
        final Class4148 method22696 = Class7392.method22694().method22696();
        final float n = (float)(Class9216.field39031.field4648.field23382 * 16);
        final double n2 = n * 0.9238;
        final double n3 = n * 0.3826;
        final double n4 = -n3;
        final double n5 = -n2;
        final double n6 = 16.0;
        double n7 = -Class9216.field39218 + Class9216.field39357.method6847() + 12.0 - 16.0;
        if (Class9216.field39218 < Class9216.field39357.method6847()) {
            n7 = -4.0;
        }
        Class8933.method31635();
        Class8933.method31645(class7351.method22569().method32111());
        method22696.method12390(7, Class9237.field39614);
        method22696.method12432(n4, n7, n5).method12397();
        method22696.method12432(n4, n6, n5).method12397();
        method22696.method12432(n5, n6, n4).method12397();
        method22696.method12432(n5, n7, n4).method12397();
        method22696.method12432(n5, n7, n4).method12397();
        method22696.method12432(n5, n6, n4).method12397();
        method22696.method12432(n5, n6, n3).method12397();
        method22696.method12432(n5, n7, n3).method12397();
        method22696.method12432(n5, n7, n3).method12397();
        method22696.method12432(n5, n6, n3).method12397();
        method22696.method12432(n4, n6, n2).method12397();
        method22696.method12432(n4, n7, n2).method12397();
        method22696.method12432(n4, n7, n2).method12397();
        method22696.method12432(n4, n6, n2).method12397();
        method22696.method12432(n3, n6, n2).method12397();
        method22696.method12432(n3, n7, n2).method12397();
        method22696.method12432(n3, n7, n2).method12397();
        method22696.method12432(n3, n6, n2).method12397();
        method22696.method12432(n2, n6, n3).method12397();
        method22696.method12432(n2, n7, n3).method12397();
        method22696.method12432(n2, n7, n3).method12397();
        method22696.method12432(n2, n6, n3).method12397();
        method22696.method12432(n2, n6, n4).method12397();
        method22696.method12432(n2, n7, n4).method12397();
        method22696.method12432(n2, n7, n4).method12397();
        method22696.method12432(n2, n6, n4).method12397();
        method22696.method12432(n3, n6, n5).method12397();
        method22696.method12432(n3, n7, n5).method12397();
        method22696.method12432(n3, n7, n5).method12397();
        method22696.method12432(n3, n6, n5).method12397();
        method22696.method12432(n4, n6, n5).method12397();
        method22696.method12432(n4, n7, n5).method12397();
        Class7392.method22694().method22695();
        Class8933.method31636();
    }
    
    public static void method33827(final Class7351 class7351) {
        method33812(class7351);
        GL11.glColor3f(Class9216.field39379, Class9216.field39380, Class9216.field39381);
        method33826(class7351);
        GL11.glColor3f(Class9216.field39072, Class9216.field39073, Class9216.field39074);
    }
    
    public static void method33828() {
        Class9216.field39046 = false;
        method33775(Class9216.field39415);
        method33776(Class9216.field39107 ? Class9216.field39258 : Class9216.field39257);
        method33889();
    }
    
    public static void method33829() {
        method33739("beginUpdateChunks1");
        method33738("beginUpdateChunks1");
        if (!Class9216.field39049) {
            method33776(Class9216.field39262);
        }
        method33739("beginUpdateChunks2");
        method33738("beginUpdateChunks2");
    }
    
    public static void method33830() {
        method33739("endUpdateChunks1");
        method33738("endUpdateChunks1");
        if (!Class9216.field39049) {
            method33776(Class9216.field39262);
        }
        method33739("endUpdateChunks2");
        method33738("endUpdateChunks2");
    }
    
    public static boolean method33831(final Class5760 class5760) {
        if (!Class9216.field39325) {
            return true;
        }
        method33739("shouldRenderClouds");
        return Class9216.field39049 ? Class9216.field39302 : (class5760.field23384 != Class2202.field13405);
    }
    
    public static void method33832() {
        Class9216.field39108 = true;
        method33886(-3, 0);
        method33776(Class9216.field39261);
    }
    
    public static void method33833() {
        method33876();
        method33889();
        method33776(Class9216.field39107 ? Class9216.field39258 : Class9216.field39257);
    }
    
    public static void method33834() {
        if (Class9216.field39045) {
            method33776(Class9216.field39270);
        }
    }
    
    public static void method33835(final Entity class399) {
        if (Class9216.field39045) {
            method33776(Class9216.field39270);
            method33836(class399);
        }
    }
    
    public static void method33836(final Entity class399) {
        if (Class9216.field39126.method16084()) {
            Class9216.field39126.method16099(Class8251.method27360(Class9543.method35624(class399)));
        }
    }
    
    public static void method33837() {
        if (Class9216.field39045 && Class9216.field39273.method32329() != Class9216.field39252.method32329()) {
            method33776(Class9216.field39273);
            Class8933.method31503();
            Class8933.method31504(516, 0.0f);
            Class8933.method31520(770, 771);
        }
    }
    
    public static void method33838() {
        if (Class9216.field39045 && Class9216.field39273.method32329() != Class9216.field39252.method32329()) {
            method33776(Class9216.field39270);
            Class8933.method31502();
        }
    }
    
    public static void method33839() {
        if (Class9216.field39045) {
            method33836(null);
            method33776(Class9216.field39107 ? Class9216.field39258 : Class9216.field39257);
        }
    }
    
    public static void method33840() {
        if (Class9216.field39045) {
            Class9216.field39050 = true;
        }
    }
    
    public static void method33841() {
        if (Class9216.field39045) {
            Class9216.field39050 = false;
        }
    }
    
    public static void method33842(final float n, final float n2, final float n3, final float n4) {
        if (Class9216.field39045 && !Class9216.field39049) {
            Class9216.field39125.method16103(n, n2, n3, n4);
        }
    }
    
    public static void method33843() {
        if (Class9216.field39045) {
            Class8990.method32049(Class9216.field39295);
            if (!Class9216.field39049) {
                method33775(Class9216.field39418);
            }
        }
    }
    
    public static void method33844() {
        if (Class9216.field39045 && !Class9216.field39049) {
            method33775(Class9216.field39270.method32332());
        }
    }
    
    public static void method33845() {
        if (Class9216.field39045) {
            method33739("beginBlockEntities");
            method33776(Class9216.field39267);
        }
    }
    
    public static void method33846(final TileEntity tileEntity) {
        if (Class9216.field39045) {
            method33739("nextBlockEntity");
            method33776(Class9216.field39267);
            method33847(tileEntity);
        }
    }
    
    public static void method33847(final TileEntity tileEntity) {
        if (Class9216.field39127.method16084()) {
            Class9216.field39127.method16099(method33848(tileEntity));
        }
    }
    
    private static int method33848(final TileEntity tileEntity) {
        if (tileEntity == null) {
            return -1;
        }
        return Class3660.method11269(tileEntity.method2194());
    }
    
    public static void method33849() {
        if (Class9216.field39045) {
            method33739("endBlockEntities");
            method33847(null);
            method33776(Class9216.field39107 ? Class9216.field39258 : Class9216.field39257);
            Class8990.method32046(Class9216.field39295.method5874());
        }
    }
    
    public static void method33850() {
        method33776(Class9216.field39258);
    }
    
    public static void method33851() {
        method33776(Class9216.field39257);
    }
    
    public static void method33852() {
        method33776(Class9216.field39258);
    }
    
    public static void method33853() {
        if (!Class9216.field39049 && Class9216.field39103) {
            Class9216.field39410.clear();
            GL32.glReadPixels(Class9216.field39043 / 2, Class9216.field39044 / 2, 1, 1, 6402, 5126, Class9216.field39410);
            Class9216.field39100 = Class9216.field39410.get(0);
            final float n = (float)Math.exp(Math.log(0.5) * (Class9216.field39084 * 0.01f) / Class9216.field39102);
            Class9216.field39101 = Class9216.field39101 * n + Class9216.field39100 * (1.0f - n);
        }
    }
    
    public static void method33854() {
        if (!Class9216.field39049) {
            Class8933.method31515();
            Class8933.method31519();
            Class8933.method31520(770, 771);
            Class8933.method31503();
            method33776(Class9216.field39275);
        }
    }
    
    public static void method33855() {
        Class8933.method31518();
        method33776(Class9216.field39258);
    }
    
    public static void method33856() {
        if (!Class9216.field39049 && Class9216.field39241 >= 3) {
            Class8933.method31608(33996);
            GL32.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Class9216.field39043, Class9216.field39044);
            Class8933.method31608(33984);
        }
    }
    
    public static void method33857() {
        if (Class9216.field39241 >= 2) {
            Class8933.method31608(33995);
            method33739("pre copy depth");
            GL32.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Class9216.field39043, Class9216.field39044);
            method33739("copy depth");
            Class8933.method31608(33984);
        }
        Class8990.method32046(Class9216.field39295.method5874());
    }
    
    public static void method33858() {
        if (Class9216.field39045) {
            if (!Class9216.field39049) {
                method33816();
                method33776(Class9216.field39279);
                Class8933.method31519();
                Class8933.method31517(true);
            }
            else {
                Class8933.method31517(true);
            }
        }
    }
    
    public static void method33859() {
        if (Class9216.field39045) {
            if (Class9216.field39049) {}
            method33776(Class9216.field39107 ? Class9216.field39258 : Class9216.field39257);
        }
    }
    
    public static void method33860(final Class7351 class7351) {
        if (Class9216.field39303 != 1.0) {
            class7351.method22565(1.0f, 1.0f, Class9216.field39303);
        }
    }
    
    public static void method33861(final Class7351 class7351, final boolean b) {
        GL32.glMatrixMode(5888);
        GL32.glPushMatrix();
        GL32.glMatrixMode(5889);
        GL32.glPushMatrix();
        GL32.glMatrixMode(5888);
        class7351.method22567();
        if (b) {
            method33776(Class9216.field39280);
        }
        else {
            method33776(Class9216.field39274);
        }
        method33739("beginHand");
        method33738("beginHand");
    }
    
    public static void method33862(final Class7351 class7351) {
        method33739("pre endHand");
        method33738("pre endHand");
        class7351.method22568();
        GL32.glMatrixMode(5889);
        GL32.glPopMatrix();
        GL32.glMatrixMode(5888);
        GL32.glPopMatrix();
        Class8933.method31520(770, 771);
        method33739("endHand");
    }
    
    public static void method33863() {
        Class8933.method31506();
        Class8933.method31518();
    }
    
    public static void method33864() {
    }
    
    public static void method33865(final int n) {
        GL32.glEnable(n);
        if (n == 3553) {
            method33871();
        }
        else if (n == 2912) {
            method33875();
        }
    }
    
    public static void method33866(final int n) {
        GL32.glDisable(n);
        if (n == 3553) {
            method33872();
        }
        else if (n == 2912) {
            method33876();
        }
    }
    
    public static void method33867(final int n) {
        GL32.glEnable(n);
        method33871();
    }
    
    public static void method33868(final int n) {
        GL32.glDisable(n);
        method33872();
    }
    
    public static void method33869(final int n) {
        GL32.glEnable(n);
        method33875();
    }
    
    public static void method33870(final int n) {
        GL32.glDisable(n);
        method33876();
    }
    
    public static void method33871() {
        if (Class9216.field39046) {
            method33776(Class9216.field39260);
        }
        else if (Class9216.field39287 == Class9216.field39256) {
            method33776(Class9216.field39107 ? Class9216.field39258 : Class9216.field39257);
        }
    }
    
    public static void method33872() {
        if (Class9216.field39046) {
            method33776(Class9216.field39259);
        }
        else if (Class9216.field39287 == Class9216.field39257 || Class9216.field39287 == Class9216.field39258) {
            method33776(Class9216.field39256);
        }
    }
    
    public static void method33873() {
        Class9216.field39289.method35863(Class9216.field39287);
        method33776(Class9216.field39256);
    }
    
    public static void method33874() {
        method33776(Class9216.field39289.method35864());
    }
    
    public static void method33875() {
        Class9216.field39108 = true;
        method33778(Class9216.field39165, Class9216.field39377);
        method33780(Class9216.field39166, Class9216.field39378);
    }
    
    public static void method33876() {
        Class9216.field39108 = false;
        method33778(Class9216.field39165, 0);
    }
    
    public static void method33877(final Class317 class317) {
        method33802(class317.field1883);
    }
    
    public static void method33878(final float field39378) {
        Class9216.field39378 = field39378;
        if (Class9216.field39108) {
            method33780(Class9216.field39166, field39378);
        }
    }
    
    public static void method33879(final int n, final int field39377) {
        GL11.glFogi(n, field39377);
        if (n == 2917) {
            Class9216.field39377 = field39377;
            if (Class9216.field39108) {
                method33778(Class9216.field39165, Class9216.field39377);
            }
        }
    }
    
    public static void method33880() {
        Class9216.field39107 = true;
        if (Class9216.field39287 == Class9216.field39257) {
            method33776(Class9216.field39258);
        }
    }
    
    public static void method33881() {
        Class9216.field39107 = false;
        if (Class9216.field39287 == Class9216.field39258) {
            method33776(Class9216.field39257);
        }
    }
    
    public static int method33882() {
        return Class9216.field39424[Class9216.field39425 * 2];
    }
    
    public static int method33883() {
        return Class9216.field39424[Class9216.field39425 * 2 + 1];
    }
    
    public static int method33884(final int n) {
        Class9216.field39424[Class9216.field39425 * 2] = ((Class9216.field39424[Class9216.field39425 * 2] & 0xFFFF) | n << 16);
        return n;
    }
    
    public static int method33885(final int n) {
        Class9216.field39424[Class9216.field39425 * 2 + 1] = ((Class9216.field39424[Class9216.field39425 * 2 + 1] & 0xFFFF0000) | (n & 0xFFFF));
        return n;
    }
    
    public static void method33886(final int n, final int n2) {
        ++Class9216.field39425;
        Class9216.field39424[Class9216.field39425 * 2] = ((n & 0xFFFF) | n2 << 16);
        Class9216.field39424[Class9216.field39425 * 2 + 1] = 0;
    }
    
    public static void method33887(final int n) {
        ++Class9216.field39425;
        Class9216.field39424[Class9216.field39425 * 2] = (n & 0xFFFF);
        Class9216.field39424[Class9216.field39425 * 2 + 1] = 0;
    }
    
    public static void method33888(final Class3833 class3833) {
        ++Class9216.field39425;
        Class9216.field39424[Class9216.field39425 * 2] = ((Class90.field208.method504(class3833) & 0xFFFF) | class3833.method11797(class3833.method11878()).ordinal() << 16);
        Class9216.field39424[Class9216.field39425 * 2 + 1] = 0;
    }
    
    public static void method33889() {
        Class9216.field39424[Class9216.field39425 * 2] = 0;
        Class9216.field39424[Class9216.field39425 * 2 + 1] = 0;
        --Class9216.field39425;
    }
    
    public static void method33890() {
        Class9216.field39031.method5327().method15299();
    }
    
    public static String method33891() {
        if (Class9216.field39324 == null) {
            return null;
        }
        return (Class9216.field39324 instanceof Class7041) ? null : Class9216.field39324.method21530();
    }
    
    public static InputStream method33892(final String s) {
        return (Class9216.field39324 == null) ? null : Class9216.field39324.method21531(s);
    }
    
    public static void method33893() {
        Class9216.field39317 += 2;
        Class9216.field39317 = Class9216.field39317 / 2 * 2;
        if (Class9216.field39317 > 4) {
            Class9216.field39317 = 0;
        }
        Class9216.field39317 = Class8571.method28865(Class9216.field39317, 0, 4);
    }
    
    public static void method33894() {
        try {
            Class.forName("shadersmod.transform.SMCClassTransformer");
        }
        catch (final Throwable t) {
            return;
        }
        throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
    }
    
    public static void method33895() {
        method33896();
        if (Class9216.field39325) {
            Class3660.method11274();
            Class6444.method19215();
            Class8251.method27361();
        }
    }
    
    private static void method33896() {
        Class9216.field39356 = new HashMap<String, String>();
        if (Class9216.field39325) {
            final ArrayList list = new ArrayList();
            final String s = "/shaders/lang/";
            final String s2 = "en_us";
            final String s3 = ".lang";
            list.add(s + s2 + s3);
            list.add(s + method33897(s2) + s3);
            if (!Class8571.method28962().field23476.equals(s2)) {
                final String field23476 = Class8571.method28962().field23476;
                list.add(s + field23476 + s3);
                list.add(s + method33897(field23476) + s3);
            }
            try {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    final InputStream method21531 = Class9216.field39324.method21531((String)iterator.next());
                    if (method21531 != null) {
                        final Class27 class27 = new Class27();
                        Class4647.method13875(method21531, class27);
                        method21531.close();
                        for (final String key : class27.keySet()) {
                            Class9216.field39356.put(key, class27.getProperty(key));
                        }
                    }
                }
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private static String method33897(final String s) {
        final int index = s.indexOf(95);
        if (index < 0) {
            return s;
        }
        return s.substring(0, index) + s.substring(index).toUpperCase(Locale.ROOT);
    }
    
    public static String method33898(final String s, final String s2) {
        final String s3 = Class9216.field39356.get(s);
        return (s3 == null) ? s2 : s3;
    }
    
    public static boolean method33899(String substring) {
        if (substring == null) {
            return false;
        }
        if (substring.length() <= 0) {
            return false;
        }
        final int lastIndex = substring.lastIndexOf("/");
        if (lastIndex >= 0) {
            substring = substring.substring(lastIndex + 1);
        }
        return method33900(substring) != null;
    }
    
    public static Class9023 method33900(final String s) {
        return Class9216.field39251.method34737(s);
    }
    
    public static void method33901(final ItemStack class8321) {
        Class9216.field39058 = method33906(class8321);
    }
    
    public static void method33902(final ItemStack class8321) {
        Class9216.field39059 = method33906(class8321);
    }
    
    public static boolean method33903() {
        return Class9216.field39058;
    }
    
    public static boolean method33904() {
        return Class9216.field39059;
    }
    
    public static boolean method33905() {
        return Class9216.field39053 && Class9216.field39054;
    }
    
    private static boolean method33906(final ItemStack class8321) {
        if (class8321 == null) {
            return false;
        }
        final Item method27622 = class8321.getItem();
        if (method27622 == null) {
            return false;
        }
        if (!(method27622 instanceof Class4036)) {
            return false;
        }
        final Class3833 method27623 = ((Class4036)method27622).method12240();
        return method27623 != null && Class7969.method25824(method27623.method11878()) == Class9484.field40762;
    }
    
    public static boolean method33907(final Class316 class316) {
        return (class316 == Class316.field1877 && Class9216.field39055) || (class316 == Class316.field1878 && Class9216.field39056);
    }
    
    public static boolean method33908() {
        return !Class9216.field39055 && !Class9216.field39056;
    }
    
    public static void method33909(final boolean field39055, final boolean field39056) {
        Class9216.field39055 = field39055;
        Class9216.field39056 = field39056;
    }
    
    public static void method33910(final boolean field39053, final boolean field39054) {
        Class9216.field39053 = field39053;
        Class9216.field39054 = field39054;
    }
    
    public static boolean method33911() {
        return Class9216.field39053;
    }
    
    public static boolean method33912() {
        return Class9216.field39054;
    }
    
    public static float method33913() {
        return (Class9216.field39231 < 0.0f) ? -1.0f : (Class9216.field39229 * Class9216.field39231);
    }
    
    public static void method33914(final boolean field39052) {
        Class9216.field39052 = field39052;
    }
    
    public static boolean method33915() {
        return Class9216.field39052;
    }
    
    public static void method33916() {
        if (Class9216.field39045) {
            method33776(Class9216.field39268);
        }
    }
    
    public static void method33917() {
        if (Class9216.field39045) {
            method33776(Class9216.field39267);
        }
    }
    
    public static Class1848 method33918() {
        return Class9216.field39357;
    }
    
    public static BlockPos method33919() {
        return new BlockPos(Class9216.field39217, Class9216.field39218, Class9216.field39219);
    }
    
    public static boolean method33920() {
        return Class9216.field39363 != null;
    }
    
    public static boolean method33921() {
        return !Class9216.field39121 || Class9216.field39035.GL_NV_geometry_shader4;
    }
    
    public static boolean method33922() {
        return Class9216.field39325;
    }
    
    public static boolean method33923() {
        return Class9216.field39325;
    }
    
    public static boolean method33924() {
        return Class9216.field39325;
    }
    
    static {
        Class9216.field39033 = false;
        Class9216.field39034 = false;
        Class9216.field39039 = false;
        Class9216.field39040 = 0;
        Class9216.field39041 = 0;
        Class9216.field39042 = 0;
        Class9216.field39043 = 0;
        Class9216.field39044 = 0;
        Class9216.field39045 = false;
        Class9216.field39046 = false;
        Class9216.field39047 = false;
        Class9216.field39048 = false;
        Class9216.field39049 = false;
        Class9216.field39050 = false;
        Class9216.field39057 = false;
        Class9216.field39058 = false;
        Class9216.field39059 = false;
        Class9216.field39060 = new float[4];
        Class9216.field39061 = new float[4];
        Class9216.field39062 = new float[4];
        Class9216.field39063 = new float[4];
        Class9216.field39064 = new float[4];
        Class9216.field39065 = new float[] { 0.0f, 100.0f, 0.0f, 0.0f };
        Class9216.field39066 = new float[] { 0.0f, 100.0f, 0.0f, 0.0f };
        Class9216.field39067 = new float[] { 0.0f, -100.0f, 0.0f, 0.0f };
        Class9216.field39068 = new float[16];
        Class9216.field39075 = 0L;
        Class9216.field39076 = 0L;
        Class9216.field39077 = 0L;
        Class9216.field39078 = 0.0f;
        Class9216.field39079 = 0.0f;
        Class9216.field39080 = 0.0f;
        Class9216.field39081 = 0;
        Class9216.field39082 = 0L;
        Class9216.field39083 = 0L;
        Class9216.field39084 = 0L;
        Class9216.field39085 = 0;
        Class9216.field39086 = 0.0f;
        Class9216.field39087 = 0.0f;
        Class9216.field39088 = 0;
        Class9216.field39089 = 0.0f;
        Class9216.field39090 = 0.0f;
        Class9216.field39091 = 600.0f;
        Class9216.field39092 = 200.0f;
        Class9216.field39093 = 10.0f;
        Class9216.field39094 = false;
        Class9216.field39095 = 0;
        Class9216.field39096 = 0;
        Class9216.field39097 = 0.0f;
        Class9216.field39098 = 0.0f;
        Class9216.field39099 = 0.0f;
        Class9216.field39100 = 0.0f;
        Class9216.field39101 = 0.0f;
        Class9216.field39102 = 1.0f;
        Class9216.field39103 = false;
        Class9216.field39104 = 1;
        Class9216.field39105 = 0.0f;
        Class9216.field39106 = 0.0f;
        Class9216.field39107 = false;
        Class9216.field39108 = true;
        Class9216.field39109 = 11;
        Class9216.field39110 = Class9216.field39109 + 0;
        Class9216.field39111 = Class9216.field39109 + 1;
        Class9216.field39112 = Class9216.field39109 + 2;
        Class9216.field39113 = false;
        Class9216.field39114 = false;
        Class9216.field39115 = false;
        Class9216.field39116 = false;
        Class9216.field39117 = false;
        Class9216.field39118 = false;
        Class9216.field39119 = false;
        Class9216.field39120 = 3;
        Class9216.field39121 = false;
        Class9216.field39122 = 0;
        Class9216.field39123 = 0;
        Class9216.field39124 = new Class9114();
        Class9216.field39125 = Class9216.field39124.method32974("entityColor");
        Class9216.field39126 = Class9216.field39124.method32969("entityId");
        Class9216.field39127 = Class9216.field39124.method32969("blockEntityId");
        Class9216.field39128 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[62]);
        Class9216.field39129 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[42]);
        Class9216.field39130 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[63]);
        Class9216.field39131 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[64]);
        Class9216.field39132 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[67]);
        Class9216.field39133 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[66]);
        Class9216.field39134 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[65]);
        Class9216.field39135 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[68]);
        Class9216.field39136 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[69]);
        Class9216.field39137 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[74]);
        Class9216.field39138 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[76]);
        Class9216.field39139 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[75]);
        Class9216.field39140 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[77]);
        Class9216.field39141 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[78]);
        Class9216.field39142 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[271]);
        Class9216.field39143 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[81]);
        Class9216.field39144 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[83]);
        Class9216.field39145 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[85]);
        Class9216.field39146 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[70]);
        Class9216.field39147 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[71]);
        Class9216.field39148 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[72]);
        Class9216.field39149 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[73]);
        Class9216.field39150 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[79]);
        Class9216.field39151 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[80]);
        Class9216.field39152 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[82]);
        Class9216.field39153 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[84]);
        Class9216.field39154 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[87]);
        Class9216.field39155 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[88]);
        Class9216.field39156 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[89]);
        Class9216.field39157 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[90]);
        Class9216.field39158 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[86]);
        Class9216.field39159 = Class9216.field39124.method32969(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[91]);
        Class9216.field39160 = Class9216.field39124.method32969("tex");
        Class9216.field39161 = Class9216.field39124.method32969("heldItemId");
        Class9216.field39162 = Class9216.field39124.method32969("heldBlockLightValue");
        Class9216.field39163 = Class9216.field39124.method32969("heldItemId2");
        Class9216.field39164 = Class9216.field39124.method32969("heldBlockLightValue2");
        Class9216.field39165 = Class9216.field39124.method32969("fogMode");
        Class9216.field39166 = Class9216.field39124.method32972("fogDensity");
        Class9216.field39167 = Class9216.field39124.method32973("fogColor");
        Class9216.field39168 = Class9216.field39124.method32973("skyColor");
        Class9216.field39169 = Class9216.field39124.method32969("worldTime");
        Class9216.field39170 = Class9216.field39124.method32969("worldDay");
        Class9216.field39171 = Class9216.field39124.method32969("moonPhase");
        Class9216.field39172 = Class9216.field39124.method32969("frameCounter");
        Class9216.field39173 = Class9216.field39124.method32972("frameTime");
        Class9216.field39174 = Class9216.field39124.method32972("frameTimeCounter");
        Class9216.field39175 = Class9216.field39124.method32972("sunAngle");
        Class9216.field39176 = Class9216.field39124.method32972("shadowAngle");
        Class9216.field39177 = Class9216.field39124.method32972("rainStrength");
        Class9216.field39178 = Class9216.field39124.method32972("aspectRatio");
        Class9216.field39179 = Class9216.field39124.method32972("viewWidth");
        Class9216.field39180 = Class9216.field39124.method32972("viewHeight");
        Class9216.field39181 = Class9216.field39124.method32972("near");
        Class9216.field39182 = Class9216.field39124.method32972("far");
        Class9216.field39183 = Class9216.field39124.method32973("sunPosition");
        Class9216.field39184 = Class9216.field39124.method32973("moonPosition");
        Class9216.field39185 = Class9216.field39124.method32973("shadowLightPosition");
        Class9216.field39186 = Class9216.field39124.method32973("upPosition");
        Class9216.field39187 = Class9216.field39124.method32973("previousCameraPosition");
        Class9216.field39188 = Class9216.field39124.method32973("cameraPosition");
        Class9216.field39189 = Class9216.field39124.method32975("gbufferModelView");
        Class9216.field39190 = Class9216.field39124.method32975("gbufferModelViewInverse");
        Class9216.field39191 = Class9216.field39124.method32975("gbufferPreviousProjection");
        Class9216.field39192 = Class9216.field39124.method32975("gbufferProjection");
        Class9216.field39193 = Class9216.field39124.method32975("gbufferProjectionInverse");
        Class9216.field39194 = Class9216.field39124.method32975("gbufferPreviousModelView");
        Class9216.field39195 = Class9216.field39124.method32975("shadowProjection");
        Class9216.field39196 = Class9216.field39124.method32975("shadowProjectionInverse");
        Class9216.field39197 = Class9216.field39124.method32975("shadowModelView");
        Class9216.field39198 = Class9216.field39124.method32975("shadowModelViewInverse");
        Class9216.field39199 = Class9216.field39124.method32972("wetness");
        Class9216.field39200 = Class9216.field39124.method32972("eyeAltitude");
        Class9216.field39201 = Class9216.field39124.method32970("eyeBrightness");
        Class9216.field39202 = Class9216.field39124.method32970("eyeBrightnessSmooth");
        Class9216.field39203 = Class9216.field39124.method32970("terrainTextureSize");
        Class9216.field39204 = Class9216.field39124.method32969("terrainIconSize");
        Class9216.field39205 = Class9216.field39124.method32969("isEyeInWater");
        Class9216.field39206 = Class9216.field39124.method32972("nightVision");
        Class9216.field39207 = Class9216.field39124.method32972("blindness");
        Class9216.field39208 = Class9216.field39124.method32972("screenBrightness");
        Class9216.field39209 = Class9216.field39124.method32969("hideGUI");
        Class9216.field39210 = Class9216.field39124.method32972(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[183]);
        Class9216.field39211 = Class9216.field39124.method32970("atlasSize");
        Class9216.field39212 = Class9216.field39124.method32971("blendFunc");
        Class9216.field39213 = Class9216.field39124.method32969("instanceId");
        Class9216.field39222 = 0;
        Class9216.field39223 = false;
        Class9216.field39224 = 1024;
        Class9216.field39225 = 1024;
        Class9216.field39226 = 1024;
        Class9216.field39227 = 1024;
        Class9216.field39228 = 90.0f;
        Class9216.field39229 = 160.0f;
        Class9216.field39230 = true;
        Class9216.field39231 = -1.0f;
        Class9216.field39232 = 0;
        Class9216.field39233 = false;
        Class9216.field39234 = false;
        Class9216.field39240 = 0;
        Class9216.field39241 = 0;
        Class9216.field39242 = 0;
        Class9216.field39243 = 0;
        Class9216.field39244 = 0;
        Class9216.field39245 = 0;
        Class9216.field39246 = 0;
        Class9216.field39247 = 0;
        Class9216.field39248 = new int[8];
        Class9216.field39249 = new boolean[8];
        Class9216.field39250 = new Vector4f[8];
        Class9216.field39251 = new Class9363();
        field39252 = Class9216.field39251.method34735();
        field39253 = Class9216.field39251.method34731(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[67], Class9216.field39252);
        field39254 = Class9216.field39251.method34731("shadow_solid", Class9216.field39253);
        field39255 = Class9216.field39251.method34731("shadow_cutout", Class9216.field39253);
        field39256 = Class9216.field39251.method34728("gbuffers_basic", Class9216.field39252);
        field39257 = Class9216.field39251.method34728("gbuffers_textured", Class9216.field39256);
        field39258 = Class9216.field39251.method34728("gbuffers_textured_lit", Class9216.field39257);
        field39259 = Class9216.field39251.method34728("gbuffers_skybasic", Class9216.field39256);
        field39260 = Class9216.field39251.method34728("gbuffers_skytextured", Class9216.field39257);
        field39261 = Class9216.field39251.method34728("gbuffers_clouds", Class9216.field39257);
        field39262 = Class9216.field39251.method34728("gbuffers_terrain", Class9216.field39258);
        field39263 = Class9216.field39251.method34728("gbuffers_terrain_solid", Class9216.field39262);
        field39264 = Class9216.field39251.method34728("gbuffers_terrain_cutout_mip", Class9216.field39262);
        field39265 = Class9216.field39251.method34728("gbuffers_terrain_cutout", Class9216.field39262);
        field39266 = Class9216.field39251.method34728("gbuffers_damagedblock", Class9216.field39262);
        field39267 = Class9216.field39251.method34728("gbuffers_block", Class9216.field39262);
        field39268 = Class9216.field39251.method34728("gbuffers_beaconbeam", Class9216.field39257);
        field39269 = Class9216.field39251.method34728("gbuffers_item", Class9216.field39258);
        field39270 = Class9216.field39251.method34728("gbuffers_entities", Class9216.field39258);
        field39271 = Class9216.field39251.method34728("gbuffers_entities_glowing", Class9216.field39270);
        field39272 = Class9216.field39251.method34728("gbuffers_armor_glint", Class9216.field39257);
        field39273 = Class9216.field39251.method34728("gbuffers_spidereyes", Class9216.field39257);
        field39274 = Class9216.field39251.method34728("gbuffers_hand", Class9216.field39258);
        field39275 = Class9216.field39251.method34728("gbuffers_weather", Class9216.field39258);
        field39276 = Class9216.field39251.method34732("deferred_pre");
        field39277 = Class9216.field39251.method34734("deferred", 16);
        field39278 = Class9216.field39277[0];
        field39279 = Class9216.field39251.method34728("gbuffers_water", Class9216.field39262);
        field39280 = Class9216.field39251.method34728("gbuffers_hand_water", Class9216.field39274);
        field39281 = Class9216.field39251.method34732("composite_pre");
        field39282 = Class9216.field39251.method34733(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[85], 16);
        field39283 = Class9216.field39282[0];
        field39284 = Class9216.field39251.method34729(Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[316]);
        field39285 = Class9216.field39251.method34736();
        field39286 = Class9216.field39251.method34739();
        Class9216.field39287 = Class9216.field39252;
        Class9216.field39288 = 0;
        Class9216.field39289 = new Class9573();
        Class9216.field39290 = false;
        Class9216.field39291 = null;
        Class9216.field39292 = 0;
        Class9216.field39293 = null;
        Class9216.field39294 = null;
        Class9216.field39295 = null;
        Class9216.field39296 = new boolean[2];
        Class9216.field39297 = new boolean[2];
        Class9216.field39298 = new boolean[2];
        Class9216.field39299 = new boolean[8];
        Class9216.field39300 = new boolean[8];
        Class9216.field39301 = false;
        Class9216.field39302 = false;
        Class9216.field39303 = 0.125f;
        Class9216.field39304 = 1.0f;
        Class9216.field39305 = 1.0f;
        Class9216.field39306 = 0;
        Class9216.field39307 = 0;
        Class9216.field39308 = 0;
        Class9216.field39309 = 0;
        Class9216.field39310 = 0;
        Class9216.field39311 = 0;
        Class9216.field39312 = true;
        Class9216.field39313 = true;
        Class9216.field39314 = true;
        Class9216.field39315 = new Class7095("oldLighting", "Classic Lighting", 0);
        Class9216.field39316 = new Class7095("oldHandLight", "Old Hand Light", 0);
        Class9216.field39317 = 0;
        field39320 = new String[] { "Nearest", "Nearest-Nearest", "Nearest-Linear" };
        field39321 = new String[] { "Nearest", "Linear" };
        field39322 = new int[] { 9728, 9984, 9986 };
        field39323 = new int[] { 9728, 9729 };
        Class9216.field39324 = null;
        Class9216.field39325 = false;
        field39331 = new File(Class869.method5277().field4652, "shaderpacks");
        Class9216.field39332 = new File(Class869.method5277().field4652, "optionsshaders.txt");
        Class9216.field39333 = null;
        Class9216.field39334 = null;
        Class9216.field39335 = null;
        Class9216.field39336 = null;
        Class9216.field39337 = new HashMap<String, Class326>();
        Class9216.field39339 = new Class7093("clouds", "Clouds", 0);
        Class9216.field39340 = new Class7095("oldLighting", "Classic Lighting", 0);
        Class9216.field39341 = new Class7095("oldHandLight", "Old Hand Light", 0);
        Class9216.field39342 = new Class7095("dynamicHandLight", "Dynamic Hand Light", 0);
        Class9216.field39343 = new Class7095("shadowTranslucent", "Shadow Translucent", 0);
        Class9216.field39344 = new Class7095("underwaterOverlay", "Underwater Overlay", 0);
        Class9216.field39345 = new Class7095("sun", "Sun", 0);
        Class9216.field39346 = new Class7095("moon", "Moon", 0);
        Class9216.field39347 = new Class7095("vignette", "Vignette", 0);
        Class9216.field39348 = new Class7095("backFace.solid", "Back-face Solid", 0);
        Class9216.field39349 = new Class7095("backFace.cutout", "Back-face Cutout", 0);
        Class9216.field39350 = new Class7095("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
        Class9216.field39351 = new Class7095("backFace.translucent", "Back-face Translucent", 0);
        Class9216.field39352 = new Class7095("rain.depth", "Rain Depth", 0);
        Class9216.field39353 = new Class7095("beacon.beam.depth", "Rain Depth", 0);
        Class9216.field39354 = new Class7095("separateAo", "Separate AO", 0);
        Class9216.field39355 = new Class7095("frustum.culling", "Frustum Culling", 0);
        Class9216.field39356 = new HashMap<String, String>();
        Class9216.field39357 = null;
        Class9216.field39358 = new ArrayList<Integer>();
        Class9216.field39359 = null;
        Class9216.field39360 = null;
        Class9216.field39361 = null;
        Class9216.field39362 = null;
        Class9216.field39363 = null;
        field39367 = new String[] { "gbuffers", Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[85], "deferred" };
        field39370 = System.getProperty("shaders.debug.save", "false").equals("true");
        Class9216.field39371 = 0.5f;
        Class9216.field39372 = 0.6f;
        Class9216.field39373 = 0.8f;
        Class9216.field39374 = -1.0f;
        Class9216.field39375 = 0.0f;
        Class9216.field39376 = 0.0f;
        Class9216.field39377 = 0;
        Class9216.field39378 = 0.0f;
        Class9216.field39382 = 2.0f;
        Class9216.field39383 = 16;
        Class9216.field39384 = new int[2];
        Class9216.field39386 = false;
        Class9216.field39387 = 256;
        field39388 = new int[] { 0, 1, 2, 3, 7, 8, 9, 10 };
        field39389 = (285 + 8 * Class9216.field39285) * 4;
        field39390 = (ByteBuffer)BufferUtils.createByteBuffer(Class9216.field39389).limit();
        field39391 = new float[16];
        field39392 = new float[16];
        field39393 = new float[16];
        field39394 = new float[16];
        field39395 = new float[16];
        field39396 = new float[16];
        field39397 = new float[16];
        field39398 = new float[16];
        field39399 = method33701(16);
        field39400 = method33701(16);
        field39401 = method33701(16);
        field39402 = method33701(16);
        field39403 = method33701(16);
        field39404 = method33701(16);
        field39405 = method33701(16);
        field39406 = method33701(16);
        field39407 = method33701(16);
        field39408 = method33701(16);
        field39409 = method33701(16);
        field39410 = method33701(16);
        field39411 = method33700(16);
        field39412 = method33700(3);
        field39413 = method33700(8);
        field39414 = method33700(2);
        field39415 = method33700(8);
        field39416 = method33700(8);
        field39417 = (IntBuffer)method33700(8).limit();
        field39418 = (IntBuffer)method33700(8).put(36064).position().limit(1);
        field39419 = new Class9339(Class9216.field39411, 8);
        field39421 = new String[] { "R8", "RG8", "RGB8", "RGBA8", "R8_SNORM", "RG8_SNORM", "RGB8_SNORM", "RGBA8_SNORM", "R16", "RG16", Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[249], "RGBA16", "R16_SNORM", "RG16_SNORM", "RGB16_SNORM", "RGBA16_SNORM", "R16F", "RG16F", "RGB16F", "RGBA16F", "R32F", "RG32F", Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[247], Class9216.\u3cd8\ua7b1\u5660\u76cc\u65ed\ua592[245], "R32I", "RG32I", "RGB32I", "RGBA32I", "R32UI", "RG32UI", "RGB32UI", "RGBA32UI", "R3_G3_B2", "RGB5_A1", "RGB10_A2", "R11F_G11F_B10F", "RGB9_E5" };
        field39422 = new int[] { 33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33325, 33327, 34843, 34842, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898, 35901 };
        field39423 = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
        Class9216.field39424 = new int[32];
        Class9216.field39425 = 0;
    }
}
