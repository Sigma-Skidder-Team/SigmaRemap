package remapped;

public class class_8062<T extends class_5834, M extends class_6521<T>> extends class_4171<T, M> {
   private static final Identifier field_41263 = new Identifier("textures/entity/elytra.png");
   private final class_7769<T> field_41262 = new class_7769<T>();

   public class_8062(class_2514<T, M> var1) {
      super(var1);
   }

   public void method_36566(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.method_26520(class_6943.field_35708);
      if (this.method_36568(var13, (T)var4)) {
         Identifier var14;
         if (!(var4 instanceof AbstractClientPlayerEntity)) {
            var14 = this.method_36567(var13, (T)var4);
            if (Config.method_14390()) {
               var14 = class_3290.method_15089(var13, var14);
            }
         } else {
            AbstractClientPlayerEntity var15 = (AbstractClientPlayerEntity)var4;
            if (var15.method_44884() && var15.method_44883() != null) {
               var14 = var15.method_44883();
            } else if (var15.method_44887() && var15.method_44885() && var15.method_44891() != null && var15.method_3168(class_7742.field_39260)) {
               var14 = var15.method_44891();
            } else {
               var14 = this.method_36567(var13, (T)var4);
               if (Config.method_14390()) {
                  var14 = class_3290.method_15089(var13, var14);
               }
            }
         }

         var1.method_36063();
         var1.method_36065(0.0, 0.0, 0.125);
         this.method_19347().method_29701(this.field_41262);
         this.field_41262.method_35240((T)var4, var5, var6, var8, var9, var10);
         class_7907 var16 = ItemRenderer.method_40282(var2, RenderLayer.method_16749(var14), false, var13.method_27977());
         this.field_41262.method_45499(var1, var16, var3, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
         var1.method_36064();
      }
   }

   public boolean method_36568(ItemStack var1, T var2) {
      return var1.method_27960() == class_4897.field_24503;
   }

   public Identifier method_36567(ItemStack var1, T var2) {
      return field_41263;
   }
}
