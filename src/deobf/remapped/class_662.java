package remapped;

import java.io.IOException;

public class class_662 implements class_6310<class_392> {
   private static String[] field_3663;
   private double field_3670;
   private double field_3666;
   private double field_3673;
   private float field_3668;
   private float field_3669;
   private float field_3667;
   private float field_3672;
   private int field_3665;
   private boolean field_3671;
   private class_5079 field_3664;

   public class_662() {
   }

   public <T extends class_5079> class_662(
      T var1, boolean var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, int var13
   ) {
      this.field_3664 = var1;
      this.field_3671 = var2;
      this.field_3670 = var3;
      this.field_3666 = var5;
      this.field_3673 = var7;
      this.field_3668 = var9;
      this.field_3669 = var10;
      this.field_3667 = var11;
      this.field_3672 = var12;
      this.field_3665 = var13;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      Object var4 = class_8669.field_44387.method_14040(var1.readInt());
      if (var4 == null) {
         var4 = class_3090.field_15327;
      }

      this.field_3671 = var1.readBoolean();
      this.field_3670 = var1.readDouble();
      this.field_3666 = var1.readDouble();
      this.field_3673 = var1.readDouble();
      this.field_3668 = var1.readFloat();
      this.field_3669 = var1.readFloat();
      this.field_3667 = var1.readFloat();
      this.field_3672 = var1.readFloat();
      this.field_3665 = var1.readInt();
      this.field_3664 = this.<class_5079>method_3019(var1, (class_8583<class_5079>)var4);
   }

   private <T extends class_5079> T method_3019(class_8248 var1, class_8583<T> var2) {
      return (T)var2.method_39482().method_36182(var2, var1);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeInt(class_8669.field_44387.method_14041(this.field_3664.method_23357()));
      var1.writeBoolean(this.field_3671);
      var1.writeDouble(this.field_3670);
      var1.writeDouble(this.field_3666);
      var1.writeDouble(this.field_3673);
      var1.writeFloat(this.field_3668);
      var1.writeFloat(this.field_3669);
      var1.writeFloat(this.field_3667);
      var1.writeFloat(this.field_3672);
      var1.writeInt(this.field_3665);
      this.field_3664.method_23359(var1);
   }

   public boolean method_3021() {
      return this.field_3671;
   }

   public double method_3026() {
      return this.field_3670;
   }

   public double method_3024() {
      return this.field_3666;
   }

   public double method_3028() {
      return this.field_3673;
   }

   public float method_3030() {
      return this.field_3668;
   }

   public float method_3027() {
      return this.field_3669;
   }

   public float method_3022() {
      return this.field_3667;
   }

   public float method_3029() {
      return this.field_3672;
   }

   public int method_3020() {
      return this.field_3665;
   }

   public class_5079 method_3025() {
      return this.field_3664;
   }

   public void method_3031(class_392 var1) {
      var1.method_1976(this);
   }
}
