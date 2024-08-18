package remapped;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;

public class class_7302 extends class_3599 {
   public final class_4612 field_37323;
   private final double field_37325;
   private class_3998 field_37320;
   private BlockPos field_37324;
   private final boolean field_37327;
   private final List<BlockPos> field_37321 = Lists.newArrayList();
   private final int field_37319;
   private final BooleanSupplier field_37326;

   public class_7302(class_4612 var1, double var2, boolean var4, int var5, BooleanSupplier var6) {
      this.field_37323 = var1;
      this.field_37325 = var2;
      this.field_37327 = var4;
      this.field_37319 = var5;
      this.field_37326 = var6;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
      if (!class_3613.method_16840(var1)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean method_16795() {
      if (!class_3613.method_16840(this.field_37323)) {
         return false;
      } else {
         this.method_33301();
         if (this.field_37327 && this.field_37323.world.method_29602()) {
            return false;
         } else {
            class_6331 var3 = (class_6331)this.field_37323.world;
            BlockPos var4 = this.field_37323.method_37075();
            if (!var3.method_28981(var4, 6)) {
               return false;
            } else {
               Vector3d var5 = class_3425.method_15846(this.field_37323, 15, 7, var3x -> {
                  if (var3.method_28994(var3x)) {
                     Optional var6x = var3.method_28969().method_6876(class_236.field_768, this::method_33300, var3x, 10, class_8122.field_41618);
                     return var6x.isPresent() ? -((BlockPos)var6x.get()).method_12180(var4) : Double.NEGATIVE_INFINITY;
                  } else {
                     return Double.NEGATIVE_INFINITY;
                  }
               });
               if (var5 == null) {
                  return false;
               } else {
                  Optional var6 = var3.method_28969().method_6876(class_236.field_768, this::method_33300, new BlockPos(var5), 10, class_8122.field_41618);
                  if (!var6.isPresent()) {
                     return false;
                  } else {
                     this.field_37324 = ((BlockPos)var6.get()).method_6072();
                     class_8985 var7 = (class_8985)this.field_37323.method_26927();
                     boolean var8 = var7.method_41200();
                     var7.method_41199(this.field_37326.getAsBoolean());
                     this.field_37320 = var7.method_5615(this.field_37324, 0);
                     var7.method_41199(var8);
                     if (this.field_37320 == null) {
                        Vector3d var9 = class_3425.method_15837(this.field_37323, 10, 7, Vector3d.method_6200(this.field_37324));
                        if (var9 == null) {
                           return false;
                        }

                        var7.method_41199(this.field_37326.getAsBoolean());
                        this.field_37320 = this.field_37323.method_26927().method_5614(var9.field_7336, var9.field_7333, var9.field_7334, 0);
                        var7.method_41199(var8);
                        if (this.field_37320 == null) {
                           return false;
                        }
                     }

                     for (int var12 = 0; var12 < this.field_37320.method_18437(); var12++) {
                        class_5851 var10 = this.field_37320.method_18447(var12);
                        BlockPos var11 = new BlockPos(var10.field_29731, var10.field_29735 + 1, var10.field_29736);
                        if (class_4115.method_19107(this.field_37323.world, var11)) {
                           this.field_37320 = this.field_37323
                              .method_26927()
                              .method_5614((double)var10.field_29731, (double)var10.field_29735, (double)var10.field_29736, 0);
                           break;
                        }
                     }

                     return this.field_37320 != null;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method_16799() {
      return !this.field_37323.method_26927().method_5591()
         ? !this.field_37324.method_12170(this.field_37323.method_37245(), (double)(this.field_37323.method_37086() + (float)this.field_37319))
         : false;
   }

   @Override
   public void method_16796() {
      this.field_37323.method_26927().method_5607(this.field_37320, this.field_37325);
   }

   @Override
   public void method_16793() {
      if (this.field_37323.method_26927().method_5591() || this.field_37324.method_12170(this.field_37323.method_37245(), (double)this.field_37319)) {
         this.field_37321.add(this.field_37324);
      }
   }

   private boolean method_33300(BlockPos var1) {
      for (BlockPos var5 : this.field_37321) {
         if (Objects.equals(var1, var5)) {
            return false;
         }
      }

      return true;
   }

   private void method_33301() {
      if (this.field_37321.size() > 15) {
         this.field_37321.remove(0);
      }
   }
}
