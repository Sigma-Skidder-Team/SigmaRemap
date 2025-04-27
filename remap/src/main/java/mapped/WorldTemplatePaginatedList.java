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
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class WorldTemplatePaginatedList extends ValueObject
{
    private static final Logger field28716;
    public List<Class7430> field28717;
    public int field28718;
    public int field28719;
    public int field28720;
    
    public WorldTemplatePaginatedList() {
    }
    
    public WorldTemplatePaginatedList(final int field28719) {
        this.field28717 = Collections.emptyList();
        this.field28718 = 0;
        this.field28719 = field28719;
        this.field28720 = -1;
    }
    
    public boolean method22896() {
        if (this.field28718 * this.field28719 >= this.field28720) {
            if (this.field28718 > 0) {
                if (this.field28720 > 0) {
                    return this.field28719 > 0;
                }
            }
        }
        return false;
    }
    
    public static WorldTemplatePaginatedList method22897(final String s) {
        final WorldTemplatePaginatedList class7445 = new WorldTemplatePaginatedList();
        class7445.field28717 = Lists.newArrayList();
        try {
            final JsonObject asJsonObject = new JsonParser().parse(s).getAsJsonObject();
            if (asJsonObject.get("templates").isJsonArray()) {
                final Iterator iterator = asJsonObject.get("templates").getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    class7445.field28717.add(Class7430.method22863(((JsonElement)iterator.next()).getAsJsonObject()));
                }
            }
            class7445.field28718 = JsonUtils.method23908("page", asJsonObject, 0);
            class7445.field28719 = JsonUtils.method23908("size", asJsonObject, 0);
            class7445.field28720 = JsonUtils.method23908("total", asJsonObject, 0);
        }
        catch (final Exception ex) {
            WorldTemplatePaginatedList.field28716.error("Could not parse WorldTemplatePaginatedList: " + ex.getMessage());
        }
        return class7445;
    }
    
    static {
        field28716 = LogManager.getLogger();
    }
}
