package com.mentalfrostbyte.jello.viaversion.commands;

import com.mentalfrostbyte.jello.viaversion.managers.ResourceManager;
import mapped.*;

public class CommandRegistrar implements Class9213 {
   private static String[] field42399;

   @Override
   public void method34519() {
      ViaVersion3.getInstance().method34424().method31083(Class5410.class, new Class5411());
      ViaVersion3.getInstance().method34424().method31083(Class5415.class, new Class5416());
      ViaVersion3.getInstance().method34424().method31083(Class5417.class, new Class5418());
      ViaVersion3.getInstance().method34424().method31083(Class5404.class, new Class5405());
      ViaVersion3.getInstance().method34424().method31083(Class5408.class, new Class5409());
      int var3 = ((ResourceManager) ViaVersion3.method27613().getResourceManager()).setVelocityPingInterval();
      if (var3 > 0) {
         ViaVersion3.method27613().scheduleTaskImmediately(new Class512(), (long)var3 * 20L);
      }
   }

   @Override
   public void method34520() {
   }
}
