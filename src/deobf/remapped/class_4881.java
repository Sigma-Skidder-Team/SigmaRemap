package remapped;

public class class_4881 extends class_7067<class_2844> {
   private static final class_4639 field_24277 = new class_4639("textures/entity/enderdragon/dragon_fireball.png");
   private static final class_3581 field_24278 = class_3581.method_16755(field_24277);

   public class_4881(class_6122 var1) {
      super(var1);
   }

   public int method_22394(class_2844 var1, class_1331 var2) {
      return 15;
   }

   public void method_22396(class_2844 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36062(2.0F, 2.0F, 2.0F);
      var4.method_36060(this.field_36493.method_28121());
      var4.method_36060(class_2426.field_12074.method_11074(180.0F));
      class_6279 var9 = var4.method_36058();
      class_8107 var10 = var9.method_28620();
      class_6555 var11 = var9.method_28618();
      class_7907 var12 = var5.method_11645(field_24278);
      method_22397(var12, var10, var11, var6, 0.0F, 0, 0, 1);
      method_22397(var12, var10, var11, var6, 1.0F, 0, 1, 1);
      method_22397(var12, var10, var11, var6, 1.0F, 1, 1, 0);
      method_22397(var12, var10, var11, var6, 0.0F, 1, 0, 0);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   private static void method_22397(class_7907 var0, class_8107 var1, class_6555 var2, int var3, float var4, int var5, int var6, int var7) {
      var0.method_35762(var1, var4 - 0.5F, (float)var5 - 0.25F, 0.0F)
         .method_35743(255, 255, 255, 255)
         .method_35745((float)var6, (float)var7)
         .method_35737(class_5367.field_27381)
         .method_35747(var3)
         .method_35756(var2, 0.0F, 1.0F, 0.0F)
         .method_35735();
   }

   public class_4639 method_22395(class_2844 var1) {
      return field_24277;
   }
}
