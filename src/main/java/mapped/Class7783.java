package mapped;

import java.util.ArrayList;

public class Class7783 {
   private static String[] field33383;
   private ArrayList field33384 = null;
   private int field33385 = 0;
   private float field33386 = 1.0F;
   private int field33387 = 0;

   public Class7783() {
      this(10, 0.75F);
   }

   public Class7783(int var1) {
      this(var1, 0.75F);
   }

   public Class7783(int var1, float var2) {
      this.field33384 = new ArrayList(var1);
      this.field33385 = var1;
      this.field33386 = var2;
   }

   public void method25793(int var1, Object var2) {
      if (var2 != null) {
         this.field33387++;
      }

      this.field33384.add(var1, var2);
   }

   public boolean method25794(Object var1) {
      if (var1 != null) {
         this.field33387++;
      }

      return this.field33384.add(var1);
   }

   public Object method25795(int var1, Object var2) {
      Object var5 = this.field33384.set(var1, var2);
      if (var2 != var5) {
         if (var5 == null) {
            this.field33387++;
         }

         if (var2 == null) {
            this.field33387--;
         }
      }

      return var5;
   }

   public Object method25796(int var1) {
      Object var4 = this.field33384.remove(var1);
      if (var4 != null) {
         this.field33387--;
      }

      return var4;
   }

   public void method25797() {
      this.field33384.clear();
      this.field33387 = 0;
   }

   public void method25798() {
      if (this.field33387 <= 0 && this.field33384.size() <= 0) {
         this.method25797();
      } else if (this.field33384.size() > this.field33385) {
         float var3 = (float)this.field33387 * 1.0F / (float)this.field33384.size();
         if (!(var3 > this.field33386)) {
            int var4 = 0;

            for (int var5 = 0; var5 < this.field33384.size(); var5++) {
               Object var6 = this.field33384.get(var5);
               if (var6 != null) {
                  if (var5 != var4) {
                     this.field33384.set(var4, var6);
                  }

                  var4++;
               }
            }

            for (int var7 = this.field33384.size() - 1; var7 >= var4; var7--) {
               this.field33384.remove(var7);
            }
         }
      }
   }

   public boolean method25799(Object var1) {
      return this.field33384.contains(var1);
   }

   public Object method25800(int var1) {
      return this.field33384.get(var1);
   }

   public boolean method25801() {
      return this.field33384.isEmpty();
   }

   public int method25802() {
      return this.field33384.size();
   }

   public int method25803() {
      return this.field33387;
   }
}
