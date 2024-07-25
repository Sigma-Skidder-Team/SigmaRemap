package remapped;

public class SigmaMainMenu extends class_7038 {
   public final class_5228 field_8491;
   public final class_5228 field_8493;
   public final class_5228 field_8489;
   public final class_5228 field_8492;
   public final class_5228 field_8496;
   public final class_5228 field_8490;
   public final class_5228 field_8495;

   public SigmaMainMenu(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      int var9 = 0;
      byte var10 = 114;
      short var11 = 140;
      this.method_32148(this.field_8491 = new class_5228(this, "Singleplayer", this.method_7272(var9++), this.method_7273(), 114, 140, class_3054.field_14996));
      this.method_32148(this.field_8490 = new class_5228(this, "Multiplayer", this.method_7272(var9++), this.method_7273(), 114, 140, class_3054.field_15005));
      this.method_32148(this.field_8492 = new class_5228(this, "Options", this.method_7272(var9++), this.method_7273(), 114, 140, class_3054.field_15011));
      this.method_32148(this.field_8489 = new class_5228(this, "Language", this.method_7272(var9++), this.method_7273(), 114, 140, class_3054.field_15000));
      this.method_32148(
         this.field_8496 = new class_5228(this, "Accounts", this.method_7272(var9++), this.method_7273() + 140 + 10, 114, 140, class_3054.field_15009)
      );
      this.method_32148(
         this.field_8495 = new class_5228(this, "Agora", this.method_7272(var9++), this.method_7273() + 140 + 10, 114, 140, class_3054.field_14987)
      );
      this.method_32148(
         this.field_8493 = new class_5228(this, "Exit", this.method_7272(var9++), this.method_7273() + 140 + 10, 114, 140, class_3054.field_14995)
      );
      this.field_8491.method_32100((var1x, var2x) -> this.method_7274(new class_7899(MinecraftClient.getInstance().field_9623)));
      this.field_8490.method_32100((var1x, var2x) -> this.method_7274(new class_9888(MinecraftClient.getInstance().field_9623)));
      this.field_8492
         .method_32100((var1x, var2x) -> this.method_7274(new OptionsScreen(MinecraftClient.getInstance().field_9623, MinecraftClient.getInstance().gameOptions)));
      this.field_8496.method_32100((var1x, var2x) -> this.method_7275(new class_2135()));
      this.field_8489
         .method_32100(
            (var1x, var2x) -> this.method_7274(
                  new class_1709(MinecraftClient.getInstance().field_9623, MinecraftClient.getInstance().gameOptions, MinecraftClient.getInstance().method_8561())
               )
         );
      this.field_8493.method_32100((var0, var1x) -> MinecraftClient.getInstance().method_8512());
   }

   public void method_7274(Screen var1) {
      MinecraftClient.getInstance().method_8609(var1);
      this.method_7276();
   }

   public void method_7275(class_2596 var1) {
      SigmaMainClass.getInstance().method_3299().method_30990(var1);
      this.method_7276();
   }

   public void method_7276() {
      MinecraftClient.getInstance().method_8590().method_16345(class_4949.method_22675(class_463.field_1995, 1.0F));
   }

   private int method_7273() {
      return 150;
   }

   private int method_7272(int var1) {
      byte var4 = 122;
      short var5 = 140;
      byte var6 = 4;
      byte var7 = -6;
      int var8 = 122 * var6 + var6 * var7;
      if (var1 < var6) {
         return this.method_32109() / 2 - var8 / 2 + var1 * 122 + var1 * var7 - 12;
      } else {
         var1 -= var6;
         var6 = 3;
         var7 = 6;
         var8 = 122 * var6 + var6 * var7;
         return this.method_32109() / 2 - var8 / 2 + var1 * 122 + var1 * var7 - 12;
      }
   }

   @Override
   public void method_32178(float var1) {
      this.method_32130();
      class_73.method_96((float)(this.field_36270 + (this.method_32109() - 300) / 2), (float)(this.field_36261 + 30), 300.0F, 97.0F, class_3054.field_15010);
      super.method_32178(var1);
   }
}
