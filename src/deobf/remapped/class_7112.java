package remapped;

public class class_7112 extends class_1856 {
   private final class_4457 field_36666;
   private final class_3612 field_36667;
   private final class_4926 field_36665;

   public class_7112(class_7641 var1, class_6041 var2) {
      super(var1, var2);
      class_7641 var5 = var1.method_34607(1835297121L).method_34607(1835626086L);
      this.field_36666 = (class_4457)var5.method_34607(1986881636L);
      class_7641 var6 = var5.method_34607(1937007212L);
      class_8519 var7 = (class_8519)var6.method_34607(1937011556L);
      if (!(var7.method_34611().get(0) instanceof class_3612)) {
         this.field_36667 = null;
         this.field_36665 = class_2967.field_14601;
      } else {
         this.field_36667 = (class_3612)var7.method_34611().get(0);
         long var8 = this.field_36667.method_34615();
         if (var8 != 1836070006L) {
            if (var8 != 1701733238L && var8 != 1685220723L) {
               this.field_9412 = class_8626.method_39618((class_2159)this.field_36667.method_34611().get(0));
            } else {
               this.method_8205((class_6507)this.field_36667.method_34607(1702061171L));
               this.field_9404 = class_623.method_2906(this.field_36667.method_34607(1936289382L));
            }
         } else {
            this.method_8205((class_6507)this.field_36667.method_34607(1702061171L));
         }

         this.field_36665 = class_2967.method_13571(this.field_36667.method_34615());
      }
   }

   @Override
   public class_4923 method_8214() {
      return class_4923.field_25481;
   }

   @Override
   public class_4926 method_8217() {
      return this.field_36665;
   }

   public int method_32679() {
      return this.field_36667 == null ? 0 : this.field_36667.method_16838();
   }

   public int method_32677() {
      return this.field_36667 == null ? 0 : this.field_36667.method_16836();
   }

   public double method_32681() {
      return this.field_36667 == null ? 0.0 : this.field_36667.method_16833();
   }

   public double method_32680() {
      return this.field_36667 == null ? 0.0 : this.field_36667.method_16832();
   }

   public int method_32674() {
      return this.field_36667 == null ? 0 : this.field_36667.method_16835();
   }

   public String method_32676() {
      return this.field_36667 == null ? "" : this.field_36667.method_16837();
   }

   public int method_32678() {
      return this.field_36667 == null ? 0 : this.field_36667.method_16834();
   }

   public int method_32675() {
      return this.field_9406.method_44083();
   }
}
