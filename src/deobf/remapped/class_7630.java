package remapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.util.Map;

public class class_7630 implements Packet<class_392> {
   private static String[] field_38827;
   private Object2IntMap<class_6676<?>> field_38828;

   public class_7630() {
   }

   public class_7630(Object2IntMap<class_6676<?>> var1) {
      this.field_38828 = var1;
   }

   public void method_34581(class_392 var1) {
      var1.method_1929(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      int var4 = var1.method_37778();
      this.field_38828 = new Object2IntOpenHashMap(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         this.method_34580(class_8669.field_44376.method_14040(var1.method_37778()), var1);
      }
   }

   private <T> void method_34580(class_9478<T> var1, class_8248 var2) {
      int var5 = var2.method_37778();
      int var6 = var2.method_37778();
      this.field_38828.put(var1.method_43790(var1.method_43788().method_14040(var5)), var6);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_38828.size());
      ObjectIterator var4 = this.field_38828.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         class_6676 var6 = (class_6676)var5.getKey();
         var1.method_37743(class_8669.field_44376.method_14041(var6.method_30631()));
         var1.method_37743(this.method_34579(var6));
         var1.method_37743(var5.getIntValue());
      }
   }

   private <T> int method_34579(class_6676<T> var1) {
      return var1.method_30631().method_43788().method_14041(var1.method_30630());
   }

   public Map<class_6676<?>, Integer> method_34578() {
      return this.field_38828;
   }
}
