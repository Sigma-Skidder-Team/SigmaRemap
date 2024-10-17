package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;

public class Class7145 extends Effect {
   private static String[] field30711;

   public Class7145(EffectType var1, int var2) {
      super(var1, var2);
   }

   @Override
   public void removeAttributesModifiersFromEntity(LivingEntity var1, AttributeModifierManager var2, int var3) {
      var1.setAbsorptionAmount(var1.getAbsorptionAmount() - (float)(4 * (var3 + 1)));
      super.removeAttributesModifiersFromEntity(var1, var2, var3);
   }

   @Override
   public void applyAttributesModifiersToEntity(LivingEntity var1, AttributeModifierManager var2, int var3) {
      var1.setAbsorptionAmount(var1.getAbsorptionAmount() + (float)(4 * (var3 + 1)));
      super.applyAttributesModifiersToEntity(var1, var2, var3);
   }
}
