package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.IBlockReader;

import java.util.EnumSet;

public class Class2695 extends Class2595 {
   private static String[] field17141;
   private final IBlockReader field17142;
   private final MobEntity field17143;
   private LivingEntity field17144;
   private int field17145;

   public Class2695(MobEntity var1) {
      this.field17143 = var1;
      this.field17142 = var1.world;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field17143.method4232();
      if (var3 != null) {
         this.field17144 = var3;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (this.field17144.isAlive()) {
         return this.field17143.getDistanceSq(this.field17144) > 225.0 ? false : !this.field17143.method4230().method21664() || this.method10803();
      } else {
         return false;
      }
   }

   @Override
   public void method10807() {
      this.field17144 = null;
      this.field17143.method4230().method21666();
   }

   @Override
   public void method10805() {
      this.field17143.method4227().method28040(this.field17144, 30.0F, 30.0F);
      double var3 = (double)(this.field17143.getWidth() * 2.0F * this.field17143.getWidth() * 2.0F);
      double var5 = this.field17143.getDistanceSq(this.field17144.getPosX(), this.field17144.getPosY(), this.field17144.getPosZ());
      double var7 = 0.8;
      if (var5 > var3 && var5 < 16.0) {
         var7 = 1.33;
      } else if (var5 < 225.0) {
         var7 = 0.6;
      }

      this.field17143.method4230().method21655(this.field17144, var7);
      this.field17145 = Math.max(this.field17145 - 1, 0);
      if (!(var5 > var3) && this.field17145 <= 0) {
         this.field17145 = 20;
         this.field17143.attackEntityAsMob(this.field17144);
      }
   }
}
