package remapped;

public class class_6360 extends class_4088 {
   private static String[] field_32523;
   private final class_6867 field_32524;
   private final class_6844 field_32522;

   public class_6360(int var1) {
      this(var1, new class_4657(1), new class_4799(1));
   }

   public class_6360(int var1, class_6867 var2, class_6844 var3) {
      super(class_4165.field_20245, var1);
      method_18858(var2, 1);
      method_18867(var3, 1);
      this.field_32524 = var2;
      this.field_32522 = var3;
      this.method_18885(new class_4825(this, var2, 0, 0, 0));
      this.method_18859(var3);
   }

   @Override
   public boolean method_18886(class_704 var1, int var2) {
      if (var2 >= 100) {
         int var8 = var2 - 100;
         this.method_18869(0, var8);
         return true;
      } else {
         switch (var2) {
            case 1:
               int var5 = this.field_32522.method_31408(0);
               this.method_18869(0, var5 - 1);
               return true;
            case 2:
               int var6 = this.field_32522.method_31408(0);
               this.method_18869(0, var6 + 1);
               return true;
            case 3:
               if (!var1.method_3181()) {
                  return false;
               }

               ItemStack var7 = this.field_32524.method_31507(0);
               this.field_32524.method_17407();
               if (!var1.inventory.method_32414(var7)) {
                  var1.method_3153(var7, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void method_18869(int var1, int var2) {
      super.method_18869(var1, var2);
      this.method_18877();
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_32524.method_31502(var1);
   }

   public ItemStack method_29135() {
      return this.field_32524.method_31498(0);
   }

   public int method_29136() {
      return this.field_32522.method_31408(0);
   }
}
