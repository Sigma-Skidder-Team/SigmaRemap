package mapped;

import net.optifine.Config;

public class Class9098 {
   private Object[] field41624;
   private int field41625 = 0;

   public Class9098(Object[] var1) {
      this.field41624 = (Object[])var1.clone();
   }

   public Class9098(Object var1, Object var2) {
      this(new Object[]{var1, var2});
   }

   public Class9098(Object var1, Object var2, Object var3) {
      this(new Object[]{var1, var2, var3});
   }

   public Class9098(Object var1, Object var2, Object var3, Object var4) {
      this(new Object[]{var1, var2, var3, var4});
   }

   @Override
   public int hashCode() {
      if (this.field41625 == 0) {
         this.field41625 = 7;

         for (int var3 = 0; var3 < this.field41624.length; var3++) {
            Object var4 = this.field41624[var3];
            if (var4 != null) {
               this.field41625 = 31 * this.field41625 + var4.hashCode();
            }
         }
      }

      return this.field41625;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Class9098)) {
         return false;
      } else {
         Class9098 var4 = (Class9098)var1;
         Object[] var5 = var4.method33928();
         if (var5.length != this.field41624.length) {
            return false;
         } else {
            for (int var6 = 0; var6 < this.field41624.length; var6++) {
               if (!method33927(this.field41624[var6], var5[var6])) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private static boolean method33927(Object var0, Object var1) {
      if (var0 != var1) {
         if (var0 != null) {
            return var1 != null ? var0.equals(var1) : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private Object[] method33928() {
      return this.field41624;
   }

   public Object[] method33929() {
      return (Object[])this.field41624.clone();
   }

   @Override
   public String toString() {
      return "[" + Config.method26854(this.field41624) + "]";
   }
}
