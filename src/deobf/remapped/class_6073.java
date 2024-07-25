package remapped;

public class class_6073 extends class_7067<class_8008> {
   private static final Identifier field_31085 = new Identifier("textures/entity/lead_knot.png");
   private final class_2743<class_8008> field_31086 = new class_2743<class_8008>();

   public class_6073(class_6122 var1) {
      super(var1);
   }

   public void method_27815(class_8008 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36062(-1.0F, -1.0F, 1.0F);
      this.field_31086.method_29700(var1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      class_7907 var9 = var5.method_11645(this.field_31086.method_45498(field_31085));
      this.field_31086.method_45499(var4, var9, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_27814(class_8008 var1) {
      return field_31085;
   }
}
