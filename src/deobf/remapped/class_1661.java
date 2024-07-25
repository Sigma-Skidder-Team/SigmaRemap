package remapped;

import java.io.IOException;

public class class_1661 implements class_6310<class_392> {
   private static String[] field_8613;
   private int field_8614;
   private byte field_8615;
   private byte field_8611;
   private int field_8612;
   private byte field_8610;

   public class_1661() {
   }

   public class_1661(int var1, class_2250 var2) {
      this.field_8614 = var1;
      this.field_8615 = (byte)(class_1425.method_6536(var2.method_10339()) & 0xFF);
      this.field_8611 = (byte)(var2.method_10333() & 0xFF);
      if (var2.method_10347() <= 32767) {
         this.field_8612 = var2.method_10347();
      } else {
         this.field_8612 = 32767;
      }

      this.field_8610 = 0;
      if (var2.method_10338()) {
         this.field_8610 = (byte)(this.field_8610 | 1);
      }

      if (var2.method_10336()) {
         this.field_8610 = (byte)(this.field_8610 | 2);
      }

      if (var2.method_10342()) {
         this.field_8610 = (byte)(this.field_8610 | 4);
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_8614 = var1.method_37778();
      this.field_8615 = var1.readByte();
      this.field_8611 = var1.readByte();
      this.field_8612 = var1.method_37778();
      this.field_8610 = var1.readByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_8614);
      var1.writeByte(this.field_8615);
      var1.writeByte(this.field_8611);
      var1.method_37743(this.field_8612);
      var1.writeByte(this.field_8610);
   }

   public boolean method_7400() {
      return this.field_8612 == 32767;
   }

   public void method_7403(class_392 var1) {
      var1.method_1904(this);
   }

   public int method_7395() {
      return this.field_8614;
   }

   public byte method_7396() {
      return this.field_8615;
   }

   public byte method_7398() {
      return this.field_8611;
   }

   public int method_7404() {
      return this.field_8612;
   }

   public boolean method_7399() {
      return (this.field_8610 & 2) == 2;
   }

   public boolean method_7402() {
      return (this.field_8610 & 1) == 1;
   }

   public boolean method_7397() {
      return (this.field_8610 & 4) == 4;
   }
}
