package remapped;

import java.util.Comparator;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4213 extends class_8374<class_2714> {
   private class_4213(class_9336 var1) {
      super(var1.field_943, var1.field_941, var1.field_940, 40, var1.field_940 - 37, 16);
      this.field_20465 = var1;
      class_9336.method_43106(var1)
         .method_39808()
         .stream()
         .sorted(Comparator.comparing(var0 -> ((class_5621)var0.getKey()).method_25499().toString()))
         .forEach(var1x -> this.method_36202(new class_2714(this, (class_6325)var1x.getValue())));
   }

   @Override
   public boolean method_36221() {
      return this.field_20465.method_41185() == this;
   }

   public void method_19585(class_2714 var1) {
      super.method_36197(var1);
      if (var1 != null) {
         class_9336.method_43107(this.field_20465, class_2714.method_12216(var1));
         NarratorChatListener.INSTANCE
            .method_34341(
               new TranslationTextComponent("narrator.select", class_9336.method_43106(this.field_20465).method_39797(class_2714.method_12216(var1)))
                  .getString()
            );
      }

      class_9336.method_43105(this.field_20465);
   }
}
