package mapped;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Optional;
import java.util.Set;

public class Class8813 extends DataFix {
   private static final Set<String> field39650 = Sets.newHashSet(
      new String[]{
         "ArmorStand",
         "Bat",
         "Blaze",
         "CaveSpider",
         "Chicken",
         "Cow",
         "Creeper",
         "EnderDragon",
         "Enderman",
         "Endermite",
         "EntityHorse",
         "Ghast",
         "Giant",
         "Guardian",
         "LavaSlime",
         "MushroomCow",
         "Ozelot",
         "Pig",
         "PigZombie",
         "Rabbit",
         "Sheep",
         "Shulker",
         "Silverfish",
         "Skeleton",
         "Slime",
         "SnowMan",
         "Spider",
         "Squid",
         "Villager",
         "VillagerGolem",
         "Witch",
         "WitherBoss",
         "Wolf",
         "Zombie"
      }
   );

   public Class8813(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public Dynamic<?> method31818(Dynamic<?> var1) {
      Optional var4 = var1.get("HealF").asNumber().result();
      Optional var5 = var1.get("Health").asNumber().result();
      float var6;
      if (!var4.isPresent()) {
         if (!var5.isPresent()) {
            return var1;
         }

         var6 = ((Number)var5.get()).floatValue();
      } else {
         var6 = ((Number)var4.get()).floatValue();
         var1 = var1.remove("HealF");
      }

      return var1.set("Health", var1.createFloat(var6));
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "EntityHealthFix", this.getInputSchema().getType(TypeReferences.ENTITY), var1 -> var1.update(DSL.remainderFinder(), this::method31818)
      );
   }
}
