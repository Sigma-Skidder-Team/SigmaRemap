package mapped;

import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public interface IChunk extends Class1665, Class1671 {
   @Nullable
   BlockState setBlockState(BlockPos var1, BlockState var2, boolean var3);

   void method7062(BlockPos var1, TileEntity var2);

   void method7063(Entity var1);

   @Nullable
   default Class7038 method7064() {
      Class7038[] var3 = this.method7067();

      for (int var4 = var3.length - 1; var4 >= 0; var4--) {
         Class7038 var5 = var3[var4];
         if (!Class7038.method21859(var5)) {
            return var5;
         }
      }

      return null;
   }

   default int method7065() {
      Class7038 var3 = this.method7064();
      return var3 != null ? var3.method21863() : 0;
   }

   Set<BlockPos> method7066();

   Class7038[] method7067();

   Collection<Entry<Class101, Class7527>> method7068();

   void method7069(Class101 var1, long[] var2);

   Class7527 method7070(Class101 var1);

   int method7071(Class101 var1, int var2, int var3);

   Class7481 method7072();

   void method7073(long var1);

   Map<Structure<?>, Class5444<?>> method7074();

   void method7075(Map<Structure<?>, Class5444<?>> var1);

   default boolean method7076(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 >= 256) {
         var2 = 255;
      }

      for (int var5 = var1; var5 <= var2; var5 += 16) {
         if (!Class7038.method21859(this.method7067()[var5 >> 4])) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   Class1684 method7077();

   void method7078(boolean var1);

   boolean method7079();

   ChunkStatus method7080();

   void method7081(BlockPos var1);

   default void method7082(BlockPos var1) {
      LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", var1);
   }

   ShortList[] method7083();

   default void method7084(short var1, int var2) {
      method7094(this.method7083(), var2).add(var1);
   }

   default void method7085(CompoundNBT var1) {
      LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
   }

   @Nullable
   CompoundNBT method7086(BlockPos var1);

   @Nullable
   CompoundNBT method7087(BlockPos var1);

   Stream<BlockPos> method7088();

   Class6802<Block> method7089();

   Class6802<Fluid> method7090();

   Class8922 method7091();

   void method7092(long var1);

   long method7093();

   static ShortList method7094(ShortList[] var0, int var1) {
      if (var0[var1] == null) {
         var0[var1] = new ShortArrayList();
      }

      return var0[var1];
   }

   boolean method7095();

   void method7096(boolean var1);
}
