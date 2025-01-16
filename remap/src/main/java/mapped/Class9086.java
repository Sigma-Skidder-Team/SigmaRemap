// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class Class9086
{
    private static final String field38477 = ".mp3";
    private static List<String> field38478;
    public static HashMap<String, Class2416> field38479;
    
    public void method32830(final String str) {
        if (Class9086.field38478.contains(str)) {
            final InputStream method25394 = Class7853.method25394("com/mentalfrostbyte/gui/resources/audio/" + str + ".mp3");
            if (Class9086.field38479.containsKey(str) && Class9086.field38479.get(str).method9676()) {
                Class9086.field38479.get(str).method9674(method25394);
                Class9086.field38479.get(str).method9677();
            }
            else {
                if (Class9086.field38479.containsKey(str)) {
                    Class9086.field38479.get(str).method9695();
                }
                final Class2416 value = new Class2416(method25394);
                Class9086.field38479.put(str, value);
                value.method9677();
            }
            return;
        }
        Client.method35173().method35187().method20241("Invalid audio file attempted to be played: " + str);
    }
    
    public void method32831() {
    }
    
    static {
        Class9086.field38478 = new ArrayList<String>(Arrays.asList("activate", "deactivate", "click", "error", "pop", "connect", "switch", "clicksound"));
        Class9086.field38479 = new HashMap<String, Class2416>();
    }
}
