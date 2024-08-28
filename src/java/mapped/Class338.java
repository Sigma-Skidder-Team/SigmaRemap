package mapped;

public class Class338 implements Runnable {
   public final float field1477;
   public final Class5357 field1478;

   public Class338(Class5357 var1, float var2) {
      this.field1478 = var1;
      this.field1477 = var2;
   }

   @Override
   public void run() {
      boolean var3 = (float)Math.round((float)Math.random() * 100.0F) <= this.field1478.method15977("Hit Chance");
      float var4 = Math.max(Class5357.method16837().player.method3275(Class5357.field23949.method27397()), this.field1478.method15977("Range"));
      Class8709 var5;
      if (!this.field1478.getStringSettingValueByName("Attack Mode").equals("Pre")) {
         var5 = Class5628.method17712(
            Class5357.method16843(this.field1478).field32084, Class5357.method16843(this.field1478).field32085, var4, (double)this.field1477
         );
      } else {
         double var6 = Math.sqrt(
            Class5357.method16838().player.method3433().field18048 * Class5357.method16839().player.method3433().field18048
               + Class5357.method16840().player.method3433().field18050 * Class5357.method16841().player.method3433().field18050
         );
         double var10003 = (double)this.field1477;
         var5 = Class5628.method17712(Class5357.method16842(this.field1478).field32084, Class5357.method16842(this.field1478).field32085, var4, var10003 + var6);
      }

      if (Class5357.field23948 != null
         && Class5357.method16844(this.field1478).method36813()
         && !this.field1478.getStringSettingValueByName("Autoblock Mode").equals("Vanilla")) {
         Class5357.method16844(this.field1478).method36816();
      }

      String var8 = this.field1478.getStringSettingValueByName("Mode");
      if (var3 && (var5 != null || !this.field1478.method15974("Raytrace") || var8.equals("Multi"))) {
         for (Class8012 var10 : Class5357.method16845(this.field1478)) {
            Entity var11 = var10.method27397();
            if (var5 != null && this.field1478.method15974("Raytrace") && !var8.equals("Multi")) {
               var11 = var5.method31416();
            }

            Class5628.method17735(var11, !this.field1478.method15974("No swing"));
         }

         if (var8.equals("Multi2")) {
            Class5357.method16847(this.field1478, Class5357.method16846(this.field1478) + 1);
         }
      } else if (!this.field1478.method15974("No swing")) {
         Class5357.method16848().player.swingArm(Hand.field182);
      }

      if (Class5357.field23948 != null && Class5357.method16844(this.field1478).method36817() && this.field1478.getStringSettingValueByName("Autoblock Mode").equals("Basic1")) {
         Class5357.method16844(this.field1478)
            .method36815(Class5357.field23948, Class5357.method16843(this.field1478).field32084, Class5357.method16843(this.field1478).field32085);
      }
   }
}
