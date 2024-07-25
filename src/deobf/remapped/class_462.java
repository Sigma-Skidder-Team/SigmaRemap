package remapped;

public abstract class class_462 extends class_7060 {
   public class_1143 field_1919;

   public class_462(class_2746 var1, int var2, class_1143 var3) {
      super(var1, var2);
      this.field_1919 = var3;
   }

   public class_462(class_2746 var1, CompoundNBT var2) {
      super(var1, var2);
      this.field_1919 = class_1143.method_5008(var2.method_25947("MST"));
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      var1.method_25931("MST", this.field_1919.ordinal());
   }

   public class_2522 method_2213() {
      switch (this.field_1919) {
         case field_6470:
         default:
            return class_4783.field_23893.method_29260();
         case field_6469:
            return class_4783.field_23916.method_29260();
      }
   }

   public class_2522 method_2215() {
      switch (this.field_1919) {
         case field_6470:
         default:
            return class_4783.field_23778.method_29260();
         case field_6469:
            return class_4783.field_23499.method_29260();
      }
   }

   public boolean method_2214(class_6163 var1, class_9616 var2, int var3, int var4, int var5, int var6) {
      for (int var9 = var3; var9 <= var4; var9++) {
         if (this.method_32514(var1, var9, var5 + 1, var6, var2).method_8345()) {
            return false;
         }
      }

      return true;
   }
}
