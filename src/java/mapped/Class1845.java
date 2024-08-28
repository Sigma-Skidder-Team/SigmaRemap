package mapped;

public interface Class1845 extends Class1825, Class1835 {
   int method8088(Class6661 var1, int var2, int var3, int var4, int var5, int var6);

   @Override
   default int method8077(Class6660<?> var1, Class7899 var2, int var3, int var4) {
      return this.method8088(
         var1,
         var2.method26471(this.method8075(var3 + 0), this.method8076(var4 + 2)),
         var2.method26471(this.method8075(var3 + 2), this.method8076(var4 + 2)),
         var2.method26471(this.method8075(var3 + 2), this.method8076(var4 + 0)),
         var2.method26471(this.method8075(var3 + 0), this.method8076(var4 + 0)),
         var2.method26471(this.method8075(var3 + 1), this.method8076(var4 + 1))
      );
   }
}
