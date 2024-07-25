package remapped;

import java.io.IOException;

public class class_5955 implements Packet<class_1243> {
   private static String[] field_30352;
   private int field_30357;
   private int field_30355;
   private int field_30353;
   private short field_30358;
   private class_6098 field_30354 = class_6098.field_31203;
   private class_6269 field_30356;

   public class_5955() {
   }

   public class_5955(int var1, int var2, int var3, class_6269 var4, class_6098 var5, short var6) {
      this.field_30357 = var1;
      this.field_30355 = var2;
      this.field_30353 = var3;
      this.field_30354 = var5.method_27973();
      this.field_30358 = var6;
      this.field_30356 = var4;
   }

   public void method_27206(class_1243 var1) {
      var1.method_5549(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_30357 = var1.readByte();
      this.field_30355 = var1.readShort();
      this.field_30353 = var1.readByte();
      this.field_30358 = var1.readShort();
      this.field_30356 = var1.<class_6269>method_37787(class_6269.class);
      this.field_30354 = var1.method_37755();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_30357);
      var1.writeShort(this.field_30355);
      var1.writeByte(this.field_30353);
      var1.writeShort(this.field_30358);
      var1.method_37750(this.field_30356);
      var1.method_37764(this.field_30354);
   }

   public int method_27202() {
      return this.field_30357;
   }

   public int method_27201() {
      return this.field_30355;
   }

   public int method_27205() {
      return this.field_30353;
   }

   public short method_27203() {
      return this.field_30358;
   }

   public class_6098 method_27204() {
      return this.field_30354;
   }

   public class_6269 method_27207() {
      return this.field_30356;
   }
}
