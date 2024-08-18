package remapped;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class class_4400 {
   private static String[] field_21537;
   public class_5676 field_21538;
   public List<Entity> field_21536 = new CopyOnWriteArrayList<Entity>();

   public void method_20492() {
      SigmaMainClass.getInstance().getEventManager().subscribe2(this);
   }

   public boolean method_20495(Entity var1) {
      return this.field_21536.contains(var1);
   }

   public void method_20494() {
      this.field_21536.clear();
   }

   @EventListen
   @class_5355
   private void method_20497(class_717 var1) {
      this.field_21536.clear();
   }

   @EventListen
   @class_5355
   private void method_20496(PlayerTickEvent var1) {
      if (this.field_21538 != null) {
         for (PlayerEntity var5 : class_314.method_1435()) {
            if (!this.field_21538.method_7183(var5)) {
               if (this.field_21538.method_7182(var5) && this.field_21536.contains(var5)) {
                  this.field_21536.remove(var5);
               }
            } else if (!this.field_21536.contains(var5)) {
               this.field_21536.add(var5);
            }
         }
      }
   }
}
