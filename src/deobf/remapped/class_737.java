package remapped;

public class class_737 extends class_7164<class_1775, class_2210<class_1775>> {
   private static final Identifier field_4017 = new Identifier("textures/entity/strider/strider.png");
   private static final Identifier field_4016 = new Identifier("textures/entity/strider/strider_cold.png");

   public class_737(EntityRenderDispatcher var1) {
      super(var1, new class_2210<class_1775>(), 0.5F);
      this.method_29100(
         new class_4551<class_1775, class_2210<class_1775>>(this, new class_2210<class_1775>(), new Identifier("textures/entity/strider/strider_saddle.png"))
      );
   }

   public Identifier method_3361(class_1775 var1) {
      return !var1.method_7924() ? field_4017 : field_4016;
   }

   public void method_3362(class_1775 var1, class_7966 var2, float var3) {
      if (!var1.method_26449()) {
         this.field_36492 = 0.5F;
      } else {
         var2.method_36062(0.5F, 0.5F, 0.5F);
         this.field_36492 = 0.25F;
      }
   }

   public boolean method_3360(class_1775 var1) {
      return var1.method_7924();
   }
}
