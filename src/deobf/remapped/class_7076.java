package remapped;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class_7076 implements ThreadFactory {
   private final ThreadFactory field_36545 = Executors.defaultThreadFactory();
   private final AtomicInteger field_36546 = new AtomicInteger(1);
   private final String field_36543;

   public class_7076(String var1) {
      this.field_36543 = var1;
   }

   @Override
   public Thread newThread(Runnable var1) {
      Thread var4 = this.field_36545.newThread(var1);
      var4.setName(this.field_36543 + "-" + this.field_36546);
      return var4;
   }
}
