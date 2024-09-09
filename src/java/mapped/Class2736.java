package mapped;

import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Class2736 extends Class2595 {
   private static String[] field17257;
   public final Class1046 field17258;
   public double field17259;
   public double field17260;
   public double field17261;
   public final double field17262;
   public int field17263;
   public boolean field17264;
   private boolean field17265;

   public Class2736(Class1046 var1, double var2) {
      this(var1, var2, 120);
   }

   public Class2736(Class1046 var1, double var2, int var4) {
      this(var1, var2, var4, true);
   }

   public Class2736(Class1046 var1, double var2, int var4, boolean var5) {
      this.field17258 = var1;
      this.field17262 = var2;
      this.field17263 = var4;
      this.field17265 = var5;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field17258.isBeingRidden()) {
         if (!this.field17264) {
            if (this.field17265 && this.field17258.method3021() >= 100) {
               return false;
            }

            if (this.field17258.getRNG().nextInt(this.field17263) != 0) {
               return false;
            }
         }

         Vector3d var3 = this.method10943();
         if (var3 != null) {
            this.field17259 = var3.x;
            this.field17260 = var3.y;
            this.field17261 = var3.z;
            this.field17264 = false;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Nullable
   public Vector3d method10943() {
      return Class8037.method27581(this.field17258, 10, 7);
   }

   @Override
   public boolean method10806() {
      return !this.field17258.method4230().method21664() && !this.field17258.isBeingRidden();
   }

   @Override
   public void method10804() {
      this.field17258.method4230().method21654(this.field17259, this.field17260, this.field17261, this.field17262);
   }

   @Override
   public void method10807() {
      this.field17258.method4230().method21666();
      super.method10807();
   }

   public void method10944() {
      this.field17264 = true;
   }

   public void method10945(int var1) {
      this.field17263 = var1;
   }
}
