package remapped;

public class class_1608 {
   private static String[] field_8341;
   public final Class<? extends class_6315> field_8344;
   public final int field_8346;
   public int field_8343;
   public final int field_8342;
   public final boolean field_8345;

   public class_1608(Class<? extends class_6315> var1, int var2, int var3, boolean var4) {
      this.field_8344 = var1;
      this.field_8346 = var2;
      this.field_8342 = var3;
      this.field_8345 = var4;
   }

   public class_1608(Class<? extends class_6315> var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   public boolean method_7184(int var1) {
      return this.field_8342 == 0 || this.field_8343 < this.field_8342;
   }

   public boolean method_7185() {
      return this.field_8342 == 0 || this.field_8343 < this.field_8342;
   }
}
