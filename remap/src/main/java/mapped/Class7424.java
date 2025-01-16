// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;

public class Class7424 extends ValueObject
{
    public Boolean field28598;
    public Boolean field28599;
    public Boolean field28600;
    public Boolean field28601;
    public Integer field28602;
    public Boolean field28603;
    public Boolean field28604;
    public Integer field28605;
    public Integer field28606;
    public String field28607;
    public long field28608;
    public String field28609;
    public boolean field28610;
    public boolean field28611;
    private static final boolean field28612 = false;
    private static final boolean field28613 = true;
    private static final boolean field28614 = true;
    private static final boolean field28615 = true;
    private static final boolean field28616 = true;
    private static final int field28617 = 0;
    private static final boolean field28618 = false;
    private static final int field28619 = 2;
    private static final int field28620 = 0;
    private static final String field28621 = "";
    private static final long field28622 = -1L;
    private static final String field28623;
    private static final boolean field28624 = false;
    
    public Class7424(final Boolean field28598, final Boolean field28599, final Boolean field28600, final Boolean field28601, final Integer field28602, final Boolean field28603, final Integer field28604, final Integer field28605, final Boolean field28606, final String field28607) {
        this.field28598 = field28598;
        this.field28599 = field28599;
        this.field28600 = field28600;
        this.field28601 = field28601;
        this.field28602 = field28602;
        this.field28603 = field28603;
        this.field28605 = field28604;
        this.field28606 = field28605;
        this.field28604 = field28606;
        this.field28607 = field28607;
    }
    
    public static Class7424 method22838() {
        return new Class7424(true, true, true, true, 0, false, 2, 0, false, "");
    }
    
    public static Class7424 method22839() {
        final Class7424 class7424 = new Class7424(true, true, true, true, 0, false, 2, 0, false, "");
        class7424.method22840(true);
        return class7424;
    }
    
    public void method22840(final boolean field28611) {
        this.field28611 = field28611;
    }
    
    public static Class7424 method22841(final JsonObject jsonObject) {
        final Class7424 class7424 = new Class7424(JsonUtils.method23910("pvp", jsonObject, true), JsonUtils.method23910("spawnAnimals", jsonObject, true), JsonUtils.method23910("spawnMonsters", jsonObject, true), JsonUtils.method23910("spawnNPCs", jsonObject, true), JsonUtils.method23908("spawnProtection", jsonObject, 0), JsonUtils.method23910("commandBlocks", jsonObject, false), JsonUtils.method23908("difficulty", jsonObject, 2), JsonUtils.method23908("gameMode", jsonObject, 0), JsonUtils.method23910("forceGameMode", jsonObject, false), JsonUtils.func_225171_a("slotName", jsonObject, ""));
        class7424.field28608 = JsonUtils.func_225169_a("worldTemplateId", jsonObject, -1L);
        class7424.field28609 = JsonUtils.func_225171_a("worldTemplateImage", jsonObject, Class7424.field28623);
        class7424.field28610 = JsonUtils.method23910("adventureMap", jsonObject, false);
        return class7424;
    }
    
    public String method22842(final int n) {
        if (this.field28607 != null && !this.field28607.isEmpty()) {
            return this.field28607;
        }
        return this.field28611 ? RealmsScreen.getLocalizedString("mco.configure.world.slot.empty") : this.method22843(n);
    }
    
    public String method22843(final int i) {
        return RealmsScreen.method15439("mco.configure.world.slot", i);
    }
    
    public String method22844() {
        final JsonObject jsonObject = new JsonObject();
        if (!this.field28598) {
            jsonObject.addProperty("pvp", this.field28598);
        }
        if (!this.field28599) {
            jsonObject.addProperty("spawnAnimals", this.field28599);
        }
        if (!this.field28600) {
            jsonObject.addProperty("spawnMonsters", this.field28600);
        }
        if (!this.field28601) {
            jsonObject.addProperty("spawnNPCs", this.field28601);
        }
        if (this.field28602 != 0) {
            jsonObject.addProperty("spawnProtection", (Number)this.field28602);
        }
        if (this.field28603) {
            jsonObject.addProperty("commandBlocks", this.field28603);
        }
        if (this.field28605 != 2) {
            jsonObject.addProperty("difficulty", (Number)this.field28605);
        }
        if (this.field28606 != 0) {
            jsonObject.addProperty("gameMode", (Number)this.field28606);
        }
        if (this.field28604) {
            jsonObject.addProperty("forceGameMode", this.field28604);
        }
        if (this.field28607 != null) {
            if (!this.field28607.equals("")) {
                jsonObject.addProperty("slotName", this.field28607);
            }
        }
        return jsonObject.toString();
    }
    
    public Class7424 clone() {
        return new Class7424(this.field28598, this.field28599, this.field28600, this.field28601, this.field28602, this.field28603, this.field28605, this.field28606, this.field28604, this.field28607);
    }
    
    static {
        field28623 = null;
    }
}
