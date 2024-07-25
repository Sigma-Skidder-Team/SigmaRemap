package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public abstract class class_8273<T extends class_4569> implements class_911<T> {
   private final Map<class_3362, Set<class_7787<T>>> field_42430 = Maps.newIdentityHashMap();

   @Override
   public final void method_3902(class_3362 var1, class_7787<T> var2) {
      this.field_42430.computeIfAbsent(var1, var0 -> Sets.newHashSet()).add(var2);
   }

   @Override
   public final void method_3900(class_3362 var1, class_7787<T> var2) {
      Set var5 = this.field_42430.get(var1);
      if (var5 != null) {
         var5.remove(var2);
         if (var5.isEmpty()) {
            this.field_42430.remove(var1);
         }
      }
   }

   @Override
   public final void method_3901(class_3362 var1) {
      this.field_42430.remove(var1);
   }

   public abstract T method_38136(JsonObject var1, class_8938 var2, class_8096 var3);

   public final T method_38134(JsonObject var1, class_8096 var2) {
      class_8938 var5 = class_8938.method_41065(var1, "player", var2);
      return this.method_38136(var1, var5, var2);
   }

   public void method_38137(class_9359 var1, Predicate<T> var2) {
      class_3362 var5 = var1.method_43253();
      Set var6 = this.field_42430.get(var5);
      if (var6 != null && !var6.isEmpty()) {
         class_2792 var7 = class_865.method_3739(var1, var1);
         ArrayList var8 = null;

         for (class_7787 var10 : var6) {
            class_4569 var11 = (class_4569)var10.method_35342();
            if (var11.method_21209().method_41071(var7) && var2.test(var11)) {
               if (var8 == null) {
                  var8 = Lists.newArrayList();
               }

               var8.add(var10);
            }
         }

         if (var8 != null) {
            for (class_7787 var13 : var8) {
               var13.method_35340(var5);
            }
         }
      }
   }
}
