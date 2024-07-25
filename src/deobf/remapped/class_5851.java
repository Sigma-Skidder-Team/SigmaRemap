package remapped;

public class class_5851 {
   public final int field_29731;
   public final int field_29735;
   public final int field_29736;
   private final int field_29738;
   public int field_29737 = -1;
   public float field_29734;
   public float field_29727;
   public float field_29732;
   public class_5851 field_29739;
   public boolean field_29726;
   public float field_29728;
   public float field_29729;
   public class_1108 field_29730 = class_1108.field_6365;

   public class_5851(int var1, int var2, int var3) {
      this.field_29731 = var1;
      this.field_29735 = var2;
      this.field_29736 = var3;
      this.field_29738 = method_26694(var1, var2, var3);
   }

   public class_5851 method_26692(int var1, int var2, int var3) {
      class_5851 var6 = new class_5851(var1, var2, var3);
      var6.field_29737 = this.field_29737;
      var6.field_29734 = this.field_29734;
      var6.field_29727 = this.field_29727;
      var6.field_29732 = this.field_29732;
      var6.field_29739 = this.field_29739;
      var6.field_29726 = this.field_29726;
      var6.field_29728 = this.field_29728;
      var6.field_29729 = this.field_29729;
      var6.field_29730 = this.field_29730;
      return var6;
   }

   public static int method_26694(int var0, int var1, int var2) {
      return var1 & 0xFF | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 >= 0 ? 0 : Integer.MIN_VALUE) | (var2 >= 0 ? 0 : 32768);
   }

   public float method_26688(class_5851 var1) {
      float var4 = (float)(var1.field_29731 - this.field_29731);
      float var5 = (float)(var1.field_29735 - this.field_29735);
      float var6 = (float)(var1.field_29736 - this.field_29736);
      return MathHelper.sqrt(var4 * var4 + var5 * var5 + var6 * var6);
   }

   public float method_26687(class_5851 var1) {
      float var4 = (float)(var1.field_29731 - this.field_29731);
      float var5 = (float)(var1.field_29735 - this.field_29735);
      float var6 = (float)(var1.field_29736 - this.field_29736);
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public float method_26685(class_5851 var1) {
      float var4 = (float)Math.abs(var1.field_29731 - this.field_29731);
      float var5 = (float)Math.abs(var1.field_29735 - this.field_29735);
      float var6 = (float)Math.abs(var1.field_29736 - this.field_29736);
      return var4 + var5 + var6;
   }

   public float method_26691(BlockPos var1) {
      float var4 = (float)Math.abs(var1.getX() - this.field_29731);
      float var5 = (float)Math.abs(var1.method_12165() - this.field_29735);
      float var6 = (float)Math.abs(var1.method_12185() - this.field_29736);
      return var4 + var5 + var6;
   }

   public BlockPos method_26686() {
      return new BlockPos(this.field_29731, this.field_29735, this.field_29736);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_5851)) {
         return false;
      } else {
         class_5851 var4 = (class_5851)var1;
         return this.field_29738 == var4.field_29738
            && this.field_29731 == var4.field_29731
            && this.field_29735 == var4.field_29735
            && this.field_29736 == var4.field_29736;
      }
   }

   @Override
   public int hashCode() {
      return this.field_29738;
   }

   public boolean method_26690() {
      return this.field_29737 >= 0;
   }

   @Override
   public String toString() {
      return "Node{x=" + this.field_29731 + ", y=" + this.field_29735 + ", z=" + this.field_29736 + '}';
   }

   public static class_5851 method_26693(class_8248 var0) {
      class_5851 var3 = new class_5851(var0.readInt(), var0.readInt(), var0.readInt());
      var3.field_29728 = var0.readFloat();
      var3.field_29729 = var0.readFloat();
      var3.field_29726 = var0.readBoolean();
      var3.field_29730 = class_1108.values()[var0.readInt()];
      var3.field_29732 = var0.readFloat();
      return var3;
   }
}
