package remapped;

public interface class_5578 extends class_5891, class_179 {
   int method_25344(class_2431 var1, int var2);

   @Override
   default int method_26950(class_1167<?> var1, class_2997 var2, int var3, int var4) {
      int var7 = var2.method_13700(this.method_34239(var3 + 1), this.method_34240(var4 + 1));
      return this.method_25344(var1, var7);
   }
}
