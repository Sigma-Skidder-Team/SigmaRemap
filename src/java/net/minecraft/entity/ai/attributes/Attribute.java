package net.minecraft.entity.ai.attributes;

public class Attribute {
   private final String attributeName;
   private final double defaultValue;
   private boolean shouldWatch;

   public Attribute(String attributeName, double defaultValue) {
      this.attributeName = attributeName;
      this.defaultValue = defaultValue;
   }

   public double getDefaultValue() {
      return this.defaultValue;
   }

   public boolean getShouldWatch() {
      return this.shouldWatch;
   }

   public Attribute setShouldWatch(boolean var1) {
      this.shouldWatch = var1;
      return this;
   }

   // who cooked here
   public double clampValue(double value) {
      return value;
   }

   public String getAttributeName() {
      return this.attributeName;
   }
}
