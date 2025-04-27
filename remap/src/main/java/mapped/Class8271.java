// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.IllegalFormatException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.gson.JsonElement;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.util.List;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;
import com.google.gson.Gson;

public class Class8271
{
    private static final Gson field33961;
    private static final Logger field33962;
    private static final Pattern field33963;
    public final Map<String, String> field33964;
    
    public Class8271() {
        this.field33964 = Maps.newHashMap();
    }
    
    public synchronized void method27492(final Class6582 class6582, final List<String> list) {
        this.field33964.clear();
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String format = String.format("lang/%s.json", iterator.next());
            for (final String s : class6582.method19932()) {
                try {
                    this.method27493(class6582.method19935(new ResourceLocation(s, format)));
                }
                catch (final FileNotFoundException ex) {}
                catch (final Exception ex2) {
                    Class8271.field33962.warn("Skipped language file: {}:{} ({})", s, format, ex2.toString());
                }
            }
        }
    }
    
    private void method27493(final List<Class1671> list) {
        final Iterator<Class1671> iterator = list.iterator();
        while (iterator.hasNext()) {
            final InputStream method5887 = iterator.next().method5887();
            try {
                this.method27494(method5887);
            }
            finally {
                IOUtils.closeQuietly(method5887);
            }
        }
    }
    
    private void method27494(final InputStream in) {
        for (final Map.Entry<K, JsonElement> entry : Class9583.method35913((JsonElement)Class8271.field33961.fromJson(new InputStreamReader(in, StandardCharsets.UTF_8), (Class)JsonElement.class), "strings").entrySet()) {
            this.field33964.put((String)entry.getKey(), Class8271.field33963.matcher(Class9583.method35894(entry.getValue(), (String)entry.getKey())).replaceAll("%$1s"));
        }
    }
    
    private String method27495(final String s) {
        final String s2 = this.field33964.get(s);
        return (s2 != null) ? s2 : s;
    }
    
    public String method27496(final String s, final Object[] args) {
        final String method27495 = this.method27495(s);
        try {
            return String.format(method27495, args);
        }
        catch (final IllegalFormatException ex) {
            return "Format error: " + method27495;
        }
    }
    
    public boolean method27497(final String s) {
        return this.field33964.containsKey(s);
    }
    
    static {
        field33961 = new Gson();
        field33962 = LogManager.getLogger();
        field33963 = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    }
}
