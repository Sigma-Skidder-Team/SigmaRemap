package remapped;

public class class_8979 extends class_2833 {
   private static String[] field_46011;

   public class_8979(class_2519 var1, class_2519 var2) {
      super(var2);
      this.field_46010 = var1;
   }

   @Override
   public void method_12883() {
      if (this.field_13878 == class_1737.field_8946) {
         class_1343 var3 = new class_1343(
            this.field_13884 - this.field_46010.method_37302(),
            this.field_13886 - this.field_46010.method_37309(),
            this.field_13880 - this.field_46010.method_37156()
         );
         double var4 = var3.method_6217();
         if (!(var4 < this.field_46010.method_37241().method_18906())) {
            this.field_46010.method_37215(this.field_46010.method_37098().method_6215(var3.method_6209(this.field_13885 * 0.05 / var4)));
            if (this.field_46010.method_17809() != null) {
               double var6 = this.field_46010.method_17809().method_37302() - this.field_46010.method_37302();
               double var8 = this.field_46010.method_17809().method_37156() - this.field_46010.method_37156();
               this.field_46010.field_41701 = -((float)class_9299.method_42821(var6, var8)) * (180.0F / (float)Math.PI);
               this.field_46010.field_29605 = this.field_46010.field_41701;
            } else {
               class_1343 var10 = this.field_46010.method_37098();
               this.field_46010.field_41701 = -((float)class_9299.method_42821(var10.field_7336, var10.field_7334)) * (180.0F / (float)Math.PI);
               this.field_46010.field_29605 = this.field_46010.field_41701;
            }
         } else {
            this.field_13878 = class_1737.field_8945;
            this.field_46010.method_37215(this.field_46010.method_37098().method_6209(0.5));
         }
      }
   }
}
