package com.mentalfrostbyte.jello.target.sorters;

import mapped.InteractAutoBlock;
import mapped.RotationHelper;
import mapped.TimedEntity;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class AngleSorter implements Comparator<TimedEntity> {
   private static String[] field19528;
   public final InteractAutoBlock field19529;

   public AngleSorter(InteractAutoBlock var1) {
      this.field19529 = var1;
   }

   public int compare(TimedEntity var1, TimedEntity var2) {
      Entity var5 = var1.getEntity();
      Entity var6 = var2.getEntity();
      float var7 = RotationHelper.angleDiff(RotationHelper.method34147(var5).yaw, this.field19529.mc.player.rotationYaw);
      float var8 = RotationHelper.angleDiff(RotationHelper.method34147(var6).yaw, this.field19529.mc.player.rotationYaw);
      if (!(var7 - var8 < 0.0F)) {
         if (var7 - var8 != 0.0F) {
            return 1;
         } else {
            float var9 = this.field19529.mc.player.getDistance(var5);
            float var10 = this.field19529.mc.player.getDistance(var6);
            if (!(var9 - var10 < 0.0F)) {
               return var9 - var10 != 0.0F ? 1 : 0;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }
}
