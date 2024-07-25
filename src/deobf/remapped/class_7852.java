package remapped;

public class class_7852 extends class_7038 {
   public String field_39791 = "";
   public class_2440 field_39793 = new class_2440(380, 200, class_4043.field_19618);
   private static JSONArray field_39794;
   private class_3004 field_39795;

   public class_7852(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method_32105(false);
      class_3004 var9;
      this.method_32148(var9 = new class_3004(this, "redeemBox", 100, 200, 350, 50, class_3004.field_14753, "", "Premium Code"));
      class_8223 var10;
      this.method_32148(
         var10 = new class_8223(
            this,
            "redeembtn",
            100,
            290,
            80,
            30,
            new class_590(class_1255.field_6918.field_6917, class_1255.field_6918.field_6917, class_1255.field_6918.field_6917),
            "Redeem",
            class_5320.field_27152
         )
      );
      this.method_32148(this.field_39795 = new class_3004(this, "captcha", 195, 290, 75, 35, class_3004.field_14753, "", "Captcha"));
      this.field_39795.method_32144(class_5320.field_27139);
      this.field_39795.method_32104(false);
      var10.method_32100((var2x, var3x) -> new Thread(() -> {
            class_8646 var4x = SigmaMainClass.getInstance().method_3332().method_23083();
            if (var4x != null) {
               var4x.method_39656(this.field_39795.method_32165());
            }

            this.field_39791 = SigmaMainClass.getInstance().method_3332().method_23085(var9.method_32165(), SigmaMainClass.getInstance().method_3332().method_23083());
            if (this.field_39791 == null) {
               this.field_39791 = "";
            }

            if (SigmaMainClass.getInstance().method_3332().method_23084()) {
               this.method_32102(() -> ((ExitScreenMenu)this.method_32167()).method_29470());
            }
         }).start());
   }

   @Override
   public void method_32178(float var1) {
      this.field_39793.method_11119(!this.method_32140() ? class_4043.field_19618 : class_4043.field_19620);
      var1 = 1.0F;
      var1 *= this.field_39793.method_11123();
      float var4 = class_5181.method_23766(this.field_39793.method_11123(), 0.17, 1.0, 0.51, 1.0);
      if (this.field_39793.method_11128() == class_4043.field_19618) {
         var4 = 1.0F;
      }

      this.method_32124((int)(150.0F * (1.0F - var4)));
      this.method_32130();
      class_8646 var5 = SigmaMainClass.getInstance().method_3332().method_23083();
      if (var5 != null) {
         this.field_39795.method_32104(var5.method_39653());
         if (var5.method_39654() != null) {
            class_73.method_135((float)(this.field_36270 + 295), (float)(this.field_36261 + 280), 190.0F, 50.0F);
            class_73.method_99(
               (float)(this.field_36270 + 316),
               (float)(this.field_36261 + 280),
               190.0F,
               190.0F,
               var5.method_39654(),
               class_314.method_1444(class_1255.field_6918.field_6917, var1)
            );
            class_73.method_141();
         }
      }

      class_73.method_87(class_5320.field_27140, 100.0F, 100.0F, "Redeem Premium", class_314.method_1444(class_1255.field_6918.field_6917, var1));
      class_73.method_87(
         class_5320.field_27141,
         100.0F,
         150.0F,
         "Visit http://sigmaclient.info for more info",
         class_314.method_1444(class_1255.field_6918.field_6917, 0.6F * var1)
      );
      class_73.method_87(class_5320.field_27139, 100.0F, 263.0F, this.field_39791, class_314.method_1444(class_1255.field_6918.field_6917, 0.6F * var1));
      super.method_32178(var1);
   }
}
