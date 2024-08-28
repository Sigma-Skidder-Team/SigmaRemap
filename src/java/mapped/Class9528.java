package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class9528 {
   private float[] field44344;
   public final int field44345 = 3;
   private Module field44346;
   public Minecraft field44347 = Minecraft.getInstance();
   public boolean field44348;
   public HashMap<Entity, List<Class9629<Vector3d, Long>>> field44349 = new HashMap<Entity, List<Class9629<Vector3d, Long>>>();

   public Class9528(Module var1) {
      this.field44346 = var1;
      this.method36818();
   }

   public boolean method36813() {
      return this.field44348;
   }

   public void method36814(boolean var1) {
      this.field44348 = var1;
   }

   public void method36815(Entity var1, float var2, float var3) {
      if (this.field44346.method15974("Interact autoblock")) {
         Class8709 var6 = Class5628.method17714(
            !this.field44346.method15974("Raytrace") ? var1 : null, var2, var3, var0 -> true, (double)this.field44346.method15977("Range")
         );
         if (var6 != null) {
            this.field44347
               .getClientPlayNetHandler()
               .sendPacket(new CUseEntityPacket(var6.method31416(), Hand.field182, var6.method31419(), this.field44347.player.method3331()));
            this.field44347.getClientPlayNetHandler().sendPacket(new CUseEntityPacket(var6.method31416(), Hand.field182, this.field44347.player.method3331()));
         }
      }

      Class5628.method17733();
      this.method36814(true);
   }

   public void method36816() {
      Class5628.method17734();
      this.method36814(false);
   }

   public boolean method36817() {
      return !this.field44346.getStringSettingValueByName("Autoblock Mode").equals("None")
         && this.field44347.player.method3090().method32107() instanceof Class3267
         && !this.method36813();
   }

   public void method36818() {
      this.field44344 = new float[3];
      float var3 = 20.0F / this.field44346.method15977("Min CPS");
      float var4 = 20.0F / this.field44346.method15977("Max CPS");
      if (var3 > var4) {
         float var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      for (int var7 = 0; var7 < 3; var7++) {
         float var6 = var3 + (float)Math.random() * (var4 - var3);
         this.field44344[var7] = var6;
      }
   }

   public float method36819(int var1) {
      return var1 >= 0 && var1 < this.field44344.length ? this.field44344[var1] : -1.0F;
   }

   public boolean method36820(int var1) {
      int var4 = (int)this.method36819(0) - var1;
      boolean var5 = this.field44346.getStringSettingValueByName("Attack Mode").equals("Pre");
      if (!var5) {
         var4++;
      }

      if (this.field44347.player.method2973() > 1.26F && this.field44346.method15974("Cooldown")) {
         int var11 = !var5 ? 1 : 2;
         float var12 = this.field44347.player.method2973() - (float)this.field44347.player.field4958 - (float)var11;
         return var12 <= 0.0F && var12 > -1.0F;
      } else if (var4 != 2) {
         if (var4 < 2) {
            float var6 = this.method36819(0);
            float var7 = this.method36819(1);
            float var8 = this.method36819(1);
            int var9 = (int)(var7 + var6 - (float)((int)var6));
            if (var4 + var9 == 2) {
               return true;
            }

            if (var4 + var9 == 1) {
               float var10 = var6 + var7 + var8 - (float)((int)var6 + (int)var7 + (int)var8);
               return var10 < 1.0F;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public boolean method36821(int var1) {
      return var1 >= (int)this.field44344[0];
   }

   public void method36822() {
      float var3 = 20.0F / this.field44346.method15977("Min CPS");
      float var4 = 20.0F / this.field44346.method15977("Max CPS");
      if (var3 > var4) {
         float var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      float var8 = this.field44344[0] - (float)((int)this.field44344[0]);
      this.field44344[0] = this.field44344[1] + var8;

      for (int var6 = 1; var6 < 3; var6++) {
         float var7 = var3 + (float)Math.random() * (var4 - var3);
         this.field44344[1] = var7;
      }
   }

   public List<Class8012> method36823(float var1) {
      ArrayList var4 = new ArrayList();

      for (Entity var6 : Class5628.method17708()) {
         var4.add(new Class8012(var6));
      }

      Iterator var24 = var4.iterator();
      Class5325 var25 = (Class5325) Client.getInstance().getModuleManager().method14662(Class5344.class);
      float var7 = 150.0F;
      if (var25.method15996() && var25.getStringSettingValueByName("Type").equalsIgnoreCase("PingSpoof")) {
         var7 += var25.method16726().method15977("Lag");
      }

      while (var24.hasNext()) {
         Class8012 var8 = (Class8012)var24.next();
         Entity var9 = var8.method27397();
         if (var9 == this.field44347.player || var9 == Class5319.field23863) {
            var24.remove();
         } else if (Client.getInstance().getFriendManager().method26997(var9)) {
            var24.remove();
         } else if (!(var9 instanceof Class880)) {
            var24.remove();
         } else if (((Class880)var9).method3042() == 0.0F) {
            var24.remove();
         } else if (!this.field44347.player.method3026((Class880)var9)) {
            var24.remove();
         } else if (var9 instanceof Class1005) {
            var24.remove();
         } else if (!this.field44346.method15974("Players") && var9 instanceof PlayerEntity) {
            var24.remove();
         } else if (var9 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var9)) {
            var24.remove();
         } else if (!this.field44346.method15974("Invisible") && var9.method3342()) {
            var24.remove();
         } else if (!this.field44346.method15974("Animals") && (var9 instanceof Class1018 || var9 instanceof Class1042)) {
            var24.remove();
         } else if (!this.field44346.method15974("Monsters") && var9 instanceof Class1009) {
            var24.remove();
         } else if (this.field44347.player.getRidingEntity() != null && this.field44347.player.getRidingEntity().equals(var9)) {
            var24.remove();
         } else if (var9.method3362()) {
            var24.remove();
         } else if (!(var9 instanceof PlayerEntity)
            || !Class8781.method31662((PlayerEntity)var9)
            || !Client.getInstance().getModuleManager().method14662(Class5275.class).method15996()) {
            Vector3d var10 = Class5628.method17751(var9);
            if (!(this.field44347.player.method3275(var9) < 40.0F)) {
               if (this.field44349.containsKey(var9)) {
                  this.field44349.remove(var9);
               }
            } else if (!this.field44349.containsKey(var9)) {
               this.field44349.put(var9, new ArrayList<Class9629<Vector3d, Long>>());
            } else {
               for (List var12 : this.field44349.values()) {
                  int var13 = var12.size();

                  for (int var14 = 0; var14 < var13; var14++) {
                     Class9629 var15 = (Class9629)var12.get(var14);
                     if (var15 != null) {
                        Long var16 = (Long)var15.method37539();
                        long var17 = System.currentTimeMillis() - var16;
                        if ((float)var17 > var7) {
                           var12.remove(var14);
                           var13--;
                        }
                     }
                  }
               }
            }

            if (!(Class5628.method17754(var10) > 8.0)) {
               boolean var26 = true;
               if (this.field44346.method15974("Smart Reach")) {
                  List<Class9629<Vector3d, Long>> var27 = this.field44349.get(var9);
                  if (var27 != null) {
                     for (Class9629<Vector3d, Long> var30 : var27) {
                        Vector3d var31 = var30.method37538();
                        double var19 = 0.15;
                        Class6488 var21 = new Class6488(
                           var31.field18048 - var19,
                           var31.field18049,
                           var31.field18050 - var19,
                           var31.field18048 + var19,
                           var31.field18049 + this.field44347.player.field5035.method19677(),
                           var31.field18050 + var19
                        );
                        double var22 = Class5628.method17755(var21);
                        if (var22 < (double)var1) {
                           var26 = false;
                        }
                     }
                  }
               }

               if (var26 && Class5628.method17754(var10) > (double)var1) {
                  var24.remove();
               } else if (!this.field44346.method15974("Through walls")) {
                  Class7461 var28 = Class9142.method34150(var9, true);
                  if (var28 == null) {
                     var24.remove();
                  }
               }
            } else {
               var24.remove();
            }
         } else {
            var24.remove();
         }
      }

      Collections.sort(var4, new Class3589(this));
      return var4;
   }

   public List<Class8012> method36824(List<Class8012> var1) {
      String var4 = this.field44346.getStringSettingValueByName("Sort Mode");
      switch (var4) {
         case "Range":
            Collections.sort(var1, new Class3607(this));
            break;
         case "Health":
            Collections.sort(var1, new Class3606(this));
            break;
         case "Angle":
            Collections.sort(var1, new Class3586(this));
            break;
         case "Prev Range":
            Collections.sort(var1, new Class3599(this));
            break;
         case "Armor":
            Collections.sort(var1, new Class3581(this));
      }

      Collections.sort(var1, new Class3608(this));
      return var1;
   }
}