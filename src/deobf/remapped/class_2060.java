package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_2060 extends class_8374<class_1127> {
   public class_2060(class_1709 var1, MinecraftClient var2) {
      super(var2, var1.field_941, var1.field_940, 32, var1.field_940 - 65 + 4, 18);
      this.field_10413 = var1;

      for (class_7395 var6 : class_1709.method_7685(var1).method_11094()) {
         class_1127 var7 = new class_1127(this, var6);
         this.method_36202(var7);
         if (class_1709.method_7685(var1).method_11096().getCode().equals(var6.getCode())) {
            this.method_9615(var7);
         }
      }

      if (this.method_36226() != null) {
         this.method_36189(this.method_36226());
      }
   }

   @Override
   public int method_36191() {
      return super.method_36191() + 20;
   }

   @Override
   public int method_36195() {
      return super.method_36195() + 50;
   }

   public void method_9615(class_1127 var1) {
      super.method_36197(var1);
      if (var1 != null) {
         NarratorChatListener.INSTANCE.method_34341(new TranslationTextComponent("narrator.select", class_1127.method_4957(var1)).getString());
      }
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_10413.method_1183(var1);
   }

   @Override
   public boolean method_36221() {
      return this.field_10413.method_41185() == this;
   }
}
