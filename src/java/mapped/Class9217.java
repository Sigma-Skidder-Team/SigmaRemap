package mapped;

import com.google.common.collect.ImmutableList;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class9217 {
   private static String[] field42413;
   private static final Minecraft field42414 = Minecraft.getInstance();

   public static boolean method34535(PlayerEntity var0, BlockPos var1) {
      return method34550(var0, var1) < method34560();
   }

   public static final Block method34536(BlockPos var0) {
      return field42414.world.method6738(var0).method23383();
   }

   public static final Block method34537(double var0, double var2, double var4) {
      return method34536(new BlockPos(var0, var2, var4));
   }

   public static boolean method34538(Block var0, BlockPos var1) {
      Class6408 var4 = var0.method11579().method23414(field42414.world, var1);
      return !method34578(var1)
         && field42414.world.method7048(field42414.player, var4)
         && var1.getY() <= field42414.player.method3432().getY();
   }

   public static void method34539(BlockPos var0) {
      double var3 = (double)var0.method8304() + 0.5 - Minecraft.getInstance().player.getPosX();
      double var5 = (double)var0.getY() + 0.5 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.method3393());
      double var7 = (double)var0.method8306() + 0.5 - Minecraft.getInstance().player.getPosZ();
      double var9 = (double) MathHelper.method37766(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      Minecraft.getInstance().player.field5031 = Minecraft.getInstance().player.field5031
         + MathHelper.method37792(var11 - Minecraft.getInstance().player.field5031);
      Minecraft.getInstance().player.field5032 = Minecraft.getInstance().player.field5032
         + MathHelper.method37792(var12 - Minecraft.getInstance().player.field5032);
   }

   public static void method34540(BlockPos var0) {
      double var3 = (double)var0.method8304() + 0.5 - Minecraft.getInstance().player.getPosX();
      double var5 = (double)var0.getY() + 0.5 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.method3393());
      double var7 = (double)var0.method8306() + 0.5 - Minecraft.getInstance().player.getPosZ();
      double var9 = (double) MathHelper.method37766(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      Minecraft.getInstance()
         .getClientPlayNetHandler()
         .sendPacket(
            new Class5606(
               Minecraft.getInstance().player.field5031 + MathHelper.method37792(var11 - Minecraft.getInstance().player.field5031),
               Minecraft.getInstance().player.field5032 + MathHelper.method37792(var12 - Minecraft.getInstance().player.field5032),
               Minecraft.getInstance().player.field5036
            )
         );
   }

   public static float[] method34541(BlockPos var0) {
      double var3 = (double)var0.method8304() + 0.5 - Minecraft.getInstance().player.getPosX();
      double var5 = (double)var0.getY() - 0.25 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.method3393());
      double var7 = (double)var0.method8306() + 0.5 - Minecraft.getInstance().player.getPosZ();
      double var9 = (double) MathHelper.method37766(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      return new float[]{
         Minecraft.getInstance().player.field5031 + MathHelper.method37792(var11 - Minecraft.getInstance().player.field5031),
         Minecraft.getInstance().player.field5032 + MathHelper.method37792(var12 - Minecraft.getInstance().player.field5032)
      };
   }

   public static float[] method34542(BlockPos var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      switch (Class4438.field21590[var1.ordinal()]) {
         case 1:
            var4 += 0.49F;
            break;
         case 2:
            var5 -= 0.49F;
            break;
         case 3:
            var5 += 0.49F;
            break;
         case 4:
            var4 -= 0.49F;
            break;
         case 5:
            var6 += 0.0F;
         case 6:
            var6++;
      }

      double var7 = (double)var0.method8304() + 0.5 - Minecraft.getInstance().player.getPosX() + (double)var4;
      double var9 = (double)var0.getY()
         - 0.02
         - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.method3393())
         + (double)var6;
      double var11 = (double)var0.method8306() + 0.5 - Minecraft.getInstance().player.getPosZ() + (double)var5;
      double var13 = (double) MathHelper.method37766(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0 / Math.PI) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return new float[]{
         Minecraft.getInstance().player.field5031 + MathHelper.method37792(var15 - Minecraft.getInstance().player.field5031),
         Minecraft.getInstance().player.field5032 + MathHelper.method37792(var16 - Minecraft.getInstance().player.field5032)
      };
   }

   public static float[] method34543(BlockPos var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = (float)(0.4F + Math.random() * 0.1F);
      switch (Class4438.field21590[var1.ordinal()]) {
         case 1:
            var4 += 0.49F;
            break;
         case 2:
            var5 -= 0.49F;
            break;
         case 3:
            var5 += 0.49F;
            break;
         case 4:
            var4 -= 0.49F;
            break;
         case 5:
            var6 = 0.0F;
            var4 = 0.26F - (float)(Math.random() * 0.2F);
            var5 = 0.26F - (float)(Math.random() * 0.2F);
         case 6:
            var6 = 1.0F;
            var4 = 0.26F - (float)(Math.random() * 0.2F);
            var5 = 0.26F - (float)(Math.random() * 0.2F);
      }

      if (var4 == 0.0F) {
         var4 = (float)(0.1F - Math.sin((double)(System.currentTimeMillis() - 500L) / 1200.0) * 0.2);
      }

      if (var5 == 0.0F) {
         var5 = (float)(0.1F - Math.sin((double)(System.currentTimeMillis() - 500L) / 1000.0) * 0.2);
      }

      if (var6 == 0.0F) {
         var6 = (float)(0.6F - Math.sin((double)(System.currentTimeMillis() - 500L) / 1600.0) * 0.2);
      }

      double var7 = (double)var0.method8304() + 0.5 - Minecraft.getInstance().player.getPosX() + (double)var4;
      double var9 = (double)var0.getY()
         - 0.02
         - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.method3393())
         + (double)var6;
      double var11 = (double)var0.method8306() + 0.5 - Minecraft.getInstance().player.getPosZ() + (double)var5;
      double var13 = (double) MathHelper.method37766(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0 / Math.PI) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return new float[]{
         Minecraft.getInstance().player.field5031 + MathHelper.method37792(var15 - Minecraft.getInstance().player.field5031),
         Minecraft.getInstance().player.field5032 + MathHelper.method37792(var16 - Minecraft.getInstance().player.field5032)
      };
   }

   public static float method34544(BlockPos var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      switch (Class4438.field21590[var1.ordinal()]) {
         case 1:
            var4 += 0.49F;
            break;
         case 2:
            var5 -= 0.49F;
            break;
         case 3:
            var5 += 0.49F;
            break;
         case 4:
            var4 -= 0.49F;
      }

      double var6 = (double)var0.method8304() + 0.5 - Minecraft.getInstance().player.getPosX() + (double)var4;
      double var8 = (double)var0.method8306() + 0.5 - Minecraft.getInstance().player.getPosZ() + (double)var5;
      double var10 = (double)var0.getY()
         - 0.02
         - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.method3393())
         + 1.0;
      double var12 = (double)var0.getY() - 0.02 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.method3393());
      double var14 = (double) MathHelper.method37766(var6 * var6 + var8 * var8);
      float var16 = (float)(-(Math.atan2(var10, var14) * 180.0 / Math.PI));
      float var17 = (float)(-(Math.atan2(var12, var14) * 180.0 / Math.PI));
      return var17 - var16;
   }

   public static List<BlockPos> method34545(List<BlockPos> var0) {
      var0.sort((var0x, var1) -> {
         float var4 = method34550(field42414.player, var0x);
         float var5 = method34550(field42414.player, var1);
         if (!(var4 > var5)) {
            return var4 != var5 ? -1 : 0;
         } else {
            return 1;
         }
      });
      return var0;
   }

   public static List<BlockPos> method34546(List<BlockPos> var0, Vector3d var1) {
      var0.sort((var1x, var2) -> {
         float var5 = method34551(var1, var1x);
         float var6 = method34551(var1, var2);
         if (!(var5 > var6)) {
            return var5 != var6 ? -1 : 0;
         } else {
            return 1;
         }
      });
      return var0;
   }

   public static List<BlockPos> method34547(List<BlockPos> var0, Vector3d var1, boolean var2) {
      if (!var2) {
         method34546(var0, var1);
      } else {
         var0.sort((var1x, var2x) -> !(method34552(var1, var1x) >= method34552(var1, var2x)) ? -1 : 1);
      }

      return var0;
   }

   public static List<Entity> method34548(List<Entity> var0) {
      Collections.sort(var0, new Class3576());
      return var0;
   }

   public static List<PlayerEntity> method34549(List<PlayerEntity> var0) {
      Collections.sort(var0, new Class3583());
      return var0;
   }

   public static float method34550(Entity var0, BlockPos var1) {
      return method34553(var0, (double)var1.method8304(), (double)var1.getY(), (double)var1.method8306());
   }

   public static float method34551(Vector3d var0, BlockPos var1) {
      return method34554(var0, (double)var1.method8304(), (double)var1.getY(), (double)var1.method8306());
   }

   public static float method34552(Vector3d var0, BlockPos var1) {
      return method34555(var0, (double)var1.method8304(), (double)var1.method8306());
   }

   public static float method34553(Entity var0, double var1, double var3, double var5) {
      float var9 = (float)(var0.getPosX() - var1);
      float var10 = (float)(var0.getPosY() - var3);
      float var11 = (float)(var0.getPosZ() - var5);
      return method34558(var9, var10, var11);
   }

   public static float method34554(Vector3d var0, double var1, double var3, double var5) {
      float var9 = (float)(var0.method11320() - var1);
      float var10 = (float)(var0.method11321() - var3);
      float var11 = (float)(var0.method11322() - var5);
      return method34558(var9, var10, var11);
   }

   public static float method34555(Vector3d var0, double var1, double var3) {
      float var7 = (float)(var0.method11320() - var1);
      float var8 = (float)(var0.method11322() - var3);
      return method34557(var7, var8);
   }

   public static float method34556(double var0, double var2, double var4, double var6, double var8, double var10) {
      float var14 = (float)(var0 - var6);
      float var15 = (float)(var2 - var8);
      float var16 = (float)(var4 - var10);
      return method34558(var14, var15, var16);
   }

   private static float method34557(float var0, float var1) {
      return MathHelper.method37765((var0 - 0.5F) * (var0 - 0.5F) + (var1 - 0.5F) * (var1 - 0.5F));
   }

   private static float method34558(float var0, float var1, float var2) {
      return MathHelper.method37765((var0 - 0.5F) * (var0 - 0.5F) + (var1 - 0.5F) * (var1 - 0.5F) + (var2 - 0.5F) * (var2 - 0.5F));
   }

   public static Block method34559(PlayerEntity var0) {
      return method34536(var0.method3432().method8313());
   }

   public static float method34560() {
      return field42414.field1337.method23135();
   }

   public static List<BlockPos> method34561(float var0) {
      ArrayList var3 = new ArrayList();

      for (float var4 = -var0; var4 <= var0; var4++) {
         for (float var5 = -var0; var5 <= var0; var5++) {
            for (float var6 = -var0; var6 <= var0; var6++) {
               BlockPos var7 = new BlockPos(
                  field42414.player.getPosX() + (double)var5,
                  field42414.player.getPosY() + (double)var4,
                  field42414.player.getPosZ() + (double)var6
               );
               var3.add(var7);
            }
         }
      }

      return var3;
   }

   public static List<BlockPos> method34562(double var0, double var2, double var4) {
      ArrayList var8 = new ArrayList();

      for (float var9 = -method34560(); var9 <= method34560(); var9++) {
         for (float var10 = -method34560(); var10 <= method34560(); var10++) {
            for (float var11 = -method34560(); var11 <= method34560(); var11++) {
               BlockPos var12 = new BlockPos(var0 + (double)var10, var2 + (double)var9, var4 + (double)var11);
               var8.add(var12);
            }
         }
      }

      return var8;
   }

   public static List<BlockPos> method34563() {
      ArrayList var2 = new ArrayList();
      byte var3 = 90;
      byte var4 = 10;

      for (float var5 = (float)(-var3); var5 <= (float)var3; var5++) {
         for (float var6 = (float)(-var4); var6 <= (float)var4; var6++) {
            for (float var7 = (float)(-var4); var7 <= (float)var4; var7++) {
               BlockPos var8 = new BlockPos(
                  field42414.player.getPosX() + (double)var6,
                  field42414.player.getPosY() + (double)var5,
                  field42414.player.getPosZ() + (double)var7
               );
               if (field42414.world.method6738(var8).method23383() instanceof Class3420) {
                  var2.add(var8);
               }
            }
         }
      }

      return var2;
   }

   public static BlockPos method34564(float var0, float var1, float var2) {
      Class8711 var5 = method34567(var0, var1, var2);
      return var5 != null ? var5.method31423() : null;
   }

   public static float[] method34565() {
      Class8711 var2 = method34566(Class9567.method37086() - 270.0F);
      if (var2.method31417() != Class2100.field13689) {
         double var3 = var2.method31419().field18048 - (double)var2.method31423().method8304();
         double var5 = var2.method31419().field18050 - (double)var2.method31423().method8306();
         double var7 = var2.method31419().field18049 - (double)var2.method31423().getY();
         double var9 = (double)var2.method31423().method8304() - Minecraft.getInstance().player.getPosX() + var3;
         double var11 = (double)var2.method31423().getY()
            - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.method3393())
            + var7;
         double var13 = (double)var2.method31423().method8306() - Minecraft.getInstance().player.getPosZ() + var5;
         double var15 = (double) MathHelper.method37766(var9 * var9 + var13 * var13);
         float var17 = (float)(Math.atan2(var13, var9) * 180.0 / Math.PI) - 90.0F;
         float var18 = (float)(-(Math.atan2(var11, var15) * 180.0 / Math.PI));
         return new float[]{
            Minecraft.getInstance().player.field5031 + MathHelper.method37792(var17 - Minecraft.getInstance().player.field5031),
            Minecraft.getInstance().player.field5032 + MathHelper.method37792(var18 - Minecraft.getInstance().player.field5032)
         };
      } else {
         return null;
      }
   }

   public static Class8711 method34566(float var0) {
      Vector3d var3 = new Vector3d(field42414.player.field6119, field42414.player.field6120 - 0.8F, field42414.player.field6121);
      var0 = (float)Math.toRadians((double)var0);
      float var4 = 0.0F;
      float var5 = -MathHelper.method37763(var0) * MathHelper.method37764(var4);
      float var6 = MathHelper.method37764(var0) * MathHelper.method37764(var4);
      float var7 = 2.3F;
      Vector3d var8 = new Vector3d(
         field42414.player.field6119 + (double)(var5 * var7),
         field42414.player.field6120 - 0.8F - (double)(!field42414.player.field4981 ? 0.0F : 0.6F),
         field42414.player.field6121 + (double)(var6 * var7)
      );
      Entity var9 = field42414.method1550();
      return field42414.world.method7036(new Class6809(var3, var8, Class2271.field14775, Class1985.field12962, var9));
   }

   public static Class8711 method34567(float var0, float var1, float var2) {
      Vector3d var5 = new Vector3d(
         field42414.player.field6119, field42414.player.field6120 + (double)field42414.player.method3393(), field42414.player.field6121
      );
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var6 = -MathHelper.method37763(var0) * MathHelper.method37764(var1);
      float var7 = -MathHelper.method37763(var1);
      float var8 = MathHelper.method37764(var0) * MathHelper.method37764(var1);
      if (var2 == 0.0F) {
         var2 = field42414.field1337.method23135();
      }

      Vector3d var9 = new Vector3d(
         field42414.player.field6119 + (double)(var6 * var2),
         field42414.player.field6120 + (double)(var7 * var2) + (double)field42414.player.method3393(),
         field42414.player.field6121 + (double)(var8 * var2)
      );
      Entity var10 = field42414.method1550();
      return field42414.world.method7036(new Class6809(var5, var9, Class2271.field14775, Class1985.field12962, var10));
   }

   public static Class8711 method34568(float var0, float var1, float var2, Class4399 var3) {
      Vector3d var6 = new Vector3d(var3.method13909(), (double)field42414.player.method3393() + var3.method13911(), var3.method13913());
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var7 = -MathHelper.method37763(var0) * MathHelper.method37764(var1);
      float var8 = -MathHelper.method37763(var1);
      float var9 = MathHelper.method37764(var0) * MathHelper.method37764(var1);
      if (var2 == 0.0F) {
         var2 = field42414.field1337.method23135();
      }

      Vector3d var10 = new Vector3d(
         field42414.player.field6119 + (double)(var7 * var2),
         field42414.player.field6120 + (double)(var8 * var2) + (double)field42414.player.method3393(),
         field42414.player.field6121 + (double)(var9 * var2)
      );
      Entity var11 = field42414.method1550();
      return field42414.world.method7036(new Class6809(var6, var10, Class2271.field14775, Class1985.field12962, var11));
   }

   public static Class8710 method34569(float var0, float var1, float var2, float var3) {
      double var6 = Math.cos((double)Class9567.method37086() * Math.PI / 180.0) * (double)var3;
      double var8 = Math.sin((double)Class9567.method37086() * Math.PI / 180.0) * (double)var3;
      Vector3d var10 = new Vector3d(
         field42414.player.getPosX() + var6,
         field42414.player.getPosY() + (double)field42414.player.method3393(),
         field42414.player.getPosZ() + var8
      );
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var11 = -MathHelper.method37763(var0) * MathHelper.method37764(var1);
      float var12 = -MathHelper.method37763(var1);
      float var13 = MathHelper.method37764(var0) * MathHelper.method37764(var1);
      if (var2 == 0.0F) {
         var2 = field42414.field1337.method23135();
      }

      Vector3d var14 = new Vector3d(
         field42414.player.field6119 + (double)(var11 * var2),
         field42414.player.field6120 + (double)(var12 * var2) + (double)field42414.player.method3393(),
         field42414.player.field6121 + (double)(var13 * var2)
      );
      Entity var15 = field42414.method1550();
      return field42414.world.method7036(new Class6809(var10, var14, Class2271.field14775, Class1985.field12962, var15));
   }

   public static Class8710 method34570(BlockPos var0) {
      Vector3d var3 = new Vector3d(
         field42414.player.getPosX(), field42414.player.getPosY() + (double)field42414.player.method3393(), field42414.player.getPosZ()
      );
      Vector3d var4 = new Vector3d(
         (double)var0.method8304() + 0.5 + RandomUtils.nextDouble(0.01, 0.04),
         (double)var0.getY(),
         (double)var0.method8306() + 0.5 + RandomUtils.nextDouble(0.01, 0.04)
      );
      return field42414.world.method7036(new Class6809(var3, var4, Class2271.field14775, Class1985.field12962, field42414.method1550()));
   }

   private boolean method34571(Class9238 var1, float var2, float var3) {
      Vector3d var6 = new Vector3d(
         field42414.player.getPosX(), field42414.player.getPosY() + (double)field42414.player.method3393(), field42414.player.getPosZ()
      );
      var2 = (float)Math.toRadians((double)var2);
      var3 = (float)Math.toRadians((double)var3);
      float var7 = -MathHelper.method37763(var2) * MathHelper.method37764(var3);
      float var8 = -MathHelper.method37763(var3);
      float var9 = MathHelper.method37764(var2) * MathHelper.method37764(var3);
      float var10 = field42414.field1337.method23135();
      Vector3d var11 = new Vector3d(
         field42414.player.getPosX() + (double)(var7 * var10),
         field42414.player.getPosY() + (double)(var8 * var10) + (double)field42414.player.method3393(),
         field42414.player.getPosZ() + (double)(var9 * var10)
      );
      Entity var12 = field42414.method1550();
      Class8711 var13 = field42414.world.method7036(new Class6809(var6, var11, Class2271.field14775, Class1985.field12964, var12));
      return var13 == null ? false : var13.method31423().equals(var1.field42516) && var13.method31424() == var1.field42517;
   }

   public static Vector3d method34572(Direction var0, BlockPos var1) {
      float var4 = (float)Math.max(0, var0.method539());
      float var5 = (float)Math.max(0, var0.method541());
      float var6 = (float)var1.method8304() + var4 + (var0.method539() != 0 ? 0.0F : (float)Math.random());
      float var7 = (float)var1.getY() + (var0.method540() != 0 ? 0.0F : (var0.method540() != 1 ? (float)Math.random() : 1.0F));
      float var8 = (float)var1.method8306() + var5 + (var0.method541() != 0 ? 0.0F : (float)Math.random());
      return new Vector3d((double)var6, (double)var7, (double)var8);
   }

   public static int method34573(Class7380 var0) {
      Block var3 = var0.method23383();
      Class9348 var4 = var3.method11577();
      ImmutableList var5 = var4.method35392();
      return var5.indexOf(var0);
   }

   public static int method34574(Block var0) {
      return Class2348.field16072.method9171(var0);
   }

   public static Class7843 method34575(BlockPos var0, boolean var1) {
      Class1998[] var4 = new Class1998[]{
         new Class1998(0, 0, 0), new Class1998(-1, 0, 0), new Class1998(1, 0, 0), new Class1998(0, 0, 1), new Class1998(0, 0, -1)
      };
      Class7306[] var5 = new Class7306[]{
         new Class7306(1, 1, 1, false),
         new Class7306(2, 1, 2, false),
         new Class7306(3, 1, 3, false),
         new Class7306(4, 1, 4, false),
         new Class7306(0, -1, 0, true)
      };

      for (Class7306 var9 : var5) {
         for (Class1998 var13 : var4) {
            Class1998 var14 = !var9.field31325
               ? new Class1998(var13.method8304() * var9.field31322, var13.getY() * var9.field31323, var13.method8306() * var9.field31324)
               : new Class1998(var13.method8304() + var9.field31322, var13.getY() + var9.field31323, var13.method8306() + var9.field31324);

            for (Direction var18 : Direction.values()) {
               if ((var18 != Direction.field672 || !var1) && method34578(var0.method8337(var14).method8350(var18, -1))) {
                  return new Class7843(var0.method8337(var14).method8350(var18, -1), var18);
               }
            }
         }
      }

      return null;
   }

   public static List<BlockPos> method34576(BlockPos var0) {
      ArrayList var3 = new ArrayList();
      float var4 = method34560() - 3.0F;

      for (float var5 = -var4; var5 < 1.0F; var5++) {
         for (float var6 = -var4; var6 <= var4; var6++) {
            for (float var7 = -var4; var7 <= var4; var7++) {
               BlockPos var8 = var0.method8335((double)var6, (double)var5, (double)var7);
               if (field42414.player.getPosY() >= (double)var8.getY()) {
                  var3.add(var8);
               }
            }
         }
      }

      return var3;
   }

   public static Class7843 method34577(BlockPos var0, boolean var1, boolean var2) {
      float var5 = method34560();

      for (BlockPos var8 : method34547(
         method34576(var0), new Vector3d(field42414.player.getPosX(), field42414.player.getPosY(), field42414.player.getPosZ()), var2
      )) {
         for (Direction var12 : Direction.values()) {
            if ((var12 != Direction.field672 || !var1) && !method34578(var8) && method34578(var8.method8350(var12, -1))) {
               return new Class7843(var8.method8350(var12, -1), var12);
            }
         }
      }

      return null;
   }

   public static boolean method34578(BlockPos var0) {
      if (var0 != null) {
         Block var3 = field42414.world.method6738(var0).method23383();
         return !var3.method11579().method23410() && var3.method11579().method23384().method31089()
            ? false
            : !(var3 instanceof Class3410) || method34573(field42414.world.method6738(var0)) != 0;
      } else {
         return false;
      }
   }

   public static float[] method34579(float var0, float var1, Class7843 var2) {
      Class8711 var5 = method34567(var0, var1, field42414.field1337.method23135());
      if (var5 != null && var5.method31423().equals(var2.field33646)) {
         return new float[]{var0, var1};
      } else {
         float var6 = method34541(var2.field33646)[0];
         Vector3d var7 = new Vector3d(
            (double)var2.field33646.method8304() + 0.5, (double)var2.field33646.getY() + 0.5, (double)var2.field33646.method8306() + 0.5
         );
         float var8 = (var6 + 90.0F) * (float) (Math.PI / 180.0);
         double var9 = (double)(-MathHelper.method37763(var8)) / 2.1;
         double var11 = (double) MathHelper.method37764(var8) / 2.1;
         var7 = var7.method11339(var9, 0.0, var11);
         float[] var13 = Class9142.method34144(var7.field18048, var7.field18050, var7.field18049);
         float var14 = var13[0];
         float var15 = var13[1];
         var8 = (var6 - 90.0F) * (float) (Math.PI / 180.0);
         var9 = (double)(-MathHelper.method37763(var8)) / 2.1;
         var11 = (double) MathHelper.method37764(var8) / 2.1;
         var7 = new Vector3d(
            (double)var2.field33646.method8304() + 0.5, (double)var2.field33646.getY() + 0.5, (double)var2.field33646.method8306() + 0.5
         );
         var7 = var7.method11339(var9, 0.0, var11);
         float[] var16 = Class9142.method34144(var7.field18048, var7.field18050, var7.field18049);
         float var17 = var16[0];
         float var18 = var16[1];
         float var19 = Math.abs(Class9142.method34142(MathHelper.method37792(var0), MathHelper.method37792(var14)));
         float var20 = Math.abs(Class9142.method34142(MathHelper.method37792(var0), MathHelper.method37792(var17)));
         return !(var19 < var20) ? new float[]{var17, var18} : new float[]{var14, var15};
      }
   }

   public static Direction method34580(BlockPos var0) {
      Direction var3 = Direction.field673;
      float var4 = MathHelper.method37792(method34581(var0, Direction.field673)[0]);
      if (var4 >= 45.0F && var4 <= 135.0F) {
         var3 = Direction.EAST;
      } else if ((!(var4 >= 135.0F) || !(var4 <= 180.0F)) && (!(var4 <= -135.0F) || !(var4 >= -180.0F))) {
         if (var4 <= -45.0F && var4 >= -135.0F) {
            var3 = Direction.WEST;
         } else if (var4 >= -45.0F && var4 <= 0.0F || var4 <= 45.0F && var4 >= 0.0F) {
            var3 = Direction.NORTH;
         }
      } else {
         var3 = Direction.SOUTH;
      }

      if (MathHelper.method37792(method34581(var0, Direction.field673)[1]) > 75.0F || MathHelper.method37792(method34581(var0, Direction.field673)[1]) < -75.0F) {
         var3 = Direction.field673;
      }

      return var3;
   }

   public static float[] method34581(BlockPos var0, Direction var1) {
      double var4 = (double)var0.method8304() + 0.5 - field42414.player.getPosX() + (double)var1.method539() / 2.0;
      double var6 = (double)var0.method8306() + 0.5 - field42414.player.getPosZ() + (double)var1.method541() / 2.0;
      double var8 = field42414.player.getPosY() + (double)field42414.player.method3393() - ((double)var0.getY() + 0.5);
      double var10 = (double) MathHelper.method37766(var4 * var4 + var6 * var6);
      float var12 = (float)(Math.atan2(var6, var4) * 180.0 / Math.PI) - 90.0F;
      float var13 = (float)(Math.atan2(var8, var10) * 180.0 / Math.PI);
      if (var12 < 0.0F) {
         var12 += 360.0F;
      }

      return new float[]{var12, var13};
   }

   private float method34582(Entity var1, BlockPos var2) {
      float var5 = 6.0F;
      float var6 = (float)var2.method8304() + 0.5F;
      float var7 = (float)var2.getY() + 1.0F;
      float var8 = (float)var2.method8306() + 0.5F;
      float var9 = var5 * 2.0F;
      Vector3d var10 = new Vector3d((double)var6, (double)var7, (double)var8);
      if (!var1.method3398()) {
         double var11 = (double)(MathHelper.method37766(var1.method3278(var10)) / var9);
         if (var11 <= 1.0) {
            double var13 = var1.getPosX() - (double)var6;
            double var15 = var1.method3442() - (double)var7;
            double var17 = var1.getPosZ() - (double)var8;
            double var19 = (double) MathHelper.method37766(var13 * var13 + var15 * var15 + var17 * var17);
            if (var19 != 0.0) {
               var13 /= var19;
               var15 /= var19;
               var17 /= var19;
               double var21 = (double)Class7782.method25783(var10, var1);
               double var23 = (1.0 - var11) * var21;
               return (float)((int)((var23 * var23 + var23) / 2.0 * 7.0 * (double)var9 + 1.0));
            }
         }
      }

      return 0.0F;
   }

   // $VF: synthetic method
   public static Minecraft method34586() {
      return field42414;
   }
}