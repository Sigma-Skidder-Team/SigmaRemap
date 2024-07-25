package remapped;

public class class_6946 implements class_6867, class_3957 {
   private static String[] field_35718;
   private final class_2831<class_6098> field_35715;
   private final int field_35716;
   private final int field_35719;
   private final class_4088 field_35717;

   public class_6946(class_4088 var1, int var2, int var3) {
      this.field_35715 = class_2831.<class_6098>method_12872(var2 * var3, class_6098.field_31203);
      this.field_35717 = var1;
      this.field_35716 = var2;
      this.field_35719 = var3;
   }

   @Override
   public int method_31505() {
      return this.field_35715.size();
   }

   @Override
   public boolean method_31495() {
      for (class_6098 var4 : this.field_35715) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class_6098 method_31498(int var1) {
      return var1 < this.method_31505() ? this.field_35715.get(var1) : class_6098.field_31203;
   }

   @Override
   public class_6098 method_31507(int var1) {
      return class_3037.method_13880(this.field_35715, var1);
   }

   @Override
   public class_6098 method_31497(int var1, int var2) {
      class_6098 var5 = class_3037.method_13881(this.field_35715, var1, var2);
      if (!var5.method_28022()) {
         this.field_35717.method_18853(this);
      }

      return var5;
   }

   @Override
   public void method_31503(int var1, class_6098 var2) {
      this.field_35715.set(var1, var2);
      this.field_35717.method_18853(this);
   }

   @Override
   public void method_17407() {
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return true;
   }

   @Override
   public void method_24975() {
      this.field_35715.clear();
   }

   public int method_31782() {
      return this.field_35719;
   }

   public int method_31781() {
      return this.field_35716;
   }

   @Override
   public void method_18279(class_534 var1) {
      for (class_6098 var5 : this.field_35715) {
         var1.method_2606(var5);
      }
   }
}
