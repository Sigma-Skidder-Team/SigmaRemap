package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class Class8329 {
   private static String[] field35791;
   private short field35792;
   private short field35793;
   private short field35794;
   private boolean field35795 = false;
   private List<Class8721> field35796 = new ArrayList<Class8721>();
   public Minecraft field35797 = Minecraft.getInstance();

   public Class8329() {
      Client.getInstance().getEventManager().register(this);
   }

   @EventTarget
   @Class5631
   public void method29200(WorldLoadEvent var1) {
      this.field35796.clear();
      this.field35793 = this.field35794 = 0;
      this.field35795 = false;
   }

   @EventTarget
   @Class5631
   public void method29201(TickEvent var1) {
   }

   @EventTarget
   @Class5631
   public void method29202(SendPacketEvent var1) {
      if (!ColorUtils.method17720() && ColorUtils.method17718()) {
         Packet var4 = var1.method13932();
         if (!(var4 instanceof Class5594)) {
            if (var4 instanceof Class5493) {
               Class5493 var5 = (Class5493)var4;
               if (var5.method17275() == 0) {
                  int var6 = var5.method17276() - this.field35792;
                  if (var6 <= 0 && var6 >= -20) {
                  }
               }
            }
         } else {
            Class5594 var7 = (Class5594)var4;
            this.field35792 = var7.method17582();
         }
      }
   }

   @EventTarget
   @Class5631
   public void method29203(RecievePacketEvent var1) {
      if (!ColorUtils.method17720() && ColorUtils.method17718()) {
         Packet var4 = var1.getPacket();
         if (!(var4 instanceof Class5554) && var4 instanceof Class5542) {
            Class5542 var5 = (Class5542)var4;
         }
      }
   }
}
