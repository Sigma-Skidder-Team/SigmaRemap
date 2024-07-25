package remapped;

public class class_3779 extends class_5766 {
   private static final String field_18447 = "/reloadShaders";
   private static final String field_18446 = "/reloadChunks";

   public class_3779(class_5766 var1) {
      super(class_765.method_3448(var1));
   }

   @Override
   public void method_1171(String var1) {
      if (!this.method_17502(var1)) {
         super.method_1171(var1);
      } else {
         this.field_943.field_9614.method_13991().method_18697(var1);
      }
   }

   private boolean method_17502(String var1) {
      if (var1 != null) {
         var1 = var1.trim();
         if (!var1.equals("/reloadShaders")) {
            if (!var1.equals("/reloadChunks")) {
               return false;
            } else {
               this.field_943.worldRenderer.method_19998();
               return true;
            }
         } else {
            if (class_3111.method_14424()) {
               class_6588.method_30259();
               class_6588.method_30295();
            }

            return true;
         }
      } else {
         return false;
      }
   }
}
