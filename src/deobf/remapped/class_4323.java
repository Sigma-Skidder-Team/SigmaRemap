package remapped;

public class class_4323 extends class_3711 {
   private static String[] field_21034;
   private final int field_21035;

   public class_4323(class_5886 var1, int var2) {
      super(var1);
      this.field_21035 = var2;
   }

   @Override
   public void method_17234() {
      if (!this.field_18204) {
         if (this.field_18205.method_26927().method_5591()) {
            this.field_18205.rotationPitch = this.method_17239(this.field_18205.rotationPitch, 0.0F, 5.0F);
         }

         this.field_18205.field_29618 = this.method_17239(this.field_18205.field_29618, this.field_18205.field_29605, this.field_18208);
      } else {
         this.field_18204 = false;
         this.field_18205.field_29618 = this.method_17239(this.field_18205.field_29618, this.method_17243() + 20.0F, this.field_18208);
         this.field_18205.rotationPitch = this.method_17239(this.field_18205.rotationPitch, this.method_17233() + 10.0F, this.field_18207);
      }

      float var3 = class_9299.method_42810(this.field_18205.field_29618 - this.field_18205.field_29605);
      if (!(var3 < (float)(-this.field_21035))) {
         if (var3 > (float)this.field_21035) {
            this.field_18205.field_29605 += 4.0F;
         }
      } else {
         this.field_18205.field_29605 -= 4.0F;
      }
   }
}
