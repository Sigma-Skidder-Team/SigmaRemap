package net.minecraft.client.settings;

import net.minecraft.util.math.MathHelper;

import java.util.Arrays;
import java.util.Comparator;

public enum ParticleStatus {
   field15246(0, "options.particles.all"),
   field15247(1, "options.particles.decreased"),
   field15248(2, "options.particles.minimal");

   private static final ParticleStatus[] field15249 = Arrays.<ParticleStatus>stream(values())
      .sorted(Comparator.comparingInt(ParticleStatus::method9052))
      .<ParticleStatus>toArray(ParticleStatus[]::new);
   private final int field15250;
   private final String field15251;
   private static final ParticleStatus[] field15252 = new ParticleStatus[]{field15246, field15247, field15248};

   private ParticleStatus(int var3, String var4) {
      this.field15250 = var3;
      this.field15251 = var4;
   }

   public String method9051() {
      return this.field15251;
   }

   public int method9052() {
      return this.field15250;
   }

   public static ParticleStatus method9053(int var0) {
      return field15249[MathHelper.normalizeAngle(var0, field15249.length)];
   }
}
