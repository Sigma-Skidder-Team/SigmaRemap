package mapped;

import net.minecraft.entity.Entity;

import java.util.Random;
import javax.annotation.Nullable;

public class Class7366 extends Class7361 {
   private static String[] field31530;
   private Vector3d field31531;

   public Class7366(Class1007 var1) {
      super(var1);
   }

   @Override
   public void method23359() {
      Vector3d var3 = this.field31519.method4334(1.0F).method11333();
      var3.method11351((float) (-Math.PI / 4));
      double var4 = this.field31519.field5624.getPosX();
      double var6 = this.field31519.field5624.method3440(0.5);
      double var8 = this.field31519.field5624.getPosZ();

      for (int var10 = 0; var10 < 8; var10++) {
         Random var11 = this.field31519.method3013();
         double var12 = var4 + var11.nextGaussian() / 2.0;
         double var14 = var6 + var11.nextGaussian() / 2.0;
         double var16 = var8 + var11.nextGaussian() / 2.0;
         Vector3d var18 = this.field31519.method3433();
         this.field31519
            .world
            .method6746(
               Class7940.field34056,
               var12,
               var14,
               var16,
               -var3.x * 0.08F + var18.x,
               -var3.y * 0.3F + var18.y,
               -var3.z * 0.08F + var18.z
            );
         var3.method11351((float) (Math.PI / 16));
      }
   }

   @Override
   public void method23360() {
      if (this.field31531 == null) {
         this.field31531 = Vector3d.method11330(this.field31519.world.method7006(Class101.field300, Class2909.field17994));
      }

      if (this.field31531.method11343(this.field31519.getPosX(), this.field31519.getPosY(), this.field31519.getPosZ()) < 1.0) {
         this.field31519.method4336().<Class7365>method32673(Class9598.field44901).method23370();
         this.field31519.method4336().method32671(Class9598.field44902);
      }
   }

   @Override
   public float method23364() {
      return 1.5F;
   }

   @Override
   public float method23367() {
      float var3 = MathHelper.method37766(Entity.method3234(this.field31519.method3433())) + 1.0F;
      float var4 = Math.min(var3, 40.0F);
      return var4 / var3;
   }

   @Override
   public void method23362() {
      this.field31531 = null;
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return this.field31531;
   }

   @Override
   public Class9598<Class7366> method23368() {
      return Class9598.field44899;
   }
}
