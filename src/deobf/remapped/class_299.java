package remapped;

import java.io.IOException;

public class class_299 extends class_446 {
   public class_7038 field_1093;
   public class_2440 field_1086;
   public class_2440 field_1084;
   public class_2440 field_1085;
   public class_1675 field_1090;
   public class_3004 field_1089;
   public int field_1094;
   public final int field_1092;
   public final int field_1091;
   public boolean field_1087 = false;

   public class_299(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_1675 var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_1092 = (int)((float)var5 * 0.8F);
      this.field_1090 = var7;
      this.field_1091 = var6;
      class_590 var11 = class_590.field_3421.method_2763();
      var11.method_2772(-11371052);
      var11.method_2766(-12096331);
      var11.method_2765(class_1255.field_6918.field_6917);
      class_590 var12 = class_590.field_3421.method_2763();
      var12.method_2772(-3254955);
      var12.method_2766(-4700859);
      var12.method_2765(class_1255.field_6918.field_6917);
      this.method_32148(this.field_1093 = new class_4989(this, "edit", var5 - this.field_1092, 0, this.field_1092, var6));
      class_848 var13;
      this.field_1093.method_32148(var13 = new class_848(this.field_1093, "rename", 0, 0, this.field_1092 / 2, var6, var11, "Rename"));
      class_848 var14;
      this.field_1093.method_32148(var14 = new class_848(this.field_1093, "remove", this.field_1092 / 2, 0, this.field_1092 / 2, var6, var12, "Delete"));
      this.field_1093.method_32119(false);
      class_590 var15 = new class_590(-892679478, -892679478, -892679478, class_1255.field_6929.field_6917, class_6206.field_31724, class_6206.field_31726);
      this.method_32148(this.field_1089 = new class_3004(this, "profileName", 16, 8, this.method_32109() - 60, 50, var15, var7.field_8677));
      this.field_1089.method_13724(false);
      this.field_1089.method_32144(class_5320.field_27150);
      this.field_1089.method_32104(false);
      this.field_1089.method_32143((var2x, var3x) -> {
         if (this.field_1089.method_32098() && var3x == 257) {
            this.field_1089.method_32104(false);
            this.field_1089.method_32177(false);
            if (SigmaMainClass.getInstance().getModuleManager().method_848().method_4299(this.field_1089.method_32165())) {
               return;
            }

            var7.field_8677 = this.field_1089.method_32165();

            try {
               SigmaMainClass.getInstance().getModuleManager().method_848().method_4306();
            } catch (IOException var7x) {
            }
         }
      });
      var13.method_32144(class_5320.field_27139);
      var14.method_32144(class_5320.field_27139);
      var13.method_32135((var0, var1x) -> var0.method_32142(Math.round((float)var1x.method_32109() / 2.0F)));
      var14.method_32135((var0, var1x) -> {
         var0.method_32175(Math.round((float)var1x.method_32109() / 2.0F));
         var0.method_32142(Math.round((float)var1x.method_32109() / 2.0F));
      });
      var14.method_32100((var1x, var2x) -> this.field_1085.method_11119(class_4043.field_19620));
      var13.method_32100((var1x, var2x) -> {
         this.field_1084.method_11119(class_4043.field_19618);
         this.field_1089.method_32104(true);
         this.field_1089.method_13720();
      });
      this.field_1093.method_32142(0);
      this.field_1093.method_32188(this.field_1092);
      this.field_1086 = new class_2440(100, 100, class_4043.field_19618);
      this.field_1084 = new class_2440(290, 290, class_4043.field_19618);
      this.field_1085 = new class_2440(200, 100, class_4043.field_19618);
      this.method_32100((var1x, var2x) -> {
         if (var2x != 1) {
            this.field_1084.method_11119(class_4043.field_19618);
            if (this.field_1084.method_11123() == 0.0F) {
               SigmaMainClass.getInstance().getModuleManager().method_848().method_4300(this.field_1090);
               SigmaMainClass.getInstance().method_3315().method_21206("switch");
               class_2099 var5x = (class_2099)this.method_32167().method_32167().method_32167();
               var5x.method_32102(() -> var5x.method_9847());

               for (Module var7x : SigmaMainClass.getInstance().getModuleManager().method_843().values()) {
                  if (var7x instanceof class_367 && !SigmaMainClass.getInstance().method_3332().method_23084()) {
                     var7x.method_42018(false);
                  }
               }
            }
         } else {
            this.field_1084.method_11119(class_4043.field_19620);
         }
      });
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (!this.field_1089.method_32098() && this.field_1089.method_32126()) {
         this.field_1089.method_32104(false);
         this.field_1089.method_32177(false);
         this.field_1090.field_8677 = this.field_1089.method_32165();

         try {
            SigmaMainClass.getInstance().getModuleManager().method_848().method_4306();
         } catch (IOException var6) {
         }
      }

      this.field_1086.method_11119(this.method_32120(var1, var2) ? class_4043.field_19620 : class_4043.field_19618);
      if (!this.method_32120(var1, var2)) {
         this.field_1084.method_11119(class_4043.field_19618);
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_1085.method_11123() == 1.0F && !this.field_1087) {
         this.field_1087 = true;
         class_2099 var4 = (class_2099)this.method_32167().method_32167().method_32167();
         SigmaMainClass.getInstance().getModuleManager().method_848().method_4303(this.field_1090);
         var4.method_32102(() -> var4.method_9847());
      }

      float var8 = class_5181.method_23766(this.field_1085.method_11123(), 0.1, 0.81, 0.14, 1.0);
      this.method_32158(Math.round((1.0F - var8) * (float)this.field_1091));
      var1 *= 1.0F - this.field_1085.method_11123();
      float var5 = class_5181.method_23766(this.field_1084.method_11123(), 0.28, 1.26, 0.33, 1.04);
      if (this.field_1084.method_11128().equals(class_4043.field_19618)) {
         var5 = class_3483.method_15984(this.field_1084.method_11123(), 0.0F, 1.0F, 1.0F);
      }

      this.field_1093.method_32119(this.field_1084.method_11123() == 1.0F);
      this.field_1093.method_32142(Math.max(0, (int)((float)this.field_1092 * var5)));
      this.field_1093.method_32188((int)((float)this.field_1092 * (1.0F - var5)));
      class_73.method_151(this);
      float var6 = this.method_32185() && this.field_1084.method_11128().equals(class_4043.field_19618) ? 0.03F : 0.0F;
      class_73.method_103(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.04F * this.field_1086.method_11123() + var6)
      );
      if (!this.field_1089.method_32098()) {
         class_73.method_87(
            class_5320.field_27150,
            (float)(this.field_36270 + 20) - var5 * (float)this.field_36278,
            (float)(this.field_36261 + 18),
            this.field_1090.field_8677,
            class_314.method_1444(class_1255.field_6929.field_6917, 0.9F * var1)
         );
      }

      this.field_1089.method_32188(Math.round(-var5 * (float)this.field_36278));
      if (SigmaMainClass.getInstance().getModuleManager().method_848().method_4301() == this.field_1090) {
         class_73.method_99(
            (float)(this.method_32132() + this.method_32109() - 35) - var5 * (float)this.field_36278,
            (float)(this.method_32173() + 27),
            17.0F,
            13.0F,
            NotificationIcons.field_11008,
            class_314.method_1444(class_1255.field_6918.field_6917, (1.0F - this.field_1084.method_11123()) * var1)
         );
      }

      super.method_32178(var1);
      class_73.method_141();
   }
}
