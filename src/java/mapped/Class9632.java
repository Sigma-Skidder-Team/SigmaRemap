package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

import java.util.function.Predicate;
import javax.annotation.Nullable;

public class Class9632 {
   private static String[] field45049;
   private final Class1662 field45050;
   private final BlockPos field45051;
   private final boolean field45052;
   private BlockState field45053;
   private TileEntity field45054;
   private boolean field45055;

   public Class9632(Class1662 var1, BlockPos var2, boolean var3) {
      this.field45050 = var1;
      this.field45051 = var2.method8353();
      this.field45052 = var3;
   }

   public BlockState method37548() {
      if (this.field45053 == null && (this.field45052 || this.field45050.method7017(this.field45051))) {
         this.field45053 = this.field45050.getBlockState(this.field45051);
      }

      return this.field45053;
   }

   @Nullable
   public TileEntity method37549() {
      if (this.field45054 == null && !this.field45055) {
         this.field45054 = this.field45050.getTileEntity(this.field45051);
         this.field45055 = true;
      }

      return this.field45054;
   }

   public Class1662 method37550() {
      return this.field45050;
   }

   public BlockPos method37551() {
      return this.field45051;
   }

   public static Predicate<Class9632> method37552(Predicate<BlockState> var0) {
      return var1 -> var1 != null && var0.test(var1.method37548());
   }
}
