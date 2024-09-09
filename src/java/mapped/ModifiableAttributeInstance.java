package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.nbt.CompoundNBT;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ModifiableAttributeInstance {
   private final Attribute field45827;
   private final Map<AttributeModifierOperation, Set<AttributeModifier>> field45828 = Maps.newEnumMap(AttributeModifierOperation.class);
   private final Map<UUID, AttributeModifier> field45829 = new Object2ObjectArrayMap();
   private final Set<AttributeModifier> field45830 = new ObjectArraySet();
   private double field45831;
   private boolean field45832 = true;
   private double field45833;
   private final Consumer<ModifiableAttributeInstance> field45834;

   public ModifiableAttributeInstance(Attribute var1, Consumer<ModifiableAttributeInstance> var2) {
      this.field45827 = var1;
      this.field45834 = var2;
      this.field45831 = var1.method15028();
   }

   public Attribute method38659() {
      return this.field45827;
   }

   public double method38660() {
      return this.field45831;
   }

   public void method38661(double var1) {
      if (var1 != this.field45831) {
         this.field45831 = var1;
         this.method38669();
      }
   }

   public Set<AttributeModifier> method38662(AttributeModifierOperation var1) {
      return this.field45828.computeIfAbsent(var1, var0 -> Sets.newHashSet());
   }

   public Set<AttributeModifier> method38663() {
      return ImmutableSet.copyOf(this.field45829.values());
   }

   @Nullable
   public AttributeModifier method38664(UUID var1) {
      return this.field45829.get(var1);
   }

   public boolean method38665(AttributeModifier var1) {
      return this.field45829.get(var1.method37930()) != null;
   }

   private void method38666(AttributeModifier var1) {
      AttributeModifier var4 = this.field45829.putIfAbsent(var1.method37930(), var1);
      if (var4 == null) {
         this.method38662(var1.method37932()).add(var1);
         this.method38669();
      } else {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      }
   }

   public void method38667(AttributeModifier var1) {
      this.method38666(var1);
   }

   public void method38668(AttributeModifier var1) {
      this.method38666(var1);
      this.field45830.add(var1);
   }

   public void method38669() {
      this.field45832 = true;
      this.field45834.accept(this);
   }

   public void method38670(AttributeModifier var1) {
      this.method38662(var1.method37932()).remove(var1);
      this.field45829.remove(var1.method37930());
      this.field45830.remove(var1);
      this.method38669();
   }

   public void method38671(UUID var1) {
      AttributeModifier var4 = this.method38664(var1);
      if (var4 != null) {
         this.method38670(var4);
      }
   }

   public boolean method38672(UUID var1) {
      AttributeModifier var4 = this.method38664(var1);
      if (var4 != null && this.field45830.contains(var4)) {
         this.method38670(var4);
         return true;
      } else {
         return false;
      }
   }

   public void method38673() {
      for (AttributeModifier var4 : this.method38663()) {
         this.method38670(var4);
      }
   }

   public double method38674() {
      if (this.field45832) {
         this.field45833 = this.method38675();
         this.field45832 = false;
      }

      return this.field45833;
   }

   private double method38675() {
      double var3 = this.method38660();

      for (AttributeModifier var9 : this.method38676(AttributeModifierOperation.ADDITION)) {
         var3 += var9.method37933();
      }

      double var6 = var3;

      for (AttributeModifier var10 : this.method38676(AttributeModifierOperation.field13353)) {
         var6 += var3 * var10.method37933();
      }

      for (AttributeModifier var12 : this.method38676(AttributeModifierOperation.MULTIPLY_TOTAL)) {
         var6 *= 1.0 + var12.method37933();
      }

      return this.field45827.method15031(var6);
   }

   private Collection<AttributeModifier> method38676(AttributeModifierOperation var1) {
      return this.field45828.getOrDefault(var1, Collections.<AttributeModifier>emptySet());
   }

   public void method38677(ModifiableAttributeInstance var1) {
      this.field45831 = var1.field45831;
      this.field45829.clear();
      this.field45829.putAll(var1.field45829);
      this.field45830.clear();
      this.field45830.addAll(var1.field45830);
      this.field45828.clear();
      var1.field45828.forEach((var1x, var2) -> this.method38662(var1x).addAll(var2));
      this.method38669();
   }

   public CompoundNBT method38678() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method109("Name", Registry.field16087.getKey(this.field45827).toString());
      var3.method108("Base", this.field45831);
      if (!this.field45830.isEmpty()) {
         ListNBT var4 = new ListNBT();

         for (AttributeModifier var6 : this.field45830) {
            var4.add(var6.method37934());
         }

         var3.put("Modifiers", var4);
      }

      return var3;
   }

   public void method38679(CompoundNBT var1) {
      this.field45831 = var1.getDouble("Base");
      if (var1.contains("Modifiers", 9)) {
         ListNBT var4 = var1.method131("Modifiers", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            AttributeModifier var6 = AttributeModifier.method37935(var4.method153(var5));
            if (var6 != null) {
               this.field45829.put(var6.method37930(), var6);
               this.method38662(var6.method37932()).add(var6);
               this.field45830.add(var6);
            }
         }
      }

      this.method38669();
   }
}
