package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5292 extends class_1094 {
   private static final ITextComponent field_27043 = new TranslationTextComponent(field_27044[3]);
   private static final ITextComponent field_27039 = new TranslationTextComponent(field_27044[4]);
   private final class_2866 field_27038;
   private final class_7675 field_27036;
   private class_9521 field_27042;
   private class_1863 field_27037;
   private class_1863 field_27040;
   private class_8949 field_27041;

   public class_5292(class_2866 var1, class_7675 var2) {
      this.field_27038 = var1;
      this.field_27036 = var2;
   }

   @Override
   public void method_5312() {
      this.field_27040.method_8279();
      this.field_27037.method_8279();
      this.field_27042.field_36675 = !this.field_27040.method_8246().trim().isEmpty();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      int var3 = this.field_941 / 2 - 106;
      this.field_27042 = this.<class_9521>method_1186(
         new class_9521(var3 - 2, method_4819(12), 106, 20, new TranslationTextComponent("mco.configure.world.buttons.done"), var1 -> this.method_24139())
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 2, method_4819(12), 106, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_27038))
      );
      String var4 = this.field_27036.field_39004 != class_6804.field_35061 ? "mco.configure.world.buttons.open" : "mco.configure.world.buttons.close";
      class_9521 var5 = new class_9521(this.field_941 / 2 - 53, method_4819(0), 106, 20, new TranslationTextComponent(var4), var1 -> {
         if (this.field_27036.field_39004 != class_6804.field_35061) {
            this.field_27038.method_13142(false, this);
         } else {
            TranslationTextComponent var4x = new TranslationTextComponent("mco.configure.world.close.question.line1");
            TranslationTextComponent var5x = new TranslationTextComponent("mco.configure.world.close.question.line2");
            this.field_943.method_8609(new class_2238(var1x -> {
               if (!var1x) {
                  this.field_943.method_8609(this);
               } else {
                  this.field_27038.method_13145(this);
               }
            }, class_1542.field_8150, var4x, var5x, true));
         }
      });
      this.<class_9521>method_1186(var5);
      this.field_27040 = new class_1863(
         this.field_943.textRenderer, var3, method_4819(4), 212, 20, (class_1863)null, new TranslationTextComponent("mco.configure.world.name")
      );
      this.field_27040.method_8255(32);
      this.field_27040.method_8281(this.field_27036.method_34772());
      this.<class_1863>method_1159(this.field_27040);
      this.method_41184(this.field_27040);
      this.field_27037 = new class_1863(
         this.field_943.textRenderer, var3, method_4819(8), 212, 20, (class_1863)null, new TranslationTextComponent("mco.configure.world.description")
      );
      this.field_27037.method_8255(32);
      this.field_27037.method_8281(this.field_27036.method_34769());
      this.<class_1863>method_1159(this.field_27037);
      this.field_27041 = this.<class_8949>method_1159(
         new class_8949(new TranslationTextComponent("mco.configure.world.settings.title"), this.field_941 / 2, 17, 16777215)
      );
      this.method_4820();
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
         this.field_943.method_8609(this.field_27038);
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_27041.method_41093(this, var1);
      this.field_948.method_45378(var1, field_27043, (float)(this.field_941 / 2 - 106), (float)method_4819(3), 10526880);
      this.field_948.method_45378(var1, field_27039, (float)(this.field_941 / 2 - 106), (float)method_4819(7), 10526880);
      this.field_27040.method_6767(var1, var2, var3, var4);
      this.field_27037.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }

   public void method_24139() {
      this.field_27038.method_13163(this.field_27040.method_8246(), this.field_27037.method_8246());
   }
}
