package mapped;

import java.util.ArrayList;
import java.util.HashMap;

public class Class7701 {
   private float field33078;
   private float field33079;
   private float field33080;
   private float field33081;
   private HashMap field33082 = new HashMap();
   private ArrayList field33083 = new ArrayList();
   private float field33084;

   public Class7701(float var1, float var2, float var3, float var4) {
      this.field33078 = var1;
      this.field33079 = var2;
      this.field33080 = var3;
      this.field33081 = var4;
   }

   public float method25441() {
      return this.field33080;
   }

   public float method25442() {
      return this.field33081;
   }

   public float method25443() {
      return this.field33078;
   }

   public float method25444() {
      return this.field33079;
   }

   public void method25445(Class7701 var1) {
      if (this.method25446(this.field33078, var1.field33078 + var1.field33080) || this.method25446(this.field33078 + this.field33080, var1.field33078)) {
         float var4 = this.field33078;
         if (this.field33078 + this.field33080 == var1.field33078) {
            var4 = this.field33078 + this.field33080;
         }

         float var5 = Math.max(this.field33079, var1.field33079);
         float var6 = Math.min(this.field33079 + this.field33081, var1.field33079 + var1.field33081);
         float var7 = var5 + (var6 - var5) / 2.0F;
         Class7276 var8 = new Class7276(var4, var7, var1);
         this.field33082.put(var1, var8);
         this.field33083.add(var8);
      }

      if (this.method25446(this.field33079, var1.field33079 + var1.field33081) || this.method25446(this.field33079 + this.field33081, var1.field33079)) {
         float var9 = this.field33079;
         if (this.field33079 + this.field33081 == var1.field33079) {
            var9 = this.field33079 + this.field33081;
         }

         float var10 = Math.max(this.field33078, var1.field33078);
         float var11 = Math.min(this.field33078 + this.field33080, var1.field33078 + var1.field33080);
         float var12 = var10 + (var11 - var10) / 2.0F;
         Class7276 var13 = new Class7276(var12, var9, var1);
         this.field33082.put(var1, var13);
         this.field33083.add(var13);
      }
   }

   private boolean method25446(float var1, float var2) {
      return var1 == var2;
   }

   public boolean method25447(Class7701 var1) {
      if (this.method25446(this.field33078, var1.field33078 + var1.field33080) || this.method25446(this.field33078 + this.field33080, var1.field33078)) {
         if (this.field33079 >= var1.field33079 && this.field33079 <= var1.field33079 + var1.field33081) {
            return true;
         }

         if (this.field33079 + this.field33081 >= var1.field33079 && this.field33079 + this.field33081 <= var1.field33079 + var1.field33081) {
            return true;
         }

         if (var1.field33079 >= this.field33079 && var1.field33079 <= this.field33079 + this.field33081) {
            return true;
         }

         if (var1.field33079 + var1.field33081 >= this.field33079 && var1.field33079 + var1.field33081 <= this.field33079 + this.field33081) {
            return true;
         }
      }

      if (this.method25446(this.field33079, var1.field33079 + var1.field33081) || this.method25446(this.field33079 + this.field33081, var1.field33079)) {
         if (this.field33078 >= var1.field33078 && this.field33078 <= var1.field33078 + var1.field33080) {
            return true;
         }

         if (this.field33078 + this.field33080 >= var1.field33078 && this.field33078 + this.field33080 <= var1.field33078 + var1.field33080) {
            return true;
         }

         if (var1.field33078 >= this.field33078 && var1.field33078 <= this.field33078 + this.field33080) {
            return true;
         }

         if (var1.field33078 + var1.field33080 >= this.field33078 && var1.field33078 + var1.field33080 <= this.field33078 + this.field33080) {
            return true;
         }
      }

      return false;
   }

   public Class7701 method25448(Class7701 var1) {
      float var4 = Math.min(this.field33078, var1.field33078);
      float var5 = Math.min(this.field33079, var1.field33079);
      float var6 = this.field33080 + var1.field33080;
      float var7 = this.field33081 + var1.field33081;
      if (this.field33078 != var1.field33078) {
         var7 = this.field33081;
      } else {
         var6 = this.field33080;
      }

      return new Class7701(var4, var5, var6, var7);
   }

   public boolean method25449(Class7701 var1) {
      if (this.method25447(var1)) {
         return this.field33078 == var1.field33078 && this.field33080 == var1.field33080
            ? true
            : this.field33079 == var1.field33079 && this.field33081 == var1.field33081;
      } else {
         return false;
      }
   }

   public int method25450() {
      return this.field33083.size();
   }

   public Class7276 method25451(int var1) {
      return (Class7276)this.field33083.get(var1);
   }

   public boolean method25452(float var1, float var2) {
      return var1 >= this.field33078 && var1 < this.field33078 + this.field33080 && var2 >= this.field33079 && var2 < this.field33079 + this.field33081;
   }

   public void method25453(Class7701 var1, float var2, float var3, float var4) {
      if (!(var4 >= this.field33084)) {
         this.field33084 = var4;
         if (var1 != this) {
            for (int var7 = 0; var7 < this.method25450(); var7++) {
               Class7276 var8 = this.method25451(var7);
               float var9 = var8.method22909(var2, var3);
               float var10 = var4 + var9;
               var8.method22912().method25453(var1, var8.method22910(), var8.method22911(), var10);
            }
         }
      }
   }

   public void method25454() {
      this.field33084 = Float.MAX_VALUE;
   }

   public float method25455() {
      return this.field33084;
   }

   public boolean method25456(Class7701 var1, Class9568 var2) {
      if (var1 == this) {
         return true;
      } else if (this.field33082.size() == 0) {
         return false;
      } else {
         Class7276 var5 = null;

         for (int var6 = 0; var6 < this.method25450(); var6++) {
            Class7276 var7 = this.method25451(var6);
            if (var5 == null || var7.method22912().method25455() < var5.method22912().method25455()) {
               var5 = var7;
            }
         }

         var2.method37096(var5);
         return var5.method22912().method25456(var1, var2);
      }
   }

   @Override
   public String toString() {
      return "[Space " + this.field33078 + "," + this.field33079 + " " + this.field33080 + "," + this.field33081 + "]";
   }
}
