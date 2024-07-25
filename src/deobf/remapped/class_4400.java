package remapped;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class class_4400 {
   private static String[] field_21537;
   public class_5676 field_21538;
   public List<class_8145> field_21536 = new CopyOnWriteArrayList<class_8145>();

   public void method_20492() {
      class_727.method_3328().method_3302().method_7908(this);
   }

   public boolean method_20495(class_8145 var1) {
      return this.field_21536.contains(var1);
   }

   public void method_20494() {
      this.field_21536.clear();
   }

   @class_9148
   @class_5355
   private void method_20497(class_717 var1) {
      this.field_21536.clear();
   }

   @class_9148
   @class_5355
   private void method_20496(class_5596 var1) {
      if (this.field_21538 != null) {
         for (class_704 var5 : class_314.method_1435()) {
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
