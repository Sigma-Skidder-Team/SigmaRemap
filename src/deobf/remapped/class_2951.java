package remapped;

public class class_2951 implements class_6867 {
   private static String[] field_14421;

   public class_2951(class_1788 var1) {
      this.field_14422 = var1;
   }

   @Override
   public int method_31505() {
      return 1;
   }

   @Override
   public boolean method_31495() {
      return class_1788.method_7954(this.field_14422).method_28022();
   }

   @Override
   public class_6098 method_31498(int var1) {
      return var1 != 0 ? class_6098.field_31203 : class_1788.method_7954(this.field_14422);
   }

   @Override
   public class_6098 method_31497(int var1, int var2) {
      if (var1 != 0) {
         return class_6098.field_31203;
      } else {
         class_6098 var5 = class_1788.method_7954(this.field_14422).method_27953(var2);
         if (class_1788.method_7954(this.field_14422).method_28022()) {
            class_1788.method_7962(this.field_14422);
         }

         return var5;
      }
   }

   @Override
   public class_6098 method_31507(int var1) {
      if (var1 != 0) {
         return class_6098.field_31203;
      } else {
         class_6098 var4 = class_1788.method_7954(this.field_14422);
         class_1788.method_7950(this.field_14422, class_6098.field_31203);
         class_1788.method_7962(this.field_14422);
         return var4;
      }
   }

   @Override
   public void method_31503(int var1, class_6098 var2) {
   }

   @Override
   public int method_31506() {
      return 1;
   }

   @Override
   public void method_17407() {
      this.field_14422.method_17407();
   }

   @Override
   public boolean method_31502(class_704 var1) {
      if (this.field_14422.field_18364.method_28260(this.field_14422.field_18358) == this.field_14422) {
         return !(
               var1.method_37273(
                     (double)this.field_14422.field_18358.method_12173() + 0.5,
                     (double)this.field_14422.field_18358.method_12165() + 0.5,
                     (double)this.field_14422.field_18358.method_12185() + 0.5
                  )
                  > 64.0
            )
            ? this.field_14422.method_7960()
            : false;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_31500(int var1, class_6098 var2) {
      return false;
   }

   @Override
   public void method_24975() {
   }
}
