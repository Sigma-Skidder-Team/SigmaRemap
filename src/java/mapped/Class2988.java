package mapped;

import com.google.common.base.Joiner;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Class2988 implements Class2982 {
   public final Class3849 field18104;

   public Class2988(Class3849 var1) {
      this.field18104 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(Class4750.field22539, 0);
      var4 = Class9687.method37926(var4);
      if (var4 != null) {
         if (var4.equals("REGISTER") || var4.equals("UNREGISTER")) {
            String[] var6 = new String(var1.<byte[]>method30559(Class4750.field22521), StandardCharsets.UTF_8).split("\u0000");
            ArrayList var7 = new ArrayList();

            for (int var8 = 0; var8 < var6.length; var8++) {
               String var9 = Class9687.method37926(var6[var8]);
               if (var9 == null) {
                  if (!Class8042.method27612().method21941() || Class8042.method27614().method34425()) {
                     Class8042.method27613().method27366().warning("Ignoring plugin channel in incoming REGISTER: " + var6[var8]);
                  }
               } else {
                  var7.add(var9);
               }
            }

            var1.method30560(Class4750.field22521, Joiner.on('\u0000').join(var7).getBytes(StandardCharsets.UTF_8));
         }

         var1.method30558(Class4750.field22539, 0, var4);
      } else {
         if (!Class8042.method27612().method21941() || Class8042.method27614().method34425()) {
            Class8042.method27613().method27366().warning("Ignoring incoming plugin message with channel: " + var4);
         }

         var1.method30578();
      }
   }
}
