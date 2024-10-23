package com.mentalfrostbyte.jello.target.sorters;

import mapped.InteractAutoBlock;
import mapped.InvManagerUtils;
import mapped.TimedEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Comparator;

public class ArmorSorter implements Comparator<TimedEntity> {
   public final InteractAutoBlock field19523;

   public ArmorSorter(InteractAutoBlock var1) {
      this.field19523 = var1;
   }

   public int compare(TimedEntity var1, TimedEntity var2) {
      Entity var5 = var1.getEntity();
      Entity var6 = var2.getEntity();
      int var7 = !(var5 instanceof PlayerEntity) ? 0 : InvManagerUtils.getTotalArmorProtection((PlayerEntity)var5);
      int var8 = !(var6 instanceof PlayerEntity) ? 0 : InvManagerUtils.getTotalArmorProtection((PlayerEntity)var6);
      if (var7 - var8 >= 0) {
         if (var7 - var8 != 0) {
            return 1;
         } else {
            float var9 = this.field19523.mc.player.getDistance(var5);
            float var10 = this.field19523.mc.player.getDistance(var6);
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
