// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;

public class Class9089
{
    public static final Class9089 field38484;
    private final Boolean field38485;
    private final Boolean field38486;
    private final Boolean field38487;
    private final Boolean field38488;
    private final Boolean field38489;
    private final Boolean field38490;
    private final Boolean field38491;
    private final Boolean field38492;
    private final Class8172 field38493;
    private final Class8172 field38494;
    
    public Class9089(final Boolean field38485, final Boolean field38486, final Boolean field38487, final Boolean field38488, final Boolean field38489, final Boolean field38490, final Boolean field38491, final Boolean field38492, final Class8172 field38493, final Class8172 field38494) {
        this.field38485 = field38485;
        this.field38486 = field38486;
        this.field38487 = field38487;
        this.field38488 = field38488;
        this.field38489 = field38489;
        this.field38490 = field38490;
        this.field38491 = field38491;
        this.field38492 = field38492;
        this.field38493 = field38493;
        this.field38494 = field38494;
    }
    
    public boolean method32836(final Class513 class513, final DamageSource class514) {
        return this.method32837(class513.method2940(), class513.method1934(), class514);
    }
    
    public boolean method32837(final Class1849 class1849, final Vec3d class1850, final DamageSource class1851) {
        return this == Class9089.field38484 || ((this.field38485 == null || this.field38485 == class1851.method25705()) && (this.field38486 == null || this.field38486 == class1851.method25707()) && (this.field38487 == null || this.field38487 == class1851.method25709()) && (this.field38488 == null || this.field38488 == class1851.method25711()) && (this.field38489 == null || this.field38489 == class1851.method25712()) && (this.field38490 == null || this.field38490 == class1851.method25719()) && (this.field38491 == null || this.field38491 == class1851.method25723()) && (this.field38492 == null || this.field38492 == (class1851 == DamageSource.LIGHTNING_BOLT)) && this.field38493.method27016(class1849, class1850, class1851.method25713()) && this.field38494.method27016(class1849, class1850, class1851.method25714()));
    }
    
    public static Class9089 method32838(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "damage type");
            return new Class9089(method32839(method35913, "is_projectile"), method32839(method35913, "is_explosion"), method32839(method35913, "bypasses_armor"), method32839(method35913, "bypasses_invulnerability"), method32839(method35913, "bypasses_magic"), method32839(method35913, "is_fire"), method32839(method35913, "is_magic"), method32839(method35913, "is_lightning"), Class8172.method27017(method35913.get("direct_entity")), Class8172.method27017(method35913.get("source_entity")));
        }
        return Class9089.field38484;
    }
    
    @Nullable
    private static Boolean method32839(final JsonObject jsonObject, final String s) {
        return jsonObject.has(s) ? Boolean.valueOf(Class9583.method35900(jsonObject, s)) : null;
    }
    
    public JsonElement method32840() {
        if (this != Class9089.field38484) {
            final JsonObject jsonObject = new JsonObject();
            this.method32841(jsonObject, "is_projectile", this.field38485);
            this.method32841(jsonObject, "is_explosion", this.field38486);
            this.method32841(jsonObject, "bypasses_armor", this.field38487);
            this.method32841(jsonObject, "bypasses_invulnerability", this.field38488);
            this.method32841(jsonObject, "bypasses_magic", this.field38489);
            this.method32841(jsonObject, "is_fire", this.field38490);
            this.method32841(jsonObject, "is_magic", this.field38491);
            this.method32841(jsonObject, "is_lightning", this.field38492);
            jsonObject.add("direct_entity", this.field38493.method27019());
            jsonObject.add("source_entity", this.field38494.method27019());
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    private void method32841(final JsonObject jsonObject, final String s, final Boolean b) {
        if (b != null) {
            jsonObject.addProperty(s, b);
        }
    }
    
    static {
        field38484 = Class8135.method26811().method26815();
    }
}
