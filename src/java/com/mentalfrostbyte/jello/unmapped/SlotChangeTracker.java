package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.client.Minecraft;

import java.util.Date;
import java.util.HashMap;

public class SlotChangeTracker {
   private static String[] field41139;
   private Minecraft field41140 = Minecraft.getInstance();
   private HashMap<Integer, Date> field41141 = new HashMap<Integer, Date>();

   public void method33236() {
      Client.getInstance().getEventManager().register(this);
   }

   @EventTarget
   private void method33237(RecievePacketEvent var1) {
      if (var1.getPacket() instanceof SSetSlotPacket) {
         SSetSlotPacket var4 = (SSetSlotPacket)var1.getPacket();
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
