package mapped;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Class3689 extends Class3676<Class880> {
   private static String[] field19708;
   private final float field19709;
   private final Long2LongMap field19710 = new Long2LongOpenHashMap();
   private int field19711;
   private long field19712;

   public Class3689(float var1) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14485, Class8830.field39813, Class2217.field14485));
      this.field19709 = var1;
   }

   @Override
   public boolean method12508(Class1657 var1, Class880 var2) {
      if (var1.method6783() - this.field19712 < 20L) {
         return false;
      } else {
         Class1046 var5 = (Class1046)var2;
         Class1653 var6 = var1.method6951();
         Optional var7 = var6.method6671(Class4913.field22766.method15182(), var2.method3432(), 48, Class2093.field13637);
         return var7.isPresent() && !(((BlockPos)var7.get()).method8318(var5.method3432()) <= 4.0);
      }
   }

   @Override
   public void method12502(Class1657 var1, Class880 var2, long var3) {
      this.field19711 = 0;
      this.field19712 = var1.method6783() + (long)var1.method6814().nextInt(20);
      Class1046 var7 = (Class1046)var2;
      Class1653 var8 = var1.method6951();
      Predicate<BlockPos> var9 = var1x -> {
         long var4 = var1x.method8332();
         if (!this.field19710.containsKey(var4)) {
            if (++this.field19711 < 5) {
               this.field19710.put(var4, this.field19712 + 40L);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      };
      Stream var10 = var8.method6668(Class4913.field22766.method15182(), var9, var2.method3432(), 48, Class2093.field13637);
      Class8238 var11 = var7.method4230().method21649(var10, Class4913.field22766.method15183());
      if (var11 != null && var11.method28708()) {
         BlockPos var12 = var11.method28712();
         Optional var13 = var8.method6676(var12);
         if (var13.isPresent()) {
            var2.method2992().method21406(Class8830.field39824, new Class8999(var12, this.field19709, 1));
            Class7393.method23615(var1, var12);
         }
      } else if (this.field19711 < 5) {
         this.field19710.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.field19712);
      }
   }
}
