package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class6167 extends Class6166 {
   public static final Codec<Class6167> field27592 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("min_size").forGetter(var0x -> var0x.field27593), Codec.INT.fieldOf("extra_size").forGetter(var0x -> var0x.field27594)
            )
            .apply(var0, Class6167::new)
   );
   private final int field27593;
   private final int field27594;

   public Class6167(int var1, int var2) {
      this.field27593 = var1;
      this.field27594 = var2;
   }

   @Override
   public Class9269<?> method19062() {
      return Class9269.field42640;
   }

   @Override
   public void method19061(Class1660 var1, BlockPos var2, BlockState var3, Random var4) {
      Mutable var7 = var2.method8354();
      int var8 = this.field27593 + var4.nextInt(var4.nextInt(this.field27594 + 1) + 1);

      for (int var9 = 0; var9 < var8; var9++) {
         var1.setBlockState(var7, var3, 2);
         var7.method8379(Direction.field673);
      }
   }
}
