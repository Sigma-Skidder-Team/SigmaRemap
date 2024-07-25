package remapped;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class class_3216 extends class_5920<class_5834> {
   private static String[] field_16041;
   private final float field_16039;
   private final Long2LongMap field_16040 = new Long2LongOpenHashMap();
   private int field_16038;
   private long field_16042;

   public class_3216(float var1) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3318, class_6044.field_30854, class_561.field_3318));
      this.field_16039 = var1;
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      if (var1.method_29546() - this.field_16042 < 20L) {
         return false;
      } else {
         class_4612 var5 = (class_4612)var2;
         class_1489 var6 = var1.method_28969();
         Optional var7 = var6.method_6880(class_236.field_778.method_1007(), var2.method_37075(), 48, class_8122.field_41615);
         return var7.isPresent() && !(((class_1331)var7.get()).method_12180(var5.method_37075()) <= 4.0);
      }
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      this.field_16038 = 0;
      this.field_16042 = var1.method_29546() + (long)var1.method_43360().nextInt(20);
      class_4612 var7 = (class_4612)var2;
      class_1489 var8 = var1.method_28969();
      Predicate var9 = var1x -> {
         long var4 = var1x.method_6077();
         if (!this.field_16040.containsKey(var4)) {
            if (++this.field_16038 < 5) {
               this.field_16040.put(var4, this.field_16042 + 40L);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      };
      Stream var10 = var8.method_6867(class_236.field_778.method_1007(), var9, var2.method_37075(), 48, class_8122.field_41615);
      class_3998 var11 = var7.method_26927().method_5623(var10, class_236.field_778.method_1006());
      if (var11 != null && var11.method_18433()) {
         class_1331 var12 = var11.method_18426();
         Optional var13 = var8.method_6870(var12);
         if (var13.isPresent()) {
            var2.method_26525().method_5105(class_6044.field_30889, new class_6651(var12, this.field_16039, 1));
            class_1892.method_8433(var1, var12);
         }
      } else if (this.field_16038 < 5) {
         this.field_16040.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.field_16042);
      }
   }
}
