package remapped;

public class class_7608<T extends Entity & class_3713> extends class_7067<T> {
   private static String[] field_38731;
   private final class_8765 field_38732;
   private final float field_38730;
   private final boolean field_38729;

   public class_7608(EntityRenderDispatcher var1, class_8765 var2, float var3, boolean var4) {
      super(var1);
      this.field_38732 = var2;
      this.field_38730 = var3;
      this.field_38729 = var4;
   }

   public class_7608(EntityRenderDispatcher var1, class_8765 var2) {
      this(var1, var2, 1.0F, false);
   }

   @Override
   public int method_32546(T var1, class_1331 var2) {
      return !this.field_38729 ? super.method_32546((T)var1, var2) : 15;
   }

   @Override
   public void method_32551(T var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      if (var1.field_41697 >= 2 || !(this.field_36493.camera.method_41633().method_37275(var1) < 12.25)) {
         var4.method_36063();
         var4.method_36062(this.field_38730, this.field_38730, this.field_38730);
         var4.method_36060(this.field_36493.method_28121());
         var4.method_36060(class_2426.field_12074.method_11074(180.0F));
         this.field_38732.method_40269(((class_3713)var1).method_17246(), class_5612.field_28496, var6, class_5367.field_27381, var4, var5);
         var4.method_36064();
         super.method_32551((T)var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public Identifier method_11446(Entity var1) {
      return class_8359.field_42824;
   }
}
