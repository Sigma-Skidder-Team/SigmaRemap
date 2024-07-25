package remapped;

public interface class_5561 extends class_6163 {
   float method_25265(Direction var1, boolean var2);

   class_4663 method_25264();

   int method_25262(BlockPos var1, class_6581 var2);

   default int method_25266(class_2957 var1, BlockPos var2) {
      return this.method_25264().method_21562(var1).method_45335(var2);
   }

   default int method_25261(BlockPos var1, int var2) {
      return this.method_25264().method_21565(var1, var2);
   }

   default boolean method_25263(BlockPos var1) {
      return this.method_25266(class_2957.field_14437, var1) >= this.method_28255();
   }
}
