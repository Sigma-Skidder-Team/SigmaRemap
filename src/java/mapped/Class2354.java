package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.ObjectIntIdentityMap;

import javax.annotation.Nullable;
import java.util.Iterator;

public class Class2354 implements Iterable<BlockState> {
   private static String[] field16163;
   public static final BlockState field16164 = Blocks.AIR.method11579();
   private final ObjectIntIdentityMap<BlockState> field16165 = new ObjectIntIdentityMap<BlockState>(16);
   private int field16166;

   public Class2354() {
   }

   public int method9281(BlockState var1) {
      int var4 = this.field16165.getId(var1);
      if (var4 == -1) {
         var4 = this.field16166++;
         this.field16165.method9268(var1, var4);
      }

      return var4;
   }

   @Nullable
   public BlockState method9282(int var1) {
      BlockState var4 = this.field16165.getByValue(var1);
      return var4 != null ? var4 : field16164;
   }

   @Override
   public Iterator<BlockState> iterator() {
      return this.field16165.iterator();
   }

   public void method9283(BlockState var1, int var2) {
      this.field16165.method9268(var1, var2);
   }
}
