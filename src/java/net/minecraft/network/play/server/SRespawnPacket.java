package net.minecraft.network.play.server;

import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.util.function.Supplier;

public class SRespawnPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24614;
   private DimensionType field24615;
   private RegistryKey<World> field24616;
   private long field24617;
   private Class1894 field24618;
   private Class1894 field24619;
   private boolean field24620;
   private boolean field24621;
   private boolean field24622;

   public SRespawnPacket() {
   }

   public SRespawnPacket(DimensionType var1, RegistryKey<World> var2, long var3, Class1894 var5, Class1894 var6, boolean var7, boolean var8, boolean var9) {
      this.field24615 = var1;
      this.field24616 = var2;
      this.field24617 = var3;
      this.field24618 = var5;
      this.field24619 = var6;
      this.field24620 = var7;
      this.field24621 = var8;
      this.field24622 = var9;
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleRespawn(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24615 = var1.<Supplier<DimensionType>>method35696(DimensionType.DIMENSION_TYPE_CODEC).get();
      this.field24616 = RegistryKey.<World>getOrCreateKey(Registry.WORLD_KEY, var1.method35731());
      this.field24617 = var1.readLong();
      this.field24618 = Class1894.method8159(var1.readUnsignedByte());
      this.field24619 = Class1894.method8159(var1.readUnsignedByte());
      this.field24620 = var1.readBoolean();
      this.field24621 = var1.readBoolean();
      this.field24622 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35697(DimensionType.DIMENSION_TYPE_CODEC, () -> this.field24615);
      var1.method35732(this.field24616.getLocation());
      var1.writeLong(this.field24617);
      var1.writeByte(this.field24618.method8152());
      var1.writeByte(this.field24619.method8152());
      var1.writeBoolean(this.field24620);
      var1.writeBoolean(this.field24621);
      var1.writeBoolean(this.field24622);
   }

   public DimensionType method17432() {
      return this.field24615;
   }

   public RegistryKey<World> method17433() {
      return this.field24616;
   }

   public long method17434() {
      return this.field24617;
   }

   public Class1894 method17435() {
      return this.field24618;
   }

   public Class1894 method17436() {
      return this.field24619;
   }

   public boolean method17437() {
      return this.field24620;
   }

   public boolean method17438() {
      return this.field24621;
   }

   public boolean method17439() {
      return this.field24622;
   }
}
