package mapped;

import java.util.HashMap;

public class Class7250 extends Class7249 {
   public HashMap<Entity, Boolean> field31124 = new HashMap<Entity, Boolean>();

   public Class7250() {
      super("Hypixel", "Detects bots on Hypixel based on entity names", Class2124.field13865);
   }

   @Override
   public boolean method22751(Entity var1) {
      if (var1 != null) {
         String var4 = var1.getDisplayName().getString();
         String var5 = var1.method3380() != null ? var1.method3380().getString() : null;
         String var6 = var1.getName().getString();
         if (var1.method3342() && !var4.startsWith("§c") && var4.endsWith("§r") && (var5 == null || var5.equals(var6))) {
            double var7 = Math.abs(var1.getPosX() - field31119.player.getPosX());
            double var9 = Math.abs(var1.getPosY() - field31119.player.getPosY());
            double var11 = Math.abs(var1.getPosZ() - field31119.player.getPosZ());
            double var13 = Math.sqrt(var7 * var7 + var11 * var11);
            if (var9 < 13.0 && var9 > 10.0 && var13 < 3.0) {
               return true;
            }
         }

         if (!var4.startsWith("§") && var4.endsWith("§r")) {
            return true;
         } else if (var1.method3342() && var6.equals(var4) && var5.equals(var6 + "§r")) {
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
   public boolean method22758(Entity var1) {
      return true;
   }
}
