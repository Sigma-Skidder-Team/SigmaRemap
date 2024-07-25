package remapped;

import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import java.io.File;
import javax.annotation.Nullable;

public class class_9298 extends AbstractClientPlayerEntity {
   public class_9298(ClientWorld var1, GameProfile var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_37221() {
      return false;
   }

   @Override
   public boolean method_3186() {
      class_753 var3 = MinecraftClient.getInstance().method_8614().method_4800(this.method_3247().getId());
      return true;
   }

   @Override
   public boolean method_44885() {
      return false;
   }

   @Nullable
   @Override
   public class_753 method_44881() {
      return this.field_49385;
   }

   @Override
   public boolean method_44880() {
      return false;
   }

   @Override
   public Identifier method_44889() {
      class_753 var3 = this.method_44881();
      return var3 != null ? var3.method_3402() : class_1512.method_6921(this.method_37328());
   }

   @Nullable
   @Override
   public Identifier method_44891() {
      class_753 var3 = this.method_44881();
      return var3 != null ? var3.method_3397() : null;
   }

   @Override
   public boolean method_44884() {
      return this.method_44881() != null;
   }

   @Nullable
   @Override
   public Identifier method_44883() {
      class_753 var3 = this.method_44881();
      return var3 != null ? var3.method_3413() : null;
   }

   public static class_9211 method_42784(Identifier var0, String var1) {
      TextureManager var4 = MinecraftClient.getInstance().getTextureManager();
      Object var5 = var4.method_35679(var0);
      if (var5 == null) {
         var5 = new class_9211(
            (File)null,
            String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", class_6660.method_30578(var1)),
            class_1512.method_6921(method_3249(var1)),
            true,
            (Runnable)null
         );
         var4.method_35682(var0, (class_8143)var5);
      }

      return (class_9211)var5;
   }

   public static Identifier method_42785(String var0) {
      return new Identifier("skins/" + Hashing.sha1().hashUnencodedChars(class_6660.method_30578(var0)));
   }

   @Override
   public String method_44874() {
      return class_1512.method_6923(this.method_37328());
   }

   @Override
   public float method_44876() {
      return 0.0F;
   }
}
