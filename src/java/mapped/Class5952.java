package mapped;

import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;

import java.util.Map;

public class Class5952 extends Class5942<SkullTileEntity> {
   private static final Map<Class2137, Class2844> field25952 = Util.<Map<Class2137, Class2844>>make(Maps.newHashMap(), var0 -> {
      Class2844 var3 = new Class2844(0, 0, 64, 32);
      Class2845 var4 = new Class2845();
      Class2846 var5 = new Class2846(0.0F);
      var0.put(Class2136.field13989, var3);
      var0.put(Class2136.field13990, var3);
      var0.put(Class2136.field13991, var4);
      var0.put(Class2136.field13992, var4);
      var0.put(Class2136.field13993, var3);
      var0.put(Class2136.field13994, var5);
   });
   private static final Map<Class2137, ResourceLocation> field25953 = Util.<Map<Class2137, ResourceLocation>>make(Maps.newHashMap(), var0 -> {
      var0.put(Class2136.field13989, new ResourceLocation("textures/entity/skeleton/skeleton.png"));
      var0.put(Class2136.field13990, new ResourceLocation("textures/entity/skeleton/wither_skeleton.png"));
      var0.put(Class2136.field13992, new ResourceLocation("textures/entity/zombie/zombie.png"));
      var0.put(Class2136.field13993, new ResourceLocation("textures/entity/creeper/creeper.png"));
      var0.put(Class2136.field13994, new ResourceLocation("textures/entity/enderdragon/dragon.png"));
      var0.put(Class2136.field13991, Class7209.method22636());
   });

   public Class5952(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(SkullTileEntity var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      float var9 = var1.method4004(var2);
      BlockState var10 = var1.method3775();
      boolean var11 = var10.getBlock() instanceof Class3252;
      Direction var12 = !var11 ? null : var10.<Direction>method23463(Class3252.field18727);
      float var13 = 22.5F * (float)(!var11 ? var10.<Integer>method23463(Class3343.field18855) : (2 + var12.method534()) * 4);
      method18482(var12, var13, ((Class3251)var10.getBlock()).method11696(), var1.method4005(), var9, var3, var4, var5);
   }

   public static void method18482(Direction var0, float var1, Class2137 var2, GameProfile var3, float var4, MatrixStack var5, Class7733 var6, int var7) {
      Class2844 var10 = field25952.get(var2);
      var5.push();
      if (var0 != null) {
         float var11 = 0.25F;
         var5.translate((double)(0.5F - (float)var0.method539() * 0.25F), 0.25, (double)(0.5F - (float)var0.method541() * 0.25F));
      } else {
         var5.translate(0.5, 0.0, 0.5);
      }

      var5.method35292(-1.0F, -1.0F, 1.0F);
      Class5422 var12 = var6.method25597(method18483(var2, var3));
      var10.method11174(var4, var1, 0.0F);
      var10.method11016(var5, var12, var7, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var5.method35295();
   }

   private static RenderType method18483(Class2137 var0, GameProfile var1) {
      ResourceLocation var4 = field25953.get(var0);
      if (var0 == Class2136.field13991 && var1 != null) {
         Minecraft var5 = Minecraft.getInstance();
         Map var6 = var5.getSkinManager().method38347(var1);
         return !var6.containsKey(Type.SKIN)
            ? RenderType.getEntityCutoutNoCull(Class7209.method22637(PlayerEntity.method2960(var1)))
            : RenderType.method14318(var5.getSkinManager().method38344((MinecraftProfileTexture)var6.get(Type.SKIN), Type.SKIN));
      } else {
         return RenderType.method14314(var4);
      }
   }
}
