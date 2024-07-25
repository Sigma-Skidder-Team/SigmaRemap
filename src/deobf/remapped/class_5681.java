package remapped;

public final class class_5681 extends Thread {
   private static String[] field_28791;

   public class_5681(String var1) {
      super(var1);
   }

   @Override
   public void run() {
      MinecraftClient var3 = MinecraftClient.method_8510();
      if (var3 != null) {
         class_7762 var4 = var3.method_8515();
         if (var4 != null) {
            var4.method_1641(true);
         }
      }
   }
}
