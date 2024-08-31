package mapped;

import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import net.minecraft.entity.Entity;
import net.minecraft.util.Hand;

public class Class338 implements Runnable {
   public final float field1477;
   public final KillAura field1478;

   public Class338(KillAura var1, float var2) {
      this.field1478 = var1;
      this.field1477 = var2;
   }

   @Override
   public void run() {
      boolean var3 = (float)Math.round((float)Math.random() * 100.0F) <= this.field1478.getNumberValueBySettingName("Hit Chance");
      float var4 = Math.max(KillAura.method16837().player.method3275(KillAura.field23949.method27397()), this.field1478.getNumberValueBySettingName("Range"));
      EntityRayTraceResult var5;
      if (!this.field1478.getStringSettingValueByName("Attack Mode").equals("Pre")) {
         var5 = ColorUtils.method17712(
            KillAura.method16843(this.field1478).field32084, KillAura.method16843(this.field1478).field32085, var4, (double)this.field1477
         );
      } else {
         double var6 = Math.sqrt(
            KillAura.method16838().player.method3433().x * KillAura.method16839().player.method3433().x
               + KillAura.method16840().player.method3433().z * KillAura.method16841().player.method3433().z
         );
         double var10003 = (double)this.field1477;
         var5 = ColorUtils.method17712(KillAura.method16842(this.field1478).field32084, KillAura.method16842(this.field1478).field32085, var4, var10003 + var6);
      }

      if (KillAura.field23948 != null
         && KillAura.method16844(this.field1478).method36813()
         && !this.field1478.getStringSettingValueByName("Autoblock Mode").equals("Vanilla")) {
         KillAura.method16844(this.field1478).method36816();
      }

      String var8 = this.field1478.getStringSettingValueByName("Mode");
      if (var3 && (var5 != null || !this.field1478.getBooleanValueFromSetttingName("Raytrace") || var8.equals("Multi"))) {
         for (Class8012 var10 : KillAura.method16845(this.field1478)) {
            Entity var11 = var10.method27397();
            if (var5 != null && this.field1478.getBooleanValueFromSetttingName("Raytrace") && !var8.equals("Multi")) {
               var11 = var5.getEntity();
            }

            ColorUtils.method17735(var11, !this.field1478.getBooleanValueFromSetttingName("No swing"));
         }

         if (var8.equals("Multi2")) {
            KillAura.method16847(this.field1478, KillAura.method16846(this.field1478) + 1);
         }
      } else if (!this.field1478.getBooleanValueFromSetttingName("No swing")) {
         KillAura.method16848().player.swingArm(Hand.MAIN_HAND);
      }

      if (KillAura.field23948 != null && KillAura.method16844(this.field1478).method36817() && this.field1478.getStringSettingValueByName("Autoblock Mode").equals("Basic1")) {
         KillAura.method16844(this.field1478)
            .method36815(KillAura.field23948, KillAura.method16843(this.field1478).field32084, KillAura.method16843(this.field1478).field32085);
      }
   }
}
