package remapped;

public class class_846 implements class_6798<class_2049> {
   private static String[] field_4421;

   public class_846(class_5408 var1, Identifier var2, class_2049 var3) {
      this.field_4420 = var1;
      this.field_4422 = var2;
      this.field_4423 = var3;
   }

   @Override
   public int method_31144() {
      class_7633 var3 = (class_7633)class_5408.method_24611(this.field_4420).get(this.field_4422);
      return var3 != null ? var3.method_31144() : 0;
   }

   public class_2049 method_3695() {
      class_7633 var3 = (class_7633)class_5408.method_24611(this.field_4420).get(this.field_4422);
      if (var3 == null) {
         return class_3541.field_17316;
      } else {
         class_2049 var4 = var3.method_34587();
         return new class_2049(
            var4.method_9578().toString(),
            var4.method_9584() * this.field_4423.method_9584(),
            var4.method_9583() * this.field_4423.method_9583(),
            this.field_4423.method_31144(),
            class_2031.field_10317,
            var4.method_9581() || this.field_4423.method_9581(),
            var4.method_9576(),
            var4.method_9582()
         );
      }
   }

   @Override
   public void method_31145(class_132 var1) {
      class_7633 var4 = (class_7633)class_5408.method_24611(this.field_4420).get(this.field_4422);
      if (var4 != null) {
         var4.method_31145(var1);
      }
   }
}
