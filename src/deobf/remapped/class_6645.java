package remapped;

import java.util.Date;
import java.util.HashMap;

public class class_6645 {
   private static String[] field_34383;
   private MinecraftClient field_34385 = MinecraftClient.getInstance();
   private HashMap<Integer, Date> field_34384 = new HashMap<Integer, Date>();

   public void method_30524() {
      SigmaMainClass.getInstance().getEventManager().method_7908(this);
   }

   @EventListen
   private void method_30525(PacketEvent var1) {
      if (var1.method_557() instanceof class_5491) {
         class_5491 var4 = (class_5491)var1.method_557();
         if (var4.method_24952() != 0) {
            return;
         }

         this.field_34384.put(var4.method_24956(), new Date());
      }
   }

   public long method_30523(int var1) {
      if (var1 != -1) {
         if (this.field_34384.containsKey(var1)) {
            long var4 = System.currentTimeMillis();
            return var4 - this.field_34384.get(var1).getTime();
         } else {
            return 2147483647L;
         }
      } else {
         return 0L;
      }
   }
}
