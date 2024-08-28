package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import mapped.Class5554;
import mapped.Class5594;
import mapped.Class9567;
import mapped.Minecraft;

public class Class8696 {
   private static String[] field39247;
   private int field39248 = 0;
   private int field39249 = 0;
   private int field39250 = 0;
   private int field39251 = 0;
   private boolean field39252 = false;
   private long field39253 = System.currentTimeMillis();
   private float field39254 = 1.0F;
   private Minecraft field39255 = Minecraft.getInstance();

   public void method31323() {
      Client.getInstance().getEventManager().register(this);
   }

   @EventTarget
   private void method31324(Class4428 var1) {
      this.field39248++;
      this.field39249++;
      this.field39250++;
      this.field39251++;
      if (!this.field39255.field1339.field5036) {
         this.field39249 = 0;
      }

      if (this.field39255.field1355 != null) {
         this.field39248 = 0;
      }

      if (!Class9567.method37087()) {
         this.field39250 = 0;
         this.field39252 = true;
      }

      if (this.field39255.field1339.field5055 <= 1) {
         this.field39252 = false;
      }
   }

   @EventTarget
   private void method31325(Class4402 var1) {
      if (var1.method13932() instanceof Class5594) {
         this.field39251 = 0;
      }
   }

   @EventTarget
   private void method31326(Class4396 var1) {
      if (var1.method13898() instanceof Class5554) {
         long var4 = System.currentTimeMillis() - this.field39253;
         this.field39254 = Math.min(1.05F, Math.max(0.0F, 15000.0F / (float)var4));
         this.field39253 = System.currentTimeMillis();
      }
   }

   public float method31327() {
      return this.field39254;
   }

   public float method31328() {
      return this.method31327() * 20.0F;
   }

   public int method31329() {
      return this.field39249;
   }

   public boolean method31330() {
      return this.field39252;
   }

   public int method31331() {
      return this.field39249;
   }

   public int method31332() {
      return this.field39248;
   }

   public int method31333() {
      return this.field39251;
   }

   public void method31334() {
      this.field39249 = 0;
      this.field39248 = 0;
   }
}
