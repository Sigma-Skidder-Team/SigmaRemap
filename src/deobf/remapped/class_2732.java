package remapped;

import java.util.ArrayList;

public class class_2732 {
   private static String[] field_13338;
   private ArrayList field_13340 = null;
   private int field_13337 = 0;
   private float field_13341 = 1.0F;
   private int field_13339 = 0;

   public class_2732() {
      this(10, 0.75F);
   }

   public class_2732(int var1) {
      this(var1, 0.75F);
   }

   public class_2732(int var1, float var2) {
      this.field_13340 = new ArrayList(var1);
      this.field_13337 = var1;
      this.field_13341 = var2;
   }

   public void method_12282(int var1, Object var2) {
      if (var2 != null) {
         this.field_13339++;
      }

      this.field_13340.add(var1, var2);
   }

   public boolean method_12283(Object var1) {
      if (var1 != null) {
         this.field_13339++;
      }

      return this.field_13340.add(var1);
   }

   public Object method_12286(int var1, Object var2) {
      Object var5 = this.field_13340.set(var1, var2);
      if (var2 != var5) {
         if (var5 == null) {
            this.field_13339++;
         }

         if (var2 == null) {
            this.field_13339--;
         }
      }

      return var5;
   }

   public Object method_12280(int var1) {
      Object var4 = this.field_13340.remove(var1);
      if (var4 != null) {
         this.field_13339--;
      }

      return var4;
   }

   public void method_12278() {
      this.field_13340.clear();
      this.field_13339 = 0;
   }

   public void method_12285() {
      if (this.field_13339 <= 0 && this.field_13340.size() <= 0) {
         this.method_12278();
      } else if (this.field_13340.size() > this.field_13337) {
         float var3 = (float)this.field_13339 * 1.0F / (float)this.field_13340.size();
         if (!(var3 > this.field_13341)) {
            int var4 = 0;

            for (int var5 = 0; var5 < this.field_13340.size(); var5++) {
               Object var6 = this.field_13340.get(var5);
               if (var6 != null) {
                  if (var5 != var4) {
                     this.field_13340.set(var4, var6);
                  }

                  var4++;
               }
            }

            for (int var7 = this.field_13340.size() - 1; var7 >= var4; var7--) {
               this.field_13340.remove(var7);
            }
         }
      }
   }

   public boolean method_12281(Object var1) {
      return this.field_13340.contains(var1);
   }

   public Object method_12289(int var1) {
      return this.field_13340.get(var1);
   }

   public boolean method_12288() {
      return this.field_13340.isEmpty();
   }

   public int method_12279() {
      return this.field_13340.size();
   }

   public int method_12284() {
      return this.field_13339;
   }
}
