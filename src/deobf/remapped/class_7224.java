package remapped;

public class class_7224 extends class_2160<class_2519, class_8071> {
   private static final Identifier field_37078 = new Identifier("textures/entity/illager/vex.png");
   private static final Identifier field_37079 = new Identifier("textures/entity/illager/vex_charging.png");

   public class_7224(class_6122 var1) {
      super(var1, new class_8071(), 0.3F);
   }

   public int method_33079(class_2519 var1, class_1331 var2) {
      return 15;
   }

   public Identifier method_33080(class_2519 var1) {
      return !var1.method_11463() ? field_37078 : field_37079;
   }

   public void method_33081(class_2519 var1, class_7966 var2, float var3) {
      var2.method_36062(0.4F, 0.4F, 0.4F);
   }
}
