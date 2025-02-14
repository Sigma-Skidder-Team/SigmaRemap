package com.mentalfrostbyte.jello.util.tracker;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import net.minecraft.network.play.server.SSetSlotPacket;

import java.util.Date;
import java.util.HashMap;

public class SlotChangeTracker {
   private HashMap<Integer, Date> field41141 = new HashMap<Integer, Date>();

   public void init() {
      Client.getInstance().eventManager.register(this);
   }

   @EventTarget
   private void method33237(ReceivePacketEvent var1) {
      if (var1.getPacket() instanceof SSetSlotPacket) {
         SSetSlotPacket var4 = (SSetSlotPacket) var1.getPacket();
         if (var4.method17303() != 0) {
            return;
         }

         this.field41141.put(var4.method17304(), new Date());
      }
   }

   public long method33238(int var1) {
      if (var1 != -1) {
         if (this.field41141.containsKey(var1)) {
            long var4 = System.currentTimeMillis();
            return var4 - this.field41141.get(var1).getTime();
         } else {
            return 2147483647L;
         }
      } else {
         return 0L;
      }
   }
}
