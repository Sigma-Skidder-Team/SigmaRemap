package remapped;

public interface class_9479 {
   int method_43795();

   static boolean method_43797(LivingEntity var0, LivingEntity var1) {
      float var4 = (float)var0.method_26575(Attributes.ATTACK_DAMAGE);
      float var5;
      if (!var0.method_26449() && (int)var4 > 0) {
         var5 = var4 / 2.0F + (float)var0.world.field_33033.nextInt((int)var4);
      } else {
         var5 = var4;
      }

      boolean var6 = var1.attackEntityFrom(DamageSource.method_28345(var0), var5);
      if (var6) {
         var0.method_37096(var0, var1);
         if (!var0.method_26449()) {
            method_43796(var0, var1);
         }
      }

      return var6;
   }

   static void method_43796(LivingEntity var0, LivingEntity var1) {
      double var4 = var0.method_26575(Attributes.ATTACK_KNOCKBACK);
      double var6 = var1.method_26575(Attributes.KNOCKBACK_RESISTANCE);
      double var8 = var4 - var6;
      if (!(var8 <= 0.0)) {
         double var10 = var1.getPosX() - var0.getPosX();
         double var12 = var1.getPosZ() - var0.getPosZ();
         float var14 = (float)(var0.world.field_33033.nextInt(21) - 10);
         double var15 = var8 * (double)(var0.world.field_33033.nextFloat() * 0.5F + 0.2F);
         Vector3d var17 = new Vector3d(var10, 0.0, var12).method_6213().method_6209(var15).method_6192(var14);
         double var18 = var8 * (double)var0.world.field_33033.nextFloat() * 0.5;
         var1.method_37186(var17.field_7336, var18, var17.field_7334);
         var1.velocityChanged = true;
      }
   }
}
