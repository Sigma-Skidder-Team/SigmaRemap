package mapped;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class LanServerList {
   private final List<Class9162> field45060 = Lists.newArrayList();
   private boolean field45061;

   public synchronized boolean method37555() {
      return this.field45061;
   }

   public synchronized void method37556() {
      this.field45061 = false;
   }

   public synchronized List<Class9162> method37557() {
      return Collections.<Class9162>unmodifiableList(this.field45060);
   }

   public synchronized void method37558(String var1, InetAddress var2) {
      String var5 = Class384.method1864(var1);
      String var6 = Class384.method1865(var1);
      if (var6 != null) {
         var6 = var2.getHostAddress() + ":" + var6;
         boolean var7 = false;

         for (Class9162 var9 : this.field45060) {
            if (var9.method34208().equals(var6)) {
               var9.method34209();
               var7 = true;
               break;
            }
         }

         if (!var7) {
            this.field45060.add(new Class9162(var5, var6));
            this.field45061 = true;
         }
      }
   }
}
