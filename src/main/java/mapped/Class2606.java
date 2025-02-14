package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class Class2606 extends Class2605 {
   private static String[] field16852;
   private float field16853;
   private float field16854;
   private float field16855;
   private float field16856;
   public final PhantomEntity field16851;

   public Class2606(PhantomEntity var1) {
      super(var1);
      this.field16851 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16851.getAttackTarget() == null || PhantomEntity.method5340(this.field16851) == Class2143.field14028;
   }

   @Override
   public void method10804() {
      this.field16854 = 5.0F + PhantomEntity.method5341(this.field16851).nextFloat() * 10.0F;
      this.field16855 = -4.0F + PhantomEntity.method5342(this.field16851).nextFloat() * 9.0F;
      this.field16856 = !PhantomEntity.method5343(this.field16851).nextBoolean() ? -1.0F : 1.0F;
      this.method10813();
   }

   @Override
   public void method10805() {
      if (PhantomEntity.method5344(this.field16851).nextInt(350) == 0) {
         this.field16855 = -4.0F + PhantomEntity.method5345(this.field16851).nextFloat() * 9.0F;
      }

      if (PhantomEntity.method5346(this.field16851).nextInt(250) == 0) {
         this.field16854++;
         if (this.field16854 > 15.0F) {
            this.field16854 = 5.0F;
            this.field16856 = -this.field16856;
         }
      }

      if (PhantomEntity.method5347(this.field16851).nextInt(450) == 0) {
         this.field16853 = PhantomEntity.method5348(this.field16851).nextFloat() * 2.0F * (float) Math.PI;
         this.method10813();
      }

      if (this.method10812()) {
         this.method10813();
      }

      if (PhantomEntity.method5339(this.field16851).y < this.field16851.getPosY()
         && !this.field16851.world.method7007(this.field16851.getPosition().method8340(1))) {
         this.field16855 = Math.max(1.0F, this.field16855);
         this.method10813();
      }

      if (PhantomEntity.method5339(this.field16851).y > this.field16851.getPosY()
         && !this.field16851.world.method7007(this.field16851.getPosition().up(1))) {
         this.field16855 = Math.min(-1.0F, this.field16855);
         this.method10813();
      }
   }

   private void method10813() {
      if (BlockPos.ZERO.equals(PhantomEntity.method5349(this.field16851))) {
         PhantomEntity.method5350(this.field16851, this.field16851.getPosition());
      }

      this.field16853 = this.field16853 + this.field16856 * 15.0F * (float) (Math.PI / 180.0);
      PhantomEntity.method5351(
         this.field16851,
         Vector3d.copy(PhantomEntity.method5349(this.field16851))
            .add(
               (double)(this.field16854 * MathHelper.cos(this.field16853)),
               (double)(-4.0F + this.field16855),
               (double)(this.field16854 * MathHelper.sin(this.field16853))
            )
      );
   }
}
