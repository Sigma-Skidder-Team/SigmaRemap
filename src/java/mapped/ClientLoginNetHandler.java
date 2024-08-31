package mapped;

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

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.login.IClientLoginNetHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.login.server.*;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.CryptException;
import net.minecraft.util.CryptManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientLoginNetHandler implements IClientLoginNetHandler {
   private static final Logger field23199 = LogManager.getLogger();
   private final Minecraft field23200;
   private final Screen field23201;
   private final Consumer<ITextComponent> field23202;
   private final NetworkManager field23203;
   private GameProfile field23204;

   public ClientLoginNetHandler(NetworkManager var1, Minecraft var2, Screen var3, Consumer<ITextComponent> var4) {
      this.field23203 = var1;
      this.field23200 = var2;
      this.field23201 = var3;
      this.field23202 = var4;
   }

   @Override
   public void handleEncryptionRequest(SEncryptionRequestPacket var1) {
      String var6;
      Cipher var7;
      Cipher var8;
      Class5569 var9;
      try {
         SecretKey var4 = CryptManager.method32736();
         PublicKey var5 = var1.getPublicKey();
         var6 = new BigInteger(CryptManager.method32738(var1.getServerId(), var5, var4)).toString(16);
         var7 = CryptManager.method32746(2, var4);
         var8 = CryptManager.method32746(1, var4);
         var9 = new Class5569(var4, var5, var1.getVerifyToken());
      } catch (CryptException var10) {
         throw new IllegalStateException("Protocol error", var10);
      }

      this.field23202.accept(new TranslationTextComponent("connect.authorizing"));
      Class6639.field29187.submit(() -> {
         ITextComponent var7x = this.method15585(var6);
         if (var7x != null) {
            if (this.field23200.getCurrentServerData() == null || !this.field23200.getCurrentServerData().isOnLAN()) {
               this.field23203.method30701(var7x);
               return;
            }

            field23199.warn(var7x.getString());
         }

         this.field23202.accept(new TranslationTextComponent("connect.encrypting"));
         this.field23203.method30694(var9, var3x -> this.field23203.method30705(var7, var8));
      });
   }

   @Nullable
   private ITextComponent method15585(String var1) {
      try {
         this.method15586().joinServer(this.field23200.getSession().getProfile(), this.field23200.getSession().getToken(), var1);
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

   private MinecraftSessionService method15586() {
      return this.field23200.getSessionService();
   }

   @Override
   public void handleLoginSuccess(SLoginSuccessPacket var1) {
      this.field23202.accept(new TranslationTextComponent("connect.joining"));
      this.field23204 = var1.getProfile();
      this.field23203.method30690(ProtocolType.field9902);
      this.field23203.setNetHandler(new ClientPlayNetHandler(this.field23200, this.field23201, this.field23203, this.field23204));
   }

   @Override
   public void method15588(ITextComponent var1) {
      if (this.field23201 != null && this.field23201 instanceof RealmsScreen) {
         this.field23200.displayGuiScreen(new Class801(this.field23201, DialogTexts.field30664, var1));
      } else {
         this.field23200.displayGuiScreen(new Class832(this.field23201, DialogTexts.field30664, var1));
      }
   }

   @Override
   public NetworkManager getNetworkManager() {
      return this.field23203;
   }

   @Override
   public void handleDisconnect(SDisconnectLoginPacket var1) {
      this.field23203.method30701(var1.getReason());
   }

   @Override
   public void handleEnableCompression(SEnableCompressionPacket var1) {
      if (!this.field23203.method30702()) {
         this.field23203.method30712(var1.getCompressionThreshold());
      }
   }

   @Override
   public void handleCustomPayloadLogin(SCustomPayloadLoginPacket var1) {
      this.field23202.accept(new TranslationTextComponent("connect.negotiating"));
      this.field23203.sendPacket(new Class5571(var1.getTransaction(), (PacketBuffer)null));
   }
}
