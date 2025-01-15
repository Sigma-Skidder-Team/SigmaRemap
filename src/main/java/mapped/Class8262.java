// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.imageio.ImageIO;
import org.newdawn.slick.SlickException;
import java.util.HashMap;

public class Class8262
{
    private static HashMap field33930;
    
    public static void method27440(final String key, final Class8633 value) {
        Class8262.field33930.put(key, value);
    }
    
    public static String[] method27441() {
        return (String[])Class8262.field33930.keySet().toArray(new String[0]);
    }
    
    public static Class8633 method27442(final String s) throws SlickException {
        final Class8633 class8633 = Class8262.field33930.get(s);
        if (class8633 != null) {
            return class8633;
        }
        final Class8633 class8634 = Class8262.field33930.get(s.toLowerCase());
        if (class8634 != null) {
            return class8634;
        }
        final Class8633 class8635 = Class8262.field33930.get(s.toUpperCase());
        if (class8635 == null) {
            throw new Class2324("No image writer available for: " + s);
        }
        return class8635;
    }
    
    static {
        Class8262.field33930 = new HashMap();
        final String[] writerFormatNames = ImageIO.getWriterFormatNames();
        final Class8632 class8632 = new Class8632();
        for (int i = 0; i < writerFormatNames.length; ++i) {
            method27440(writerFormatNames[i], class8632);
        }
        method27440("tga", new Class8634());
    }
}
