package remapped;

import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9016 extends class_1094 {
   private static final Logger field_46126 = LogManager.getLogger();
   private static final ITextComponent field_46127 = new TranslationTextComponent("mco.terms.title");
   private static final ITextComponent field_46128 = new TranslationTextComponent("mco.terms.sentence.1");
   private static final ITextComponent field_46119 = new StringTextComponent(field_46124[5])
      .append(new TranslationTextComponent("mco.terms.sentence.2").mergeStyle(Style.EMPTY.func_244282_c(true)));
   private final class_266 field_46122;
   private final class_7039 field_46123;
   private final class_7675 field_46121;
   private boolean field_46120;
   private final String field_46125 = "https://aka.ms/MinecraftRealmsTerms";

   public class_9016(class_266 var1, class_7039 var2, class_7675 var3) {
      this.field_46122 = var1;
      this.field_46123 = var2;
      this.field_46121 = var3;
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      int var3 = this.field_941 / 4 - 2;
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 4, method_4819(12), var3, 20, new TranslationTextComponent("mco.terms.buttons.agree"), var1 -> this.method_41376())
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 4,
            method_4819(12),
            var3,
            20,
            new TranslationTextComponent("mco.terms.buttons.disagree"),
            var1 -> this.field_943.method_8609(this.field_46122)
         )
      );
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
         this.field_943.method_8609(this.field_46122);
         return true;
      }
   }

   private void method_41376() {
      class_176 var3 = class_176.method_777();

      try {
         var3.method_763();
         this.field_943
            .method_8609(new class_1065(this.field_46122, new class_3226(this.field_46123, this.field_46122, this.field_46121, new ReentrantLock())));
      } catch (class_3900 var5) {
         field_46126.error("Couldn't agree to TOS");
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (!this.field_46120) {
         return super.method_26940(var1, var3, var5);
      } else {
         this.field_943.field_9600.method_38891("https://aka.ms/MinecraftRealmsTerms");
         Util.getOperatingSystem().method_37581("https://aka.ms/MinecraftRealmsTerms");
         return true;
      }
   }

   @Override
   public String method_1165() {
      return super.method_1165() + ". " + field_46128.getString() + " " + field_46119.getString();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, field_46127, this.field_941 / 2, 17, 16777215);
      this.field_948.method_45378(var1, field_46128, (float)(this.field_941 / 2 - 120), (float)method_4819(5), 16777215);
      int var7 = this.field_948.method_45379(field_46128);
      int var8 = this.field_941 / 2 - 121 + var7;
      int var9 = method_4819(5);
      int var10 = var8 + this.field_948.method_45379(field_46119) + 1;
      int var11 = var9 + 1 + 9;
      this.field_46120 = var8 <= var2 && var2 <= var10 && var9 <= var3 && var3 <= var11;
      this.field_948.method_45378(var1, field_46119, (float)(this.field_941 / 2 - 120 + var7), (float)method_4819(5), !this.field_46120 ? 3368635 : 7107012);
      super.method_6767(var1, var2, var3, var4);
   }
}
