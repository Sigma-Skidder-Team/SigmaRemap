package remapped;

import com.mojang.authlib.GameProfile;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3194 implements class_7515 {
   private static final AtomicInteger field_15961 = new AtomicInteger(0);
   private static final Logger field_15957 = LogManager.getLogger();
   private static final Random field_15952 = new Random();
   private final byte[] field_15958 = new byte[4];
   private final class_341 field_15953;
   public final class_5121 field_15951;
   private class_8527 field_15960 = class_8527.field_43635;
   private int field_15956;
   private GameProfile field_15955;
   private final String field_15954 = "";
   private SecretKey field_15949;
   private class_9359 field_15959;

   public class_3194(class_341 var1, class_5121 var2) {
      this.field_15953 = var1;
      this.field_15951 = var2;
      field_15952.nextBytes(this.field_15958);
   }

   public void method_14702() {
      if (this.field_15960 != class_8527.field_43636) {
         if (this.field_15960 == class_8527.field_43631) {
            class_9359 var3 = this.field_15953.method_1600().method_39982(this.field_15955.getId());
            if (var3 == null) {
               this.field_15960 = class_8527.field_43636;
               this.field_15953.method_1600().method_39954(this.field_15951, this.field_15959);
               this.field_15959 = null;
            }
         }
      } else {
         this.method_14696();
      }

      if (this.field_15956++ == 600) {
         this.method_14703(new TranslationTextComponent("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public class_5121 method_9091() {
      return this.field_15951;
   }

   public void method_14703(ITextComponent var1) {
      try {
         field_15957.info("Disconnecting {}: {}", this.method_14697(), var1.getString());
         this.field_15951.method_23485(new class_2261(var1));
         this.field_15951.method_23482(var1);
      } catch (Exception var5) {
         field_15957.error("Error whilst disconnecting player", var5);
      }
   }

   public void method_14696() {
      if (!this.field_15955.isComplete()) {
         this.field_15955 = this.method_14694(this.field_15955);
      }

      ITextComponent var3 = this.field_15953.method_1600().method_39948(this.field_15951.method_23494(), this.field_15955);
      if (var3 == null) {
         this.field_15960 = class_8527.field_43633;
         if (this.field_15953.method_1611() >= 0 && !this.field_15951.method_23500()) {
            this.field_15951
               .method_23486(new class_8433(this.field_15953.method_1611()), var1 -> this.field_15951.method_23504(this.field_15953.method_1611()));
         }

         this.field_15951.method_23485(new class_1490(this.field_15955));
         class_9359 var4 = this.field_15953.method_1600().method_39982(this.field_15955.getId());
         if (var4 == null) {
            this.field_15953.method_1600().method_39954(this.field_15951, this.field_15953.method_1600().method_40000(this.field_15955));
         } else {
            this.field_15960 = class_8527.field_43631;
            this.field_15959 = this.field_15953.method_1600().method_40000(this.field_15955);
         }
      } else {
         this.method_14703(var3);
      }
   }

   @Override
   public void method_9090(ITextComponent var1) {
      field_15957.info("{} lost connection: {}", this.method_14697(), var1.getString());
   }

   public String method_14697() {
      return this.field_15955 == null ? String.valueOf(this.field_15951.method_23494()) : this.field_15955 + " (" + this.field_15951.method_23494() + ")";
   }

   @Override
   public void method_34255(class_4014 var1) {
      Validate.validState(this.field_15960 == class_8527.field_43635, "Unexpected hello packet", new Object[0]);
      this.field_15955 = var1.method_18495();
      if (this.field_15953.method_1657() && !this.field_15951.method_23500()) {
         this.field_15960 = class_8527.field_43630;
         this.field_15951.method_23485(new class_5992("", this.field_15953.method_1710().getPublic().getEncoded(), this.field_15958));
      } else {
         this.field_15960 = class_8527.field_43636;
      }
   }

   @Override
   public void method_34256(class_2717 var1) {
      Validate.validState(this.field_15960 == class_8527.field_43630, "Unexpected key packet", new Object[0]);
      PrivateKey var4 = this.field_15953.method_1710().getPrivate();

      String var7;
      try {
         if (!Arrays.equals(this.field_15958, var1.method_12238(var4))) {
            throw new IllegalStateException("Protocol error");
         }

         this.field_15949 = var1.method_12237(var4);
         Cipher var5 = class_6531.method_29732(2, this.field_15949);
         Cipher var6 = class_6531.method_29732(1, this.field_15949);
         var7 = new BigInteger(class_6531.method_29725("", this.field_15953.method_1710().getPublic(), this.field_15949)).toString(16);
         this.field_15960 = class_8527.field_43634;
         this.field_15951.method_23488(var5, var6);
      } catch (class_9647 var8) {
         throw new IllegalStateException("Protocol error", var8);
      }

      class_7439 var9 = new class_7439(this, "User Authenticator #" + field_15961.incrementAndGet(), var7);
      var9.setUncaughtExceptionHandler(new class_447(field_15957));
      var9.start();
   }

   @Override
   public void method_34254(class_4362 var1) {
      this.method_14703(new TranslationTextComponent("multiplayer.disconnect.unexpected_query_response"));
   }

   public GameProfile method_14694(GameProfile var1) {
      UUID var4 = PlayerEntity.method_3249(var1.getName());
      return new GameProfile(var4, var1.getName());
   }
}
