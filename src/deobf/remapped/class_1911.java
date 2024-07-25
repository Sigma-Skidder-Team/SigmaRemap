package remapped;

import java.util.HashMap;

public class class_1911 extends class_5676 {
   public HashMap<Entity, Boolean> field_9734 = new HashMap<Entity, Boolean>();

   public class_1911() {
      super("Hypixel", "Detects bots on Hypixel based on entity names", class_2608.field_12887);
   }

   @Override
   public boolean method_7183(Entity var1) {
      if (var1 != null) {
         String var4 = var1.method_19839().getString();
         String var5 = var1.method_45508() != null ? var1.method_45508().getString() : null;
         String var6 = var1.method_45509().getString();
         if (var1.method_37109() && !var4.startsWith("§c") && var4.endsWith("§r") && (var5 == null || var5.equals(var6))) {
            double var7 = Math.abs(var1.method_37302() - field_28769.field_9632.method_37302());
            double var9 = Math.abs(var1.method_37309() - field_28769.field_9632.method_37309());
            double var11 = Math.abs(var1.method_37156() - field_28769.field_9632.method_37156());
            double var13 = Math.sqrt(var7 * var7 + var11 * var11);
            if (var9 < 13.0 && var9 > 10.0 && var13 < 3.0) {
               return true;
            }
         }

         if (!var4.startsWith("§") && var4.endsWith("§r")) {
            return true;
         } else if (var1.method_37109() && var6.equals(var4) && var5.equals(var6 + "§r")) {
            return true;
         } else if (var5 != null && !var5.equalsIgnoreCase("") && var4.toLowerCase().contains("§c") && var4.toLowerCase().contains("§r")) {
            return true;
         } else {
            return !var4.contains("§8[NPC]") ? !var4.contains("§c") && var5 != null && !var5.equalsIgnoreCase("") : true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_7182(Entity var1) {
      return true;
   }
}