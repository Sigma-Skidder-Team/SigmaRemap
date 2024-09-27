package mapped;

import net.optifine.Config;

public class Class6265 implements Class6266 {
   private Class4057 field27742;
   private Class2828 field27743;
   private Class9734[] field27744;
   private Class7219 field27745;
   private Class7219 field27746;
   private Class8130 field27747;

   public Class6265(Class4057 var1, Class2828 var2, Class9734[] var3) {
      this.field27742 = var1;
      this.field27743 = var2;
      this.field27744 = var3;
      Class4862 var6 = var1.method12826();
      if (!var6.method15004().isPresent()) {
         this.field27747 = new Class8129();
      } else {
         this.field27747 = new Class8131();
      }
   }

   @Override
   public Class1878 method19230(String var1) {
      Class1886 var4 = this.method19232(var1);
      if (var4 == null) {
         Class1878 var5 = this.field27747.method28156(var1);
         return var5 == null ? null : var5;
      } else {
         return var4;
      }
   }

   @Override
   public Class7219 method19231(String var1) {
      if (var1 == null) {
         return null;
      } else if (var1.indexOf(":") < 0) {
         if (this.field27745 != null && var1.equals("this")) {
            return this.field27745;
         } else if (this.field27746 != null && var1.equals("part")) {
            return this.field27746;
         } else {
            Class7219 var9 = this.field27742.method12823(this.field27743, var1);
            if (var9 != null) {
               return var9;
            } else {
               for (int var10 = 0; var10 < this.field27744.length; var10++) {
                  Class9734 var11 = this.field27744[var10];
                  Class7219 var12 = var11.method38142();
                  if (var1.equals(var12.method22689())) {
                     return var12;
                  }

                  Class7219 var13 = var12.method22694(var1);
                  if (var13 != null) {
                     return var13;
                  }
               }

               return null;
            }
         }
      } else {
         String[] var4 = Config.method26903(var1, ":");
         Class7219 var5 = this.method19231(var4[0]);

         for (int var6 = 1; var6 < var4.length; var6++) {
            String var7 = var4[var6];
            Class7219 var8 = var5.method22694(var7);
            if (var8 == null) {
               return null;
            }

            var5 = var8;
         }

         return var5;
      }
   }

   @Override
   public Class1886 method19232(String var1) {
      String[] var4 = Config.method26903(var1, ".");
      if (var4.length == 2) {
         String var5 = var4[0];
         String var6 = var4[1];
         Class7219 var7 = this.method19231(var5);
         if (var7 != null) {
            Class2095 var8 = Class2095.method8759(var6);
            return var8 != null ? new Class1886(var1, var7, var8) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void method19233(Class7219 var1) {
      this.field27746 = var1;
   }

   public void method19234(Class7219 var1) {
      this.field27745 = var1;
   }
}
