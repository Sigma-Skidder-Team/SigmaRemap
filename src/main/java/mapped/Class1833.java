package mapped;

public interface Class1833 extends Class1826 {
   default <R extends Class7899> Class7962<R> method8084(Class6660<R> var1, Class7962<R> var2, Class7962<R> var3) {
      return () -> {
         R var6 = var2.method27085();
         R var7 = var3.method27085();
         return var1.method20315((var4, var5) -> {
            var1.method20311((long)var4, (long)var5);
            return this.method8083(var1, var6, var7, var4, var5);
         }, var6, var7);
      };
   }

   int method8083(Class6661 var1, Class7899 var2, Class7899 var3, int var4, int var5);
}
