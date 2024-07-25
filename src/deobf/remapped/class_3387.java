package remapped;

public class class_3387 implements Runnable {
   private static String[] field_16692;

   @Override
   public void run() {
      for (class_1455 var4 : class_3446.method_15883().method_33726()) {
         class_3790 var5 = var4.method_6744();
         if (var5 != null && var5.method_17596().method_42441(class_6890.class)) {
            class_4257 var6 = var4.<class_4257>method_6746(class_4257.class);
            if (var6 != null) {
               long var7 = var6.method_19836();
               if (var7 <= System.currentTimeMillis() && var4.method_6733().isOpen()) {
                  class_3446.method_15883().method_33743().<class_3858>method_24490(class_3858.class).method_17897(var4);
               }
            }
         }
      }
   }
}
