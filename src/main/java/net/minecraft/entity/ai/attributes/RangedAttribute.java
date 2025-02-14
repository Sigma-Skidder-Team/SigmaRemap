package net.minecraft.entity.ai.attributes;

import net.minecraft.util.math.MathHelper;

public class RangedAttribute extends Attribute {
   private final double minimumValue;
   private final double maximumValue;

   public RangedAttribute(String attributeName, double defaultValue, double minimumValue, double maximumValue) {
      super(attributeName, defaultValue);
      this.minimumValue = minimumValue;
      this.maximumValue = maximumValue;
      if (!(minimumValue > maximumValue)) {
         if (!(defaultValue < minimumValue)) {
            if (defaultValue > maximumValue) {
               throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
            }
         } else {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
         }
      } else {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      }
   }

   @Override
   public double clampValue(double value) {
      return MathHelper.clamp(value, this.minimumValue, this.maximumValue);
   }
}
