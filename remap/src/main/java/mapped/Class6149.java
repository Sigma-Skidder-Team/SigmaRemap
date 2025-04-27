// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6149 extends Class6132
{
    public Class6149(final Schema schema, final String str) {
        super(schema, false, "Villager profession data fix (" + str + ")", Class9451.field40626, str);
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        final Dynamic dynamic = typed.get(DSL.remainderFinder());
        return typed.set(DSL.remainderFinder(), (Object)dynamic.remove("Profession").remove("Career").remove("CareerLevel").set("VillagerData", dynamic.createMap(ImmutableMap.of(dynamic.createString("type"), dynamic.createString("minecraft:plains"), dynamic.createString("profession"), dynamic.createString(method18383(dynamic.get("Profession").asInt(0), dynamic.get("Career").asInt(0))), (Object)dynamic.createString("level"), DataFixUtils.orElse(dynamic.get("CareerLevel").get(), (Object)dynamic.createInt(1))))));
    }
    
    private static String method18383(final int n, final int n2) {
        if (n != 0) {
            if (n == 1) {
                return (n2 != 2) ? "minecraft:librarian" : "minecraft:cartographer";
            }
            if (n == 2) {
                return "minecraft:cleric";
            }
            if (n != 3) {
                if (n != 4) {
                    return (n != 5) ? "minecraft:none" : "minecraft:nitwit";
                }
                return (n2 != 2) ? "minecraft:butcher" : "minecraft:leatherworker";
            }
            else {
                if (n2 != 2) {
                    return (n2 != 3) ? "minecraft:armorer" : "minecraft:toolsmith";
                }
                return "minecraft:weaponsmith";
            }
        }
        else {
            if (n2 == 2) {
                return "minecraft:fisherman";
            }
            if (n2 != 3) {
                return (n2 != 4) ? "minecraft:farmer" : "minecraft:fletcher";
            }
            return "minecraft:shepherd";
        }
    }
}
