package mapped;



public class Class6526 extends Class6522 implements Class6515 {
   private static final int field28641 = 0;
   private static final int field28642 = 1;
   private static final int field28643 = 2;
   private static final int field28644 = 11;
   private static final int field28645 = 13;
   private static final int field28646 = 14;
   private final boolean field28647;
   private Class9794 field28648;

   public Class6526(boolean var1) {
      this.field28647 = var1;
   }

   public void method19787(Class9189 var1, Class6522 var2, Class2288 var3, boolean var4, boolean var5) throws AACException {
      int var8 = var1.method34397(4);
      if (var8 == 15) {
         var8 += var1.method34397(8) - 1;
      }

      var8 *= 8;
      int var9 = var8;
      int var10 = var1.method34394();

      while (var8 > 0) {
         var8 = this.method19788(var1, var8, var2, var3, var4, var5);
      }

      int var11 = var1.method34394() - var10;
      int var12 = var9 - var11;
      if (var12 <= 0) {
         if (var12 < 0) {
            throw new AACException("FIL element overread: " + var12);
         }
      } else {
         var1.method34402(var11);
      }
   }

   private int method19788(Class9189 var1, int var2, Class6522 var3, Class2288 var4, boolean var5, boolean var6) throws AACException {
      int var9 = var1.method34397(4);
      int var10 = var2 - 4;
      switch (var9) {
         case 11:
            var10 = this.method19789(var1, var10);
            break;
         case 13:
         case 14:
            if (var5) {
               if (!(var3 instanceof Class6523) && !(var3 instanceof Class6527) && !(var3 instanceof Class6521)) {
                  throw new AACException("SBR applied on unexpected element: " + var3);
               }

               var3.method19776(var1, var4, var10, var3 instanceof Class6527, var9 == 14, this.field28647, var6);
               var10 = 0;
               break;
            } else {
               var1.method34402(var10);
               var10 = 0;
            }
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
         default:
            var1.method34402(var10);
            var10 = 0;
      }

      return var10;
   }

   private int method19789(Class9189 var1, int var2) throws AACException {
      if (this.field28648 == null) {
         this.field28648 = new Class9794();
      }

      int var5 = var2;
      int var6 = 1;
      if (Class9794.method38612(this.field28648, var1.method34399())) {
         Class9794.method38613(this.field28648, var1.method34397(4));
         Class9794.method38614(this.field28648, var1.method34397(4));
      }

      if (Class9794.method38615(this.field28648, var1.method34399())) {
         var5 = var2 - this.method19790(var1);
      }

      if (Class9794.method38616(this.field28648, var1.method34399())) {
         Class9794.method38617(this.field28648, var1.method34397(4));
         Class9794.method38618(this.field28648, var1.method34397(4));
         var5 -= 8;
         var6 += Class9794.method38619(this.field28648);
         Class9794.method38620(this.field28648, new int[var6]);

         for (int var7 = 0; var7 < var6; var7++) {
            Class9794.method38621(this.field28648)[var7] = var1.method34397(8);
            var5 -= 8;
         }
      }

      if (Class9794.method38622(this.field28648, var1.method34399())) {
         Class9794.method38623(this.field28648, var1.method34397(7));
         Class9794.method38624(this.field28648, var1.method34397(1));
         var5 -= 8;
      }

      Class9794.method38625(this.field28648, new boolean[var6]);
      Class9794.method38626(this.field28648, new int[var6]);

      for (int var8 = 0; var8 < var6; var8++) {
         Class9794.method38627(this.field28648)[var8] = var1.method34399();
         Class9794.method38628(this.field28648)[var8] = var1.method34397(7);
         var5 -= 8;
      }

      return var5;
   }

   private int method19790(Class9189 var1) throws AACException {
      int var4 = 0;

      do {
         for (int var5 = 0; var5 < 7; var5++) {
            Class9794.method38629(this.field28648)[var4] = var1.method34399();
            var4++;
         }
      } while (var4 < 57 && var1.method34399());

      return var4 / 7 * 8;
   }
}
