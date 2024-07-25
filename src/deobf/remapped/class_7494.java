package remapped;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.RandomUtils;

public class class_7494 {
   private static String[] field_38238;
   private static final MinecraftClient field_38239 = MinecraftClient.getInstance();

   public static boolean method_34116(class_704 var0, class_1331 var1) {
      return method_34108(var0, var1) < method_34074();
   }

   public static final class_6414 method_34120(class_1331 var0) {
      return field_38239.field_9601.method_28262(var0).method_8360();
   }

   public static final class_6414 method_34119(double var0, double var2, double var4) {
      return method_34120(new class_1331(var0, var2, var4));
   }

   public static boolean method_34117(class_6414 var0, class_1331 var1) {
      class_4190 var4 = var0.method_29260().method_8324(field_38239.field_9601, var1);
      return !method_34090(var1)
         && field_38239.field_9601.method_6678(field_38239.thePlayer, var4)
         && var1.method_12165() <= field_38239.thePlayer.method_37075().method_12165();
   }

   public static void method_34094(class_1331 var0) {
      double var3 = (double)var0.method_12173() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37302();
      double var5 = (double)var0.method_12165()
         + 0.5
         - (MinecraftClient.getInstance().thePlayer.method_37309() + (double) MinecraftClient.getInstance().thePlayer.method_37277());
      double var7 = (double)var0.method_12185() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37156();
      double var9 = (double)class_9299.method_42842(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      MinecraftClient.getInstance().thePlayer.field_41701 = MinecraftClient.getInstance().thePlayer.field_41701
         + class_9299.method_42810(var11 - MinecraftClient.getInstance().thePlayer.field_41701);
      MinecraftClient.getInstance().thePlayer.field_41755 = MinecraftClient.getInstance().thePlayer.field_41755
         + class_9299.method_42810(var12 - MinecraftClient.getInstance().thePlayer.field_41755);
   }

   public static void method_34111(class_1331 var0) {
      double var3 = (double)var0.method_12173() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37302();
      double var5 = (double)var0.method_12165()
         + 0.5
         - (MinecraftClient.getInstance().thePlayer.method_37309() + (double) MinecraftClient.getInstance().thePlayer.method_37277());
      double var7 = (double)var0.method_12185() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37156();
      double var9 = (double)class_9299.method_42842(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      MinecraftClient.getInstance()
         .method_8614()
         .method_4813(
            new class_3616(
               MinecraftClient.getInstance().thePlayer.field_41701 + class_9299.method_42810(var11 - MinecraftClient.getInstance().thePlayer.field_41701),
               MinecraftClient.getInstance().thePlayer.field_41755 + class_9299.method_42810(var12 - MinecraftClient.getInstance().thePlayer.field_41755),
               MinecraftClient.getInstance().thePlayer.field_41726
            )
         );
   }

   public static float[] method_34076(class_1331 var0) {
      double var3 = (double)var0.method_12173() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37302();
      double var5 = (double)var0.method_12165()
         - 0.25
         - (MinecraftClient.getInstance().thePlayer.method_37309() + (double) MinecraftClient.getInstance().thePlayer.method_37277());
      double var7 = (double)var0.method_12185() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37156();
      double var9 = (double)class_9299.method_42842(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      return new float[]{
         MinecraftClient.getInstance().thePlayer.field_41701 + class_9299.method_42810(var11 - MinecraftClient.getInstance().thePlayer.field_41701),
         MinecraftClient.getInstance().thePlayer.field_41755 + class_9299.method_42810(var12 - MinecraftClient.getInstance().thePlayer.field_41755)
      };
   }

   public static float[] method_34077(class_1331 var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      switch (var1) {
         case field_804:
            var4 += 0.49F;
            break;
         case field_818:
            var5 -= 0.49F;
            break;
         case field_800:
            var5 += 0.49F;
            break;
         case field_809:
            var4 -= 0.49F;
            break;
         case field_817:
            var6 += 0.0F;
         case field_802:
            var6++;
      }

      double var7 = (double)var0.method_12173() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37302() + (double)var4;
      double var9 = (double)var0.method_12165()
         - 0.02
         - (MinecraftClient.getInstance().thePlayer.method_37309() + (double) MinecraftClient.getInstance().thePlayer.method_37277())
         + (double)var6;
      double var11 = (double)var0.method_12185() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37156() + (double)var5;
      double var13 = (double)class_9299.method_42842(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0 / Math.PI) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return new float[]{
         MinecraftClient.getInstance().thePlayer.field_41701 + class_9299.method_42810(var15 - MinecraftClient.getInstance().thePlayer.field_41701),
         MinecraftClient.getInstance().thePlayer.field_41755 + class_9299.method_42810(var16 - MinecraftClient.getInstance().thePlayer.field_41755)
      };
   }

   public static float[] method_34097(class_1331 var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = (float)(0.4F + Math.random() * 0.1F);
      switch (var1) {
         case field_804:
            var4 += 0.49F;
            break;
         case field_818:
            var5 -= 0.49F;
            break;
         case field_800:
            var5 += 0.49F;
            break;
         case field_809:
            var4 -= 0.49F;
            break;
         case field_817:
            var6 = 0.0F;
            var4 = 0.26F - (float)(Math.random() * 0.2F);
            var5 = 0.26F - (float)(Math.random() * 0.2F);
         case field_802:
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

      double var7 = (double)var0.method_12173() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37302() + (double)var4;
      double var9 = (double)var0.method_12165()
         - 0.02
         - (MinecraftClient.getInstance().thePlayer.method_37309() + (double) MinecraftClient.getInstance().thePlayer.method_37277())
         + (double)var6;
      double var11 = (double)var0.method_12185() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37156() + (double)var5;
      double var13 = (double)class_9299.method_42842(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0 / Math.PI) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return new float[]{
         MinecraftClient.getInstance().thePlayer.field_41701 + class_9299.method_42810(var15 - MinecraftClient.getInstance().thePlayer.field_41701),
         MinecraftClient.getInstance().thePlayer.field_41755 + class_9299.method_42810(var16 - MinecraftClient.getInstance().thePlayer.field_41755)
      };
   }

   public static float method_34095(class_1331 var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      switch (var1) {
         case field_804:
            var4 += 0.49F;
            break;
         case field_818:
            var5 -= 0.49F;
            break;
         case field_800:
            var5 += 0.49F;
            break;
         case field_809:
            var4 -= 0.49F;
      }

      double var6 = (double)var0.method_12173() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37302() + (double)var4;
      double var8 = (double)var0.method_12185() + 0.5 - MinecraftClient.getInstance().thePlayer.method_37156() + (double)var5;
      double var10 = (double)var0.method_12165()
         - 0.02
         - (MinecraftClient.getInstance().thePlayer.method_37309() + (double) MinecraftClient.getInstance().thePlayer.method_37277())
         + 1.0;
      double var12 = (double)var0.method_12165()
         - 0.02
         - (MinecraftClient.getInstance().thePlayer.method_37309() + (double) MinecraftClient.getInstance().thePlayer.method_37277());
      double var14 = (double)class_9299.method_42842(var6 * var6 + var8 * var8);
      float var16 = (float)(-(Math.atan2(var10, var14) * 180.0 / Math.PI));
      float var17 = (float)(-(Math.atan2(var12, var14) * 180.0 / Math.PI));
      return var17 - var16;
   }

   public static List<class_1331> method_34085(List<class_1331> var0) {
      var0.sort((var0x, var1) -> {
         float var4 = method_34108(field_38239.thePlayer, var0x);
         float var5 = method_34108(field_38239.thePlayer, var1);
         if (!(var4 > var5)) {
            return var4 != var5 ? -1 : 0;
         } else {
            return 1;
         }
      });
      return var0;
   }

   public static List<class_1331> method_34086(List<class_1331> var0, class_1343 var1) {
      var0.sort((var1x, var2) -> {
         float var5 = method_34106(var1, var1x);
         float var6 = method_34106(var1, var2);
         if (!(var5 > var6)) {
            return var5 != var6 ? -1 : 0;
         } else {
            return 1;
         }
      });
      return var0;
   }

   public static List<class_1331> method_34087(List<class_1331> var0, class_1343 var1, boolean var2) {
      if (!var2) {
         method_34086(var0, var1);
      } else {
         var0.sort((var1x, var2x) -> !(method_34084(var1, var1x) >= method_34084(var1, var2x)) ? -1 : 1);
      }

      return var0;
   }

   public static List<Entity> method_34096(List<Entity> var0) {
      Collections.sort(var0, new class_4242());
      return var0;
   }

   public static List<class_704> method_34088(List<class_704> var0) {
      Collections.sort(var0, new class_469());
      return var0;
   }

   public static float method_34108(Entity var0, class_1331 var1) {
      return method_34107(var0, (double)var1.method_12173(), (double)var1.method_12165(), (double)var1.method_12185());
   }

   public static float method_34106(class_1343 var0, class_1331 var1) {
      return method_34105(var0, (double)var1.method_12173(), (double)var1.method_12165(), (double)var1.method_12185());
   }

   public static float method_34084(class_1343 var0, class_1331 var1) {
      return method_34104(var0, (double)var1.method_12173(), (double)var1.method_12185());
   }

   public static float method_34107(Entity var0, double var1, double var3, double var5) {
      float var9 = (float)(var0.method_37302() - var1);
      float var10 = (float)(var0.method_37309() - var3);
      float var11 = (float)(var0.method_37156() - var5);
      return method_34103(var9, var10, var11);
   }

   public static float method_34105(class_1343 var0, double var1, double var3, double var5) {
      float var9 = (float)(var0.method_61() - var1);
      float var10 = (float)(var0.method_60() - var3);
      float var11 = (float)(var0.method_62() - var5);
      return method_34103(var9, var10, var11);
   }

   public static float method_34104(class_1343 var0, double var1, double var3) {
      float var7 = (float)(var0.method_61() - var1);
      float var8 = (float)(var0.method_62() - var3);
      return method_34102(var7, var8);
   }

   public static float method_34101(double var0, double var2, double var4, double var6, double var8, double var10) {
      float var14 = (float)(var0 - var6);
      float var15 = (float)(var2 - var8);
      float var16 = (float)(var4 - var10);
      return method_34103(var14, var15, var16);
   }

   private static float method_34102(float var0, float var1) {
      return class_9299.method_42843((var0 - 0.5F) * (var0 - 0.5F) + (var1 - 0.5F) * (var1 - 0.5F));
   }

   private static float method_34103(float var0, float var1, float var2) {
      return class_9299.method_42843((var0 - 0.5F) * (var0 - 0.5F) + (var1 - 0.5F) * (var1 - 0.5F) + (var2 - 0.5F) * (var2 - 0.5F));
   }

   public static class_6414 method_34092(class_704 var0) {
      return method_34120(var0.method_37075().method_6100());
   }

   public static float method_34074() {
      return field_38239.playerController.method_42146();
   }

   public static List<class_1331> method_34110(float var0) {
      ArrayList var3 = new ArrayList();

      for (float var4 = -var0; var4 <= var0; var4++) {
         for (float var5 = -var0; var5 <= var0; var5++) {
            for (float var6 = -var0; var6 <= var0; var6++) {
               class_1331 var7 = new class_1331(
                  field_38239.thePlayer.method_37302() + (double)var5,
                  field_38239.thePlayer.method_37309() + (double)var4,
                  field_38239.thePlayer.method_37156() + (double)var6
               );
               var3.add(var7);
            }
         }
      }

      return var3;
   }

   public static List<class_1331> method_34109(double var0, double var2, double var4) {
      ArrayList var8 = new ArrayList();

      for (float var9 = -method_34074(); var9 <= method_34074(); var9++) {
         for (float var10 = -method_34074(); var10 <= method_34074(); var10++) {
            for (float var11 = -method_34074(); var11 <= method_34074(); var11++) {
               class_1331 var12 = new class_1331(var0 + (double)var10, var2 + (double)var9, var4 + (double)var11);
               var8.add(var12);
            }
         }
      }

      return var8;
   }

   public static List<class_1331> method_34078() {
      ArrayList var2 = new ArrayList();
      byte var3 = 90;
      byte var4 = 10;

      for (float var5 = (float)(-var3); var5 <= (float)var3; var5++) {
         for (float var6 = (float)(-var4); var6 <= (float)var4; var6++) {
            for (float var7 = (float)(-var4); var7 <= (float)var4; var7++) {
               class_1331 var8 = new class_1331(
                  field_38239.thePlayer.method_37302() + (double)var6,
                  field_38239.thePlayer.method_37309() + (double)var5,
                  field_38239.thePlayer.method_37156() + (double)var7
               );
               if (field_38239.field_9601.method_28262(var8).method_8360() instanceof class_285) {
                  var2.add(var8);
               }
            }
         }
      }

      return var2;
   }

   public static class_1331 method_34083(float var0, float var1, float var2) {
      class_9529 var5 = method_34079(var0, var1, var2);
      return var5 != null ? var5.method_43955() : null;
   }

   public static float[] method_34112() {
      class_9529 var2 = method_34099(class_8865.method_40785() - 270.0F);
      if (var2.method_33990() != class_1430.field_7721) {
         double var3 = var2.method_33993().field_7336 - (double)var2.method_43955().method_12173();
         double var5 = var2.method_33993().field_7334 - (double)var2.method_43955().method_12185();
         double var7 = var2.method_33993().field_7333 - (double)var2.method_43955().method_12165();
         double var9 = (double)var2.method_43955().method_12173() - MinecraftClient.getInstance().thePlayer.method_37302() + var3;
         double var11 = (double)var2.method_43955().method_12165()
            - (MinecraftClient.getInstance().thePlayer.method_37309() + (double) MinecraftClient.getInstance().thePlayer.method_37277())
            + var7;
         double var13 = (double)var2.method_43955().method_12185() - MinecraftClient.getInstance().thePlayer.method_37156() + var5;
         double var15 = (double)class_9299.method_42842(var9 * var9 + var13 * var13);
         float var17 = (float)(Math.atan2(var13, var9) * 180.0 / Math.PI) - 90.0F;
         float var18 = (float)(-(Math.atan2(var11, var15) * 180.0 / Math.PI));
         return new float[]{
            MinecraftClient.getInstance().thePlayer.field_41701 + class_9299.method_42810(var17 - MinecraftClient.getInstance().thePlayer.field_41701),
            MinecraftClient.getInstance().thePlayer.field_41755 + class_9299.method_42810(var18 - MinecraftClient.getInstance().thePlayer.field_41755)
         };
      } else {
         return null;
      }
   }

   public static class_9529 method_34099(float var0) {
      class_1343 var3 = new class_1343(field_38239.thePlayer.field_30525, field_38239.thePlayer.field_30502 - 0.8F, field_38239.thePlayer.field_30507);
      var0 = (float)Math.toRadians((double)var0);
      float var4 = 0.0F;
      float var5 = -class_9299.method_42818(var0) * class_9299.method_42840(var4);
      float var6 = class_9299.method_42840(var0) * class_9299.method_42840(var4);
      float var7 = 2.3F;
      class_1343 var8 = new class_1343(
         field_38239.thePlayer.field_30525 + (double)(var5 * var7),
         field_38239.thePlayer.field_30502 - 0.8F - (double)(!field_38239.thePlayer.field_29654 ? 0.0F : 0.6F),
         field_38239.thePlayer.field_30507 + (double)(var6 * var7)
      );
      Entity var9 = field_38239.getRenderViewEntity();
      return field_38239.field_9601.method_28265(new class_972(var3, var8, class_3132.field_15549, class_9583.field_48747, var9));
   }

   public static class_9529 method_34079(float var0, float var1, float var2) {
      class_1343 var5 = new class_1343(
         field_38239.thePlayer.field_30525,
         field_38239.thePlayer.field_30502 + (double)field_38239.thePlayer.method_37277(),
         field_38239.thePlayer.field_30507
      );
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var6 = -class_9299.method_42818(var0) * class_9299.method_42840(var1);
      float var7 = -class_9299.method_42818(var1);
      float var8 = class_9299.method_42840(var0) * class_9299.method_42840(var1);
      if (var2 == 0.0F) {
         var2 = field_38239.playerController.method_42146();
      }

      class_1343 var9 = new class_1343(
         field_38239.thePlayer.field_30525 + (double)(var6 * var2),
         field_38239.thePlayer.field_30502 + (double)(var7 * var2) + (double)field_38239.thePlayer.method_37277(),
         field_38239.thePlayer.field_30507 + (double)(var8 * var2)
      );
      Entity var10 = field_38239.getRenderViewEntity();
      return field_38239.field_9601.method_28265(new class_972(var5, var9, class_3132.field_15549, class_9583.field_48747, var10));
   }

   public static class_9529 method_34080(float var0, float var1, float var2, class_1393 var3) {
      class_1343 var6 = new class_1343(var3.method_6450(), (double)field_38239.thePlayer.method_37277() + var3.method_6454(), var3.method_6438());
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var7 = -class_9299.method_42818(var0) * class_9299.method_42840(var1);
      float var8 = -class_9299.method_42818(var1);
      float var9 = class_9299.method_42840(var0) * class_9299.method_42840(var1);
      if (var2 == 0.0F) {
         var2 = field_38239.playerController.method_42146();
      }

      class_1343 var10 = new class_1343(
         field_38239.thePlayer.field_30525 + (double)(var7 * var2),
         field_38239.thePlayer.field_30502 + (double)(var8 * var2) + (double)field_38239.thePlayer.method_37277(),
         field_38239.thePlayer.field_30507 + (double)(var9 * var2)
      );
      Entity var11 = field_38239.getRenderViewEntity();
      return field_38239.field_9601.method_28265(new class_972(var6, var10, class_3132.field_15549, class_9583.field_48747, var11));
   }

   public static class_7474 method_34115(float var0, float var1, float var2, float var3) {
      double var6 = Math.cos((double)class_8865.method_40785() * Math.PI / 180.0) * (double)var3;
      double var8 = Math.sin((double)class_8865.method_40785() * Math.PI / 180.0) * (double)var3;
      class_1343 var10 = new class_1343(
         field_38239.thePlayer.method_37302() + var6,
         field_38239.thePlayer.method_37309() + (double)field_38239.thePlayer.method_37277(),
         field_38239.thePlayer.method_37156() + var8
      );
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var11 = -class_9299.method_42818(var0) * class_9299.method_42840(var1);
      float var12 = -class_9299.method_42818(var1);
      float var13 = class_9299.method_42840(var0) * class_9299.method_42840(var1);
      if (var2 == 0.0F) {
         var2 = field_38239.playerController.method_42146();
      }

      class_1343 var14 = new class_1343(
         field_38239.thePlayer.field_30525 + (double)(var11 * var2),
         field_38239.thePlayer.field_30502 + (double)(var12 * var2) + (double)field_38239.thePlayer.method_37277(),
         field_38239.thePlayer.field_30507 + (double)(var13 * var2)
      );
      Entity var15 = field_38239.getRenderViewEntity();
      return field_38239.field_9601.method_28265(new class_972(var10, var14, class_3132.field_15549, class_9583.field_48747, var15));
   }

   public static class_7474 method_34100(class_1331 var0) {
      class_1343 var3 = new class_1343(
         field_38239.thePlayer.method_37302(),
         field_38239.thePlayer.method_37309() + (double)field_38239.thePlayer.method_37277(),
         field_38239.thePlayer.method_37156()
      );
      class_1343 var4 = new class_1343(
         (double)var0.method_12173() + 0.5 + RandomUtils.nextDouble(0.01, 0.04),
         (double)var0.method_12165(),
         (double)var0.method_12185() + 0.5 + RandomUtils.nextDouble(0.01, 0.04)
      );
      return field_38239.field_9601.method_28265(new class_972(var3, var4, class_3132.field_15549, class_9583.field_48747, field_38239.getRenderViewEntity()));
   }

   private boolean method_34093(class_7606 var1, float var2, float var3) {
      class_1343 var6 = new class_1343(
         field_38239.thePlayer.method_37302(),
         field_38239.thePlayer.method_37309() + (double)field_38239.thePlayer.method_37277(),
         field_38239.thePlayer.method_37156()
      );
      var2 = (float)Math.toRadians((double)var2);
      var3 = (float)Math.toRadians((double)var3);
      float var7 = -class_9299.method_42818(var2) * class_9299.method_42840(var3);
      float var8 = -class_9299.method_42818(var3);
      float var9 = class_9299.method_42840(var2) * class_9299.method_42840(var3);
      float var10 = field_38239.playerController.method_42146();
      class_1343 var11 = new class_1343(
         field_38239.thePlayer.method_37302() + (double)(var7 * var10),
         field_38239.thePlayer.method_37309() + (double)(var8 * var10) + (double)field_38239.thePlayer.method_37277(),
         field_38239.thePlayer.method_37156() + (double)(var9 * var10)
      );
      Entity var12 = field_38239.getRenderViewEntity();
      class_9529 var13 = field_38239.field_9601.method_28265(new class_972(var6, var11, class_3132.field_15549, class_9583.field_48752, var12));
      return var13 == null ? false : var13.method_43955().equals(var1.field_38725) && var13.method_43956() == var1.field_38724;
   }

   public static class_1343 method_34098(Direction var0, class_1331 var1) {
      float var4 = (float)Math.max(0, var0.method_1041());
      float var5 = (float)Math.max(0, var0.method_1034());
      float var6 = (float)var1.method_12173() + var4 + (var0.method_1041() != 0 ? 0.0F : (float)Math.random());
      float var7 = (float)var1.method_12165() + (var0.method_1054() != 0 ? 0.0F : (var0.method_1054() != 1 ? (float)Math.random() : 1.0F));
      float var8 = (float)var1.method_12185() + var5 + (var0.method_1034() != 0 ? 0.0F : (float)Math.random());
      return new class_1343((double)var6, (double)var7, (double)var8);
   }

   public static int method_34075(class_2522 var0) {
      class_6414 var3 = var0.method_8360();
      class_8021 var4 = var3.method_29306();
      ImmutableList var5 = var4.method_36441();
      return var5.indexOf(var0);
   }

   public static int method_34081(class_6414 var0) {
      return class_8669.field_44462.method_14041(var0);
   }

   public static class_2899 method_34118(class_1331 var0, boolean var1) {
      class_2700[] var4 = new class_2700[]{
         new class_2700(0, 0, 0), new class_2700(-1, 0, 0), new class_2700(1, 0, 0), new class_2700(0, 0, 1), new class_2700(0, 0, -1)
      };
      class_1724[] var5 = new class_1724[]{
         new class_1724(1, 1, 1, false),
         new class_1724(2, 1, 2, false),
         new class_1724(3, 1, 3, false),
         new class_1724(4, 1, 4, false),
         new class_1724(0, -1, 0, true)
      };

      for (class_1724 var9 : var5) {
         for (class_2700 var13 : var4) {
            class_2700 var14 = !var9.field_8903
               ? new class_2700(var13.method_12173() * var9.field_8900, var13.method_12165() * var9.field_8901, var13.method_12185() * var9.field_8902)
               : new class_2700(var13.method_12173() + var9.field_8900, var13.method_12165() + var9.field_8901, var13.method_12185() + var9.field_8902);

            for (Direction var18 : Direction.values()) {
               if ((var18 != Direction.field_802 || !var1) && method_34090(var0.method_6105(var14).method_6099(var18, -1))) {
                  return new class_2899(var0.method_6105(var14).method_6099(var18, -1), var18);
               }
            }
         }
      }

      return null;
   }

   public static List<class_1331> method_34089(class_1331 var0) {
      ArrayList var3 = new ArrayList();
      float var4 = method_34074() - 3.0F;

      for (float var5 = -var4; var5 < 1.0F; var5++) {
         for (float var6 = -var4; var6 <= var4; var6++) {
            for (float var7 = -var4; var7 <= var4; var7++) {
               class_1331 var8 = var0.method_6103((double)var6, (double)var5, (double)var7);
               if (field_38239.thePlayer.method_37309() >= (double)var8.method_12165()) {
                  var3.add(var8);
               }
            }
         }
      }

      return var3;
   }

   public static class_2899 method_34091(class_1331 var0, boolean var1, boolean var2) {
      float var5 = method_34074();

      for (class_1331 var8 : method_34087(
         method_34089(var0),
         new class_1343(field_38239.thePlayer.method_37302(), field_38239.thePlayer.method_37309(), field_38239.thePlayer.method_37156()),
         var2
      )) {
         for (Direction var12 : Direction.values()) {
            if ((var12 != Direction.field_802 || !var1) && !method_34090(var8) && method_34090(var8.method_6099(var12, -1))) {
               return new class_2899(var8.method_6099(var12, -1), var12);
            }
         }
      }

      return null;
   }

   public static boolean method_34090(class_1331 var0) {
      if (var0 != null) {
         class_6414 var3 = field_38239.field_9601.method_28262(var0).method_8360();
         return !var3.method_29260().method_8302() && var3.method_29260().method_8362().method_24497()
            ? false
            : !(var3 instanceof class_163) || method_34075(field_38239.field_9601.method_28262(var0)) != 0;
      } else {
         return false;
      }
   }

   public static float[] method_34082(float var0, float var1, class_2899 var2) {
      class_9529 var5 = method_34079(var0, var1, field_38239.playerController.method_42146());
      if (var5 != null && var5.method_43955().equals(var2.field_14163)) {
         return new float[]{var0, var1};
      } else {
         float var6 = method_34076(var2.field_14163)[0];
         class_1343 var7 = new class_1343(
            (double)var2.field_14163.method_12173() + 0.5, (double)var2.field_14163.method_12165() + 0.5, (double)var2.field_14163.method_12185() + 0.5
         );
         float var8 = (var6 + 90.0F) * (float) (Math.PI / 180.0);
         double var9 = (double)(-class_9299.method_42818(var8)) / 2.1;
         double var11 = (double)class_9299.method_42840(var8) / 2.1;
         var7 = var7.method_6214(var9, 0.0, var11);
         float[] var13 = class_7211.method_33006(var7.field_7336, var7.field_7334, var7.field_7333);
         float var14 = var13[0];
         float var15 = var13[1];
         var8 = (var6 - 90.0F) * (float) (Math.PI / 180.0);
         var9 = (double)(-class_9299.method_42818(var8)) / 2.1;
         var11 = (double)class_9299.method_42840(var8) / 2.1;
         var7 = new class_1343(
            (double)var2.field_14163.method_12173() + 0.5, (double)var2.field_14163.method_12165() + 0.5, (double)var2.field_14163.method_12185() + 0.5
         );
         var7 = var7.method_6214(var9, 0.0, var11);
         float[] var16 = class_7211.method_33006(var7.field_7336, var7.field_7334, var7.field_7333);
         float var17 = var16[0];
         float var18 = var16[1];
         float var19 = Math.abs(class_7211.method_33011(class_9299.method_42810(var0), class_9299.method_42810(var14)));
         float var20 = Math.abs(class_7211.method_33011(class_9299.method_42810(var0), class_9299.method_42810(var17)));
         return !(var19 < var20) ? new float[]{var17, var18} : new float[]{var14, var15};
      }
   }

   public static Direction method_34113(class_1331 var0) {
      Direction var3 = Direction.field_817;
      float var4 = class_9299.method_42810(method_34121(var0, Direction.field_817)[0]);
      if (var4 >= 45.0F && var4 <= 135.0F) {
         var3 = Direction.field_804;
      } else if ((!(var4 >= 135.0F) || !(var4 <= 180.0F)) && (!(var4 <= -135.0F) || !(var4 >= -180.0F))) {
         if (var4 <= -45.0F && var4 >= -135.0F) {
            var3 = Direction.field_809;
         } else if (var4 >= -45.0F && var4 <= 0.0F || var4 <= 45.0F && var4 >= 0.0F) {
            var3 = Direction.field_818;
         }
      } else {
         var3 = Direction.field_800;
      }

      if (class_9299.method_42810(method_34121(var0, Direction.field_817)[1]) > 75.0F
         || class_9299.method_42810(method_34121(var0, Direction.field_817)[1]) < -75.0F) {
         var3 = Direction.field_817;
      }

      return var3;
   }

   public static float[] method_34121(class_1331 var0, Direction var1) {
      double var4 = (double)var0.method_12173() + 0.5 - field_38239.thePlayer.method_37302() + (double)var1.method_1041() / 2.0;
      double var6 = (double)var0.method_12185() + 0.5 - field_38239.thePlayer.method_37156() + (double)var1.method_1034() / 2.0;
      double var8 = field_38239.thePlayer.method_37309() + (double)field_38239.thePlayer.method_37277() - ((double)var0.method_12165() + 0.5);
      double var10 = (double)class_9299.method_42842(var4 * var4 + var6 * var6);
      float var12 = (float)(Math.atan2(var6, var4) * 180.0 / Math.PI) - 90.0F;
      float var13 = (float)(Math.atan2(var8, var10) * 180.0 / Math.PI);
      if (var12 < 0.0F) {
         var12 += 360.0F;
      }

      return new float[]{var12, var13};
   }

   private float method_34073(Entity var1, class_1331 var2) {
      float var5 = 6.0F;
      float var6 = (float)var2.method_12173() + 0.5F;
      float var7 = (float)var2.method_12165() + 1.0F;
      float var8 = (float)var2.method_12185() + 0.5F;
      float var9 = var5 * 2.0F;
      class_1343 var10 = new class_1343((double)var6, (double)var7, (double)var8);
      if (!var1.method_37085()) {
         double var11 = (double)(class_9299.method_42842(var1.method_37274(var10)) / var9);
         if (var11 <= 1.0) {
            double var13 = var1.method_37302() - (double)var6;
            double var15 = var1.method_37388() - (double)var7;
            double var17 = var1.method_37156() - (double)var8;
            double var19 = (double)class_9299.method_42842(var13 * var13 + var15 * var15 + var17 * var17);
            if (var19 != 0.0) {
               var13 /= var19;
               var15 /= var19;
               var17 /= var19;
               double var21 = (double)class_2730.method_12265(var10, var1);
               double var23 = (1.0 - var11) * var21;
               return (float)((int)((var23 * var23 + var23) / 2.0 * 7.0 * (double)var9 + 1.0));
            }
         }
      }

      return 0.0F;
   }
}
