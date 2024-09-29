package mapped;

import net.minecraft.util.math.ChunkPos;

import java.util.Spliterators;
import java.util.function.Consumer;

public final class AbstractSpliterator extends Spliterators.AbstractSpliterator<ChunkPos> {
   private static String[] field35195;
   private ChunkPos field35196;
   public final ChunkPos field35197;
   public final ChunkPos field35198;
   public final int field35199;
   public final int field35200;

   public AbstractSpliterator(long var1, int var3, ChunkPos var4, ChunkPos var5, int var6, int var7) {
      super(var1, var3);
      this.field35197 = var4;
      this.field35198 = var5;
      this.field35199 = var6;
      this.field35200 = var7;
   }

   @Override
   public boolean tryAdvance(Consumer<? super ChunkPos> var1) {
      if (this.field35196 != null) {
         int var4 = this.field35196.x;
         int var5 = this.field35196.z;
         if (var4 != this.field35198.x) {
            this.field35196 = new ChunkPos(var4 + this.field35200, var5);
         } else {
            if (var5 == this.field35198.z) {
               return false;
            }

            this.field35196 = new ChunkPos(this.field35197.x, var5 + this.field35199);
         }
      } else {
         this.field35196 = this.field35197;
      }

      var1.accept(this.field35196);
      return true;
   }
}
