package mapped;

public interface Class1971 {
   default <R extends Class7899> Class7962<R> method8252(Class6660<R> var1) {
      return () -> var1.method20317((var2, var3) -> {
            var1.method20311((long)var2, (long)var3);
            return this.method8251(var1, var2, var3);
         });
   }

   int method8251(Class6661 var1, int var2, int var3);
}
