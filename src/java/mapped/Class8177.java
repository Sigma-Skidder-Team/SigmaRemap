package mapped;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public final class Class8177 implements Class8176 {
   private static String[] field35168;
   private double field35169;
   private double field35170;
   private long field35171;

   @Override
   public float method28467(ItemStack var1, ClientWorld var2, LivingEntity var3) {
      Object var6 = var3 == null ? var1.method32168() : var3;
      if (var6 != null) {
         if (var2 == null && ((Entity)var6).world instanceof ClientWorld) {
            var2 = (ClientWorld)((Entity)var6).world;
         }

         if (var2 != null) {
            double var7;
            if (!var2.method6812().isNatural()) {
               var7 = Math.random();
            } else {
               var7 = (double)var2.method7001(1.0F);
            }

            var7 = this.method28468(var2, var7);
            return (float)var7;
         } else {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   private double method28468(World var1, double var2) {
      if (var1.getGameTime() != this.field35171) {
         this.field35171 = var1.getGameTime();
         double var6 = var2 - this.field35169;
         var6 = MathHelper.method37790(var6 + 0.5, 1.0) - 0.5;
         this.field35170 += var6 * 0.1;
         this.field35170 *= 0.9;
         this.field35169 = MathHelper.method37790(this.field35169 + this.field35170, 1.0);
      }

      return this.field35169;
   }
}
