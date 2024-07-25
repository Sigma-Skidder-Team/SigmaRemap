package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class AltManagerMenu extends class_2596 {
   private int field_10607;
   private float field_10602;
   private float field_10601 = 0.75F;
   private boolean field_10603 = true;
   public class_8223 field_10611;
   private class_2612 field_10605;
   private class_2612 field_10609;
   private class_9618 field_10619;
   private class_9618 field_10613;
   private float field_10620 = 0.65F;
   private float field_10606 = 1.0F - this.field_10620;
   private int field_10608 = 30;
   private class_4770 field_10612;
   private class_3937 field_10614;
   public class_8691 field_10615 = SigmaMainClass.getInstance().method_3303();
   private class_8343 field_10617;
   private float field_10598;
   private class_8223 field_10599;
   private class_6440 field_10616 = class_6440.field_32871;
   private String field_10610 = "";
   private boolean field_10618 = false;
   private class_3004 field_10604;

   public AltManagerMenu() {
      super("Alt Manager");
      this.method_32105(false);
      ArrayList var3 = new ArrayList();
      var3.add("Alphabetical");
      var3.add("Bans");
      var3.add("Date Added");
      var3.add("Last Used");
      var3.add("Use count");
      ArrayList var4 = new ArrayList();
      class_3187 var5 = new class_3187(MinecraftClient.getInstance());
      var5.method_14670();
      int var6 = var5.method_14671();

      for (int var7 = 0; var7 < var6; var7++) {
         class_2560 var8 = var5.method_14673(var7);
         if (!var4.contains(var8.field_12675)) {
            var4.add(var8.field_12675);
         }
      }

      this.method_9895();
      this.method_9901();
      this.method_32148(
         this.field_10605 = new class_2612(
            this,
            "alts",
            0,
            114,
            (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10620) - 4,
            MinecraftClient.getInstance().window.method_43163() - 119 - this.field_10608
         )
      );
      this.method_32148(
         this.field_10609 = new class_2612(
            this,
            "altView",
            (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10620),
            114,
            (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10606) - this.field_10608,
            MinecraftClient.getInstance().window.method_43163() - 119 - this.field_10608
         )
      );
      this.field_10605.method_32105(false);
      this.field_10609.method_32105(false);
      this.field_10605.method_11852(false);
      this.field_10609
         .method_32148(
            this.field_10612 = new class_4770(
               this.field_10609,
               "",
               (int)(
                        (float) MinecraftClient.getInstance().window.method_43166() * this.field_10606
                           - (float)((int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10606))
                     )
                     / 2
                  - 10,
               MinecraftClient.getInstance().window.method_43163() / 12,
               (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10606),
               350,
               "steve"
            )
         );
      this.field_10609
         .method_32148(
            this.field_10614 = new class_3937(
               this.field_10609,
               "info",
               (int)(
                        (float) MinecraftClient.getInstance().window.method_43166() * this.field_10606
                           - (float)((int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10606))
                     )
                     / 2
                  - 10,
               this.method_9902(),
               (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10606),
               500
            )
         );
      class_3366 var9 = new class_3366(
         this, "drop", (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10620) - 220, 44, 200, 32, var3, 0
      );
      var9.method_15421(var4, 1);
      var9.method_15426(2);
      this.method_32148(var9);
      var9.method_8236(var2 -> {
         switch (var9.method_15427()) {
            case 0:
               this.field_10616 = class_6440.field_32870;
               break;
            case 1:
               this.field_10616 = class_6440.field_32874;
               this.field_10610 = var9.method_15418(1).method_28426().get(var9.method_15418(1).method_28421());
               break;
            case 2:
               this.field_10616 = class_6440.field_32871;
               break;
            case 3:
               this.field_10616 = class_6440.field_32875;
               break;
            case 4:
               this.field_10616 = class_6440.field_32873;
         }

         this.method_9903(false);
      });
      this.method_32148(
         this.field_10604 = new class_3004(
            this,
            "textbox",
            (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10620),
            44,
            150,
            32,
            class_3004.field_14738,
            "",
            "Search...",
            class_5320.field_27139
         )
      );
      this.field_10604.method_32144(class_5320.field_27139);
      this.field_10604.method_13721(var1 -> this.method_9903(false));
      this.method_32148(
         this.field_10599 = new class_8223(this, "btnt", this.method_32109() - 90, 43, 70, 30, class_590.field_3421, "Add +", class_5320.field_27141)
      );
      this.field_10605.method_32162();
      this.field_10599.method_32100((var1, var2) -> {
         if (this.method_9908()) {
            this.field_10619.method_44406(!this.field_10619.method_32140());
         }
      });
   }

   private void method_9907(class_7309 var1, boolean var2) {
      class_482 var5;
      this.field_10605
         .method_32148(
            var5 = new class_482(
               this.field_10605,
               var1.method_33344(),
               this.field_10608,
               (100 + this.field_10608 / 2) * this.method_9904(),
               this.field_10605.method_32109() - this.field_10608 * 2 + 4,
               100,
               var1
            )
         );
      if (!var2) {
         var5.field_2995 = new class_2440(0, 0);
      }

      if (this.field_10615.method_39907(var1)) {
         var5.method_2283(true);
      }

      var5.method_32184((var2x, var3) -> {
         if (var3 != 0) {
            this.field_10613.method_8236(var2xx -> {
               this.field_10615.method_39916(var5.field_2988);
               this.field_10614.method_18204(null);
               this.field_10612.method_21985(null);
               this.method_9903(false);
            });
            this.field_10613.method_32177(true);
            this.field_10613.method_44406(true);
         } else {
            if (this.field_10612.field_23119 == var5.field_2988 && var5.method_2276()) {
               this.method_9890(var5);
            } else {
               this.field_10609.method_11851(0);
            }

            this.field_10612.method_21985(var5.field_2988);
            this.field_10614.method_18204(var5.field_2988);

            for (class_7038 var7 : this.field_10605.method_32134()) {
               if (!(var7 instanceof class_9568)) {
                  for (class_7038 var9 : var7.method_32134()) {
                     ((class_482)var9).method_2281(false);
                  }
               }
            }

            var5.method_2281(true);
         }
      });
      if (SigmaMainClass.getInstance().method_3303().method_39907(var1)) {
         this.field_10612.method_21985(var5.field_2988);
         this.field_10614.method_18204(var5.field_2988);
         var5.method_2282(true, true);
      }
   }

   private void method_9890(class_482 var1) {
      var1.method_2279(true);
      new Thread(() -> {
         if (!this.field_10615.method_39906(var1.field_2988)) {
            var1.method_2280(114);
            SigmaMainClass.getInstance().method_3315().method_21206("error");
         } else {
            this.method_9899();
            var1.method_2283(true);
            SigmaMainClass.getInstance().method_3315().method_21206("connect");
            this.method_9903(false);
         }

         var1.method_2279(false);
      }).start();
   }

   private void method_9895() {
      class_8888 var3 = new class_8888(class_2880.field_14100, "Add Alt", 50);
      class_8888 var4 = new class_8888(class_2880.field_14098, "Login with your minecraft", 15);
      class_8888 var5 = new class_8888(class_2880.field_14098, "account here!", 25);
      class_8888 var6 = new class_8888(class_2880.field_14102, "Email", 50);
      class_8888 var7 = new class_8888(class_2880.field_14102, "Password", 50);
      class_8888 var8 = new class_8888(class_2880.field_14097, "", 15);
      class_8888 var9 = new class_8888(class_2880.field_14103, "Add alt", 50);
      this.method_32148(this.field_10619 = new class_9618(this, "Testt", true, "Add Alt", var3, var4, var5, var6, var7, var8, var9));
      this.field_10619.method_8236(var1 -> {
         if (!this.field_10619.method_44412().get("Email").contains(":")) {
            class_7309 var11 = new class_7309(this.field_10619.method_44412().get("Email"), this.field_10619.method_44412().get("Password"));
            if (!this.field_10615.method_39910(var11)) {
               this.field_10615.method_39911(var11);
            }

            this.method_9903(false);
         } else {
            String[] var4x = this.field_10619.method_44412().get("Email").replace("\r", "\n").replace("\n\n", "\n").split("\n");

            for (String var8x : var4x) {
               String[] var9x = var8x.split(":");
               if (var9x.length == 2) {
                  class_7309 var10 = new class_7309(var9x[0], var9x[1]);
                  if (!this.field_10615.method_39910(var10)) {
                     this.field_10615.method_39911(var10);
                  }
               }
            }

            this.method_9903(false);
         }
      });
   }

   private void method_9901() {
      class_8888 var3 = new class_8888(class_2880.field_14100, "Delete?", 50);
      class_8888 var4 = new class_8888(class_2880.field_14098, "Are you sure you want", 15);
      class_8888 var5 = new class_8888(class_2880.field_14098, "to delete this alt?", 40);
      class_8888 var6 = new class_8888(class_2880.field_14103, "Delete", 50);
      this.method_32148(this.field_10613 = new class_9618(this, "delete", true, "Delete", var3, var4, var5, var6));
   }

   @Override
   public void method_32178(float var1) {
      this.method_9892();
      class_73.method_115(
         (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10620),
         114,
         (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10606) - this.field_10608,
         MinecraftClient.getInstance().window.method_43163() - 119 - this.field_10608,
         class_1255.field_6918.field_6917
      );
      this.method_9898();
      this.method_9897();
      this.method_9889();
      super.method_32178(var1);
   }

   private void method_9906() {
      if (this.field_10598 != (float)this.field_10605.method_11853()) {
         try {
            this.field_10617 = class_6568.method_30015(
               "blur",
               class_7849.method_35507(0, 0, (int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10620) - 15, 114, 4, 40, -921102)
            );
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      float var3 = this.field_10598 < 25.0F ? this.field_10598 / 25.0F : 1.0F;
      GL11.glTexParameteri(3553, 10241, 9728);
      if (this.field_10617 != null) {
         class_73.method_99(
            0.0F,
            0.0F,
            (float)((int)((float) MinecraftClient.getInstance().window.method_43166() * this.field_10620) - 15),
            114.0F,
            this.field_10617,
            class_314.method_1444(class_1255.field_6918.field_6917, var3)
         );
      }

      this.field_10598 = (float)this.field_10605.method_11853();
   }

   private void method_9898() {
   }

   private void method_9889() {
      int var3 = this.field_36270 + this.field_10608;
      int var4 = this.field_36261 + this.field_10608;
      int var5 = class_314.method_1444(class_1255.field_6929.field_6917, 0.8F);
      class_73.method_87(class_5320.field_27153, (float)var3, (float)var4, "Jello", var5);
      class_73.method_87(class_5320.field_27141, (float)(var3 + 87), (float)(var4 + 15), "Alt Manager", var5);
   }

   private void method_9897() {
      float var3 = 1.0F;

      for (class_7038 var5 : this.field_10605.method_32134()) {
         if (!(var5 instanceof class_9568)) {
            for (class_7038 var7 : var5.method_32134()) {
               if (var7 instanceof class_482) {
                  class_482 var8 = (class_482)var7;
                  if (var7.method_32173() <= MinecraftClient.getInstance().window.method_43163() && this.field_10605.method_11853() == 0) {
                     if (var3 > 0.2F) {
                        var8.field_2995.method_11119(class_4043.field_19620);
                     }

                     float var9 = class_5181.method_23766(var8.field_2995.method_11123(), 0.51, 0.82, 0.0, 0.99);
                     var8.method_32188((int)(-((1.0F - var9) * (float)(var7.method_32109() + 30))));
                     var3 = var8.field_2995.method_11123();
                  } else {
                     var8.method_32188(0);
                     var8.field_2995.method_11119(class_4043.field_19620);
                  }
               }
            }
         }
      }
   }

   private void method_9899() {
      boolean var3 = false;

      for (class_7038 var5 : this.field_10605.method_32134()) {
         if (!(var5 instanceof class_9568)) {
            for (class_7038 var7 : var5.method_32134()) {
               class_482 var8 = (class_482)var7;
               var8.method_2283(false);
            }
         }
      }
   }

   private boolean method_9908() {
      boolean var3 = false;

      for (class_7038 var5 : this.field_10605.method_32134()) {
         if (!(var5 instanceof class_9568)) {
            for (class_7038 var7 : var5.method_32134()) {
               if (var7.method_32181() != 0 && var7.method_32132() > this.field_36278) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private int method_9904() {
      int var3 = 0;

      for (class_7038 var5 : this.field_10605.method_32134()) {
         if (!(var5 instanceof class_9568)) {
            for (class_7038 var7 : var5.method_32134()) {
               var3++;
            }
         }
      }

      return var3;
   }

   private void method_9892() {
      int var3 = this.method_32189() * -1;
      float var4 = (float)this.method_32129() / (float)this.method_32109() * -114.0F;
      if (this.field_10603) {
         this.field_10602 = (float)((int)var4);
         this.field_10607 = var3;
         this.field_10603 = false;
      }

      float var5 = var4 - this.field_10602;
      float var6 = (float)(var3 - this.field_10607);
      class_73.method_96(
         (float)this.field_10607, this.field_10602, (float)(this.method_32109() * 2), (float)(this.method_32137() + 114), class_2209.field_11005
      );
      float var7 = 0.5F;
      if (var4 != this.field_10602) {
         this.field_10602 += var5 * var7;
      }

      if (var3 != this.field_10607) {
         this.field_10607 = (int)((float)this.field_10607 + var6 * var7);
      }

      class_73.method_94(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6918.field_6917, 0.95F));
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         MinecraftClient.getInstance().method_8609(new class_1876());
      }
   }

   @Override
   public JSONObjectImpl method_32180(JSONObjectImpl var1) {
      this.field_10615.method_39909();
      return var1;
   }

   @Override
   public void method_32159(JSONObjectImpl var1) {
      for (class_7038 var5 : this.field_10605.method_32134()) {
         if (!(var5 instanceof class_9568)) {
            for (class_7038 var7 : var5.method_32134()) {
               this.field_10605.method_32101(var7);
            }
         }
      }

      this.method_9903(true);
   }

   public void method_9903(boolean var1) {
      List var5 = class_4111.method_19098(this.field_10615.method_39908(), this.field_10616, this.field_10610, this.field_10604.method_32165());
      this.method_32102(new class_9717(this, this, var5, var1));
   }

   private void method_9891(Object var1) {
   }

   public int method_9902() {
      return MinecraftClient.getInstance().window.method_43163() / 12 + 280 + MinecraftClient.getInstance().window.method_43163() / 12;
   }
}
