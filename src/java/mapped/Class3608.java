package mapped;

import com.mentalfrostbyte.jello.Client;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3608 implements Comparator<Class8012> {
   private static String[] field19573;
   public final InteractAutoBlock field19574;

   public Class3608(InteractAutoBlock var1) {
      this.field19574 = var1;
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
