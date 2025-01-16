// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import java.io.File;
import java.util.Iterator;
import java.io.IOException;
import javax.imageio.ImageReader;
import javax.imageio.ImageIO;
import java.awt.Dimension;
import java.io.InputStream;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;

public class Class8969
{
    private static final String field37683 = "grass_block_top";
    private static final String field37684 = "grass_block_side";
    private static final String field37685 = "grass_block_side_overlay";
    private static final String field37686 = "snow";
    private static final String field37687 = "grass_block_snow";
    private static final String field37688 = "mycelium_side";
    private static final String field37689 = "mycelium_top";
    private static final String field37690 = "water_still";
    private static final String field37691 = "water_flow";
    private static final String field37692 = "lava_still";
    private static final String field37693 = "lava_flow";
    private static final String field37694 = "fire_0";
    private static final String field37695 = "fire_1";
    private static final String field37696 = "nether_portal";
    private static final String field37697 = "glass";
    private static final String field37698 = "glass_pane_top";
    public static TextureAtlasSprite field37699;
    public static TextureAtlasSprite field37700;
    public static TextureAtlasSprite field37701;
    public static TextureAtlasSprite field37702;
    public static TextureAtlasSprite field37703;
    public static TextureAtlasSprite field37704;
    public static TextureAtlasSprite field37705;
    public static TextureAtlasSprite field37706;
    public static TextureAtlasSprite field37707;
    public static TextureAtlasSprite field37708;
    public static TextureAtlasSprite field37709;
    public static TextureAtlasSprite field37710;
    public static TextureAtlasSprite field37711;
    public static TextureAtlasSprite field37712;
    public static TextureAtlasSprite field37713;
    public static TextureAtlasSprite field37714;
    public static final String field37715 = "minecraft:block/";
    public static final String field37716 = "minecraft:item/";
    private static IntBuffer field37717;
    private static int field37718;
    
    public static void method31817() {
        final Class1774 method31825 = method31825();
        if (method31825 != null) {
            final String s = "minecraft:block/";
            Class8969.field37699 = method31818(method31825, s + "grass_block_top");
            Class8969.field37700 = method31818(method31825, s + "grass_block_side");
            Class8969.field37701 = method31818(method31825, s + "grass_block_side_overlay");
            Class8969.field37702 = method31818(method31825, s + "snow");
            Class8969.field37703 = method31818(method31825, s + "grass_block_snow");
            Class8969.field37704 = method31818(method31825, s + "mycelium_side");
            Class8969.field37705 = method31818(method31825, s + "mycelium_top");
            Class8969.field37706 = method31818(method31825, s + "water_still");
            Class8969.field37707 = method31818(method31825, s + "water_flow");
            Class8969.field37708 = method31818(method31825, s + "lava_still");
            Class8969.field37709 = method31818(method31825, s + "lava_flow");
            Class8969.field37710 = method31818(method31825, s + "fire_0");
            Class8969.field37711 = method31818(method31825, s + "fire_1");
            Class8969.field37712 = method31818(method31825, s + "nether_portal");
            Class8969.field37713 = method31818(method31825, s + "glass");
            Class8969.field37714 = method31818(method31825, s + "glass_pane_top");
        }
    }
    
    public static TextureAtlasSprite method31818(final Class1774 class1774, final String str) {
        final TextureAtlasSprite method6346 = class1774.method6346(str);
        if (method6346 == null || method6346 instanceof Class1913) {
            Config.warn("Sprite not found: " + str);
        }
        return method6346;
    }
    
    public static BufferedImage method31819(final String s, final BufferedImage bufferedImage) {
        if (s.startsWith("/mob/zombie") || s.startsWith("/mob/pigzombie")) {
            final int width = bufferedImage.getWidth();
            final int height = bufferedImage.getHeight();
            if (width == height * 2) {
                final BufferedImage bufferedImage2 = new BufferedImage(width, height * 2, 2);
                final Graphics2D graphics = bufferedImage2.createGraphics();
                graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                graphics.drawImage(bufferedImage, 0, 0, width, height, null);
                return bufferedImage2;
            }
        }
        return bufferedImage;
    }
    
    public static int method31820(final int n) {
        int i;
        for (i = 1; i < n; i *= 2) {}
        return i;
    }
    
    public static int method31821(final int n) {
        int i;
        int n2;
        for (i = 1, n2 = 0; i < n; i *= 2, ++n2) {}
        return n2;
    }
    
    public static int method31822(final int n) {
        int n2 = 1;
        for (int i = 0; i < n; ++i) {
            n2 *= 2;
        }
        return n2;
    }
    
    public static Class1666 method31823(final ResourceLocation class1932) {
        final Class1666 method5853 = Config.method28895().method5853(class1932);
        if (method5853 != null) {
            return method5853;
        }
        if (Config.method28900(class1932)) {
            final Class1767 class1933 = new Class1767(class1932);
            Config.method28895().method5851(class1932, class1933);
            return class1933;
        }
        return null;
    }
    
