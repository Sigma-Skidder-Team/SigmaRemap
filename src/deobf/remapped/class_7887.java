package remapped;

public interface class_7887 extends class_5891, class_1109 {
   int method_35665(class_2431 var1, int var2);

   @Override
   default int method_26950(class_1167<?> var1, class_2997 var2, int var3, int var4) {
      return this.method_35665(var1, var2.method_13700(this.method_34239(var3), this.method_34240(var4)));
   }
}
