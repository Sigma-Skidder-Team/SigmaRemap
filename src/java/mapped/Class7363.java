package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class7363 extends Class7362 {
   private static String[] field31520;
   private static final Class8522 field31521 = new Class8522().method30203(150.0);
   private final Class8522 field31522;
   private int field31523;

   public Class7363(Class1007 var1) {
      super(var1);
      this.field31522 = new Class8522().method30203(20.0).method30209(var1x -> Math.abs(var1x.getPosY() - var1.getPosY()) <= 10.0);
   }

   @Override
   public void method23360() {
      this.field31523++;
      PlayerEntity var3 = this.field31519
         .world
         .method7189(this.field31522, this.field31519, this.field31519.getPosX(), this.field31519.getPosY(), this.field31519.getPosZ());
      if (var3 == null) {
         if (this.field31523 >= 100) {
            var3 = this.field31519
               .world
               .method7189(field31521, this.field31519, this.field31519.getPosX(), this.field31519.getPosY(), this.field31519.getPosZ());
            this.field31519.method4336().method32671(Class9598.field44900);
            if (var3 != null) {
               this.field31519.method4336().method32671(Class9598.field44904);
               this.field31519
                  .method4336()
                  .<Class7371>method32673(Class9598.field44904)
                  .method23376(new Vector3d(var3.getPosX(), var3.getPosY(), var3.getPosZ()));
            }
         }
      } else if (this.field31523 <= 25) {
         Vector3d var4 = new Vector3d(var3.getPosX() - this.field31519.getPosX(), 0.0, var3.getPosZ() - this.field31519.getPosZ()).method11333();
         Vector3d var5 = new Vector3d(
               (double) MathHelper.sin(this.field31519.rotationYaw * (float) (Math.PI / 180.0)),
               0.0,
               (double)(-MathHelper.cos(this.field31519.rotationYaw * (float) (Math.PI / 180.0)))
            )
            .method11333();
         float var6 = (float)var5.method11334(var4);
         float var7 = (float)(Math.acos((double)var6) * 180.0F / (float)Math.PI) + 0.5F;
         if (var7 < 0.0F || var7 > 10.0F) {
            double var8 = var3.getPosX() - this.field31519.field5624.getPosX();
            double var10 = var3.getPosZ() - this.field31519.field5624.getPosZ();
            double var12 = MathHelper.method37778(
               MathHelper.method37793(180.0 - MathHelper.method37814(var8, var10) * 180.0F / (float)Math.PI - (double)this.field31519.rotationYaw), -100.0, 100.0
            );
            this.field31519.field5636 *= 0.8F;
            float var14 = MathHelper.method37766(var8 * var8 + var10 * var10) + 1.0F;
            float var15 = var14;
            if (var14 > 40.0F) {
               var14 = 40.0F;
            }

            this.field31519.field5636 = (float)((double)this.field31519.field5636 + var12 * (double)(0.7F / var14 / var15));
            this.field31519.rotationYaw = this.field31519.rotationYaw + this.field31519.field5636;
         }
      } else {
         this.field31519.method4336().method32671(Class9598.field44903);
      }
   }

   @Override
   public void method23362() {
      this.field31523 = 0;
   }

   @Override
   public Class9598<Class7363> method23368() {
      return Class9598.field44902;
   }
}
