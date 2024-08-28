package mapped;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Class2535 implements Class2533 {
   private static String[] field16741;
   private static final double field16742 = 1.0E-5;
   public Class2427 field16743;
   public Class2427 field16744;
   private Class2427 field16745;
   private Class2519 field16746;
   private List field16747 = new ArrayList();

   public Class2535() {
      this.field16743 = this.method10711();
   }

   @Override
   public void method10705(float var1, float var2) {
      this.method10709(new Class2532(var1, var2));
   }

   public void method10708() {
      while (this.field16744 != null) {
         this.field16744 = this.method10712(this.field16744);
      }

      this.field16743.method10410();
      this.field16744 = null;
   }

   @Override
   public void method10706() {
      Class2427 var3 = this.method10711();
      var3.field16461 = this.field16744;
      this.field16744 = var3;
   }

   private void method10709(Class2532 var1) {
      if (this.field16744 != null) {
         Class2519 var4 = this.method10713(var1);
         this.field16744.method10411(var4);
      } else {
         Class2519 var5 = this.method10713(var1);
         this.field16743.method10411(var5);
      }
   }

   private Class2532[] method10710(Class2532[] var1) {
      this.field16743.method10412();

      for (Class2427 var4 = this.field16744; var4 != null; var4 = var4.field16461) {
         var4.method10412();
      }

      label121:
      for (; this.field16744 != null; this.field16744 = this.method10712(this.field16744)) {
         Class2519 var10 = this.field16744.field16460;

         do {
            if (var10.field16669 <= 0.0) {
               Class2519 var5 = this.field16743.field16460;

               do {
                  if (var10.method10575(var5) && var5.method10575(var10) && !this.field16743.method10413(var10.field16664, var5.field16664)) {
                     Class2427 var6 = this.field16744;

                     while (!var6.method10413(var10.field16664, var5.field16664)) {
                        if ((var6 = var6.field16461) == null) {
                           Class2519 var7 = this.method10713(var5.field16664);
                           var5.method10569(var7);
                           Class2519 var8 = this.method10713(var10.field16664);
                           var10.method10568(var8);
                           var5.field16666 = var10;
                           var10.field16665 = var5;
                           var8.field16666 = var7;
                           var7.field16665 = var8;
                           var5.method10571();
                           var10.method10571();
                           var7.method10571();
                           var8.method10571();
                           this.field16744.field16460 = null;
                           continue label121;
                        }
                     }
                  }
               } while ((var5 = var5.field16666) != this.field16743.field16460);
            }
         } while ((var10 = var10.field16666) == this.field16744.field16460);
      }

      int var11 = this.field16743.method10414() - 2;
      int var12 = var11 * 3 + 1;
      if (var1.length < var12) {
         var1 = (Class2532[])Array.newInstance(var1.getClass().getComponentType(), var12);
      }

      int var13 = 0;

      while (true) {
         Class2519 var16 = this.field16743.field16460;
         if (var16 == null || var16.field16666 == var16.field16665) {
            var1[var13] = null;
            this.field16743.method10410();
            return var1;
         }

         do {
            if (var16.field16669 > 0.0) {
               Class2519 var17 = var16.field16665;
               Class2519 var9 = var16.field16666;
               if ((var9.field16666 == var17 || var17.method10575(var9) && var9.method10575(var17))
                  && !this.field16743.method10413(var17.field16664, var9.field16664)) {
                  var1[var13++] = var16.field16664;
                  var1[var13++] = var9.field16664;
                  var1[var13++] = var17.field16664;
                  break;
               }
            }
         } while ((var16 = var16.field16666) != this.field16743.field16460);

         Class2519 var18 = var16.field16665;
         Class2519 var19 = var16.field16666;
         this.field16743.field16460 = var18;
         var16.method10567();
         this.method10714(var16);
         var19.method10571();
         var18.method10571();
      }
   }

   private Class2427 method10711() {
      Class2427 var3 = this.field16745;
      if (var3 == null) {
         return new Class2427(this);
      } else {
         this.field16745 = var3.field16461;
         var3.field16461 = null;
         return var3;
      }
   }

   private Class2427 method10712(Class2427 var1) {
      Class2427 var4 = var1.field16461;
      var1.method10410();
      var1.field16461 = this.field16745;
      this.field16745 = var1;
      return var4;
   }

   private Class2519 method10713(Class2532 var1) {
      Class2519 var4 = this.field16746;
      if (var4 == null) {
         return new Class2519(var1);
      } else {
         this.field16746 = var4.field16666;
         var4.field16666 = null;
         var4.field16665 = null;
         var4.field16664 = var1;
         return var4;
      }
   }

   private void method10714(Class2519 var1) {
      var1.field16666 = this.field16746;
      this.field16746 = var1;
   }

   private void method10715(Class2519 var1) {
      var1.field16665.field16666 = this.field16746;
      var1.field16665 = null;
      this.field16746 = var1;
   }

   @Override
   public boolean method10707() {
      Class2532[] var3 = this.method10710(new Class2532[0]);

      for (int var4 = 0; var4 < var3.length && var3[var4] != null; var4++) {
         this.field16747.add(var3[var4]);
      }

      return true;
   }

   @Override
   public int method10703() {
      return this.field16747.size() / 3;
   }

   @Override
   public float[] method10704(int var1, int var2) {
      Class2532 var5 = (Class2532)this.field16747.get(var1 * 3 + var2);
      return new float[]{var5.field16737, var5.field16738};
   }

   // $VF: synthetic method
   public static void method10716(Class2535 var0, Class2519 var1) {
      var0.method10715(var1);
   }
}
