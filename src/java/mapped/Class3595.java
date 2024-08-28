package mapped;

import java.util.Comparator;

public class Class3595 implements Comparator<Class8012> {
   private static String[] field19543;
   public final Class5347 field19544;

   public Class3595(Class5347 var1) {
      this.field19544 = var1;
   }

   public int compare(Class8012 var1, Class8012 var2) {
      Entity var5 = var1.method27397();
      Entity var6 = var2.method27397();
      float var7 = Class5347.method16778().field1339.method3275(var5);
      float var8 = Class5347.method16779().field1339.method3275(var6);
      if (!(var7 - var8 < 0.0F)) {
         return var7 - var8 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
