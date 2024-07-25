package remapped;

import javax.annotation.Nullable;

public class class_1896 extends class_3757 implements class_3745 {
   private final class_3521 field_9684 = new class_2248(this);

   public class_1896() {
      super(class_133.field_379);
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      this.field_9684.method_16255(var2);
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      this.field_9684.method_16258(var1);
      return var1;
   }

   @Override
   public void method_17353() {
      this.field_9684.method_16267();
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 1, this.method_17414());
   }

   @Override
   public class_5734 method_17414() {
      class_5734 var3 = this.method_17396(new class_5734());
      var3.method_25959("SpawnPotentials");
      return var3;
   }

   @Override
   public boolean method_17408(int var1, int var2) {
      return !this.field_9684.method_16262(var1) ? super.method_17408(var1, var2) : true;
   }

   @Override
   public boolean method_17397() {
      return true;
   }

   public class_3521 method_8621() {
      return this.field_9684;
   }
}
