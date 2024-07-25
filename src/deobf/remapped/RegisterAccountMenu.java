package remapped;

public class RegisterAccountMenu extends class_1859 {
   private class_1552 field_40928;
   private class_3004 field_40936;
   private class_3004 field_40935;
   private class_3004 field_40933;
   private class_3004 field_40937;
   private class_8223 field_40929;
   private class_8223 field_40926;
   private class_8223 field_40930;
   private class_1581 field_40934;
   public static int field_40931 = 390;
   public static int field_40927 = 590;

   public RegisterAccountMenu(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_32148(
         this.field_40928 = new class_1552(
            this,
            "Register",
            228,
            43,
            class_5320.field_27147.method_18547("New Account"),
            50,
            new class_590(class_1255.field_6929.field_6917, class_1255.field_6929.field_6917, class_1255.field_6929.field_6917, -7631989),
            "New Account",
            class_5320.field_27147
         )
      );
      this.method_32148(
         this.field_40929 = new class_8223(
            this, "RegisterButton", 468, 291, class_5320.field_27141.method_18547("Register"), 70, class_590.field_3421, "Register", class_5320.field_27141
         )
      );
      this.method_32148(
         this.field_40926 = new class_8223(
            this, "LoginButton", 98, 333, class_5320.field_27138.method_18547("Login"), 14, class_590.field_3421, "Login", class_5320.field_27138
         )
      );
      this.method_32148(this.field_40934 = new class_1581(this, "loading", 530, 314, 30, 30));
      this.field_40934.method_32119(false);
      this.field_40934.method_32091(true);
      byte var9 = 50;
      short var10 = 320;
      byte var11 = 106;
      class_590 var12 = new class_590(-892679478, -892679478, -892679478, class_1255.field_6920.field_6917, class_6206.field_31724, class_6206.field_31726);
      this.method_32148(this.field_40936 = new class_3004(this, "Username", 228, var11, var10, var9, var12, "", "Username"));
      this.field_40936.method_32144(class_5320.field_27152);
      this.method_32148(this.field_40935 = new class_3004(this, "Email", 228, var11 + 53, var10, var9, var12, "", "Email"));
      this.field_40935.method_32144(class_5320.field_27152);
      this.method_32148(this.field_40933 = new class_3004(this, "Password", 228, var11 + 106, var10, var9, var12, "", "Password"));
      this.field_40933.method_32144(class_5320.field_27152);
      this.field_40933.method_13726(true);
      this.method_32148(this.field_40937 = new class_3004(this, "CaptchaBox", 228, var11 + 53 + 135, 80, var9, var12, "", "Captcha"));
      this.field_40937.method_32144(class_5320.field_27152);
      this.field_40937.method_32104(false);
      this.field_40929.method_32100((var1x, var2x) -> this.method_36249());
      this.field_40926.method_32100((var1x, var2x) -> {
         class_5702 var5x = (class_5702)this.method_32167();
         var5x.method_25786();
      });
   }

   @Override
   public void method_32178(float var1) {
      super.method_32190();
      super.method_32130();
      byte var4 = 28;
      class_73.method_97((float)(this.field_36270 + var4), (float)(this.field_36261 + var4 + 10), 160.0F, 160.0F, NotificationIcons.sigmamental, var1);
      short var5 = 305;
      short var6 = 316;
      class_8646 var7 = SigmaMainClass.getInstance().getAccountManager().method_23083();
      if (var7 != null) {
         this.field_40937.method_32104(var7.method_39653());
         if (var7.method_39653()) {
            class_73.method_103(
               (float)(this.field_36270 + var6),
               (float)(this.field_36261 + var5),
               114.0F,
               40.0F,
               class_314.method_1444(class_1255.field_6929.field_6917, 0.04F)
            );
         }

         if (var7.method_39654() != null) {
            class_73.method_135((float)(this.field_36270 + var6), (float)(this.field_36261 + var5), 190.0F, 50.0F);
            class_73.method_96((float)(this.field_36270 + var6), (float)(this.field_36261 + var5), 190.0F, 190.0F, var7.method_39654());
            class_73.method_141();
         }
      }

      super.method_32178(var1);
   }

   public void method_36249() {
      new Thread(
            () -> {
               this.field_40934.method_32119(true);
               this.field_40929.method_32104(false);
               class_8646 var3 = SigmaMainClass.getInstance().getAccountManager().method_23083();
               if (var3 != null) {
                  var3.method_39656(this.field_40937.method_32165());
               }

               SigmaMainClass.getInstance().getAccountManager().method_23089();
               String var4 = SigmaMainClass.getInstance()
                  .getAccountManager()
                  .method_23082(this.field_40936.method_32165(), this.field_40933.method_32165(), this.field_40935.method_32165(), var3);
               class_5702 var5 = (class_5702)this.method_32167();
               if (var4 != null) {
                  var5.method_25789("Error", var4);
                  this.field_40937.method_32186("");
               } else {
                  var5.method_25789("Success", "You can now login.");
                  var5.method_25786();
               }

               this.field_40934.method_32119(false);
               this.field_40929.method_32104(true);
            }
         )
         .start();
   }
}
