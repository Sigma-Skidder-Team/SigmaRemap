package remapped;

public interface class_3354 extends class_5543 {
   int method_15371();

   int method_15366();

   void method_15364(int var1, int var2);

   boolean method_15370();

   float method_15365();

   default float method_15367() {
      return this.method_25219();
   }

   default float method_15369() {
      return this.method_15367() + (float)this.method_15371() / this.method_15365();
   }

   default float method_15368() {
      return this.method_15372();
   }

   default float method_15363() {
      return this.method_15368() + (float)this.method_15366() / this.method_15365();
   }

   default float method_15372() {
      return 3.0F;
   }
}
