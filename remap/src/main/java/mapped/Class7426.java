// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Date;
import org.apache.logging.log4j.Logger;

public class Class7426 extends Class7422
{
    private static final Logger field28627;
    public String field28628;
    public Date field28629;
    public long field28630;
    private boolean field28631;
    public Map<String, String> field28632;
    public Map<String, String> field28633;
    
    public Class7426() {
        this.field28632 = Maps.newHashMap();
        this.field28633 = Maps.newHashMap();
    }
    
    public static Class7426 method22846(final JsonElement jsonElement) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Class7426 class7426 = new Class7426();
        try {
            class7426.field28628 = Class7610.method23907("backupId", asJsonObject, "");
            class7426.field28629 = Class7610.method23911("lastModifiedDate", asJsonObject);
            class7426.field28630 = Class7610.method23909("size", asJsonObject, 0L);
            if (asJsonObject.has("metadata")) {
                for (final Map.Entry<K, JsonElement> entry : asJsonObject.getAsJsonObject("metadata").entrySet()) {
                    if (!entry.getValue().isJsonNull()) {
                        class7426.field28632.put(method22847((String)entry.getKey()), entry.getValue().getAsString());
                    }
                }
            }
        }
        catch (final Exception ex) {
            Class7426.field28627.error("Could not parse Backup: " + ex.getMessage());
        }
        return class7426;
    }
    
    private static String method22847(final String s) {
        final String[] split = s.split("_");
        final StringBuilder sb = new StringBuilder();
        for (final String s2 : split) {
            if (s2 != null) {
                if (s2.length() >= 1) {
                    if (!"of".equals(s2)) {
                        sb.append(Character.toUpperCase(s2.charAt(0))).append(s2.substring(1, s2.length())).append(" ");
                    }
                    else {
                        sb.append(s2).append(" ");
                    }
                }
            }
        }
        return sb.toString();
    }
    
    public boolean method22848() {
        return this.field28631;
    }
    
    public void method22849(final boolean field28631) {
        this.field28631 = field28631;
    }
    
    static {
        field28627 = LogManager.getLogger();
    }
}
