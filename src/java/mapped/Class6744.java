package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Random;

public class Class6744 extends Class6717 {
   private static final Random field29442 = new Random();

   public Class6744(Schema var1, boolean var2) {
      super(var1, var2, "EntityZombieVillagerTypeFix", TypeReferences.ENTITY, "Zombie");
   }

   public Dynamic<?> method20557(Dynamic<?> var1) {
      if (var1.get("IsVillager").asBoolean(false)) {
         if (!var1.get("ZombieType").result().isPresent()) {
            int var4 = this.method20558(var1.get("VillagerProfession").asInt(-1));
            if (var4 == -1) {
               var4 = this.method20558(field29442.nextInt(6));
            }

            var1 = var1.set("ZombieType", var1.createInt(var4));
         }

         var1 = var1.remove("IsVillager");
      }

      return var1;
   }

   private int method20558(int var1) {
      return var1 >= 0 && var1 < 6 ? var1 : -1;
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20557);
   }
}
