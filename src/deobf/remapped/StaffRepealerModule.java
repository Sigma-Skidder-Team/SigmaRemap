package remapped;

import java.util.HashMap;

public class StaffRepealerModule extends Module {
   private HashMap<Integer, Integer> field_17352 = new HashMap<Integer, Integer>();

   public StaffRepealerModule() {
      super(Category.MISC, "StaffRepealer", "Repeals hypixel's staff ban laws with a simple rage quit!");
   }

   @EventListen
   private void method_16497(class_5596 var1) {
      if (this.method_42015()) {
         if (class_314.method_1387()) {
            client.gameOptions.method_40870();
         }
      }
   }

   @EventListen
   private void method_16498(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_527) {
            class_527 var4 = (class_527)var1.method_557();
         }

         if (var1.method_557() instanceof class_7867) {
            class_7867 var5 = (class_7867)var1.method_557();
            new Thread(() -> {
               try {
                  Thread.sleep(2000L);
               } catch (InterruptedException var8) {
                  var8.printStackTrace();
               }

               int var3 = 0;

               for (class_5902 var5x : var5.method_35609()) {
                  class_704 var6 = client.theWorld.method_25862(var5x.method_27005().getId());
                  if (var6 == null && var5x.method_27003() != null) {
                     class_314.method_1443("Detected an anomaly " + var5x + var5x.method_27005());
                  } else {
                     System.out.println("all seems good " + var5x + var5x.method_27005());
                  }

                  boolean var7 = false;
                  var3++;
               }
            }).start();
         }
      }
   }
}
