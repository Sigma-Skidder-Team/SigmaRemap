package net.minecraft.advancements;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

import mapped.Class7999;
import mapped.Class8588;
import mapped.Class9181;
import mapped.Class9272;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.HoverEvent;

public class Advancement {
   private final Advancement field34186;
   private final Class9272 field34187;
   private final Class8588 field34188;
   private final ResourceLocation field34189;
   private final Map<String, Class9181> field34190;
   private final String[][] field34191;
   private final Set<Advancement> field34192 = Sets.newLinkedHashSet();
   private final ITextComponent field34193;

   public Advancement(ResourceLocation var1, Advancement var2, Class9272 var3, Class8588 var4, Map<String, Class9181> var5, String[][] var6) {
      this.field34189 = var1;
      this.field34187 = var3;
      this.field34190 = ImmutableMap.copyOf(var5);
      this.field34186 = var2;
      this.field34188 = var4;
      this.field34191 = var6;
      if (var2 != null) {
         var2.method27032(this);
      }

      if (var3 != null) {
         ITextComponent var9 = var3.method34934();
         TextFormatting var10 = var3.method34938().method8244();
         IFormattableTextComponent var11 = TextComponentUtils.func_240648_a_(var9.deepCopy(), Style.EMPTY.setFormatting(var10))
            .appendString("\n")
            .append(var3.method34935());
         IFormattableTextComponent var12 = var9.deepCopy().modifyStyle(var1x -> var1x.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, var11)));
         this.field34193 = TextComponentUtils.wrapWithSquareBrackets(var12).mergeStyle(var10);
      } else {
         this.field34193 = new StringTextComponent(var1.toString());
      }
   }

   public Class7999 method27025() {
      return new Class7999(
         this.field34186 != null ? this.field34186.getId() : null, this.field34187, this.field34188, this.field34190, this.field34191
      );
   }

   @Nullable
   public Advancement method27026() {
      return this.field34186;
   }

   @Nullable
   public Class9272 method27027() {
      return this.field34187;
   }

   public Class8588 method27028() {
      return this.field34188;
   }

   @Override
   public String toString() {
      return "SimpleAdvancement{id="
         + this.getId()
         + ", parent="
         + (this.field34186 != null ? this.field34186.getId() : "null")
         + ", display="
         + this.field34187
         + ", rewards="
         + this.field34188
         + ", criteria="
         + this.field34190
         + ", requirements="
         + Arrays.deepToString(this.field34191)
         + '}';
   }

   public Iterable<Advancement> method27029() {
      return this.field34192;
   }

   public Map<String, Class9181> method27030() {
      return this.field34190;
   }

   public int method27031() {
      return this.field34191.length;
   }

   public void method27032(Advancement var1) {
      this.field34192.add(var1);
   }

   public ResourceLocation getId() {
      return this.field34189;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Advancement) {
            Advancement var4 = (Advancement)var1;
            return this.field34189.equals(var4.field34189);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field34189.hashCode();
   }

   public String[][] method27034() {
      return this.field34191;
   }

   public ITextComponent method27035() {
      return this.field34193;
   }
}
