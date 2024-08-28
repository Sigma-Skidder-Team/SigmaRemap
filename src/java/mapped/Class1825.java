package mapped;

public interface Class1825 extends Class1826 {
   default <R extends Class7899> Class7962<R> method8079(Class6660<R> var1, Class7962<R> var2) {
      return () -> {
         R var5 = var2.method27085();
         return var1.method20316((var3, var4) -> {
            var1.method20311((long)var3, (long)var4);
            return this.method8077(var1, var5, var3, var4);
         }, var5);
      };
   }

   int method8077(Class6660<?> var1, Class7899 var2, int var3, int var4);
}
