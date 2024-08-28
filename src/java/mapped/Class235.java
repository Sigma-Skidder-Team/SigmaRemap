package mapped;

import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class Class235<T extends Class880, M extends Class2827<T> & Class2824> extends Class219<T, M> {
   private final float field881;
   private final float field882;
   private final float field883;

   public Class235(Class5714<T, M> var1) {
      this(var1, 1.0F, 1.0F, 1.0F);
   }

   public Class235(Class5714<T, M> var1, float var2, float var3, float var4) {
      super(var1);
      this.field881 = var2;
      this.field882 = var3;
      this.field883 = var4;
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.method2943(Class2106.field13736);
      if (!var13.method32105()) {
         Class3257 var14 = var13.method32107();
         var1.method35294();
         var1.method35292(this.field881, this.field882, this.field883);
         boolean var15 = var4 instanceof Class1042 || var4 instanceof Class1040;
         if (var4.method3005() && !(var4 instanceof Class1042)) {
            float var16 = 2.0F;
            float var17 = 1.4F;
            var1.method35291(0.0, 0.03125, 0.0);
            var1.method35292(0.7F, 0.7F, 0.7F);
            var1.method35291(0.0, 1.0, 0.0);
         }

         this.method825().method11012().method22682(var1);
         if (var14 instanceof Class3292 && ((Class3292)var14).method11845() instanceof Class3251) {
            float var21 = 1.1875F;
            var1.method35292(1.1875F, -1.1875F, -1.1875F);
            if (var15) {
               var1.method35291(0.0, 0.0625, 0.0);
            }

            GameProfile var22 = null;
            if (var13.method32141()) {
               Class39 var18 = var13.method32142();
               if (!var18.method119("SkullOwner", 10)) {
                  if (var18.method119("SkullOwner", 8)) {
                     String var19 = var18.method126("SkullOwner");
                     if (!StringUtils.isBlank(var19)) {
                        var22 = Class968.method4008(new GameProfile((UUID)null, var19));
                        var18.method99("SkullOwner", Class8354.method29279(new Class39(), var22));
                     }
                  }
               } else {
                  var22 = Class8354.method29278(var18.method130("SkullOwner"));
               }
            }

            var1.method35291(-0.5, 0.0, -0.5);
            Class5952.method18482((Direction)null, 180.0F, ((Class3251)((Class3292)var14).method11845()).method11696(), var22, var5, var1, var2, var3);
         } else if (!(var14 instanceof Class3279) || ((Class3279)var14).method11805() != Class2106.field13736) {
            float var20 = 0.625F;
            var1.method35291(0.0, -0.25, 0.0);
            var1.method35293(Class7680.field32900.method25286(180.0F));
            var1.method35292(0.625F, -0.625F, -0.625F);
            if (var15) {
               var1.method35291(0.0, 0.1875, 0.0);
            }

            Minecraft.getInstance().method1556().method37580(var4, var13, Class2327.field15929, false, var1, var2, var3);
         }

         var1.method35295();
      }
   }
}
