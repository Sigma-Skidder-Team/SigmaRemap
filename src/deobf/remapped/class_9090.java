package remapped;

public class class_9090 {
   private static String[] field_46550;
   private class_8112 field_46552;
   private int field_46549;
   private int field_46553;
   private class_8709 field_46548 = class_8709.field_44646;
   private float field_46554;
   private float field_46551;

   public class_9090(class_8112 var1, int var2, int var3) {
      this.field_46552 = var1;
      this.field_46549 = var2;
      this.field_46553 = var3;
      this.field_46554 = (float)var1.method_36877();
      this.field_46551 = (float)var1.method_36856();
   }

   public float method_41866() {
      return this.field_46551;
   }

   public float method_41868() {
      return this.field_46554;
   }

   public void method_41858(float var1) {
      this.field_46551 = var1;
   }

   public void method_41865(float var1) {
      this.field_46554 = var1;
   }

   public void method_41859(class_8709 var1) {
      this.field_46548 = var1;
   }

   public class_8709 method_41861() {
      return this.field_46548;
   }

   public void method_41862(int var1) {
      this.field_46549 = var1;
   }

   public void method_41857(int var1) {
      this.field_46553 = var1;
   }

   public int method_41863() {
      return this.field_46549;
   }

   public int method_41867() {
      return this.field_46553;
   }

   public void method_41860() {
      this.field_46552.method_36892((float)this.field_46549, (float)this.field_46553, this.field_46554, this.field_46551, this.field_46548);
   }
}
