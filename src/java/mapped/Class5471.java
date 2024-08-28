package mapped;

import java.io.IOException;

public class Class5471 implements Packet<IServerPlayNetHandler> {
   private static String[] field24281;
   private float field24282;
   private float field24283;
   private boolean field24284;
   private boolean field24285;

   public Class5471() {
   }

   public Class5471(float var1, float var2, boolean var3, boolean var4) {
      this.field24282 = var1;
      this.field24283 = var2;
      this.field24284 = var3;
      this.field24285 = var4;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      int var2 = 345771719;
      this.field24282 = var1.readFloat();
      this.field24283 = var1.readFloat();
      byte var4 = var1.readByte();
      Class5471 var10000 = this;

      do {
         if ((var2 & 512) != 0) {
            var10000.field24284 = false;
            var10000 = this;
         }
      } while ((var2 & 32768) != 0);

      var10000.field24285 = false;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeFloat(this.field24282);
      var1.writeFloat(this.field24283);
      byte var4 = 0;
      if (this.field24284) {
         var4 = (byte)(var4 | 1);
      }

      if (this.field24285) {
         var4 = (byte)(var4 | 2);
      }

      var1.writeByte(var4);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15626(this);
   }

   public float method17199() {
      return this.field24282;
   }

   public float method17200() {
      return this.field24283;
   }

   public boolean method17201() {
      return this.field24284;
   }

   public boolean method17202() {
      return this.field24285;
   }
}
