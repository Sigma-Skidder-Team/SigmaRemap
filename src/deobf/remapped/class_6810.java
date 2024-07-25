package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import net.minecraft.util.text.TextFormatting;

public class class_6810 {
   public static final Map<String, class_6810> field_35136 = Maps.newHashMap();
   public static final class_6810 field_35129 = new class_6810("dummy");
   public static final class_6810 field_35130 = new class_6810("trigger");
   public static final class_6810 field_35131 = new class_6810("deathCount");
   public static final class_6810 field_35133 = new class_6810("playerKillCount");
   public static final class_6810 field_35140 = new class_6810("totalKillCount");
   public static final class_6810 field_35128 = new class_6810("health", true, class_8792.field_44982);
   public static final class_6810 field_35138 = new class_6810("food", true, class_8792.field_44983);
   public static final class_6810 field_35137 = new class_6810("air", true, class_8792.field_44983);
   public static final class_6810 field_35132 = new class_6810("armor", true, class_8792.field_44983);
   public static final class_6810 field_35127 = new class_6810("xp", true, class_8792.field_44983);
   public static final class_6810 field_35134 = new class_6810("level", true, class_8792.field_44983);
   public static final class_6810[] field_35125 = new class_6810[]{
      new class_6810("teamkill." + TextFormatting.BLACK.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.DARK_BLUE.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.DARK_GREEN.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.DARK_AQUA.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.DARK_RED.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.DARK_PURPLE.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.GOLD.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.GRAY.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.DARK_GRAY.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.BLUE.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.GREEN.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.AQUA.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.RED.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.LIGHT_PURPLE.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.YELLOW.getFriendlyName()),
      new class_6810("teamkill." + TextFormatting.WHITE.getFriendlyName())
   };
   public static final class_6810[] field_35141 = new class_6810[]{
      new class_6810("killedByTeam." + TextFormatting.BLACK.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.DARK_BLUE.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.DARK_GREEN.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.DARK_AQUA.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.DARK_RED.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.DARK_PURPLE.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.GOLD.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.GRAY.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.DARK_GRAY.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.BLUE.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.GREEN.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.AQUA.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.RED.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.LIGHT_PURPLE.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.YELLOW.getFriendlyName()),
      new class_6810("killedByTeam." + TextFormatting.WHITE.getFriendlyName())
   };
   private final String field_35142;
   private final boolean field_35139;
   private final class_8792 field_35126;

   public class_6810(String var1) {
      this(var1, false, class_8792.field_44983);
   }

   public class_6810(String var1, boolean var2, class_8792 var3) {
      this.field_35142 = var1;
      this.field_35139 = var2;
      this.field_35126 = var3;
      field_35136.put(var1, this);
   }

   public static Optional<class_6810> method_31260(String var0) {
      if (!field_35136.containsKey(var0)) {
         int var3 = var0.indexOf(58);
         return var3 >= 0
            ? class_8669.field_44376
               .method_39794(class_4639.method_21459(var0.substring(0, var3), '.'))
               .<class_6810>flatMap(var2 -> method_31259((class_9478<?>)var2, class_4639.method_21459(var0.substring(var3 + 1), '.')))
            : Optional.<class_6810>empty();
      } else {
         return Optional.<class_6810>of(field_35136.get(var0));
      }
   }

   private static <T> Optional<class_6810> method_31259(class_9478<T> var0, class_4639 var1) {
      return var0.method_43788().method_39794(var1).<class_6810>map(var0::method_43790);
   }

   public String method_31262() {
      return this.field_35142;
   }

   public boolean method_31258() {
      return this.field_35139;
   }

   public class_8792 method_31257() {
      return this.field_35126;
   }
}
