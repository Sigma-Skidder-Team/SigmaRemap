package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Arrays;
import java.util.Comparator;

public enum CloudOption {
   OFF(0, "options.off"),
   FAST(1, "options.clouds.fast"),
   field11186(2, "options.clouds.fancy");

   private static final CloudOption[] field11187 = Arrays.<CloudOption>stream(values())
      .sorted(Comparator.comparingInt(CloudOption::method8173))
      .<CloudOption>toArray(CloudOption[]::new);
   private final int field11188;
   private final String field11189;
   private static final CloudOption[] field11190 = new CloudOption[]{OFF, FAST, field11186};

   private CloudOption(int var3, String var4) {
      this.field11188 = var3;
      this.field11189 = var4;
   }

   public int method8173() {
      return this.field11188;
   }

   public String method8174() {
      return this.field11189;
   }

   public static CloudOption method8175(int var0) {
      return field11187[MathHelper.normalizeAngle(var0, field11187.length)];
   }
}
