package mapped;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

import net.minecraft.advancements.Advancement;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8220 {
   private static final Logger field35308 = LogManager.getLogger();
   private final Map<ResourceLocation, Advancement> field35309 = Maps.newHashMap();
   private final Set<Advancement> field35310 = Sets.newLinkedHashSet();
   private final Set<Advancement> field35311 = Sets.newLinkedHashSet();
   private Class1132 field35312;

   private void method28593(Advancement var1) {
      for (Advancement var5 : var1.method27029()) {
         this.method28593(var5);
      }

      field35308.info("Forgot about advancement {}", var1.getId());
      this.field35309.remove(var1.getId());
      if (var1.method27026() != null) {
         this.field35311.remove(var1);
         if (this.field35312 != null) {
            this.field35312.method5451(var1);
         }
      } else {
         this.field35310.remove(var1);
         if (this.field35312 != null) {
            this.field35312.method5449(var1);
         }
      }
   }

   public void method28594(Set<ResourceLocation> var1) {
      for (ResourceLocation var5 : var1) {
         Advancement var6 = this.field35309.get(var5);
         if (var6 != null) {
            this.method28593(var6);
         } else {
            field35308.warn("Told to remove advancement {} but I don't know what that is", var5);
         }
      }
   }

   public void method28595(Map<ResourceLocation, Class7999> var1) {
      Function var4 = Functions.forMap(this.field35309, (Advancement)null);

      while (!var1.isEmpty()) {
         boolean var5 = false;
         Iterator var6 = var1.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            ResourceLocation var8 = (ResourceLocation)var7.getKey();
            Class7999 var9 = (Class7999)var7.getValue();
            if (var9.method27315(var4)) {
               Advancement var10 = var9.method27316(var8);
               this.field35309.put(var8, var10);
               var5 = true;
               var6.remove();
               if (var10.method27026() != null) {
                  this.field35311.add(var10);
                  if (this.field35312 != null) {
                     this.field35312.method5450(var10);
                  }
               } else {
                  this.field35310.add(var10);
                  if (this.field35312 != null) {
                     this.field35312.method5448(var10);
                  }
               }
            }
         }

         if (!var5) {
            for (Entry var12 : var1.entrySet()) {
               field35308.error("Couldn't load advancement {}: {}", var12.getKey(), var12.getValue());
            }
            break;
         }
      }

      field35308.info("Loaded {} advancements", this.field35309.size());
   }

   public void method28596() {
      this.field35309.clear();
      this.field35310.clear();
      this.field35311.clear();
      if (this.field35312 != null) {
         this.field35312.method5454();
      }
   }

   public Iterable<Advancement> method28597() {
      return this.field35310;
   }

   public Collection<Advancement> method28598() {
      return this.field35309.values();
   }

   @Nullable
   public Advancement method28599(ResourceLocation var1) {
      return this.field35309.get(var1);
   }

   public void method28600(Class1132 var1) {
      this.field35312 = var1;
      if (var1 != null) {
         for (Advancement var5 : this.field35310) {
            var1.method5448(var5);
         }

         for (Advancement var7 : this.field35311) {
            var1.method5450(var7);
         }
      }
   }
}
