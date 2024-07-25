package remapped;

public class class_2559 implements class_857 {
   public class_2559(class_3755 var1) {
      this.field_12661 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4787 var4 = var1.method_23255().<class_4787>method_6746(class_4787.class);
      class_2376 var5 = new class_2376(var4);
      class_6545 var6 = var1.<class_6545>method_23261(var5);
      var1.method_23246();
      if (var6.method_29862() != null) {
         for (class_5531 var8 : var6.method_29862()) {
            if (var8.method_25125("id")) {
               String var9 = var8.<class_887>method_25123("id").method_3809();
               if (var9.equals("MobSpawner")) {
                  class_3048.method_13916(var8);
               }

               var8.<class_887>method_25123("id").method_3808(class_7593.method_34500(var9));
            }
         }
      }
   }
}
