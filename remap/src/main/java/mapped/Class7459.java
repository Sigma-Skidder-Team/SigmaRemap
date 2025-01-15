// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.FileOutputStream;
import java.io.IOException;
import org.newdawn.slick.SlickException;
import java.io.OutputStream;

public class Class7459
{
    private static final boolean field28768 = false;
    public static String field28769;
    public static String field28770;
    public static String field28771;
    
    public static String[] method22972() {
        return Class8262.method27441();
    }
    
    public static void method22973(final Class7764 class7764, final String s, final OutputStream outputStream) throws SlickException {
        method22974(class7764, s, outputStream, false);
    }
    
    public static void method22974(final Class7764 class7764, final String str, final OutputStream outputStream, final boolean b) throws SlickException {
        try {
            Class8262.method27442(str).method29299(class7764, str, outputStream, b);
        }
        catch (final IOException ex) {
            throw new Class2324("Unable to write out the image in format: " + str, ex);
        }
    }
    
    public static void method22975(final Class7764 class7764, final String s) throws SlickException {
        method22976(class7764, s, false);
    }
    
    public static void method22976(final Class7764 class7764, final String str, final boolean b) throws SlickException {
        try {
            final int lastIndex = str.lastIndexOf(46);
            if (lastIndex < 0) {
                throw new Class2324("Unable to determine format from: " + str);
            }
            method22974(class7764, str.substring(lastIndex + 1), new FileOutputStream(str), b);
        }
        catch (final IOException ex) {
            throw new Class2324("Unable to write to the destination: " + str, ex);
        }
    }
    
    public static void method22977(final Class7764 class7764, final String s, final String s2) throws SlickException {
        method22978(class7764, s, s2, false);
    }
    
    public static void method22978(final Class7764 class7764, final String s, final String s2, final boolean b) throws SlickException {
        try {
            method22974(class7764, s, new FileOutputStream(s2), b);
        }
        catch (final IOException ex) {
            throw new Class2324("Unable to write to the destination: " + s2, ex);
        }
    }
    
    static {
        Class7459.field28769 = "tga";
        Class7459.field28770 = "png";
        Class7459.field28771 = "jpg";
    }
}
