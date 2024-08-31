package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

import java.util.UUID;

public class Class7460 implements Class7458 {
   private static String[] field32081;
   private Entity field32082;

   @Override
   public int method24123() {
      UUID var3 = this.field32082.getUniqueID();
      long var4 = var3.getLeastSignificantBits();
      return (int)(var4 & 2147483647L);
   }

   @Override
   public BlockPos method24124() {
      return this.field32082.method3210().field43438;
   }

   @Override
   public Biome method24125() {
      return this.field32082.method3210().field43437;
   }

   @Override
   public String method24126() {
      return !this.field32082.method3381() ? null : this.field32082.method3380().getString();
   }

   @Override
   public int method24127() {
      if (this.field32082 instanceof LivingEntity) {
         LivingEntity var3 = (LivingEntity)this.field32082;
         return (int)var3.getHealth();
      } else {
         return 0;
      }
   }

   @Override
   public int method24128() {
      if (this.field32082 instanceof LivingEntity) {
         LivingEntity var3 = (LivingEntity)this.field32082;
         return (int)var3.method3075();
      } else {
         return 0;
      }
   }

   public Entity method24131() {
      return this.field32082;
   }

   public void method24132(Entity var1) {
      this.field32082 = var1;
   }
}
