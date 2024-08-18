package remapped;

import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3317 extends class_1871 {
   private static final Logger field_16387 = LogManager.getLogger();
   private Vector3d field_16390;
   private int field_16389;

   public class_3317(class_2770 var1) {
      super(var1);
   }

   @Override
   public void method_23473() {
      if (this.field_16390 != null) {
         if (this.field_16389 > 0 && this.field_16389++ >= 10) {
            this.field_9479.method_12611().method_29422(class_8978.field_46006);
         } else {
            double var3 = this.field_16390.method_6203(this.field_9479.getPosX(), this.field_9479.method_37309(), this.field_9479.getPosZ());
            if (var3 < 100.0 || var3 > 22500.0 || this.field_9479.collidedHorizontally || this.field_9479.collidedVertically) {
               this.field_16389++;
            }
         }
      } else {
         field_16387.warn("Aborting charge player as no target was set.");
         this.field_9479.method_12611().method_29422(class_8978.field_46006);
      }
   }

   @Override
   public void method_23469() {
      this.field_16390 = null;
      this.field_16389 = 0;
   }

   public void method_15243(Vector3d var1) {
      this.field_16390 = var1;
   }

   @Override
   public float method_23470() {
      return 3.0F;
   }

   @Nullable
   @Override
   public Vector3d method_23463() {
      return this.field_16390;
   }

   @Override
   public class_8978<class_3317> method_23464() {
      return class_8978.field_46002;
   }
}
