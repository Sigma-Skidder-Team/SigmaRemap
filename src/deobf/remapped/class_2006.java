package remapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2006 extends Screen {
   private static final ITextComponent field_10183 = new TranslationTextComponent(field_10184[2]);
   private class_9521 field_10186;
   private final class_2560 field_10182;
   private class_1863 field_10181;
   private final BooleanConsumer field_10180;
   private final Screen field_10185;

   public class_2006(Screen var1, BooleanConsumer var2, class_2560 var3) {
      super(new TranslationTextComponent("selectServer.direct"));
      this.field_10185 = var1;
      this.field_10182 = var3;
      this.field_10180 = var2;
   }

   @Override
   public void method_5312() {
      this.field_10181.method_8279();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (this.method_41185() == this.field_10181 && (var1 == 257 || var1 == 335)) {
         this.method_9319();
         return true;
      } else {
         return super.method_26946(var1, var2, var3);
      }
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_10186 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 4 + 96 + 12, 200, 20, new TranslationTextComponent("selectServer.select"), var1 -> this.method_9319()
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 / 4 + 120 + 12, 200, 20, class_1402.field_7633, var1 -> this.field_10180.accept(false))
      );
      this.field_10181 = new class_1863(this.field_948, this.field_941 / 2 - 100, 116, 200, 20, new TranslationTextComponent("addServer.enterIp"));
      this.field_10181.method_8255(128);
      this.field_10181.method_8273(true);
      this.field_10181.method_8281(this.field_943.field_9577.field_45414);
      this.field_10181.method_8277(var1 -> this.method_9320());
      this.field_942.add(this.field_10181);
      this.method_41178(this.field_10181);
      this.method_9320();
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_10181.method_8246();
      this.method_1164(var1, var2, var3);
      this.field_10181.method_8281(var6);
   }

   private void method_9319() {
      this.field_10182.field_12675 = this.field_10181.method_8246();
      this.field_10180.accept(true);
   }

   @Override
   public void method_1156() {
      this.field_943.method_8609(this.field_10185);
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
      this.field_943.field_9577.field_45414 = this.field_10181.method_8246();
      this.field_943.field_9577.method_40873();
   }

   private void method_9320() {
      String var3 = this.field_10181.method_8246();
      this.field_10186.field_36675 = !var3.isEmpty() && var3.split(":").length > 0 && var3.indexOf(32) == -1;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 20, 16777215);
      method_9771(var1, this.field_948, field_10183, this.field_941 / 2 - 100, 100, 10526880);
      this.field_10181.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }
}
