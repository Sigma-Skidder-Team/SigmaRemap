package mapped;

import net.minecraft.util.ResourceLocation;

public class Class6862 implements Class6861<MinecraftServer> {
   private static String[] field29788;
   private final ResourceLocation field29789;

   public Class6862(ResourceLocation var1) {
      this.field29789 = var1;
   }

   public void run(MinecraftServer var1, Class8559<MinecraftServer> var2, long var3) {
      Class7268 var7 = var1.method1397();
      ITag<Class7744> var8 = var7.method22830(this.field29789);

      for (Class7744 var10 : var8.method24918()) {
         var7.method22825(var10, var7.method22828());
      }
   }

   // $VF: synthetic method
   public static ResourceLocation method20909(Class6862 var0) {
      return var0.field29789;
   }
}
