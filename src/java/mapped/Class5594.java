package mapped;

import java.io.IOException;

public class Class5594 implements Packet<Class5110> {
   private static String[] field24817;
   private int field24818;
   private int field24819;
   private int field24820;
   private short field24821;
   private Class8848 field24822 = Class8848.field39973;
   private Class2259 field24823;

   public Class5594() {
   }

   public Class5594(int var1, int var2, int var3, Class2259 var4, Class8848 var5, short var6) {
      this.field24818 = var1;
      this.field24819 = var2;
      this.field24820 = var3;
      this.field24822 = var5.method32126();
      this.field24821 = var6;
      this.field24823 = var4;
   }

   public void method17180(Class5110 var1) {
      var1.method15616(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24818 = var1.readByte();
      this.field24819 = var1.readShort();
      this.field24820 = var1.readByte();
      this.field24821 = var1.readShort();
      this.field24823 = var1.<Class2259>method35712(Class2259.class);
      this.field24822 = var1.method35726();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24818);
      var1.writeShort(this.field24819);
      var1.writeByte(this.field24820);
      var1.writeShort(this.field24821);
      var1.method35713(this.field24823);
      var1.method35724(this.field24822);
   }

   public int method17579() {
      return this.field24818;
   }

   public int method17580() {
      return this.field24819;
   }

   public int method17581() {
      return this.field24820;
   }

   public short method17582() {
      return this.field24821;
   }

   public Class8848 method17583() {
      return this.field24822;
   }

   public Class2259 method17584() {
      return this.field24823;
   }
}
