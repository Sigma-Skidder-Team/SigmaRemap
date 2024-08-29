package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import net.minecraft.client.Minecraft;

public class Class6663 implements Class6664 {
   private static String[] field29234;

   @Override
   public void method20320(Class4305 var1, Class4305 var2) {
      var1.method13264(0);
      var1.method13266(0);
      if (var2 == null) {
         var1.method13268(Minecraft.getInstance().mainWindow.method8043());
         var1.method13270(Minecraft.getInstance().mainWindow.method8044());
      } else {
         var1.method13268(var2.method13267());
         var1.method13270(var2.method13269());
      }
   }
}
