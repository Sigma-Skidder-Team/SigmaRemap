package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_4591 extends class_266 {
   private static final ITextComponent field_22322 = new TranslationTextComponent("advMode.setCommand");
   private static final ITextComponent field_22320 = new TranslationTextComponent("advMode.command");
   private static final ITextComponent field_22317 = new TranslationTextComponent("advMode.previousOutput");
   public class_1863 field_22318;
   public class_1863 field_22323;
   public class_9521 field_22315;
   public class_9521 field_22321;
   public class_9521 field_22316;
   public boolean field_22324;
   private class_1027 field_22319;

   public class_4591() {
      super(class_7542.field_38486);
   }

   @Override
   public void method_5312() {
      this.field_22318.method_8279();
   }

   public abstract class_8116 method_21257();

   public abstract int method_21255();

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_22315 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 4 - 150, this.field_940 / 4 + 120 + 12, 150, 20, class_1402.field_7625, var1 -> this.method_21261())
      );
      this.field_22321 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 4, this.field_940 / 4 + 120 + 12, 150, 20, class_1402.field_7633, var1 -> this.method_1156())
      );
      this.field_22316 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 150 - 20, this.method_21255(), 20, 20, new StringTextComponent("O"), var1 -> {
            class_8116 var4 = this.method_21257();
            var4.method_36935(!var4.method_36927());
            this.method_21260();
         })
      );
      this.field_22318 = new class_7191(this, this.field_948, this.field_941 / 2 - 150, 50, 300, 20, new TranslationTextComponent("advMode.command"));
      this.field_22318.method_8255(32500);
      this.field_22318.method_8277(this::method_21258);
      this.field_942.add(this.field_22318);
      this.field_22323 = new class_1863(
         this.field_948, this.field_941 / 2 - 150, this.method_21255(), 276, 20, new TranslationTextComponent("advMode.previousOutput")
      );
      this.field_22323.method_8255(32500);
      this.field_22323.method_8265(false);
      this.field_22323.method_8281("-");
      this.field_942.add(this.field_22323);
      this.method_41178(this.field_22318);
      this.field_22318.method_8273(true);
      this.field_22319 = new class_1027(this.field_943, this, this.field_22318, this.field_948, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.field_22319.method_4552(true);
      this.field_22319.method_4526();
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_22318.method_8246();
      this.method_1164(var1, var2, var3);
      this.field_22318.method_8281(var6);
      this.field_22319.method_4526();
   }

   public void method_21260() {
      if (!this.method_21257().method_36927()) {
         this.field_22316.method_32687(new StringTextComponent("X"));
         this.field_22323.method_8281("-");
      } else {
         this.field_22316.method_32687(new StringTextComponent("O"));
         this.field_22323.method_8281(this.method_21257().method_36928().getString());
      }
   }

   public void method_21261() {
      class_8116 var3 = this.method_21257();
      this.method_21259(var3);
      if (!var3.method_36927()) {
         var3.method_36937((ITextComponent)null);
      }

      this.field_943.method_8609((class_266)null);
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   public abstract void method_21259(class_8116 var1);

   @Override
   public void method_1156() {
      this.method_21257().method_36935(this.field_22324);
      this.field_943.method_8609((class_266)null);
   }

   private void method_21258(String var1) {
      this.field_22319.method_4526();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!this.field_22319.method_4541(var1, var2, var3)) {
         if (!super.method_26946(var1, var2, var3)) {
            if (var1 != 257 && var1 != 335) {
               return false;
            } else {
               this.method_21261();
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      return !this.field_22319.method_4532(var5) ? super.method_26945(var1, var3, var5) : true;
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      return !this.field_22319.method_4549(var1, var3, var5) ? super.method_26940(var1, var3, var5) : true;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, field_22322, this.field_941 / 2, 20, 16777215);
      method_9771(var1, this.field_948, field_22320, this.field_941 / 2 - 150, 40, 10526880);
      this.field_22318.method_6767(var1, var2, var3, var4);
      int var7 = 75;
      if (!this.field_22323.method_8246().isEmpty()) {
         var7 += 46 + this.method_21255() - 135;
         method_9771(var1, this.field_948, field_22317, this.field_941 / 2 - 150, var7 + 4, 10526880);
         this.field_22323.method_6767(var1, var2, var3, var4);
      }

      super.method_6767(var1, var2, var3, var4);
      this.field_22319.method_4547(var1, var2, var3);
   }
}
