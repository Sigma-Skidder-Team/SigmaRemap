package mapped;

import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7371 extends Class7361 {
   private static final Logger field31546 = LogManager.getLogger();
   private Vector3d field31547;
   private int field31548;

   public Class7371(Class1007 var1) {
      super(var1);
   }

   @Override
   public void method23360() {
      if (this.field31547 != null) {
         if (this.field31548 > 0 && this.field31548++ >= 10) {
            this.field31519.method4336().method32671(Class9598.field44896);
         } else {
            double var3 = this.field31547.method11343(this.field31519.getPosX(), this.field31519.getPosY(), this.field31519.getPosZ());
            if (var3 < 100.0 || var3 > 22500.0 || this.field31519.collidedHorizontally || this.field31519.collidedVertically) {
               this.field31548++;
            }
         }
      } else {
         field31546.warn("Aborting charge player as no target was set.");
         this.field31519.method4336().method32671(Class9598.field44896);
      }
   }

   @Override
   public void method23362() {
      this.field31547 = null;
      this.field31548 = 0;
   }

   public void method23376(Vector3d var1) {
      this.field31547 = var1;
   }

   @Override
   public float method23364() {
      return 3.0F;
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return this.field31547;
   }

   @Override
   public Class9598<Class7371> method23368() {
      return Class9598.field44904;
   }
}
