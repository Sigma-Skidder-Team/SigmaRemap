package mapped;

import net.minecraft.util.math.SectionPos;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

public final class Class8180 extends AbstractSpliterator<SectionPos> {
   private static String[] field35177;
   public final CubeCoordinateIterator field35178;
   public final int field35179;
   public final int field35180;
   public final int field35181;
   public final int field35182;
   public final int field35183;
   public final int field35184;

   public Class8180(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var3);
      this.field35179 = var4;
      this.field35180 = var5;
      this.field35181 = var6;
      this.field35182 = var7;
      this.field35183 = var8;
      this.field35184 = var9;
      this.field35178 = new CubeCoordinateIterator(this.field35179, this.field35180, this.field35181, this.field35182, this.field35183, this.field35184);
   }

   @Override
   public boolean tryAdvance(Consumer<? super SectionPos> var1) {
      if (!this.field35178.hasNext()) {
         return false;
      } else {
         var1.accept(new SectionPos(this.field35178.getX(), this.field35178.getY(), this.field35178.getZ()));
         return true;
      }
   }
}
