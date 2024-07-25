package remapped;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7762 extends class_341 {
   private static final Logger field_39350 = LogManager.getLogger();
   private final class_1893 field_39353;
   private boolean field_39352;
   private int field_39348 = -1;
   private class_1262 field_39345;
   private UUID field_39351;
   private long field_39355 = 0L;
   public class_6486 field_39347 = null;
   public class_1331 field_39349 = null;
   public class_9589 field_39354 = null;

   public class_7762(
      Thread var1,
      class_1893 var2,
      class_7522 var3,
      class_3676 var4,
      class_6354 var5,
      class_6298 var6,
      class_5684 var7,
      MinecraftSessionService var8,
      GameProfileRepository var9,
      class_5969 var10,
      class_3897 var11
   ) {
      super(var1, var3, var4, var7, var5, var2.method_8607(), var2.method_8496(), var6, var8, var9, var10, var11);
      this.method_1757(var2.method_8502().method_5366());
      this.method_1751(var2.method_8493());
      this.method_1744(256);
      this.method_1616(new class_6217(this, this.field_1342, this.field_1337));
      this.field_39353 = var2;
   }

   @Override
   public boolean method_1608() {
      field_39350.info("Starting integrated minecraft server version " + class_7665.method_34674().getName());
      this.method_1605(true);
      this.method_1667(true);
      this.method_1640(true);
      this.method_1653();
      if (class_7860.field_40158.method_3596() && !class_7860.method_35566(class_7860.field_40158, this)) {
         return false;
      } else {
         this.method_1738();
         this.method_1628(this.method_1674() + " - " + this.method_1601().method_25716());
         return !class_7860.field_39924.method_3596() ? true : class_7860.method_35566(class_7860.field_39924, this);
      }
   }

   @Override
   public void method_1658(BooleanSupplier var1) {
      this.method_35209();
      boolean var4 = this.field_39352;
      this.field_39352 = class_1893.method_8510().method_8614() != null && class_1893.method_8510().method_8564();
      class_3492 var5 = this.method_1704();
      if (!var4 && this.field_39352) {
         var5.method_16056("autoSave");
         field_39350.info("Saving and pausing game...");
         this.method_1600().method_39964();
         this.method_1635(false, false, false);
         var5.method_16054();
      }

      if (!this.field_39352) {
         super.method_1658(var1);
         int var6 = Math.max(2, this.field_39353.field_9577.field_45537 + -1);
         if (var6 != this.method_1600().method_39970()) {
            field_39350.info("Changing view distance to {}, from {}", var6, this.method_1600().method_39970());
            this.method_1600().method_39961(var6);
         }
      }
   }

   @Override
   public boolean method_1626() {
      return true;
   }

   @Override
   public boolean method_26284() {
      return true;
   }

   @Override
   public File method_1652() {
      return this.field_39353.field_9575;
   }

   @Override
   public boolean method_1718() {
      return false;
   }

   @Override
   public int method_1700() {
      return 0;
   }

   @Override
   public boolean method_1727() {
      return false;
   }

   @Override
   public void method_1677(class_159 var1) {
      this.field_39353.method_8555(var1);
   }

   @Override
   public class_159 method_1725(class_159 var1) {
      var1 = super.method_1725(var1);
      var1.method_629().method_29850("Type", "Integrated Server (map_client.txt)");
      var1.method_629()
         .method_29851("Is Modded", () -> this.method_1606().orElse("Probably not. Jar signature remains and both client + server brands are untouched."));
      return var1;
   }

   @Override
   public Optional<String> method_1606() {
      String var3 = class_6489.method_29605();
      if (var3.equals("vanilla")) {
         var3 = this.method_1728();
         if ("vanilla".equals(var3)) {
            return class_1893.class.getSigners() != null ? Optional.<String>empty() : Optional.<String>of("Very likely; Jar signature invalidated");
         } else {
            return Optional.<String>of("Definitely; Server brand changed to '" + var3 + "'");
         }
      } else {
         return Optional.<String>of("Definitely; Client brand changed to '" + var3 + "'");
      }
   }

   @Override
   public void method_19826(class_3320 var1) {
      super.method_19826(var1);
      var1.method_15252("snooper_partner", this.field_39353.method_8611().method_15249());
   }

   @Override
   public boolean method_1625(class_4666 var1, boolean var2, int var3) {
      try {
         this.method_1679().method_30822((InetAddress)null, var3);
         field_39350.info("Started serving on {}", var3);
         this.field_39348 = var3;
         this.field_39345 = new class_1262(this.method_1748(), var3 + "");
         this.field_39345.start();
         this.method_1600().method_39991(var1);
         this.method_1600().method_39946(var2);
         int var6 = this.method_1685(this.field_39353.field_9632.method_3247());
         this.field_39353.field_9632.method_27330(var6);

         for (class_9359 var8 : this.method_1600().method_39951()) {
            this.method_1631().method_2233(var8);
         }

         return true;
      } catch (IOException var9) {
         return false;
      }
   }

   @Override
   public void method_1651() {
      super.method_1651();
      if (this.field_39345 != null) {
         this.field_39345.interrupt();
         this.field_39345 = null;
      }
   }

   @Override
   public void method_1641(boolean var1) {
      if (!class_7860.field_40032.method_45472() || this.method_1692()) {
         this.method_34465(() -> {
            for (class_9359 var4 : Lists.newArrayList(this.method_1600().method_39951())) {
               if (!var4.method_37328().equals(this.field_39351)) {
                  this.method_1600().method_39973(var4);
               }
            }
         });
      }

      super.method_1641(var1);
      if (this.field_39345 != null) {
         this.field_39345.interrupt();
         this.field_39345 = null;
      }
   }

   @Override
   public boolean method_1624() {
      return this.field_39348 > -1;
   }

   @Override
   public int method_1650() {
      return this.field_39348;
   }

   @Override
   public void method_1716(class_4666 var1) {
      super.method_1716(var1);
      this.method_1600().method_39991(var1);
   }

   @Override
   public boolean method_1726() {
      return true;
   }

   @Override
   public int method_1675() {
      return 2;
   }

   @Override
   public int method_1620() {
      return 2;
   }

   public void method_35214(UUID var1) {
      this.field_39351 = var1;
   }

   @Override
   public boolean method_1610(GameProfile var1) {
      return var1.getName().equalsIgnoreCase(this.method_1674());
   }

   @Override
   public int method_1638(int var1) {
      return (int)(this.field_39353.field_9577.field_45475 * (float)var1);
   }

   @Override
   public boolean method_1709() {
      return this.field_39353.field_9577.field_45514;
   }

   private void method_35209() {
      for (class_6331 var4 : this.method_1719()) {
         this.method_35210(var4);
      }
   }

   private void method_35210(class_6331 var1) {
      if (!class_3111.method_14434()) {
         this.method_35212(var1);
      }

      if (!class_3111.method_14422()) {
         this.method_35213(var1);
      }

      if (this.field_39347 == var1 && this.field_39349 != null) {
         this.field_39354 = var1.method_43368(this.field_39349);
         this.field_39347 = null;
         this.field_39349 = null;
      }
   }

   public class_9589 method_35211(class_6486 var1, class_1331 var2) {
      this.field_39347 = var1;
      this.field_39349 = var2;
      return this.field_39354;
   }

   private void method_35213(class_6331 var1) {
      if (var1.method_29578(1.0F) > 0.0F || var1.method_29570()) {
         var1.method_28927(6000, 0, false, false);
      }
   }

   private void method_35212(class_6331 var1) {
      if (this.method_1602() == class_4666.field_22761) {
         long var4 = var1.method_29584();
         long var6 = var4 % 24000L;
         if (class_3111.method_14406()) {
            if (var6 <= 1000L) {
               var1.method_28970(var4 - var6 + 1001L);
            }

            if (var6 >= 11000L) {
               var1.method_28970(var4 - var6 + 24001L);
            }
         }

         if (class_3111.method_14367()) {
            if (var6 <= 14000L) {
               var1.method_28970(var4 - var6 + 14001L);
            }

            if (var6 >= 22000L) {
               var1.method_28970(var4 - var6 + 24000L + 14001L);
            }
         }
      }
   }

   @Override
   public boolean method_1635(boolean var1, boolean var2, boolean var3) {
      if (var1) {
         int var6 = this.method_1682();
         int var7 = this.field_39353.field_9577.field_45476;
         if ((long)var6 < this.field_39355 + (long)var7) {
            return false;
         }

         this.field_39355 = (long)var6;
      }

      return super.method_1635(var1, var2, var3);
   }
}
