// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import com.mojang.datafixers.Typed;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import java.util.Set;
import com.mojang.datafixers.DataFix;

public class Class7881 extends DataFix
{
    private static final Set<String> field32345;
    
    public Class7881(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public Dynamic<?> method25535(Dynamic<?> remove) {
        final Optional number = remove.get("HealF").asNumber();
        final Optional number2 = remove.get("Health").asNumber();
        float n;
        if (!number.isPresent()) {
            if (!number2.isPresent()) {
                return remove;
            }
            n = number2.get().floatValue();
        }
        else {
            n = number.get().floatValue();
            remove = remove.remove("HealF");
        }
        return remove.set("Health", remove.createFloat(n));
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityHealthFix", this.getInputSchema().getType(Class9451.field40626), typed -> typed.update(DSL.remainderFinder(), (Function)this::method25535));
    }
    
    static {
        field32345 = Sets.newHashSet((Object[])new String[] { "ArmorStand", "Bat", "Blaze", "CaveSpider", "Chicken", "Cow", "Creeper", "EnderDragon", "Enderman", "Endermite", "EntityHorse", "Ghast", "Giant", "Guardian", "LavaSlime", "MushroomCow", "Ozelot", "Pig", "PigZombie", "Rabbit", "Sheep", "Shulker", "Silverfish", "Skeleton", "Slime", "SnowMan", "Spider", "Squid", "Villager", "VillagerGolem", "Witch", "WitherBoss", "Wolf", "Zombie" });
    }
}
