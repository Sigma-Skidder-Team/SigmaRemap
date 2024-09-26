package mapped;

import net.minecraft.entity.EntityType;

public abstract class Class4060 extends Class4057 {
   public Class4060(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public Class4060(EntityType var1, String var2, float var3, String[] var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2823) {
         Class2823 var5 = (Class2823)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("hat")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("arms")) {
                     if (!var2.equals("right_leg")) {
                        if (!var2.equals("left_leg")) {
                           if (var2.equals("nose")) {
                              Class7219 var6 = (Class7219) Reflector.field43059.method36565(var5, 0);
                              if (var6 != null) {
                                 return var6.method22692(0);
                              }
                           }

                           if (!var2.equals("right_arm")) {
                              return !var2.equals("left_arm") ? null : (Class7219) Reflector.field43059.method36565(var5, 7);
                           } else {
                              return (Class7219) Reflector.field43059.method36565(var5, 6);
                           }
                        } else {
                           return (Class7219) Reflector.field43059.method36565(var5, 5);
                        }
                     } else {
                        return (Class7219) Reflector.field43059.method36565(var5, 4);
                     }
                  } else {
                     return (Class7219) Reflector.field43059.method36565(var5, 3);
                  }
               } else {
                  return (Class7219) Reflector.field43059.method36565(var5, 2);
               }
            } else {
               return (Class7219) Reflector.field43059.method36565(var5, 1);
            }
         } else {
            return (Class7219) Reflector.field43059.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "hat", "body", "arms", "right_leg", "left_leg", "nose", "right_arm", "left_arm"};
   }
}
