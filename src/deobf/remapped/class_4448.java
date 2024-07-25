package remapped;

import java.io.IOException;
import java.util.UUID;

public class class_4448 implements Packet<class_392> {
   private static String[] field_21686;
   private int field_21683;
   private UUID field_21681;
   private class_1331 field_21682;
   private Direction field_21685;
   private int field_21684;

   public class_4448() {
   }

   public class_4448(class_5490 var1) {
      this.field_21683 = var1.method_37145();
      this.field_21681 = var1.method_37328();
      this.field_21682 = var1.method_21469();
      this.field_21685 = var1.method_37365();
      this.field_21684 = class_8669.field_44450.method_14041(var1.field_27978);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_21683 = var1.method_37778();
      this.field_21681 = var1.method_37753();
      this.field_21684 = var1.method_37778();
      this.field_21682 = var1.method_37748();
      this.field_21685 = Direction.method_1040(var1.readUnsignedByte());
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_21683);
      var1.method_37746(this.field_21681);
      var1.method_37743(this.field_21684);
      var1.method_37770(this.field_21682);
      var1.writeByte(this.field_21685.method_1031());
   }

   public void method_20630(class_392 var1) {
      var1.method_1900(this);
   }

   public int method_20628() {
      return this.field_21683;
   }

   public UUID method_20624() {
      return this.field_21681;
   }

   public class_1331 method_20629() {
      return this.field_21682;
   }

   public Direction method_20626() {
      return this.field_21685;
   }

   public class_6933 method_20625() {
      return class_8669.field_44450.method_14040(this.field_21684);
   }
}
