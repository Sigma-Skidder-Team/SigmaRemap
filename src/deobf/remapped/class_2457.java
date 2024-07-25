package remapped;

import java.util.ArrayList;
import java.util.HashMap;

public class class_2457 {
   private float field_12300;
   private float field_12304;
   private float field_12303;
   private float field_12306;
   private HashMap field_12301 = new HashMap();
   private ArrayList field_12307 = new ArrayList();
   private float field_12302;

   public class_2457(float var1, float var2, float var3, float var4) {
      this.field_12300 = var1;
      this.field_12304 = var2;
      this.field_12303 = var3;
      this.field_12306 = var4;
   }

   public float method_11320() {
      return this.field_12303;
   }

   public float method_11324() {
      return this.field_12306;
   }

   public float method_11322() {
      return this.field_12300;
   }

   public float method_11312() {
      return this.field_12304;
   }

   public void method_11325(class_2457 var1) {
      if (this.method_11314(this.field_12300, var1.field_12300 + var1.field_12303) || this.method_11314(this.field_12300 + this.field_12303, var1.field_12300)) {
         float var4 = this.field_12300;
         if (this.field_12300 + this.field_12303 == var1.field_12300) {
            var4 = this.field_12300 + this.field_12303;
         }

         float var5 = Math.max(this.field_12304, var1.field_12304);
         float var6 = Math.min(this.field_12304 + this.field_12306, var1.field_12304 + var1.field_12306);
         float var7 = var5 + (var6 - var5) / 2.0F;
         class_1642 var8 = new class_1642(var4, var7, var1);
         this.field_12301.put(var1, var8);
         this.field_12307.add(var8);
      }

      if (this.method_11314(this.field_12304, var1.field_12304 + var1.field_12306) || this.method_11314(this.field_12304 + this.field_12306, var1.field_12304)) {
         float var9 = this.field_12304;
         if (this.field_12304 + this.field_12306 == var1.field_12304) {
            var9 = this.field_12304 + this.field_12306;
         }

         float var10 = Math.max(this.field_12300, var1.field_12300);
         float var11 = Math.min(this.field_12300 + this.field_12303, var1.field_12300 + var1.field_12303);
         float var12 = var10 + (var11 - var10) / 2.0F;
         class_1642 var13 = new class_1642(var12, var9, var1);
         this.field_12301.put(var1, var13);
         this.field_12307.add(var13);
      }
   }

   private boolean method_11314(float var1, float var2) {
      return var1 == var2;
   }

   public boolean method_11327(class_2457 var1) {
      if (this.method_11314(this.field_12300, var1.field_12300 + var1.field_12303) || this.method_11314(this.field_12300 + this.field_12303, var1.field_12300)) {
         if (this.field_12304 >= var1.field_12304 && this.field_12304 <= var1.field_12304 + var1.field_12306) {
            return true;
         }

         if (this.field_12304 + this.field_12306 >= var1.field_12304 && this.field_12304 + this.field_12306 <= var1.field_12304 + var1.field_12306) {
            return true;
         }

         if (var1.field_12304 >= this.field_12304 && var1.field_12304 <= this.field_12304 + this.field_12306) {
            return true;
         }

         if (var1.field_12304 + var1.field_12306 >= this.field_12304 && var1.field_12304 + var1.field_12306 <= this.field_12304 + this.field_12306) {
            return true;
         }
      }

      if (this.method_11314(this.field_12304, var1.field_12304 + var1.field_12306) || this.method_11314(this.field_12304 + this.field_12306, var1.field_12304)) {
         if (this.field_12300 >= var1.field_12300 && this.field_12300 <= var1.field_12300 + var1.field_12303) {
            return true;
         }

         if (this.field_12300 + this.field_12303 >= var1.field_12300 && this.field_12300 + this.field_12303 <= var1.field_12300 + var1.field_12303) {
            return true;
         }

         if (var1.field_12300 >= this.field_12300 && var1.field_12300 <= this.field_12300 + this.field_12303) {
            return true;
         }

         if (var1.field_12300 + var1.field_12303 >= this.field_12300 && var1.field_12300 + var1.field_12303 <= this.field_12300 + this.field_12303) {
            return true;
         }
      }

      return false;
   }

   public class_2457 method_11326(class_2457 var1) {
      float var4 = Math.min(this.field_12300, var1.field_12300);
      float var5 = Math.min(this.field_12304, var1.field_12304);
      float var6 = this.field_12303 + var1.field_12303;
      float var7 = this.field_12306 + var1.field_12306;
      if (this.field_12300 != var1.field_12300) {
         var7 = this.field_12306;
      } else {
         var6 = this.field_12303;
      }

      return new class_2457(var4, var5, var6, var7);
   }

   public boolean method_11315(class_2457 var1) {
      if (this.method_11327(var1)) {
         return this.field_12300 == var1.field_12300 && this.field_12303 == var1.field_12303
            ? true
            : this.field_12304 == var1.field_12304 && this.field_12306 == var1.field_12306;
      } else {
         return false;
      }
   }

   public int method_11311() {
      return this.field_12307.size();
   }

   public class_1642 method_11323(int var1) {
      return (class_1642)this.field_12307.get(var1);
   }

   public boolean method_11319(float var1, float var2) {
      return var1 >= this.field_12300 && var1 < this.field_12300 + this.field_12303 && var2 >= this.field_12304 && var2 < this.field_12304 + this.field_12306;
   }

   public void method_11318(class_2457 var1, float var2, float var3, float var4) {
      if (!(var4 >= this.field_12302)) {
         this.field_12302 = var4;
         if (var1 != this) {
            for (int var7 = 0; var7 < this.method_11311(); var7++) {
               class_1642 var8 = this.method_11323(var7);
               float var9 = var8.method_7357(var2, var3);
               float var10 = var4 + var9;
               var8.method_7360().method_11318(var1, var8.method_7358(), var8.method_7359(), var10);
            }
         }
      }
   }

   public void method_11313() {
      this.field_12302 = Float.MAX_VALUE;
   }

   public float method_11321() {
      return this.field_12302;
   }

   public boolean method_11317(class_2457 var1, class_8866 var2) {
      if (var1 == this) {
         return true;
      } else if (this.field_12301.size() == 0) {
         return false;
      } else {
         class_1642 var5 = null;

         for (int var6 = 0; var6 < this.method_11311(); var6++) {
            class_1642 var7 = this.method_11323(var6);
            if (var5 == null || var7.method_7360().method_11321() < var5.method_7360().method_11321()) {
               var5 = var7;
            }
         }

         var2.method_40791(var5);
         return var5.method_7360().method_11317(var1, var2);
      }
   }

   @Override
   public String toString() {
      return "[Space " + this.field_12300 + "," + this.field_12304 + " " + this.field_12303 + "," + this.field_12306 + "]";
   }
}
