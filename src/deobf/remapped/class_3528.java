package remapped;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class class_3528 extends class_6127<class_5886> {
   private static String[] field_17286;
   private final Long2LongMap field_17285 = new Long2LongOpenHashMap();
   private int field_17283;
   private long field_17284;

   public class_3528() {
      super(20);
   }

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30910);
   }

   public void method_16299(class_6331 var1, class_5886 var2) {
      if (var2.method_26449()) {
         this.field_17283 = 0;
         this.field_17284 = var1.method_29546() + (long)var1.method_43360().nextInt(20);
         class_1489 var5 = var1.method_28969();
         Predicate var6 = var1x -> {
            long var4 = var1x.method_6077();
            if (!this.field_17285.containsKey(var4)) {
               if (++this.field_17283 < 5) {
                  this.field_17285.put(var4, this.field_17284 + 40L);
                  return true;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         };
         Stream var7 = var5.method_6867(class_236.field_778.method_1007(), var6, var2.method_37075(), 48, class_8122.field_41615);
         class_3998 var8 = var2.method_26927().method_5623(var7, class_236.field_778.method_1006());
         if (var8 != null && var8.method_18433()) {
            BlockPos var9 = var8.method_18426();
            Optional var10 = var5.method_6870(var9);
            if (var10.isPresent()) {
               var2.method_26525().method_5105(class_6044.field_30910, var9);
            }
         } else if (this.field_17283 < 5) {
            this.field_17285.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.field_17284);
         }
      }
   }
}
