package net.minecraft.network.play.server;

import mapped.Class7529;
import mapped.Class7982;
import mapped.MapDecorationType;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;
import java.util.Collection;

public class SMapDataPacket implements Packet<IClientPlayNetHandler> {
   private int field24891;
   private byte field24892;
   private boolean field24893;
   private boolean field24894;
   private Class7982[] field24895;
   private int field24896;
   private int field24897;
   private int field24898;
   private int field24899;
   private byte[] field24900;

   public SMapDataPacket() {
   }

   public SMapDataPacket(int var1, byte var2, boolean var3, boolean var4, Collection<Class7982> var5, byte[] var6, int var7, int var8, int var9, int var10) {
      this.field24891 = var1;
      this.field24892 = var2;
      this.field24893 = var3;
      this.field24894 = var4;
      this.field24895 = var5.<Class7982>toArray(new Class7982[var5.size()]);
      this.field24896 = var7;
      this.field24897 = var8;
      this.field24898 = var9;
      this.field24899 = var10;
      this.field24900 = new byte[var9 * var10];

      for (int var13 = 0; var13 < var9; var13++) {
         for (int var14 = 0; var14 < var10; var14++) {
            this.field24900[var13 + var14 * var9] = var6[var7 + var13 + (var8 + var14) * 128];
         }
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24891 = var1.method35714();
      this.field24892 = var1.readByte();
      this.field24893 = var1.readBoolean();
      this.field24894 = var1.readBoolean();
      this.field24895 = new Class7982[var1.method35714()];

      for (int var4 = 0; var4 < this.field24895.length; var4++) {
         MapDecorationType var5 = var1.<MapDecorationType>method35712(MapDecorationType.class);
         this.field24895[var4] = new Class7982(
            var5, var1.readByte(), var1.readByte(), (byte)(var1.readByte() & 15), !var1.readBoolean() ? null : var1.method35710()
         );
      }

      this.field24898 = var1.readUnsignedByte();
      if (this.field24898 > 0) {
         this.field24899 = var1.readUnsignedByte();
         this.field24896 = var1.readUnsignedByte();
         this.field24897 = var1.readUnsignedByte();
         this.field24900 = var1.method35699();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24891);
      var1.writeByte(this.field24892);
      var1.writeBoolean(this.field24893);
      var1.writeBoolean(this.field24894);
      var1.writeVarInt(this.field24895.length);

      for (Class7982 var7 : this.field24895) {
         var1.method35713(var7.method27126());
         var1.writeByte(var7.method27127());
         var1.writeByte(var7.method27128());
         var1.writeByte(var7.method27129() & 15);
         if (var7.method27131() == null) {
            var1.writeBoolean(false);
         } else {
            var1.writeBoolean(true);
            var1.method35711(var7.method27131());
         }
      }

      var1.writeByte(this.field24898);
      if (this.field24898 > 0) {
         var1.writeByte(this.field24899);
         var1.writeByte(this.field24896);
         var1.writeByte(this.field24897);
         var1.method35698(this.field24900);
      }
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleMaps(this);
   }

   public int method17634() {
      return this.field24891;
   }

   public void method17635(Class7529 var1) {
      var1.field32321 = this.field24892;
      var1.field32319 = this.field24893;
      var1.field32323 = this.field24894;
      var1.field32327.clear();

      for (int var4 = 0; var4 < this.field24895.length; var4++) {
         Class7982 var5 = this.field24895[var4];
         var1.field32327.put("icon-" + var4, var5);
      }

      for (int var6 = 0; var6 < this.field24898; var6++) {
         for (int var7 = 0; var7 < this.field24899; var7++) {
            var1.field32322[this.field24896 + var6 + (this.field24897 + var7) * 128] = this.field24900[var6 + var7 * this.field24898];
         }
      }
   }
}
