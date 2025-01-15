// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.util.DamageSource;

public class Class8439
{
    public static final Class8439 field34684;
    private final Class8683 field34685;
    private final Class8683 field34686;
    private final Class8172 field34687;
    private final Boolean field34688;
    private final Class9089 field34689;
    
    public Class8439() {
        this.field34685 = Class8683.field36492;
        this.field34686 = Class8683.field36492;
        this.field34687 = Class8172.field33663;
        this.field34688 = null;
        this.field34689 = Class9089.field38484;
    }
    
    public Class8439(final Class8683 field34685, final Class8683 field34686, final Class8172 field34687, final Boolean field34688, final Class9089 field34689) {
        this.field34685 = field34685;
        this.field34686 = field34686;
        this.field34687 = field34687;
        this.field34688 = field34688;
        this.field34689 = field34689;
    }
    
    public boolean method28170(final Class513 class513, final DamageSource class514, final float n, final float n2, final boolean b) {
        return this == Class8439.field34684 || (this.field34685.method29736(n) && this.field34686.method29736(n2) && this.field34687.method27015(class513, class514.method25714()) && (this.field34688 == null || this.field34688 == b) && this.field34689.method32836(class513, class514));
    }
    
    public static Class8439 method28171(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "damage");
            return new Class8439(Class8683.method29738(method35913.get("dealt")), Class8683.method29738(method35913.get("taken")), Class8172.method27017(method35913.get("source_entity")), method35913.has("blocked") ? Boolean.valueOf(Class9583.method35900(method35913, "blocked")) : null, Class9089.method32838(method35913.get("type")));
        }
        return Class8439.field34684;
    }
    
    public JsonElement method28172() {
        if (this != Class8439.field34684) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.add("dealt", this.field34685.method29745());
            jsonObject.add("taken", this.field34686.method29745());
            jsonObject.add("source_entity", this.field34687.method27019());
            jsonObject.add("type", this.field34689.method32840());
            if (this.field34688 != null) {
                jsonObject.addProperty("blocked", this.field34688);
            }
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    static {
        field34684 = Class9504.method35394().method35397();
    }
}
