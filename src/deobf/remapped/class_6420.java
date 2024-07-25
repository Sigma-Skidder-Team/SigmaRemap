package remapped;

import java.util.Locale;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_6420 extends class_1094 {
   private final Screen field_32783;
   private final class_8960 field_32784;
   private class_5529 field_32781;

   public class_6420(Screen var1, class_8960 var2) {
      this.field_32783 = var1;
      this.field_32784 = var2;
   }

   @Override
   public void method_5312() {
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 4 + 120 + 24, 200, 20, class_1402.field_7632, var1 -> this.field_943.method_8609(this.field_32783)
         )
      );
      this.field_32781 = new class_5529(this, this.field_943);
      this.<class_5529>method_1159(this.field_32781);
      this.method_41184(this.field_32781);
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_32783);
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9787(var1, this.field_948, "Changes from last backup", this.field_941 / 2, 10, 16777215);
      this.field_32781.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }

   private ITextComponent method_29341(String var1, String var2) {
      String var5 = var1.toLowerCase(Locale.ROOT);
      if (var5.contains("game") && var5.contains("mode")) {
         return this.method_29343(var2);
      } else {
         return (ITextComponent)(var5.contains("game") && var5.contains("difficulty") ? this.method_29342(var2) : new StringTextComponent(var2));
      }
   }

   private ITextComponent method_29342(String var1) {
      try {
         return class_2977.field_14645[Integer.parseInt(var1)];
      } catch (Exception var5) {
         return new StringTextComponent("UNKNOWN");
      }
   }

   private ITextComponent method_29343(String var1) {
      try {
         return class_2977.field_14651[Integer.parseInt(var1)];
      } catch (Exception var5) {
         return new StringTextComponent("UNKNOWN");
      }
   }
}
