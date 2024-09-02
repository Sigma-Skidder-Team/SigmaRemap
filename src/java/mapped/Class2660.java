package mapped;

import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;

public class Class2660 extends Class2595 {
   private static String[] field17016;
   private final Class1046 field17017;
   private double field17018;
   private double field17019;
   private double field17020;
   private final double field17021;

   public Class2660(Class1046 var1, double var2) {
      this.field17017 = var1;
      this.field17021 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field17017.method4286()) {
         Vector3d var3 = Class8037.method27587(this.field17017, 16, 7, Vector3d.method11330(this.field17017.method4289()));
         if (var3 != null) {
            this.field17018 = var3.x;
            this.field17019 = var3.y;
            this.field17020 = var3.z;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return !this.field17017.method4230().method21664();
   }

   @Override
   public void method10804() {
      this.field17017.method4230().method21654(this.field17018, this.field17019, this.field17020, this.field17021);
   }
}
