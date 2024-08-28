package mapped;

public class Class8781 {
   private static String[] field39490;

   public static boolean method31662(PlayerEntity var0) {
      return method31663(Minecraft.getInstance().player) == method31663(var0);
   }

   public static int method31663(PlayerEntity var0) {
      Class8218 var3 = (Class8218)var0.method3344();
      return var3 != null && var3.method28591().getColor() != null ? var3.method28591().getColor() : 16777215;
   }
}
