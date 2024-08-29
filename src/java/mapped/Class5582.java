package mapped;

import java.io.IOException;
import java.util.UUID;

public class Class5582 implements Packet<Class5116> {
   private static String[] field24759;
   private int field24760;
   private UUID field24761;
   private int field24762;
   private double field24763;
   private double field24764;
   private double field24765;
   private int field24766;
   private int field24767;
   private int field24768;
   private byte field24769;
   private byte field24770;
   private byte field24771;

   public Class5582() {
   }

   public Class5582(Class880 var1) {
      this.field24760 = var1.method3205();
      this.field24761 = var1.getUniqueID();
      this.field24762 = Registry.ENTITY_TYPE.method9171(var1.getType());
      this.field24763 = var1.getPosX();
      this.field24764 = var1.getPosY();
      this.field24765 = var1.getPosZ();
      this.field24769 = (byte)((int)(var1.rotationYaw * 256.0F / 360.0F));
      this.field24770 = (byte)((int)(var1.rotationPitch * 256.0F / 360.0F));
      this.field24771 = (byte)((int)(var1.field4967 * 256.0F / 360.0F));
      double var4 = 3.9;
      Vector3d var6 = var1.method3433();
      double var7 = MathHelper.method37778(var6.field18048, -3.9, 3.9);
      double var9 = MathHelper.method37778(var6.field18049, -3.9, 3.9);
      double var11 = MathHelper.method37778(var6.field18050, -3.9, 3.9);
      this.field24766 = (int)(var7 * 8000.0);
      this.field24767 = (int)(var9 * 8000.0);
      this.field24768 = (int)(var11 * 8000.0);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24760 = var1.method35714();
      this.field24761 = var1.method35717();
      this.field24762 = var1.method35714();
      this.field24763 = var1.readDouble();
      this.field24764 = var1.readDouble();
      this.field24765 = var1.readDouble();
      this.field24769 = var1.readByte();
      this.field24770 = var1.readByte();
      this.field24771 = var1.readByte();
      this.field24766 = var1.readShort();
      this.field24767 = var1.readShort();
      this.field24768 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24760);
      var1.method35716(this.field24761);
      var1.writeVarInt(this.field24762);
      var1.writeDouble(this.field24763);
      var1.writeDouble(this.field24764);
      var1.writeDouble(this.field24765);
      var1.writeByte(this.field24769);
      var1.writeByte(this.field24770);
      var1.writeByte(this.field24771);
      var1.writeShort(this.field24766);
      var1.writeShort(this.field24767);
      var1.writeShort(this.field24768);
   }

   public void method17180(Class5116 var1) {
      var1.method15694(this);
   }

   public int method17535() {
      return this.field24760;
   }

   public UUID method17536() {
      return this.field24761;
   }

   public int method17537() {
      return this.field24762;
   }

   public double method17538() {
      return this.field24763;
   }

   public double method17539() {
      return this.field24764;
   }

   public double method17540() {
      return this.field24765;
   }

   public int method17541() {
      return this.field24766;
   }

   public int method17542() {
      return this.field24767;
   }

   public int method17543() {
      return this.field24768;
   }

   public byte method17544() {
      return this.field24769;
   }

   public byte method17545() {
      return this.field24770;
   }

   public byte method17546() {
      return this.field24771;
   }
}
