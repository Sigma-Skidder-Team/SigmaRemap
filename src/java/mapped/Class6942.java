package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6942 extends Class6941 {
   private static final Logger field30092 = LogManager.getLogger();

   public int method21376(Collection<Class4843<?>> var1, ServerPlayerEntity var2) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;

      for (Class4843 var8 : var1) {
         ResourceLocation var9 = var8.method14964();
         if (!this.field30089.contains(var9) && !var8.method14965()) {
            this.method21359(var9);
            this.method21367(var9);
            var5.add(var9);
            CriteriaTriggers.field44470.method15130(var2, var8);
            var6++;
         }
      }

      this.method21378(Class2338.field15983, var2, var5);
      return var6;
   }

   public int method21377(Collection<Class4843<?>> var1, ServerPlayerEntity var2) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;

      for (Class4843 var8 : var1) {
         ResourceLocation var9 = var8.method14964();
         if (this.field30089.contains(var9)) {
            this.method21363(var9);
            var5.add(var9);
            var6++;
         }
      }

      this.method21378(Class2338.field15984, var2, var5);
      return var6;
   }

   private void method21378(Class2338 var1, ServerPlayerEntity var2, List<ResourceLocation> var3) {
      var2.field4855.sendPacket(new Class5572(var1, var3, Collections.<ResourceLocation>emptyList(), this.method21374()));
   }

   public Class39 method21379() {
      Class39 var3 = new Class39();
      this.method21374().method34693(var3);
      Class41 var4 = new Class41();

      for (ResourceLocation var6 : this.field30089) {
         var4.add(Class40.method150(var6.toString()));
      }

      var3.method99("recipes", var4);
      Class41 var8 = new Class41();

      for (ResourceLocation var7 : this.field30090) {
         var8.add(Class40.method150(var7.toString()));
      }

      var3.method99("toBeDisplayed", var8);
      return var3;
   }

   public void method21380(Class39 var1, Class282 var2) {
      this.method21373(Class9223.method34692(var1));
      Class41 var5 = var1.method131("recipes", 8);
      this.method21381(var5, this::method21358, var2);
      Class41 var6 = var1.method131("toBeDisplayed", 8);
      this.method21381(var6, this::method21366, var2);
   }

   private void method21381(Class41 var1, Consumer<Class4843<?>> var2, Class282 var3) {
      for (int var6 = 0; var6 < var1.size(); var6++) {
         String var7 = var1.method160(var6);

         try {
            ResourceLocation var8 = new ResourceLocation(var7);
            Optional<? extends Class4843<?>> var9 = var3.method1035(var8);
            if (!var9.isPresent()) {
               field30092.error("Tried to load unrecognized recipe: {} removed now.", var8);
            } else {
               var2.accept(var9.get());
            }
         } catch (Class2496 var10) {
            field30092.error("Tried to load improperly formatted recipe: {} removed now.", var7);
         }
      }
   }

   public void method21382(ServerPlayerEntity var1) {
      var1.field4855.sendPacket(new Class5572(Class2338.field15982, this.field30089, this.field30090, this.method21374()));
   }
}
