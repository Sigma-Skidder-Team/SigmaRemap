package mapped;

import net.minecraft.client.Minecraft;

public class Class8781 {
   private static String[] field39490;

   public static boolean method31662(PlayerEntity var0) {
      return method31663(Minecraft.getInstance().player) == method31663(var0);
   }

   public static int method31663(PlayerEntity var0) {
      Class8218 var3 = (Class8218)var0.getTeam();
      return var3 != null && var3.getColor().getColor() != null ? var3.getColor().getColor() : 16777215;
   }
}
