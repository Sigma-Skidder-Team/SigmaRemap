package mapped;

import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;

public class Class7367 extends Class7361 {
   private static String[] field31532;
   private Vector3d field31533;

   public Class7367(EnderDragonEntity var1) {
      super(var1);
   }

   @Override
   public void method23360() {
      if (this.field31533 == null) {
         this.field31533 = this.field31519.getPositionVec();
      }
   }

   @Override
   public boolean method23358() {
      return true;
   }

   @Override
   public void method23362() {
      this.field31533 = null;
   }

   @Override
   public float method23364() {
      return 1.0F;
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return this.field31533;
   }

   @Override
   public Class9598<Class7367> method23368() {
      return Class9598.field44906;
   }
}
