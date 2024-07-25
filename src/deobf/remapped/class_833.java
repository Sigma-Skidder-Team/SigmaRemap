package remapped;

import java.util.logging.Level;

public class class_833 implements Runnable {
   public class_833(class_1644 var1, Object[] var2) {
      this.field_4380 = var1;
      this.field_4381 = var2;
   }

   @Override
   public void run() {
      if (!this.field_4380.field_8544[0]) {
         this.field_4380.field_8544[0] = true;
         if (class_3484.method_16020().isLoggable(Level.FINE)) {
            class_3484.method_16020().fine(String.format("sending ack %s", this.field_4381.length == 0 ? null : this.field_4381));
         }

         class_1336 var3 = new class_1336();

         for (Object var7 : this.field_4381) {
            var3.method_6159(var7);
         }

         class_3872 var8 = new class_3872<class_1336>(3, var3);
         var8.field_18861 = this.field_4380.field_8545;
         class_3484.method_16006(this.field_4380.field_8546, var8);
      }
   }
}
