package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4368 extends Class4247 {
   public Module field21351;

   public Class4368(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21351 = var7;
      Class4262 var10;
      this.method13230(var10 = new Class4262(this, "enable", 114, 9, 40, 18));
      var10.method13093(var7.isEnabled());
      var10.method13036(var2x -> var7.method15999(var10.method13092()));
      if (var7.method15989().size() > 0) {
         Class4364 var11;
         this.method13230(var11 = new Class4364(this, "gear", 132, 32));
         var11.method13251((var2x, var3x) -> ((Class4335)this.method13258()).method13486(var7));
      }
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11439(
         ClassicDecryption.regular17,
         (float)(this.field20895 + 10),
         (float)(this.field20896 + 8),
         this.field21351.getSuffix(),
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, !this.field21351.isEnabled() ? 0.5F : 0.9F)
      );
      Class3192.method11439(
         ClassicDecryption.regular15,
         (float)(this.field20895 + 15),
         (float)(this.field20896 + 33),
         "Bind",
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 1.0F)
      );
      Class3192.method11439(
         ClassicDecryption.regular15,
         (float)(this.field20895 + 15),
         (float)(this.field20896 + 52),
         Class5628.method17736(this.field21351.parseSettingValueToIntBySettingName("Keybind")),
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.7F)
      );
      if (this.field21351.method15989().size() > 1) {
         Class3192.method11439(
            ClassicDecryption.regular12,
            (float)(this.field20895 + 84),
            (float)(this.field20896 + 34),
            "Settings",
            Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 1.0F)
         );
      }

      super.method13027(var1);
   }
}
