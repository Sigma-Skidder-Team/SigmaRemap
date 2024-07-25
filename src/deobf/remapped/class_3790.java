package remapped;

import java.util.UUID;

public class class_3790 extends class_1174 {
   private class_1730 field_18513 = class_1730.field_8923;
   private int field_18509 = -1;
   private int field_18514 = -1;
   private String field_18510;
   private UUID field_18511;
   private class_9200 field_18512;

   public class_3790(class_1455 var1) {
      super(var1);
   }

   public class_1730 method_17598() {
      return this.field_18513;
   }

   public void method_17599(class_1730 var1) {
      this.field_18513 = var1;
   }

   public int method_17604() {
      return this.field_18509;
   }

   public void method_17603(int var1) {
      class_412 var4 = class_412.method_2051(var1);
      this.field_18509 = var4.method_2056();
   }

   public int method_17597() {
      return this.field_18514;
   }

   public void method_17601(int var1) {
      class_412 var4 = class_412.method_2051(var1);
      this.field_18514 = var4.method_2056();
   }

   public String method_17602() {
      return this.field_18510;
   }

   public void method_17605(String var1) {
      this.field_18510 = var1;
   }

   public UUID method_17594() {
      return this.field_18511;
   }

   public void method_17595(UUID var1) {
      this.field_18511 = var1;
   }

   public class_9200 method_17596() {
      return this.field_18512;
   }

   public void method_17600(class_9200 var1) {
      this.field_18512 = var1;
   }

   @Override
   public String toString() {
      return "ProtocolInfo{state="
         + this.field_18513
         + ", protocolVersion="
         + this.field_18509
         + ", serverProtocolVersion="
         + this.field_18514
         + ", username='"
         + this.field_18510
         + '\''
         + ", uuid="
         + this.field_18511
         + '}';
   }
}
