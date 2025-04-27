// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Date;
import org.apache.logging.log4j.Logger;

public class Backup extends ValueObject
{
    private static final Logger LOGGER;
    public String backupId;
    public Date lastModifiedDate;
    public long size;
    private boolean uploadedVersion;
    public Map<String, String> metadata;
    public Map<String, String> changeList;
    
    public Backup() {
        this.metadata = Maps.newHashMap();
        this.changeList = Maps.newHashMap();
    }
    
    public static Backup parse(final JsonElement jsonElement) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Backup class7426 = new Backup();
        try {
            class7426.backupId = JsonUtils.func_225171_a("backupId", asJsonObject, "");
            class7426.lastModifiedDate = JsonUtils.func_225173_a("lastModifiedDate", asJsonObject);
            class7426.size = JsonUtils.func_225169_a("size", asJsonObject, 0L);
            if (asJsonObject.has("metadata")) {
                for (final Map.Entry<String, JsonElement> entry : asJsonObject.getAsJsonObject("metadata").entrySet()) {
                    if (!entry.getValue().isJsonNull()) {
                        class7426.metadata.put(format(entry.getKey()), entry.getValue().getAsString());
                    }
                }
            }
        }
        catch (final Exception ex) {
            Backup.LOGGER.error("Could not parse Backup: " + ex.getMessage());
        }
        return class7426;
    }
    
    private static String format(final String s) {
        final String[] split = s.split("_");
        final StringBuilder sb = new StringBuilder();
        for (final String s2 : split) {
            if (s2 != null) {
                if (s2.length() >= 1) {
                    if (!"of".equals(s2)) {
                        sb.append(Character.toUpperCase(s2.charAt(0))).append(s2, 1, s2.length()).append(" ");
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
        return this.uploadedVersion;
    }
    
    public void method22849(final boolean field28631) {
        this.uploadedVersion = field28631;
    }
    
    static {
        LOGGER = LogManager.getLogger();
    }
}
