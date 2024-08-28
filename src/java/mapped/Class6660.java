package mapped;

public interface Class6660<R extends Class7899> extends Class6661 {
   void method20311(long var1, long var3);

   R method20317(Class8984 var1);

   default R method20316(Class8984 var1, R var2) {
      return this.method20317(var1);
   }

   default R method20315(Class8984 var1, R var2, R var3) {
      return this.method20317(var1);
   }

   default int method20318(int var1, int var2) {
      return this.method20312(2) != 0 ? var2 : var1;
   }

   default int method20319(int var1, int var2, int var3, int var4) {
      int var7 = this.method20312(4);
      if (var7 != 0) {
         if (var7 != 1) {
            return var7 != 2 ? var4 : var3;
         } else {
            return var2;
         }
      } else {
         return var1;
      }
   }
}
