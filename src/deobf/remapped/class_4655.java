package remapped;

public class class_4655 {
   public final int field_22709;
   public final int field_22708;
   private class_4580 field_22711;
   private class_7030 field_22710;

   public class_4655(int var1, int var2) {
      this.field_22709 = var1;
      this.field_22708 = var2;
      this.field_22711 = new class_4580(new class_7030(this.field_22709 / 2, this.field_22708 / 2));
      this.method_21534();
   }

   public void method_21537() {
      this.field_22711.method_21232();
      if (this.field_22711.method_21231(this.field_22710)) {
         this.method_21534();
         this.field_22711.method_21234();
         SigmaMainClass.getInstance().method_3315().method_21206("pop");
      }

      if (this.field_22711.method_21235() || this.method_21531()) {
         this.method_21528();
      }
   }

   public boolean method_21531() {
      for (class_7030 var4 : this.field_22711.method_21230()) {
         if (var4.field_36201 < 0 || var4.field_36203 < 0 || var4.field_36201 >= this.field_22709 || var4.field_36203 >= this.field_22708) {
            return true;
         }
      }

      return false;
   }

   public boolean method_21532(class_7030 var1) {
      return var1.field_36201 < 0 || var1.field_36203 < 0 || var1.field_36201 >= this.field_22709 || var1.field_36203 >= this.field_22708;
   }

   public void method_21528() {
      this.field_22711 = new class_4580(new class_7030(this.field_22709 / 2, this.field_22708 / 2));
      this.method_21534();
   }

   public class_7030 method_21533() {
      return new class_7030(this.field_22709, this.field_22708);
   }

   public int method_21527() {
      return this.field_22709 * this.field_22708;
   }

   public class_7030 method_21536() {
      class_7030 var3 = null;

      while (this.field_22711.method_21231(var3) || this.method_21532(var3)) {
         var3 = new class_7030((int)Math.round(Math.random() * (double)this.field_22709), (int)Math.round(Math.random() * (double)this.field_22708));
      }

      return var3;
   }

   public void method_21534() {
      this.field_22710 = this.method_21536();
   }

   public class_7030 method_21529() {
      return this.field_22710;
   }

   public class_4580 method_21530() {
      return this.field_22711;
   }
}
