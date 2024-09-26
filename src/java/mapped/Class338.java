package mapped;

import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.entity.Entity;
import net.minecraft.util.Hand;

public class Class338 implements Runnable {
   public final float field1477;
   public final KillAura killauraModule;

   public Class338(KillAura var1, float var2) {
      this.killauraModule = var1;
      this.field1477 = var2;
   }

   @Override
   public void run() {
      boolean var3 = (float)Math.round((float)Math.random() * 100.0F) <= this.killauraModule.getNumberValueBySettingName("Hit Chance");
      float var4 = Math.max(KillAura.method16837().player.getDistance(KillAura.field23949.getEntity()), this.killauraModule.getNumberValueBySettingName("Range"));
      EntityRayTraceResult var5;
      if (!this.killauraModule.getStringSettingValueByName("Attack Mode").equals("Pre")) {
         var5 = MultiUtilities.method17712(
            KillAura.method16843(this.killauraModule).yaw, KillAura.method16843(this.killauraModule).pitch, var4, (double)this.field1477
         );
      } else {
         double var6 = Math.sqrt(
            KillAura.method16838().player.getMotion().x * KillAura.method16839().player.getMotion().x
               + KillAura.method16840().player.getMotion().z * KillAura.method16841().player.getMotion().z
         );
         double var10003 = (double)this.field1477;
         var5 = MultiUtilities.method17712(KillAura.method16842(this.killauraModule).yaw, KillAura.method16842(this.killauraModule).pitch, var4, var10003 + var6);
      }

      if (KillAura.target != null
         && KillAura.method16844(this.killauraModule).isBlocking()
         && !this.killauraModule.getStringSettingValueByName("Autoblock Mode").equals("Vanilla")) {
         KillAura.method16844(this.killauraModule).method36816();
      }

      String mode = this.killauraModule.getStringSettingValueByName("Mode");
      if (var3 && (var5 != null || !this.killauraModule.getBooleanValueFromSetttingName("Raytrace") || mode.equals("Multi"))) {
         for (TimedEntity var10 : KillAura.method16845(this.killauraModule)) {
            Entity var11 = var10.getEntity();
            if (var5 != null && this.killauraModule.getBooleanValueFromSetttingName("Raytrace") && !mode.equals("Multi")) {
               var11 = var5.getEntity();
            }

            MultiUtilities.swing(var11, !this.killauraModule.getBooleanValueFromSetttingName("No swing"));
         }

         if (mode.equals("Multi2")) {
            KillAura.method16847(this.killauraModule, KillAura.method16846(this.killauraModule) + 1);
         }
      } else if (!this.killauraModule.getBooleanValueFromSetttingName("No swing")) {
         KillAura.mc.player.swingArm(Hand.MAIN_HAND);
      }

      if (KillAura.target != null && KillAura.method16844(this.killauraModule).method36817() && this.killauraModule.getStringSettingValueByName("Autoblock Mode").equals("Basic1")) {
         KillAura.method16844(this.killauraModule)
            .block(KillAura.target, KillAura.method16843(this.killauraModule).yaw, KillAura.method16843(this.killauraModule).pitch);
      }
   }
}
