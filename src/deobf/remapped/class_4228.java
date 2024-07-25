package remapped;

import java.io.IOException;
import java.util.UUID;

public class class_4228 implements Packet<class_392> {
   private static String[] field_20521;
   private int field_20522;
   private UUID field_20515;
   private int field_20516;
   private double field_20512;
   private double field_20511;
   private double field_20513;
   private int field_20517;
   private int field_20518;
   private int field_20520;
   private byte field_20514;
   private byte field_20519;
   private byte field_20523;

   public class_4228() {
   }

   public class_4228(class_5834 var1) {
      this.field_20522 = var1.method_37145();
      this.field_20515 = var1.method_37328();
      this.field_20516 = class_8669.field_44400.method_14041(var1.method_37387());
      this.field_20512 = var1.getPosX();
      this.field_20511 = var1.method_37309();
      this.field_20513 = var1.getPosZ();
      this.field_20514 = (byte)((int)(var1.rotationYaw * 256.0F / 360.0F));
      this.field_20519 = (byte)((int)(var1.rotationPitch * 256.0F / 360.0F));
      this.field_20523 = (byte)((int)(var1.field_29618 * 256.0F / 360.0F));
      double var4 = 3.9;
      class_1343 var6 = var1.method_37098();
      double var7 = class_9299.method_42827(var6.field_7336, -3.9, 3.9);
      double var9 = class_9299.method_42827(var6.field_7333, -3.9, 3.9);
      double var11 = class_9299.method_42827(var6.field_7334, -3.9, 3.9);
      this.field_20517 = (int)(var7 * 8000.0);
      this.field_20518 = (int)(var9 * 8000.0);
      this.field_20520 = (int)(var11 * 8000.0);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_20522 = var1.method_37778();
      this.field_20515 = var1.method_37753();
      this.field_20516 = var1.method_37778();
      this.field_20512 = var1.readDouble();
      this.field_20511 = var1.readDouble();
      this.field_20513 = var1.readDouble();
      this.field_20514 = var1.readByte();
      this.field_20519 = var1.readByte();
      this.field_20523 = var1.readByte();
      this.field_20517 = var1.readShort();
      this.field_20518 = var1.readShort();
      this.field_20520 = var1.readShort();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_20522);
      var1.method_37746(this.field_20515);
      var1.method_37743(this.field_20516);
      var1.writeDouble(this.field_20512);
      var1.writeDouble(this.field_20511);
      var1.writeDouble(this.field_20513);
      var1.writeByte(this.field_20514);
      var1.writeByte(this.field_20519);
      var1.writeByte(this.field_20523);
      var1.writeShort(this.field_20517);
      var1.writeShort(this.field_20518);
      var1.writeShort(this.field_20520);
   }

   public void method_19698(class_392 var1) {
      var1.method_1905(this);
   }

   public int method_19693() {
      return this.field_20522;
   }

   public UUID method_19691() {
      return this.field_20515;
   }

   public int method_19692() {
      return this.field_20516;
   }

   public double method_19688() {
      return this.field_20512;
   }

   public double method_19694() {
      return this.field_20511;
   }

   public double method_19697() {
      return this.field_20513;
   }

   public int method_19687() {
      return this.field_20517;
   }

   public int method_19689() {
      return this.field_20518;
   }

   public int method_19695() {
      return this.field_20520;
   }

   public byte method_19700() {
      return this.field_20514;
   }

   public byte method_19696() {
      return this.field_20519;
   }

   public byte method_19690() {
      return this.field_20523;
   }
}
