package remapped;

import java.io.IOException;

public class class_2171 implements Packet<class_392> {
   private static String[] field_10819;
   private int field_10818;
   private double field_10825;
   private double field_10824;
   private double field_10822;
   private byte field_10821;
   private byte field_10823;
   private boolean field_10820;

   public class_2171() {
   }

   public class_2171(Entity var1) {
      this.field_10818 = var1.method_37145();
      this.field_10825 = var1.method_37302();
      this.field_10824 = var1.method_37309();
      this.field_10822 = var1.method_37156();
      this.field_10821 = (byte)((int)(var1.rotationYaw * 256.0F / 360.0F));
      this.field_10823 = (byte)((int)(var1.rotationPitch * 256.0F / 360.0F));
      this.field_10820 = var1.method_37360();
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_10818 = var1.method_37778();
      this.field_10825 = var1.readDouble();
      this.field_10824 = var1.readDouble();
      this.field_10822 = var1.readDouble();
      this.field_10821 = var1.readByte();
      this.field_10823 = var1.readByte();
      this.field_10820 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_10818);
      var1.writeDouble(this.field_10825);
      var1.writeDouble(this.field_10824);
      var1.writeDouble(this.field_10822);
      var1.writeByte(this.field_10821);
      var1.writeByte(this.field_10823);
      var1.writeBoolean(this.field_10820);
   }

   public void method_10087(class_392 var1) {
      var1.method_1933(this);
   }

   public int method_10082() {
      return this.field_10818;
   }

   public double method_10084() {
      return this.field_10825;
   }

   public double method_10085() {
      return this.field_10824;
   }

   public double method_10081() {
      return this.field_10822;
   }

   public byte method_10088() {
      return this.field_10821;
   }

   public byte method_10086() {
      return this.field_10823;
   }

   public boolean method_10089() {
      return this.field_10820;
   }
}
