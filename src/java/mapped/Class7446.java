// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class7446 extends Class7422
{
    private static final Logger field28721;
    public List<Class7429> field28722;
    
    public static Class7446 method22898(final String s) {
        final Class7446 class7446 = new Class7446();
        class7446.field28722 = Lists.newArrayList();
        try {
            final JsonObject asJsonObject = new JsonParser().parse(s).getAsJsonObject();
            if (asJsonObject.get("lists").isJsonArray()) {
                final Iterator iterator = asJsonObject.get("lists").getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    class7446.field28722.add(Class7429.method22861(((JsonElement)iterator.next()).getAsJsonObject()));
                }
            }
        }
        catch (final Exception ex) {
            Class7446.field28721.error("Could not parse RealmsServerPlayerLists: " + ex.getMessage());
        }
        return class7446;
    }
    
    static {
        field28721 = LogManager.getLogger();
    }
}
