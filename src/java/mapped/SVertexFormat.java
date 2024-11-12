package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class SVertexFormat {
   private static String[] field41502;
   public static final int field41503 = 16;
   public static final int field41504 = 9;
   public static final int field41505 = 11;
   public static final int field41506 = 13;
   public static final VertexFormat field41507 = method33809();

   public static VertexFormat makeExtendedFormatBlock(VertexFormat var0) {
      Builder var3 = ImmutableList.builder();
      var3.addAll(var0.method26217());
      var3.add(new VertexFormatElement(0, Class2061.field13432, Class2142.field14022, 3));
      var3.add(new VertexFormatElement(0, Class2061.field13432, Class2142.field14022, 1));
      var3.add(new VertexFormatElement(0, Class2061.field13430, Class2142.field14022, 2));
      var3.add(new VertexFormatElement(0, Class2061.field13434, Class2142.field14022, 4));
      var3.add(new VertexFormatElement(0, Class2061.field13434, Class2142.field14022, 4));
      var3.add(new VertexFormatElement(0, Class2061.field13432, Class2142.field14022, 4));
      return new VertexFormat(var3.build());
   }

   public static VertexFormat method33808() {
      Builder var2 = ImmutableList.builder();
      var2.add(new VertexFormatElement(0, Class2061.field13430, Class2142.field14018, 3));
      var2.add(new VertexFormatElement(0, Class2061.field13431, Class2142.field14020, 4));
      var2.add(new VertexFormatElement(0, Class2061.field13430, Class2142.field14021, 2));
      var2.add(new VertexFormatElement(0, Class2061.field13434, Class2142.field14022, 2));
      var2.add(new VertexFormatElement(0, Class2061.field13432, Class2142.field14019, 3));
      var2.add(new VertexFormatElement(0, Class2061.field13432, Class2142.field14022, 1));
      var2.add(new VertexFormatElement(0, Class2061.field13430, Class2142.field14022, 2));
      var2.add(new VertexFormatElement(0, Class2061.field13434, Class2142.field14022, 4));
      var2.add(new VertexFormatElement(0, Class2061.field13434, Class2142.field14022, 4));
      return new VertexFormat(var2.build());
   }

   public static VertexFormat method33809() {
      Builder var2 = ImmutableList.builder();
      var2.add(new VertexFormatElement(0, Class2061.field13430, Class2142.field14018, 3));
      var2.add(new VertexFormatElement(0, Class2061.field13431, Class2142.field14022, 4));
      var2.add(new VertexFormatElement(0, Class2061.field13430, Class2142.field14021, 2));
      var2.add(new VertexFormatElement(0, Class2061.field13434, Class2142.field14022, 2));
      var2.add(new VertexFormatElement(0, Class2061.field13432, Class2142.field14019, 3));
      var2.add(new VertexFormatElement(0, Class2061.field13432, Class2142.field14022, 1));
      var2.add(new VertexFormatElement(0, Class2061.field13430, Class2142.field14022, 2));
      var2.add(new VertexFormatElement(0, Class2061.field13434, Class2142.field14022, 4));
      var2.add(new VertexFormatElement(0, Class2061.field13434, Class2142.field14022, 4));
      return new VertexFormat(var2.build());
   }
}
