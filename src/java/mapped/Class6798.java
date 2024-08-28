package mapped;

import java.util.ArrayDeque;

public class Class6798 implements Class6797 {
   private final Class9137 field29605;

   public Class6798(Class7744 var1) {
      this.field29605 = new Class9137(var1);
   }

   @Override
   public void method20710(Class7268 var1, Class6619 var2, ArrayDeque<Class7159> var3, int var4) {
      this.field29605.method34115(var1).ifPresent(var4x -> {
         Class6797[] var7 = var4x.method25653();
         int var8 = var4 - var3.size();
         int var9 = Math.min(var7.length, var8);

         for (int var10 = var9 - 1; var10 >= 0; var10--) {
            var3.addFirst(new Class7159(var1, var2, var7[var10]));
         }
      });
   }

   @Override
   public String toString() {
      return "function " + this.field29605.method34116();
   }
}
