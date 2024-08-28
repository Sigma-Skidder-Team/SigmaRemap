package mapped;

public class Class8496 {
   private static String[] field37166;
   private static boolean field37167 = true;
   private static Minecraft field37168 = Minecraft.getInstance();

   public static boolean method30082(boolean var0) {
      boolean var3 = field37167;
      field37167 = var0;
      return var3;
   }

   public static boolean method30083() {
      return field37167;
   }

   public static void method30084() {
      if (field37167) {
         Class7911 var2 = field37168.method1581();
         var2.method26536().method25598();
         var2.method26537().method25598();
      }
   }
}
