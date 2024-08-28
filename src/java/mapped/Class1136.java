package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1136 extends Class1135 {
   private static final ITextComponent field6194 = new StringTextComponent("(")
      .append(new TranslationTextComponent("options.languageWarning"))
      .appendString(")")
      .mergeStyle(TextFormatting.GRAY);
   private Class1284 field6195;
   private final Class267 field6196;
   private Class1228 field6197;
   private Class1206 field6198;

   public Class1136(Screen var1, Class9574 var2, Class267 var3) {
      super(var1, var2, new TranslationTextComponent("options.language"));
      this.field6196 = var3;
   }

   @Override
   public void method1921() {
      this.field6195 = new Class1284(this, this.field4562);
      this.field4561.add(this.field6195);
      this.field6197 = this.<Class1228>method2455(
         new Class1228(
            this.field4564 / 2 - 155, this.field4565 - 38, 150, 20, Class5805.field25360, Class5805.field25360.method18081(this.field6193), var1 -> {
               Class5805.field25360.method18078(this.field6193);
               this.field6193.method37146();
               var1.method5743(Class5805.field25360.method18081(this.field6193));
               this.field4562.method1481();
            }
         )
      );
      this.field6198 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 155 + 160, this.field4565 - 38, 150, 20, Class7127.field30658, var1 -> {
         Class1164 var4 = this.field6195.method6023();
         if (var4 != null && !Class1164.method5565(var4).getCode().equals(this.field6196.method965().getCode())) {
            this.field6196.method964(Class1164.method5565(var4));
            this.field6193.field44676 = Class1164.method5565(var4).getCode();
            this.field4562.method1470();
            this.field6198.method5743(Class7127.field30658);
            this.field6197.method5743(Class5805.field25360.method18081(this.field6193));
            this.field6193.method37146();
         }

         this.field4562.displayGuiScreen(this.field6192);
      }));
      super.method1921();
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.field6195.method1923(var1, var2, var3, var4);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 16, 16777215);
      method5691(var1, this.field4568, field6194, this.field4564 / 2, this.field4565 - 56, 8421504);
      super.method1923(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static Class267 method5461(Class1136 var0) {
      return var0.field6196;
   }
}
