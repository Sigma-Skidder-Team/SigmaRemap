package remapped;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class class_1930 implements class_8554 {
   private static String[] field_9870;
   private static final double field_9873 = 1.0E-5;
   public class_8664 field_9872;
   public class_8664 field_9869;
   private class_8664 field_9867;
   private class_2251 field_9871;
   private List field_9868 = new ArrayList();

   public class_1930() {
      this.field_9872 = this.method_8964();
   }

   @Override
   public void method_39348(float var1, float var2) {
      this.method_8962(new class_1440(var1, var2));
   }

   public void method_8969() {
      while (this.field_9869 != null) {
         this.field_9869 = this.method_8968(this.field_9869);
      }

      this.field_9872.method_39723();
      this.field_9869 = null;
   }

   @Override
   public void method_39350() {
      class_8664 var3 = this.method_8964();
      var3.field_44346 = this.field_9869;
      this.field_9869 = var3;
   }

   private void method_8962(class_1440 var1) {
      if (this.field_9869 != null) {
         class_2251 var4 = this.method_8961(var1);
         this.field_9869.method_39722(var4);
      } else {
         class_2251 var5 = this.method_8961(var1);
         this.field_9872.method_39722(var5);
      }
   }

   private class_1440[] method_8970(class_1440[] var1) {
      this.field_9872.method_39718();

      for (class_8664 var4 = this.field_9869; var4 != null; var4 = var4.field_44346) {
         var4.method_39718();
      }

      label121:
      for (; this.field_9869 != null; this.field_9869 = this.method_8968(this.field_9869)) {
         class_2251 var10 = this.field_9869.field_44347;

         do {
            if (var10.field_11204 <= 0.0) {
               class_2251 var5 = this.field_9872.field_44347;

               do {
                  if (var10.method_10359(var5) && var5.method_10359(var10) && !this.field_9872.method_39717(var10.field_11203, var5.field_11203)) {
                     class_8664 var6 = this.field_9869;

                     while (!var6.method_39717(var10.field_11203, var5.field_11203)) {
                        if ((var6 = var6.field_44346) == null) {
                           class_2251 var7 = this.method_8961(var5.field_11203);
                           var5.method_10350(var7);
                           class_2251 var8 = this.method_8961(var10.field_11203);
                           var10.method_10351(var8);
                           var5.field_11197 = var10;
                           var10.field_11202 = var5;
                           var8.field_11197 = var7;
                           var7.field_11202 = var8;
                           var5.method_10353();
                           var10.method_10353();
                           var7.method_10353();
                           var8.method_10353();
                           this.field_9869.field_44347 = null;
                           continue label121;
                        }
                     }
                  }
               } while ((var5 = var5.field_11197) != this.field_9872.field_44347);
            }
         } while ((var10 = var10.field_11197) == this.field_9869.field_44347);
      }

      int var11 = this.field_9872.method_39719() - 2;
      int var12 = var11 * 3 + 1;
      if (var1.length < var12) {
         var1 = (class_1440[])Array.newInstance(var1.getClass().getComponentType(), var12);
      }

      int var13 = 0;

      while (true) {
         class_2251 var16 = this.field_9872.field_44347;
         if (var16 == null || var16.field_11197 == var16.field_11202) {
            var1[var13] = null;
            this.field_9872.method_39723();
            return var1;
         }

         do {
            if (var16.field_11204 > 0.0) {
               class_2251 var17 = var16.field_11202;
               class_2251 var9 = var16.field_11197;
               if ((var9.field_11197 == var17 || var17.method_10359(var9) && var9.method_10359(var17))
                  && !this.field_9872.method_39717(var17.field_11203, var9.field_11203)) {
                  var1[var13++] = var16.field_11203;
                  var1[var13++] = var9.field_11203;
                  var1[var13++] = var17.field_11203;
                  break;
               }
            }
         } while ((var16 = var16.field_11197) != this.field_9872.field_44347);

         class_2251 var18 = var16.field_11202;
         class_2251 var19 = var16.field_11197;
         this.field_9872.field_44347 = var18;
         var16.method_10357();
         this.method_8963(var16);
         var19.method_10353();
         var18.method_10353();
      }
   }

   private class_8664 method_8964() {
      class_8664 var3 = this.field_9867;
      if (var3 == null) {
         return new class_8664(this);
      } else {
         this.field_9867 = var3.field_44346;
         var3.field_44346 = null;
         return var3;
      }
   }

   private class_8664 method_8968(class_8664 var1) {
      class_8664 var4 = var1.field_44346;
      var1.method_39723();
      var1.field_44346 = this.field_9867;
      this.field_9867 = var1;
      return var4;
   }

   private class_2251 method_8961(class_1440 var1) {
      class_2251 var4 = this.field_9871;
      if (var4 == null) {
         return new class_2251(var1);
      } else {
         this.field_9871 = var4.field_11197;
         var4.field_11197 = null;
         var4.field_11202 = null;
         var4.field_11203 = var1;
         return var4;
      }
   }

   private void method_8963(class_2251 var1) {
      var1.field_11197 = this.field_9871;
      this.field_9871 = var1;
   }

   private void method_8965(class_2251 var1) {
      var1.field_11202.field_11197 = this.field_9871;
      var1.field_11202 = null;
      this.field_9871 = var1;
   }

   @Override
   public boolean method_39352() {
      class_1440[] var3 = this.method_8970(new class_1440[0]);

      for (int var4 = 0; var4 < var3.length && var3[var4] != null; var4++) {
         this.field_9868.add(var3[var4]);
      }

      return true;
   }

   @Override
   public int method_39349() {
      return this.field_9868.size() / 3;
   }

   @Override
   public float[] method_39351(int var1, int var2) {
      class_1440 var5 = (class_1440)this.field_9868.get(var1 * 3 + var2);
      return new float[]{var5.field_7766, var5.field_7765};
   }
}
