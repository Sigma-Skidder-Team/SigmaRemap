package mapped;

import java.nio.ByteBuffer;

public class Class9244 {
   private static String[] field42533;
   private final ByteBuffer field42534;
   private final VertexFormat field42535;
   private TextureAtlasSprite[] field42536;

   public Class9244(ByteBuffer var1, VertexFormat var2, TextureAtlasSprite[] var3) {
      this(var1, var2);
      this.field42536 = var3;
   }

   private Class9244(ByteBuffer var1, VertexFormat var2) {
      this.field42534 = var1;
      this.field42535 = var2;
   }

   // $VF: synthetic method
   public static ByteBuffer method34764(Class9244 var0) {
      return var0.field42534;
   }

   // $VF: synthetic method
   public static VertexFormat method34765(Class9244 var0) {
      return var0.field42535;
   }

   // $VF: synthetic method
   public static TextureAtlasSprite[] method34766(Class9244 var0) {
      return var0.field42536;
   }
}
