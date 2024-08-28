package mapped;

public interface Class7908<R> {
   R method26510(Class7907<?> var1);

   default R method26512(int var1) {
      return this.method26510(Class6272.field27753.method19244(new Class4722(var1)));
   }

   default R method26513(Class8045 var1) {
      return this.method26510(Class6272.field27754.method19244(new Class4715(var1)));
   }

   default R method26514(int var1) {
      return this.method26513(Class8045.method27631(var1));
   }

   default R method26515(int var1) {
      return this.method26513(Class8045.method27632(0, var1));
   }

   default R method26516(int var1) {
      return this.method26510(Class6272.field27763.method19244(new Class4725(0, 0, var1)));
   }

   default R method26517() {
      return this.method26510(Class6272.field27758.method19244(Class4718.field22368));
   }
}
