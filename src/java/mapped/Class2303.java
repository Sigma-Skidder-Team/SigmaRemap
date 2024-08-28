package mapped;

import net.minecraft.util.text.TextFormatting;

public enum Class2303 {
   field15720("pink", TextFormatting.RED),
   field15721("blue", TextFormatting.BLUE),
   field15722("red", TextFormatting.DARK_RED),
   field15723("green", TextFormatting.GREEN),
   field15724("yellow", TextFormatting.YELLOW),
   field15725("purple", TextFormatting.DARK_BLUE),
   field15726("white", TextFormatting.WHITE);

   private final String field15727;
   private final TextFormatting field15728;
   private static final Class2303[] field15729 = new Class2303[]{field15720, field15721, field15722, field15723, field15724, field15725, field15726};

   private Class2303(String var3, TextFormatting var4) {
      this.field15727 = var3;
      this.field15728 = var4;
   }

   public TextFormatting method9069() {
      return this.field15728;
   }

   public String method9070() {
      return this.field15727;
   }

   public static Class2303 method9071(String var0) {
      for (Class2303 var6 : values()) {
         if (var6.field15727.equals(var0)) {
            return var6;
         }
      }

      return field15726;
   }
}
