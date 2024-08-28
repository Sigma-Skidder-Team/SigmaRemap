package mapped;

import java.io.IOException;
import java.util.UUID;

public class Class5596 implements Packet<Class5116> {
   private static String[] field24832;
   private int field24833;
   private UUID field24834;
   private double field24835;
   private double field24836;
   private double field24837;
   private byte field24838;
   private byte field24839;

   public Class5596() {
   }

   public Class5596(PlayerEntity var1) {
      this.field24833 = var1.method3205();
      this.field24834 = var1.getGameProfile().getId();
      this.field24835 = var1.getPosX();
      this.field24836 = var1.getPosY();
      this.field24837 = var1.getPosZ();
      this.field24838 = (byte)((int)(var1.field5031 * 256.0F / 360.0F));
      this.field24839 = (byte)((int)(var1.field5032 * 256.0F / 360.0F));
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24833 = var1.method35714();
      this.field24834 = var1.method35717();
      this.field24835 = var1.readDouble();
      this.field24836 = var1.readDouble();
      this.field24837 = var1.readDouble();
      this.field24838 = var1.readByte();
      this.field24839 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24833);
      var1.method35716(this.field24834);
      var1.writeDouble(this.field24835);
      var1.writeDouble(this.field24836);
      var1.writeDouble(this.field24837);
      var1.writeByte(this.field24838);
      var1.writeByte(this.field24839);
   }

   public void method17180(Class5116 var1) {
      var1.method15697(this);
   }

   public int method17592() {
      return this.field24833;
   }

   public UUID method17593() {
      return this.field24834;
   }

   public double method17594() {
      return this.field24835;
   }

   public double method17595() {
      return this.field24836;
   }

   public double method17596() {
      return this.field24837;
   }

   public byte method17597() {
      return this.field24838;
   }

   public byte method17598() {
      return this.field24839;
   }
}