    public static void method31824(final Class6582 class6582) {
        if (method31825() != null) {
            Config.method28847("*** Reloading custom textures ***");
            Class9132.method33152();
            Class8287.method27534();
            method31817();
            Class7657.method24258();
            Class6110.method18255();
            Class8979.method31922();
            Class8287.method27535();
            Class8763.method30319();
            Class9132.method33153();
            Class9066.method32654();
            Class9404.method34950();
            Class8906.method31381();
            Class9216.method33895();
            Class4647.method13873();
            Config.method28859();
            Class7464.method22997();
            Class9243.method34079();
            Class7890.method25545();
            Class1814.method6577();
            Class9203.method33676();
            Class8929.method31487();
            Config.method28895().method5857();
            Config.method28847("Disable Forge light pipeline");
            Class7667.method24313(false);
        }
    }
    
    public static Class1774 method31825() {
        return Config.method29001();
    }
    
    public static void method31826() {
        final Class6582 method28896 = Config.method28896();
        if (method28896 instanceof Class6580) {
            final Class6580 class6580 = (Class6580)method28896;
            class6580.method19930(new Class1778());
            class6580.method19930(new Class1797());
        }
    }
    
    public static void method31827() {
        Config.method28895().method5851(new ResourceLocation("optifine/tickable_textures"), new Class1775());
    }
    
    public static void method31828(final Class7637 class7637) {
        Class9404.method34943();
        Class9404.method34949(class7637);
    }
    
    public static void method31829(final Class1774 class1774) {
        if (class1774.method6340().equals(Class1774.field9853)) {
            Class7970.method25871(class1774);
            Class9404.method34947(class1774);
            Class6110.method18254(class1774);
        }
    }
    
    public static void method31830(final Class1774 class1774) {
        if (class1774.method6340().equals(Class1774.field9853)) {
            Class7970.method25873(class1774);
            Class9404.method34948(class1774);
            Class6110.method18257(class1774);
        }
    }
    
    public static ResourceLocation method31831(ResourceLocation class1932, final String s) {
        if (class1932.method7798().equals("minecraft")) {
            final String method7797 = class1932.method7797();
            final String method7798 = method31832(method7797, s);
            if (method7798 != method7797) {
                class1932 = new ResourceLocation(class1932.method7798(), method7798);
            }
            return class1932;
        }
        return class1932;
    }
    
    public static String method31832(String s, String string) {
        final String prefix = "assets/minecraft/";
        if (s.startsWith(prefix)) {
            s = s.substring(prefix.length());
            return s;
        }
        if (s.startsWith("./")) {
            s = s.substring(2);
            if (!string.endsWith("/")) {
                string += "/";
            }
            s = string + s;
            return s;
        }
        if (s.startsWith("/~")) {
            s = s.substring(1);
        }
        final String s2 = "optifine/";
        if (s.startsWith("~/")) {
            s = s.substring(2);
            s = s2 + s;
            return s;
        }
        if (!s.startsWith("/")) {
            return s;
        }
        s = s2 + s.substring(1);
        return s;
    }
    
    public static String method31833(final String s) {
        final int lastIndex = s.lastIndexOf(47);
        return (lastIndex >= 0) ? s.substring(0, lastIndex) : "";
    }
    
    public static void method31834() {
        if (GL.getCapabilities().GL_EXT_texture_filter_anisotropic) {
            GL11.glTexParameterf(3553, 34046, Math.min((float) Config.method28923(), GL11.glGetFloat(34047)));
        }
    }
    
    public static void method31835(final int n) {
        Class8933.method31617(n);
    }
    
    public static boolean method31836(final int n) {
        return MathHelper.smallestEncompassingPowerOfTwo(n) == n;
    }
    
    public static Class1846 method31837(final Class1846 class1846, final int n) {
        return method31839(method31840(method31838(class1846), n));
    }
    
    public static BufferedImage method31838(final Class1846 class1846) {
        final int method6644 = class1846.method6644();
        final int method6645 = class1846.method6645();
        final int[] array = new int[method6644 * method6645];
        class1846.method6674().get(array);
        final BufferedImage bufferedImage = new BufferedImage(method6644, method6645, 2);
        bufferedImage.setRGB(0, 0, method6644, method6645, array, 0, method6644);
        return bufferedImage;
    }
    
    private static Class1846 method31839(final BufferedImage bufferedImage) {
        final int width = bufferedImage.getWidth();
        final int height = bufferedImage.getHeight();
        final int[] array = new int[width * height];
        bufferedImage.getRGB(0, 0, width, height, array, 0, width);
        final Class1846 class1846 = new Class1846(width, height, false);
        class1846.method6674().put(array);
        return class1846;
    }
    
