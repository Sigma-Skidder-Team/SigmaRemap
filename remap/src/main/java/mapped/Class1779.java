// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.InputStream;
import java.util.HashMap;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;
import com.google.gson.JsonObject;
import java.util.Map;

public abstract class Class1779 extends Class1776<Map<ResourceLocation, JsonObject>>
{
    private static final Logger field9879;
    private static final int field9880;
    private final Gson field9881;
    private final String field9882;
    
    public Class1779(final Gson field9881, final String field9882) {
        this.field9881 = field9881;
        this.field9882 = field9882;
    }
    
    public Map<ResourceLocation, JsonObject> method6375(final Class6582 class6582, final IProfiler class6583) {
        final HashMap hashMap = Maps.newHashMap();
        final int beginIndex = this.field9882.length() + 1;
        for (final ResourceLocation class6584 : class6582.method19936(this.field9882, s -> s.endsWith(".json"))) {
            final String method7797 = class6584.method7797();
            final ResourceLocation obj = new ResourceLocation(class6584.method7798(), method7797.substring(beginIndex, method7797.length() - Class1779.field9880));
            try (final Class1671 method7798 = class6582.method19933(class6584);
                 final InputStream method7799 = method7798.method5887();
                 final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(method7799, StandardCharsets.UTF_8))) {
                final JsonObject jsonObject = Class9583.method35928(this.field9881, bufferedReader, JsonObject.class);
                if (jsonObject != null) {
                    if (hashMap.put(obj, jsonObject) != null) {
                        throw new IllegalStateException("Duplicate data file ignored with ID " + obj);
                    }
                }
                else {
                    Class1779.field9879.error("Couldn't load data file {} from {} as it's null or empty", (Object)obj, (Object)class6584);
                }
            }
            catch (final IllegalArgumentException | IOException | JsonParseException ex) {
                Class1779.field9879.error("Couldn't parse data file {} from {}", (Object)obj, (Object)class6584, (Object)ex);
            }
        }
        return hashMap;
    }
    
    static {
        field9879 = LogManager.getLogger();
        field9880 = ".json".length();
    }
}
