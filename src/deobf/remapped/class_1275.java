package remapped;

import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1275 implements class_1517 {
   private static final Logger field_7020 = LogManager.getLogger();
   private boolean field_7018;
   private class_7609 field_7019 = class_7609.field_38735;
   private int field_7016;
   private int field_7013;
   private int field_7017;
   private int field_7015;
   private int field_7012;

   @Override
   public int method_6937(class_6331 var1, boolean var2, boolean var3) {
      if (!var1.method_29602() && var2) {
         float var6 = var1.method_13578(0.0F);
         if ((double)var6 == 0.5) {
            this.field_7019 = var1.field_33033.nextInt(10) != 0 ? class_7609.field_38735 : class_7609.field_38733;
         }

         if (this.field_7019 != class_7609.field_38735) {
            if (!this.field_7018) {
               if (!this.method_5715(var1)) {
                  return 0;
               }

               this.field_7018 = true;
            }

            if (this.field_7013 <= 0) {
               this.field_7013 = 2;
               if (this.field_7016 <= 0) {
                  this.field_7019 = class_7609.field_38735;
               } else {
                  this.method_5716(var1);
                  this.field_7016--;
               }

               return 1;
            } else {
               this.field_7013--;
               return 0;
            }
         } else {
            return 0;
         }
      } else {
         this.field_7019 = class_7609.field_38735;
         this.field_7018 = false;
         return 0;
      }
   }

   private boolean method_5715(class_6331 var1) {
      for (PlayerEntity var5 : var1.method_25873()) {
         if (!var5.method_37221()) {
            BlockPos var6 = var5.method_37075();
            if (var1.method_28994(var6) && var1.method_22561(var6).method_28887() != class_8862.field_45296) {
               for (int var7 = 0; var7 < 10; var7++) {
                  float var8 = var1.field_33033.nextFloat() * (float) (Math.PI * 2);
                  this.field_7017 = var6.getX() + MathHelper.floor(MathHelper.cos(var8) * 32.0F);
                  this.field_7015 = var6.getY();
                  this.field_7012 = var6.getZ() + MathHelper.floor(MathHelper.sin(var8) * 32.0F);
                  if (this.method_5713(var1, new BlockPos(this.field_7017, this.field_7015, this.field_7012)) != null) {
                     this.field_7013 = 0;
                     this.field_7016 = 20;
                     break;
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   private void method_5716(class_6331 var1) {
      Vector3d var4 = this.method_5713(var1, new BlockPos(this.field_7017, this.field_7015, this.field_7012));
      if (var4 != null) {
         class_2811 var5;
         try {
            var5 = new class_2811(var1);
            var5.method_26864(var1, var1.method_43368(var5.method_37075()), class_2417.field_12040, (class_8733)null, (CompoundNBT)null);
         } catch (Exception var7) {
            field_7020.warn("Failed to create zombie for village siege at {}", var4, var7);
            return;
         }

         var5.method_37144(var4.field_7336, var4.field_7333, var4.field_7334, var1.field_33033.nextFloat() * 360.0F, 0.0F);
         var1.method_7065(var5);
      }
   }

   @Nullable
   private Vector3d method_5713(class_6331 var1, BlockPos var2) {
      for (int var5 = 0; var5 < 10; var5++) {
         int var6 = var2.getX() + var1.field_33033.nextInt(16) - 8;
         int var7 = var2.getZ() + var1.field_33033.nextInt(16) - 8;
         int var8 = var1.method_22562(class_3801.field_18592, var6, var7);
         BlockPos var9 = new BlockPos(var6, var8, var7);
         if (var1.method_28994(var9) && MonsterEntity.method_5199(EntityType.field_34297, var1, class_2417.field_12040, var9, var1.field_33033)) {
            return Vector3d.method_6200(var9);
         }
      }

      return null;
   }
}
