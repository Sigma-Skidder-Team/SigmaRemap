package net.minecraft.entity.ai.attributes;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

import mapped.ListNBT;
import net.minecraft.client.util.Util;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AttributeModifierManager {
   private static final Logger LOGGER = LogManager.getLogger();
   private final Map<Attribute, ModifiableAttributeInstance> instanceMap = Maps.newHashMap();
   private final Set<ModifiableAttributeInstance> instanceSet = Sets.newHashSet();
   private final AttributeModifierMap attributeMap;

   public AttributeModifierManager(AttributeModifierMap attributeMap) {
      this.attributeMap = attributeMap;
   }

   private void addInstance(ModifiableAttributeInstance instance) {
      if (instance.getAttribute().getShouldWatch()) {
         this.instanceSet.add(instance);
      }
   }

   public Set<ModifiableAttributeInstance> getInstanceSet() {
      return this.instanceSet;
   }

   public Collection<ModifiableAttributeInstance> getWatchedInstances() {
      return this.instanceMap.values().stream().filter(var0 -> var0.getAttribute().getShouldWatch()).collect(Collectors.<ModifiableAttributeInstance>toList());
   }

   @Nullable
   public ModifiableAttributeInstance createInstanceIfAbsent(Attribute attribute) {
      return this.instanceMap.computeIfAbsent(attribute, attribute2 -> this.attributeMap.createImmutableAttributeInstance(this::addInstance, attribute2));
   }

   public boolean hasAttributeInstance(Attribute attribute) {
      return this.instanceMap.get(attribute) != null || this.attributeMap.hasAttribute(attribute);
   }

   public boolean hasModifier(Attribute attribute, UUID uuid) {
      ModifiableAttributeInstance modifiableAttributeInstance = this.instanceMap.get(attribute);
      return modifiableAttributeInstance == null ? this.attributeMap.hasModifier(attribute, uuid) : modifiableAttributeInstance.getModifier(uuid) != null;
   }

   public double getAttributeValue(Attribute attribute) {
      ModifiableAttributeInstance modifiableAttributeInstance = this.instanceMap.get(attribute);
      return modifiableAttributeInstance == null ? this.attributeMap.getAttributeValue(attribute) : modifiableAttributeInstance.getValue();
   }

   public double getAttributeBaseValue(Attribute attribute) {
      ModifiableAttributeInstance modifiableAttributeInstance = this.instanceMap.get(attribute);
      return modifiableAttributeInstance == null ? this.attributeMap.getAttributeBaseValue(attribute) : modifiableAttributeInstance.getBaseValue();
   }

   public double getModifierValue(Attribute attribute, UUID uuid) {
      ModifiableAttributeInstance modifiableAttributeInstance = this.instanceMap.get(attribute);
      return modifiableAttributeInstance == null ? this.attributeMap.getAttributeModifierValue(attribute, uuid) : modifiableAttributeInstance.getModifier(uuid).getAmount();
   }

   public void removeModifiers(Multimap<Attribute, AttributeModifier> map) {
      map.asMap().forEach((var1x, var2) -> {
         ModifiableAttributeInstance modifiableAttributeInstance = this.instanceMap.get(var1x);
         if (modifiableAttributeInstance != null) {
            var2.forEach(modifiableAttributeInstance::removeModifier);
         }
      });
   }

   public void reapplyModifiers(Multimap<Attribute, AttributeModifier> map) {
      map.forEach((var1x, var2) -> {
         ModifiableAttributeInstance modifiableAttributeInstance = this.createInstanceIfAbsent(var1x);
         if (modifiableAttributeInstance != null) {
            modifiableAttributeInstance.removeModifier(var2);
            modifiableAttributeInstance.applyNonPersistentModifier(var2);
         }
      });
   }

   public void refreshOnRespawn(AttributeModifierManager manager) {
      manager.instanceMap.values().forEach(modifiableInstance -> {
         ModifiableAttributeInstance modifiableAttributeInstance = this.createInstanceIfAbsent(modifiableInstance.getAttribute());
         if (modifiableAttributeInstance != null) {
            modifiableAttributeInstance.copyValuesFromInstance(modifiableInstance);
         }
      });
   }

   public ListNBT serialize() {
      ListNBT listNBT = new ListNBT();

      for (ModifiableAttributeInstance modifiableAttributeInstance : this.instanceMap.values()) {
         listNBT.add(modifiableAttributeInstance.writeInstances());
      }

      return listNBT;
   }

   public void deserialize(ListNBT listNBT) {
      for (int var4 = 0; var4 < listNBT.size(); var4++) {
         CompoundNBT compoundNBT = listNBT.method153(var4);
         String s = compoundNBT.getString("Name");
         Util.acceptOrElse(Registry.ATTRIBUTE.method9187(ResourceLocation.method8289(s)), var2 -> {
            ModifiableAttributeInstance modifiableAttributeInstance = this.createInstanceIfAbsent(var2);
            if (modifiableAttributeInstance != null) {
               modifiableAttributeInstance.method38679(compoundNBT);
            }
         }, () -> LOGGER.warn("Ignoring unknown attribute '{}'", s));
      }
   }
}
