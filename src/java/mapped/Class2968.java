package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.entity.EntityType;

import java.util.List;

public class Class2968 extends Class2967 {
   private static final List<Class6692> field18084 = ImmutableList.of(new Class6692(EntityType.field41067, 1, 1, 1));

   public Class2968(Codec<Class4700> var1) {
      super(var1, 0, true, true);
   }

   @Override
   public List<Class6692> method11374() {
      return field18084;
   }

   public boolean method11361(ChunkGenerator var1, Class1685 var2, long var3, Class2420 var5, int var6, int var7, Biome var8, Class7481 var9, Class4700 var10) {
      int var13 = var6 >> 4;
      int var14 = var7 >> 4;
      var5.setSeed((long)(var13 ^ var14 << 4) ^ var3);
      var5.nextInt();
      return var5.nextInt(5) == 0 ? !this.method11382(var1, var3, var5, var6, var7) : false;
   }

   private boolean method11382(ChunkGenerator var1, long var2, Class2420 var4, int var5, int var6) {
      Class8483 var9 = var1.method17822().method38381(Structure.field18073);
      if (var9 == null) {
         return false;
      } else {
         for (int var10 = var5 - 10; var10 <= var5 + 10; var10++) {
            for (int var11 = var6 - 10; var11 <= var6 + 10; var11++) {
               Class7481 var12 = Structure.field18073.method11370(var9, var2, var4, var10, var11);
               if (var10 == var12.field32174 && var11 == var12.field32175) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
