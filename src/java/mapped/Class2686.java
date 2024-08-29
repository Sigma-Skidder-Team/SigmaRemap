package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;

import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;

public class Class2686 extends Class2595 {
   public final Class1046 field17103;
   private final double field17104;
   private Class8238 field17105;
   private BlockPos field17106;
   private final boolean field17107;
   private final List<BlockPos> field17108 = Lists.newArrayList();
   private final int field17109;
   private final BooleanSupplier field17110;

   public Class2686(Class1046 var1, double var2, boolean var4, int var5, BooleanSupplier var6) {
      this.field17103 = var1;
      this.field17104 = var2;
      this.field17107 = var4;
      this.field17109 = var5;
      this.field17110 = var6;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
      if (!Class8100.method28053(var1)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean method10803() {
      if (!Class8100.method28053(this.field17103)) {
         return false;
      } else {
         this.method10903();
         if (this.field17107 && this.field17103.world.method6740()) {
            return false;
         } else {
            ServerWorld var3 = (ServerWorld)this.field17103.world;
            BlockPos var4 = this.field17103.getPosition();
            if (!var3.method6954(var4, 6)) {
               return false;
            } else {
               Vector3d var5 = Class8037.method27584(this.field17103, 15, 7, var3x -> {
                  if (var3.method6952(var3x)) {
                     Optional var6x = var3.method6951().method6670(Class4913.field22748, this::method10902, var3x, 10, Class2093.field13636);
                     return var6x.isPresent() ? -((BlockPos)var6x.get()).method8318(var4) : Double.NEGATIVE_INFINITY;
                  } else {
                     return Double.NEGATIVE_INFINITY;
                  }
               });
               if (var5 == null) {
                  return false;
               } else {
                  Optional var6 = var3.method6951().method6670(Class4913.field22748, this::method10902, new BlockPos(var5), 10, Class2093.field13636);
                  if (!var6.isPresent()) {
                     return false;
                  } else {
                     this.field17106 = ((BlockPos)var6.get()).method8353();
                     Class6991 var7 = (Class6991)this.field17103.method4230();
                     boolean var8 = var7.method21683();
                     var7.method21682(this.field17110.getAsBoolean());
                     this.field17105 = var7.method21651(this.field17106, 0);
                     var7.method21682(var8);
                     if (this.field17105 == null) {
                        Vector3d var9 = Class8037.method27587(this.field17103, 10, 7, Vector3d.method11330(this.field17106));
                        if (var9 == null) {
                           return false;
                        }

                        var7.method21682(this.field17110.getAsBoolean());
                        this.field17105 = this.field17103.method4230().method21648(var9.field18048, var9.field18049, var9.field18050, 0);
                        var7.method21682(var8);
                        if (this.field17105 == null) {
                           return false;
                        }
                     }

                     for (int var12 = 0; var12 < this.field17105.method28698(); var12++) {
                        Class7176 var10 = this.field17105.method28695(var12);
                        BlockPos var11 = new BlockPos(var10.field30847, var10.field30848 + 1, var10.field30849);
                        if (Class3461.method12144(this.field17103.world, var11)) {
                           this.field17105 = this.field17103
                              .method4230()
                              .method21648((double)var10.field30847, (double)var10.field30848, (double)var10.field30849, 0);
                           break;
                        }
                     }

                     return this.field17105 != null;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method10806() {
      return !this.field17103.method4230().method21664()
         ? !this.field17106.method8317(this.field17103.getPositionVec(), (double)(this.field17103.method3429() + (float)this.field17109))
         : false;
   }

   @Override
   public void method10804() {
      this.field17103.method4230().method21656(this.field17105, this.field17104);
   }

   @Override
   public void method10807() {
      if (this.field17103.method4230().method21664() || this.field17106.method8317(this.field17103.getPositionVec(), (double)this.field17109)) {
         this.field17108.add(this.field17106);
      }
   }

   private boolean method10902(BlockPos var1) {
      for (BlockPos var5 : this.field17108) {
         if (Objects.equals(var1, var5)) {
            return false;
         }
      }

      return true;
   }

   private void method10903() {
      if (this.field17108.size() > 15) {
         this.field17108.remove(0);
      }
   }
}
