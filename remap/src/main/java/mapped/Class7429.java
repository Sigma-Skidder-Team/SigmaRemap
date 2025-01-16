// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.util.ArrayList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.List;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.Logger;

public class Class7429 extends ValueObject
{
    private static final Logger field28644;
    private static final JsonParser field28645;
    public long field28646;
    public List<String> field28647;
    
    public static Class7429 method22861(final JsonObject jsonObject) {
        final Class7429 class7429 = new Class7429();
        try {
            class7429.field28646 = JsonUtils.func_225169_a("serverId", jsonObject, -1L);
            final String method23907 = JsonUtils.func_225171_a("playerList", jsonObject, null);
            if (method23907 != null) {
                final JsonElement parse = Class7429.field28645.parse(method23907);
                if (parse.isJsonArray()) {
                    class7429.field28647 = method22862(parse.getAsJsonArray());
                }
                else {
                    class7429.field28647 = Lists.newArrayList();
                }
            }
            else {
                class7429.field28647 = Lists.newArrayList();
            }
        }
        catch (final Exception ex) {
            Class7429.field28644.error("Could not parse RealmsServerPlayerList: " + ex.getMessage());
        }
        return class7429;
    }
    
    private static List<String> method22862(final JsonArray jsonArray) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final JsonElement jsonElement : jsonArray) {
            try {
                arrayList.add(jsonElement.getAsString());
            }
            catch (final Exception ex) {}
        }
        return arrayList;
    }
    
    static {
        field28644 = LogManager.getLogger();
        field28645 = new JsonParser();
    }
}
