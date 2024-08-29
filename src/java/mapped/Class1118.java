package mapped;

import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;

import javax.annotation.Nullable;
import java.io.File;

public class Class1118 extends AbstractClientPlayerEntity {
   public Class1118(ClientWorld var1, GameProfile var2) {
      super(var1, var2);
   }

   @Override
   public boolean isSpectator() {
      return false;
   }

   @Override
   public boolean isCreative() {
      Class6589 var3 = Minecraft.getInstance().getConnection().method15792(this.getGameProfile().getId());
      return true;
   }

   @Override
   public boolean method5368() {
      return false;
   }

   @Nullable
   @Override
   public Class6589 method5369() {
      return this.field6096;
   }

   @Override
   public boolean method5370() {
      return false;
   }

   @Override
   public ResourceLocation method5371() {
      Class6589 var3 = this.method5369();
      return var3 != null ? var3.method19973() : Class7209.method22637(this.getUniqueID());
   }

   @Nullable
   @Override
   public ResourceLocation method5372() {
      Class6589 var3 = this.method5369();
      return var3 != null ? var3.method19974() : null;
   }

   @Override
   public boolean method5373() {
      return this.method5369() != null;
   }

   @Nullable
   @Override
   public ResourceLocation method5374() {
      Class6589 var3 = this.method5369();
      return var3 != null ? var3.method19975() : null;
   }

   public static Class294 method5375(ResourceLocation var0, String var1) {
      TextureManager var4 = Minecraft.getInstance().getTextureManager();
      Object var5 = var4.method1076(var0);
      if (var5 == null) {
         var5 = new Class294(
            (File)null,
            String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", Class9001.method33255(var1)),
            Class7209.method22637(method2961(var1)),
            true,
            (Runnable)null
         );
         var4.method1073(var0, (Class290)var5);
      }

      return (Class294)var5;
   }

   public static ResourceLocation method5376(String var0) {
      return new ResourceLocation("skins/" + Hashing.sha1().hashUnencodedChars(Class9001.method33255(var0)));
   }

   @Override
   public String method5377() {
      return Class7209.method22638(this.getUniqueID());
   }

   @Override
   public float method5378() {
      return 0.0F;
   }
}
