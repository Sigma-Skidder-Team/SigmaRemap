package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;

public class Class7149 extends Effect {
   private static String[] field30716;

   public Class7149(EffectType var1, int var2) {
      super(var1, var2);
   }

   @Override
   public void removeAttributesModifiersFromEntity(LivingEntity var1, AttributeModifierManager var2, int var3) {
      super.removeAttributesModifiersFromEntity(var1, var2, var3);
      if (var1.getHealth() > var1.getMaxHealth()) {
         var1.setHealth(var1.getMaxHealth());
      }
   }
}
