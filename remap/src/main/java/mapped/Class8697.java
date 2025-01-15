// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.world.dimension.DimensionType;

public class Class8697
{
    public static final Class8697 field36544;
    private final Class8683 field36545;
    private final Class8683 field36546;
    private final Class8683 field36547;
    private final Class3090 field36548;
    private final Class4574<?> field36549;
    private final DimensionType field36550;
    private final Class8355 field36551;
    private final Class7854 field36552;
    private final Class8744 field36553;
    
    public Class8697(final Class8683 field36545, final Class8683 field36546, final Class8683 field36547, final Class3090 field36548, final Class4574<?> field36549, final DimensionType field36550, final Class8355 field36551, final Class7854 field36552, final Class8744 field36553) {
        this.field36545 = field36545;
        this.field36546 = field36546;
        this.field36547 = field36547;
        this.field36548 = field36548;
        this.field36549 = field36549;
        this.field36550 = field36550;
        this.field36551 = field36551;
        this.field36552 = field36552;
        this.field36553 = field36553;
    }
    
    public static Class8697 method29808(final Class3090 class3090) {
        return new Class8697(Class8683.field36492, Class8683.field36492, Class8683.field36492, class3090, null, null, Class8355.field34288, Class7854.field32229, Class8744.field36724);
    }
    
    public static Class8697 method29809(final DimensionType class383) {
        return new Class8697(Class8683.field36492, Class8683.field36492, Class8683.field36492, null, null, class383, Class8355.field34288, Class7854.field32229, Class8744.field36724);
    }
    
    public static Class8697 method29810(final Class4574<?> class4574) {
        return new Class8697(Class8683.field36492, Class8683.field36492, Class8683.field36492, null, class4574, null, Class8355.field34288, Class7854.field32229, Class8744.field36724);
    }
    
    public boolean method29811(final Class1849 class1849, final double n, final double n2, final double n3) {
        return this.method29812(class1849, (float)n, (float)n2, (float)n3);
    }
    
    public boolean method29812(final Class1849 class1849, final float n, final float n2, final float n3) {
        if (!this.field36545.method29736(n)) {
            return false;
        }
        if (!this.field36546.method29736(n2)) {
            return false;
        }
        if (!this.field36547.method29736(n3)) {
            return false;
        }
        if (this.field36550 != null && this.field36550 != class1849.dimension.getType()) {
            return false;
        }
        final BlockPos class1850 = new BlockPos(n, n2, n3);
        final boolean method6731 = class1849.method6731(class1850);
        return (this.field36548 == null || (method6731 && this.field36548 == class1849.method6959(class1850))) && (this.field36549 == null || (method6731 && this.field36549.method13590(class1849, class1850))) && this.field36551.method27890(class1849, class1850) && this.field36552.method25398(class1849, class1850) && this.field36553.method30235(class1849, class1850);
    }
    
    public JsonElement method29813() {
        if (this != Class8697.field36544) {
            final JsonObject jsonObject = new JsonObject();
            Label_0117: {
                if (this.field36545.method29744()) {
                    if (this.field36546.method29744()) {
                        if (this.field36547.method29744()) {
                            break Label_0117;
                        }
                    }
                }
                final JsonObject jsonObject2 = new JsonObject();
                jsonObject2.add("x", this.field36545.method29745());
                jsonObject2.add("y", this.field36546.method29745());
                jsonObject2.add("z", this.field36547.method29745());
                jsonObject.add("position", (JsonElement)jsonObject2);
            }
            if (this.field36550 != null) {
                jsonObject.addProperty("dimension", DimensionType.method1276(this.field36550).toString());
            }
            if (this.field36549 != null) {
                jsonObject.addProperty("feature", (String)Class4535.field20023.inverse().get((Object)this.field36549));
            }
            if (this.field36548 != null) {
                jsonObject.addProperty("biome", Class90.field217.method503(this.field36548).toString());
            }
            jsonObject.add("light", this.field36551.method27891());
            jsonObject.add("block", this.field36552.method25400());
            jsonObject.add("fluid", this.field36553.method30237());
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    public static Class8697 method29814(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "location");
            final JsonObject method35914 = Class9583.method35915(method35913, "position", new JsonObject());
            final Class8683 method35915 = Class8683.method29738(method35914.get("x"));
            final Class8683 method35916 = Class8683.method29738(method35914.get("y"));
            final Class8683 method35917 = Class8683.method29738(method35914.get("z"));
            final DimensionType class383 = method35913.has("dimension") ? DimensionType.method1275(new Class1932(Class9583.method35895(method35913, "dimension"))) : null;
            final Class4574 class384 = method35913.has("feature") ? ((Class4574)Class4535.field20023.get((Object)Class9583.method35895(method35913, "feature"))) : null;
            Class3090 class385 = null;
            if (method35913.has("biome")) {
                class385 = Class90.field217.method506(new Class1932(Class9583.method35895(method35913, "biome"))).orElseThrow(() -> {
                    new JsonSyntaxException("Unknown biome '" + obj + "'");
                    return;
                });
            }
            return new Class8697(method35915, method35916, method35917, class385, class384, class383, Class8355.method27892(method35913.get("light")), Class7854.method25399(method35913.get("block")), Class8744.method30236(method35913.get("fluid")));
        }
        return Class8697.field36544;
    }
    
    static {
        field36544 = new Class8697(Class8683.field36492, Class8683.field36492, Class8683.field36492, null, null, null, Class8355.field34288, Class7854.field32229, Class8744.field36724);
    }
}
