package remapped;

public class class_9391 extends class_7164<class_3845, class_7677<class_3845>> {
   private static final Identifier field_47992 = new Identifier("textures/entity/turtle/big_sea_turtle.png");

   public class_9391(class_6122 var1) {
      super(var1, new class_7677<class_3845>(0.0F), 0.7F);
   }

   public void method_43446(class_3845 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      if (var1.method_26449()) {
         this.field_36492 *= 0.5F;
      }

      super.method_32866(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_43445(class_3845 var1) {
      return field_47992;
   }
}
