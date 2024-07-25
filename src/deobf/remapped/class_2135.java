package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_2135 extends class_2596 {
   private int field_10707;
   private float field_10702;
   private float field_10697 = 0.75F;
   private boolean field_10694 = true;
   public class_8223 field_10704;
   private class_3241 field_10701;
   private class_9618 field_10692;
   private class_9618 field_10710;
   private float field_10705 = 0.65F;
   private float field_10698 = 1.0F - this.field_10705;
   private int field_10703 = 30;
   public class_8691 field_10709 = class_727.method_3328().method_3303();
   private class_8343 field_10693;
   private float field_10696;
   private class_6440 field_10699 = class_6440.field_32871;
   private boolean field_10700 = false;
   private class_9486 field_10695;
   private class_5956 field_10711;
   private String field_10708 = "§7Idle...";

   public class_2135() {
      super("Alt Manager");
      this.method_32105(false);
      class_4879 var3;
      this.method_32148(var3 = new class_4879(this, "particles"));
      var3.method_32091(true);
      ArrayList var4 = new ArrayList();
      class_3187 var5 = new class_3187(class_1893.method_8510());
      var5.method_14670();
      int var6 = var5.method_14671();

      for (int var7 = 0; var7 < var6; var7++) {
         class_2560 var8 = var5.method_14673(var7);
         if (!var4.contains(var8.field_12675)) {
            var4.add(var8.field_12675);
         }
      }

      short var9 = 790;
      this.method_32148(
         this.field_10695 = new class_9486(
            this,
            "textbox",
            (class_1893.method_8510().field_9602.method_43166() - var9) / 2 - 140,
            this.method_32137() - 40,
            140,
            32,
            class_3004.field_14738,
            "",
            "Search...",
            class_5320.field_27139
         )
      );
      this.field_10695.method_32144(class_5320.field_27156);
      this.field_10695.method_13721(var1 -> this.method_9989());
      this.method_9986();
      this.method_32148(
         this.field_10711 = new class_5956(this, "toolbar", (class_1893.method_8510().field_9602.method_43166() - var9) / 2 + 16, this.method_32137() - 94)
      );
      this.field_10711.method_32119(false);
   }

   private void method_9990(class_7309 var1) {
      byte var4 = 52;
      class_9192 var5;
      this.field_10701
         .method_32148(
            var5 = new class_9192(this.field_10701, var1.method_33344(), 4, var4 * this.method_9984() + 4, this.field_10701.method_32109() - 8, var4, var1)
         );
      var5.method_32100((var2, var3) -> {
         if (var3 == 0) {
            class_9192 var6 = this.method_9983();
            if (var6 != null) {
               var6.method_42375(false);
            }

            var5.method_42375(true);
            this.field_10711.method_32119(true);
            if (var6 != null && var6.equals(var5)) {
               this.method_9988(var5);
            }
         }
      });
   }

   public void method_9985() {
      class_9192 var3 = this.method_9983();
      if (var3 != null) {
         this.method_9988(var3);
      }
   }

   public void method_9980() {
      class_9192 var3 = this.method_9983();
      if (var3 != null) {
         this.field_10709.method_39915(var3.field_47028);
         this.field_10711.method_32119(false);
         this.method_9989();
      }
   }

   public void method_9988(class_9192 var1) {
      this.method_9987(var1.field_47028);
   }

   public void method_9987(class_7309 var1) {
      this.field_10708 = "§bLogging in...";
      new Thread(() -> {
         if (!this.field_10709.method_39906(var1)) {
            this.field_10708 = "§cLogin Failed!";
         } else {
            this.field_10708 = "§aLogged in. (" + var1.method_33328() + (!var1.method_33338() ? "" : " - offline name") + ")";
         }
      }).start();
   }

   @Override
   public void method_32178(float var1) {
      this.method_9981();
      super.method_32178(var1);
      class_73.method_87(class_5320.field_27156, 20.0F, 20.0F, class_1893.method_8510().method_8502().method_5366(), -2236963);
      class_73.method_88(
         class_5320.field_27156,
         (float)(this.method_32109() / 2),
         20.0F,
         "Account Manager - " + this.method_9984() + " alts",
         class_1255.field_6918.field_6917,
         class_6206.field_31726,
         class_6206.field_31724
      );
      class_73.method_89(
         class_5320.field_27156,
         (float)(this.method_32109() / 2),
         40.0F,
         this.field_10708,
         class_1255.field_6918.field_6917,
         class_6206.field_31726,
         class_6206.field_31724,
         false
      );
   }

   private int method_9984() {
      int var3 = 0;

      for (class_7038 var5 : this.field_10701.method_32134()) {
         if (!(var5 instanceof class_9568)) {
            for (class_7038 var7 : var5.method_32134()) {
               var3++;
            }
         }
      }

      return var3;
   }

   private void method_9981() {
      class_73.method_96(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_3054.field_15004);
      class_73.method_103(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6929.field_6917, 0.23F));
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         class_1893.method_8510().method_8609(new class_1876());
      }
   }

   @Override
   public class_1293 method_32180(class_1293 var1) {
      this.field_10709.method_39909();
      return var1;
   }

   @Override
   public void method_32159(class_1293 var1) {
      for (class_7038 var5 : this.field_10701.method_32134()) {
         if (!(var5 instanceof class_9568)) {
            for (class_7038 var7 : var5.method_32134()) {
               this.field_10701.method_32101(var7);
            }
         }
      }

      this.method_9989();
   }

   public void method_9989() {
      this.method_32102(new class_3819(this));
   }

   public void method_9986() {
      List var4 = class_4111.method_19098(this.field_10709.method_39908(), class_6440.field_32871, "", this.field_10695.method_32165());
      int var5 = 0;
      if (this.field_10701 != null) {
         var5 = this.field_10701.method_11853();
         this.method_32179(this.field_10701);
      }

      class_7038 var6 = this.method_32094("alts");
      if (var6 != null) {
         this.method_32179(var6);
      }

      int var7 = class_1893.method_8510().field_9602.method_43166() - 200;
      int var8 = this.method_32109() - var7;
      this.method_32150(this.field_10701 = new class_3241(this, "alts", var8 / 2, 69, var7, class_1893.method_8510().field_9602.method_43163() - 169));

      for (class_7309 var10 : var4) {
         this.method_9990(var10);
      }

      this.field_10701.method_11851(var5);
      this.field_10701.method_32105(false);
      this.field_10701.method_11852(true);
      this.field_10701.method_32162();
   }

   private void method_9979(Object var1) {
   }

   public int method_9982() {
      return class_1893.method_8510().field_9602.method_43163() / 12 + 280 + class_1893.method_8510().field_9602.method_43163() / 12;
   }

   public class_9192 method_9983() {
      for (class_7038 var4 : this.field_10701.method_32134()) {
         if (!(var4 instanceof class_9568)) {
            for (class_7038 var6 : var4.method_32134()) {
               if (var6 instanceof class_9192) {
                  class_9192 var7 = (class_9192)var6;
                  if (var7.method_42378()) {
                     return var7;
                  }
               }
            }
         }
      }

      return null;
   }
}
