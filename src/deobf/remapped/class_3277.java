package remapped;

public class class_3277 extends class_7164<class_105, class_6094<class_105>> {
   private static final Identifier field_16220 = new Identifier("textures/entity/fish/cod.png");

   public class_3277(class_6122 var1) {
      super(var1, new class_6094<class_105>(), 0.3F);
   }

   public Identifier method_14964(class_105 var1) {
      return field_16220;
   }

   public void method_14963(class_105 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      float var8 = 4.3F * class_9299.method_42818(0.6F * var3);
      var2.method_36060(class_2426.field_12074.method_11074(var8));
      if (!var1.method_37285()) {
         var2.method_36065(0.1F, 0.1F, -0.1F);
         var2.method_36060(class_2426.field_12076.method_11074(90.0F));
      }
   }
}