    public static BufferedImage method31840(final BufferedImage bufferedImage, final int width) {
        final int width2 = bufferedImage.getWidth();
        final int height = bufferedImage.getHeight() * width / width2;
        final BufferedImage bufferedImage2 = new BufferedImage(width, height, 2);
        final Graphics2D graphics = bufferedImage2.createGraphics();
        Object o = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        if (width < width2 || width % width2 != 0) {
            o = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, o);
        graphics.drawImage(bufferedImage, 0, 0, width, height, null);
        return bufferedImage2;
    }
    
    public static int method31841(final int n, final int n2) {
        if (n != n2) {
            int i;
            for (i = n / n2 * n2; i < n; i += n2) {}
            return i;
        }
        return n;
    }
    
    public static int method31842(final int n, final int n2) {
        if (n < n2) {
            int i;
            for (i = n2 / n * n; i < n2; i += n) {}
            return i;
        }
        return n;
    }
    
    public static Dimension method31843(final InputStream input, final String fileSuffix) {
        final Iterator<ImageReader> imageReadersBySuffix = ImageIO.getImageReadersBySuffix(fileSuffix);
        while (imageReadersBySuffix.hasNext()) {
            final ImageReader imageReader = imageReadersBySuffix.next();
            Dimension dimension = null;
            try {
                imageReader.setInput(ImageIO.createImageInputStream(input));
                dimension = new Dimension(imageReader.getWidth(imageReader.getMinIndex()), imageReader.getHeight(imageReader.getMinIndex()));
            }
            catch (final IOException ex) {}
            finally {
                imageReader.dispose();
            }
            return dimension;
        }
        return null;
    }
    
    public static void method31844(final TextureAtlasSprite class1912) {
        final Class1846[] method7526 = class1912.method7526();
        for (int i = 0; i < method7526.length; ++i) {
            final Class1846 obj = method7526[i];
            if (obj != null) {
                Config.method28847("" + i + ": " + obj.method6644() * obj.method6645());
            }
            else {
                Config.method28847("" + i + ": " + obj);
            }
        }
    }
    
    public static void method31845(final String str, final int n, final int n2, final int n3, final int n4) {
        method31835(n);
        GL11.glPixelStorei(3333, 1);
        GL11.glPixelStorei(3317, 1);
        final File parentFile = new File(str).getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        for (int i = 0; i < 16; ++i) {
            new File(str.endsWith(".png") ? str.replace(".png", "_" + i + ".png") : (str + "_" + i + ".png")).delete();
        }
        for (int j = 0; j <= n2; ++j) {
            final File obj = new File(str + "_" + j + ".png");
            final int n5 = n3 >> j;
            final int n6 = n4 >> j;
            final int n7 = n5 * n6;
            final IntBuffer intBuffer = BufferUtils.createIntBuffer(n7);
            final int[] array = new int[n7];
            GL11.glGetTexImage(3553, j, 32993, 33639, intBuffer);
            intBuffer.get(array);
            final BufferedImage im = new BufferedImage(n5, n6, 2);
            im.setRGB(0, 0, n5, n6, array, 0, n5);
            try {
                ImageIO.write(im, "png", obj);
                Config.method28847("Exported: " + obj);
            }
            catch (final Exception ex) {
                Config.warn("Error writing: " + obj);
                Config.warn("" + ex.getClass().getName() + ": " + ex.getMessage());
            }
        }
    }
    
    public static int method31846() {
        if (Class8969.field37718 < 0) {
            Class8969.field37718 = method31847();
        }
        return Class8969.field37718;
    }
    
    private static int method31847() {
        for (int i = 65536; i > 0; i >>= 1) {
            Class8933.method31618(32868, 0, 6408, i, i, 0, 6408, 5121, null);
            GL11.glGetError();
            if (Class8933.method31614(32868, 0, 4096) != 0) {
                return i;
            }
        }
        return 0;
    }
    
    public static BufferedImage method31848(final InputStream input) throws IOException {
        if (input == null) {
            return null;
        }
        BufferedImage read;
        try {
            read = ImageIO.read(input);
        }
        finally {
            IOUtils.closeQuietly(input);
        }
        return read;
    }
    
    public static int method31849(final int n) {
        return (n >> 24 & 0xFF) << 24 | (n >> 0 & 0xFF) << 16 | (n >> 8 & 0xFF) << 8 | (n >> 16 & 0xFF);
    }
    
    public static void method31850() {
        Class8933.method31659(3314, 0);
        Class8933.method31659(3316, 0);
        Class8933.method31659(3315, 0);
        Class8933.method31659(3317, 4);
    }
    
    static {
        Class8969.field37717 = Config.method29016(256);
        Class8969.field37718 = -1;
    }
}
