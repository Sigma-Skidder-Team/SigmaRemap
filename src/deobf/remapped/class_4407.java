package remapped;

import java.util.EnumSet;

public class class_4407 extends class_3599 {
   private static String[] field_21570;
   public final class_5886 field_21568;
   public Entity field_21563;
   public final float field_21566;
   private int field_21564;
   public final float field_21565;
   public final Class<? extends class_5834> field_21567;
   public final class_4931 field_21569;

   public class_4407(class_5886 var1, Class<? extends class_5834> var2, float var3) {
      this(var1, var2, var3, 0.02F);
   }

   public class_4407(class_5886 var1, Class<? extends class_5834> var2, float var3, float var4) {
      this.field_21568 = var1;
      this.field_21567 = var2;
      this.field_21566 = var3;
      this.field_21565 = var4;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9560));
      if (var2 != class_704.class) {
         this.field_21569 = new class_4931().method_22607((double)var3).method_22601().method_22603().method_22609();
      } else {
         this.field_21569 = new class_4931()
            .method_22607((double)var3)
            .method_22601()
            .method_22603()
            .method_22609()
            .method_22606(var1x -> class_3572.method_16614(var1).test(var1x));
      }
   }

   @Override
   public boolean method_16795() {
      if (!(this.field_21568.method_26594().nextFloat() >= this.field_21565)) {
         if (this.field_21568.method_17809() != null) {
            this.field_21563 = this.field_21568.method_17809();
         }

         if (this.field_21567 != class_704.class) {
            this.field_21563 = this.field_21568
               .field_41768
               .<class_5834>method_25872(
                  this.field_21567,
                  this.field_21569,
                  this.field_21568,
                  this.field_21568.method_37302(),
                  this.field_21568.method_37388(),
                  this.field_21568.method_37156(),
                  this.field_21568.method_37241().method_18899((double)this.field_21566, 3.0, (double)this.field_21566)
               );
         } else {
            this.field_21563 = this.field_21568
               .field_41768
               .method_25860(
                  this.field_21569, this.field_21568, this.field_21568.method_37302(), this.field_21568.method_37388(), this.field_21568.method_37156()
               );
         }

         return this.field_21563 != null;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      if (this.field_21563.method_37330()) {
         return !(this.field_21568.method_37275(this.field_21563) > (double)(this.field_21566 * this.field_21566)) ? this.field_21564 > 0 : false;
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_21564 = 40 + this.field_21568.method_26594().nextInt(40);
   }

   @Override
   public void method_16793() {
      this.field_21563 = null;
   }

   @Override
   public void method_16794() {
      this.field_21568.method_26865().method_17230(this.field_21563.method_37302(), this.field_21563.method_37388(), this.field_21563.method_37156());
      this.field_21564--;
   }
}
