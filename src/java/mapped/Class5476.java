package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class5476 implements Packet<Class5116> {
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
      double var4 = this.field24323 != 0 ? method17230(method17229(var1.field18048) + (long)this.field24323) : var1.field18048;
      double var6 = this.field24324 != 0 ? method17230(method17229(var1.field18049) + (long)this.field24324) : var1.field18049;
      double var8 = this.field24325 != 0 ? method17230(method17229(var1.field18050) + (long)this.field24325) : var1.field18050;
      return new Vector3d(var4, var6, var8);
   }

   public static Vector3d method17232(long var0, long var2, long var4) {
      return new Vector3d((double)var0, (double)var2, (double)var4).method11344(2.4414062E-4F);
   }

   public Class5476() {
   }

   public Class5476(int var1) {
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

   public void method17180(Class5116 var1) {
      var1.method15727(this);
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
