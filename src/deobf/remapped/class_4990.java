package remapped;

public class class_4990 extends class_7164<class_1260, class_3363<class_1260>> {
   private static final Identifier field_25831 = new Identifier("textures/entity/fish/salmon.png");

   public class_4990(class_6122 var1) {
      super(var1, new class_3363<class_1260>(), 0.4F);
   }

   public Identifier method_22953(class_1260 var1) {
      return field_25831;
   }

   public void method_22952(class_1260 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      float var8 = 1.0F;
      float var9 = 1.0F;
      if (!var1.method_37285()) {
         var8 = 1.3F;
         var9 = 1.7F;
      }

      float var10 = var8 * 4.3F * class_9299.method_42818(var9 * 0.6F * var3);
      var2.method_36060(class_2426.field_12074.method_11074(var10));
      var2.method_36065(0.0, 0.0, -0.4F);
      if (!var1.method_37285()) {
         var2.method_36065(0.2F, 0.1F, 0.0);
         var2.method_36060(class_2426.field_12076.method_11074(90.0F));
      }
   }
}
