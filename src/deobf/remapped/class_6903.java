package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class class_6903 extends class_5920<class_4612> {
   private static String[] field_35491;
   private final class_236 field_35489;
   private final class_6044<class_8150> field_35488;
   private final boolean field_35492;
   private final Optional<Byte> field_35486;
   private long field_35490;
   private final Long2ObjectMap<class_4318> field_35487 = new Long2ObjectOpenHashMap();

   public class_6903(class_236 var1, class_6044<class_8150> var2, class_6044<class_8150> var3, boolean var4, Optional<Byte> var5) {
      super(method_31638(var2, var3));
      this.field_35489 = var1;
      this.field_35488 = var3;
      this.field_35492 = var4;
      this.field_35486 = var5;
   }

   public class_6903(class_236 var1, class_6044<class_8150> var2, boolean var3, Optional<Byte> var4) {
      this(var1, var2, var2, var3, var4);
   }

   private static ImmutableMap<class_6044<?>, class_561> method_31638(class_6044<class_8150> var0, class_6044<class_8150> var1) {
      Builder var4 = ImmutableMap.builder();
      var4.put(var0, class_561.field_3318);
      if (var1 != var0) {
         var4.put(var1, class_561.field_3318);
      }

      return var4.build();
   }

   public boolean method_31640(class_6331 var1, class_4612 var2) {
      if (this.field_35492 && var2.method_26449()) {
         return false;
      } else if (this.field_35490 != 0L) {
         return var1.method_29546() >= this.field_35490;
      } else {
         this.field_35490 = var2.world.method_29546() + (long)var1.field_33033.nextInt(20);
         return false;
      }
   }

   public void method_31639(class_6331 var1, class_4612 var2, long var3) {
      this.field_35490 = var3 + 20L + (long)var1.method_43360().nextInt(20);
      class_1489 var7 = var1.method_28969();
      this.field_35487.long2ObjectEntrySet().removeIf(var2x -> !((class_4318)var2x.getValue()).method_20099(var3));
      Predicate var8 = var3x -> {
         class_4318 var6 = (class_4318)this.field_35487.get(var3x.method_6077());
         if (var6 != null) {
            if (var6.method_20097(var3)) {
               var6.method_20098(var3);
               return true;
            } else {
               return false;
            }
         } else {
            return true;
         }
      };
      Set var9 = var7.method_6875(this.field_35489.method_1007(), var8, var2.method_37075(), 48, class_8122.field_41617).limit(5L).collect(Collectors.toSet());
      class_3998 var10 = var2.method_26927().method_5626(var9, this.field_35489.method_1006());
      if (var10 != null && var10.method_18433()) {
         BlockPos var13 = var10.method_18426();
         var7.method_6870(var13).ifPresent(var5 -> {
            var7.method_6861(this.field_35489.method_1007(), var1xx -> var1xx.equals(var13), var13, 1);
            var2.method_26525().method_5105(this.field_35488, class_8150.method_37410(var1.method_29545(), var13));
            this.field_35486.ifPresent(var2xx -> var1.method_29587(var2, var2xx));
            this.field_35487.clear();
            class_1892.method_8433(var1, var13);
         });
      } else {
         for (BlockPos var12 : var9) {
            this.field_35487.computeIfAbsent(var12.method_6077(), var3x -> new class_4318(var2.world.field_33033, var3));
         }
      }
   }
}
