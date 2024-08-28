package mapped;

import com.mentalfrostbyte.jello.Client;

import java.util.Comparator;

public class Class3589 implements Comparator<Class8012> {
   private static String[] field19534;
   public final Class9528 field19535;

   public Class3589(Class9528 var1) {
      this.field19535 = var1;
   }

   public int compare(Class8012 var1, Class8012 var2) {
      Entity var5 = var1.method27397();
      Entity var6 = var2.method27397();
      boolean var7 = Client.getInstance().getFriendManager().method26999(var5);
      boolean var8 = Client.getInstance().getFriendManager().method26999(var6);
      if (var7 && !var8) {
         return -1;
      } else {
         return var7 && var8 ? 0 : 1;
      }
   }
}
