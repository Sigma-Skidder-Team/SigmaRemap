// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class Class5765 implements Class5763
{
    private final Class1932 field23573;
    private final Class3820 field23574;
    private final int field23575;
    private final String field23576;
    private final List<Class120> field23577;
    private final Class6056 field23578;
    private final Class1932 field23579;
    
    public Class5765(final Class1932 field23573, final Class3820 field23574, final int field23575, final String field23576, final List<Class120> field23577, final Class6056 field23578, final Class1932 field23579) {
        this.field23573 = field23573;
        this.field23574 = field23574;
        this.field23575 = field23575;
        this.field23576 = field23576;
        this.field23577 = field23577;
        this.field23578 = field23578;
        this.field23579 = field23579;
    }
    
    @Override
    public void method17153(final JsonObject jsonObject) {
        if (!this.field23576.isEmpty()) {
            jsonObject.addProperty("group", this.field23576);
        }
        final JsonArray jsonArray = new JsonArray();
        final Iterator<Class120> iterator = this.field23577.iterator();
        while (iterator.hasNext()) {
            jsonArray.add(iterator.next().method615());
        }
        jsonObject.add("ingredients", (JsonElement)jsonArray);
        final JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("item", Class90.field211.method503(this.field23574).toString());
        if (this.field23575 > 1) {
            jsonObject2.addProperty("count", (Number)this.field23575);
        }
        jsonObject.add("result", (JsonElement)jsonObject2);
    }
    
    @Override
    public Class6096<?> method17156() {
        return Class6096.field24734;
    }
    
    @Override
    public Class1932 method17155() {
        return this.field23573;
    }
    
    @Nullable
    @Override
    public JsonObject method17157() {
        return this.field23578.method18015();
    }
    
    @Nullable
    @Override
    public Class1932 method17158() {
        return this.field23579;
    }
}
