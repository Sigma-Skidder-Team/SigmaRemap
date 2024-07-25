package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_4292 {
   private static String[] field_20827;
   private short field_20821;
   private short field_20822;
   private short field_20826;
   private boolean field_20824 = false;
   private List<class_5660> field_20823 = new ArrayList<class_5660>();
   public MinecraftClient field_20825 = MinecraftClient.getInstance();

   public class_4292() {
      SigmaMainClass.getInstance().getEventManager().subscribe(this);
   }

   @EventListen
   @class_3932
   public void method_19938(class_717 var1) {
      this.field_20823.clear();
      this.field_20822 = this.field_20826 = 0;
      this.field_20824 = false;
   }

   @EventListen
   @class_3932
   public void method_19939(class_5596 var1) {
   }

   @EventListen
   @class_3932
   public void method_19936(class_2157 var1) {
      if (!class_314.method_1445() && class_314.method_1392()) {
         Packet var4 = var1.method_10047();
         if (!(var4 instanceof class_5955)) {
            if (var4 instanceof class_3835) {
               class_3835 var5 = (class_3835)var4;
               if (var5.method_17822() == 0) {
                  int var6 = var5.method_17819() - this.field_20821;
                  if (var6 <= 0 && var6 >= -20) {
                  }
               }
            }
         } else {
            class_5955 var7 = (class_5955)var4;
            this.field_20821 = var7.method_27203();
         }
      }
   }

   @EventListen
   @class_3932
   public void method_19935(PacketEvent var1) {
      if (!class_314.method_1445() && class_314.method_1392()) {
         Packet var4 = var1.method_557();
         if (!(var4 instanceof class_7573) && var4 instanceof class_8913) {
            class_8913 var5 = (class_8913)var4;
         }
      }
   }
}
