package remapped;

import com.mojang.datafixers.schemas.Schema;

public class class_3708 extends class_5134 {
   public class_3708(Schema var1) {
      super(var1, false);
   }

   @Override
   public String method_23547(String var1) {
      return !var1.equals("minecraft:bee_hive") ? var1 : "minecraft:beehive";
   }
}
