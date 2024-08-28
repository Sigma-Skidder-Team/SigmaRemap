package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import java.util.Optional;

public class Class6725 extends Class6717 {
   public Class6725(Schema var1, boolean var2) {
      super(var1, var2, "Zombie Villager XP rebuild", Class8239.field35391, "minecraft:zombie_villager");
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> {
         Optional var3 = var0.get("Xp").asNumber().result();
         if (var3.isPresent()) {
            return var0;
         } else {
            int var4 = var0.get("VillagerData").get("level").asInt(1);
            return var0.set("Xp", var0.createInt(Class9760.method38367(var4)));
         }
      });
   }
}
