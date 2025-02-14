package mapped;

import net.minecraft.entity.EntityType;

public abstract class Class4117 extends Class4057 {
   public Class4117(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof BipedModel) {
         BipedModel var5 = (BipedModel)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("headwear")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("left_arm")) {
                     if (!var2.equals("right_arm")) {
                        if (!var2.equals("left_leg")) {
                           return !var2.equals("right_leg") ? null : var5.bipedRightLeg;
                        } else {
                           return var5.bipedLeftLeg;
                        }
                     } else {
                        return var5.bipedRightArm;
                     }
                  } else {
                     return var5.bipedLeftArm;
                  }
               } else {
                  return var5.bipedBody;
               }
            } else {
               return var5.bipedHeadwear;
            }
         } else {
            return var5.bipedHead;
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
