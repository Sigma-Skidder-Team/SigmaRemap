// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.UUID;

public class Class8956
{
    private static final String[] field37654;
    private static final String[] field37655;
    
    public static String method31774(final UUID uuid) {
        final Random method31776 = method31776(uuid);
        return method31775(method31776, Class8956.field37654) + method31775(method31776, Class8956.field37655);
    }
    
    private static String method31775(final Random random, final String[] array) {
        return array[random.nextInt(array.length)];
    }
    
    private static Random method31776(final UUID uuid) {
        return new Random(uuid.hashCode() >> 2);
    }
    
    static {
        field37654 = new String[] { "Slim", "Far", "River", "Silly", "Fat", "Thin", "Fish", "Bat", "Dark", "Oak", "Sly", "Bush", "Zen", "Bark", "Cry", "Slack", "Soup", "Grim", "Hook" };
        field37655 = new String[] { "Fox", "Tail", "Jaw", "Whisper", "Twig", "Root", "Finder", "Nose", "Brow", "Blade", "Fry", "Seek", "Tooth", "Foot", "Leaf", "Stone", "Fall", "Face", "Tongue" };
    }
}
