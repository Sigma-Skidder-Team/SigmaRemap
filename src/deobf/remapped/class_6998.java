package remapped;

public class class_6998 {
   private Object[] field_35922;
   private int field_35923 = 0;

   public class_6998(Object[] var1) {
      this.field_35922 = (Object[])var1.clone();
   }

   public class_6998(Object var1, Object var2) {
      this(new Object[]{var1, var2});
   }

   public class_6998(Object var1, Object var2, Object var3) {
      this(new Object[]{var1, var2, var3});
   }

   public class_6998(Object var1, Object var2, Object var3, Object var4) {
      this(new Object[]{var1, var2, var3, var4});
   }

   @Override
   public int hashCode() {
      if (this.field_35923 == 0) {
         this.field_35923 = 7;

         for (int var3 = 0; var3 < this.field_35922.length; var3++) {
            Object var4 = this.field_35922[var3];
            if (var4 != null) {
               this.field_35923 = 31 * this.field_35923 + var4.hashCode();
            }
         }
      }

      return this.field_35923;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class_6998)) {
         return false;
      } else {
         class_6998 var4 = (class_6998)var1;
         Object[] var5 = var4.method_32000();
         if (var5.length != this.field_35922.length) {
            return false;
         } else {
            for (int var6 = 0; var6 < this.field_35922.length; var6++) {
               if (!method_32001(this.field_35922[var6], var5[var6])) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private static boolean method_32001(Object var0, Object var1) {
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

   private Object[] method_32000() {
      return this.field_35922;
   }

   public Object[] method_32002() {
      return (Object[])this.field_35922.clone();
   }

   @Override
   public String toString() {
      return "[" + Config.method_14289(this.field_35922) + "]";
   }
}
