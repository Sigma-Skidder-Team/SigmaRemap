package remapped;

public class AnotherSigmaMainMenu extends class_7038 {
   private final class_6220 field_8718;
   private final class_6220 field_8721;
   private final class_6220 field_8713;
   private final class_6220 field_8717;
   private final class_6220 field_8723;
   private final class_8911 field_8719;
   private final class_1552 field_8720;
   private final class_1552 field_8722;
   private final class_7400 field_8716;
   private final class_8223 field_8724;
   private final class_8223 field_8714;
   public int field_8712 = 0;

   public AnotherSigmaMainMenu(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method_32105(false);
      boolean var9 = false;
      boolean var10 = false;
      byte var11 = 2;
      byte var12 = 2;
      short var13 = 128;
      short var14 = 128;
      class_3384 var15 = class_5320.field_27152;
      class_3384 var16 = class_5320.field_27139;
      int var17 = 0;
      byte var18 = 80;
      byte var19 = 10;
      String var20 = "© Sigma Prod";
      StringBuilder var10000 = new StringBuilder().append("Jello for Sigma ");
      SigmaMainClass.method_3328();
      String var21 = var10000.append(SigmaMainClass.field_3957).append("  -  1.8 to ").append(class_3347.field_16514.method_2045()).toString();
      this.method_32148(
         this.field_8718 = new class_8443(
            this,
            "Singleplayer",
            this.method_7602(var17++),
            this.method_7599(),
            128,
            128,
            class_2209.field_11012,
            new class_590(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917)
         )
      );
      this.method_32148(
         this.field_8721 = new class_8443(
            this,
            "Multiplayer",
            this.method_7602(var17++),
            this.method_7599(),
            128,
            128,
            class_2209.field_11015,
            new class_590(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917)
         )
      );
      this.method_32148(
         this.field_8713 = new class_8443(
            this,
            "Realms",
            this.method_7602(var17++),
            this.method_7599(),
            128,
            128,
            class_2209.field_10999,
            new class_590(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917)
         )
      );
      this.method_32148(
         this.field_8717 = new class_8443(
            this,
            "Options",
            this.method_7602(var17++),
            this.method_7599(),
            128,
            128,
            class_2209.field_11029,
            new class_590(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917)
         )
      );
      this.method_32148(
         this.field_8723 = new class_8443(
            this,
            "Alt Manager",
            this.method_7602(var17++),
            this.method_7599(),
            128,
            128,
            class_2209.field_10990,
            new class_590(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917)
         )
      );
      this.method_32148(
         this.field_8722 = new class_1552(
            this, "Copyright", 10, this.method_32137() - 31, var15.method_18547(var20), 128, new class_590(class_1255.field_6918.field_6917), var20, var15
         )
      );
      this.method_32148(
         this.field_8720 = new class_1552(
            this,
            "Version",
            this.method_32109() - var15.method_18547(var21) - 9,
            this.method_32137() - 31,
            128,
            128,
            new class_590(class_1255.field_6918.field_6917),
            var21,
            var15
         )
      );
      this.field_8722.field_8207 = true;
      this.field_8720.field_8207 = true;
      this.method_32148(
         this.field_8724 = new class_8223(
            this,
            "changelog",
            432,
            24,
            110,
            50,
            new class_590(class_314.method_1444(class_1255.field_6918.field_6917, 0.7F)),
            "Changelog",
            class_5320.field_27152
         )
      );
      this.method_32148(
         this.field_8714 = new class_8223(
            this, "quit", 30, 24, 50, 50, new class_590(class_314.method_1444(class_1255.field_6918.field_6917, 0.4F)), "Exit", class_5320.field_27152
         )
      );
      this.field_8714.method_32100((var1x, var2x) -> {
         ((class_6470)this.method_32167()).method_29473();
         new Thread(() -> {
            try {
               Thread.sleep(1900L);
            } catch (InterruptedException var3x) {
            }

            MinecraftClient.getInstance().method_8512();
         }).start();
      });
      this.method_32148(this.field_8716 = new class_7400(this, "Account", 0, var19, 0, var18, "Log in"));
      this.method_32148(this.field_8719 = new class_8911(this, "pre", 0, 0, 240, 100));
      this.field_8719.method_32184((var1x, var2x) -> {
         if (SigmaMainClass.method_3328().method_3332().method_23081() != null) {
            ((class_6470)this.method_32167()).method_29468();
         } else {
            this.method_7601(new class_5702());
         }
      });
      this.field_8724.method_32100((var1x, var2x) -> ((class_6470)this.method_32167()).method_29472());
      this.field_8718.method_32100((var1x, var2x) -> this.method_7600(new class_7899(MinecraftClient.getInstance().field_9623)));
      this.field_8721.method_32100((var1x, var2x) -> this.method_7600(new class_9888(MinecraftClient.getInstance().field_9623)));
      this.field_8717
         .method_32100((var1x, var2x) -> this.method_7600(new OptionsScreen(MinecraftClient.getInstance().field_9623, MinecraftClient.getInstance().field_9577)));
      this.field_8723.method_32100((var1x, var2x) -> this.method_7601(new AltManagerMenu()));
      this.field_8713.method_32100((var1x, var2x) -> this.method_7597());
      this.field_8716.method_32100((var1x, var2x) -> {
         if (SigmaMainClass.method_3328().method_3332().method_23081() != null) {
            ((class_6470)this.method_32167()).method_29469();
         } else {
            this.method_7601(new class_5702());
         }
      });
      this.field_8722.method_32100((var1x, var2x) -> {
         if (this.field_8712++ > 8) {
            SigmaMainClass.method_3328().method_3299().method_30990(new class_3829());
         }
      });
   }

