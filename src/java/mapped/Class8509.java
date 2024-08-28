package mapped;

public class Class8509 {
   private static String[] field37207;

   public static int method30144(World var0) {
      return var0 != null ? method30145(var0.method6813()) : 0;
   }

   public static int method30145(Class8705<World> var0) {
      if (var0 != World.field9000) {
         if (var0 != World.field8999) {
            return var0 != World.THE_END ? 0 : 1;
         } else {
            return 0;
         }
      } else {
         return -1;
      }
   }

   public static boolean method30146(World var0) {
      return var0.method6813() == World.field9000;
   }

   public static boolean method30147(World var0) {
      Class8705 var3 = var0.method6813();
      return method30145(var3) == 0;
   }

   public static boolean method30148(World var0) {
      return var0.method6813() == World.THE_END;
   }
}
