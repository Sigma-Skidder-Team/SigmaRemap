package remapped;

import java.util.Random;

public class class_7310 extends class_7164<class_912, class_5415<class_912>> {
   private static final Identifier field_37385 = new Identifier("textures/entity/enderman/enderman.png");
   private final Random field_37383 = new Random();

   public class_7310(EntityRenderDispatcher var1) {
      super(var1, new class_5415<class_912>(0.0F), 0.5F);
      this.method_29100(new class_8279<class_912>(this));
      this.method_29100(new class_508(this));
   }

   public void method_33351(class_912 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      class_2522 var9 = var1.method_3913();
      class_5415 var10 = this.method_11447();
      var10.field_27603 = var9 != null;
      var10.field_27602 = var1.method_3910();
      super.method_32866(var1, var2, var3, var4, var5, var6);
   }

   public class_1343 method_33352(class_912 var1, float var2) {
      if (!var1.method_3910()) {
         return super.method_32555(var1, var2);
      } else {
         double var5 = 0.02;
         return new class_1343(this.field_37383.nextGaussian() * 0.02, 0.0, this.field_37383.nextGaussian() * 0.02);
      }
   }

   public Identifier method_33350(class_912 var1) {
      return field_37385;
   }
}
