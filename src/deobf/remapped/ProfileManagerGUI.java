package remapped;

public class ProfileManagerGUI extends class_1859 {
   public class_2440 field_16351 = new class_2440(300, 200, class_4043.field_19618);
   private final int field_16347;
   private class_2612 field_16348;
   public static class_3969 field_16350;
   private class_1581 field_16352;

   public ProfileManagerGUI(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, 0, class_590.field_3421, false);
      class_8223 var9;
      this.method_32148(
         var9 = new class_8223(
            this, "blankButton", 25, 0, class_5320.field_27152.method_18547("Blank"), 30, class_590.field_3421, "Blank", class_5320.field_27152
         )
      );
      var9.method_32100((var1x, var2x) -> {
         class_2099 var5x = (class_2099)this.method_32167();
         var5x.method_9848();
      });
      class_8223 var10;
      this.method_32148(
         var10 = new class_8223(
            this,
            "dupeButton",
            var5 - 25 - class_5320.field_27152.method_18547("Duplicate"),
            0,
            class_5320.field_27152.method_18547("Duplicate"),
            30,
            class_590.field_3421,
            "Duplicate",
            class_5320.field_27152
         )
      );
      var10.method_32100((var1x, var2x) -> {
         class_2099 var5x = (class_2099)this.method_32167();
         var5x.method_9846();
      });
      this.method_32148(this.field_16352 = new class_1581(this, "loading", (var5 - 30) / 2, 100, 30, 30));
      this.method_32148(this.field_16348 = new class_2612(this, "defaultProfiles", 0, 40, var5, var6 - 40));
      field_16350 = new class_3969(
         var2x -> {
            this.field_16352.method_32104(false);
            class_2099 var5x = (class_2099)this.method_32167();

            for (String var7 : var2x) {
               class_6220 var8;
               this.field_16348
                  .method_32148(
                     var8 = new class_6220(
                        this.field_16348, "p_" + var7, 0, 0, var5, 30, new class_590(-723724, -2039584, 0, -14671840), var7, class_5320.field_27139
                     )
                  );
               var8.method_32100((var3x, var4x) -> {
                  this.method_15157(true);
                  new Thread(() -> {
                     SigmaMainClass.getInstance();
                     ConfigManager var5xx = SigmaMainClass.getInstance().getModuleManager().getConfigManager();
                     class_1675 var6x = var5xx.method_4301();
                     class_1675 var7x = field_16350.method_18327(var6x, var7);
                     var5x.method_9849(var7x);
                     this.method_15157(false);
                  }).start();
               });
            }

            this.field_16348.method_11850().method_32153(new class_8348(1));
         }
      );
      this.field_16347 = var6;
   }

   public void method_15157(boolean var1) {
      this.field_16348.method_32104(!var1);
      this.field_16352.method_32104(var1);
   }

   public void method_15155(boolean var1) {
      this.field_16351.method_11119(!var1 ? class_4043.field_19618 : class_4043.field_19620);
   }

   public boolean method_15156() {
      return this.field_16351.method_11128() == class_4043.field_19620;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      float var4 = class_5181.method_23766(this.field_16351.method_11123(), 0.1, 0.81, 0.14, 1.0);
      if (this.field_16351.method_11128() == class_4043.field_19618) {
         var4 = class_5181.method_23766(this.field_16351.method_11123(), 0.61, 0.01, 0.87, 0.16);
      }

      this.method_32158((int)((float)this.field_16347 * var4));
      if (this.field_16351.method_11123() != 0.0F) {
         class_73.method_99(
            (float)this.field_36270,
            (float)(this.field_36261 + this.field_36257),
            (float)this.field_36278,
            50.0F,
            NotificationIcons.shadow_bottom,
            class_314.method_1444(class_1255.field_6918.field_6917, this.field_16351.method_11123() * var1 * 0.3F)
         );
         class_73.method_151(this);
         class_73.method_103(
            (float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257, class_314.method_1444(-723724, var1)
         );
         if (field_16350 != null && class_3969.field_19214 != null && class_3969.field_19214.isEmpty()) {
            class_73.method_87(
               class_5320.field_27138,
               (float)(this.field_36270 + 40),
               (float)(this.field_36261 + 110),
               "No Default Profiles Available",
               class_1255.field_6920.field_6917
            );
         }

         super.method_32178(var1);
         class_73.method_141();
      }
   }
}
