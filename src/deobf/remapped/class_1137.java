package remapped;

public interface class_1137 extends class_1906 {
   void method_4989(int var1);

   void method_4987(int var1);

   void method_4986(int var1);

   void method_4985(float var1);

   default void method_4988(BlockPos var1, float var2) {
      this.method_4989(var1.getX());
      this.method_4987(var1.method_12165());
      this.method_4986(var1.method_12185());
      this.method_4985(var2);
   }
}
