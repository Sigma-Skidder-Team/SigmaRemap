package net.minecraft.world.chunk;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.network.PacketBuffer;

import java.util.function.Predicate;

public class ChunkSection {
   private static String[] field30367;
   private static final Class7833<BlockState> field30368 = new Class7836<BlockState>(Block.field18610, Blocks.AIR.method11579());
   private final int field30369;
   private short field30370;
   private short field30371;
   private short field30372;
   private final Class8556<BlockState> field30373;
   public static final ThreadLocal<Class8870> field30374 = new ThreadLocal<Class8870>();

   public ChunkSection(int var1) {
      this(var1, (short)0, (short)0, (short)0);
   }

   public ChunkSection(int var1, short var2, short var3, short var4) {
      this.field30369 = var1;
      this.field30370 = var2;
      this.field30371 = var3;
      this.field30372 = var4;
      this.field30373 = new Class8556<BlockState>(
         field30368, Block.field18610, Class8354::method29285, Class8354::method29287, Blocks.AIR.method11579()
      );
   }

   public BlockState method21852(int var1, int var2, int var3) {
      return this.field30373.method30498(var1, var2, var3);
   }

   public FluidState method21853(int var1, int var2, int var3) {
      return this.field30373.method30498(var1, var2, var3).method23449();
   }

   public void method21854() {
      this.field30373.method30490();
   }

   public void method21855() {
      this.field30373.method30491();
   }

   public BlockState method21856(int var1, int var2, int var3, BlockState var4) {
      return this.method21857(var1, var2, var3, var4, true);
   }

   public BlockState method21857(int var1, int var2, int var3, BlockState var4, boolean var5) {
      BlockState var8;
      if (!var5) {
         var8 = this.field30373.method30495(var1, var2, var3, var4);
      } else {
         var8 = this.field30373.method30494(var1, var2, var3, var4);
      }

      FluidState var9 = var8.method23449();
      FluidState var10 = var4.method23449();
      if (!var8.isAir()) {
         this.field30370--;
         if (var8.method23450()) {
            this.field30371--;
         }
      }

      if (!var9.method23474()) {
         this.field30372--;
      }

      if (!var4.isAir()) {
         this.field30370++;
         if (var4.method23450()) {
            this.field30371++;
         }
      }

      if (!var10.method23474()) {
         this.field30372++;
      }

      return var8;
   }

   public boolean method21858() {
      return this.field30370 == 0;
   }

   public static boolean method21859(ChunkSection var0) {
      return var0 == Chunk.field9111 || var0.method21858();
   }

   public boolean method21860() {
      return this.method21861() || this.method21862();
   }

   public boolean method21861() {
      return this.field30371 > 0;
   }

   public boolean method21862() {
      return this.field30372 > 0;
   }

   public int getYLocation() {
      return this.field30369;
   }

   public void method21864() {
      Class8870 var3 = field30374.get();
      if (var3 != null) {
         Class8889[] var4 = var3.method32269();
         if (var4 != null) {
            int var5 = this.field30369 >> 4;
            if (var5 >= 0 && var5 < var4.length) {
               Class8889 var6 = var4[var5];
               if (var6 != null) {
                  this.field30370 = var6.method32354();
                  this.field30371 = var6.method32355();
                  this.field30372 = var6.method32356();
                  var4[var5] = null;
                  return;
               }
            }
         }
      }

      this.field30370 = 0;
      this.field30371 = 0;
      this.field30372 = 0;
      this.field30373.method30506((var1, var2) -> {
         FluidState var5x = var1.method23449();
         if (!var1.isAir()) {
            this.field30370 = (short)(this.field30370 + var2);
            if (var1.method23450()) {
               this.field30371 = (short)(this.field30371 + var2);
            }
         }

         if (!var5x.method23474()) {
            this.field30370 = (short)(this.field30370 + var2);
            if (var5x.method23481()) {
               this.field30372 = (short)(this.field30372 + var2);
            }
         }
      });
   }

   public Class8556<BlockState> method21865() {
      return this.field30373;
   }

   public void method21866(PacketBuffer var1) {
      this.field30370 = var1.readShort();
      this.field30373.method30500(var1);
   }

   public void method21867(PacketBuffer var1) {
      var1.writeShort(this.field30370);
      this.field30373.method30501(var1);
   }

   public int method21868() {
      return 2 + this.field30373.method30504();
   }

   public boolean method21869(Predicate<BlockState> var1) {
      return this.field30373.method30505(var1);
   }

   public short method21870() {
      return this.field30370;
   }

   public short method21871() {
      return this.field30371;
   }

   public short method21872() {
      return this.field30372;
   }
}
