package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Class3698 extends Class3676<Class1046> {
   private static String[] field19740;
   private final Class4913 field19741;
   private final Class8830<Class9378> field19742;
   private final boolean field19743;
   private final Optional<Byte> field19744;
   private long field19745;
   private final Long2ObjectMap<Class8341> field19746 = new Long2ObjectOpenHashMap();

   public Class3698(Class4913 var1, Class8830<Class9378> var2, Class8830<Class9378> var3, boolean var4, Optional<Byte> var5) {
      super(method12569(var2, var3));
      this.field19741 = var1;
      this.field19742 = var3;
      this.field19743 = var4;
      this.field19744 = var5;
   }

   public Class3698(Class4913 var1, Class8830<Class9378> var2, boolean var3, Optional<Byte> var4) {
      this(var1, var2, var2, var3, var4);
   }

   private static ImmutableMap<Class8830<?>, Class2217> method12569(Class8830<Class9378> var0, Class8830<Class9378> var1) {
      Builder var4 = ImmutableMap.builder();
      var4.put(var0, Class2217.field14485);
      if (var1 != var0) {
         var4.put(var1, Class2217.field14485);
      }

      return var4.build();
   }

   public boolean method12508(ServerWorld var1, Class1046 var2) {
      if (this.field19743 && var2.method3005()) {
         return false;
      } else if (this.field19745 != 0L) {
         return var1.method6783() >= this.field19745;
      } else {
         this.field19745 = var2.field5024.method6783() + (long)var1.field9016.nextInt(20);
         return false;
      }
   }

   public void method12502(ServerWorld var1, Class1046 var2, long var3) {
      this.field19745 = var3 + 20L + (long)var1.method6814().nextInt(20);
      Class1653 var7 = var1.method6951();
      this.field19746.long2ObjectEntrySet().removeIf(var2x -> !((Class8341)var2x.getValue()).method29246(var3));
      Predicate<BlockPos> var8 = var3x -> {
         Class8341 var6 = (Class8341)this.field19746.get(var3x.method8332());
         if (var6 != null) {
            if (var6.method29247(var3)) {
               var6.method29245(var3);
               return true;
            } else {
               return false;
            }
         } else {
            return true;
         }
      };
      Set<BlockPos> var9 = var7.method6669(this.field19741.method15182(), var8, var2.method3432(), 48, Class2093.field13635).limit(5L).collect(Collectors.toSet());
      Class8238 var10 = var2.method4230().method21650(var9, this.field19741.method15183());
      if (var10 != null && var10.method28708()) {
         BlockPos var13 = var10.method28712();
         var7.method6676(var13).ifPresent(var5 -> {
            var7.method6672(this.field19741.method15182(), var1xx -> var1xx.equals(var13), var13, 1);
            var2.method2992().method21406(this.field19742, Class9378.method35577(var1.method6813(), var13));
            this.field19744.ifPresent(var2xx -> var1.method6786(var2, var2xx));
            this.field19746.clear();
            Class7393.method23615(var1, var13);
         });
      } else {
         for (BlockPos var12 : var9) {
            this.field19746.computeIfAbsent(var12.method8332(), var3x -> new Class8341(var2.field5024.field9016, var3));
         }
      }
   }
}
