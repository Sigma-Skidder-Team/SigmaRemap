// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.apache.http.HttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import java.net.UnknownHostException;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import java.net.InetAddress;
import java.util.HashMap;
import java.nio.IntBuffer;
import java.nio.FloatBuffer;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.net.Proxy;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;

import java.util.Collections;
import java.util.UUID;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.commons.codec.binary.Base64;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URI;
import java.awt.Desktop;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Class6430
{
    private static final Class869 field25541;
    public static final float field25542 = 0.3f;
    public static final float[] field25543;
    public static final float[] field25544;
    public static final ResourceLocation field25545;
    private static boolean field25546;
    
    public static void method19106(final String s) {
        Class6430.field25541.field4647.method3807().method3761(new StringTextComponent(s));
    }
    
    public static void method19107(final String s) {
        Class6430.field25541.method5269().method17292(new Class4317(s));
    }
    
    public static List<PlayerEntity> method19108() {
        final ArrayList list = new ArrayList();
        Class6430.field25541.field4683.field10072.forEach((p1, class399) -> {
            if (!(!(class399 instanceof PlayerEntity))) {
                list2.add(class399);
            }
            return;
        });
        return list;
    }
    
    public static Color method19109(final Color color, final Color color2, final float n) {
        final float n2 = 1.0f - n;
        return new Color((color.getRed() * n + color2.getRed() * n2) / 255.0f, (color.getGreen() * n + color2.getGreen() * n2) / 255.0f, (color.getBlue() * n + color2.getBlue() * n2) / 255.0f);
    }
    
    public static Color method19110(final Color... array) {
        if (array == null) {
            return Color.WHITE;
        }
        if (array.length > 0) {
            final float n = 1.0f / array.length;
            float n2 = 0.0f;
            float n3 = 0.0f;
            float n4 = 0.0f;
            float n5 = 0.0f;
            for (Color black : array) {
                if (black == null) {
                    black = Color.BLACK;
                }
                n2 += black.getRed() * n;
                n3 += black.getGreen() * n;
                n4 += black.getBlue() * n;
                n5 += black.getAlpha() * n;
            }
            return new Color(n2 / 255.0f, n3 / 255.0f, n4 / 255.0f, n5 / 255.0f);
        }
        return Color.WHITE;
    }
    
    public static Entity method19111(final Entity class399, final List<Entity> list) {
        if (list.size() > 0) {
            Entity class400 = null;
            for (int i = 0; i < list.size(); ++i) {
                if (class400 == null || class399.method1732((Entity)list.get(i)) < class399.method1732(class400)) {
                    class400 = (Entity)list.get(i);
                }
            }
            return class400;
        }
        return null;
    }
    
    public static final boolean method19112(final Entity class399) {
        return Class6430.field25541.field4683.method6968(class399.boundingBox);
    }
    
    public static final boolean method19113(final Entity class399) {
        final double n = class399.posX - class399.lastTickPosX;
        final double n2 = class399.posY - class399.lastTickPosY;
        final double n3 = class399.posZ - class399.lastTickPosZ;
        if (n == 0.0) {
            if (n2 == 0.0) {
                if (n3 == 0.0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static final boolean method19114() {
        return Class6430.field25541.field4684.field2968 != 0.0f || Class6430.field25541.field4684.field2970 != 0.0f;
    }
    
    public static float[] method19115(final BlockPos class354, final Direction class355) {
        return method19116(class354.getX(), class354.getY(), class354.getZ(), class355);
    }
    
    public static float[] method19116(final double n, final double n2, final double n3, final Direction class179) {
        final Class411 class181;
        final Class411 class180 = class181 = new Class411(Class6430.field25541.field4683, n + 0.5, n2 + 0.5, n3 + 0.5);
        class181.posX += class179.getDirectionVec().getX() * 0.25;
        final Class411 class182 = class180;
        class182.posY += class179.getDirectionVec().getY() * 0.25;
        final Class411 class183 = class180;
        class183.posZ += class179.getDirectionVec().getZ() * 0.25;
        return method19117(class180.posX, class180.posY, class180.posZ);
    }
    
    public static float[] method19117(final double n, final double n2, final double n3) {
        final double x = n - Class6430.field25541.field4684.posX;
        final double y = n2 - (Class6430.field25541.field4684.posY + Class6430.field25541.field4684.method1892());
        final double y2 = n3 - Class6430.field25541.field4684.posZ;
        return new float[] { Class6430.field25541.field4684.rotationYaw + MathHelper.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class6430.field25541.field4684.rotationYaw), Class6430.field25541.field4684.rotationPitch + MathHelper.method35668((float)(-(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class6430.field25541.field4684.rotationPitch) };
    }
    
    public static int method19118(final int n, final float n2) {
        return (int)(n2 * 255.0f) << 24 | (n & 0xFFFFFF);
    }
    
    public static int method19119(final int rgb) {
        final Color color = new Color(rgb);
        return ((299 * color.getRed() + 587 * color.getGreen() + 114 * color.getBlue()) / 1000 < 128.0) ? Color.white.getRGB() : Color.black.getRGB();
    }
    
    public static int method19120(final int n, final int n2, final float n3) {
        final int n4 = n >> 24 & 0xFF;
        final int n5 = n >> 16 & 0xFF;
        final int n6 = n >> 8 & 0xFF;
        final int n7 = n & 0xFF;
        final int n8 = n2 >> 24 & 0xFF;
        final int n9 = n2 >> 16 & 0xFF;
        final int n10 = n2 >> 8 & 0xFF;
        final int n11 = n2 & 0xFF;
        final float n12 = 1.0f - n3;
        return (int)(n4 * n3 + n8 * n12) << 24 | ((int)(n5 * n3 + n9 * n12) & 0xFF) << 16 | ((int)(n6 * n3 + n10 * n12) & 0xFF) << 8 | ((int)(n7 * n3 + n11 * n12) & 0xFF);
    }
    
    public static int method19121(final int n, final float n2) {
        return (n >> 24 & 0xFF) << 24 | ((int)((n >> 16 & 0xFF) * (1.0f - n2)) & 0xFF) << 16 | ((int)((n >> 8 & 0xFF) * (1.0f - n2)) & 0xFF) << 8 | ((int)((n & 0xFF) * (1.0f - n2)) & 0xFF);
    }
    
    public static int method19122(final int n, final float n2) {
        final int n3 = n >> 24 & 0xFF;
        final int n4 = n >> 16 & 0xFF;
        final int n5 = n >> 8 & 0xFF;
        final int n6 = n & 0xFF;
        return n3 << 24 | ((int)(n4 + (255 - n4) * n2) & 0xFF) << 16 | ((int)(n5 + (255 - n5) * n2) & 0xFF) << 8 | ((int)(n6 + (255 - n6) * n2) & 0xFF);
    }
    
    public static String method19123(final String s) {
        return s.replaceAll("(?i)&([a-f0-9])", "§$1");
    }
    
    public boolean method19124(final char ch) {
        return "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8£\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1ªº¿®¬½¼¡«»\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261±\u2265\u2264\u2320\u2321\u00f7\u2248°\u2219·\u221a\u207f²\u25a0\u0000".indexOf(ch) != -1;
    }
    
    public static void method19125(final String str) {
        try {
            final Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    desktop.browse(new URI(str));
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        catch (final Exception ex2) {}
    }
    
    public static List<String> method19126(final String s) {
        String method19127 = null;
        List<String> method19128 = new ArrayList<String>();
        try {
            method19127 = method19127(s);
        }
        catch (final Exception ex) {}
        if (method19127 == null) {
            return method19128;
        }
        try {
            method19128 = method19130(method19127);
        }
        catch (final Exception ex2) {}
        return method19128;
    }
    
    public static String method19127(final String str) throws Exception {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://api.mojang.com/users/profiles/minecraft/" + str).openStream()));
        String string = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            string += line;
        }
        bufferedReader.close();
        return new Class4405(string).method13268("id");
    }
    
    public static String method19128(final String s) throws Exception {
        String method13268 = "";
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + method19127(s)).openStream()));
        String string = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            string += line;
        }
        String method13269 = "";
        for (final Class4405 class4405 : new Class4405(string).method13263("properties")) {
            if (!class4405.method13269("value")) {
                continue;
            }
            if (!class4405.method13269("name")) {
                continue;
            }
            method13269 = class4405.method13268("value");
        }
        if (Base64.isBase64(method13269)) {
            final Class4405 class4406 = new Class4405(new String(Base64.decodeBase64(method13269)));
            if (class4406.method13269("textures")) {
                final Class4405 method13270 = class4406.method13264("textures");
                if (method13270.method13269("SKIN")) {
                    method13268 = method13270.method13264("SKIN").method13268("url");
                }
            }
            return method13268;
        }
        return method13268;
    }
    
    public static String method19129(final String str) throws Exception {
        String method13268 = "";
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + str).openStream()));
        String string = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            string += line;
        }
        String method13269 = "";
        for (final Class4405 class4405 : new Class4405(string).method13263("properties")) {
            if (!class4405.method13269("value")) {
                continue;
            }
            if (!class4405.method13269("name")) {
                continue;
            }
            method13269 = class4405.method13268("value");
        }
        if (Base64.isBase64(method13269)) {
            final Class4405 class4406 = new Class4405(new String(Base64.decodeBase64(method13269)));
            if (class4406.method13269("textures")) {
                final Class4405 method13270 = class4406.method13264("textures");
                System.out.println("tex");
                if (method13270.method13269("SKIN")) {
                    method13268 = method13270.method13264("SKIN").method13268("url");
                }
            }
            System.out.println(method13268);
            return method13268;
        }
        return method13268;
    }
    
    public static List<String> method19130(final String s) throws Exception {
        final ArrayList list = new ArrayList();
        String string = "";
        System.out.println("https://api.mojang.com/user/profiles/" + s.replaceAll("-", "") + "/names");
        final CloseableHttpResponse execute = HttpClients.createDefault().execute((HttpUriRequest)new HttpGet("https://api.mojang.com/user/profiles/" + s.replaceAll("-", "") + "/names"));
        if (execute.getStatusLine().getStatusCode() == 204) {
            final ArrayList list2 = new ArrayList();
            list2.add("Unknown Name");
            return list2;
        }
        try {
            string = EntityUtils.toString(execute.getEntity());
        }
        finally {
            execute.close();
        }
        final Class88 class88 = new Class88(string);
        for (int i = 0; i < class88.method462(); ++i) {
            list.add(new Class4405(class88.method449(i).toString()).method13268("name"));
        }
        return list;
    }
    
    public static float[] method19131(final float n, final float n2, final float n3, final float n4) {
        float n5;
        float n6;
        if (n3 / n4 > n / n2) {
            n5 = n3;
            n6 = n2 * n3 / n;
        }
        else {
            n5 = n * n4 / n2;
            n6 = n4;
        }
        return new float[] { (n3 - n5) / 2.0f, (n4 - n6) / 2.0f, n5, n6 };
    }
    
    public static float method19132(final float n, final float n2, final float n3) {
        float method35668 = MathHelper.method35668(n2 - n);
        if (method35668 > n3) {
            method35668 = n3;
        }
        if (method35668 < -n3) {
            method35668 = -n3;
        }
        return n + method35668;
    }
    
    public static float method19133(final Integer[] array) {
        final int n = array.length / 2;
        if (array.length % 2 != 1) {
            return (array[n - 1] + array[n]) / 2.0f;
        }
        return array[n];
    }
    
    public static int method19134(final Color color) {
        return 0xFF000000 | (color.getRed() << 16 & 0xFF0000) | (color.getGreen() << 8 & 0xFF00) | (color.getBlue() & 0xFF);
    }
    
    public static int method19135() {
        for (final Class9081 class9081 : Class6430.field25541.method5269().method17370()) {
            if (class9081.method32719().getId().equals(Class6430.field25541.field4684.method1865()) && !Class6430.field25541.method5283()) {
                return class9081.method32722();
            }
        }
        return 0;
    }
    
    public static Color method19136(final float n) {
        final float n2 = 14000.0f;
        final Color color = new Color((int)Long.parseLong(Integer.toHexString(Color.HSBtoRGB(System.currentTimeMillis() % (int)n2 / n2, 1.0f, 1.0f)), 16));
        return new Color(color.getRed() / 255.0f * n, color.getGreen() / 255.0f * n, color.getBlue() / 255.0f * n, color.getAlpha() / 255.0f);
    }
    
    public static Color method19137(final float n, final int n2) {
        final Color color = new Color((int)Long.parseLong(Integer.toHexString(Color.HSBtoRGB((n2 + System.currentTimeMillis()) % (int)n / n, 1.0f, 1.0f)), 16));
        return new Color(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f);
    }
    
    public static List<Entity> method19138() {
        final ArrayList list = new ArrayList();
        Class6430.field25541.field4683.field10072.forEach((p1, class399) -> list2.add(class399));
        return list;
    }
    
    public static float[] method19139(final int n) {
        return new float[] { (n >> 16 & 0xFF) / 255.0f, (n >> 8 & 0xFF) / 255.0f, (n & 0xFF) / 255.0f, (n >> 24 & 0xFF) / 255.0f };
    }
    
    public static float method19140(final int n) {
        return (n >> 24 & 0xFF) / 255.0f;
    }
    
    public static Entity method19141(final float n, final float n2, final float n3, final double n4) {
        final Class7007 method19142 = method19142(n, n2, n3, n4);
        if (method19142 == null) {
            return null;
        }
        return method19142.method21452();
    }
    
    public static Class7007 method19142(final float n, final float n2, final float n3, final double n4) {
        final Vec3d class5487 = new Vec3d(Class6430.field25541.field4684.posX, Class6430.field25541.field4684.posY + Class6430.field25541.field4684.method1892(), Class6430.field25541.field4684.posZ);
        final Entity method5303 = Class6430.field25541.method5303();
        if (method5303 != null && Class6430.field25541.field4683 != null) {
            double n5 = Class6430.field25541.field4682.method27315();
            if (n3 != 0.0f) {
                n5 = n3;
            }
            final Vec3d method5304 = method19151(n2, n);
            return method19143(Class6430.field25541.field4683, method5303, class5487, class5487.add(method5304.x * n5, method5304.y * n5, method5304.z * n5), method5303.getBoundingBox().expand(method5304.scale(n5)).grow(1.0, 1.0, 1.0), class5488 -> class5488 instanceof LivingEntity, n3 * n3, n4);
        }
        return null;
    }
    
    public static Class7007 method19143(final World class1847, final Entity class1848, final Vec3d class1849, final Vec3d class1850, final AxisAlignedBB class1851, final Predicate<Entity> predicate, final double n, final double n2) {
        double n3 = n;
        Entity class1852 = null;
        for (final Entity class1853 : class1847.method6737(class1848, class1851, predicate)) {
            final AxisAlignedBB method18496 = class1853.getBoundingBox().intersect(n2);
            final Optional<Vec3d> method18497 = method18496.rayTrace(class1849, class1850);
            if (!method18497.isPresent()) {
                if (!method19145(class1848.method1934(), method18496)) {
                    continue;
                }
                class1852 = class1853;
                break;
            }
            else {
                final double method18498 = class1849.squareDistanceTo(method18497.get());
                if (method18498 >= n3) {
                    continue;
                }
                if (!(class1853 instanceof LivingEntity)) {
                    continue;
                }
                class1852 = class1853;
                n3 = method18498;
            }
        }
        return (class1852 != null) ? new Class7007(class1852) : null;
    }
    
    public static Class7007 method19144(final Entity class399, final float n, final float n2, final Predicate<Entity> predicate, final double n3) {
        double n4 = n3 * n3;
        Entity class400 = null;
        Vec3d method16742 = null;
        final Vec3d class401 = new Vec3d(Class6430.field25541.field4684.posX, Class6430.field25541.field4684.posY + Class6430.field25541.field4684.method1892(), Class6430.field25541.field4684.posZ);
        final Vec3d method16743 = method19151(n2, n);
        final Vec3d method16744 = class401.add(method16743.x * n4, method16743.y * n4, method16743.z * n4);
        for (final Entity class402 : Class6430.field25541.field4683.method6737(Class6430.field25541.field4684, Class6430.field25541.field4684.getBoundingBox().expand(method16743.scale(n4)).grow(1.0, 1.0, 1.0), predicate)) {
            final Optional<Vec3d> method16745 = class402.getBoundingBox().rayTrace(class401, method16744);
            if (!method16745.isPresent()) {
                continue;
            }
            final double method16746 = class401.squareDistanceTo(method16745.get());
            if (method16746 >= n4) {
                continue;
            }
            if (class402 != class399 && class399 != null) {
                continue;
            }
            method16742 = method16745.get().subtract(class402.getPosX(), class402.getPosY(), class402.getPosZ());
            class400 = class402;
            n4 = method16746;
        }
        return (class400 != null && method16742 != null) ? new Class7007(class400, method16742) : null;
    }
    
    public static boolean method19145(final Vec3d class5487, final AxisAlignedBB class5488) {
        if (class5487.x >= class5488.minX) {
            if (class5487.x <= class5488.maxX) {
                if (class5487.y >= class5488.minY) {
                    if (class5487.y <= class5488.maxY) {
                        if (class5487.z >= class5488.minZ) {
                            if (class5487.z <= class5488.maxZ) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method19146() {
        if (!Class6430.field25546) {
            if (Class6430.field25541.method5285() == null) {
                if (Class6430.field25541.method5282() != null) {
                    if (Class6430.field25541.method5282().field41613.toLowerCase().contains("hypixel.net")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method19147() {
        if (Class6430.field25541.method5285() == null) {
            if (Class6430.field25541.method5282() != null) {
                if (Class6430.field25541.method5282().field41613.toLowerCase().contains("minemen.club")) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean method19148() {
        if (Class6430.field25541.method5285() == null) {
            if (Class6430.field25541.method5282() != null) {
                if (Class6430.field25541.method5282().field41613.toLowerCase().contains("play.cubecraft.net")) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean method19149() {
        if (Class6430.field25541.method5285() == null) {
            if (Class6430.field25541.method5282() != null) {
                if (Class6430.field25541.method5282().field41613.toLowerCase().contains("mineplex.com")) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean method19150() {
        return Class6430.field25541.method5282() == null || Class6430.field25541.method5282().field41613.toLowerCase().contains("localhost");
    }
    
    public static Vec3d method19151(final float n, final float n2) {
        final float n3 = n * 0.017453292f;
        final float n4 = -n2 * 0.017453292f;
        final float method35639 = MathHelper.cos(n4);
        final float method35640 = MathHelper.sin(n4);
        final float method35641 = MathHelper.cos(n3);
        return new Vec3d(method35640 * method35641, -MathHelper.sin(n3), method35639 * method35641);
    }
    
    public static UUID method19152(final String s) {
        return UUID.fromString(s.replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5"));
    }
    
    public static int method19153(final int n, final int n2) {
        final int n3 = Math.abs(n2 - n) % 360;
        return (n3 <= 180) ? n3 : (360 - n3);
    }
    
    public static double method19154(final double n) {
        Class6430.field25541.field4684.setMotion(n, Class6430.field25541.field4684.getMotion().y, Class6430.field25541.field4684.getMotion().z);
        return n;
    }
    
    public static double method19155(final double n) {
        Class6430.field25541.field4684.setMotion(Class6430.field25541.field4684.getMotion().x, n, Class6430.field25541.field4684.getMotion().z);
        return n;
    }
    
    public static double method19156(final double n) {
        Class6430.field25541.field4684.setMotion(Class6430.field25541.field4684.getMotion().x, Class6430.field25541.field4684.getMotion().y, n);
        return n;
    }
    
    public static boolean method19157(final double n, final double n2, final boolean b) {
        AxisAlignedBB class6221 = Class6430.field25541.field4684.boundingBox;
        if (b) {
            class6221 = class6221.grow(1.2350000143051147, 0.0, 1.2350000143051147);
        }
        return Class6430.field25541.field4683.method6980(Class6430.field25541.field4684, new AxisAlignedBB(class6221.minX + n, class6221.minY - 1.5, class6221.minZ + n2, class6221.maxX + n, class6221.maxY, class6221.maxZ + n2), Collections.EMPTY_SET).count() != 0L;
    }
    
    public static boolean method19158(final double n, final double n2) {
        return method19157(n, n2, false);
    }
    
    public static boolean method19159() {
        AxisAlignedBB class6221 = Class6430.field25541.field4684.boundingBox.offset(0.0, -1.0, 0.0);
        if (Class6430.field25541.field4684.method1920() != null) {
            class6221 = Class6430.field25541.field4684.method1920().boundingBox.expand(Math.abs(Class6430.field25541.field4684.method1920().prevPosX - Class6430.field25541.field4684.method1920().posX), 1.0, Math.abs(Class6430.field25541.field4684.method1920().prevPosZ - Class6430.field25541.field4684.method1920().posZ));
        }
        return Class6430.field25541.field4683.method6980(Class6430.field25541.field4684, class6221, Collections.EMPTY_SET).count() != 0L;
    }
    
    public static boolean method19160(final Entity class399, final float n) {
        return Class6430.field25541.field4683.method6980(Class6430.field25541.field4684, new AxisAlignedBB(class399.boundingBox.minX, class399.boundingBox.minY - n, class399.boundingBox.minZ, class399.boundingBox.maxX, class399.boundingBox.maxY, class399.boundingBox.maxZ), Collections.EMPTY_SET).count() != 0L;
    }
    
    public static List<BlockPos> method19161(final Entity class399) {
        final ArrayList list = new ArrayList();
        final int n = 1;
        for (float n2 = (float)(-n); n2 <= n; ++n2) {
            for (float n3 = (float)(-n); n3 <= n; ++n3) {
                list.add(new BlockPos(class399.posX + n2, class399.posY - 1.0, class399.posZ + n3));
            }
        }
        return list;
    }
    
    public static Class9212 method19162(final String username, final String password) {
        final YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)new YggdrasilAuthenticationService(Proxy.NO_PROXY, "").createUserAuthentication(Agent.MINECRAFT);
        yggdrasilUserAuthentication.setUsername(username);
        yggdrasilUserAuthentication.setPassword(password);
        try {
            yggdrasilUserAuthentication.logIn();
            return new Class9212(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang");
        }
        catch (final AuthenticationException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static void method19163() {
        Class6430.field25541.method5269().method17292(new Class4307(Class316.field1877));
        Class6430.field25541.method5269().method17292(new Class4307(Class316.field1878));
    }
    
    public static void method19164() {
        Class6430.field25541.method5269().method17292(new Class4399(Class2003.field11245, new BlockPos(0, 0, 0), Direction.DOWN));
    }
    
    public static void method19165(final Entity class399, final boolean b) {
        final boolean equals = Class9367.field40167.equals(Class7906.field32452);
        final Class5750 class400 = new Class5750(class399, true);
        Class9463.method35173().method35188().method21097(class400);
        if (!class400.method16962()) {
            if (equals) {
                if (b) {
                    Class6430.field25541.field4684.method2707(Class316.field1877);
                }
            }
            Class6430.field25541.method5269().method17292(new Class4381(class400.method17057()));
            if (Class8742.method30195(Class6257.method18590(11), Class6430.field25541.field4684.method2715(Class316.field1877)) > 0) {
                Class6430.field25541.field4640.method6476(class400.method17057(), Class8432.field34614);
            }
            boolean b2 = false;
            Label_0290: {
                if (Class6430.field25541.field4684.method2904(0.5f) > 0.9 || equals) {
                    if (Class6430.field25541.field4684.fallDistance > 0.0f) {
                        if (!Class6430.field25541.field4684.onGround) {
                            if (!Class6430.field25541.field4684.method2688()) {
                                if (!Class6430.field25541.field4684.method1706()) {
                                    if (!Class6430.field25541.field4684.method2653(Class9439.field40488)) {
                                        if (!Class6430.field25541.field4684.isPassenger()) {
                                            b2 = true;
                                            break Label_0290;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                b2 = false;
            }
            Label_0330: {
                if (!b2) {
                    if (!Class6430.field25541.field4684.onGround) {
                        break Label_0330;
                    }
                    if (!Class9463.method35173().method35189().method21551(Class3261.class).method9906()) {
                        break Label_0330;
                    }
                }
                Class6430.field25541.field4640.method6476(class400.method17057(), Class8432.field34603);
            }
            Class6430.field25541.field4684.method2905();
            if (!equals) {
                if (b) {
                    Class6430.field25541.field4684.method2707(Class316.field1877);
                }
            }
            class400.method17060();
            Class9463.method35173().method35188().method21097(class400);
        }
    }
    
    public static String method19166(final int n) {
        for (final Class283 class283 : Class283.values()) {
            if (class283.field1563 == n) {
                return class283.field1560;
            }
        }
        final String[] split = Class8341.method27796(n, 0).method26048().split("\\.");
        if (split.length == 0) {
            return "Unknown";
        }
        final String s = split[split.length - 1];
        if (s.length() != 0) {
            String str = "";
            if (n <= 4) {
                str = "Mouse ";
            }
            return str + s.substring(0, 1).toUpperCase() + s.substring(1);
        }
        return "Unknown";
    }
    
    public static boolean method19167(final float n, final float n2, final float n3, final FloatBuffer floatBuffer, final FloatBuffer floatBuffer2, final IntBuffer intBuffer, final FloatBuffer floatBuffer3) {
        final float[] field25543 = Class6430.field25543;
        final float[] field25544 = Class6430.field25544;
        field25543[0] = n;
        field25543[1] = n2;
        field25543[2] = n3;
        field25543[3] = 1.0f;
        method19168(floatBuffer, field25543, field25544);
        method19168(floatBuffer2, field25544, field25543);
        if (field25543[3] != 0.0) {
            field25543[3] = 1.0f / field25543[3] * 0.5f;
            field25543[0] = field25543[0] * field25543[3] + 0.5f;
            field25543[1] = field25543[1] * field25543[3] + 0.5f;
            field25543[2] = field25543[2] * field25543[3] + 0.5f;
            floatBuffer3.put(0, field25543[0] * intBuffer.get(intBuffer.position() + 2) + intBuffer.get(intBuffer.position() + 0));
            floatBuffer3.put(1, field25543[1] * intBuffer.get(intBuffer.position() + 3) + intBuffer.get(intBuffer.position() + 1));
            floatBuffer3.put(2, field25543[2]);
            return true;
        }
        return false;
    }
    
    private static void method19168(final FloatBuffer floatBuffer, final float[] array, final float[] array2) {
        for (int i = 0; i < 4; ++i) {
            array2[i] = array[0] * floatBuffer.get(floatBuffer.position() + 0 + i) + array[1] * floatBuffer.get(floatBuffer.position() + 4 + i) + array[2] * floatBuffer.get(floatBuffer.position() + 8 + i) + array[3] * floatBuffer.get(floatBuffer.position() + 12 + i);
        }
    }
    
    public static void method19169() {
        if (Class6430.field25541.method5303() instanceof PlayerEntity) {
            if (Class9463.method35173().method35193().method32144()) {
                if (Class6430.field25541.field4644.field9406 != null) {
                    Class6430.field25541.field4644.field9406.close();
                }
                Class6430.field25541.field4644.method5803(Class6430.field25545);
            }
        }
        method19171(20);
    }
    
    public static void method19170(final float n) {
        method19171(Math.round(n * 20.0f));
    }
    
    public static void method19171(final int n) {
        if (Class6430.field25541.field4644.field9406 != null) {
            Class6430.field25541.field4644.field9406.field10255.get(0).method7605().method7715("Radius").method7163((float)n);
            Class6430.field25541.field4644.field9406.field10255.get(1).method7605().method7715("Radius").method7163((float)n);
        }
    }
    
    public static void method19172() {
        if (Class6430.field25541.field4644.field9409 == Class1660.field9408) {
            Class6430.field25541.field4644.field9406 = null;
        }
        else {
            Class6430.field25541.field4644.method5803(Class1660.field9407[Class6430.field25541.field4644.field9409]);
        }
    }
    
    public static boolean method19173(String s) {
        s = ((s != null) ? s.toLowerCase() : "");
        return s.equals("yorik100".toLowerCase()) || s.equals("TheDeadlySam".toLowerCase()) || s.equals("Andro24".toLowerCase()) || s.equals("Sigma".toLowerCase()) || s.equals("SigmaTTT".toLowerCase()) || s.equals("Tomygames".toLowerCase()) || s.equals("LeakedPvP".toLowerCase()) || s.equals("Omikron".toLowerCase()) || s.equals("Haydal".toLowerCase()) || s.equals("TayZak".toLowerCase()) || s.equals("ParfumAuJasmin".toLowerCase()) || s.equals("Loyisa".toLowerCase()) || s.equals("gamerboy35787".toLowerCase()) || s.equals("MysticArceus".toLowerCase()) || s.equals("Casperhq".toLowerCase()) || s.equals("Flyinqq".toLowerCase()) || s.equals("cxbot".toLowerCase()) || s.equals("ImJoi".toLowerCase()) || s.equals("_CloudPlayer".toLowerCase()) || s.equals("Daawn".toLowerCase()) || s.equals("SubwayZ".toLowerCase());
    }
    
    public static Class2068 method19174(final Entity class399) {
        if (!(class399 instanceof LivingEntity)) {
            return Class2068.field11841;
        }
        if (!(class399 instanceof PlayerEntity)) {
            if (!(class399 instanceof Class759)) {
                if (!(class399 instanceof Class763)) {
                    if (!(class399 instanceof Class853)) {
                        if (!(class399 instanceof Class760)) {
                            return Class2068.field11840;
                        }
                    }
                }
            }
            return Class2068.field11838;
        }
        return Class2068.field11839;
    }
    
    public static String[] method19175(final String s, final int n, final Class7524 class7524) {
        final String[] split = s.split(" ");
        final HashMap hashMap = new HashMap();
        int i = 0;
        for (String substring : split) {
            String str = (hashMap.get(i) != null) ? hashMap.get(i) : "";
            boolean b = hashMap.get(i) == null;
            boolean b2 = class7524.method23505(str) + class7524.method23505(substring) <= n;
            boolean b3 = class7524.method23505(substring) >= n;
            if (!b2) {
                if (!b3) {
                    ++i;
                    str = ((hashMap.get(i) != null) ? hashMap.get(i) : "");
                    b = (hashMap.get(i) == null);
                    b2 = (class7524.method23505(str) + class7524.method23505(substring) <= n);
                    b3 = (class7524.method23505(substring) >= n);
                }
            }
            if (!b2) {
                if (b3) {
                    while (b3 && !b2) {
                        for (int k = 0; k <= substring.length(); ++k) {
                            final String substring2 = substring.substring(0, substring.length() - k);
                            if (class7524.method23505(substring2) <= n) {
                                ++i;
                                hashMap.put(i, substring2);
                                substring = substring.substring(substring.length() - k, substring.length());
                                break;
                            }
                        }
                        b2 = (class7524.method23505((hashMap.get(i) != null) ? hashMap.get(i) : "") + class7524.method23505(substring) <= n);
                        b3 = (class7524.method23505(substring) >= n);
                        final boolean b4 = hashMap.get(i) == null;
                    }
                    if (!b2) {
                        ++i;
                    }
                    hashMap.put(i, substring);
                }
            }
            else if (!b) {
                hashMap.put(i, str + " " + substring);
            }
            else {
                hashMap.put(i, substring);
            }
        }
        return (String[])hashMap.values().toArray(new String[hashMap.values().size()]);
    }
    
    public static void method19176(final Class9575 class9575) {
        if (Class6430.field25546 = class9575.field41613.toLowerCase().contains("hypixel.net")) {
            new Thread(() -> {
                try {
                    InetAddress.getByName("hypixel.net");
                    final InetAddress inetAddress;
                    new HttpGet("http://" + inetAddress.getHostAddress());
                    HttpClients.createDefault();
                    try {
                        final CloseableHttpClient closeableHttpClient;
                        final HttpUriRequest httpUriRequest;
                        closeableHttpClient.execute(httpUriRequest);
                        try {
                            final CloseableHttpResponse closeableHttpResponse;
                            if (closeableHttpResponse.getStatusLine().getStatusCode() == 403) {
                                closeableHttpResponse.getEntity();
                                final HttpEntity httpEntity;
                                if (httpEntity != null) {
                                    if (EntityUtils.toString(httpEntity).contains("1003")) {
                                        Class6430.field25546 = false;
                                    }
                                }
                            }
                        }
                        catch (final Throwable t) {
                            throw t;
                        }
                        finally {
                            final CloseableHttpResponse closeableHttpResponse;
                            if (closeableHttpResponse != null) {
                                final Throwable t2;
                                if (t2 != null) {
                                    try {
                                        closeableHttpResponse.close();
                                    }
                                    catch (final Throwable exception) {
                                        t2.addSuppressed(exception);
                                    }
                                }
                                else {
                                    closeableHttpResponse.close();
                                }
                            }
                        }
                    }
                    catch (final ClientProtocolException ex) {}
                    catch (final IOException ex2) {}
                }
                catch (final UnknownHostException ex3) {}
            }).start();
        }
    }
    
    public static double[] method19177() {
        return new double[] { 0.0, 0.0625, 0.125, 0.25, 0.3125, 0.375, 0.5, 0.625, 0.75, 0.8125, 0.875, 0.9375, 1.0, 1.0625, 1.125, 1.25, 1.3125, 1.375 };
    }
    
    public static boolean method19178(final Entity class399, final boolean b, final boolean b2, final boolean b3) {
        if (class399 == Class6430.field25541.field4684 || class399 == Class3276.field15771) {
            return false;
        }
        if (Class9463.method35173().method35190().method29878(class399)) {
            return false;
        }
        if (!(class399 instanceof LivingEntity)) {
            return false;
        }
        if (((LivingEntity)class399).method2664() == 0.0f) {
            return false;
        }
        if (!Class6430.field25541.field4684.method2646((LivingEntity)class399)) {
            return false;
        }
        if (class399 instanceof Class857) {
            return false;
        }
        if (!b && class399 instanceof PlayerEntity) {
            return false;
        }
        if (class399 instanceof PlayerEntity && Class9463.method35173().method35191().method31751(class399)) {
            return false;
        }
        if (!b3 && class399.method1823()) {
            return false;
        }
        if (!b2 && !(class399 instanceof PlayerEntity)) {
            return false;
        }
        if (Class6430.field25541.field4684.method1920() != null && Class6430.field25541.field4684.method1920().equals(class399)) {
            return false;
        }
        if (!class399.method1850()) {
            if (class399 instanceof PlayerEntity) {
                if (Class9011.method32262((PlayerEntity)class399)) {
                    if (Class9463.method35173().method35189().method21551(Class3203.class).method9906()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static void method19179(final boolean b) {
        final double field2395 = Class6430.field25541.field4684.posX;
        final double field2396 = Class6430.field25541.field4684.posY;
        final double field2397 = Class6430.field25541.field4684.posZ;
        for (int n = 49 + Class7482.method23140() * 17, i = 0; i < n; ++i) {
            final double n2 = b ? method19180() : 0.0;
            Class6430.field25541.method5269().method17292(new Class4354(field2395 + n2, field2396 + 0.06248 + method19180(), field2397 + n2, false));
            if (method19146()) {
                Class6430.field25541.method5269().method17292(new Class4354(field2395 + n2, field2396 + 0.05 + method19180(), field2397 + n2, false));
            }
            Class6430.field25541.method5269().method17292(new Class4354(field2395 + n2, field2396 + 1.0E-14 + method19180(), field2397 + n2, false));
        }
        Class6430.field25541.method5269().method17292(new Class4353(true));
    }
    
    public static double method19180() {
        return Math.random() * 1.0E-8;
    }
    
    static {
        field25541 = Class869.method5277();
        field25543 = new float[4];
        field25544 = new float[4];
        field25545 = new ResourceLocation("shaders/post/blur.json");
        Class6430.field25546 = false;
    }
}
