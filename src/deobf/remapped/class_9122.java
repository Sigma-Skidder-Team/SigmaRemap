package remapped;

public class class_9122 extends class_7164<class_7666, class_5103<class_7666>> {
   private static final Identifier field_46680 = new Identifier("textures/entity/villager/villager.png");

   public class_9122(class_6122 var1, class_550 var2) {
      super(var1, new class_5103<class_7666>(0.0F), 0.5F);
      this.method_29100(new class_8386<class_7666, class_5103<class_7666>>(this));
      this.method_29100(new class_3295<class_7666, class_5103<class_7666>>(this, var2, "villager"));
      this.method_29100(new class_6741<class_7666, class_5103<class_7666>>(this));
   }

   public Identifier method_41977(class_7666 var1) {
      return field_46680;
   }

   public void method_41978(class_7666 var1, class_7966 var2, float var3) {
      float var6 = 0.9375F;
      if (!var1.method_26449()) {
         this.field_36492 = 0.5F;
      } else {
         var6 = (float)((double)var6 * 0.5);
         this.field_36492 = 0.25F;
      }

      var2.method_36062(var6, var6, var6);
   }
}
