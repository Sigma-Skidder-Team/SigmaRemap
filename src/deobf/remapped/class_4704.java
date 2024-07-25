package remapped;

public class class_4704 extends class_9811 {
   private static String[] field_22857;

   public class_4704(class_3845 var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_5601() {
      return true;
   }

   @Override
   public class_8976 method_5605(int var1) {
      this.field_6888 = new class_929();
      return new class_8976(this.field_6888, var1);
   }

   @Override
   public boolean method_5609(class_1331 var1) {
      if (this.field_6877 instanceof class_3845) {
         class_3845 var4 = (class_3845)this.field_6877;
         if (class_3845.method_17849(var4)) {
            return this.field_6882.method_28262(var1).method_8350(class_4783.field_23900);
         }
      }

      return !this.field_6882.method_28262(var1.method_6100()).method_8345();
   }
}
