package net.minecraft.network.play;

import com.mojang.authlib.GameProfile;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

import mapped.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.login.server.SDisconnectLoginPacket;
import net.minecraft.network.login.server.SEnableCompressionPacket;
import net.minecraft.network.login.server.SEncryptionRequestPacket;
import net.minecraft.network.login.server.SLoginSuccessPacket;
import net.minecraft.util.CryptException;
import net.minecraft.util.CryptManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerLoginNetHandler implements Class5108 {
   private static final AtomicInteger field23211 = new AtomicInteger(0);
   private static final Logger field23212 = LogManager.getLogger();
   private static final Random field23213 = new Random();
   private final byte[] field23214 = new byte[4];
   private final MinecraftServer field23215;
   public final NetworkManager field23216;
   private Class2241 field23217 = Class2241.field14662;
   private int field23218;
   private GameProfile field23219;
   private final String field23220 = "";
   private SecretKey field23221;
   private ServerPlayerEntity field23222;

   public ServerLoginNetHandler(MinecraftServer var1, NetworkManager var2) {
      this.field23215 = var1;
      this.field23216 = var2;
      field23213.nextBytes(this.field23214);
   }

   public void tick() {
      if (this.field23217 != Class2241.field14666) {
         if (this.field23217 == Class2241.field14667) {
            ServerPlayerEntity var3 = this.field23215.getPlayerList().method19489(this.field23219.getId());
            if (var3 == null) {
               this.field23217 = Class2241.field14666;
               this.field23215.getPlayerList().method19445(this.field23216, this.field23222);
               this.field23222 = null;
            }
         }
      } else {
         this.method15601();
      }

      if (this.field23218++ == 600) {
         this.method15600(new TranslationTextComponent("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public NetworkManager getNetworkManager() {
      return this.field23216;
   }

   public void method15600(ITextComponent var1) {
      try {
         field23212.info("Disconnecting {}: {}", this.method15602(), var1.getString());
         this.field23216.sendPacket(new SDisconnectLoginPacket(var1));
         this.field23216.closeChannel(var1);
      } catch (Exception var5) {
         field23212.error("Error whilst disconnecting player", var5);
      }
   }

   public void method15601() {
      if (!this.field23219.isComplete()) {
         this.field23219 = this.method15603(this.field23219);
      }

      ITextComponent var3 = this.field23215.getPlayerList().method19451(this.field23216.getRemoteAddress(), this.field23219);
      if (var3 == null) {
         this.field23217 = Class2241.field14668;
         if (this.field23215.getNetworkCompressionThreshold() >= 0 && !this.field23216.isLocalChannel()) {
            this.field23216.sendPacket(new SEnableCompressionPacket(this.field23215.getNetworkCompressionThreshold()), var1 -> this.field23216.setCompressionThreshold(this.field23215.getNetworkCompressionThreshold()));
         }

         this.field23216.sendPacket(new SLoginSuccessPacket(this.field23219));
         ServerPlayerEntity var4 = this.field23215.getPlayerList().method19489(this.field23219.getId());
         if (var4 == null) {
            this.field23215.getPlayerList().method19445(this.field23216, this.field23215.getPlayerList().method19452(this.field23219));
         } else {
            this.field23217 = Class2241.field14667;
            this.field23222 = this.field23215.getPlayerList().method19452(this.field23219);
         }
      } else {
         this.method15600(var3);
      }
   }

   @Override
   public void onDisconnect(ITextComponent var1) {
      field23212.info("{} lost connection: {}", this.method15602(), var1.getString());
   }

   public String method15602() {
      return this.field23219 == null ? String.valueOf(this.field23216.getRemoteAddress()) : this.field23219 + " (" + this.field23216.getRemoteAddress() + ")";
   }

   @Override
   public void method15596(CLoginStartPacket var1) {
      Validate.validState(this.field23217 == Class2241.field14662, "Unexpected hello packet", new Object[0]);
      this.field23219 = var1.method17302();
      if (this.field23215.method1350() && !this.field23216.isLocalChannel()) {
         this.field23217 = Class2241.field14663;
         this.field23216.sendPacket(new SEncryptionRequestPacket("", this.field23215.method1329().getPublic().getEncoded(), this.field23214));
      } else {
         this.field23217 = Class2241.field14666;
      }
   }

   @Override
   public void method15597(Class5569 var1) {
      Validate.validState(this.field23217 == Class2241.field14663, "Unexpected key packet", new Object[0]);
      PrivateKey var4 = this.field23215.method1329().getPrivate();

      String var7;
      try {
         if (!Arrays.equals(this.field23214, var1.method17496(var4))) {
            throw new IllegalStateException("Protocol error");
         }

         this.field23221 = var1.method17495(var4);
         Cipher var5 = CryptManager.method32746(2, this.field23221);
         Cipher var6 = CryptManager.method32746(1, this.field23221);
         var7 = new BigInteger(CryptManager.method32738("", this.field23215.method1329().getPublic(), this.field23221)).toString(16);
         this.field23217 = Class2241.field14664;
         this.field23216.func_244777_a(var5, var6);
      } catch (CryptException var8) {
         throw new IllegalStateException("Protocol error", var8);
      }

      Class365 var9 = new Class365(this, "ChatCommandExecutor Authenticator #" + field23211.incrementAndGet(), var7);
      var9.setUncaughtExceptionHandler(new Class6030(field23212));
      var9.start();
   }

   @Override
   public void method15598(Class5571 var1) {
      this.method15600(new TranslationTextComponent("multiplayer.disconnect.unexpected_query_response"));
   }

   public GameProfile method15603(GameProfile var1) {
      UUID var4 = PlayerEntity.method2961(var1.getName());
      return new GameProfile(var4, var1.getName());
   }

   // $VF: synthetic method
   public static GameProfile method15605(ServerLoginNetHandler var0) {
      return var0.field23219;
   }

   // $VF: synthetic method
   public static GameProfile method15606(ServerLoginNetHandler var0, GameProfile var1) {
      return var0.field23219 = var1;
   }

   // $VF: synthetic method
   public static MinecraftServer method15607(ServerLoginNetHandler var0) {
      return var0.field23215;
   }

   // $VF: synthetic method
   public static Logger method15608() {
      return field23212;
   }

   // $VF: synthetic method
   public static Class2241 method15609(ServerLoginNetHandler var0, Class2241 var1) {
      return var0.field23217 = var1;
   }
}
