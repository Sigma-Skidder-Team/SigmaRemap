package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_4758 extends class_5875 {
   private final class_7736 field_23041;
   private final class_7675 field_23040;
   private final class_7798 field_23039;

   public class_4758(Screen var1, class_7675 var2, class_7798 var3) {
      this.field_23040 = var2;
      this.field_23039 = var3;
      this.field_23041 = new class_7736(var1);
   }

   @Override
   public void run() {
      this.method_26756(new TranslationTextComponent("mco.connect.connecting"));
      class_6135 var3 = class_6135.method_28178(this.field_23039.field_39499);
      this.field_23041.method_35020(this.field_23040, var3.method_28176(), var3.method_28179());
   }

   @Override
   public void method_26751() {
      this.field_23041.method_35019();
      MinecraftClient.getInstance().method_8606().method_25058();
   }

   @Override
   public void method_26754() {
      this.field_23041.method_35026();
   }
}
