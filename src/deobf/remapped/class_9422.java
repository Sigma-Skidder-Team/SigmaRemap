package remapped;

public enum class_9422 {
   public class_9422(String var3) {
   }

   @Override
   public boolean method_23124(class_9359 var1, class_3139 var2) {
      class_3604 var5 = var1.method_43253().method_15389(var2);
      if (var5.method_16811()) {
         return false;
      } else {
         for (String var7 : var5.method_16812()) {
            var1.method_43253().method_15396(var2, var7);
         }

         return true;
      }
   }

   @Override
   public boolean method_23121(class_9359 var1, class_3139 var2, String var3) {
      return var1.method_43253().method_15396(var2, var3);
   }
}
