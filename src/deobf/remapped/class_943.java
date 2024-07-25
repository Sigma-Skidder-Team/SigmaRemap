package remapped;

public class class_943 extends class_1859 {
   private class_1552 field_4811;
   private class_3004 field_4817;
   private class_3004 field_4814;
   private class_3004 field_4818;
   private class_8223 field_4816;
   private class_8223 field_4819;
   private class_8223 field_4820;
   private class_1581 field_4812;
   public static int field_4813 = 334;
   public static int field_4815 = 571;

   public class_943(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_32148(
         this.field_4811 = new class_1552(
            this,
            "Login",
            228,
            43,
            class_5320.field_27147.method_18547("Login"),
            50,
            new class_590(class_1255.field_6929.field_6917, class_1255.field_6929.field_6917, class_1255.field_6929.field_6917, -7631989),
            "Login",
            class_5320.field_27147
         )
      );
      this.method_32148(
         this.field_4816 = new class_8223(
            this, "LoginButton", 468, 238, class_5320.field_27141.method_18547("Login"), 70, class_590.field_3421, "Login", class_5320.field_27141
         )
      );
      this.method_32148(
         this.field_4819 = new class_8223(
            this, "RegisterButton", 88, 250, class_5320.field_27138.method_18547("Register"), 14, class_590.field_3421, "Register", class_5320.field_27138
         )
      );
      this.method_32148(
         this.field_4820 = new class_8223(
            this,
            "ForgotButton",
            60,
            275,
            class_5320.field_27138.method_18547("Forgot password?"),
            14,
            class_590.field_3421,
            "Forgot password?",
            class_5320.field_27138
         )
      );
      this.method_32148(this.field_4812 = new class_1581(this, "loading", 511, 260, 30, 30));
      this.field_4812.method_32119(false);
      this.field_4812.method_32091(true);
      byte var9 = 50;
      short var10 = 300;
      byte var11 = 106;
      class_590 var12 = new class_590(-892679478, -892679478, -892679478, class_1255.field_6920.field_6917, class_6206.field_31724, class_6206.field_31726);
      this.method_32148(this.field_4817 = new class_3004(this, "Username", 228, var11, var10, var9, var12, "", "Username"));
      this.method_32148(this.field_4814 = new class_3004(this, "Password", 228, var11 + 53, var10, var9, var12, "", "Password"));
      this.field_4817.method_32144(class_5320.field_27152);
      this.field_4814.method_32144(class_5320.field_27152);
      this.field_4814.method_13726(true);
      this.method_32148(this.field_4818 = new class_3004(this, "CaptchaBox", 228, var11 + 135, 84, var9, var12, "", "Captcha"));
      this.field_4818.method_32144(class_5320.field_27152);
      this.field_4818.method_32104(false);
      this.field_4816.method_32100((var1x, var2x) -> this.method_4081());
      this.field_4819.method_32100((var1x, var2x) -> {
         class_5702 var5x = (class_5702)this.method_32167();
         var5x.method_25788();
      });
      this.field_4820.method_32100((var0, var1x) -> class_9665.method_44667().method_37581("https://sigmaclient.info/pwdreset.php"));
   }

   @Override
   public void method_32178(float var1) {
      super.method_32190();
      super.method_32130();
      byte var4 = 28;
      class_73.method_97((float)(this.field_36270 + var4), (float)(this.field_36261 + var4 + 10), 160.0F, 160.0F, class_2209.field_11049, var1);
      class_8646 var5 = SigmaMainClass.method_3328().method_3332().method_23083();
      if (var5 != null) {
         this.field_4818.method_32104(var5.method_39653());
         if (var5.method_39653()) {
            class_73.method_103(
               (float)(this.field_36270 + 330), (float)(this.field_36261 + 255), 114.0F, 40.0F, class_314.method_1444(class_1255.field_6929.field_6917, 0.04F)
            );
         }

         if (var5.method_39654() != null) {
            class_73.method_135((float)(this.field_36270 + 316), (float)(this.field_36261 + 255), 190.0F, 50.0F);
            class_73.method_96((float)(this.field_36270 + 316), (float)(this.field_36261 + 255), 190.0F, 190.0F, var5.method_39654());
            class_73.method_141();
         }
      }

      super.method_32178(var1);
   }

   public void method_4081() {
      new Thread(() -> {
         this.field_4812.method_32119(true);
         this.field_4816.method_32104(false);
         class_8646 var3 = SigmaMainClass.method_3328().method_3332().method_23083();
         if (var3 != null) {
            var3.method_39656(this.field_4818.method_32165());
         }

         SigmaMainClass.method_3328().method_3332().method_23089();
         String var4 = SigmaMainClass.method_3328().method_3332().method_23079(this.field_4817.method_32165(), this.field_4814.method_32165(), var3);
         if (var4 != null) {
            class_5702 var5 = (class_5702)this.method_32167();
            var5.method_25789("Error", var4);
            this.field_4818.method_32186("");
         } else {
            this.method_8235();
         }

         this.field_4812.method_32119(false);
         this.field_4816.method_32104(true);
      }).start();
   }
}
