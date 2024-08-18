package remapped;

public class class_7314 extends class_9733 {
   private static String[] field_37397;
   private final class_3017 field_37396;
   private final Entity field_37398;
   private final Entity field_37395;
   private int field_37399;
   private final EntityRenderDispatcher field_37400;

   public class_7314(EntityRenderDispatcher var1, class_3017 var2, ClientWorld var3, Entity var4, Entity var5) {
      this(var1, var2, var3, var4, var5, var4.method_37098());
   }

   private class_7314(EntityRenderDispatcher var1, class_3017 var2, ClientWorld var3, Entity var4, Entity var5, Vector3d var6) {
      super(var3, var4.getPosX(), var4.method_37309(), var4.getPosZ(), var6.field_7336, var6.field_7333, var6.field_7334);
      this.field_37396 = var2;
      this.field_37398 = this.method_33357(var4);
      this.field_37395 = var5;
      this.field_37400 = var1;
   }

   private Entity method_33357(Entity var1) {
      return (Entity)(var1 instanceof class_91 ? ((class_91)var1).method_259() : var1);
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36844;
   }

   @Override
   public void method_44951(class_7907 var1, Camera var2, float var3) {
      class_3009 var6 = null;
      if (Config.method_14424()) {
         var6 = class_6588.field_33770;
         class_6588.method_30181(this.field_37398);
      }

      float var7 = ((float)this.field_37399 + var3) / 3.0F;
      var7 *= var7;
      double var8 = MathHelper.lerp((double)var3, this.field_37395.field_41754, this.field_37395.getPosX());
      double var10 = MathHelper.lerp((double)var3, this.field_37395.field_41713, this.field_37395.method_37309()) + 0.5;
      double var12 = MathHelper.lerp((double)var3, this.field_37395.field_41724, this.field_37395.getPosZ());
      double var14 = MathHelper.lerp((double)var7, this.field_37398.getPosX(), var8);
      double var16 = MathHelper.lerp((double)var7, this.field_37398.method_37309(), var10);
      double var18 = MathHelper.lerp((double)var7, this.field_37398.getPosZ(), var12);
      class_3758 var20 = this.field_37396.method_13796();
      Vector3d var21 = var2.method_41627();
      this.field_37400
         .method_28115(
            this.field_37398,
            var14 - var21.method_61(),
            var16 - var21.method_60(),
            var18 - var21.method_62(),
            this.field_37398.rotationYaw,
            var3,
            new class_7966(),
            var20,
            this.field_37400.method_28120(this.field_37398, var3)
         );
      var20.method_17415();
      if (Config.method_14424()) {
         class_6588.method_30261((Entity)null);
         class_6588.method_30236(var6);
      }
   }

   @Override
   public void method_44949() {
      this.field_37399++;
      if (this.field_37399 == 3) {
         this.method_44948();
      }
   }
}
