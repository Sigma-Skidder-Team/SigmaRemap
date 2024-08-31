package net.minecraft.network.play.server;

import mapped.MathHelper;
import mapped.PacketBuffer;
import mapped.Vector3d;
import mapped.World;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;
import javax.annotation.Nullable;

public class SEntityPacket implements Packet<IClientPlayNetHandler> {
   public int field24322;
   public short field24323;
   public short field24324;
   public short field24325;
   public byte field24326;
   public byte field24327;
   public boolean field24328;
   public boolean field24329;
   public boolean field24330;

   public static long method17229(double var0) {
      return MathHelper.method37770(var0 * 4096.0);
   }

   public static double method17230(long var0) {
      return (double)var0 / 4096.0;
   }

   public Vector3d method17231(Vector3d var1) {
      double var4 = this.field24323 != 0 ? method17230(method17229(var1.x) + (long)this.field24323) : var1.x;
      double var6 = this.field24324 != 0 ? method17230(method17229(var1.y) + (long)this.field24324) : var1.y;
      double var8 = this.field24325 != 0 ? method17230(method17229(var1.z) + (long)this.field24325) : var1.z;
      return new Vector3d(var4, var6, var8);
   }

   public static Vector3d method17232(long var0, long var2, long var4) {
      return new Vector3d((double)var0, (double)var2, (double)var4).method11344(2.4414062E-4F);
   }

   public SEntityPacket() {
   }

   public SEntityPacket(int var1) {
      this.field24322 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24322 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24322);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleEntityMovement(this);
   }

   @Override
   public String toString() {
      return "Entity_" + super.toString();
   }

   @Nullable
   public Entity method17233(World var1) {
      return var1.method6774(this.field24322);
   }

   public byte method17234() {
      return this.field24326;
   }

   public byte method17235() {
      return this.field24327;
   }

   public boolean method17236() {
      return this.field24329;
   }

   public boolean method17237() {
      return this.field24330;
   }

   public boolean method17238() {
      return this.field24328;
   }
}
