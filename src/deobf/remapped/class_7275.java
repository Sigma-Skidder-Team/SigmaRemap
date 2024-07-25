package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import java.util.Optional;

public class class_7275 extends class_7449 {
   public class_7275(Schema var1, boolean var2) {
      super(var1, var2, "Zombie Villager XP rebuild", class_4002.field_19444, "minecraft:zombie_villager");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> {
         Optional var3 = var0.get("Xp").asNumber().result();
         if (var3.isPresent()) {
            return var0;
         } else {
            int var4 = var0.get("VillagerData").get("level").asInt(1);
            return var0.set("Xp", var0.createInt(class_9600.method_44353(var4)));
         }
      });
   }
}
