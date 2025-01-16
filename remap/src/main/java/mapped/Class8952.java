// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import org.apache.commons.io.IOUtils;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import org.apache.commons.codec.binary.Base64;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import org.apache.logging.log4j.Logger;
import java.util.Map;

public class Class8952
{
    private static final Map<String, Class8281> field37645;
    private static final Map<String, Boolean> field37646;
    private static final Map<String, String> field37647;
    private static final Logger field37648;
    
    public static void method31758(final String s, final String s2) {
        if (s2 != null) {
            Class8726.method30044(method31762(s, s2));
        }
        else {
            RealmsScreen.method15419("textures/gui/presets/isles.png");
        }
    }
    
    public static void method31759(final String s, final Runnable runnable) {
        Class8726.method29996();
        try {
            method31761(s);
            runnable.run();
        }
        finally {
            Class8726.method29997();
        }
    }
    
    private static void method31760(final UUID uuid) {
        RealmsScreen.method15419(((uuid.hashCode() & 0x1) != 0x1) ? "minecraft:textures/entity/steve.png" : "minecraft:textures/entity/alex.png");
    }
    
    private static void method31761(final String s) {
        final UUID fromString = UUIDTypeAdapter.fromString(s);
        if (!Class8952.field37645.containsKey(s)) {
            if (!Class8952.field37646.containsKey(s)) {
                Class8952.field37646.put(s, false);
                method31760(fromString);
                final Class911 class911 = new Class911("Realms Texture Downloader", s);
                class911.setDaemon(true);
                class911.start();
            }
            else if (Class8952.field37646.get(s)) {
                if (!Class8952.field37647.containsKey(s)) {
                    method31760(fromString);
                }
                else {
                    Class8726.method30044(method31762(s, Class8952.field37647.get(s)));
                }
            }
            else {
                method31760(fromString);
            }
        }
        else {
            Class8726.method30044(Class8952.field37645.get(s).field34068);
        }
    }
    
    private static int method31762(final String s, final String anObject) {
        int n;
        if (Class8952.field37645.containsKey(s)) {
            final Class8281 class8281 = Class8952.field37645.get(s);
            if (class8281.field34067.equals(anObject)) {
                return class8281.field34068;
            }
            Class8726.method30043(class8281.field34068);
            n = class8281.field34068;
        }
        else {
            n = Class8933.method31615();
        }
        IntBuffer intBuffer = null;
        int width = 0;
        int height = 0;
        try {
            final ByteArrayInputStream input = new ByteArrayInputStream(new Base64().decode(anObject));
            BufferedImage read;
            try {
                read = ImageIO.read(input);
            }
            finally {
                IOUtils.closeQuietly((InputStream)input);
            }
            width = read.getWidth();
            height = read.getHeight();
            final int[] array = new int[width * height];
            read.getRGB(0, 0, width, height, array, 0, width);
            intBuffer = ByteBuffer.allocateDirect(4 * width * height).order(ByteOrder.nativeOrder()).asIntBuffer();
            intBuffer.put(array);
            intBuffer.flip();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        Class8726.method30039(33984);
        Class8726.method30044(n);
        Class8995.method32110(intBuffer, width, height);
        Class8952.field37645.put(s, new Class8281(anObject, n));
        return n;
    }
    
    static {
        field37645 = Maps.newHashMap();
        field37646 = Maps.newHashMap();
        field37647 = Maps.newHashMap();
        field37648 = LogManager.getLogger();
    }
}
