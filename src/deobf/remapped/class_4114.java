package remapped;

import java.util.List;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4114 extends class_8374<class_7220> {
   public class_4114(class_9675 var1) {
      super(var1.field_943, var1.field_941, var1.field_940, 43, var1.field_940 - 60, 24);
      this.field_20043 = var1;

      for (int var4 = 0; var4 < class_9675.method_44749(var1).method_43905().size(); var4++) {
         this.method_36202(new class_7220(this, null));
      }
   }

   public void method_19101(class_7220 var1) {
      super.method_36197(var1);
      if (var1 != null) {
         class_8764 var4 = class_9675.method_44749(this.field_20043)
            .method_43905()
            .get(class_9675.method_44749(this.field_20043).method_43905().size() - this.method_41183().indexOf(var1) - 1);
         class_2451 var5 = var4.method_40255().method_8360().method_10803();
         if (var5 != class_4897.field_25302) {
            class_7542.field_38482.method_34341(new TranslationTextComponent("narrator.select", var5.method_11249(new class_6098(var5))).getString());
         }
      }

      class_9675.method_44745(this.field_20043);
   }

   @Override
   public boolean method_36221() {
      return this.field_20043.method_41185() == this;
   }

   @Override
   public int method_36191() {
      return this.field_40891 - 70;
   }

   public void method_19102() {
      int var3 = this.method_41183().indexOf(this.method_36226());
      this.method_36192();

      for (int var4 = 0; var4 < class_9675.method_44749(this.field_20043).method_43905().size(); var4++) {
         this.method_36202(new class_7220(this, null));
      }

      List var5 = this.method_41183();
      if (var3 >= 0 && var3 < var5.size()) {
         this.method_19101((class_7220)var5.get(var3));
      }
   }
}
