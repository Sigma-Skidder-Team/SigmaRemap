// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class Class9007
{
    public static final Class9007 field38030;
    private final Boolean field38031;
    private final Boolean field38032;
    private final Boolean field38033;
    private final Boolean field38034;
    private final Boolean field38035;
    
    public Class9007(final Boolean field38031, final Boolean field38032, final Boolean field38033, final Boolean field38034, final Boolean field38035) {
        this.field38031 = field38031;
        this.field38032 = field38032;
        this.field38033 = field38033;
        this.field38034 = field38034;
        this.field38035 = field38035;
    }
    
    public boolean method32226(final Entity class399) {
        if (this.field38031 != null && class399.method1804() != this.field38031) {
            return false;
        }
        if (this.field38032 != null && class399.method1814() != this.field38032) {
            return false;
        }
        if (this.field38033 != null && class399.method1815() != this.field38033) {
            return false;
        }
        if (this.field38034 != null && class399.method1817() != this.field38034) {
            return false;
        }
        if (this.field38035 != null) {
            if (class399 instanceof LivingEntity) {
                if (((LivingEntity)class399).method2625() != this.field38035) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Nullable
    private static Boolean method32227(final JsonObject jsonObject, final String s) {
        return jsonObject.has(s) ? Boolean.valueOf(Class9583.method35900(jsonObject, s)) : null;
    }
    
    public static Class9007 method32228(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "entity flags");
            return new Class9007(method32227(method35913, "is_on_fire"), method32227(method35913, "is_sneaking"), method32227(method35913, "is_sprinting"), method32227(method35913, "is_swimming"), method32227(method35913, "is_baby"));
        }
        return Class9007.field38030;
    }
    
    private void method32229(final JsonObject jsonObject, final String s, final Boolean b) {
        if (b != null) {
            jsonObject.addProperty(s, b);
        }
    }
    
    public JsonElement method32230() {
        if (this != Class9007.field38030) {
            final JsonObject jsonObject = new JsonObject();
            this.method32229(jsonObject, "is_on_fire", this.field38031);
            this.method32229(jsonObject, "is_sneaking", this.field38032);
            this.method32229(jsonObject, "is_sprinting", this.field38033);
            this.method32229(jsonObject, "is_swimming", this.field38034);
            this.method32229(jsonObject, "is_baby", this.field38035);
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    static {
        field38030 = new Class8129().method26791();
    }
}
