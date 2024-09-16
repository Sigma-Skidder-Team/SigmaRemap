package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Arrays;
import java.util.Comparator;

public enum AmbientOcclusionStatus {
   OFF(0, "options.ao.off"),
   field16004(1, "options.ao.min"),
   field16005(2, "options.ao.max");

   private static final AmbientOcclusionStatus[] field16006 = Arrays.<AmbientOcclusionStatus>stream(values())
      .sorted(Comparator.comparingInt(AmbientOcclusionStatus::method9115))
      .<AmbientOcclusionStatus>toArray(AmbientOcclusionStatus[]::new);
   private final int field16007;
   private final String field16008;
   private static final AmbientOcclusionStatus[] field16009 = new AmbientOcclusionStatus[]{OFF, field16004, field16005};

   private AmbientOcclusionStatus(int var3, String var4) {
      this.field16007 = var3;
      this.field16008 = var4;
   }

   public int method9115() {
      return this.field16007;
   }

   public String method9116() {
      return this.field16008;
   }

   public static AmbientOcclusionStatus method9117(int var0) {
      return field16006[MathHelper.normalizeAngle(var0, field16006.length)];
   }
}
