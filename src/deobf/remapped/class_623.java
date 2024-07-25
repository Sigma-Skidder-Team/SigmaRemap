package remapped;

public abstract class class_623 {
   private final class_4926 field_3537;

   public static class_623 method_2906(class_7641 var0) {
      Object var3 = null;
      if (var0.method_34608(1935894637L)) {
         class_8980 var4 = (class_8980)var0.method_34607(1935894637L);
         long var5 = var4.method_41174();
         if (var5 == class_4762.method_21957(class_4762.field_23050)) {
            var3 = new class_6481(var0);
         }
      }

      if (var3 == null) {
         var3 = new class_4268(var0);
      }

      return (class_623)var3;
   }

   public class_623(class_7641 var1) {
      long var4 = ((class_9559)var1.method_34607(1718775137L)).method_44162();
      class_4926 var6;
      if ((var6 = class_3040.method_13885(var4)).equals(class_3040.field_14914)) {
         if ((var6 = class_2967.method_13571(var4)).equals(class_2967.field_14601)) {
            this.field_3537 = null;
         } else {
            this.field_3537 = var6;
         }
      } else {
         this.field_3537 = var6;
      }
   }

   public class_4926 method_2907() {
      return this.field_3537;
   }

   public abstract class_4762 method_2905();
}
