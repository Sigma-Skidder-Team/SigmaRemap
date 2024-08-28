package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class2225 {
   field14554("always", 0),
   field14555("never", 1),
   field14556("hideForOtherTeams", 2),
   field14557("hideForOwnTeam", 3);

   private static final Map<String, Class2225> field14558 = Arrays.<Class2225>stream(values())
      .collect(Collectors.toMap(var0 -> var0.field14559, var0 -> (Class2225)var0));
   public final String field14559;
   public final int field14560;
   private static final Class2225[] field14561 = new Class2225[]{field14554, field14555, field14556, field14557};

   @Nullable
   public static Class2225 method8958(String var0) {
      return field14558.get(var0);
   }

   private Class2225(String var3, int var4) {
      this.field14559 = var3;
      this.field14560 = var4;
   }

   public ITextComponent method8959() {
      return new TranslationTextComponent("team.visibility." + this.field14559);
   }
}
