package mapped;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum SoundCategory {
   field14728("master"),
   field14729("music"),
   field14730("record"),
   field14731("weather"),
   field14732("block"),
   field14733("hostile"),
   field14734("neutral"),
   field14735("player"),
   field14736("ambient"),
   field14737("voice");

   private static final Map<String, SoundCategory> field14738 = Arrays.<SoundCategory>stream(values())
      .collect(Collectors.toMap(SoundCategory::method8995, Function.<SoundCategory>identity()));
   private final String field14739;
   private static final SoundCategory[] field14740 = new SoundCategory[]{
      field14728, field14729, field14730, field14731, field14732, field14733, field14734, field14735, field14736, field14737
   };

   private SoundCategory(String var3) {
      this.field14739 = var3;
   }

   public String method8995() {
      return this.field14739;
   }
}
