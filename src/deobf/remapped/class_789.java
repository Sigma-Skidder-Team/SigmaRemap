package remapped;

public class class_789 extends class_7934 {
   private static String[] field_4229;

   public class_789(class_3682 var1, class_6867 var2, int var3, int var4, int var5, class_9210 var6) {
      super(var2, var3, var4, var5);
      this.field_4230 = var1;
      this.field_4231 = var6;
   }

   @Override
   public boolean method_35889(class_6098 var1) {
      return false;
   }

   @Override
   public class_6098 method_35892(class_704 var1, class_6098 var2) {
      class_3682.method_17097(this.field_4230).method_35899(1);
      class_3682.method_17102(this.field_4230).method_35899(1);
      if (!class_3682.method_17097(this.field_4230).method_35884() || !class_3682.method_17102(this.field_4230).method_35884()) {
         class_3682.method_17098(this.field_4230).method_43087(0);
      }

      this.field_4231.method_42533((var1x, var2x) -> {
         long var5 = var1x.method_29546();
         if (class_3682.method_17101(this.field_4230) != var5) {
            var1x.method_43359((class_704)null, var2x, class_463.field_2058, class_562.field_3322, 1.0F, 1.0F);
            class_3682.method_17090(this.field_4230, var5);
         }
      });
      return super.method_35892(var1, var2);
   }
}
