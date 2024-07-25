package remapped;

import com.google.common.collect.AbstractIterator;

public final class class_5606 extends AbstractIterator<class_1331> {
   private static String[] field_28463;
   private final class_2921 field_28451;
   private int field_28465;
   private int field_28455;
   private int field_28456;
   private int field_28459;
   private int field_28453;
   private boolean field_28460;

   public class_5606(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_28454 = var1;
      this.field_28458 = var2;
      this.field_28462 = var3;
      this.field_28461 = var4;
      this.field_28452 = var5;
      this.field_28464 = var6;
      this.field_28457 = var7;
      this.field_28451 = new class_2921();
   }

   public class_1331 computeNext() {
      if (!this.field_28460) {
         class_2921 var3;
         for (var3 = null; var3 == null; this.field_28453++) {
            if (this.field_28453 > this.field_28456) {
               this.field_28459++;
               if (this.field_28459 > this.field_28455) {
                  this.field_28465++;
                  if (this.field_28465 > this.field_28458) {
                     return (class_1331)this.endOfData();
                  }

                  this.field_28455 = Math.min(this.field_28462, this.field_28465);
                  this.field_28459 = -this.field_28455;
               }

               this.field_28456 = Math.min(this.field_28461, this.field_28465 - Math.abs(this.field_28459));
               this.field_28453 = -this.field_28456;
            }

            int var4 = this.field_28459;
            int var5 = this.field_28453;
            int var6 = this.field_28465 - Math.abs(var4) - Math.abs(var5);
            if (var6 <= this.field_28452) {
               this.field_28460 = var6 != 0;
               var3 = this.field_28451.method_13362(this.field_28464 + var4, this.field_28457 + var5, this.field_28454 + var6);
            }
         }

         return var3;
      } else {
         this.field_28460 = false;
         this.field_28451.method_12172(this.field_28454 - (this.field_28451.method_12185() - this.field_28454));
         return this.field_28451;
      }
   }
}
