package remapped;

import java.io.IOException;
import java.util.UUID;

public class class_5000 implements class_6310<class_392> {
   private static String[] field_25872;
   private int field_25871;
   private UUID field_25869;
   private double field_25868;
   private double field_25867;
   private double field_25870;
   private byte field_25874;
   private byte field_25873;

   public class_5000() {
   }

   public class_5000(class_704 var1) {
      this.field_25871 = var1.method_37145();
      this.field_25869 = var1.method_3247().getId();
      this.field_25868 = var1.method_37302();
      this.field_25867 = var1.method_37309();
      this.field_25870 = var1.method_37156();
      this.field_25874 = (byte)((int)(var1.field_41701 * 256.0F / 360.0F));
      this.field_25873 = (byte)((int)(var1.field_41755 * 256.0F / 360.0F));
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_25871 = var1.method_37778();
      this.field_25869 = var1.method_37753();
      this.field_25868 = var1.readDouble();
      this.field_25867 = var1.readDouble();
      this.field_25870 = var1.readDouble();
      this.field_25874 = var1.readByte();
      this.field_25873 = var1.readByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_25871);
      var1.method_37746(this.field_25869);
      var1.writeDouble(this.field_25868);
      var1.writeDouble(this.field_25867);
      var1.writeDouble(this.field_25870);
      var1.writeByte(this.field_25874);
      var1.writeByte(this.field_25873);
   }

   public void method_23023(class_392 var1) {
      var1.method_1947(this);
   }

   public int method_23017() {
      return this.field_25871;
   }

   public UUID method_23019() {
      return this.field_25869;
   }

   public double method_23016() {
      return this.field_25868;
   }

   public double method_23020() {
      return this.field_25867;
   }

   public double method_23018() {
      return this.field_25870;
   }

   public byte method_23022() {
      return this.field_25874;
   }

   public byte method_23015() {
      return this.field_25873;
   }
}
