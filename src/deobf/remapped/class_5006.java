package remapped;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_5006 {
   field_25901("always", 0),
   field_25900("never", 1),
   field_25898("pushOtherTeams", 2),
   field_25896("pushOwnTeam", 3);

   private static final Map<String, class_5006> field_25902 = Arrays.<class_5006>stream(values())
      .collect(Collectors.toMap(var0 -> var0.field_25895, var0 -> (class_5006)var0));
   public final String field_25895;
   public final int field_25897;

   @Nullable
   public static class_5006 method_23049(String var0) {
      return field_25902.get(var0);
   }

   private class_5006(String var3, int var4) {
      this.field_25895 = var3;
      this.field_25897 = var4;
   }

   public ITextComponent method_23048() {
      return new TranslationTextComponent("team.collision." + this.field_25895);
   }
}
