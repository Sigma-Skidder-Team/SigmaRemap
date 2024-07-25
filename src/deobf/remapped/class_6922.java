package remapped;

public final class class_6922 {
   private int field_35560;
   private boolean field_35559;
   private int field_35556;
   private int field_35557;
   private int field_35562;
   private class_404 field_35561;

   public class_6922(int var1, boolean var2, int var3, int var4, int var5, class_404 var6) {
      this.field_35560 = var1;
      this.field_35559 = var2;
      this.field_35556 = var3;
      this.field_35557 = var4;
      this.field_35562 = var5;
      this.field_35561 = var6;
   }

   public int method_31686() {
      return this.field_35560;
   }

   public int method_31684() {
      return this.field_35562;
   }

   public class_404 method_31687() {
      return this.field_35561;
   }

   public int method_31689() {
      return this.field_35556;
   }

   public int method_31683() {
      return this.field_35557;
   }

   public boolean method_31685() {
      return this.field_35559;
   }

   @Override
   public String toString() {
      return "SimpleKey - tokenNumber="
         + this.field_35560
         + " required="
         + this.field_35559
         + " index="
         + this.field_35556
         + " line="
         + this.field_35557
         + " column="
         + this.field_35562;
   }
}
