package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Random;

public class class_3591 extends class_7449 {
   private static final Random field_17604 = new Random();

   public class_3591(Schema var1, boolean var2) {
      super(var1, var2, "EntityZombieVillagerTypeFix", class_4002.field_19444, "Zombie");
   }

   public Dynamic<?> method_16784(Dynamic<?> var1) {
      if (var1.get("IsVillager").asBoolean(false)) {
         if (!var1.get("ZombieType").result().isPresent()) {
            int var4 = this.method_16785(var1.get("VillagerProfession").asInt(-1));
            if (var4 == -1) {
               var4 = this.method_16785(field_17604.nextInt(6));
            }

            var1 = var1.set("ZombieType", var1.createInt(var4));
         }

         var1 = var1.remove("IsVillager");
      }

      return var1;
   }

   private int method_16785(int var1) {
      return var1 >= 0 && var1 < 6 ? var1 : -1;
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_16784);
   }
}
