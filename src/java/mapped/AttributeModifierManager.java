package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AttributeModifierManager {
   private static final Logger field41270 = LogManager.getLogger();
   private final Map<Attribute, ModifiableAttributeInstance> field41271 = Maps.newHashMap();
   private final Set<ModifiableAttributeInstance> field41272 = Sets.newHashSet();
   private final Class9767 field41273;

   public AttributeModifierManager(Class9767 var1) {
      this.field41273 = var1;
   }

   private void method33377(ModifiableAttributeInstance var1) {
      if (var1.getAttribute().method15029()) {
         this.field41272.add(var1);
      }
   }

   public Set<ModifiableAttributeInstance> method33378() {
      return this.field41272;
   }

   public Collection<ModifiableAttributeInstance> method33379() {
      return this.field41271.values().stream().filter(var0 -> var0.getAttribute().method15029()).collect(Collectors.<ModifiableAttributeInstance>toList());
   }

   @Nullable
   public ModifiableAttributeInstance createInstanceIfAbsent(Attribute var1) {
      return this.field41271.computeIfAbsent(var1, var1x -> this.field41273.method38415(this::method33377, var1x));
   }

   public boolean method33381(Attribute var1) {
      return this.field41271.get(var1) != null || this.field41273.method38417(var1);
   }

   public boolean method33382(Attribute var1, UUID var2) {
      ModifiableAttributeInstance var5 = this.field41271.get(var1);
      return var5 == null ? this.field41273.method38418(var1, var2) : var5.method38664(var2) != null;
   }

   public double getAttributeValue(Attribute var1) {
      ModifiableAttributeInstance var4 = this.field41271.get(var1);
      return var4 == null ? this.field41273.method38412(var1) : var4.method38674();
   }

   public double method33384(Attribute var1) {
      ModifiableAttributeInstance var4 = this.field41271.get(var1);
      return var4 == null ? this.field41273.method38413(var1) : var4.getBaseValue();
   }

   public double method33385(Attribute var1, UUID var2) {
      ModifiableAttributeInstance var5 = this.field41271.get(var1);
      return var5 == null ? this.field41273.method38414(var1, var2) : var5.method38664(var2).getAmount();
   }

   public void method33386(Multimap<Attribute, AttributeModifier> var1) {
      var1.asMap().forEach((var1x, var2) -> {
         ModifiableAttributeInstance var5 = this.field41271.get(var1x);
         if (var5 != null) {
            var2.forEach(var5::method38670);
         }
      });
   }

   public void method33387(Multimap<Attribute, AttributeModifier> var1) {
      var1.forEach((var1x, var2) -> {
         ModifiableAttributeInstance var5 = this.createInstanceIfAbsent(var1x);
         if (var5 != null) {
            var5.method38670(var2);
            var5.method38667(var2);
         }
      });
   }

   public void method33388(AttributeModifierManager var1) {
      var1.field41271.values().forEach(var1x -> {
         ModifiableAttributeInstance var4 = this.createInstanceIfAbsent(var1x.getAttribute());
         if (var4 != null) {
            var4.method38677(var1x);
         }
      });
   }

   public ListNBT method33389() {
      ListNBT var3 = new ListNBT();

      for (ModifiableAttributeInstance var5 : this.field41271.values()) {
         var3.add(var5.method38678());
      }

      return var3;
   }

   public void method33390(ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.method153(var4);
         String var6 = var5.getString("Name");
         Util.<Attribute>acceptOrElse(Registry.ATTRIBUTE.method9187(ResourceLocation.method8289(var6)), var2 -> {
            ModifiableAttributeInstance var5x = this.createInstanceIfAbsent(var2);
            if (var5x != null) {
               var5x.method38679(var5);
            }
         }, () -> field41270.warn("Ignoring unknown attribute '{}'", var6));
      }
   }
}
