package remapped;

import java.util.Optional;
import javax.annotation.Nullable;

public final class class_9757 implements class_3825 {
   private final class_5885 field_49563 = new class_5885(null);
   private final class_5885 field_49562 = new class_5885(null);

   @Override
   public float method_17802(ItemStack var1, ClientWorld var2, LivingEntity var3) {
      Object var6 = var3 == null ? var1.method_27993() : var3;
      if (var6 == null) {
         return 0.0F;
      } else {
         if (var2 == null && ((Entity)var6).world instanceof ClientWorld) {
            var2 = (ClientWorld)((Entity)var6).world;
         }

         BlockPos var7 = !class_8036.method_36487(var1) ? this.method_45037(var2) : this.method_45036(var2, var1.method_27994());
         long var8 = var2.method_29546();
         if (var7 != null
            && !(
               ((Entity)var6).method_37245()
                     .method_6203((double)var7.method_12173() + 0.5, ((Entity)var6).method_37245().method_60(), (double)var7.method_12185() + 0.5)
                  < 1.0E-5F
            )) {
            boolean var12 = var3 instanceof PlayerEntity && ((PlayerEntity)var3).method_3183();
            double var13 = 0.0;
            if (!var12) {
               if (!(var6 instanceof class_7451)) {
                  if (!(var6 instanceof class_91)) {
                     if (var3 != null) {
                        var13 = (double)var3.field_29605;
                     }
                  } else {
                     var13 = (double)(180.0F - ((class_91)var6).method_245(0.5F) / (float) (Math.PI * 2) * 360.0F);
                  }
               } else {
                  var13 = this.method_45033((class_7451)var6);
               }
            } else {
               var13 = (double)var3.rotationYaw;
            }

            var13 = class_9299.method_42799(var13 / 360.0, 1.0);
            double var15 = this.method_45034(class_1343.method_6216(var7), (Entity)var6) / (float) (Math.PI * 2);
            double var17;
            if (!var12) {
               var17 = 0.5 - (var13 - 0.25 - var15);
            } else {
               if (class_5885.method_26833(this.field_49563, var8)) {
                  class_5885.method_26834(this.field_49563, var8, 0.5 - (var13 - 0.25));
               }

               var17 = var15 + class_5885.method_26832(this.field_49563);
            }

            return class_9299.method_42800((float)var17, 1.0F);
         } else {
            if (class_5885.method_26833(this.field_49562, var8)) {
               class_5885.method_26834(this.field_49562, var8, Math.random());
            }

            double var10 = class_5885.method_26832(this.field_49562) + (double)((float)var1.hashCode() / 2.1474836E9F);
            return class_9299.method_42800((float)var10, 1.0F);
         }
      }
   }

   @Nullable
   private BlockPos method_45037(ClientWorld var1) {
      return !var1.method_22572().method_40233() ? null : var1.method_758();
   }

   @Nullable
   private BlockPos method_45036(World var1, CompoundNBT var2) {
      boolean var5 = var2.method_25938("LodestonePos");
      boolean var6 = var2.method_25938("LodestoneDimension");
      if (var5 && var6) {
         Optional var7 = class_8036.method_36488(var2);
         if (var7.isPresent() && var1.method_29545() == var7.get()) {
            return class_4338.method_20189(var2.getCompound("LodestonePos"));
         }
      }

      return null;
   }

   private double method_45033(class_7451 var1) {
      Direction var4 = var1.method_37365();
      int var5 = !var4.method_1029().method_42626() ? 0 : 90 * var4.method_1049().method_549();
      return (double)class_9299.method_42811(180 + var4.method_1031() * 90 + var1.method_33907() * 45 + var5);
   }

   private double method_45034(class_1343 var1, Entity var2) {
      return Math.atan2(var1.method_62() - var2.getPosZ(), var1.method_61() - var2.getPosX());
   }
}
