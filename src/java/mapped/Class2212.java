package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class2212 {
   field14462("always", 0),
   field14463("never", 1),
   field14464("pushOtherTeams", 2),
   field14465("pushOwnTeam", 3);

   private static final Map<String, Class2212> field14466 = Arrays.<Class2212>stream(values())
      .collect(Collectors.toMap(var0 -> var0.field14467, var0 -> (Class2212)var0));
   public final String field14467;
   public final int field14468;
   private static final Class2212[] field14469 = new Class2212[]{field14462, field14463, field14464, field14465};

   @Nullable
   public static Class2212 method8939(String var0) {
      return field14466.get(var0);
   }

   private Class2212(String var3, int var4) {
      this.field14467 = var3;
      this.field14468 = var4;
   }

   public ITextComponent method8940() {
      return new TranslationTextComponent("team.collision." + this.field14467);
   }
}
