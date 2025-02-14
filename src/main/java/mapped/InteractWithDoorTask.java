package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Iterator;
import java.util.Objects;

public class InteractWithDoorTask extends Class3676<LivingEntity> {
   private static String[] field19737;
   private Class7176 field19738;
   private int field19739;

   public InteractWithDoorTask() {
      super(ImmutableMap.of(MemoryModuleType.field39831, Class2217.field14484, MemoryModuleType.field39833, Class2217.field14486));
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      Class8238 var5 = var2.getBrain().<Class8238>getMemory(MemoryModuleType.field39831).get();
      if (!var5.method28692() && !var5.method28693()) {
         if (Objects.equals(this.field19738, var5.method28705())) {
            if (this.field19739 > 0) {
               this.field19739--;
            }

            return this.field19739 == 0;
         } else {
            this.field19739 = 20;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void startExecuting(ServerWorld var1, LivingEntity var2, long var3) {
      Class8238 var7 = var2.getBrain().<Class8238>getMemory(MemoryModuleType.field39831).get();
      this.field19738 = var7.method28705();
      Class7176 var8 = var7.method28706();
      Class7176 var9 = var7.method28705();
      BlockPos var10 = var8.method22531();
      BlockState var11 = var1.getBlockState(var10);
      if (var11.isIn(BlockTags.field32740)) {
         DoorBlock var12 = (DoorBlock)var11.getBlock();
         if (!var12.method12141(var11)) {
            var12.method12142(var1, var11, var10, true);
         }

         this.method12565(var1, var2, var10);
      }

      BlockPos var15 = var9.method22531();
      BlockState var13 = var1.getBlockState(var15);
      if (var13.isIn(BlockTags.field32740)) {
         DoorBlock var14 = (DoorBlock)var13.getBlock();
         if (!var14.method12141(var13)) {
            var14.method12142(var1, var13, var15, true);
            this.method12565(var1, var2, var15);
         }
      }

      method12561(var1, var2, var8, var9);
   }

   public static void method12561(ServerWorld var0, LivingEntity var1, Class7176 var2, Class7176 var3) {
      Brain<?> var6 = var1.getBrain();
      if (var6.method21404(MemoryModuleType.field39833)) {
         Iterator<Class9378> var7 = var6.getMemory(MemoryModuleType.field39833).get().iterator();

         while (var7.hasNext()) {
            Class9378 var8 = var7.next();
            BlockPos var9 = var8.method35579();
            if ((var2 == null || !var2.method22531().equals(var9)) && (var3 == null || !var3.method22531().equals(var9))) {
               if (!method12564(var0, var1, var8)) {
                  BlockState var10 = var0.getBlockState(var9);
                  if (var10.isIn(BlockTags.field32740)) {
                     DoorBlock var11 = (DoorBlock)var10.getBlock();
                     if (var11.method12141(var10)) {
                        if (!method12562(var0, var1, var9)) {
                           var11.method12142(var0, var10, var9, false);
                           var7.remove();
                        } else {
                           var7.remove();
                        }
                     } else {
                        var7.remove();
                     }
                  } else {
                     var7.remove();
                  }
               } else {
                  var7.remove();
               }
            }
         }
      }
   }

   private static boolean method12562(ServerWorld var0, LivingEntity var1, BlockPos var2) {
      Brain<?> var5 = var1.getBrain();
      return var5.method21404(MemoryModuleType.field39818)
         ? var5.getMemory(MemoryModuleType.field39818)
            .get()
            .stream()
            .filter(var1x -> var1x.getType() == var1.getType())
            .filter(var1x -> var2.withinDistance(var1x.getPositionVec(), 2.0))
            .anyMatch(var2x -> method12563(var0, var2x, var2))
         : false;
   }

   private static boolean method12563(ServerWorld var0, LivingEntity var1, BlockPos var2) {
      if (!var1.getBrain().method21404(MemoryModuleType.field39831)) {
         return false;
      } else {
         Class8238 var5 = var1.getBrain().<Class8238>getMemory(MemoryModuleType.field39831).get();
         if (!var5.method28693()) {
            Class7176 var6 = var5.method28706();
            if (var6 == null) {
               return false;
            } else {
               Class7176 var7 = var5.method28705();
               return var2.equals(var6.method22531()) || var2.equals(var7.method22531());
            }
         } else {
            return false;
         }
      }
   }

   private static boolean method12564(ServerWorld var0, LivingEntity var1, Class9378 var2) {
      return var2.method35578() != var0.getDimensionKey() || !var2.method35579().withinDistance(var1.getPositionVec(), 2.0);
   }

   private void method12565(ServerWorld var1, LivingEntity var2, BlockPos var3) {
      Brain<?> var6 = var2.getBrain();
      Class9378 var7 = Class9378.method35577(var1.getDimensionKey(), var3);
      if (!var6.getMemory(MemoryModuleType.field39833).isPresent()) {
         var6.method21406(MemoryModuleType.field39833, Sets.newHashSet(new Class9378[]{var7}));
      } else {
         var6.getMemory(MemoryModuleType.field39833).get().add(var7);
      }
   }
}
