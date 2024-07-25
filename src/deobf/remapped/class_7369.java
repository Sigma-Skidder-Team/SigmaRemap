package remapped;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class class_7369 extends class_7674 {
   private boolean field_37661;
   private boolean field_37660;
   private ScheduledExecutorService field_37656;
   private ScheduledFuture field_37659;
   private long field_37657 = TimeUnit.SECONDS.toNanos(60L);
   private boolean field_37655 = false;
   private final Object field_37658 = new Object();

   public int method_33568() {
      synchronized (this.field_37658) {
         return (int)TimeUnit.NANOSECONDS.toSeconds(this.field_37657);
      }
   }

   public void method_33565(int var1) {
      synchronized (this.field_37658) {
         this.field_37657 = TimeUnit.SECONDS.toNanos((long)var1);
         if (this.field_37657 <= 0L) {
            this.method_33567();
         } else {
            if (this.field_37655) {
               try {
                  for (class_4809 var7 : new ArrayList<class_4809>(this.method_33573())) {
                     if (var7 instanceof class_5913) {
                        class_5913 var8 = (class_5913)var7;
                        var8.method_27036();
                     }
                  }
               } catch (Exception var10) {
                  var10.printStackTrace();
               }

               this.method_33560();
            }
         }
      }
   }

   public void method_33561() {
      synchronized (this.field_37658) {
         if (this.field_37656 != null || this.field_37659 != null) {
            this.field_37655 = false;
            this.method_33567();
         }
      }
   }

   public void method_33566() {
      synchronized (this.field_37658) {
         if (this.field_37657 > 0L) {
            this.field_37655 = true;
            this.method_33560();
         }
      }
   }

   private void method_33560() {
      this.method_33567();
      this.field_37656 = Executors.newSingleThreadScheduledExecutor(new class_7076("connectionLostChecker"));
      class_7283 var3 = new class_7283(this);
      this.field_37659 = this.field_37656.scheduleAtFixedRate(var3, this.field_37657, this.field_37657, TimeUnit.NANOSECONDS);
   }

   private void method_33572(class_4809 var1, long var2) {
      if (var1 instanceof class_5913) {
         class_5913 var6 = (class_5913)var1;
         if (var6.method_27032() >= var2) {
            if (var6.method_22165()) {
               var6.method_22160();
            }
         } else {
            var6.method_22173(
               1006,
               "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection"
            );
         }
      }
   }

   public abstract Collection<class_4809> method_33573();

   private void method_33567() {
      if (this.field_37656 != null) {
         this.field_37656.shutdownNow();
         this.field_37656 = null;
      }

      if (this.field_37659 != null) {
         this.field_37659.cancel(false);
         this.field_37659 = null;
      }
   }

   public boolean method_33569() {
      return this.field_37661;
   }

   public void method_33564(boolean var1) {
      this.field_37661 = var1;
   }

   public boolean method_33563() {
      return this.field_37660;
   }

   public void method_33562(boolean var1) {
      this.field_37660 = var1;
   }
}
