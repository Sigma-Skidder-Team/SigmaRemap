package net.minecraft.client.settings;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum NarratorStatus {
   field11267(0, "options.narrator.off"),
   field11268(1, "options.narrator.all"),
   field11269(2, "options.narrator.chat"),
   field11270(3, "options.narrator.system");

   private static final NarratorStatus[] field11271 = Arrays.<NarratorStatus>stream(values())
      .sorted(Comparator.comparingInt(NarratorStatus::method8189))
      .<NarratorStatus>toArray(NarratorStatus[]::new);
   private final int field11272;
   private final ITextComponent field11273;
   private static final NarratorStatus[] field11274 = new NarratorStatus[]{field11267, field11268, field11269, field11270};

   private NarratorStatus(int var3, String var4) {
      this.field11272 = var3;
      this.field11273 = new TranslationTextComponent(var4);
   }

   public int method8189() {
      return this.field11272;
   }

   public ITextComponent method8190() {
      return this.field11273;
   }

   public static NarratorStatus method8191(int var0) {
      return field11271[MathHelper.normalizeAngle(var0, field11271.length)];
   }
}
