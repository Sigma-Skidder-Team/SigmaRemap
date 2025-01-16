// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Arrays;
import java.util.ArrayList;

public class Class8287
{
    private static Class8368[] field34074;
    private static int field34075;
    private static int field34076;
    
    public static void method27534() {
        Class8287.field34074 = null;
    }
    
    public static void method27535() {
        Class8287.field34074 = null;
        Class8287.field34075 = 0;
        Class8287.field34074 = method27537(Config.method28903());
        method27536();
    }
    
    public static void method27536() {
        if (Class8287.field34074 != null && Config.method28939()) {
            int field34075 = 0;
            for (int i = 0; i < Class8287.field34074.length; ++i) {
                final Class8368 class8368 = Class8287.field34074[i];
                class8368.method27905();
                if (class8368.method27911()) {
                    ++field34075;
                }
            }
            final int method5768 = Config.method28894().field4636.method5768();
            if (method5768 != Class8287.field34076) {
                Class8287.field34075 = field34075;
                Class8287.field34076 = method5768;
            }
            if (Class7663.method24283()) {
                Class7663.method24291();
            }
        }
        else {
            Class8287.field34075 = 0;
        }
    }
    
    private static Class8368[] method27537(final Class1727[] array) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; ++i) {
            final Class8368[] method27538 = method27538(array[i]);
            if (method27538 != null) {
                list.addAll(Arrays.asList(method27538));
            }
        }
        return (Class8368[])list.toArray(new Class8368[list.size()]);
    }
    
    private static Class8368[] method27538(final Class1727 class1727) {
        final String[] method32777 = Class9084.method32777(class1727, "optifine/anim/", ".properties", null);
        if (method32777.length <= 0) {
            return null;
        }
        final ArrayList list = new ArrayList();
        for (int i = 0; i < method32777.length; ++i) {
            final String s = method32777[i];
            Config.method28847("Texture animation: " + s);
            try {
                final ResourceLocation class1728 = new ResourceLocation(s);
                final InputStream method32778 = class1727.method6097(Class346.field2137, class1728);
                final Class27 class1729 = new Class27();
                class1729.load(method32778);
                final Class8368 method32779 = method27539(class1729, class1728);
                if (method32779 != null) {
                    if (!Config.method28902(class1727, new ResourceLocation(method32779.method27909()))) {
                        Config.method28847("Skipped: " + s + ", target texture not loaded from same resource pack");
                    }
                    else {
                        list.add(method32779);
                    }
                }
            }
            catch (final FileNotFoundException ex) {
                Config.warn("File not found: " + ex.getMessage());
            }
            catch (final IOException ex2) {
                ex2.printStackTrace();
            }
        }
        return (Class8368[])list.toArray(new Class8368[list.size()]);
    }
    
    private static Class8368 method27539(final Properties properties, final ResourceLocation class1932) {
        final String property = properties.getProperty("from");
        final String property2 = properties.getProperty("to");
        final int method28933 = Config.method28933(properties.getProperty("x"), -1);
        final int method28934 = Config.method28933(properties.getProperty("y"), -1);
        final int method28935 = Config.method28933(properties.getProperty("w"), -1);
        final int method28936 = Config.method28933(properties.getProperty("h"), -1);
        if (property != null && property2 != null) {
            if (method28933 >= 0 && method28934 >= 0 && method28935 >= 0 && method28936 >= 0) {
                final String trim = property.trim();
                final String trim2 = property2.trim();
                final String method28937 = Class8969.method31833(class1932.method7797());
                final String method28938 = Class8969.method31832(trim, method28937);
                final String method28939 = Class8969.method31832(trim2, method28937);
                final byte[] method28940 = method27540(method28938, method28935);
                if (method28940 == null) {
                    Config.warn("TextureAnimation: Source texture not found: " + method28939);
                    return null;
                }
                final int n = method28940.length / 4;
                if (n != n / (method28935 * method28936) * method28935 * method28936) {
                    Config.warn("TextureAnimation: Source texture has invalid number of frames: " + method28938 + ", frames: " + n / (float)(method28935 * method28936));
                    return null;
                }
                final ResourceLocation class1933 = new ResourceLocation(method28939);
                try {
                    final InputStream method28941 = Config.method28897(class1933);
                    if (method28941 == null) {
                        Config.warn("TextureAnimation: Target texture not found: " + method28939);
                        return null;
                    }
                    final BufferedImage method28942 = method27542(method28941);
                    if (method28933 + method28935 <= method28942.getWidth() && method28934 + method28936 <= method28942.getHeight()) {
                        return new Class8368(method28938, method28940, method28939, class1933, method28933, method28934, method28935, method28936, properties);
                    }
                    Config.warn("TextureAnimation: Animation coordinates are outside the target texture: " + method28939);
                    return null;
                }
                catch (final IOException ex) {
                    Config.warn("TextureAnimation: Target texture not found: " + method28939);
                    return null;
                }
            }
            Config.warn("TextureAnimation: Invalid coordinates");
            return null;
        }
        Config.warn("TextureAnimation: Source or target texture not specified");
        return null;
    }
    
    private static byte[] method27540(final String str, final int n) {
        byte[] array = method27541(str, n);
        if (array == null) {
            array = method27541("/anim" + str, n);
        }
        return array;
    }
    
    private static byte[] method27541(final String s, final int n) {
        Config.method28962();
        try {
            final InputStream method28897 = Config.method28897(new ResourceLocation(s));
            if (method28897 == null) {
                return null;
            }
            BufferedImage bufferedImage = method27542(method28897);
            method28897.close();
            if (bufferedImage == null) {
                return null;
            }
            if (n > 0 && bufferedImage.getWidth() != n) {
                bufferedImage = method27543(bufferedImage, n, (int)(n * (double)(bufferedImage.getHeight() / bufferedImage.getWidth())));
            }
            final int width = bufferedImage.getWidth();
            final int height = bufferedImage.getHeight();
            final int[] rgbArray = new int[width * height];
            final byte[] array = new byte[width * height * 4];
            bufferedImage.getRGB(0, 0, width, height, rgbArray, 0, width);
            for (int i = 0; i < rgbArray.length; ++i) {
                final int n2 = rgbArray[i] >> 24 & 0xFF;
                final int n3 = rgbArray[i] >> 16 & 0xFF;
                final int n4 = rgbArray[i] >> 8 & 0xFF;
                final int n5 = rgbArray[i] & 0xFF;
                array[i * 4 + 0] = (byte)n3;
                array[i * 4 + 1] = (byte)n4;
                array[i * 4 + 2] = (byte)n5;
                array[i * 4 + 3] = (byte)n2;
            }
            return array;
        }
        catch (final FileNotFoundException ex) {
            return null;
        }
        catch (final Exception ex2) {
            ex2.printStackTrace();
            return null;
        }
    }
    
    private static BufferedImage method27542(final InputStream input) throws IOException {
        final BufferedImage read = ImageIO.read(input);
        input.close();
        return read;
    }
    
    private static BufferedImage method27543(final BufferedImage bufferedImage, final int width, final int height) {
        final BufferedImage bufferedImage2 = new BufferedImage(width, height, 2);
        final Graphics2D graphics = bufferedImage2.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics.drawImage(bufferedImage, 0, 0, width, height, null);
        return bufferedImage2;
    }
    
    public static int method27544() {
        return (Class8287.field34074 != null) ? Class8287.field34074.length : 0;
    }
    
    public static int method27545() {
        return Class8287.field34075;
    }
    
    static {
        Class8287.field34074 = null;
        Class8287.field34075 = 0;
        Class8287.field34076 = 0;
    }
}
