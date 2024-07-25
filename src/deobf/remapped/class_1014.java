package remapped;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_1014 {
   field_5325("always", 0),
   field_5326("never", 1),
   field_5327("hideForOtherTeams", 2),
   field_5328("hideForOwnTeam", 3);

   private static final Map<String, class_1014> field_5322 = Arrays.<class_1014>stream(values())
      .collect(Collectors.toMap(var0 -> var0.field_5324, var0 -> (class_1014)var0));
   public final String field_5324;
   public final int field_5321;

   @Nullable
   public static class_1014 method_4496(String var0) {
      return field_5322.get(var0);
   }

   private class_1014(String var3, int var4) {
      this.field_5324 = var3;
      this.field_5321 = var4;
   }

   public ITextComponent method_4497() {
      return new TranslationTextComponent("team.visibility." + this.field_5324);
   }
}
