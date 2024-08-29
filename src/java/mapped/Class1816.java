package mapped;

public final class Class1816 implements AutoCloseable {
   private static String[] field9810;
   private final Class1806[] field9811;
   public final TextureAtlasSprite field9812;

   public Class1816(TextureAtlasSprite var1, Class9431 var2, int var3) {
      this.field9812 = var1;
      this.field9811 = new Class1806[var3 + 1];

      for (int var6 = 0; var6 < this.field9811.length; var6++) {
         int var7 = Class9431.method36204(var2) >> var6;
         int var8 = Class9431.method36205(var2) >> var6;
         if (this.field9811[var6] == null) {
            this.field9811[var6] = new Class1806(var7, var8, false);
         }
      }
   }

   private void method8058() {
      double var3 = 1.0
         - (double) TextureAtlasSprite.method7505(this.field9812) / (double) TextureAtlasSprite.method7507(this.field9812).method25816(TextureAtlasSprite.method7506(this.field9812));
      int var5 = TextureAtlasSprite.method7507(this.field9812).method25817(TextureAtlasSprite.method7506(this.field9812));
      int var6 = TextureAtlasSprite.method7507(this.field9812).method25812() != 0 ? TextureAtlasSprite.method7507(this.field9812).method25812() : this.field9812.method7467();
      int var7 = TextureAtlasSprite.method7507(this.field9812).method25817((TextureAtlasSprite.method7506(this.field9812) + 1) % var6);
      if (var5 != var7 && var7 >= 0 && var7 < this.field9812.method7467()) {
         for (int var8 = 0; var8 < this.field9811.length; var8++) {
            int var9 = Class9431.method36204(TextureAtlasSprite.method7508(this.field9812)) >> var8;
            int var10 = Class9431.method36205(TextureAtlasSprite.method7508(this.field9812)) >> var8;

            for (int var11 = 0; var11 < var10; var11++) {
               for (int var12 = 0; var12 < var9; var12++) {
                  int var13 = this.method8059(var5, var8, var12, var11);
                  int var14 = this.method8059(var7, var8, var12, var11);
                  int var15 = this.method8060(var3, var13 >> 16 & 0xFF, var14 >> 16 & 0xFF);
                  int var16 = this.method8060(var3, var13 >> 8 & 0xFF, var14 >> 8 & 0xFF);
                  int var17 = this.method8060(var3, var13 & 0xFF, var14 & 0xFF);
                  this.field9811[var8].method7890(var12, var11, var13 & 0xFF000000 | var15 << 16 | var16 << 8 | var17);
               }
            }
         }

         TextureAtlasSprite.method7509(this.field9812, 0, 0, this.field9811);
      }
   }

   private int method8059(int var1, int var2, int var3, int var4) {
      return this.field9812.field9327[var2]
         .method7889(
            var3 + (TextureAtlasSprite.method7510(this.field9812)[var1] * Class9431.method36204(TextureAtlasSprite.method7508(this.field9812)) >> var2),
            var4 + (TextureAtlasSprite.method7511(this.field9812)[var1] * Class9431.method36205(TextureAtlasSprite.method7508(this.field9812)) >> var2)
         );
   }

   private int method8060(double var1, int var3, int var4) {
      return (int)(var1 * (double)var3 + (1.0 - var1) * (double)var4);
   }

   @Override
   public void close() {
      for (Class1806 var6 : this.field9811) {
         if (var6 != null) {
            var6.close();
         }
      }
   }

   // $VF: synthetic method
   public static void method8061(Class1816 var0) {
      var0.method8058();
   }
}
