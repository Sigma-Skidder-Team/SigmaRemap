package mapped;

public abstract class Class4117 extends Class4057 {
   public Class4117(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2797) {
         Class2797 var5 = (Class2797)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("headwear")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("left_arm")) {
                     if (!var2.equals("right_arm")) {
                        if (!var2.equals("left_leg")) {
                           return !var2.equals("right_leg") ? null : var5.field17437;
                        } else {
                           return var5.field17438;
                        }
                     } else {
                        return var5.field17435;
                     }
                  } else {
                     return var5.field17436;
                  }
               } else {
                  return var5.field17434;
               }
            } else {
               return var5.field17433;
            }
         } else {
            return var5.field17432;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "headwear", "body", "left_arm", "right_arm", "left_leg", "right_leg"};
   }
}
