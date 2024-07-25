package remapped;

import java.io.IOException;

public class CInputPacket implements Packet<class_1243> {
   private static String[] field_4111;
   private float field_4109;
   private float field_4110;
   private boolean field_4108;
   private boolean field_4107;

   public CInputPacket() {
   }

   public CInputPacket(float var1, float var2, boolean var3, boolean var4) {
      this.field_4109 = var1;
      this.field_4110 = var2;
      this.field_4108 = var3;
      this.field_4107 = var4;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      int var2 = 345771719;
      this.field_4109 = var1.readFloat();
      this.field_4110 = var1.readFloat();
      byte var4 = var1.readByte();
      CInputPacket var10000 = this;

      do {
         if ((var2 & 512) != 0) {
            var10000.field_4108 = false;
            var10000 = this;
         }
      } while ((var2 & 32768) != 0);

      var10000.field_4107 = false;
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeFloat(this.field_4109);
      var1.writeFloat(this.field_4110);
      byte var4 = 0;
      if (this.field_4108) {
         var4 = (byte)(var4 | 1);
      }

      if (this.field_4107) {
         var4 = (byte)(var4 | 2);
      }

      var1.writeByte(var4);
   }

   public void method_3431(class_1243 var1) {
      var1.method_5546(this);
   }

   public float method_3426() {
      return this.field_4109;
   }

   public float method_3427() {
      return this.field_4110;
   }

   public boolean method_3430() {
      return this.field_4108;
   }

   public boolean method_3428() {
      return this.field_4107;
   }
}
