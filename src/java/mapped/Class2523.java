package mapped;

public class Class2523 extends Class2522 {
   private static String[] field16684;
   public float field16689;

   public Class2523(float var1, float var2, float var3) {
      this(var1, var2, var3, 50);
   }

   public Class2523(float var1, float var2, float var3, int var4) {
      super(var1, var2, var3, var3, var4);
      this.field16673 = var1 - var3;
      this.field16674 = var2 - var3;
      this.field16689 = var3;
      this.field16679 = var3;
   }

   @Override
   public strictfp float method10584() {
      return this.method10579() + this.field16689;
   }

   @Override
   public strictfp float method10586() {
      return this.method10582() + this.field16689;
   }

   public strictfp void method10623(float var1) {
      if (var1 != this.field16689) {
         this.field16680 = true;
         this.field16689 = var1;
         this.method10618(var1, var1);
      }
   }

   public strictfp float method10624() {
      return this.field16689;
   }

   @Override
   public strictfp boolean method10603(Class2520 var1) {
      if (!(var1 instanceof Class2523)) {
         return !(var1 instanceof Class2527) ? super.method10603(var1) : this.method10626((Class2527)var1);
      } else {
         Class2523 var4 = (Class2523)var1;
         float var5 = this.method10624() + var4.method10624();
         if (!(Math.abs(var4.method10584() - this.method10584()) > var5)) {
            if (!(Math.abs(var4.method10586() - this.method10586()) > var5)) {
               var5 *= var5;
               float var6 = Math.abs(var4.method10584() - this.method10584());
               float var7 = Math.abs(var4.method10586() - this.method10586());
               return var5 >= var6 * var6 + var7 * var7;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public strictfp boolean method10602(float var1, float var2) {
      return (var1 - this.method10579()) * (var1 - this.method10579()) + (var2 - this.method10582()) * (var2 - this.method10582())
         < this.method10624() * this.method10624();
   }

   private strictfp boolean method10625(Class2530 var1) {
      return this.method10602(var1.method10667(), var1.method10668()) && this.method10602(var1.method10669(), var1.method10670());
   }

   @Override
   public strictfp void method10605() {
      this.field16672 = new float[2];
      this.field16672[0] = this.field16673 + this.field16689;
      this.field16672[1] = this.field16674 + this.field16689;
   }

   @Override
   public strictfp void method10606() {
      this.field16679 = this.field16689;
   }

   private strictfp boolean method10626(Class2527 var1) {
      if (var1.method10602(this.field16673 + this.field16689, this.field16674 + this.field16689)) {
         return true;
      } else {
         float var6 = var1.method10579();
         float var7 = var1.method10582();
         float var8 = var1.method10579() + var1.method10616();
         float var9 = var1.method10582() + var1.method10617();
         Class2530[] var10 = new Class2530[]{
            new Class2530(var6, var7, var8, var7),
            new Class2530(var8, var7, var8, var9),
            new Class2530(var8, var9, var6, var9),
            new Class2530(var6, var9, var6, var7)
         };
         float var11 = this.method10624() * this.method10624();
         Class2532 var12 = new Class2532(this.method10584(), this.method10586());

         for (int var13 = 0; var13 < 4; var13++) {
            float var14 = var10[var13].method10673(var12);
            if (var14 < var11) {
               return true;
            }
         }

         return false;
      }
   }

   private strictfp boolean method10627(Class2530 var1) {
      Class2532 var4 = new Class2532(var1.method10667(), var1.method10668());
      Class2532 var5 = new Class2532(var1.method10669(), var1.method10670());
      Class2532 var6 = new Class2532(this.method10584(), this.method10586());
      Class2532 var7 = var5.method10700().method10693(var4);
      Class2532 var8 = var6.method10700().method10693(var4);
      float var9 = var7.method10698();
      float var10 = var8.method10686(var7) / var9;
      Class2532 var12;
      if (!(var10 < 0.0F)) {
         if (!(var10 > var9)) {
            Class2532 var11 = var7.method10700().method10694(var10 / var9);
            var12 = var4.method10700().method10692(var11);
         } else {
            var12 = var5;
         }
      } else {
         var12 = var4;
      }

      return var6.method10700().method10693(var12).method10697() <= this.method10624() * this.method10624();
   }
}
