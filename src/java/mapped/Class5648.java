package mapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;

public class Class5648 extends ChunkGenerator {
   public static final Codec<Class5648> field24998 = Class9733.field45443.fieldOf("settings").xmap(Class5648::new, Class5648::method17837).codec();
   private final Class9733 field24999;

   public Class5648(Class9733 var1) {
      super(new Class1688(var1.method38125()), new Class1688(var1.method38127()), var1.method38126(), 0L);
      this.field24999 = var1;
   }

   @Override
   public Codec<? extends ChunkGenerator> method17790() {
      return field24998;
   }

   @Override
   public ChunkGenerator method17791(long var1) {
      return this;
   }

   public Class9733 method17837() {
      return this.field24999;
   }

   @Override
   public void method17801(Class1691 var1, IChunk var2) {
   }

   @Override
   public int method17823() {
      BlockState[] var3 = this.field24999.method38130();

      for (int var4 = 0; var4 < var3.length; var4++) {
         BlockState var5 = var3[var4] != null ? var3[var4] : Blocks.AIR.method11579();
         if (!Class101.field299.method287().test(var5)) {
            return var4 - 1;
         }
      }

      return var3.length;
   }

   @Override
   public void method17803(Class1660 var1, Class7480 var2, IChunk var3) {
      BlockState[] var6 = this.field24999.method38130();
      Mutable var7 = new Mutable();
      Class7527 var8 = var3.method7070(Class101.field297);
      Class7527 var9 = var3.method7070(Class101.field295);

      for (int var10 = 0; var10 < var6.length; var10++) {
         BlockState var11 = var6[var10];
         if (var11 != null) {
            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  var3.setBlockState(var7.method8372(var12, var10, var13), var11, false);
                  var8.method24578(var12, var10, var13, var11);
                  var9.method24578(var12, var10, var13, var11);
               }
            }
         }
      }
   }

   @Override
   public int method17797(int var1, int var2, Class101 var3) {
      BlockState[] var6 = this.field24999.method38130();

      for (int var7 = var6.length - 1; var7 >= 0; var7--) {
         BlockState var8 = var6[var7];
         if (var8 != null && var3.method287().test(var8)) {
            return var7 + 1;
         }
      }

      return 0;
   }

   @Override
   public Class1665 method17798(int var1, int var2) {
      return new Class1669(
         Arrays.<BlockState>stream(this.field24999.method38130())
            .<BlockState>map(var0 -> (BlockState)(var0 != null ? var0 : Blocks.AIR.method11579()))
            .<BlockState>toArray(BlockState[]::new)
      );
   }
}
