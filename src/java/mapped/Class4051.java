package mapped;

import net.minecraft.entity.EntityType;

public abstract class Class4051 extends Class4057 {
   public Class4051(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2866) {
         Class2866 var5 = (Class2866)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("leg1")) {
                  if (!var2.equals("leg2")) {
                     if (!var2.equals("leg3")) {
                        return !var2.equals("leg4") ? null : (Class7219) Reflector.field43088.method36565(var5, 5);
                     } else {
                        return (Class7219) Reflector.field43088.method36565(var5, 4);
                     }
                  } else {
                     return (Class7219) Reflector.field43088.method36565(var5, 3);
                  }
               } else {
                  return (Class7219) Reflector.field43088.method36565(var5, 2);
               }
            } else {
               return (Class7219) Reflector.field43088.method36565(var5, 1);
            }
         } else {
            return (Class7219) Reflector.field43088.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4"};
   }
}