   public void method_7597() {
      class_3347.field_16509 = class_3347.field_16514;
      class_2488 var3 = new class_2488();
      var3.method_11390(MinecraftClient.getInstance().field_9623);
      this.method_7598();
   }

   @Override
   public void method_32178(float var1) {
      this.method_32190();
      class_8343 var4 = class_2209.field_11032;
      int var5 = var4.method_38415();
      int var6 = var4.method_38421();
      if (class_6763.field_34898 > 1.0F) {
         var4 = class_2209.field_11058;
      }

      class_73.method_99(
         (float)(this.method_32109() / 2 - var5 / 2),
         (float)(this.method_32137() / 2 - var6),
         (float)var5,
         (float)var6,
         class_2209.field_11032,
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      super.method_32178(var1);
   }

   @Override
   public void method_32145(int var1, int var2) {
      this.field_8719.method_32104(!SigmaMainClass.method_3328().method_3332().method_23084());
      byte var5 = 30;
      byte var6 = 90;
      this.field_8724.method_32175(var6 + (!SigmaMainClass.method_3328().method_3332().method_23084() ? 202 : 0));
      this.field_8714.method_32175(var5 + (!SigmaMainClass.method_3328().method_3332().method_23084() ? 202 : 0));
      super.method_32145(var1, var2);
   }

   public void method_7598() {
      SigmaMainClass.method_3328().method_3315().method_21206("clicksound");
   }

   public void method_7600(Screen var1) {
      MinecraftClient.getInstance().method_8609(var1);
      this.method_7598();
   }

   public void method_7601(class_2596 var1) {
      SigmaMainClass.method_3328().method_3299().method_30990(var1);
      this.method_7598();
   }

   private int method_7602(int var1) {
      short var4 = 128;
      short var5 = 128;
      byte var6 = 5;
      byte var7 = -6;
      short var8 = 610;
      return this.method_32109() / 2 - 305 + var1 * 128 + var1 * -6;
   }

   private int method_7599() {
      return this.method_32137() / 2 + 14;
   }
}
