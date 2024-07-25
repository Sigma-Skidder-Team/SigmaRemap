package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class class_5155 implements AutoCloseable {
   private final class_8359 field_26555;
   private final class_8353 field_26560;
   private final class_4016 field_26549;
   public final class_5797[] field_26552;
   private final int[] field_26550;
   private final int[] field_26536;
   private final class_7560 field_26556;
   private final int field_26537;
   private final int field_26563;
   private final float field_26545;
   private final float field_26558;
   private final float field_26547;
   private final float field_26540;
   private int field_26546;
   private int field_26554;
   private int field_26544 = -1;
   public float field_26532;
   public float field_26529;
   public int field_26557;
   public int field_26553;
   public int field_26559 = -1;
   public class_5155 field_26548 = null;
   public boolean field_26561 = false;
   public static final String field_26534 = ".sprite_single";
   public int field_26531 = 0;
   public class_5155 field_26539 = null;
   public class_5155 field_26562 = null;
   public boolean field_26543 = false;
   public class_5155 field_26538 = null;
   public boolean field_26528 = false;
   private int field_26551 = -1;
   private boolean field_26564 = false;
   private boolean field_26541;
   private boolean field_26535;
   private boolean field_26542;
   private class_7832 field_26530;

   public class_5155(Identifier var1) {
      this.field_26555 = null;
      this.field_26560 = new class_8353(var1, 0, 0, (class_4016)null);
      this.field_26549 = null;
      this.field_26552 = null;
      this.field_26550 = new int[0];
      this.field_26536 = new int[0];
      this.field_26556 = null;
      this.field_26537 = 0;
      this.field_26563 = 0;
      this.field_26545 = 0.0F;
      this.field_26558 = 0.0F;
      this.field_26547 = 0.0F;
      this.field_26540 = 0.0F;
   }

   private class_5155(class_5155 var1) {
      this.field_26555 = var1.field_26555;
      class_8353 var4 = var1.field_26560;
      Identifier var5 = var4.method_38459();
      Identifier var6 = new Identifier(var5.method_21461(), var5.method_21456() + ".sprite_single");
      int var7 = var4.method_38453();
      int var8 = var4.method_38456();
      class_4016 var9 = var4.method_38457();
      this.field_26560 = new class_8353(var6, var7, var8, var9);
      this.field_26549 = var1.field_26549;
      this.field_26552 = var1.field_26552;
      this.field_26550 = var1.field_26550;
      this.field_26536 = var1.field_26536;
      this.field_26556 = var1.field_26556;
      this.field_26537 = 0;
      this.field_26563 = 0;
      this.field_26545 = 0.0F;
      this.field_26558 = 1.0F;
      this.field_26547 = 0.0F;
      this.field_26540 = 1.0F;
      this.field_26546 = var1.field_26546;
      this.field_26554 = var1.field_26554;
      this.field_26544 = var1.field_26544;
      this.field_26532 = var1.field_26532;
      this.field_26529 = var1.field_26529;
      this.field_26557 = var1.field_26557;
      this.field_26553 = var1.field_26553;
      this.field_26561 = true;
      this.field_26531 = var1.field_26531;
      this.field_26551 = var1.field_26551;
      this.field_26564 = var1.field_26564;
   }

   public class_5155(class_8359 var1, class_8353 var2, int var3, int var4, int var5, int var6, int var7, class_5797 var8) {
      this.field_26555 = var1;
      class_4016 var11 = class_8353.method_38452(var2);
      int var12 = class_8353.method_38462(var2);
      int var13 = class_8353.method_38461(var2);
      this.field_26537 = var6;
      this.field_26563 = var7;
      this.field_26545 = (float)var6 / (float)var4;
      this.field_26558 = (float)(var6 + var12) / (float)var4;
      this.field_26547 = (float)var7 / (float)var5;
      this.field_26540 = (float)(var7 + var13) / (float)var5;
      if (class_8353.method_38465(var2) > 1.0) {
         int var14 = (int)Math.round((double)var8.method_26228() * class_8353.method_38465(var2));
         class_5797 var15 = class_5525.method_25095(var8, var14);
         if (var15 != var8) {
            var8.close();
            var8 = var15;
         }
      }

      if (!this.field_26543 && !var2.method_38459().method_21456().endsWith("_leaves")) {
         this.method_23605(var8);
      }

      class_5797 var24 = var8;
      int var25 = var8.method_26228() / var11.method_18497(var12);
      int var16 = var8.method_26253() / var11.method_18509(var13);
      if (var11.method_18507() > 0) {
         int var17 = var11.method_18508().stream().max(Integer::compareTo).get() + 1;
         this.field_26550 = new int[var17];
         this.field_26536 = new int[var17];
         Arrays.fill(this.field_26550, -1);
         Arrays.fill(this.field_26536, -1);

         for (int var19 : var11.method_18508()) {
            if (var19 >= var25 * var16) {
               throw new RuntimeException("invalid frameindex " + var19);
            }

            int var20 = var19 / var25;
            int var21 = var19 % var25;
            this.field_26550[var19] = var21;
            this.field_26536[var19] = var20;
         }
      } else {
         ArrayList var26 = Lists.newArrayList();
         int var27 = var25 * var16;
         this.field_26550 = new int[var27];
         this.field_26536 = new int[var27];

         for (int var30 = 0; var30 < var16; var30++) {
            for (int var33 = 0; var33 < var25; var33++) {
               int var34 = var30 * var25 + var33;
               this.field_26550[var34] = var33;
               this.field_26536[var34] = var30;
               var26.add(new class_9417(var34, -1));
            }
         }

         var11 = new class_4016(var26, var12, var13, var11.method_18498(), var11.method_18501());
      }

      this.field_26560 = new class_8353(class_8353.method_38455(var2), var12, var13, var11);
      this.field_26549 = var11;

      try {
         try {
            this.field_26552 = class_1217.method_5396(var8, var3);
         } catch (Throwable var22) {
            class_159 var29 = class_159.method_643(var22, "Generating mipmaps for frame");
            class_6544 var32 = var29.method_639("Frame being iterated");
            var32.method_29851("First frame", () -> {
               StringBuilder var3x = new StringBuilder();
               if (var3x.length() > 0) {
                  var3x.append(", ");
               }

               var3x.append(var24.method_26228()).append("x").append(var24.method_26253());
               return var3x.toString();
            });
            throw new class_3297(var29);
         }
      } catch (Throwable var23) {
         class_159 var28 = class_159.method_643(var23, "Applying mipmap");
         class_6544 var31 = var28.method_639("Sprite being mipmapped");
         var31.method_29851("Sprite name", () -> this.method_23644().toString());
         var31.method_29851("Sprite size", () -> this.method_23625() + " x " + this.method_23615());
         var31.method_29851("Sprite frames", () -> this.method_23610() + " frames");
         var31.method_29850("Mipmap levels", var3);
         throw new class_3297(var28);
      }

      if (var11.method_18501()) {
         this.field_26556 = new class_7560(this, var2, var3, null);
      } else {
         this.field_26556 = null;
      }

      this.field_26531 = var3;
      this.field_26532 = Math.min(this.field_26545, this.field_26558);
      this.field_26529 = Math.min(this.field_26547, this.field_26540);
      this.field_26557 = var4;
      this.field_26553 = var5;
   }

   private void method_23603(int var1) {
      int var4 = this.field_26550[var1] * class_8353.method_38462(this.field_26560);
      int var5 = this.field_26536[var1] * class_8353.method_38461(this.field_26560);
      this.method_23604(var4, var5, this.field_26552);
   }

   private void method_23604(int var1, int var2, class_5797[] var3) {
      boolean var6 = false;
      boolean var7 = this.field_26561;

      for (int var8 = 0; var8 < var3.length && this.method_23625() >> var8 > 0 && this.method_23615() >> var8 > 0; var8++) {
         var3[var8]
            .method_26259(
               var8,
               this.field_26537 >> var8,
               this.field_26563 >> var8,
               var1 >> var8,
               var2 >> var8,
               class_8353.method_38462(this.field_26560) >> var8,
               class_8353.method_38461(this.field_26560) >> var8,
               var6,
               var7,
               var3.length > 1,
               false
            );
      }

      if (this.field_26548 != null) {
         this.field_26548.method_23604(var1, var2, var3);
      }
   }

   public int method_23625() {
      return class_8353.method_38462(this.field_26560);
   }

   public int method_23615() {
      return class_8353.method_38461(this.field_26560);
   }

   public float method_23630() {
      return this.field_26545;
   }

   public float method_23619() {
      return this.field_26558;
   }

   public float method_23602(double var1) {
      float var5 = this.field_26558 - this.field_26545;
      return this.field_26545 + var5 * (float)var1 / 16.0F;
   }

   public float method_23642() {
      return this.field_26547;
   }

   public float method_23640() {
      return this.field_26540;
   }

   public float method_23639(double var1) {
      float var5 = this.field_26540 - this.field_26547;
      return this.field_26547 + var5 * (float)var1 / 16.0F;
   }

   public Identifier method_23644() {
      return class_8353.method_38455(this.field_26560);
   }

   public class_8359 method_23608() {
      return this.field_26555;
   }

   public int method_23610() {
      return this.field_26550.length;
   }

   @Override
   public void close() {
      for (class_5797 var6 : this.field_26552) {
         if (var6 != null) {
            var6.close();
         }
      }

      if (this.field_26556 != null) {
         this.field_26556.close();
      }

      if (this.field_26548 == null) {
      }

      if (this.field_26539 != null) {
         this.field_26539.close();
      }

      if (this.field_26562 != null) {
         this.field_26562.close();
      }
   }

   @Override
   public String toString() {
      int var3 = this.field_26550.length;
      return "TextureAtlasSprite{name='"
         + class_8353.method_38455(this.field_26560)
         + '\''
         + ", frameCount="
         + var3
         + ", x="
         + this.field_26537
         + ", y="
         + this.field_26563
         + ", height="
         + class_8353.method_38461(this.field_26560)
         + ", width="
         + class_8353.method_38462(this.field_26560)
         + ", u0="
         + this.field_26545
         + ", u1="
         + this.field_26558
         + ", v0="
         + this.field_26547
         + ", v1="
         + this.field_26540
         + '}';
   }

   public boolean method_23641(int var1, int var2, int var3) {
      return (
            this.field_26552[0]
                     .method_26252(
                        var2 + this.field_26550[var1] * class_8353.method_38462(this.field_26560),
                        var3 + this.field_26536[var1] * class_8353.method_38461(this.field_26560)
                     )
                  >> 24
               & 0xFF
         )
         == 0;
   }

   public void method_23600() {
      this.method_23603(0);
   }

   private float method_23598() {
      float var3 = (float)class_8353.method_38462(this.field_26560) / (this.field_26558 - this.field_26545);
      float var4 = (float)class_8353.method_38461(this.field_26560) / (this.field_26540 - this.field_26547);
      return Math.max(var4, var3);
   }

   public float method_23632() {
      return 4.0F / this.method_23598();
   }

   public void method_23633() {
      if (this.field_26549 != null) {
         this.field_26564 = !class_153.method_611() ? true : class_153.method_618(this);
         if (this.field_26549.method_18507() <= 1) {
            this.field_26564 = false;
         }

         this.field_26554++;
         if (this.field_26554 < this.field_26549.method_18500(this.field_26546)) {
            if (this.field_26556 != null) {
               if (!this.field_26564) {
                  return;
               }

               if (class_3542.method_16366()) {
                  class_7560.method_34387(this.field_26556);
               } else {
                  class_3542.method_16474(() -> class_7560.method_34387(this.field_26556));
               }
            }
         } else {
            int var3 = this.field_26549.method_18506(this.field_26546);
            int var4 = this.field_26549.method_18507() != 0 ? this.field_26549.method_18507() : this.method_23610();
            this.field_26546 = (this.field_26546 + 1) % var4;
            this.field_26554 = 0;
            int var5 = this.field_26549.method_18506(this.field_26546);
            if (!this.field_26564) {
               return;
            }

            if (var3 != var5 && var5 >= 0 && var5 < this.method_23610()) {
               this.method_23603(var5);
            }
         }
      }
   }

   public boolean method_23607() {
      return this.field_26549.method_18507() > 1;
   }

   public class_7907 method_23601(class_7907 var1) {
      if (this.method_23644() == class_5525.field_28139) {
         class_3758 var4 = var1.method_35733();
         if (var4 != null) {
            return var4.method_17418();
         }
      }

      return new class_2187(var1, this);
   }

   public int method_23624() {
      return this.field_26544;
   }

   public void method_23628(class_7225 var1) {
      if (this.field_26544 < 0) {
         if (this.field_26555 != null) {
            class_5155 var4 = this.field_26555.method_38510(this.method_23644());
            if (var4 != null) {
               this.field_26544 = var4.method_23624();
            }
         }

         if (this.field_26544 < 0) {
            this.field_26544 = var1.method_33083();
         }
      }
   }

   public int method_23612() {
      return this.field_26551;
   }

   public void method_23631(int var1) {
      this.field_26551 = var1;
      if (this.field_26548 != null) {
         this.field_26548.method_23631(var1);
      }

      if (this.field_26539 != null) {
         this.field_26539.method_23631(var1);
      }

      if (this.field_26562 != null) {
         this.field_26562.method_23631(var1);
      }
   }

   public boolean method_23593() {
      return this.field_26564;
   }

   private void method_23605(class_5797 var1) {
      int[] var4 = new int[var1.method_26228() * var1.method_26253()];
      var1.method_26251().get(var4);
      this.method_23606(var4);
      var1.method_26251().put(var4);
   }

   private void method_23606(int[] var1) {
      if (var1 != null) {
         long var4 = 0L;
         long var6 = 0L;
         long var8 = 0L;
         long var10 = 0L;

         for (int var12 = 0; var12 < var1.length; var12++) {
            int var13 = var1[var12];
            int var14 = var13 >> 24 & 0xFF;
            if (var14 >= 16) {
               int var15 = var13 >> 16 & 0xFF;
               int var16 = var13 >> 8 & 0xFF;
               int var17 = var13 & 0xFF;
               var4 += (long)var15;
               var6 += (long)var16;
               var8 += (long)var17;
               var10++;
            }
         }

         if (var10 > 0L) {
            int var19 = (int)(var4 / var10);
            int var20 = (int)(var6 / var10);
            int var21 = (int)(var8 / var10);
            int var22 = var19 << 16 | var20 << 8 | var21;

            for (int var23 = 0; var23 < var1.length; var23++) {
               int var24 = var1[var23];
               int var18 = var24 >> 24 & 0xFF;
               if (var18 <= 16) {
                  var1[var23] = var22;
               }
            }
         }
      }
   }

   public double method_23634(float var1) {
      float var4 = this.field_26558 - this.field_26545;
      return (double)((var1 - this.field_26545) / var4 * 16.0F);
   }

   public double method_23613(float var1) {
      float var4 = this.field_26540 - this.field_26547;
      return (double)((var1 - this.field_26547) / var4 * 16.0F);
   }

   public void method_23617() {
      if (this.field_26559 < 0) {
         this.field_26559 = class_4970.method_22837();
         class_4970.method_22841(this.field_26559, this.field_26531, this.method_23625(), this.method_23615());
         class_5525.method_25084();
      }

      class_5525.method_25077(this.field_26559);
   }

   public void method_23635() {
      if (this.field_26559 >= 0) {
         class_4970.method_22838(this.field_26559);
         this.field_26559 = -1;
      }
   }

   public float method_23592(float var1) {
      var1 -= this.field_26532;
      float var4 = (float)this.field_26557 / (float)this.method_23625();
      return var1 * var4;
   }

   public float method_23626(float var1) {
      var1 -= this.field_26529;
      float var4 = (float)this.field_26553 / (float)this.method_23615();
      return var1 * var4;
   }

   public class_5797[] method_23627() {
      return this.field_26552;
   }

   public class_4016 method_23599() {
      return this.field_26549;
   }

   public int method_23616() {
      return this.field_26537;
   }

   public int method_23629() {
      return this.field_26563;
   }

   public float method_23620(float var1) {
      float var4 = this.field_26558 - this.field_26545;
      return (var1 - this.field_26545) / var4 * 16.0F;
   }

   public float method_23597(float var1) {
      float var4 = this.field_26540 - this.field_26547;
      return (var1 - this.field_26547) / var4 * 16.0F;
   }

   public class_5155 method_23621() {
      class_5155 var3 = new class_5155(this);
      var3.field_26561 = true;
      return var3;
   }

   public class_5155 method_23637(String var1, int var2) {
      Identifier var5 = new Identifier(this.method_23644().method_21461(), this.method_23644().method_21456() + var1);
      Identifier var6 = this.field_26555.method_38503(var5);
      class_5155 var7 = null;
      if (this.field_26530.method_35456(var6)) {
         try (class_4038 var8 = this.field_26530.method_35458(var6)) {
            class_4038 var10 = this.field_26530.method_35458(var6);
            class_2639 var11 = new class_2639(var6.toString(), var10.method_18576());
            class_4016 var12 = var8.<class_4016>method_18577(class_4016.field_19496);
            if (var12 == null) {
               var12 = class_4016.field_19494;
            }

            Pair var13 = var12.method_18505(var11.field_13007, var11.field_13006);
            class_8353 var14 = new class_8353(var5, (Integer)var13.getFirst(), (Integer)var13.getSecond(), var12);
            class_5797 var15 = class_5797.method_26230(var8.method_18576());
            if (var15.method_26228() != this.method_23625()) {
               class_5797 var16 = class_5525.method_25095(var15, this.method_23625());
               if (var16 != var15) {
                  double var17 = 1.0 * (double)this.method_23625() / (double)var15.method_26228();
                  var15.close();
                  var15 = var16;
                  var14 = new class_8353(
                     var5, (int)((double)((Integer)var13.getFirst()).intValue() * var17), (int)((double)((Integer)var13.getSecond()).intValue() * var17), var12
                  );
               }
            }

            var7 = new class_5155(this.field_26555, var14, this.field_26531, this.field_26557, this.field_26553, this.field_26537, this.field_26563, var15);
         } catch (IOException var29) {
         }
      }

      if (var7 == null) {
         class_5797 var30 = new class_5797(this.method_23625(), this.method_23615(), false);
         int var31 = class_5525.method_25081(var2);
         var30.method_26226(0, 0, var30.method_26228(), var30.method_26253(), var31);
         class_8353 var32 = new class_8353(var5, this.method_23625(), this.method_23615(), class_4016.field_19494);
         var7 = new class_5155(this.field_26555, var32, this.field_26531, this.field_26557, this.field_26553, this.field_26537, this.field_26563, var30);
      }

      var7.field_26543 = true;
      return var7;
   }

   public boolean method_23596() {
      return this.field_26541;
   }

   private void method_23611(boolean var1) {
      this.field_26541 = var1;
      this.field_26542 = false;
      this.field_26535 = false;
      if (this.field_26548 != null) {
         this.field_26548.method_23635();
         this.field_26548 = null;
      }

      if (this.field_26539 != null) {
         this.field_26539.close();
         this.field_26539 = null;
      }

      if (this.field_26562 != null) {
         this.field_26562.close();
         this.field_26562 = null;
      }

      this.field_26542 = class_3111.method_14405();
      this.field_26535 = class_3111.method_14424();
      if (this.field_26542 && !this.field_26561) {
         this.field_26548 = this.method_23621();
      }

      if (this.field_26535 && !this.field_26561) {
         if (this.field_26539 == null && class_6588.field_33603) {
            this.field_26539 = this.method_23637("_n", -8421377);
         }

         if (this.field_26562 == null && class_6588.field_33634) {
            this.field_26562 = this.method_23637("_s", 0);
         }
      }
   }

   public void method_23638(class_7832 var1) {
      this.field_26530 = var1;
      this.method_23628(this.field_26555.method_38513());
      this.method_23611(this.field_26555.method_38529());
   }

   public int method_23622(int var1, int var2, int var3) {
      return this.field_26552[0].method_26252(var2 + this.field_26550[var1] * this.method_23625(), var3 + this.field_26536[var1] * this.method_23615());
   }
}
