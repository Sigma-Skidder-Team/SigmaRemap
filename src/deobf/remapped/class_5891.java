package remapped;

public interface class_5891 extends class_7511 {
   default <R extends class_2997> class_3171<R> method_26951(class_1167<R> var1, class_3171<R> var2) {
      return () -> {
         class_2997 var5 = var2.method_14623();
         return var1.method_5187((var3, var4) -> {
            var1.method_5189((long)var3, (long)var4);
            return this.method_26950(var1, var5, var3, var4);
         }, var5);
      };
   }

   int method_26950(class_1167<?> var1, class_2997 var2, int var3, int var4);
}
