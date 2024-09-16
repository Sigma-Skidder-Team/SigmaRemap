package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;

public class Class7370 extends Class7361 {
   private static String[] field31543;
   private Vector3d field31544;
   private int field31545;

   public Class7370(Class1007 var1) {
      super(var1);
   }

   @Override
   public void method23359() {
      if (this.field31545++ % 10 == 0) {
         float var3 = (this.field31519.getRNG().nextFloat() - 0.5F) * 8.0F;
         float var4 = (this.field31519.getRNG().nextFloat() - 0.5F) * 4.0F;
         float var5 = (this.field31519.getRNG().nextFloat() - 0.5F) * 8.0F;
         this.field31519
            .world
            .addParticle(
               ParticleTypes.field34069,
               this.field31519.getPosX() + (double)var3,
               this.field31519.getPosY() + 2.0 + (double)var4,
               this.field31519.getPosZ() + (double)var5,
               0.0,
               0.0,
               0.0
            );
      }
   }

   @Override
   public void method23360() {
      this.field31545++;
      if (this.field31544 == null) {
         BlockPos var5 = this.field31519.world.method7006(Heightmap.Type.field299, Class2909.field17994);
         this.field31544 = Vector3d.method11330(var5);
      }

      double var3 = this.field31544.method11343(this.field31519.getPosX(), this.field31519.getPosY(), this.field31519.getPosZ());
      if (!(var3 < 100.0) && !(var3 > 22500.0) && !this.field31519.collidedHorizontally && !this.field31519.collidedVertically) {
         this.field31519.setHealth(1.0F);
      } else {
         this.field31519.setHealth(0.0F);
      }
   }

   @Override
   public void method23362() {
      this.field31544 = null;
      this.field31545 = 0;
   }

   @Override
   public float method23364() {
      return 3.0F;
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return this.field31544;
   }

   @Override
   public Class9598<Class7370> method23368() {
      return Class9598.field44905;
   }
}
