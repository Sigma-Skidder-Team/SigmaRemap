// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6140 extends Class6132
{
    public Class6140(final Schema schema, final boolean b) {
        super(schema, b, "Zombie Villager XP rebuild", Class9451.field40626, "minecraft:zombie_villager");
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> {
            if (dynamic.get("Xp").asNumber().isPresent()) {
                return dynamic;
            }
            else {
                return dynamic.set("Xp", dynamic.createInt(Class8873.method31183(dynamic.get("VillagerData").get("level").asNumber().orElse(1).intValue())));
            }
        });
    }
}
