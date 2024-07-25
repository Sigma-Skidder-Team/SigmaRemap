package remapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class_4858 extends class_1751 {
   public class_4858(Schema var1, boolean var2) {
      super("EntityZombieSplitFix", var1, var2);
   }

   @Override
   public Pair<String, Dynamic<?>> method_7809(String var1, Dynamic<?> var2) {
      if (Objects.equals("Zombie", var1)) {
         String var5 = "Zombie";
         int var6 = var2.get("ZombieType").asInt(0);
         switch (var6) {
            case 0:
            default:
               break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
               var5 = "ZombieVillager";
               var2 = var2.set("Profession", var2.createInt(var6 - 1));
               break;
            case 6:
               var5 = "Husk";
         }

         var2 = var2.remove("ZombieType");
         return Pair.of(var5, var2);
      } else {
         return Pair.of(var1, var2);
      }
   }
}
