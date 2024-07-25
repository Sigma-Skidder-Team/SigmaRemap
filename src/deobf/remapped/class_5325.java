package remapped;

public interface class_5325 extends class_5891, class_179 {
   int method_24282(class_2431 var1, int var2, int var3, int var4, int var5, int var6);

   @Override
   default int method_26950(class_1167<?> var1, class_2997 var2, int var3, int var4) {
      return this.method_24282(
         var1,
         var2.method_13700(this.method_34239(var3 + 0), this.method_34240(var4 + 2)),
         var2.method_13700(this.method_34239(var3 + 2), this.method_34240(var4 + 2)),
         var2.method_13700(this.method_34239(var3 + 2), this.method_34240(var4 + 0)),
         var2.method_13700(this.method_34239(var3 + 0), this.method_34240(var4 + 0)),
         var2.method_13700(this.method_34239(var3 + 1), this.method_34240(var4 + 1))
      );
   }
}
