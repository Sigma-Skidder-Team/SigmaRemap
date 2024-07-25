package remapped;

import java.io.IOException;

public class class_3066 extends class_6926 {
   private long field_15073;
   private long field_15067;
   private long field_15072;
   private long field_15074;
   private int field_15066;
   private int field_15071;
   private int field_15070;
   private int field_15069;
   private int field_15068;

   public class_3066() {
      super("Apple Lossless Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_15073 = var1.method_27524(4);
      var1.method_27527(1L);
      this.field_15066 = var1.method_27531();
      this.field_15071 = var1.method_27531();
      this.field_15070 = var1.method_27531();
      this.field_15069 = var1.method_27531();
      this.field_15068 = var1.method_27531();
      var1.method_27527(2L);
      this.field_15067 = var1.method_27524(4);
      this.field_15072 = var1.method_27524(4);
      this.field_15074 = var1.method_27524(4);
   }

   public long method_14018() {
      return this.field_15073;
   }

   public int method_14017() {
      return this.field_15066;
   }

   public int method_14019() {
      return this.field_15071;
   }

   public int method_14014() {
      return this.field_15070;
   }

   public int method_14020() {
      return this.field_15069;
   }

   public int method_14015() {
      return this.field_15068;
   }

   public long method_14022() {
      return this.field_15067;
   }

   public long method_14016() {
      return this.field_15072;
   }

   public long method_14021() {
      return this.field_15074;
   }
}
