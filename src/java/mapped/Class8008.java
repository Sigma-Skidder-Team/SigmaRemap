package mapped;

import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class Class8008 {
   private int field34430 = 0;
   private String field34431 = null;
   private String[] field34432 = null;
   private String field34433 = null;
   private String[] field34434 = null;
   private int field34435 = 0;

   public Class8008(String var1, String[] var2, String var3, String[] var4, int var5) {
      this.field34431 = var1;
      this.field34432 = var2;
      this.field34433 = var3;
      this.field34434 = var4;
      this.field34430 = var5;
      if (var2.length == var4.length) {
         if (var5 >= 0 && var5 < var2.length) {
            this.field34435 = var5;
         } else {
            throw new IllegalArgumentException("Invalid default value: " + var5);
         }
      } else {
         throw new IllegalArgumentException("Property and user values have different lengths: " + var2.length + " != " + var4.length);
      }
   }

   public boolean method27380(String var1) {
      if (var1 != null) {
         this.field34435 = ArrayUtils.indexOf(this.field34432, var1);
         if (this.field34435 >= 0 && this.field34435 < this.field34432.length) {
            return true;
         } else {
            this.field34435 = this.field34430;
            return false;
         }
      } else {
         this.field34435 = this.field34430;
         return false;
      }
   }

   public void method27381(boolean var1) {
      byte var4 = 0;
      int var5 = this.field34432.length - 1;
      this.field34435 = Class7944.method26830(this.field34435, var4, var5);
      if (!var1) {
         this.field34435--;
         if (this.field34435 < var4) {
            this.field34435 = var5;
         }
      } else {
         this.field34435++;
         if (this.field34435 > var5) {
            this.field34435 = var4;
         }
      }
   }

   public void method27382(int var1) {
      this.field34435 = var1;
      if (this.field34435 < 0 || this.field34435 >= this.field34432.length) {
         this.field34435 = this.field34430;
      }
   }

   public int method27383() {
      return this.field34435;
   }

   public String method27376() {
      return this.field34434[this.field34435];
   }

   public String method27384() {
      return this.field34432[this.field34435];
   }

   public String method27385() {
      return this.field34433;
   }

   public String method27386() {
      return this.field34431;
   }

   public void method27387() {
      this.field34435 = this.field34430;
   }

   public boolean method27388(Properties var1) {
      this.method27387();
      if (var1 != null) {
         String var4 = var1.getProperty(this.field34431);
         return var4 != null ? this.method27380(var4) : false;
      } else {
         return false;
      }
   }

   public void method27389(Properties var1) {
      if (var1 != null) {
         var1.setProperty(this.method27386(), this.method27384());
      }
   }

   @Override
   public String toString() {
      return "" + this.field34431 + "=" + this.method27384() + " [" + Class7944.method26854(this.field34432) + "], value: " + this.field34435;
   }
}
