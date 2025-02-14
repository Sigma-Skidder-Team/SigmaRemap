package mapped;

import com.google.common.collect.ImmutableMap;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public enum Class2074 {
   field13506("major_negative", -5, 100, 10, 10),
   field13507("minor_negative", -1, 200, 20, 20),
   field13508("minor_positive", 1, 200, 1, 5),
   field13509("major_positive", 5, 100, 0, 100),
   field13510("trading", 1, 25, 2, 20);

   public final String field13511;
   public final int field13512;
   public final int field13513;
   public final int field13514;
   public final int field13515;
   private static final Map<String, Class2074> field13516 = Stream.<Class2074>of(values())
      .collect(ImmutableMap.toImmutableMap(var0 -> var0.field13511, Function.identity()));
   private static final Class2074[] field13517 = new Class2074[]{field13506, field13507, field13508, field13509, field13510};

   private Class2074(String var3, int var4, int var5, int var6, int var7) {
      this.field13511 = var3;
      this.field13512 = var4;
      this.field13513 = var5;
      this.field13514 = var6;
      this.field13515 = var7;
   }

   @Nullable
   public static Class2074 method8731(String var0) {
      return field13516.get(var0);
   }
}
