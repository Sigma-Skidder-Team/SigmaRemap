package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6848 extends class_1340 {
   private final class_1425 field_35308;
   private final class_5155 field_35313;
   private final boolean field_35312;
   private final ITextComponent field_35311;

   public class_6848(class_340 var1, int var2, int var3, class_1425 var4, boolean var5) {
      super(var2, var3);
      this.field_35309 = var1;
      this.field_35308 = var4;
      this.field_35313 = MinecraftClient.method_8510().method_8551().method_18228(var4);
      this.field_35312 = var5;
      this.field_35311 = this.method_31421(var4, var5);
   }

   private ITextComponent method_31421(class_1425 var1, boolean var2) {
      TranslationTextComponent var5 = new TranslationTextComponent(var1.method_6540());
      if (!var2 && var1 != class_4054.field_19742) {
         var5.appendString(" II");
      }

      return var5;
   }

   @Override
   public void method_33827() {
      if (!this.method_6184()) {
         if (!this.field_35312) {
            class_340.method_1584(this.field_35309, this.field_35308);
         } else {
            class_340.method_1574(this.field_35309, this.field_35308);
         }

         class_340.method_1582(this.field_35309).clear();
         class_340.method_1577(this.field_35309).clear();
         this.field_35309.method_1163();
         this.field_35309.method_5312();
      }
   }

   @Override
   public void method_32705(class_7966 var1, int var2, int var3) {
      this.field_35309.method_1176(var1, this.field_35311, var2, var3);
   }

   @Override
   public void method_6185(class_7966 var1) {
      MinecraftClient.method_8510().method_8577().method_35674(this.field_35313.method_23608().method_38519());
      method_9782(var1, this.field_36670 + 2, this.field_36674 + 2, this.method_9777(), 18, 18, this.field_35313);
   }
}
