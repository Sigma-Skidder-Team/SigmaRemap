// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Class8172
{
    public static final Class8172 field33663;
    public static final Class8172[] field33664;
    private final Class8150 field33665;
    private final Class8817 field33666;
    private final Class8697 field33667;
    private final Class8003 field33668;
    private final Class7103 field33669;
    private final Class9007 field33670;
    private final Class6969 field33671;
    private final Class8139 field33672;
    private final String field33673;
    private final Class1932 field33674;
    
    private Class8172(final Class8150 field33665, final Class8817 field33666, final Class8697 field33667, final Class8003 field33668, final Class7103 field33669, final Class9007 field33670, final Class6969 field33671, final Class8139 field33672, final String field33673, final Class1932 field33674) {
        this.field33665 = field33665;
        this.field33666 = field33666;
        this.field33667 = field33667;
        this.field33668 = field33668;
        this.field33669 = field33669;
        this.field33670 = field33670;
        this.field33671 = field33671;
        this.field33672 = field33672;
        this.field33673 = field33673;
        this.field33674 = field33674;
    }
    
    public boolean method27015(final Class513 class513, final Entity class514) {
        return this.method27016(class513.method2940(), class513.method1934(), class514);
    }
    
    public boolean method27016(final Class1849 class1849, final Vec3d class1850, final Entity class1851) {
        if (this == Class8172.field33663) {
            return true;
        }
        if (class1851 == null) {
            return false;
        }
        if (!this.field33665.method26845(class1851.getType())) {
            return false;
        }
        if (class1850 != null) {
            if (!this.field33666.method30757(class1850.x, class1850.y, class1850.z, class1851.getPosX(), class1851.getPosY(), class1851.getPosZ())) {
                return false;
            }
        }
        else if (this.field33666 != Class8817.field37024) {
            return false;
        }
        if (!this.field33667.method29811(class1849, class1851.getPosX(), class1851.getPosY(), class1851.getPosZ())) {
            return false;
        }
        if (!this.field33668.method26193(class1851)) {
            return false;
        }
        if (!this.field33669.method21804(class1851)) {
            return false;
        }
        if (!this.field33670.method32226(class1851)) {
            return false;
        }
        if (!this.field33671.method21383(class1851)) {
            return false;
        }
        if (this.field33672.method26819(class1851)) {
            if (this.field33673 != null) {
                final Team method1825 = class1851.getTeam();
                if (method1825 == null || !this.field33673.equals(method1825.method20539())) {
                    return false;
                }
            }
            return this.field33674 == null || (class1851 instanceof Class800 && ((Class800)class1851).method4606().equals(this.field33674));
        }
        return false;
    }
    
    public static Class8172 method27017(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "entity");
            return new Class5754().method17072(Class8150.method26847(method35913.get("type"))).method17073(Class8817.method30758(method35913.get("distance"))).method17074(Class8697.method29814(method35913.get("location"))).method17075(Class8003.method26196(method35913.get("effects"))).method17076(Class7103.method21807(method35913.get("nbt"))).method17077(Class9007.method32228(method35913.get("flags"))).method17078(Class6969.method21384(method35913.get("equipment"))).method17079(Class8139.method26820(method35913.get("player"))).method17080(Class9583.method35896(method35913, "team", null)).method17081(method35913.has("catType") ? new Class1932(Class9583.method35895(method35913, "catType")) : null).method17082();
        }
        return Class8172.field33663;
    }
    
    public static Class8172[] method27018(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonArray method35916 = Class9583.method35916(jsonElement, "entities");
            final Class8172[] array = new Class8172[method35916.size()];
            for (int i = 0; i < method35916.size(); ++i) {
                array[i] = method27017(method35916.get(i));
            }
            return array;
        }
        return Class8172.field33664;
    }
    
    public JsonElement method27019() {
        if (this != Class8172.field33663) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.add("type", this.field33665.method26846());
            jsonObject.add("distance", this.field33666.method30759());
            jsonObject.add("location", this.field33667.method29813());
            jsonObject.add("effects", this.field33668.method26197());
            jsonObject.add("nbt", this.field33669.method21806());
            jsonObject.add("flags", this.field33670.method32230());
            jsonObject.add("equipment", this.field33671.method21385());
            jsonObject.add("player", this.field33672.method26823());
            jsonObject.addProperty("team", this.field33673);
            if (this.field33674 != null) {
                jsonObject.addProperty("catType", this.field33674.toString());
            }
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    public static JsonElement method27020(final Class8172[] array) {
        if (array != Class8172.field33664) {
            final JsonArray jsonArray = new JsonArray();
            for (int length = array.length, i = 0; i < length; ++i) {
                final JsonElement method27019 = array[i].method27019();
                if (!method27019.isJsonNull()) {
                    jsonArray.add(method27019);
                }
            }
            return (JsonElement)jsonArray;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    static {
        field33663 = new Class8172(Class8150.field33561, Class8817.field37024, Class8697.field36544, Class8003.field32963, Class7103.field27707, Class9007.field38030, Class6969.field27249, Class8139.field33530, null, null);
        field33664 = new Class8172[0];
    }
}
