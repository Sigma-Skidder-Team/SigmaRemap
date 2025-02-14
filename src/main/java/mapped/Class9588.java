package mapped;

import javax.annotation.Nullable;

public final class Class9588 {
   public static final Class9588 field44825 = method37230("all");
   public static final Class9588 field44826 = method37231("texture", field44825);
   public static final Class9588 field44827 = method37231("particle", field44826);
   public static final Class9588 field44828 = method37231("end", field44825);
   public static final Class9588 field44829 = method37231("bottom", field44828);
   public static final Class9588 field44830 = method37231("top", field44828);
   public static final Class9588 field44831 = method37231("front", field44825);
   public static final Class9588 field44832 = method37231("back", field44825);
   public static final Class9588 field44833 = method37231("side", field44825);
   public static final Class9588 field44834 = method37231("north", field44833);
   public static final Class9588 field44835 = method37231("south", field44833);
   public static final Class9588 field44836 = method37231("east", field44833);
   public static final Class9588 field44837 = method37231("west", field44833);
   public static final Class9588 field44838 = method37230("up");
   public static final Class9588 field44839 = method37230("down");
   public static final Class9588 field44840 = method37230("cross");
   public static final Class9588 field44841 = method37230("plant");
   public static final Class9588 field44842 = method37231("wall", field44825);
   public static final Class9588 field44843 = method37230("rail");
   public static final Class9588 field44844 = method37230("wool");
   public static final Class9588 field44845 = method37230("pattern");
   public static final Class9588 field44846 = method37230("pane");
   public static final Class9588 field44847 = method37230("edge");
   public static final Class9588 field44848 = method37230("fan");
   public static final Class9588 field44849 = method37230("stem");
   public static final Class9588 field44850 = method37230("upperstem");
   public static final Class9588 field44851 = method37230("crop");
   public static final Class9588 field44852 = method37230("dirt");
   public static final Class9588 field44853 = method37230("fire");
   public static final Class9588 field44854 = method37230("lantern");
   public static final Class9588 field44855 = method37230("platform");
   public static final Class9588 field44856 = method37230("unsticky");
   public static final Class9588 field44857 = method37230("torch");
   public static final Class9588 field44858 = method37230("layer0");
   public static final Class9588 field44859 = method37230("lit_log");
   private final String field44860;
   private final Class9588 field44861;

   private static Class9588 method37230(String var0) {
      return new Class9588(var0, (Class9588)null);
   }

   private static Class9588 method37231(String var0, Class9588 var1) {
      return new Class9588(var0, var1);
   }

   private Class9588(String var1, Class9588 var2) {
      this.field44860 = var1;
      this.field44861 = var2;
   }

   public String method37232() {
      return this.field44860;
   }

   @Nullable
   public Class9588 method37233() {
      return this.field44861;
   }

   @Override
   public String toString() {
      return "#" + this.field44860;
   }
}
