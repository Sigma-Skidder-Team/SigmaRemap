package remapped;

public interface class_3743 extends class_7511 {
   default <R extends class_2997> class_3171<R> method_17351(class_1167<R> var1, class_3171<R> var2, class_3171<R> var3) {
      return () -> {
         class_2997 var6 = var2.method_14623();
         class_2997 var7 = var3.method_14623();
         return var1.method_5188((var4, var5) -> {
            var1.method_5189((long)var4, (long)var5);
            return this.method_17352(var1, var6, var7, var4, var5);
         }, var6, var7);
      };
   }

   int method_17352(class_2431 var1, class_2997 var2, class_2997 var3, int var4, int var5);
}
