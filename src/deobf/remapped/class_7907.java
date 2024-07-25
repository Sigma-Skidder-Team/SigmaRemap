package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface class_7907 extends class_275 {
   Logger field_40426 = LogManager.getLogger();
   ThreadLocal<class_4460> field_40428 = ThreadLocal.<class_4460>withInitial(
      () -> new class_4460(class_4783.field_23184.method_29260(), new BlockPos(0, 0, 0))
   );
   boolean field_40427 = class_7860.field_40161.method_45472();

   default class_4460 method_35749(class_2522 var1, BlockPos var2) {
      class_4460 var5 = field_40428.get();
      var5.method_20678(var1, var2);
      return var5;
   }

   default RenderLayer method_35760() {
      return null;
   }

   default boolean method_35740() {
      return false;
   }

   class_7907 method_35761(double var1, double var3, double var5);

   class_7907 method_35743(int var1, int var2, int var3, int var4);

   class_7907 method_35745(float var1, float var2);

   class_7907 method_35738(int var1, int var2);

   class_7907 method_35748(int var1, int var2);

   class_7907 method_35755(float var1, float var2, float var3);

   void method_35735();

   default void method_35744(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      this.method_35761((double)var1, (double)var2, (double)var3);
      this.method_35742(var4, var5, var6, var7);
      this.method_35745(var8, var9);
      this.method_35737(var10);
      this.method_35747(var11);
      this.method_35755(var12, var13, var14);
      this.method_35735();
   }

   default class_7907 method_35742(float var1, float var2, float var3, float var4) {
      return this.method_35743((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   default class_7907 method_35747(int var1) {
      return this.method_35748(var1 & 65535, var1 >> 16 & 65535);
   }

   default class_7907 method_35737(int var1) {
      return this.method_35738(var1 & 65535, var1 >> 16 & 65535);
   }

   default void method_35757(class_6279 var1, class_5024 var2, float var3, float var4, float var5, int var6, int var7) {
      this.method_35759(var1, var2, this.method_35746(1.0F, 1.0F, 1.0F, 1.0F), var3, var4, var5, this.method_35739(var6, var6, var6, var6), var7, false);
   }

   default void method_35741(
      class_6279 var1, class_5024 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10
   ) {
      this.method_35758(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   default void method_35759(class_6279 var1, class_5024 var2, float[] var3, float var4, float var5, float var6, int[] var7, int var8, boolean var9) {
      this.method_35758(var1, var2, var3, var4, var5, var6, 1.0F, var7, var8, var9);
   }

   default void method_35758(
      class_6279 var1, class_5024 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9, boolean var10
   ) {
      int[] var13 = !this.method_35740() ? var2.method_23155() : var2.method_23153();
      this.method_35734(var2.method_23148());
      boolean var14 = class_2174.method_10097();
      class_2700 var15 = var2.method_23150().method_1037();
      float var16 = (float)var15.method_12173();
      float var17 = (float)var15.method_12165();
      float var18 = (float)var15.method_12185();
      class_8107 var19 = var1.method_28620();
      class_6555 var20 = var1.method_28618();
      float var21 = var20.method_29896(var16, var17, var18);
      float var22 = var20.method_29897(var16, var17, var18);
      float var23 = var20.method_29887(var16, var17, var18);
      byte var24 = 8;
      int var25 = class_7985.field_40918.method_13180();
      int var26 = var13.length / var25;

      for (int var27 = 0; var27 < var26; var27++) {
         int var28 = var27 * var25;
         float var29 = Float.intBitsToFloat(var13[var28 + 0]);
         float var30 = Float.intBitsToFloat(var13[var28 + 1]);
         float var31 = Float.intBitsToFloat(var13[var28 + 2]);
         float var32 = 1.0F;
         float var33 = !var14 ? var3[var27] : 1.0F;
         float var34;
         float var35;
         float var36;
         if (!var10) {
            var34 = var33 * var4;
            var35 = var33 * var5;
            var36 = var33 * var6;
            if (field_40427) {
               var32 = var7;
            }
         } else {
            int var37 = var13[var28 + 3];
            float var38 = (float)(var37 & 0xFF) / 255.0F;
            float var39 = (float)(var37 >> 8 & 0xFF) / 255.0F;
            float var40 = (float)(var37 >> 16 & 0xFF) / 255.0F;
            var34 = var38 * var33 * var4;
            var35 = var39 * var33 * var5;
            var36 = var40 * var33 * var6;
            if (field_40427) {
               float var41 = (float)(var37 >> 24 & 0xFF) / 255.0F;
               var32 = var41 * var7;
            }
         }

         int var44 = var8[var27];
         if (field_40427) {
            var44 = this.method_35763(var8[var27], var13, var28);
         }

         float var45 = Float.intBitsToFloat(var13[var28 + 4]);
         float var46 = Float.intBitsToFloat(var13[var28 + 5]);
         float var47 = var19.method_36805(var29, var30, var31, 1.0F);
         float var48 = var19.method_36812(var29, var30, var31, 1.0F);
         float var42 = var19.method_36815(var29, var30, var31, 1.0F);
         if (field_40427) {
            class_2426 var43 = this.method_35750(var13, var28, var1.method_28618());
            if (var43 != null) {
               var21 = var43.method_11057();
               var22 = var43.method_11061();
               var23 = var43.method_11055();
            }
         }

         if (var14) {
            var32 = var3[var27];
         }

         this.method_35744(var47, var48, var42, var34, var35, var36, var32, var45, var46, var9, var44, var21, var22, var23);
      }
   }

   default class_7907 method_35762(class_8107 var1, float var2, float var3, float var4) {
      float var7 = var1.method_36805(var2, var3, var4, 1.0F);
      float var8 = var1.method_36812(var2, var3, var4, 1.0F);
      float var9 = var1.method_36815(var2, var3, var4, 1.0F);
      return this.method_35761((double)var7, (double)var8, (double)var9);
   }

   default class_7907 method_35756(class_6555 var1, float var2, float var3, float var4) {
      float var7 = var1.method_29896(var2, var3, var4);
      float var8 = var1.method_29897(var2, var3, var4);
      float var9 = var1.method_29887(var2, var3, var4);
      return this.method_35755(var7, var8, var9);
   }

   default void method_35734(class_5155 var1) {
   }

   default void method_35752(class_5155 var1) {
   }

   default void method_35736(RenderLayer var1) {
   }

   default class_2426 method_35754(class_2426 var1) {
      return var1.method_11060();
   }

   default class_2426 method_35753(float var1, float var2, float var3) {
      return new class_2426(var1, var2, var3);
   }

   default float[] method_35746(float var1, float var2, float var3, float var4) {
      return new float[]{var1, var2, var3, var4};
   }

   default int[] method_35739(int var1, int var2, int var3, int var4) {
      return new int[]{var1, var2, var3, var4};
   }

   default class_3758 method_35733() {
      return null;
   }

   default int method_35763(int var1, int[] var2, int var3) {
      int var6 = method_35751(0);
      int var7 = class_5778.method_26134(var2[var3 + var6]);
      int var8 = class_5778.method_26131(var2[var3 + var6]);
      if (var7 == 0 && var8 == 0) {
         return var1;
      } else {
         int var9 = class_5778.method_26134(var1);
         int var10 = class_5778.method_26131(var1);
         var9 = Math.max(var9, var7);
         var10 = Math.max(var10, var8);
         return class_5778.method_26127(var9, var10);
      }
   }

   static int method_35751(int var0) {
      return var0 * 8 + 6;
   }

   default class_2426 method_35750(int[] var1, int var2, class_6555 var3) {
      byte var6 = 7;
      int var7 = var1[var2 + var6];
      byte var8 = (byte)(var7 >> 0 & 0xFF);
      byte var9 = (byte)(var7 >> 8 & 0xFF);
      byte var10 = (byte)(var7 >> 16 & 0xFF);
      if (var8 == 0 && var9 == 0 && var10 == 0) {
         return null;
      } else {
         class_2426 var11 = this.method_35753((float)var8 / 127.0F, (float)var9 / 127.0F, (float)var10 / 127.0F);
         var11.method_11059(var3);
         return var11;
      }
   }
}
