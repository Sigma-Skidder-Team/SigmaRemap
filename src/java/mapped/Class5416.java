package mapped;

import java.util.UUID;

public class Class5416 extends Class5415 {
   private static String[] field24099;

   @Override
   public void method17010(Class7161 var1, UUID var2) {
      if (var1.method22439(Class6050.class)) {
         Class6050 var5 = var1.<Class6050>method22438(Class6050.class);
         if (var5.method18735() != null) {
            var5.method18735().add(var2);
         }
      }
   }

   @Override
   public void method17011(Class7161 var1, UUID var2) {
      if (var1.method22439(Class6050.class)) {
         Class6050 var5 = var1.<Class6050>method22438(Class6050.class);
         if (var5.method18735() != null) {
            var5.method18735().remove(var2);
         }
      }
   }
}
