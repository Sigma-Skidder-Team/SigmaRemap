package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class Class8536 extends DataFix {
   private static final String[] field38383 = (String[])DataFixUtils.make(new String[256], var0 -> {
      var0[1] = "Item";
      var0[2] = "XPOrb";
      var0[7] = "ThrownEgg";
      var0[8] = "LeashKnot";
      var0[9] = "Painting";
      var0[10] = "Arrow";
      var0[11] = "Snowball";
      var0[12] = "Fireball";
      var0[13] = "SmallFireball";
      var0[14] = "ThrownEnderpearl";
      var0[15] = "EyeOfEnderSignal";
      var0[16] = "ThrownPotion";
      var0[17] = "ThrownExpBottle";
      var0[18] = "ItemFrame";
      var0[19] = "WitherSkull";
      var0[20] = "PrimedTnt";
      var0[21] = "FallingSand";
      var0[22] = "FireworksRocketEntity";
      var0[23] = "TippedArrow";
      var0[24] = "SpectralArrow";
      var0[25] = "ShulkerBullet";
      var0[26] = "DragonFireball";
      var0[30] = "ArmorStand";
      var0[41] = "Boat";
      var0[42] = "MinecartRideable";
      var0[43] = "MinecartChest";
      var0[44] = "MinecartFurnace";
      var0[45] = "MinecartTNT";
      var0[46] = "MinecartHopper";
      var0[47] = "MinecartSpawner";
      var0[40] = "MinecartCommandBlock";
      var0[48] = "Mob";
      var0[49] = "Monster";
      var0[50] = "Creeper";
      var0[51] = "Skeleton";
      var0[52] = "Spider";
      var0[53] = "Giant";
      var0[54] = "Zombie";
      var0[55] = "Slime";
      var0[56] = "Ghast";
      var0[57] = "PigZombie";
      var0[58] = "Enderman";
      var0[59] = "CaveSpider";
      var0[60] = "Silverfish";
      var0[61] = "Blaze";
      var0[62] = "LavaSlime";
      var0[63] = "EnderDragon";
      var0[64] = "WitherBoss";
      var0[65] = "Bat";
      var0[66] = "Witch";
      var0[67] = "Endermite";
      var0[68] = "Guardian";
      var0[69] = "Shulker";
      var0[90] = "Pig";
      var0[91] = "Sheep";
      var0[92] = "Cow";
      var0[93] = "Chicken";
      var0[94] = "Squid";
      var0[95] = "Wolf";
      var0[96] = "MushroomCow";
      var0[97] = "SnowMan";
      var0[98] = "Ozelot";
      var0[99] = "VillagerGolem";
      var0[100] = "EntityHorse";
      var0[101] = "Rabbit";
      var0[120] = "Villager";
      var0[200] = "EnderCrystal";
   });

   public Class8536(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Schema var3 = this.getInputSchema();
      Type<?> var4 = var3.getType(TypeReferences.field35387);
      OpticFinder<Pair<String, String>> var5 = DSL.fieldFinder("id", DSL.named(TypeReferences.field35393.typeName(), Class3639.method12354()));
      OpticFinder<String> var6 = DSL.fieldFinder("id", DSL.string());
      OpticFinder<?> var7 = var4.findField("tag");
      OpticFinder<?> var8 = var7.type().findField("EntityTag");
      OpticFinder<?> var9 = DSL.typeFinder(var3.getTypeRaw(TypeReferences.ENTITY));
      Type<?> var10 = this.getOutputSchema().getTypeRaw(TypeReferences.ENTITY);
      return this.fixTypeEverywhereTyped(
         "ItemSpawnEggFix",
         var4,
         var6x -> {
            Optional<Pair<String, String>> var9x = var6x.getOptional(var5);
            if (var9x.isPresent() && Objects.equals(((Pair)var9x.get()).getSecond(), "minecraft:spawn_egg")) {
               Dynamic<?> var10x = var6x.get(DSL.remainderFinder());
               short var11 = var10x.get("Damage").asShort((short)0);
               Optional<? extends Typed<?>> var12 = var6x.getOptionalTyped(var7);
               Optional<? extends Typed<? >> var13 = var12.flatMap(var1x -> var1x.getOptionalTyped(var8));
               Optional<? extends Typed<? >> var14 = var13.flatMap(var1x -> var1x.getOptionalTyped(var9));
               Optional<String> var15 = var14.flatMap(var1x -> var1x.getOptional(var6));
               Typed<?> var16 = var6x;
               String var17 = field38383[var11 & 255];
               if (var17 != null && (!var15.isPresent() || !Objects.equals(var15.get(), var17))) {
                  Typed<?>  var18 = var6x.getOrCreateTyped(var7);
                  Typed<?>  var19 = var18.getOrCreateTyped(var8);
                  Typed<?>  var20 = var19.getOrCreateTyped(var9);
                  Dynamic<?> finalVar10x = var10x;
                  Typed<?>  var22 = (var20.write()
                        .flatMap(var3xx -> var10.readTyped(var3xx.set("id", finalVar10x.createString(var17))))
                        .result()
                        .orElseThrow(() -> new IllegalStateException("Could not parse new entity")))
                     .getFirst();
                  var16 = var6x.set(var7, var18.set(var8, var19.set(var9, var22)));
               }

               if (var11 != 0) {
                  var10x = var10x.set("Damage", var10x.createShort((short)0));
                  var16 = var16.set(DSL.remainderFinder(), var10x);
               }

               return var16;
            } else {
               return var6x;
            }
         }
      );
   }
}
