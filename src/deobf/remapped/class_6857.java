package remapped;

public enum class_6857 {
   public class_6857(String var3) {
   }

   @Override
   public boolean method_23124(class_9359 var1, class_3139 var2) {
      class_3604 var5 = var1.method_43253().method_15389(var2);
      if (!var5.method_16818()) {
         return false;
      } else {
         for (String var7 : var5.method_16817()) {
            var1.method_43253().method_15403(var2, var7);
         }

         return true;
      }
   }

   @Override
   public boolean method_23121(class_9359 var1, class_3139 var2, String var3) {
      return var1.method_43253().method_15403(var2, var3);
   }
}
