package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public abstract class Class4874<T extends Class4457> implements Class4907<T> {
   private final Map<Class8019, Set<Class9282<T>>> field22708 = Maps.newIdentityHashMap();

   @Override
   public final void method15049(Class8019 var1, Class9282<T> var2) {
      this.field22708.computeIfAbsent(var1, var0 -> Sets.newHashSet()).add(var2);
   }

   @Override
   public final void method15050(Class8019 var1, Class9282<T> var2) {
      Set var5 = this.field22708.get(var1);
      if (var5 != null) {
         var5.remove(var2);
         if (var5.isEmpty()) {
            this.field22708.remove(var1);
         }
      }
   }

   @Override
   public final void method15051(Class8019 var1) {
      this.field22708.remove(var1);
   }

   public abstract T method15047(JsonObject var1, Class9587 var2, Class9366 var3);

   public final T method15054(JsonObject var1, Class9366 var2) {
      Class9587 var5 = Class9587.method37223(var1, "player", var2);
      return this.method15047(var1, var5, var2);
   }

   public void method15053(ServerPlayerEntity var1, Predicate<T> var2) {
      Class8019 var5 = var1.method2823();
      Set<Class9282<T>> var6 = this.field22708.get(var5);
      if (var6 != null && !var6.isEmpty()) {
         LootContext var7 = Class6671.method20332(var1, var1);
         List<Class9282<T>> var8 = null;

         for (Class9282<T> var10 : var6) {
            T var11 = var10.method35005();
            if (var11.method14094().method37227(var7) && var2.test(var11)) {
               if (var8 == null) {
                  var8 = Lists.newArrayList();
               }

               var8.add(var10);
            }
         }

         if (var8 != null) {
            for (Class9282 var13 : var8) {
               var13.method35006(var5);
            }
         }
      }
   }
}
