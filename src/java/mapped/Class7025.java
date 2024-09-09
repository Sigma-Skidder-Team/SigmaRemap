package mapped;

import com.mojang.datafixers.util.Either;

public class Class7025 implements Class7022 {
   public final int field30333;
   public final int field30334;
   public final int field30335;
   public final int field30336;
   public final Either field30337;
   public final Class1649 field30338;

   public Class7025(Class1649 var1, int var2, int var3, int var4, int var5, Either var6) {
      this.field30338 = var1;
      this.field30333 = var2;
      this.field30334 = var3;
      this.field30335 = var4;
      this.field30336 = var5;
      this.field30337 = var6;
   }

   @Override
   public String toString() {
      return "Unloaded "
         + new ChunkPos(this.field30333 + this.field30334 % (this.field30335 * 2 + 1), this.field30336 + this.field30334 / (this.field30335 * 2 + 1))
         + " "
         + ((Class7022)this.field30337.right().get()).toString();
   }
}
