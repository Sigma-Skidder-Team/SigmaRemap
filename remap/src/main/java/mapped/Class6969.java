// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class Class6969
{
    public static final Class6969 field27249;
    public static final Class6969 field27250;
    private final Class9342 field27251;
    private final Class9342 field27252;
    private final Class9342 field27253;
    private final Class9342 field27254;
    private final Class9342 field27255;
    private final Class9342 field27256;
    
    public Class6969(final Class9342 field27251, final Class9342 field27252, final Class9342 field27253, final Class9342 field27254, final Class9342 field27255, final Class9342 field27256) {
        this.field27251 = field27251;
        this.field27252 = field27252;
        this.field27253 = field27253;
        this.field27254 = field27254;
        this.field27255 = field27255;
        this.field27256 = field27256;
    }
    
    public boolean method21383(final Entity class399) {
        if (this == Class6969.field27249) {
            return true;
        }
        if (class399 instanceof LivingEntity) {
            final LivingEntity class400 = (LivingEntity)class399;
            return this.field27251.method34627(class400.method2718(Class2215.field13605)) && this.field27252.method34627(class400.method2718(Class2215.field13604)) && this.field27253.method34627(class400.method2718(Class2215.field13603)) && this.field27254.method34627(class400.method2718(Class2215.field13602)) && this.field27255.method34627(class400.method2718(Class2215.field13600)) && this.field27256.method34627(class400.method2718(Class2215.field13601));
        }
        return false;
    }
    
    public static Class6969 method21384(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "equipment");
            return new Class6969(Class9342.method34628(method35913.get("head")), Class9342.method34628(method35913.get("chest")), Class9342.method34628(method35913.get("legs")), Class9342.method34628(method35913.get("feet")), Class9342.method34628(method35913.get("mainhand")), Class9342.method34628(method35913.get("offhand")));
        }
        return Class6969.field27249;
    }
    
    public JsonElement method21385() {
        if (this != Class6969.field27249) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.add("head", this.field27251.method34629());
            jsonObject.add("chest", this.field27252.method34629());
            jsonObject.add("legs", this.field27253.method34629());
            jsonObject.add("feet", this.field27254.method34629());
            jsonObject.add("mainhand", this.field27255.method34629());
            jsonObject.add("offhand", this.field27256.method34629());
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    static {
        field27249 = new Class6969(Class9342.field40107, Class9342.field40107, Class9342.field40107, Class9342.field40107, Class9342.field40107, Class9342.field40107);
        field27250 = new Class6969(Class9425.method35024().method35025(Items.field31556).method35027(Class8792.method30651().method27657()).method35029(), Class9342.field40107, Class9342.field40107, Class9342.field40107, Class9342.field40107, Class9342.field40107);
    }
}
