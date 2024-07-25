package remapped;

public class class_5340 extends class_292 {
   private static String[] field_27230;

   public class_5340(EntityType<? extends class_5340> var1, World var2) {
      super(var1, var2);
   }

   public class_5340(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34221, var2, var4, var6, var1);
   }

   @Override
   public void method_4743(DamageSource var1) {
      super.method_4743(var1);
      if (this.world.method_29537().method_1285(class_291.field_1024)) {
         this.method_37312(class_4783.field_23471);
      }
   }

   @Override
   public int method_31505() {
      return 27;
   }

   @Override
   public class_3481 method_4737() {
      return class_3481.field_17064;
   }

   @Override
   public class_2522 method_4752() {
      return class_4783.field_23471.method_29260().method_10308(class_6942.field_35692, Direction.field_818);
   }

   @Override
   public int method_4735() {
      return 8;
   }

   @Override
   public class_4088 method_1296(int var1, class_7051 var2) {
      return class_1465.method_6776(var1, var2, this);
   }
}
