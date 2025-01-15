// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonObject;

public class Class5764 implements Class5763
{
    private final Class1932 field23565;
    private final String field23566;
    private final Class120 field23567;
    private final Item field23568;
    private final int field23569;
    private final Class6056 field23570;
    private final Class1932 field23571;
    private final Class6096<?> field23572;
    
    public Class5764(final Class1932 field23565, final Class6096<?> field23566, final String field23567, final Class120 field23568, final Item field23569, final int field23570, final Class6056 field23571, final Class1932 field23572) {
        this.field23565 = field23565;
        this.field23572 = field23566;
        this.field23566 = field23567;
        this.field23567 = field23568;
        this.field23568 = field23569;
        this.field23569 = field23570;
        this.field23570 = field23571;
        this.field23571 = field23572;
    }
    
    @Override
    public void method17153(final JsonObject jsonObject) {
        if (!this.field23566.isEmpty()) {
            jsonObject.addProperty("group", this.field23566);
        }
        jsonObject.add("ingredient", this.field23567.method615());
        jsonObject.addProperty("result", Class90.field211.method503(this.field23568).toString());
        jsonObject.addProperty("count", (Number)this.field23569);
    }
    
    @Override
    public Class1932 method17155() {
        return this.field23565;
    }
    
    @Override
    public Class6096<?> method17156() {
        return this.field23572;
    }
    
    @Nullable
    @Override
    public JsonObject method17157() {
        return this.field23570.method18015();
    }
    
    @Nullable
    @Override
    public Class1932 method17158() {
        return this.field23571;
    }
}
