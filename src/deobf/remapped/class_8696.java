package remapped;

public class class_8696 extends class_8985 {
   private static String[] field_44592;
   private class_1331 field_44593;

   public class_8696(class_5886 var1, class_6486 var2) {
      super(var1, var2);
   }

   @Override
   public class_3998 method_5615(class_1331 var1, int var2) {
      this.field_44593 = var1;
      return super.method_5615(var1, var2);
   }

   @Override
   public class_3998 method_5598(class_8145 var1, int var2) {
      this.field_44593 = var1.method_37075();
      return super.method_5598(var1, var2);
   }

   @Override
   public boolean method_5616(class_8145 var1, double var2) {
      class_3998 var6 = this.method_5598(var1, 0);
      if (var6 == null) {
         this.field_44593 = var1.method_37075();
         this.field_6871 = var2;
         return true;
      } else {
         return this.method_5607(var6, var2);
      }
   }

   @Override
   public void method_5612() {
      if (this.method_5591()) {
         if (this.field_44593 != null) {
            if (!this.field_44593.method_12170(this.field_6877.method_37245(), (double)this.field_6877.method_37086())
               && (
                  !(this.field_6877.method_37309() > (double)this.field_44593.method_12165())
                     || !new class_1331((double)this.field_44593.method_12173(), this.field_6877.method_37309(), (double)this.field_44593.method_12185())
                        .method_12170(this.field_6877.method_37245(), (double)this.field_6877.method_37086())
               )) {
               this.field_6877
                  .method_26905()
                  .method_12879(
                     (double)this.field_44593.method_12173(), (double)this.field_44593.method_12165(), (double)this.field_44593.method_12185(), this.field_6871
                  );
            } else {
               this.field_44593 = null;
            }
         }
      } else {
         super.method_5612();
      }
   }
}
