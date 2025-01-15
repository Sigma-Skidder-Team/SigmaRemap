// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonObject;

public class Class5768 implements Class5763
{
    private final Class1932 field23591;
    private final String field23592;
    private final Class120 field23593;
    private final Item field23594;
    private final float field23595;
    private final int field23596;
    private final Class6056 field23597;
    private final Class1932 field23598;
    private final Class6096<? extends Class3680> field23599;
    
    public Class5768(final Class1932 field23591, final String field23592, final Class120 field23593, final Item field23594, final float field23595, final int field23596, final Class6056 field23597, final Class1932 field23598, final Class6096<? extends Class3680> field23599) {
        this.field23591 = field23591;
        this.field23592 = field23592;
        this.field23593 = field23593;
        this.field23594 = field23594;
        this.field23595 = field23595;
        this.field23596 = field23596;
        this.field23597 = field23597;
        this.field23598 = field23598;
        this.field23599 = field23599;
    }
    
    @Override
    public void method17153(final JsonObject jsonObject) {
        if (!this.field23592.isEmpty()) {
            jsonObject.addProperty("group", this.field23592);
        }
        jsonObject.add("ingredient", this.field23593.method615());
        jsonObject.addProperty("result", Class90.field211.method503(this.field23594).toString());
        jsonObject.addProperty("experience", (Number)this.field23595);
        jsonObject.addProperty("cookingtime", (Number)this.field23596);
    }
    
    @Override
    public Class6096<?> method17156() {
        return this.field23599;
    }
    
    @Override
    public Class1932 method17155() {
        return this.field23591;
    }
    
    @Nullable
    @Override
    public JsonObject method17157() {
        return this.field23597.method18015();
    }
    
    @Nullable
    @Override
    public Class1932 method17158() {
        return this.field23598;
    }
}
