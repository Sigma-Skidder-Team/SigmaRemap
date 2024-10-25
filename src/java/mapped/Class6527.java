package mapped;

import java.util.Arrays;


public class Class6527 extends Class6522 implements Class6515 {
   private Class2328 field28649;
   private boolean[] field28650 = new boolean[128];
   private boolean field28651;
   public Class6512 field28652;
   public Class6512 field28653;

   public Class6527(int var1) {
      this.field28652 = new Class6512(var1);
      this.field28653 = new Class6512(var1);
   }

   public void method19791(Class9189 var1, Class6516 var2) throws AACException {
      Class1955 var5 = var2.method19744();
      Class2288 var6 = var2.method19746();
      if (var6.equals(Class2288.field15218)) {
         throw new AACException("invalid sample frequency");
      } else {
         this.method19774(var1);
         this.field28651 = var1.method34399();
         Class6538 var7 = this.field28652.method19720();
         if (!this.field28651) {
            this.field28649 = Class2328.field15934;
            Arrays.fill(this.field28650, false);
         } else {
            var7.method19864(var1, var2, this.field28651);
            this.field28653.method19720().method19883(var7);
            this.field28649 = Class2328.method9104(var1.method34397(2));
            if (!this.field28649.equals(Class2328.field15935)) {
               if (!this.field28649.equals(Class2328.field15936)) {
                  if (!this.field28649.equals(Class2328.field15934)) {
                     throw new AACException("reserved MS mask type used");
                  }

                  Arrays.fill(this.field28650, false);
               } else {
                  Arrays.fill(this.field28650, true);
               }
            } else {
               int var8 = var7.method19866();
               int var9 = var7.method19871();

               for (int var10 = 0; var10 < var9 * var8; var10++) {
                  this.field28650[var10] = var1.method34399();
               }
            }
         }

         if (var5.method8218() && var7.method19878() && (var7.field28860 = var1.method34399())) {
            var7.method19881().method19858(var1, var7, var5);
         }

         this.field28652.method19714(var1, this.field28651, var2);
         this.field28653.method19714(var1, this.field28651, var2);
      }
   }

   public Class6512 method19792() {
      return this.field28652;
   }

   public Class6512 method19793() {
      return this.field28653;
   }

   public Class2328 method19794() {
      return this.field28649;
   }

   public boolean method19795(int var1) {
      return this.field28650[var1];
   }

   public boolean method19796() {
      return !this.field28649.equals(Class2328.field15934);
   }

   public boolean method19797() {
      return this.field28651;
   }
}
