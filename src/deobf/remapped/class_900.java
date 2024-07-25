package remapped;

import java.util.List;

public class class_900 extends Entity {
   private static String[] field_4623;
   private int field_4622;
   public long field_4618;
   private int field_4619;
   private boolean field_4620;
   private class_9359 field_4621;

   public class_900(class_6629<? extends class_900> var1, World var2) {
      super(var1, var2);
      this.field_41750 = true;
      this.field_4622 = 2;
      this.field_4618 = this.field_41717.nextLong();
      this.field_4619 = this.field_41717.nextInt(3) + 1;
   }

   public void method_3858(boolean var1) {
      this.field_4620 = var1;
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3330;
   }

   public void method_3857(class_9359 var1) {
      this.field_4621 = var1;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.field_4622 == 2) {
         class_423 var3 = this.field_41768.method_43370();
         if (var3 == class_423.field_1789 || var3 == class_423.field_1782) {
            this.method_3859(4);
         }

         this.field_41768
            .method_29528(
               (class_704)null,
               this.method_37302(),
               this.method_37309(),
               this.method_37156(),
               class_463.field_1955,
               class_562.field_3330,
               10000.0F,
               0.8F + this.field_41717.nextFloat() * 0.2F
            );
         this.field_41768
            .method_29528(
               (class_704)null,
               this.method_37302(),
               this.method_37309(),
               this.method_37156(),
               class_463.field_2042,
               class_562.field_3330,
               2.0F,
               0.5F + this.field_41717.nextFloat() * 0.2F
            );
      }

      this.field_4622--;
      if (this.field_4622 < 0) {
         if (this.field_4619 != 0) {
            if (this.field_4622 < -this.field_41717.nextInt(10)) {
               this.field_4619--;
               this.field_4622 = 1;
               this.field_4618 = this.field_41717.nextLong();
               this.method_3859(0);
            }
         } else {
            this.method_37204();
         }
      }

      if (this.field_4622 >= 0) {
         if (this.field_41768 instanceof class_6331) {
            if (!this.field_4620) {
               double var4 = 3.0;
               List var6 = this.field_41768
                  .method_25867(
                     this,
                     new class_4092(
                        this.method_37302() - 3.0,
                        this.method_37309() - 3.0,
                        this.method_37156() - 3.0,
                        this.method_37302() + 3.0,
                        this.method_37309() + 6.0 + 3.0,
                        this.method_37156() + 3.0
                     ),
                     Entity::method_37330
                  );

               for (Entity var8 : var6) {
                  var8.method_37384((class_6331)this.field_41768, this);
               }

               if (this.field_4621 != null) {
                  class_8807.field_45044.method_14972(this.field_4621, var6);
               }
            }
         } else {
            this.field_41768.method_29591(2);
         }
      }
   }

   private void method_3859(int var1) {
      if (!this.field_4620 && !this.field_41768.field_33055 && this.field_41768.method_29537().method_1285(class_291.field_1035)) {
         class_1331 var4 = this.method_37075();
         class_2522 var5 = class_9476.method_43768(this.field_41768, var4);
         if (this.field_41768.method_28262(var4).method_8345() && var5.method_8309(this.field_41768, var4)) {
            this.field_41768.method_29594(var4, var5);
         }

         for (int var6 = 0; var6 < var1; var6++) {
            class_1331 var7 = var4.method_6104(this.field_41717.nextInt(3) - 1, this.field_41717.nextInt(3) - 1, this.field_41717.nextInt(3) - 1);
            var5 = class_9476.method_43768(this.field_41768, var7);
            if (this.field_41768.method_28262(var7).method_8345() && var5.method_8309(this.field_41768, var7)) {
               this.field_41768.method_29594(var7, var5);
            }
         }
      }
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = 64.0 * method_37345();
      return var1 < var5 * var5;
   }

   @Override
   public void method_37329() {
   }

   @Override
   public void method_37314(class_5734 var1) {
   }

   @Override
   public void method_37376(class_5734 var1) {
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }
}
