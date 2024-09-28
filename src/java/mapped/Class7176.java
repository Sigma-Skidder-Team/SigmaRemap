package mapped;

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class7176 {
   public final int field30847;
   public final int field30848;
   public final int field30849;
   private final int field30850;
   public int field30851 = -1;
   public float field30852;
   public float field30853;
   public float field30854;
   public Class7176 field30855;
   public boolean field30856;
   public float field30857;
   public float field30858;
   public Class2163 field30859 = Class2163.field14184;

   public Class7176(int var1, int var2, int var3) {
      this.field30847 = var1;
      this.field30848 = var2;
      this.field30849 = var3;
      this.field30850 = method22526(var1, var2, var3);
   }

   public Class7176 method22525(int var1, int var2, int var3) {
      Class7176 var6 = new Class7176(var1, var2, var3);
      var6.field30851 = this.field30851;
      var6.field30852 = this.field30852;
      var6.field30853 = this.field30853;
      var6.field30854 = this.field30854;
      var6.field30855 = this.field30855;
      var6.field30856 = this.field30856;
      var6.field30857 = this.field30857;
      var6.field30858 = this.field30858;
      var6.field30859 = this.field30859;
      return var6;
   }

   public static int method22526(int var0, int var1, int var2) {
      return var1 & 0xFF | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 >= 0 ? 0 : Integer.MIN_VALUE) | (var2 >= 0 ? 0 : 32768);
   }

   public float method22527(Class7176 var1) {
      float var4 = (float)(var1.field30847 - this.field30847);
      float var5 = (float)(var1.field30848 - this.field30848);
      float var6 = (float)(var1.field30849 - this.field30849);
      return MathHelper.sqrt(var4 * var4 + var5 * var5 + var6 * var6);
   }

   public float method22528(Class7176 var1) {
      float var4 = (float)(var1.field30847 - this.field30847);
      float var5 = (float)(var1.field30848 - this.field30848);
      float var6 = (float)(var1.field30849 - this.field30849);
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public float method22529(Class7176 var1) {
      float var4 = (float)Math.abs(var1.field30847 - this.field30847);
      float var5 = (float)Math.abs(var1.field30848 - this.field30848);
      float var6 = (float)Math.abs(var1.field30849 - this.field30849);
      return var4 + var5 + var6;
   }

   public float method22530(BlockPos var1) {
      float var4 = (float)Math.abs(var1.getX() - this.field30847);
      float var5 = (float)Math.abs(var1.getY() - this.field30848);
      float var6 = (float)Math.abs(var1.getZ() - this.field30849);
      return var4 + var5 + var6;
   }

   public BlockPos method22531() {
      return new BlockPos(this.field30847, this.field30848, this.field30849);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class7176)) {
         return false;
      } else {
         Class7176 var4 = (Class7176)var1;
         return this.field30850 == var4.field30850
            && this.field30847 == var4.field30847
            && this.field30848 == var4.field30848
            && this.field30849 == var4.field30849;
      }
   }

   @Override
   public int hashCode() {
      return this.field30850;
   }

   public boolean method22532() {
      return this.field30851 >= 0;
   }

   @Override
   public String toString() {
      return "Node{x=" + this.field30847 + ", y=" + this.field30848 + ", z=" + this.field30849 + '}';
   }

   public static Class7176 method22533(PacketBuffer var0) {
      Class7176 var3 = new Class7176(var0.readInt(), var0.readInt(), var0.readInt());
      var3.field30857 = var0.readFloat();
      var3.field30858 = var0.readFloat();
      var3.field30856 = var0.readBoolean();
      var3.field30859 = Class2163.values()[var0.readInt()];
      var3.field30854 = var0.readFloat();
      return var3;
   }
}
