package remapped;

public class class_784 implements class_1137 {
   private static String[] field_4217;
   private final boolean field_4221;
   private final class_291 field_4212;
   private final boolean field_4213;
   private int field_4216;
   private int field_4214;
   private int field_4220;
   private float field_4222;
   private long field_4215;
   private long field_4219;
   private boolean field_4211;
   private class_423 field_4210;
   private boolean field_4218;

   public class_784(class_423 var1, boolean var2, boolean var3) {
      this.field_4210 = var1;
      this.field_4221 = var2;
      this.field_4213 = var3;
      this.field_4212 = new class_291();
   }

   @Override
   public int method_8654() {
      return this.field_4216;
   }

   @Override
   public int method_8660() {
      return this.field_4214;
   }

   @Override
   public int method_8655() {
      return this.field_4220;
   }

   @Override
   public float method_8657() {
      return this.field_4222;
   }

   @Override
   public long method_8658() {
      return this.field_4215;
   }

   @Override
   public long method_8666() {
      return this.field_4219;
   }

   @Override
   public void method_4989(int var1) {
      this.field_4216 = var1;
   }

   @Override
   public void method_4987(int var1) {
      this.field_4214 = var1;
   }

   @Override
   public void method_4986(int var1) {
      this.field_4220 = var1;
   }

   @Override
   public void method_4985(float var1) {
      this.field_4222 = var1;
   }

   public void method_3500(long var1) {
      this.field_4215 = var1;
   }

   public void method_3498(long var1) {
      this.field_4219 = var1;
   }

   @Override
   public void method_4988(BlockPos var1, float var2) {
      this.field_4216 = var1.method_12173();
      this.field_4214 = var1.method_12165();
      this.field_4220 = var1.method_12185();
      this.field_4222 = var2;
   }

   @Override
   public boolean method_8663() {
      return false;
   }

   @Override
   public boolean method_8664() {
      return this.field_4211;
   }

   @Override
   public void method_8665(boolean var1) {
      this.field_4211 = var1;
   }

   @Override
   public boolean method_8659() {
      return this.field_4221;
   }

   @Override
   public class_291 method_8653() {
      return this.field_4212;
   }

   @Override
   public class_423 method_8661() {
      return this.field_4210;
   }

   @Override
   public boolean method_8662() {
      return this.field_4218;
   }

   @Override
   public void method_8656(class_6544 var1) {
      class_1137.super.method_8656(var1);
   }

   public void method_3495(class_423 var1) {
      class_7860.field_39892.method_3590(var1, this.field_4210);
      this.field_4210 = var1;
   }

   public void method_3497(boolean var1) {
      this.field_4218 = var1;
   }

   public double method_3496() {
      return !this.field_4213 ? 63.0 : 0.0;
   }

   public double method_3494() {
      return !this.field_4213 ? 0.03125 : 1.0;
   }
}
