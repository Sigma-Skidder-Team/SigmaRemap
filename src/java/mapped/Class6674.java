package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;

public class Class6674 {
   private final BlockPos field29269;
   private final int field29270;
   private final int field29271;

   public Class6674(BlockPos var1, int var2, int var3) {
      this.field29269 = var1;
      this.field29270 = var2;
      this.field29271 = var3;
   }

   public static Class6674 method20349(CompoundNBT var0) {
      BlockPos var3 = Class8354.method29283(var0.getCompound("Pos"));
      int var4 = var0.getInt("Rotation");
      int var5 = var0.getInt("EntityId");
      return new Class6674(var3, var4, var5);
   }

   public CompoundNBT method20350() {
      CompoundNBT var3 = new CompoundNBT();
      var3.put("Pos", Class8354.method29284(this.field29269));
      var3.method102("Rotation", this.field29270);
      var3.method102("EntityId", this.field29271);
      return var3;
   }

   public BlockPos method20351() {
      return this.field29269;
   }

   public int method20352() {
      return this.field29270;
   }

   public int method20353() {
      return this.field29271;
   }

   public String method20354() {
      return method20355(this.field29269);
   }

   public static String method20355(BlockPos var0) {
      return "frame-" + var0.getX() + "," + var0.getY() + "," + var0.getZ();
   }
}
