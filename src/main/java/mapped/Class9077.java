// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.Optional;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9077 extends DataFix
{
    private static final String[] field38434;
    
    public Class9077(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getInputSchema().getType(Class9451.field40622);
        DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
        DSL.fieldFinder("id", DSL.string());
        type.findField("tag");
        return this.fixTypeEverywhereTyped("ItemSpawnEggFix", type, typed -> {
            final OpticFinder opticFinder5;
            opticFinder5.type().findField("EntityTag");
            final Schema schema;
            DSL.typeFinder(schema.getTypeRaw(Class9451.field40626));
            typed.getOptional(opticFinder);
            final Optional optional;
            if (optional.isPresent() && Objects.equals(optional.get().getSecond(), "minecraft:spawn_egg")) {
                final Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
                dynamic.get("Damage").asShort((short)0);
                typed.getOptionalTyped(opticFinder2).flatMap(typed5 -> typed5.getOptionalTyped(opticFinder6)).flatMap(typed6 -> typed6.getOptionalTyped(opticFinder7)).flatMap(typed7 -> typed7.getOptional(opticFinder8));
                final int n;
                final String b = Class9077.field38434[n & 0xFF];
                Typed typed3 = null;
                if (b != null) {
                    final Optional optional2;
                    if (!optional2.isPresent() || !Objects.equals(optional2.get(), b)) {
                        typed.getOrCreateTyped(opticFinder2);
                        final Typed typed2;
                        typed2.getOrCreateTyped(opticFinder3);
                        final Typed typed4;
                        typed3 = typed.set(opticFinder2, typed2.set(opticFinder3, typed4.set(opticFinder4, (Typed)((Optional)this.getOutputSchema().getTypeRaw(Class9451.field40626).readTyped(typed4.getOrCreateTyped(opticFinder4).write().set("id", dynamic.createString(b))).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse new entity")))));
                    }
                }
                if (n != 0) {
                    typed3 = typed3.set(DSL.remainderFinder(), (Object)dynamic.set("Damage", dynamic.createShort((short)0)));
                }
                return typed3;
            }
            else {
                return typed;
            }
        });
    }
    
    static {
        field38434 = (String[])DataFixUtils.make((Object)new String[256], array -> {
            array[1] = "Item";
            array[2] = "XPOrb";
            array[7] = "ThrownEgg";
            array[8] = "LeashKnot";
            array[9] = "Painting";
            array[10] = "Arrow";
            array[11] = "Snowball";
            array[12] = "Fireball";
            array[13] = "SmallFireball";
            array[14] = "ThrownEnderpearl";
            array[15] = "EyeOfEnderSignal";
            array[16] = "ThrownPotion";
            array[17] = "ThrownExpBottle";
            array[18] = "ItemFrame";
            array[19] = "WitherSkull";
            array[20] = "PrimedTnt";
            array[21] = "FallingSand";
            array[22] = "FireworksRocketEntity";
            array[23] = "TippedArrow";
            array[24] = "SpectralArrow";
            array[25] = "ShulkerBullet";
            array[26] = "DragonFireball";
            array[30] = "ArmorStand";
            array[41] = "Boat";
            array[42] = "MinecartRideable";
            array[43] = "MinecartChest";
            array[44] = "MinecartFurnace";
            array[45] = "MinecartTNT";
            array[46] = "MinecartHopper";
            array[47] = "MinecartSpawner";
            array[40] = "MinecartCommandBlock";
            array[48] = "Mob";
            array[49] = "Monster";
            array[50] = "Creeper";
            array[51] = "Skeleton";
            array[52] = "Spider";
            array[53] = "Giant";
            array[54] = "Zombie";
            array[55] = "Slime";
            array[56] = "Ghast";
            array[57] = "PigZombie";
            array[58] = "Enderman";
            array[59] = "CaveSpider";
            array[60] = "Silverfish";
            array[61] = "Blaze";
            array[62] = "LavaSlime";
            array[63] = "EnderDragon";
            array[64] = "WitherBoss";
            array[65] = "Bat";
            array[66] = "Witch";
            array[67] = "Endermite";
            array[68] = "Guardian";
            array[69] = "Shulker";
            array[90] = "Pig";
            array[91] = "Sheep";
            array[92] = "Cow";
            array[93] = "Chicken";
            array[94] = "Squid";
            array[95] = "Wolf";
            array[96] = "MushroomCow";
            array[97] = "SnowMan";
            array[98] = "Ozelot";
            array[99] = "VillagerGolem";
            array[100] = "EntityHorse";
            array[101] = "Rabbit";
            array[120] = "Villager";
            array[200] = "EnderCrystal";
        });
    }
}
