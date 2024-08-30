package com.mentalfrostbyte.jello.unmapped;

import com.google.gson.JsonObject;
import io.netty.channel.Channel;
import mapped.*;
import net.minecraft.client.Minecraft;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Class8005 implements Class8006<ClientPlayerEntity> {
   public static Channel field34416;
   public static Class5989 field34417 = Class8005.field34418;
   public static final Class5989 field34418 = Class5989.field26155;
   private Logger field34419;
   private Logger field34420;
   private Path field34421;
   private Class9026 field34422;
   private Class7040 field34423;
   private Class9144 field34424;
   private Class7289 field34425;
   private Class9313 field34426;
   private List<Class8410> field34427 = new ArrayList<Class8410>();

   public Class8005(Channel var1) {
      if (var1 != null) {
         field34416 = var1;
      }

      if (Class8042.method27614() != null) {
         Class8042.method27614().method34416();
      }

      this.field34425 = new Class7289();
      Class7777 var4 = new Class7777();
      this.field34422 = new Class9026();
      this.field34423 = new Class7040(new File("assets/viaversion/"));
      this.field34420 = new Class9280(this.field34419);
      this.field34426 = new Class9313();
      Class8042.method27610(Class9191.method34413().method38598(this).method38601(var4).method38600(new Class9212()).method38599(new Class6750()).method38602());
      Class8042.method27614().method34414();
      if (var1 != null) {
         this.field34424 = new Class9144(var1);
      }
   }

   public static int method27348() {
      return field34418.method18582();
   }

   public static int method27349() {
      return field34417 == null ? Class5989.field26129.method18582() : field34417.method18582();
   }

   @Override
   public String getClientName() {
      return "Jello";
   }

   @Override
   public String getType() {
      return "Unknown";
   }

   @Override
   public String getVersion() {
      return "1.0";
   }

   @Override
   public Class8411 method27353(Runnable var1) {
      return this.method27354(var1);
   }

   @Override
   public Class8411 method27354(Runnable var1) {
      return this.method27355(var1, 0L);
   }

   @Override
   public Class8411 method27355(Runnable var1, Long var2) {
      if (Minecraft.getInstance().world != null) {
         Class8410 var5 = new Class8410(this.field34425.method23045(this, var1).method32315(var2 * 50L, TimeUnit.MILLISECONDS).method32319());
         this.field34427.add(var5);
         return var5;
      } else {
         var1.run();
         return null;
      }
   }

   @Override
   public Class8411 method27356(Runnable var1, Long var2) {
      Class8410 var5 = new Class8410(this.field34425.method23045(this, var1).method32315(var2 * 50L, TimeUnit.MILLISECONDS).method32319());
      this.field34427.add(var5);
      return var5;
   }

   @Override
   public void method27357(Class8411 var1) {
      if (var1 instanceof Class8410) {
         ((Class8410)var1).method29528().method1901();
      }
   }

   @Override
   public Class9150[] method27358() {
      return null;
   }

   @Override
   public void method27359(UUID var1, String var2) {
   }

   @Override
   public boolean method27360(UUID var1, String var2) {
      return false;
   }

   @Override
   public boolean method27361() {
      return false;
   }

   @Override
   public Class7043 method27362() {
      return this.field34423;
   }

   @Override
   public void method27363() {
      for (Class8410 var4 : this.field34427) {
         var4.method29528().method1901();
      }
   }

   @Override
   public JsonObject method27364() {
      return new JsonObject();
   }

   @Override
   public boolean method27365() {
      return true;
   }

   @Override
   public Logger method27366() {
      return this.field34420;
   }

   @Override
   public Class9027<ClientPlayerEntity> method27367() {
      return this.field34422;
   }

   @Override
   public Class7041 method27368() {
      return this.field34423;
   }

   public void method27369() {
      try {
         this.field34425.method23046();
         field34416.close();
      } catch (InterruptedException var4) {
      }
   }

   @Override
   public File method27370() {
      return null;
   }

   @Override
   public Class9313 method27371() {
      return this.field34426;
   }

   public static Class5989 method27372() {
      return /*!Minecraft.getInstance().method1530() ? field34417 : field34418;*/ Class5989.field26129;
   }

   public Class9144 method27373() {
      return this.field34424;
   }
}
