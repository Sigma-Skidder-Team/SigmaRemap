package mapped;

import java.util.Optional;

public class Class3000 implements Class2982 {
   public final Class3994 field18125;

   public Class3000(Class3994 var1) {
      this.field18125 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class5403 var4 = Class8042.method27614().method34424().<Class5403>method31084(Class5403.class);
      String var5 = var1.method30559(Class4750.field22539);
      Optional<Integer> var6 = var4.method16984(var5);
      if (!var6.isPresent() && (!Class8042.method27612().method21941() || Class8042.method27614().method34425())) {
         Class8042.method27613().method27366().warning("Could not find painting motive: " + var5 + " falling back to default (0)");
      }

      var1.method30560(Class4750.field22544, var6.orElse(0));
   }
}
