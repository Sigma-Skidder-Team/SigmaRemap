// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.List;

public class Class5767 implements Class5763
{
    private final Class1932 field23582;
    private final Class3820 field23583;
    private final int field23584;
    private final String field23585;
    private final List<String> field23586;
    private final Map<Character, Class120> field23587;
    private final Class6056 field23588;
    private final Class1932 field23589;
    public final /* synthetic */ Class7989 field23590;
    
    public Class5767(final Class7989 field23590, final Class1932 field23591, final Class3820 field23592, final int field23593, final String field23594, final List<String> field23595, final Map<Character, Class120> field23596, final Class6056 field23597, final Class1932 field23598) {
        this.field23590 = field23590;
        this.field23582 = field23591;
        this.field23583 = field23592;
        this.field23584 = field23593;
        this.field23585 = field23594;
        this.field23586 = field23595;
        this.field23587 = field23596;
        this.field23588 = field23597;
        this.field23589 = field23598;
    }
    
    @Override
    public void method17153(final JsonObject jsonObject) {
        if (!this.field23585.isEmpty()) {
            jsonObject.addProperty("group", this.field23585);
        }
        final JsonArray jsonArray = new JsonArray();
        final Iterator<String> iterator = this.field23586.iterator();
        while (iterator.hasNext()) {
            jsonArray.add((String)iterator.next());
        }
        jsonObject.add("pattern", (JsonElement)jsonArray);
        final JsonObject jsonObject2 = new JsonObject();
        for (final Map.Entry<Object, V> entry : this.field23587.entrySet()) {
            jsonObject2.add(String.valueOf(entry.getKey()), ((Class120)entry.getValue()).method615());
        }
        jsonObject.add("key", (JsonElement)jsonObject2);
        final JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("item", Class90.field211.method503(this.field23583).toString());
        if (this.field23584 > 1) {
            jsonObject3.addProperty("count", (Number)this.field23584);
        }
        jsonObject.add("result", (JsonElement)jsonObject3);
    }
    
    @Override
    public Class6096<?> method17156() {
        return Class6096.field24733;
    }
    
    @Override
    public Class1932 method17155() {
        return this.field23582;
    }
    
    @Nullable
    @Override
    public JsonObject method17157() {
        return this.field23588.method18015();
    }
    
    @Nullable
    @Override
    public Class1932 method17158() {
        return this.field23589;
    }
}
