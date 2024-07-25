package remapped;

public final class class_9227 {
   public final class_3918 field_47173;
   public final class_7839 field_47172;

   public class_9227(class_3918 var1, class_7839 var2) {
      this.field_47173 = var1;
      this.field_47172 = var2;
   }

   public static boolean method_42581(class_7839 var0, class_3918 var1) {
      switch (var0.method_35490()) {
         case 302:
         case 307:
            if (var0.method_35472("Expires") == null
               && var0.method_35470().method_7896() == -1
               && !var0.method_35470().method_7898()
               && !var0.method_35470().method_7891()) {
               break;
            }
         case 200:
         case 203:
         case 204:
         case 300:
         case 301:
         case 308:
         case 404:
         case 405:
         case 410:
         case 414:
         case 501:
            return !var0.method_35470().method_7894() && !var1.method_18143().method_7894();
      }

      return false;
   }
}
