package remapped;

public class class_7194 {
   private static String[] field_36987;
   public static MinecraftClient field_36996 = MinecraftClient.getInstance();
   private static final int field_36990 = 1 + MathHelper.log2(MathHelper.smallestEncompassingPowerOfTwo(30000000));
   private static final int field_36988 = field_36990;
   private static final int field_36991 = 64 - field_36990 - field_36988;
   private static final int field_36983 = 0 + field_36988;
   private static final int field_36986 = field_36983 + field_36991;
   private static final long field_36995 = (1L << field_36990) - 1L;
   private static final long field_36993 = (1L << field_36991) - 1L;
   private static final long field_36994 = (1L << field_36988) - 1L;
   public static double field_36984;
   public static double field_36992;
   public static double field_36985;
   public static float field_36989;

   public static long method_32944(BlockPos var0) {
      return ((long)var0.getX() & field_36995) << field_36986
         | ((long)var0.getY() & field_36993) << field_36983
         | ((long)var0.getZ() & field_36994) << 0;
   }

   public static void method_32939(float var0, float var1, float var2, float var3) {
      float var6 = var0 * var0 + var1 * var1 + var2 * var2;
      if (var6 >= 1.0E-4F) {
         var6 = MathHelper.sqrt(var6);
         if (var6 < 1.0F) {
            var6 = 1.0F;
         }

         var6 = var3 / var6;
         var0 *= var6;
         var1 *= var6;
         var2 *= var6;
         float var7 = MathHelper.sin(field_36996.thePlayer.rotationYaw * (float) (Math.PI / 180.0));
         float var8 = MathHelper.cos(field_36996.thePlayer.rotationYaw * (float) (Math.PI / 180.0));
         field_36984 += (double)(var0 * var8 - var2 * var7);
         field_36992 += (double)var1;
         field_36985 += (double)(var2 * var8 + var0 * var7);
      }
   }

   public static void method_32938(float var0, float var1, float var2) {
      if ((field_36996.thePlayer.method_26530() || field_36996.thePlayer.canPassengerSteer()) && field_36996.thePlayer.method_37285()) {
         double var5 = field_36996.thePlayer.method_37309();
         float var7 = method_32937();
         float var8 = 0.02F;
         float var9 = (float)class_2931.method_13417(field_36996.thePlayer);
         if (var9 > 3.0F) {
            var9 = 3.0F;
         }

         if (!field_36996.thePlayer.onGround) {
            var9 *= 0.5F;
         }

         if (var9 > 0.0F) {
            var7 += (0.54600006F - var7) * var9 / 3.0F;
            var8 += (field_36996.thePlayer.method_26423() - var8) * var9 / 3.0F;
         }

         method_32939(var0, var1, var2, var8);
         method_32942(field_36984, field_36992, field_36985);
         field_36984 *= (double)var7;
         field_36992 *= 0.8F;
         field_36985 *= (double)var7;
         if (!field_36996.thePlayer.method_37078()) {
            field_36992 -= 0.02;
         }

         if (field_36996.thePlayer.collidedHorizontally
            && field_36996.thePlayer.method_37159(field_36984, field_36992 + 0.6F - field_36996.thePlayer.method_37309() + var5, field_36985)) {
            field_36992 = 0.3F;
         }
      }
   }

   public static boolean method_32945(Box var0, class_5371 var1) {
      int var4 = MathHelper.floor(var0.field_19941);
      int var5 = MathHelper.ceil(var0.field_19940);
      int var6 = MathHelper.floor(var0.field_19937);
      int var7 = MathHelper.ceil(var0.field_19939);
      int var8 = MathHelper.floor(var0.field_19938);
      int var9 = MathHelper.ceil(var0.field_19942);
      if (!field_36996.theWorld.method_22569(var4, var6, var8, var5, var7, var9)) {
         return false;
      } else {
         for (int var10 = var4; var10 < var5; var10++) {
            for (int var11 = var6; var11 < var7; var11++) {
               for (int var12 = var8; var12 < var9; var12++) {
                  class_2522 var13 = field_36996.theWorld.method_28262(new BlockPos(var10, var11, var12));
                  class_6414 var14 = var13.method_8360();
                  if (var13.method_8362() == var1) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   public static void method_32942(double var0, double var2, double var4) {
   }

   public static void method_32941() {
      field_36992 += 0.04F;
   }

   public static float method_32937() {
      return 0.8F;
   }

   public static boolean method_32943() {
      return method_32945(field_36996.thePlayer.getBoundingBox().method_18928(0.0, -0.4F, 0.0).method_18900(0.001, 0.001, 0.001), class_5371.field_27439);
   }
}
