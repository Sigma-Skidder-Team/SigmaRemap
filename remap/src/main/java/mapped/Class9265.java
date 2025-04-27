// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executor;

import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectMap;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Class9265
{
    public static Properties method34175(final ResourceLocation class1932) {
        final String method7797 = class1932.method7797();
        final Class27 class1933 = new Class27();
        final String suffix = ".png";
        if (!method7797.endsWith(suffix)) {
            return class1933;
        }
        final String string = method7797.substring(0, method7797.length() - suffix.length()) + ".properties";
        try {
            final InputStream method7798 = Config.method28898(Config.method28896(), new ResourceLocation(class1932.method7798(), string));
            if (method7798 == null) {
                return class1933;
            }
            Config.method28852("Loading " + string);
            class1933.load(method7798);
        }
        catch (final FileNotFoundException ex) {}
        catch (final IOException ex2) {
            ex2.printStackTrace();
        }
        return class1933;
    }
    
    public static Char2ObjectMap<Float> method34176(final Properties properties) {
        final Char2ObjectOpenHashMap char2ObjectOpenHashMap = new Char2ObjectOpenHashMap();
        for (final String key : properties.keySet()) {
            final String prefix = "width.";
            if (!key.startsWith(prefix)) {
                continue;
            }
            final int method28933 = Config.method28933(key.substring(prefix.length()), -1);
            if (method28933 < 0) {
                continue;
            }
            final float method28934 = Config.method28934(properties.getProperty(key), -1.0f);
            if (method28934 < 0.0f) {
                continue;
            }
            char2ObjectOpenHashMap.put((char)method28933, new Float(method28934));
        }
        return (Char2ObjectMap<Float>)char2ObjectOpenHashMap;
    }
    
    public static float method34177(final Properties properties, final String s, final float n) {
        final String property = properties.getProperty(s);
        if (property == null) {
            return n;
        }
        final float method28934 = Config.method28934(property, Float.MIN_VALUE);
        if (method28934 != Float.MIN_VALUE) {
            return method28934;
        }
        Config.warn("Invalid value for " + s + ": " + property);
        return n;
    }
    
    public static boolean method34178(final Properties properties, final String s, final boolean b) {
        final String property = properties.getProperty(s);
        if (property == null) {
            return b;
        }
        final String trim = property.toLowerCase().trim();
        if (trim.equals("true") || trim.equals("on")) {
            return true;
        }
        if (!trim.equals("false") && !trim.equals("off")) {
            Config.warn("Invalid value for " + s + ": " + property);
            return b;
        }
        return false;
    }
    
    public static ResourceLocation method34179(final ResourceLocation class1932) {
        if (!Config.method28947()) {
            return class1932;
        }
        if (class1932 == null) {
            return class1932;
        }
        if (!Config.method28834()) {
            return class1932;
        }
        final String method7797 = class1932.method7797();
        final String prefix = "textures/";
        final String str = "optifine/";
        if (method7797.startsWith(prefix)) {
            final ResourceLocation class1933 = new ResourceLocation(class1932.method7798(), str + method7797.substring(prefix.length()));
            return Config.method28901(Config.method28896(), class1933) ? class1933 : class1932;
        }
        return class1932;
    }
    
    public static void method34180() {
        final Class7888 class7888 = new Class7888();
        final Executor method27841 = Util.method27841();
        final Minecraft method27842 = Minecraft.getInstance();
        method27842.method5323().method7378().method5785(class7888, Config.method28896(), Class5026.field21549, Class5026.field21549, method27841, method27842);
    }
}
