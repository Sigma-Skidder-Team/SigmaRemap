package net.minecraft.entity.ai.attributes;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.registry.Registry;

import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class AttributeModifierMap {
   private final Map<Attribute, ModifiableAttributeInstance> attributeMap;

   public AttributeModifierMap(Map<Attribute, ModifiableAttributeInstance> attributeMap) {
      this.attributeMap = ImmutableMap.copyOf(attributeMap);
   }

   private ModifiableAttributeInstance getModifier(Attribute attribute) {
      ModifiableAttributeInstance modifiableAttributeInstance = this.attributeMap.get(attribute);
      if (modifiableAttributeInstance != null) {
         return modifiableAttributeInstance;
      } else {
         throw new IllegalArgumentException("Can't find attribute " + Registry.ATTRIBUTE.getKey(attribute));
      }
   }

   public double getAttributeValue(Attribute attribute) {
      return this.getModifier(attribute).getValue();
   }

   public double getAttributeBaseValue(Attribute attribute) {
      return this.getModifier(attribute).getBaseValue();
   }

   public double getAttributeModifierValue(Attribute attribute, UUID uuid) {
      AttributeModifier attributeModifier = this.getModifier(attribute).getModifier(uuid);
      if (attributeModifier != null) {
         return attributeModifier.getAmount();
      } else {
         throw new IllegalArgumentException("Can't find modifier " + uuid + " on attribute " + Registry.ATTRIBUTE.getKey(attribute));
      }
   }

   @Nullable
   public ModifiableAttributeInstance createImmutableAttributeInstance(Consumer<ModifiableAttributeInstance> var1, Attribute var2) {
      ModifiableAttributeInstance modifiableAttributeInstance = this.attributeMap.get(var2);
      if (modifiableAttributeInstance != null) {
         ModifiableAttributeInstance modifiableAttributeInstance1 = new ModifiableAttributeInstance(var2, var1);
         modifiableAttributeInstance1.copyValuesFromInstance(modifiableAttributeInstance);
         return modifiableAttributeInstance1;
      } else {
         return null;
      }
   }

   public static MutableAttribute method38416() {
      return new MutableAttribute();
   }

   public boolean hasAttribute(Attribute attribute) {
      return this.attributeMap.containsKey(attribute);
   }

   public boolean hasModifier(Attribute attribute, UUID uuid) {
      ModifiableAttributeInstance modifiableAttributeInstance = this.attributeMap.get(attribute);
      return modifiableAttributeInstance != null && modifiableAttributeInstance.getModifier(uuid) != null;
   }
}
