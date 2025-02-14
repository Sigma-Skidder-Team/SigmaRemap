package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

public class Class6742 extends Class6717 {
   public Class6742(Schema var1, String var2) {
      super(var1, false, "Villager profession data fix (" + var2 + ")", TypeReferences.ENTITY, var2);
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      Dynamic var4 = (Dynamic)var1.get(DSL.remainderFinder());
      return var1.set(
         DSL.remainderFinder(),
         var4.remove("Profession")
            .remove("Career")
            .remove("CareerLevel")
            .set(
               "VillagerData",
               var4.createMap(
                  ImmutableMap.of(
                     var4.createString("type"),
                     var4.createString("minecraft:plains"),
                     var4.createString("profession"),
                     var4.createString(method20555(var4.get("Profession").asInt(0), var4.get("Career").asInt(0))),
                     var4.createString("level"),
                     DataFixUtils.orElse(var4.get("CareerLevel").result(), var4.createInt(1))
                  )
               )
            )
      );
   }

   private static String method20555(int var0, int var1) {
      if (var0 != 0) {
         if (var0 != 1) {
            if (var0 != 2) {
               if (var0 != 3) {
                  if (var0 != 4) {
                     return var0 != 5 ? "minecraft:none" : "minecraft:nitwit";
                  } else {
                     return var1 != 2 ? "minecraft:butcher" : "minecraft:leatherworker";
                  }
               } else if (var1 != 2) {
                  return var1 != 3 ? "minecraft:armorer" : "minecraft:toolsmith";
               } else {
                  return "minecraft:weaponsmith";
               }
            } else {
               return "minecraft:cleric";
            }
         } else {
            return var1 != 2 ? "minecraft:librarian" : "minecraft:cartographer";
         }
      } else if (var1 != 2) {
         if (var1 != 3) {
            return var1 != 4 ? "minecraft:farmer" : "minecraft:fletcher";
         } else {
            return "minecraft:shepherd";
         }
      } else {
         return "minecraft:fisherman";
      }
   }
}
