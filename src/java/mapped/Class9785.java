package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;

import java.util.Set;
import java.util.function.Supplier;

public final class Class9785<T extends TileEntity> {
   private static String[] field45751;
   private final Supplier<? extends T> field45752;
   private final Set<Block> field45753;

   private Class9785(Supplier<? extends T> var1, Set<Block> var2) {
      this.field45752 = var1;
      this.field45753 = var2;
   }

   public static <T extends TileEntity> Class9785<T> method38569(Supplier<? extends T> var0, Block... var1) {
      return new Class9785<T>(var0, ImmutableSet.copyOf(var1));
   }

   public TileEntityType<T> method38570(Type<?> var1) {
      return new TileEntityType<T>(this.field45752, this.field45753, var1);
   }

   // $VF: synthetic method
   public static Set method38571(Class9785 var0) {
      return var0.field45753;
   }
}
