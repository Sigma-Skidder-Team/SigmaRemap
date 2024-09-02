package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

public class Class899 extends Class898 {
   public int field5139 = 1;

   public Class899(EntityType<? extends Class899> var1, World var2) {
      super(var1, var2);
   }

   public Class899(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(EntityType.field41044, var2, var4, var6, var8, var10, var12, var1);
   }

   public Class899(World var1, LivingEntity var2, double var3, double var5, double var7) {
      super(EntityType.field41044, var2, var3, var5, var7, var1);
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      if (!this.world.isRemote) {
         boolean var4 = this.world.method6789().method17135(Class5462.field24224);
         this.world
            .method6756(
               (Entity)null,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               (float)this.field5139,
               var4,
               !var4 ? Class2141.field14014 : Class2141.field14016
            );
         this.method2904();
      }
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      if (!this.world.isRemote) {
         Entity var4 = var1.getEntity();
         Entity var5 = this.method3460();
         var4.method2741(Class8654.method31121(this, var5), 6.0F);
         if (var5 instanceof LivingEntity) {
            this.method3399((LivingEntity)var5, var4);
         }
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("ExplosionPower", this.field5139);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.contains("ExplosionPower", 99)) {
         this.field5139 = var1.getInt("ExplosionPower");
      }
   }
}
