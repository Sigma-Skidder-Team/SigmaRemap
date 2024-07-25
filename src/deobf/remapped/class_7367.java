package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_7367 extends class_8374<class_5567> {
   public class_7367(class_6107 var1) {
      super(var1.field_943, var1.field_941, var1.field_940, 80, var1.field_940 - 37, 24);
      this.field_37637 = var1;

      for (int var4 = 0; var4 < class_6107.method_28065().size(); var4++) {
         this.method_36202(new class_5567(this));
      }
   }

   public void method_33543(class_5567 var1) {
      super.method_36197(var1);
      if (var1 != null) {
         NarratorChatListener.INSTANCE
            .method_34341(
               new TranslationTextComponent("narrator.select", ((class_382)class_6107.method_28065().get(this.method_41183().indexOf(var1))).method_1869())
                  .getString()
            );
      }

      this.field_37637.method_28054(var1 != null);
   }

   @Override
   public boolean method_36221() {
      return this.field_37637.method_41185() == this;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (super.method_26946(var1, var2, var3)) {
         return true;
      } else {
         if ((var1 == 257 || var1 == 335) && this.method_36226() != null) {
            class_5567.method_25278(this.method_36226());
         }

         return false;
      }
   }
}
