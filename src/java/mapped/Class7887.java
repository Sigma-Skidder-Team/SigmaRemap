package mapped;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Class7887 extends Class7882<Class1006> {
   private static String[] field33835;
   private final Long2LongMap field33836 = new Long2LongOpenHashMap();
   private int field33837;
   private long field33838;

   public Class7887() {
      super(20);
   }

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39834);
   }

   public void method26425(ServerWorld var1, Class1006 var2) {
      if (var2.method3005()) {
         this.field33837 = 0;
         this.field33838 = var1.method6783() + (long)var1.method6814().nextInt(20);
         Class1653 var5 = var1.method6951();
         Predicate<BlockPos> var6 = var1x -> {
            long var4 = var1x.method8332();
            if (!this.field33836.containsKey(var4)) {
               if (++this.field33837 < 5) {
                  this.field33836.put(var4, this.field33838 + 40L);
                  return true;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         };
         Stream var7 = var5.method6668(Class4913.field22766.method15182(), var6, var2.getPosition(), 48, Class2093.field13637);
         Class8238 var8 = var2.method4230().method21649(var7, Class4913.field22766.method15183());
         if (var8 != null && var8.method28708()) {
            BlockPos var9 = var8.method28712();
            Optional var10 = var5.method6676(var9);
            if (var10.isPresent()) {
               var2.method2992().method21406(Class8830.field39834, var9);
            }
         } else if (this.field33837 < 5) {
            this.field33836.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.field33838);
         }
      }
   }
}
