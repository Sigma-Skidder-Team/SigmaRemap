// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import java.io.Reader;
import org.apache.commons.io.IOUtils;
import java.io.FileNotFoundException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.common.io.Files;
import java.nio.charset.StandardCharsets;
import com.google.common.collect.Maps;
import java.io.File;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class8175
{
    public static final Logger field33679;
    private final Map<String, File> field33680;
    private final Map<ResourceLocation, File> field33681;
    
    public Class8175() {
        this.field33680 = Maps.newHashMap();
        this.field33681 = Maps.newHashMap();
    }
    
    public Class8175(final File file, final String str) {
        this.field33680 = Maps.newHashMap();
        this.field33681 = Maps.newHashMap();
        final File parent = new File(file, "objects");
        final File file2 = new File(file, "indexes/" + str + ".json");
        Reader reader = null;
        try {
            reader = Files.newReader(file2, StandardCharsets.UTF_8);
            final JsonObject method35915 = Class9583.method35915(Class9583.method35933(reader), "objects", null);
            if (method35915 != null) {
                for (final Map.Entry<K, JsonObject> entry : method35915.entrySet()) {
                    final JsonObject jsonObject = entry.getValue();
                    final String[] split = ((String)entry.getKey()).split("/", 2);
                    final String method35916 = Class9583.method35895(jsonObject, "hash");
                    final File file3 = new File(parent, method35916.substring(0, 2) + "/" + method35916);
                    if (split.length == 1) {
                        this.field33680.put(split[0], file3);
                    }
                    else {
                        this.field33681.put(new ResourceLocation(split[0], split[1]), file3);
                    }
                }
            }
        }
        catch (final JsonParseException ex) {
            Class8175.field33679.error("Unable to parse resource index file: {}", (Object)file2);
        }
        catch (final FileNotFoundException ex2) {
            Class8175.field33679.error("Can't find the resource index file: {}", (Object)file2);
        }
        finally {
            IOUtils.closeQuietly(reader);
        }
    }
    
    @Nullable
    public File method27064(final ResourceLocation class1932) {
        return this.field33681.get(class1932);
    }
    
    @Nullable
    public File method27065(final String s) {
        return this.field33680.get(s);
    }
    
    public Collection<ResourceLocation> method27066(final String s, final String s2, final int n, final Predicate<String> predicate) {
        return this.field33681.keySet().stream().filter(class1932 -> {
            class1932.method7797();
            final boolean b;
            if (!(!class1932.method7798().equals(anObject))) {
                final String s3;
                if (!s3.endsWith(".mcmeta")) {
                    if (!(!s3.startsWith(str + "/"))) {
                        if (!(!predicate2.test(s3))) {
                            return b;
                        }
                    }
                }
            }
            return b;
        }).collect((Collector<? super Object, ?, Collection<ResourceLocation>>)Collectors.toList());
    }
    
    static {
        field33679 = LogManager.getLogger();
    }
}
