package remapped;

import com.google.gson.JsonObject;
import io.netty.channel.Channel;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class class_3347 implements class_7642<ClientPlayerEntity> {
   public static Channel field_16511;
   public static class_412 field_16509 = class_3347.field_16514;
   public static final class_412 field_16514 = class_412.field_1732;
   private Logger field_16503;
   private Logger field_16506;
   private Path field_16504;
   private class_6729 field_16502;
   private class_6985 field_16513;
   private class_7215 field_16510;
   private class_8692 field_16505;
   private class_7918 field_16507;
   private List<class_4507> field_16508 = new ArrayList<class_4507>();

   public class_3347(Channel var1) {
      if (var1 != null) {
         field_16511 = var1;
      }

      if (class_3446.method_15883() != null) {
         class_3446.method_15883().method_33734();
      }

      this.field_16505 = new class_8692();
      class_2722 var4 = new class_2722();
      this.field_16502 = new class_6729();
      this.field_16513 = new class_6985(new File("assets/viaversion/"));
      this.field_16506 = new class_7779(this.field_16503);
      this.field_16507 = new class_7918();
      class_3446.method_15887(
         class_7405.method_33723().method_44855(this).method_44852(var4).method_44857(new class_7490()).method_44856(new class_9879()).method_44853()
      );
      class_3446.method_15883().method_33735();
      if (var1 != null) {
         this.field_16510 = new class_7215(var1);
      }
   }

   public static int method_15346() {
      return field_16514.method_2055();
   }

   public static int method_15349() {
      return field_16509 == null ? class_412.field_1747.method_2055() : field_16509.method_2055();
   }

   @Override
   public String method_34620() {
      return "Jello";
   }

   @Override
   public String method_34616() {
      return "Unknown";
   }

   @Override
   public String method_34619() {
      return "1.0";
   }

   @Override
   public class_6536 method_34627(Runnable var1) {
      return this.method_34633(var1);
   }

   @Override
   public class_6536 method_34633(Runnable var1) {
      return this.method_34634(var1, 0L);
   }

   @Override
   public class_6536 method_34634(Runnable var1, Long var2) {
      if (MinecraftClient.getInstance().theWorld != null) {
         class_4507 var5 = new class_4507(this.field_16505.츚鶲뎫ꈍ쥡괠(this, var1).method_36944(var2 * 50L, TimeUnit.MILLISECONDS).method_36945());
         this.field_16508.add(var5);
         return var5;
      } else {
         var1.run();
         return null;
      }
   }

   @Override
   public class_6536 method_34631(Runnable var1, Long var2) {
      class_4507 var5 = new class_4507(this.field_16505.츚鶲뎫ꈍ쥡괠(this, var1).method_36944(var2 * 50L, TimeUnit.MILLISECONDS).method_36945());
      this.field_16508.add(var5);
      return var5;
   }

   @Override
   public void method_34625(class_6536 var1) {
      if (var1 instanceof class_4507) {
         ((class_4507)var1).method_20942().method_45180();
      }
   }

   @Override
   public class_7235[] method_34618() {
      return null;
   }

   @Override
   public void method_34624(UUID var1, String var2) {
   }

   @Override
   public boolean method_34637(UUID var1, String var2) {
      return false;
   }

   @Override
   public boolean method_34628() {
      return false;
   }

   @Override
   public class_5283 method_34621() {
      return this.field_16513;
   }

   @Override
   public void method_34622() {
      for (class_4507 var4 : this.field_16508) {
         var4.method_20942().method_45180();
      }
   }

   @Override
   public JsonObject method_34635() {
      return new JsonObject();
   }

   @Override
   public boolean method_34629() {
      return true;
   }

   @Override
   public Logger method_34617() {
      return this.field_16506;
   }

   @Override
   public class_8332<ClientPlayerEntity> method_34632() {
      return this.field_16502;
   }

   @Override
   public class_5714 method_34626() {
      return this.field_16513;
   }

   public void method_15350() {
      try {
         this.field_16505.method_39920();
         field_16511.close();
      } catch (InterruptedException var4) {
      }
   }

   @Override
   public File method_34623() {
      return null;
   }

   @Override
   public class_7918 method_34636() {
      return this.field_16507;
   }

   public static class_412 method_15348() {
      return !MinecraftClient.getInstance().method_8520() ? field_16509 : field_16514;
   }

   public class_7215 method_15347() {
      return this.field_16510;
   }
}
