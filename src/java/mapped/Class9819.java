package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.List;

public class Class9819 {
   public TimerUtil field45877;
   public int field45878;
   public Entity field45879;
   public Minecraft field45880 = Minecraft.getInstance();

   public Class9819() {
      this.field45877 = new TimerUtil();
      Client.getInstance().getEventManager().register(this);
   }

   @EventTarget
   @Class5631
   public void method38763(Class4399 var1) {
      if (this.field45879 != null) {
         if (this.field45878 != 1) {
            if (this.field45878 == 2) {
               boolean var4 = ColorUtils.method17716();
               if (var4) {
                  Class6799 var5 = new Class6799();
                  var5.field29607 = true;
                  Entity var6 = null;

                  for (Entity var8 : ColorUtils.method17708()) {
                     if (var8 instanceof PlayerEntity
                        && var8 != this.field45880.player
                        && (var6 == null || var6.method3275(this.field45880.player) > var8.method3275(this.field45880.player))) {
                        var6 = var8;
                     }
                  }

                  this.field45880.getConnection().sendPacket(new Class5493(0, (short)-1, false));
                  this.field45880.getConnection().sendPacket(new Class5612(var5));
                  if (var6 != null) {
                     this.field45880.getConnection().sendPacket(new Class5497(var6.getUniqueID()));
                  }

                  this.field45880.getConnection().sendPacket(new Class5471(0.98F, 0.98F, false, false));
               }

               Thread var9 = new Thread(
                  () -> {
                     try {
                        Class8472 var4x = new Class8472(this.field45879.getPosX(), this.field45879.getPosY(), this.field45879.getPosZ());
                        Class8472 var5x = new Class8472(
                           this.field45880.player.getPosX(), this.field45880.player.getPosY(), this.field45880.player.getPosZ()
                        );
                        List<Class8472> var6x = Class8901.method32447(var5x, var4x);
                        Client.getInstance().getNotificationManager().post(new Notification("Teleport", "Successfully teleported !"));
                        Entity var7 = this.field45880.player.getRidingEntity();

                        for (Class8472 var9x : var6x) {
                           if (var7 != null) {
                              var7.positionVec.x = var9x.method29876() + 0.5;
                              var7.positionVec.y = var9x.method29877();
                              var7.positionVec.z = var9x.method29878() + 0.5;
                              this.field45880.getConnection().sendPacket(new Class5538(false, false));
                              this.field45880
                                 .getConnection()
                                 .sendPacket(new Class5606(this.field45880.player.rotationYaw, this.field45880.player.rotationPitch, false));
                              this.field45880.getConnection().sendPacket(new Class5471(0.0F, 1.0F, false, false));
                              BoatEntity var10 = new BoatEntity(
                                 this.field45880.world, var9x.method29876() + 0.5, var9x.method29877(), var9x.method29878() + 0.5
                              );
                              var10.rotationYaw = var7.rotationYaw;
                              var10.rotationPitch = var7.rotationPitch;
                              this.field45880.getConnection().sendPacket(new Class5483(var10));
                           } else if (var4) {
                              this.field45880.getConnection().sendPacket(new Class5605(var9x.method29876(), var9x.method29877(), var9x.method29878(), false));
                           } else {
                              this.field45880.getConnection().sendPacket(new Class5605(var9x.method29876(), var9x.method29877(), var9x.method29878(), true));
                           }
                        }

                        if (var4) {
                           this.field45880.getConnection().sendPacket(new Class5605(var4x.field36296, var4x.field36297, var4x.field36298, false));
                        }

                        this.field45880.player.setPosition(var4x.field36296, var4x.field36297, var4x.field36298);
                        this.field45879 = null;
                        if (var4) {
                           Class6799 var12 = new Class6799();
                           var12.field29607 = false;
                           this.field45880.getConnection().sendPacket(new Class5612(var12));
                        }
                     } catch (Exception var11) {
                        var11.printStackTrace();
                     }
                  }
               );
               var9.start();
               this.field45878 = 0;
            }
         } else {
            var1.method13900(true);
         }
      }
   }

   @EventTarget
   @Class5631
   public void method38764(Class4435 var1) {
      if (this.field45878 == 1) {
         var1.method13993(0.0);
         var1.method13995(0.0);
         var1.method13997(0.0);
         if (this.field45879 == null || !this.field45879.isAlive() || !ColorUtils.method17708().contains(this.field45879)) {
            Client.getInstance().getNotificationManager().post(new Notification("Teleport", "Target lost"));
            this.field45878 = 0;
            this.field45879 = null;
         } else if (!this.field45880.player.method3331()) {
            double var4 = this.field45879.getPosY() - this.field45879.lastTickPosY;
            if (var4 < -2.0 && ColorUtils.method17763(this.field45879) && this.field45879.getPosY() - this.field45880.player.getPosY() < -10.0) {
               this.field45878 = 0;
               this.field45879 = null;
               Client.getInstance().getNotificationManager().post(new Notification("Teleport", "Target seems to be falling in void"));
            }
         } else {
            this.field45878 = 0;
            this.field45879 = null;
            Client.getInstance().getNotificationManager().post(new Notification("Teleport", "Teleport canceled"));
         }

         if (this.field45877.method27121() > 7000L) {
            this.field45878 = 0;
            this.field45879 = null;
            Client.getInstance().getNotificationManager().post(new Notification("Teleport", "Failed teleport !"));
         }
      }
   }

   @EventTarget
   @Class5631
   public void method38765(RecievePacketEvent var1) {
      if (this.field45878 == 1) {
         if (var1.getPacket() instanceof Class5473) {
            this.field45878 = 2;
         }
      }
   }
}
