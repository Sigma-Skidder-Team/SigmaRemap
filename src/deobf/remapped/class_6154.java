package remapped;

import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class class_6154 {
   private int field_31525 = 0;
   private String field_31524 = null;
   private String[] field_31530 = null;
   private String field_31527 = null;
   private String[] field_31526 = null;
   private int field_31528 = 0;

   public class_6154(String var1, String[] var2, String var3, String[] var4, int var5) {
      this.field_31524 = var1;
      this.field_31530 = var2;
      this.field_31527 = var3;
      this.field_31526 = var4;
      this.field_31525 = var5;
      if (var2.length == var4.length) {
         if (var5 >= 0 && var5 < var2.length) {
            this.field_31528 = var5;
         } else {
            throw new IllegalArgumentException("Invalid default value: " + var5);
         }
      } else {
         throw new IllegalArgumentException("Property and user values have different lengths: " + var2.length + " != " + var4.length);
      }
   }

   public boolean method_28241(String var1) {
      if (var1 != null) {
         this.field_31528 = ArrayUtils.indexOf(this.field_31530, var1);
         if (this.field_31528 >= 0 && this.field_31528 < this.field_31530.length) {
            return true;
         } else {
            this.field_31528 = this.field_31525;
            return false;
         }
      } else {
         this.field_31528 = this.field_31525;
         return false;
      }
   }

   public void method_28245(boolean var1) {
      byte var4 = 0;
      int var5 = this.field_31530.length - 1;
      this.field_31528 = Config.method_14263(this.field_31528, var4, var5);
      if (!var1) {
         this.field_31528--;
         if (this.field_31528 < var4) {
            this.field_31528 = var5;
         }
      } else {
         this.field_31528++;
         if (this.field_31528 > var5) {
            this.field_31528 = var4;
         }
      }
   }

   public void method_28246(int var1) {
      this.field_31528 = var1;
      if (this.field_31528 < 0 || this.field_31528 >= this.field_31530.length) {
         this.field_31528 = this.field_31525;
      }
   }

   public int method_28243() {
      return this.field_31528;
   }

   public String method_28244() {
      return this.field_31526[this.field_31528];
   }

   public String method_28238() {
      return this.field_31530[this.field_31528];
   }

   public String method_28236() {
      return this.field_31527;
   }

   public String method_28240() {
      return this.field_31524;
   }

   public void method_28235() {
      this.field_31528 = this.field_31525;
   }

   public boolean method_28242(Properties var1) {
      this.method_28235();
      if (var1 != null) {
         String var4 = var1.getProperty(this.field_31524);
         return var4 != null ? this.method_28241(var4) : false;
      } else {
         return false;
      }
   }

   public void method_28239(Properties var1) {
      if (var1 != null) {
         var1.setProperty(this.method_28240(), this.method_28238());
      }
   }

   @Override
   public String toString() {
      return "" + this.field_31524 + "=" + this.method_28238() + " [" + Config.method_14289(this.field_31530) + "], value: " + this.field_31528;
   }
}
