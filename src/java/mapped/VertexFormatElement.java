package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VertexFormatElement {
   private static final Logger field35246 = LogManager.getLogger();
   private final Class2061 field35247;
   private final Class2142 field35248;
   private final int field35249;
   private final int field35250;
   private final int field35251;

   public VertexFormatElement(int var1, Class2061 var2, Class2142 var3, int var4) {
      if (!this.method28515(var1, var3)) {
         field35246.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
         this.field35248 = Class2142.field14021;
      } else {
         this.field35248 = var3;
      }

      this.field35247 = var2;
      this.field35249 = var1;
      this.field35250 = var4;
      this.field35251 = var2.method8707() * this.field35250;
   }

   private boolean method28515(int var1, Class2142 var2) {
      return var1 == 0 || var2 == Class2142.field14021;
   }

   public final Class2061 method28516() {
      return this.field35247;
   }

   public final Class2142 method28517() {
      return this.field35248;
   }

   public final int method28518() {
      return this.field35249;
   }

   @Override
   public String toString() {
      return this.field35250 + "," + this.field35248.method8836() + "," + this.field35247.method8708();
   }

   public final int method28519() {
      return this.field35251;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            VertexFormatElement var4 = (VertexFormatElement)var1;
            if (this.field35250 != var4.field35250) {
               return false;
            } else if (this.field35249 != var4.field35249) {
               return false;
            } else {
               return this.field35247 == var4.field35247 ? this.field35248 == var4.field35248 : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field35247.hashCode();
      var3 = 31 * var3 + this.field35248.hashCode();
      var3 = 31 * var3 + this.field35249;
      return 31 * var3 + this.field35250;
   }

   public void method28520(long var1, int var3) {
      Class2142.method8848(this.field35248, this.field35250, this.field35247.method8709(), var3, var1, this.field35249);
   }

   public void method28521() {
      this.field35248.method8835(this.field35249);
   }

   public final int method28522() {
      return this.field35250;
   }
}
