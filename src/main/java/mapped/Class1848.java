package mapped;

public interface Class1848 extends Class1825, Class1835 {
   int method8082(Class6661 var1, int var2);

   @Override
   default int method8077(Class6660<?> var1, Class7899 var2, int var3, int var4) {
      int var7 = var2.method26471(this.method8075(var3 + 1), this.method8076(var4 + 1));
      return this.method8082(var1, var7);
   }
}
