// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.common.collect.Lists;
import com.google.gson.JsonParser;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class7436 extends ValueObject
{
    private static final Logger field28672;
    public List<Backup> field28673;
    
    public static Class7436 method22870(final String s) {
        final JsonParser jsonParser = new JsonParser();
        final Class7436 class7436 = new Class7436();
        class7436.field28673 = Lists.newArrayList();
        try {
            final JsonElement value = jsonParser.parse(s).getAsJsonObject().get("backups");
            if (value.isJsonArray()) {
                final Iterator iterator = value.getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    class7436.field28673.add(Backup.parse((JsonElement)iterator.next()));
                }
            }
        }
        catch (final Exception ex) {
            Class7436.field28672.error("Could not parse BackupList: " + ex.getMessage());
        }
        return class7436;
    }
    
    static {
        field28672 = LogManager.getLogger();
    }
}
