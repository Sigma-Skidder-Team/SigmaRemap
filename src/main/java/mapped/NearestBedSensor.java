package mapped;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NearestBedSensor extends Sensor<MobEntity> {
   private static String[] field33835;
   private final Long2LongMap field33836 = new Long2LongOpenHashMap();
   private int field33837;
   private long field33838;

   public NearestBedSensor() {
      super(20);
   }

   @Override
   public Set<MemoryModuleType<?>> method26424() {
      return ImmutableSet.of(MemoryModuleType.field39834);
   }

   public void method26425(ServerWorld var1, MobEntity var2) {
      if (var2.isChild()) {
         this.field33837 = 0;
         this.field33838 = var1.getGameTime() + (long)var1.method6814().nextInt(20);
         PointOfInterestManager var5 = var1.getPointOfInterestManager();
         Predicate<BlockPos> var6 = var1x -> {
            long var4 = var1x.toLong();
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
         Stream var7 = var5.findAll(PointOfInterestType.HOME.getPredicate(), var6, var2.getPosition(), 48, PointOfInterestManager.Status.ANY);
         Class8238 var8 = var2.method4230().method21649(var7, PointOfInterestType.HOME.getValidRange());
         if (var8 != null && var8.method28708()) {
            BlockPos var9 = var8.method28712();
            Optional var10 = var5.getType(var9);
            if (var10.isPresent()) {
               var2.getBrain().method21406(MemoryModuleType.field39834, var9);
            }
         } else if (this.field33837 < 5) {
            this.field33836.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.field33838);
         }
      }
   }
}
