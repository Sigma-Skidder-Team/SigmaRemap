package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class Class9008 {
   public static final Map<String, Class9008> field41188 = Maps.newHashMap();
   public static final Class9008 field41189 = new Class9008("dummy");
   public static final Class9008 field41190 = new Class9008("trigger");
   public static final Class9008 field41191 = new Class9008("deathCount");
   public static final Class9008 field41192 = new Class9008("playerKillCount");
   public static final Class9008 field41193 = new Class9008("totalKillCount");
   public static final Class9008 field41194 = new Class9008("health", true, Class2316.field15869);
   public static final Class9008 field41195 = new Class9008("food", true, Class2316.field15868);
   public static final Class9008 field41196 = new Class9008("air", true, Class2316.field15868);
   public static final Class9008 field41197 = new Class9008("armor", true, Class2316.field15868);
   public static final Class9008 field41198 = new Class9008("xp", true, Class2316.field15868);
   public static final Class9008 field41199 = new Class9008("level", true, Class2316.field15868);
   public static final Class9008[] field41200 = new Class9008[]{
      new Class9008("teamkill." + TextFormatting.BLACK.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.DARK_BLUE.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.DARK_GREEN.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.DARK_AQUA.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.DARK_RED.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.DARK_PURPLE.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.GOLD.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.GRAY.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.DARK_GRAY.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.BLUE.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.GREEN.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.AQUA.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.RED.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.LIGHT_PURPLE.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.YELLOW.getFriendlyName()),
      new Class9008("teamkill." + TextFormatting.WHITE.getFriendlyName())
   };
   public static final Class9008[] field41201 = new Class9008[]{
      new Class9008("killedByTeam." + TextFormatting.BLACK.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.DARK_BLUE.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.DARK_GREEN.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.DARK_AQUA.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.DARK_RED.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.DARK_PURPLE.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.GOLD.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.GRAY.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.DARK_GRAY.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.BLUE.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.GREEN.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.AQUA.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.RED.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.LIGHT_PURPLE.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.YELLOW.getFriendlyName()),
      new Class9008("killedByTeam." + TextFormatting.WHITE.getFriendlyName())
   };
   private final String field41202;
   private final boolean field41203;
   private final Class2316 field41204;

   public Class9008(String var1) {
      this(var1, false, Class2316.field15868);
   }

   public Class9008(String var1, boolean var2, Class2316 var3) {
      this.field41202 = var1;
      this.field41203 = var2;
      this.field41204 = var3;
      field41188.put(var1, this);
   }

   public static Optional<Class9008> method33278(String var0) {
      if (!field41188.containsKey(var0)) {
         int var3 = var0.indexOf(58);
         return var3 >= 0
            ? Registry.field16088
               .method9187(ResourceLocation.method8288(var0.substring(0, var3), '.'))
               .<Class9008>flatMap(var2 -> method33279((Class49<?>)var2, ResourceLocation.method8288(var0.substring(var3 + 1), '.')))
            : Optional.<Class9008>empty();
      } else {
         return Optional.<Class9008>of(field41188.get(var0));
      }
   }

   private static <T> Optional<Class9008> method33279(Class49<T> var0, ResourceLocation var1) {
      return var0.method171().method9187(var1).<Class9008>map(var0::method172);
   }

   public String method33280() {
      return this.field41202;
   }

   public boolean method33281() {
      return this.field41203;
   }

   public Class2316 method33282() {
      return this.field41204;
   }
}
