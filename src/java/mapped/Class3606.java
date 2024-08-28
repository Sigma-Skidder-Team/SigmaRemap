package mapped;

import java.util.Comparator;

public class Class3606 implements Comparator<Class8012> {
   private static String[] field19569;
   public final Class9528 field19570;

   public Class3606(Class9528 var1) {
      this.field19570 = var1;
   }

   public int compare(Class8012 var1, Class8012 var2) {
      Entity var5 = var1.method27397();
      Entity var6 = var2.method27397();
      float var7 = ((Class880)var5).method3042();
      float var8 = ((Class880)var6).method3042();
      if (!(var7 - var8 < 0.0F)) {
         if (var7 - var8 != 0.0F) {
            return 1;
         } else {
            float var9 = this.field19570.field44347.field1339.method3275(var5);
            float var10 = this.field19570.field44347.field1339.method3275(var6);
            if (!(var9 - var10 < 0.0F)) {
               return var9 - var10 != 0.0F ? 1 : 0;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }
}
