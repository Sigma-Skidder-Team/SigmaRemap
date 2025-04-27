// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.util.math.MathHelper;

public class Class8817
{
    public static final Class8817 field37024;
    private final Class8683 field37025;
    private final Class8683 field37026;
    private final Class8683 field37027;
    private final Class8683 field37028;
    private final Class8683 field37029;
    
    public Class8817(final Class8683 field37025, final Class8683 field37026, final Class8683 field37027, final Class8683 field37028, final Class8683 field37029) {
        this.field37025 = field37025;
        this.field37026 = field37026;
        this.field37027 = field37027;
        this.field37028 = field37028;
        this.field37029 = field37029;
    }
    
    public static Class8817 method30755(final Class8683 class8683) {
        return new Class8817(Class8683.field36492, Class8683.field36492, Class8683.field36492, class8683, Class8683.field36492);
    }
    
    public static Class8817 method30756(final Class8683 class8683) {
        return new Class8817(Class8683.field36492, class8683, Class8683.field36492, Class8683.field36492, Class8683.field36492);
    }
    
    public boolean method30757(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final float n7 = (float)(n - n4);
        final float n8 = (float)(n2 - n5);
        final float n9 = (float)(n3 - n6);
        if (this.field37025.method29736(MathHelper.method35647(n7))) {
            if (this.field37026.method29736(MathHelper.method35647(n8))) {
                if (this.field37027.method29736(MathHelper.method35647(n9))) {
                    return this.field37028.method29737(n7 * n7 + n9 * n9) && this.field37029.method29737(n7 * n7 + n8 * n8 + n9 * n9);
                }
            }
        }
        return false;
    }
    
    public static Class8817 method30758(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "distance");
            return new Class8817(Class8683.method29738(method35913.get("x")), Class8683.method29738(method35913.get("y")), Class8683.method29738(method35913.get("z")), Class8683.method29738(method35913.get("horizontal")), Class8683.method29738(method35913.get("absolute")));
        }
        return Class8817.field37024;
    }
    
    public JsonElement method30759() {
        if (this != Class8817.field37024) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.add("x", this.field37025.method29745());
            jsonObject.add("y", this.field37026.method29745());
            jsonObject.add("z", this.field37027.method29745());
            jsonObject.add("horizontal", this.field37028.method29745());
            jsonObject.add("absolute", this.field37029.method29745());
            return jsonObject;
        }
        return JsonNull.INSTANCE;
    }
    
    static {
        field37024 = new Class8817(Class8683.field36492, Class8683.field36492, Class8683.field36492, Class8683.field36492, Class8683.field36492);
    }
}
