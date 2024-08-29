package mapped;

import net.minecraft.util.math.AxisAlignedBB;

public class Class6487 extends AxisAlignedBB {
   private static String[] field28446;
   private int field28447 = -1;
   private boolean field28448 = false;

   public Class6487(double var1, double var3, double var5, double var7, double var9, double var11) {
      super(var1, var3, var5, var7, var9, var11);
   }

   public boolean method19655(Class7624 var1, int var2) {
      if (this.field28447 != var2) {
         this.field28448 = var1.method24981(this.field28449, this.field28450, this.field28451, this.field28452, this.field28453, this.field28454);
         this.field28447 = var2;
      }

      return this.field28448;
   }
}
