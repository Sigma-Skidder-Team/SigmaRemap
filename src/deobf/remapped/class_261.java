package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_261 implements class_8886 {
   private static final Logger field_918 = LogManager.getLogger();
   private final MinecraftClient field_915;
   private final Screen field_917;
   private final Consumer<ITextComponent> field_914;
   private final class_5121 field_920;
   private GameProfile field_916;

   public class_261(class_5121 var1, MinecraftClient var2, Screen var3, Consumer<ITextComponent> var4) {
      this.field_920 = var1;
      this.field_915 = var2;
      this.field_917 = var3;
      this.field_914 = var4;
   }

   @Override
   public void method_40903(class_5992 var1) {
      String var6;
      Cipher var7;
      Cipher var8;
      class_2717 var9;
      try {
         SecretKey var4 = class_6531.method_29727();
         PublicKey var5 = var1.method_27376();
         var6 = new BigInteger(class_6531.method_29725(var1.method_27374(), var5, var4)).toString(16);
         var7 = class_6531.method_29732(2, var4);
         var8 = class_6531.method_29732(1, var4);
         var9 = new class_2717(var4, var5, var1.method_27372());
      } catch (class_9647 var10) {
         throw new IllegalStateException("Protocol error", var10);
      }

      this.field_914.accept(new TranslationTextComponent("connect.authorizing"));
      class_828.field_4363.submit(() -> {
         ITextComponent var7x = this.method_1137(var6);
         if (var7x != null) {
            if (this.field_915.method_8530() == null || !this.field_915.method_8530().method_11626()) {
               this.field_920.method_23482(var7x);
               return;
            }

            field_918.warn(var7x.getString());
         }

         this.field_914.accept(new TranslationTextComponent("connect.encrypting"));
         this.field_920.method_23486(var9, var3x -> this.field_920.method_23488(var7, var8));
      });
   }

   @Nullable
   private ITextComponent method_1137(String var1) {
      try {
         this.method_1135().joinServer(this.field_915.method_8502().method_5370(), this.field_915.method_8502().method_5365(), var1);
         return null;
      } catch (AuthenticationUnavailableException var5) {
         return new TranslationTextComponent("disconnect.loginFailedInfo", new TranslationTextComponent("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var6) {
         return new TranslationTextComponent("disconnect.loginFailedInfo", new TranslationTextComponent("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var7) {
         return new TranslationTextComponent("disconnect.loginFailedInfo", new TranslationTextComponent("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (AuthenticationException var8) {
         return new TranslationTextComponent("disconnect.loginFailedInfo", var8.getMessage());
      }
   }

   private MinecraftSessionService method_1135() {
      return this.field_915.method_8517();
   }

   @Override
   public void method_40901(class_1490 var1) {
      this.field_914.accept(new TranslationTextComponent("connect.joining"));
      this.field_916 = var1.method_6883();
      this.field_920.method_23501(class_5776.field_29176);
      this.field_920.method_23495(new class_1092(this.field_915, this.field_917, this.field_920, this.field_916));
   }

   @Override
   public void method_9090(ITextComponent var1) {
      if (this.field_917 != null && this.field_917 instanceof class_1094) {
         this.field_915.method_8609(new class_6185(this.field_917, class_1402.field_7627, var1));
      } else {
         this.field_915.method_8609(new class_7773(this.field_917, class_1402.field_7627, var1));
      }
   }

   @Override
   public class_5121 method_9091() {
      return this.field_920;
   }

   @Override
   public void method_40900(class_2261 var1) {
      this.field_920.method_23482(var1.method_10386());
   }

   @Override
   public void method_40904(class_8433 var1) {
      if (!this.field_920.method_23500()) {
         this.field_920.method_23504(var1.method_38799());
      }
   }

   @Override
   public void method_40902(class_6190 var1) {
      this.field_914.accept(new TranslationTextComponent("connect.negotiating"));
      this.field_920.method_23485(new class_4362(var1.method_28320(), (class_8248)null));
   }
}
