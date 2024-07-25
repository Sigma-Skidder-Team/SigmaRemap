package remapped;

public class class_9652 extends class_7164<class_5583, class_6399<class_5583>> {
   private static String[] field_49158;

   public class_9652(EntityRenderDispatcher var1) {
      super(var1, new class_6399<class_5583>(0.0F), 0.4F);
      this.method_29100(new class_6835(this));
   }

   public Identifier method_44532(class_5583 var1) {
      return var1.method_25352();
   }

   public void method_44533(class_5583 var1, class_7966 var2, float var3) {
      super.method_29112(var1, var2, var3);
      var2.method_36062(0.8F, 0.8F, 0.8F);
   }

   public void method_44531(class_5583 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      float var8 = var1.method_25362(var5);
      if (var8 > 0.0F) {
         var2.method_36065((double)(0.4F * var8), (double)(0.15F * var8), (double)(0.1F * var8));
         var2.method_36060(class_2426.field_12076.method_11074(class_9299.method_42837(var8, 0.0F, 90.0F)));
         BlockPos var9 = var1.method_37075();

         for (class_704 var11 : var1.world.<class_704>method_25868(class_704.class, new class_4092(var9).method_18899(2.0, 2.0, 2.0))) {
            if (var11.method_26507()) {
               var2.method_36065((double)(0.15F * var8), 0.0, 0.0);
               break;
            }
         }
      }
   }
}
