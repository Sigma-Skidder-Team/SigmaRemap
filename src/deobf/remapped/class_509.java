package remapped;

import java.io.IOException;
import java.util.Set;

public class class_509 implements class_6310<class_392> {
   private static String[] field_3142;
   public double field_3139;
   public double field_3144;
   public double field_3141;
   public float field_3143;
   public float field_3140;
   private Set<class_8089> field_3145;
   private int field_3146;

   public class_509() {
   }

   public class_509(double var1, double var3, double var5, float var7, float var8, Set<class_8089> var9, int var10) {
      this.field_3139 = var1;
      this.field_3144 = var3;
      this.field_3141 = var5;
      this.field_3143 = var7;
      this.field_3140 = var8;
      this.field_3145 = var9;
      this.field_3146 = var10;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_3139 = var1.readDouble();
      this.field_3144 = var1.readDouble();
      this.field_3141 = var1.readDouble();
      this.field_3143 = var1.readFloat();
      this.field_3140 = var1.readFloat();
      this.field_3145 = class_8089.method_36733(var1.readUnsignedByte());
      this.field_3146 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeDouble(this.field_3139);
      var1.writeDouble(this.field_3144);
      var1.writeDouble(this.field_3141);
      var1.writeFloat(this.field_3143);
      var1.writeFloat(this.field_3140);
      var1.writeByte(class_8089.method_36734(this.field_3145));
      var1.method_37743(this.field_3146);
   }

   public void method_2525(class_392 var1) {
      var1.method_1894(this);
   }

   public double method_2520() {
      return this.field_3139;
   }

   public double method_2517() {
      return this.field_3144;
   }

   public double method_2519() {
      return this.field_3141;
   }

   public float method_2522() {
      return this.field_3143;
   }

   public float method_2523() {
      return this.field_3140;
   }

   public int method_2521() {
      return this.field_3146;
   }

   public Set<class_8089> method_2518() {
      return this.field_3145;
   }
}
