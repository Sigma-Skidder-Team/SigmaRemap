// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonObject;

public interface Class5763
{
    void method17153(final JsonObject p0);
    
    default JsonObject method17154() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", Class90.field237.method503(this.method17156()).toString());
        this.method17153(jsonObject);
        return jsonObject;
    }
    
    Class1932 method17155();
    
    Class6096<?> method17156();
    
    @Nullable
    JsonObject method17157();
    
    @Nullable
    Class1932 method17158();
}
