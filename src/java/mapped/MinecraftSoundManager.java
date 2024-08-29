package mapped;

import net.minecraft.util.math.BlockPos;

public class MinecraftSoundManager extends Class6338 {
   private static String[] field27866;

   public MinecraftSoundManager(Class9455 var1, Class2266 var2, float var3, float var4, BlockPos var5) {
      this(var1, var2, var3, var4, (double)var5.getX() + 0.5, (double)var5.getY() + 0.5, (double)var5.getZ() + 0.5);
   }

   public static MinecraftSoundManager playSoundWithCustomPitch(Class9455 var0, float var1) {
      return method19293(var0, var1, 0.25F);
   }

   public static MinecraftSoundManager method19293(Class9455 var0, float var1, float var2) {
      return new MinecraftSoundManager(var0.method36383(), Class2266.field14728, var2, var1, false, 0, Class2279.field14845, 0.0, 0.0, 0.0, true);
   }

   public static MinecraftSoundManager method19294(Class9455 var0) {
      return new MinecraftSoundManager(var0.method36383(), Class2266.field14729, 1.0F, 1.0F, false, 0, Class2279.field14845, 0.0, 0.0, 0.0, true);
   }

   public static MinecraftSoundManager method19295(Class9455 var0, double var1, double var3, double var5) {
      return new MinecraftSoundManager(var0, Class2266.field14730, 4.0F, 1.0F, false, 0, Class2279.field14846, var1, var3, var5);
   }

   public static MinecraftSoundManager method19296(Class9455 var0, float var1, float var2) {
      return new MinecraftSoundManager(var0.method36383(), Class2266.field14736, var2, var1, false, 0, Class2279.field14845, 0.0, 0.0, 0.0, true);
   }

   public static MinecraftSoundManager method19297(Class9455 var0) {
      return method19296(var0, 1.0F, 1.0F);
   }

   public static MinecraftSoundManager method19298(Class9455 var0, double var1, double var3, double var5) {
      return new MinecraftSoundManager(var0, Class2266.field14736, 1.0F, 1.0F, false, 0, Class2279.field14846, var1, var3, var5);
   }

   public MinecraftSoundManager(Class9455 var1, Class2266 var2, float var3, float var4, double var5, double var7, double var9) {
      this(var1, var2, var3, var4, false, 0, Class2279.field14846, var5, var7, var9);
   }

   private MinecraftSoundManager(Class9455 var1, Class2266 var2, float var3, float var4, boolean var5, int var6, Class2279 var7, double var8, double var10, double var12) {
      this(var1.method36383(), var2, var3, var4, var5, var6, var7, var8, var10, var12, false);
   }

   public MinecraftSoundManager(
           ResourceLocation var1, Class2266 var2, float var3, float var4, boolean var5, int var6, Class2279 var7, double var8, double var10, double var12, boolean var14
   ) {
      super(var1, var2);
      this.field27856 = var3;
      this.field27857 = var4;
      this.field27858 = var8;
      this.field27859 = var10;
      this.field27860 = var12;
      this.field27861 = var5;
      this.field27862 = var6;
      this.field27863 = var7;
      this.field27865 = var14;
   }
}
