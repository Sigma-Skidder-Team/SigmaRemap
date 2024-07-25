package remapped;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class class_9126 {
   private final List<class_7295> field_46689 = Lists.newArrayList();
   private boolean field_46687;

   public synchronized boolean method_41981() {
      return this.field_46687;
   }

   public synchronized void method_41985() {
      this.field_46687 = false;
   }

   public synchronized List<class_7295> method_41982() {
      return Collections.<class_7295>unmodifiableList(this.field_46689);
   }

   public synchronized void method_41983(String var1, InetAddress var2) {
      String var5 = class_1262.method_5683(var1);
      String var6 = class_1262.method_5684(var1);
      if (var6 != null) {
         var6 = var2.getHostAddress() + ":" + var6;
         boolean var7 = false;

         for (class_7295 var9 : this.field_46689) {
            if (var9.method_33293().equals(var6)) {
               var9.method_33294();
               var7 = true;
               break;
            }
         }

         if (!var7) {
            this.field_46689.add(new class_7295(var5, var6));
            this.field_46687 = true;
         }
      }
   }
}
