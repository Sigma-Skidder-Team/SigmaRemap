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
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9020 {
   private static final Logger field41270 = LogManager.getLogger();
   private final Map<Class4869, Class9805> field41271 = Maps.newHashMap();
   private final Set<Class9805> field41272 = Sets.newHashSet();
   private final Class9767 field41273;

   public Class9020(Class9767 var1) {
      this.field41273 = var1;
   }

   private void method33377(Class9805 var1) {
      if (var1.method38659().method15029()) {
         this.field41272.add(var1);
      }
   }

   public Set<Class9805> method33378() {
      return this.field41272;
   }

   public Collection<Class9805> method33379() {
      return this.field41271.values().stream().filter(var0 -> var0.method38659().method15029()).collect(Collectors.<Class9805>toList());
   }

   @Nullable
   public Class9805 method33380(Class4869 var1) {
      return this.field41271.computeIfAbsent(var1, var1x -> this.field41273.method38415(this::method33377, var1x));
   }

   public boolean method33381(Class4869 var1) {
      return this.field41271.get(var1) != null || this.field41273.method38417(var1);
   }

   public boolean method33382(Class4869 var1, UUID var2) {
      Class9805 var5 = this.field41271.get(var1);
      return var5 == null ? this.field41273.method38418(var1, var2) : var5.method38664(var2) != null;
   }

   public double method33383(Class4869 var1) {
      Class9805 var4 = this.field41271.get(var1);
      return var4 == null ? this.field41273.method38412(var1) : var4.method38674();
   }

   public double method33384(Class4869 var1) {
      Class9805 var4 = this.field41271.get(var1);
      return var4 == null ? this.field41273.method38413(var1) : var4.method38660();
   }

   public double method33385(Class4869 var1, UUID var2) {
      Class9805 var5 = this.field41271.get(var1);
      return var5 == null ? this.field41273.method38414(var1, var2) : var5.method38664(var2).method37933();
   }

   public void method33386(Multimap<Class4869, Class9689> var1) {
      var1.asMap().forEach((var1x, var2) -> {
         Class9805 var5 = this.field41271.get(var1x);
         if (var5 != null) {
            var2.forEach(var5::method38670);
         }
      });
   }

   public void method33387(Multimap<Class4869, Class9689> var1) {
      var1.forEach((var1x, var2) -> {
         Class9805 var5 = this.method33380(var1x);
         if (var5 != null) {
            var5.method38670(var2);
            var5.method38667(var2);
         }
      });
   }

   public void method33388(Class9020 var1) {
      var1.field41271.values().forEach(var1x -> {
         Class9805 var4 = this.method33380(var1x.method38659());
         if (var4 != null) {
            var4.method38677(var1x);
         }
      });
   }

   public ListNBT method33389() {
      ListNBT var3 = new ListNBT();

      for (Class9805 var5 : this.field41271.values()) {
         var3.add(var5.method38678());
      }

      return var3;
   }

   public void method33390(ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.method153(var4);
         String var6 = var5.getString("Name");
         Util.<Class4869>acceptOrElse(Registry.field16087.method9187(ResourceLocation.method8289(var6)), var2 -> {
            Class9805 var5x = this.method33380(var2);
            if (var5x != null) {
               var5x.method38679(var5);
            }
         }, () -> field41270.warn("Ignoring unknown attribute '{}'", var6));
      }
   }
}
