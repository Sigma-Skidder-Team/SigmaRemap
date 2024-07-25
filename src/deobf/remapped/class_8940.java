package remapped;

import javax.annotation.Nullable;

public final class class_8940 {
   public static final class_8940 field_45843 = method_41075("all");
   public static final class_8940 field_45837 = method_41078("texture", field_45843);
   public static final class_8940 field_45832 = method_41078("particle", field_45837);
   public static final class_8940 field_45830 = method_41078("end", field_45843);
   public static final class_8940 field_45822 = method_41078("bottom", field_45830);
   public static final class_8940 field_45810 = method_41078("top", field_45830);
   public static final class_8940 field_45833 = method_41078("front", field_45843);
   public static final class_8940 field_45809 = method_41078("back", field_45843);
   public static final class_8940 field_45813 = method_41078("side", field_45843);
   public static final class_8940 field_45825 = method_41078("north", field_45813);
   public static final class_8940 field_45840 = method_41078("south", field_45813);
   public static final class_8940 field_45824 = method_41078("east", field_45813);
   public static final class_8940 field_45836 = method_41078("west", field_45813);
   public static final class_8940 field_45817 = method_41075("up");
   public static final class_8940 field_45839 = method_41075("down");
   public static final class_8940 field_45826 = method_41075("cross");
   public static final class_8940 field_45841 = method_41075("plant");
   public static final class_8940 field_45831 = method_41078("wall", field_45843);
   public static final class_8940 field_45814 = method_41075("rail");
   public static final class_8940 field_45823 = method_41075("wool");
   public static final class_8940 field_45821 = method_41075("pattern");
   public static final class_8940 field_45811 = method_41075("pane");
   public static final class_8940 field_45845 = method_41075("edge");
   public static final class_8940 field_45816 = method_41075("fan");
   public static final class_8940 field_45829 = method_41075("stem");
   public static final class_8940 field_45828 = method_41075("upperstem");
   public static final class_8940 field_45835 = method_41075("crop");
   public static final class_8940 field_45815 = method_41075("dirt");
   public static final class_8940 field_45808 = method_41075("fire");
   public static final class_8940 field_45838 = method_41075("lantern");
   public static final class_8940 field_45812 = method_41075("platform");
   public static final class_8940 field_45842 = method_41075("unsticky");
   public static final class_8940 field_45819 = method_41075("torch");
   public static final class_8940 field_45827 = method_41075("layer0");
   public static final class_8940 field_45820 = method_41075("lit_log");
   private final String field_45818;
   private final class_8940 field_45844;

   private static class_8940 method_41075(String var0) {
      return new class_8940(var0, (class_8940)null);
   }

   private static class_8940 method_41078(String var0, class_8940 var1) {
      return new class_8940(var0, var1);
   }

   private class_8940(String var1, class_8940 var2) {
      this.field_45818 = var1;
      this.field_45844 = var2;
   }

   public String method_41074() {
      return this.field_45818;
   }

   @Nullable
   public class_8940 method_41077() {
      return this.field_45844;
   }

   @Override
   public String toString() {
      return "#" + this.field_45818;
   }
}
