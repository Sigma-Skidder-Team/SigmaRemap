// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.io.InputStream;
import java.io.IOException;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

public class Class8837
{
    private static final Logger field37140;
    private static final Pattern field37141;
    private static final Class8837 field37142;
    private final Map<String, String> field37143;
    private long field37144;
    
    public Class8837() {
        this.field37143 = Maps.newHashMap();
        try (final InputStream resourceAsStream = Class8837.class.getResourceAsStream("/assets/minecraft/lang/en_us.json")) {
            for (final Map.Entry<K, JsonElement> entry : Class9583.method35913((JsonElement)new Gson().fromJson((Reader)new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8), (Class)JsonElement.class), "strings").entrySet()) {
                this.field37143.put((String)entry.getKey(), Class8837.field37141.matcher(Class9583.method35894(entry.getValue(), (String)entry.getKey())).replaceAll("%$1s"));
            }
            this.field37144 = Util.method27837();
        }
        catch (final JsonParseException | IOException ex) {
            Class8837.field37140.error("Couldn't read strings from /assets/minecraft/lang/en_us.json", (Throwable)ex);
        }
    }
    
    public static Class8837 method30858() {
        return Class8837.field37142;
    }
    
    public static synchronized void method30859(final Map<String, String> map) {
        Class8837.field37142.field37143.clear();
        Class8837.field37142.field37143.putAll(map);
        Class8837.field37142.field37144 = Util.method27837();
    }
    
    public synchronized String method30860(final String s) {
        return this.method30861(s);
    }
    
    private String method30861(final String s) {
        final String s2 = this.field37143.get(s);
        return (s2 != null) ? s2 : s;
    }
    
    public synchronized boolean method30862(final String s) {
        return this.field37143.containsKey(s);
    }
    
    public long method30863() {
        return this.field37144;
    }
    
    static {
        field37140 = LogManager.getLogger();
        field37141 = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
        field37142 = new Class8837();
    }
}
