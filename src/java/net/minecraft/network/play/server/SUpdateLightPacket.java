package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.util.List;

public class SUpdateLightPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24497;
   private int field24498;
   private int field24499;
   private int field24500;
   private int field24501;
   private int field24502;
   private int field24503;
   private List<byte[]> field24504;
   private List<byte[]> field24505;
   private boolean field24506;

   public SUpdateLightPacket() {
   }

   public SUpdateLightPacket(ChunkPos var1, Class196 var2, boolean var3) {
      this.field24498 = var1.x;
      this.field24499 = var1.z;
      this.field24506 = var3;
      this.field24504 = Lists.newArrayList();
      this.field24505 = Lists.newArrayList();

      for (int var6 = 0; var6 < 18; var6++) {
         Class6785 var7 = var2.method638(Class1977.field12881).method642(Class2002.method8391(var1, -1 + var6));
         Class6785 var8 = var2.method638(Class1977.field12882).method642(Class2002.method8391(var1, -1 + var6));
         if (var7 != null) {
            if (!var7.method20677()) {
               this.field24500 |= 1 << var6;
               this.field24504.add((byte[])var7.method20669().clone());
            } else {
               this.field24502 |= 1 << var6;
            }
         }

         if (var8 != null) {
            if (!var8.method20677()) {
               this.field24501 |= 1 << var6;
               this.field24505.add((byte[])var8.method20669().clone());
            } else {
               this.field24503 |= 1 << var6;
            }
         }
      }
   }

   public SUpdateLightPacket(ChunkPos var1, Class196 var2, int var3, int var4, boolean var5) {
      this.field24498 = var1.x;
      this.field24499 = var1.z;
      this.field24506 = var5;
      this.field24500 = var3;
      this.field24501 = var4;
      this.field24504 = Lists.newArrayList();
      this.field24505 = Lists.newArrayList();

      for (int var8 = 0; var8 < 18; var8++) {
         if ((this.field24500 & 1 << var8) != 0) {
            Class6785 var9 = var2.method638(Class1977.field12881).method642(Class2002.method8391(var1, -1 + var8));
            if (var9 != null && !var9.method20677()) {
               this.field24504.add((byte[])var9.method20669().clone());
            } else {
               this.field24500 &= ~(1 << var8);
               if (var9 != null) {
                  this.field24502 |= 1 << var8;
               }
            }
         }

         if ((this.field24501 & 1 << var8) != 0) {
            Class6785 var10 = var2.method638(Class1977.field12882).method642(Class2002.method8391(var1, -1 + var8));
            if (var10 != null && !var10.method20677()) {
               this.field24505.add((byte[])var10.method20669().clone());
            } else {
               this.field24501 &= ~(1 << var8);
               if (var10 != null) {
                  this.field24503 |= 1 << var8;
               }
            }
         }
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24498 = var1.readVarInt();
      this.field24499 = var1.readVarInt();
      this.field24506 = var1.readBoolean();
      this.field24500 = var1.readVarInt();
      this.field24501 = var1.readVarInt();
      this.field24502 = var1.readVarInt();
      this.field24503 = var1.readVarInt();
      this.field24504 = Lists.newArrayList();

      for (int var4 = 0; var4 < 18; var4++) {
         if ((this.field24500 & 1 << var4) != 0) {
            this.field24504.add(var1.method35700(2048));
         }
      }

      this.field24505 = Lists.newArrayList();

      for (int var5 = 0; var5 < 18; var5++) {
         if ((this.field24501 & 1 << var5) != 0) {
            this.field24505.add(var1.method35700(2048));
         }
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24498);
      var1.writeVarInt(this.field24499);
      var1.writeBoolean(this.field24506);
      var1.writeVarInt(this.field24500);
      var1.writeVarInt(this.field24501);
      var1.writeVarInt(this.field24502);
      var1.writeVarInt(this.field24503);

      for (byte[] var5 : this.field24504) {
         var1.writeByteArray(var5);
      }

      for (byte[] var7 : this.field24505) {
         var1.writeByteArray(var7);
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleUpdateLight(this);
   }

   public int method17360() {
      return this.field24498;
   }

   public int method17361() {
      return this.field24499;
   }

   public int method17362() {
      return this.field24500;
   }

   public int method17363() {
      return this.field24502;
   }

   public List<byte[]> method17364() {
      return this.field24504;
   }

   public int method17365() {
      return this.field24501;
   }

   public int method17366() {
      return this.field24503;
   }

   public List<byte[]> method17367() {
      return this.field24505;
   }

   public boolean method17368() {
      return this.field24506;
   }
}
