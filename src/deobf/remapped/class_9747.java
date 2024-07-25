package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class class_9747 {
   private final class_225 field_49516;
   private final Map<class_9342, Set<class_9343>> field_49512 = Maps.newEnumMap(class_9342.class);
   private final Map<UUID, class_9343> field_49510 = new Object2ObjectArrayMap();
   private final Set<class_9343> field_49513 = new ObjectArraySet();
   private double field_49514;
   private boolean field_49517 = true;
   private double field_49509;
   private final Consumer<class_9747> field_49511;

   public class_9747(class_225 var1, Consumer<class_9747> var2) {
      this.field_49516 = var1;
      this.field_49511 = var2;
      this.field_49514 = var1.method_949();
   }

   public class_225 method_44993() {
      return this.field_49516;
   }

   public double getBaseValue() {
      return this.field_49514;
   }

   public void setBaseValue(double var1) {
      if (var1 != this.field_49514) {
         this.field_49514 = var1;
         this.method_44999();
      }
   }

   public Set<class_9343> method_44995(class_9342 var1) {
      return this.field_49512.computeIfAbsent(var1, var0 -> Sets.newHashSet());
   }

   public Set<class_9343> method_45001() {
      return ImmutableSet.copyOf(this.field_49510.values());
   }

   @Nullable
   public class_9343 method_44997(UUID var1) {
      return this.field_49510.get(var1);
   }

   public boolean method_45007(class_9343 var1) {
      return this.field_49510.get(var1.method_43122()) != null;
   }

   private void method_45002(class_9343 var1) {
      class_9343 var4 = this.field_49510.putIfAbsent(var1.method_43122(), var1);
      if (var4 == null) {
         this.method_44995(var1.method_43121()).add(var1);
         this.method_44999();
      } else {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      }
   }

   public void method_45011(class_9343 var1) {
      this.method_45002(var1);
   }

   public void method_45005(class_9343 var1) {
      this.method_45002(var1);
      this.field_49513.add(var1);
   }

   public void method_44999() {
      this.field_49517 = true;
      this.field_49511.accept(this);
   }

   public void method_45004(class_9343 var1) {
      this.method_44995(var1.method_43121()).remove(var1);
      this.field_49510.remove(var1.method_43122());
      this.field_49513.remove(var1);
      this.method_44999();
   }

   public void method_45003(UUID var1) {
      class_9343 var4 = this.method_44997(var1);
      if (var4 != null) {
         this.method_45004(var4);
      }
   }

   public boolean method_45008(UUID var1) {
      class_9343 var4 = this.method_44997(var1);
      if (var4 != null && this.field_49513.contains(var4)) {
         this.method_45004(var4);
         return true;
      } else {
         return false;
      }
   }

   public void method_44994() {
      for (class_9343 var4 : this.method_45001()) {
         this.method_45004(var4);
      }
   }

   public double method_44998() {
      if (this.field_49517) {
         this.field_49509 = this.method_45013();
         this.field_49517 = false;
      }

      return this.field_49509;
   }

   private double method_45013() {
      double var3 = this.getBaseValue();

      for (class_9343 var9 : this.method_45009(class_9342.field_47679)) {
         var3 += var9.method_43123();
      }

      double var6 = var3;

      for (class_9343 var10 : this.method_45009(class_9342.field_47678)) {
         var6 += var3 * var10.method_43123();
      }

      for (class_9343 var12 : this.method_45009(class_9342.field_47677)) {
         var6 *= 1.0 + var12.method_43123();
      }

      return this.field_49516.method_954(var6);
   }

   private Collection<class_9343> method_45009(class_9342 var1) {
      return this.field_49512.getOrDefault(var1, Collections.<class_9343>emptySet());
   }

   public void method_45010(class_9747 var1) {
      this.field_49514 = var1.field_49514;
      this.field_49510.clear();
      this.field_49510.putAll(var1.field_49510);
      this.field_49513.clear();
      this.field_49513.addAll(var1.field_49513);
      this.field_49512.clear();
      var1.field_49512.forEach((var1x, var2) -> this.method_44995(var1x).addAll(var2));
      this.method_44999();
   }

   public CompoundNBT method_45012() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method_25941("Name", class_8669.field_44403.method_39797(this.field_49516).toString());
      var3.method_25923("Base", this.field_49514);
      if (!this.field_49513.isEmpty()) {
         class_3416 var4 = new class_3416();

         for (class_9343 var6 : this.field_49513) {
            var4.add(var6.method_43119());
         }

         var3.put("Modifiers", var4);
      }

      return var3;
   }

   public void method_45014(CompoundNBT var1) {
      this.field_49514 = var1.method_25932("Base");
      if (var1.contains("Modifiers", 9)) {
         class_3416 var4 = var1.method_25927("Modifiers", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            class_9343 var6 = class_9343.method_43120(var4.method_15764(var5));
            if (var6 != null) {
               this.field_49510.put(var6.method_43122(), var6);
               this.method_44995(var6.method_43121()).add(var6);
               this.field_49513.add(var6);
            }
         }
      }

      this.method_44999();
   }
}
