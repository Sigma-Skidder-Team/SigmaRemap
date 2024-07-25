package remapped;

public class class_8061 extends class_7067<class_8612> {
   private static String[] field_41260;
   private final ItemRenderer field_41261;

   public class_8061(EntityRenderDispatcher var1, ItemRenderer var2) {
      super(var1);
      this.field_41261 = var2;
   }

   public void method_36565(class_8612 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36060(this.field_36493.method_28121());
      var4.method_36060(class_2426.field_12074.method_11074(180.0F));
      if (var1.method_39583()) {
         var4.method_36060(class_2426.field_12076.method_11074(180.0F));
         var4.method_36060(class_2426.field_12074.method_11074(180.0F));
         var4.method_36060(class_2426.field_12080.method_11074(90.0F));
      }

      this.field_41261.method_40269(var1.method_17246(), class_5612.field_28496, var6, class_5367.field_27381, var4, var5);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_36564(class_8612 var1) {
      return class_8359.field_42824;
   }
}
