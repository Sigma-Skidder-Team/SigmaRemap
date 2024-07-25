package remapped;

import java.util.Timer;
import java.util.logging.Level;

public class class_1761 implements Runnable {
   public class_1761(class_1289 var1, class_6973 var2) {
      this.field_9040 = var1;
      this.field_9039 = var2;
   }

   @Override
   public void run() {
      if (class_1289.method_5741().isLoggable(Level.FINE)) {
         class_1289.method_5741().fine(String.format("readyState %s", this.field_9040.field_7086));
      }

      if (this.field_9040.field_7086 != class_8916.field_45719 && this.field_9040.field_7086 != class_8916.field_45718) {
         if (class_1289.method_5741().isLoggable(Level.FINE)) {
            class_1289.method_5741().fine(String.format("opening %s", class_1289.method_5764(this.field_9040)));
         }

         this.field_9040.field_7072 = new class_4172(class_1289.method_5764(this.field_9040), class_1289.method_5789(this.field_9040));
         class_1144 var3 = this.field_9040.field_7072;
         class_1289 var4 = this.field_9040;
         this.field_9040.field_7086 = class_8916.field_45718;
         class_1289.method_5754(this.field_9040, false);
         var3.method_19329("transport", new class_8989(this, var4));
         class_7381 var5 = class_2998.method_13702(var3, "open", new class_6465(this, var4));
         class_7381 var6 = class_2998.method_13702(var3, "error", new class_3971(this, var4));
         if (class_1289.method_5765(this.field_9040) >= 0L) {
            long var7 = class_1289.method_5765(this.field_9040);
            class_1289.method_5741().fine(String.format("connection attempt will timeout after %d", var7));
            Timer var9 = new Timer();
            var9.schedule(new class_8177(this, var7, var5, var3, var4), var7);
            class_1289.method_5775(this.field_9040).add(new class_301(this, var9));
         }

         class_1289.method_5775(this.field_9040).add(var5);
         class_1289.method_5775(this.field_9040).add(var6);
         this.field_9040.field_7072.method_5039();
      }
   }
}
