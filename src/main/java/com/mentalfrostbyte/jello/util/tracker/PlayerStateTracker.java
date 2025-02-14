package com.mentalfrostbyte.jello.util.tracker;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import net.minecraft.network.play.server.SKeepAlivePacket;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.client.Minecraft;

public class PlayerStateTracker {
   private static String[] field39247;
   private int focusGameTicks = 0;
   private int groundTicks = 0;
   private int moveTicks = 0;
   private int field39251 = 0;
   private boolean alive = false;
   private long lastMilis = System.currentTimeMillis();
   private float ping = 1.0F;
   private Minecraft mc = Minecraft.getInstance();

   public void init() {
      Client.getInstance().eventManager.register(this);
   }

   @EventTarget
   private void method31324(TickEvent var1) {
      this.focusGameTicks++;
      this.groundTicks++;
      this.moveTicks++;
      this.field39251++;
      if (!this.mc.player.onGround) {
         this.groundTicks = 0;
      }

      if (this.mc.currentScreen != null) {
         this.focusGameTicks = 0;
      }

      if (!MovementUtil.isMoving()) {
         this.moveTicks = 0;
         this.alive = true;
      }

      if (this.mc.player.ticksExisted <= 1) {
         this.alive = false;
      }
   }

   @EventTarget
   private void method31325(SendPacketEvent var1) {
      if (var1.getPacket() instanceof CClickWindowPacket) {
         this.field39251 = 0;
      }
   }

   @EventTarget
   private void method31326(ReceivePacketEvent var1) {
      if (var1.getPacket() instanceof SKeepAlivePacket) {
         long var4 = System.currentTimeMillis() - this.lastMilis;
         this.ping = Math.min(1.05F, Math.max(0.0F, 15000.0F / (float) var4));
         this.lastMilis = System.currentTimeMillis();
      }
   }

   public float getPing() {
      return this.ping;
   }

   public float method31328() {
      return this.getPing() * 20.0F;
   }

   public int getgroundTicks() {
      return this.groundTicks;
   }

   public boolean isalive() {
      return this.alive;
   }

   public int method31331() {
      return this.groundTicks;
   }

   public int focusGameTicks() {
      return this.focusGameTicks;
   }

   public int getMode() {
      return this.field39251;
   }

   public void method31334() {
      this.groundTicks = 0;
      this.focusGameTicks = 0;
   }
}
