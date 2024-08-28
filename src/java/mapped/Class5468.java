package mapped;

import java.io.IOException;

public class Class5468 implements Packet<Class5110> {
   private static String[] field24268;
   private BlockPos field24269;
   private int field24270;
   private boolean field24271;

   public Class5468() {
   }

   public Class5468(BlockPos var1, int var2, boolean var3) {
      this.field24269 = var1;
      this.field24270 = var2;
      this.field24271 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24269 = var1.method35707();
      this.field24270 = var1.method35714();
      this.field24271 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24269);
      var1.writeVarInt(this.field24270);
      var1.writeBoolean(this.field24271);
   }

   public void method17180(Class5110 var1) {
      var1.method15652(this);
   }

   public BlockPos method17189() {
      return this.field24269;
   }

   public int method17190() {
      return this.field24270;
   }

   public boolean method17191() {
      return this.field24271;
   }
}
