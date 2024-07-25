package remapped;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_619 extends class_8704 {
   private static final Logger field_3532 = LogManager.getLogger();

   public class_619(class_4497 var1, class_7522 var2, class_5645 var3) {
      super(var1, var2, var3, var1.method_39878().field_50097);
      class_9882 var6 = var1.method_39878();
      this.method_39961(var6.field_50116);
      super.method_39956((Boolean)var6.field_50098.get());
      this.method_2892();
      this.method_2888();
      this.method_2885();
      this.method_2893();
      this.method_2887();
      this.method_2886();
      this.method_2891();
      if (!this.method_39979().method_19921().exists()) {
         this.method_2890();
      }
   }

   @Override
   public void method_39956(boolean var1) {
      super.method_39956(var1);
      this.method_2889().method_20896(var1);
   }

   @Override
   public void method_39966(GameProfile var1) {
      super.method_39966(var1);
      this.method_2891();
   }

   @Override
   public void method_39989(GameProfile var1) {
      super.method_39989(var1);
      this.method_2891();
   }

   @Override
   public void method_39969() {
      this.method_2886();
   }

   private void method_2893() {
      try {
         this.method_39952().method_19922();
      } catch (IOException var4) {
         field_3532.warn("Failed to save ip banlist: ", var4);
      }
   }

   private void method_2888() {
      try {
         this.method_39988().method_19922();
      } catch (IOException var4) {
         field_3532.warn("Failed to save user banlist: ", var4);
      }
   }

   private void method_2885() {
      try {
         this.method_39952().method_19920();
      } catch (IOException var4) {
         field_3532.warn("Failed to load ip banlist: ", var4);
      }
   }

   private void method_2892() {
      try {
         this.method_39988().method_19920();
      } catch (IOException var4) {
         field_3532.warn("Failed to load user banlist: ", var4);
      }
   }

   private void method_2887() {
      try {
         this.method_39947().method_19920();
      } catch (Exception var4) {
         field_3532.warn("Failed to load operators list: ", var4);
      }
   }

   private void method_2891() {
      try {
         this.method_39947().method_19922();
      } catch (Exception var4) {
         field_3532.warn("Failed to save operators list: ", var4);
      }
   }

   private void method_2886() {
      try {
         this.method_39979().method_19920();
      } catch (Exception var4) {
         field_3532.warn("Failed to load white-list: ", var4);
      }
   }

   private void method_2890() {
      try {
         this.method_39979().method_19922();
      } catch (Exception var4) {
         field_3532.warn("Failed to save white-list: ", var4);
      }
   }

   @Override
   public boolean method_39959(GameProfile var1) {
      return !this.method_39997() || this.method_39962(var1) || this.method_39979().method_25718(var1);
   }

   public class_4497 method_2889() {
      return (class_4497)super.method_39974();
   }

   @Override
   public boolean method_39995(GameProfile var1) {
      return this.method_39947().method_36526(var1);
   }
}
