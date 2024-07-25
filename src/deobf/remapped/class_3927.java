package remapped;

import javax.annotation.Nullable;

public class class_3927 extends class_6353<class_9399, class_8108> {
   public static final Identifier field_19079 = new Identifier("textures/entity/armorstand/wood.png");

   public class_3927(EntityRenderDispatcher var1) {
      super(var1, new class_3851(), 0.0F);
      this.method_29100(new class_3035<class_9399, class_8108, class_8108>(this, new class_8108(0.5F), new class_8108(1.0F)));
      this.method_29100(new class_6329<class_9399, class_8108>(this));
      this.method_29100(new class_8062<class_9399, class_8108>(this));
      this.method_29100(new class_8386<class_9399, class_8108>(this));
   }

   public Identifier method_18159(class_9399 var1) {
      return field_19079;
   }

   public void method_18157(class_9399 var1, class_7966 var2, float var3, float var4, float var5) {
      var2.method_36060(class_2426.field_12074.method_11074(180.0F - var4));
      float var8 = (float)(var1.world.method_29546() - var1.field_48050) + var5;
      if (var8 < 5.0F) {
         var2.method_36060(class_2426.field_12074.method_11074(MathHelper.sin(var8 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   public boolean method_18158(class_9399 var1) {
      double var4 = this.field_36493.method_28129(var1);
      float var6 = !var1.method_37382() ? 64.0F : 32.0F;
      return !(var4 >= (double)(var6 * var6)) ? var1.method_37135() : false;
   }

   @Nullable
   public RenderLayer method_18160(class_9399 var1, boolean var2, boolean var3, boolean var4) {
      if (var1.method_43493()) {
         Identifier var7 = this.method_18159(var1);
         if (!var3) {
            return !var2 ? null : RenderLayer.method_16737(var7, false);
         } else {
            return RenderLayer.method_16754(var7, false);
         }
      } else {
         return super.method_29108(var1, var2, var3, var4);
      }
   }
}
