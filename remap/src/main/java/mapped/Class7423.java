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

public class Class7423 extends Class7422
{
    private static final Logger field28596;
    public List<Class7442> field28597;
    
    public Class7423() {
        this.field28597 = Lists.newArrayList();
    }
    
    public static Class7423 method22837(final String s) {
        final Class7423 class7423 = new Class7423();
        try {
            final JsonObject asJsonObject = new JsonParser().parse(s).getAsJsonObject();
            if (asJsonObject.get("invites").isJsonArray()) {
                final Iterator iterator = asJsonObject.get("invites").getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    class7423.field28597.add(Class7442.method22889(((JsonElement)iterator.next()).getAsJsonObject()));
                }
            }
        }
        catch (final Exception ex) {
            Class7423.field28596.error("Could not parse PendingInvitesList: " + ex.getMessage());
        }
        return class7423;
    }
    
    static {
        field28596 = LogManager.getLogger();
    }
}
