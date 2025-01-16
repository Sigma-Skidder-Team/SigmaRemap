package mapped;

import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class Class7365 extends Class7362 {
   private static String[] field31526;
   private int field31527;
   private int field31528;
   private AreaEffectCloudEntity field31529;

   public Class7365(EnderDragonEntity var1) {
      super(var1);
   }

   @Override
   public void method23359() {
      this.field31527++;
      if (this.field31527 % 2 == 0 && this.field31527 < 10) {
         Vector3d var3 = this.field31519.method4334(1.0F).method11333();
         var3.method11351((float) (-Math.PI / 4));
         double var4 = this.field31519.field5624.getPosX();
         double var6 = this.field31519.field5624.getPosYHeight(0.5);
         double var8 = this.field31519.field5624.getPosZ();

         for (int var10 = 0; var10 < 8; var10++) {
            double var11 = var4 + this.field31519.getRNG().nextGaussian() / 2.0;
            double var13 = var6 + this.field31519.getRNG().nextGaussian() / 2.0;
            double var15 = var8 + this.field31519.getRNG().nextGaussian() / 2.0;

            for (int var17 = 0; var17 < 6; var17++) {
               this.field31519
                  .world
                  .addParticle(
                     ParticleTypes.field34056,
                     var11,
                     var13,
                     var15,
                     -var3.x * 0.08F * (double)var17,
                     -var3.y * 0.6F,
                     -var3.z * 0.08F * (double)var17
                  );
            }

            var3.method11351((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void method23360() {
      this.field31527++;
      if (this.field31527 < 200) {
         if (this.field31527 == 10) {
            Vector3d var3 = new Vector3d(
                  this.field31519.field5624.getPosX() - this.field31519.getPosX(),
                  0.0,
                  this.field31519.field5624.getPosZ() - this.field31519.getPosZ()
               )
               .method11333();
            float var4 = 5.0F;
            double var5 = this.field31519.field5624.getPosX() + var3.x * 5.0 / 2.0;
            double var7 = this.field31519.field5624.getPosZ() + var3.z * 5.0 / 2.0;
            double var9 = this.field31519.field5624.getPosYHeight(0.5);
            double var11 = var9;
            BlockPos.Mutable var13 = new BlockPos.Mutable(var5, var9, var7);

            while (this.field31519.world.method7007(var13)) {
               if (--var11 < 0.0) {
                  var11 = var9;
                  break;
               }

               var13.method8373(var5, var11, var7);
            }

            var11 = (double)(MathHelper.floor(var11) + 1);
            this.field31529 = new AreaEffectCloudEntity(this.field31519.world, var5, var11, var7);
            this.field31529.method4113(this.field31519);
            this.field31529.method4097(5.0F);
            this.field31529.method4109(200);
            this.field31529.method4105(ParticleTypes.field34056);
            this.field31529.method4101(new EffectInstance(Effects.INSTANT_DAMAGE));
            this.field31519.world.addEntity(this.field31529);
         }
      } else if (this.field31528 < 4) {
         this.field31519.method4336().method32671(Class9598.field44902);
      } else {
         this.field31519.method4336().method32671(Class9598.field44900);
      }
   }

   @Override
   public void method23362() {
      this.field31527 = 0;
      this.field31528++;
   }

   @Override
   public void method23363() {
      if (this.field31529 != null) {
         this.field31529.remove();
         this.field31529 = null;
      }
   }

   @Override
   public Class9598<Class7365> method23368() {
      return Class9598.field44901;
   }

   public void method23370() {
      this.field31528 = 0;
   }
}
