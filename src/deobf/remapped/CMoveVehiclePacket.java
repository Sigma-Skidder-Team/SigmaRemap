package remapped;

import java.io.IOException;

public class CMoveVehiclePacket implements Packet<class_1243> {
   private static String[] field_20184;
   private double field_20185;
   private double field_20182;
   private double field_20183;
   private float field_20186;
   private float field_20181;

   public CMoveVehiclePacket() {
   }

   public CMoveVehiclePacket(Entity var1) {
      this.field_20185 = var1.getPosX();
      this.field_20182 = var1.method_37309();
      this.field_20183 = var1.getPosZ();
      this.field_20186 = var1.rotationYaw;
      this.field_20181 = var1.rotationPitch;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_20185 = var1.readDouble();
      this.field_20182 = var1.readDouble();
      this.field_20183 = var1.readDouble();
      this.field_20186 = var1.readFloat();
      this.field_20181 = var1.readFloat();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeDouble(this.field_20185);
      var1.writeDouble(this.field_20182);
      var1.writeDouble(this.field_20183);
      var1.writeFloat(this.field_20186);
      var1.writeFloat(this.field_20181);
   }

   public void method_19263(class_1243 var1) {
      var1.method_5539(this);
   }

   public double method_19261() {
      return this.field_20185;
   }

   public double method_19258() {
      return this.field_20182;
   }

   public double method_19262() {
      return this.field_20183;
   }

   public float method_19257() {
      return this.field_20186;
   }

   public float method_19259() {
      return this.field_20181;
   }
}
