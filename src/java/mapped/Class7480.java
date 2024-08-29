package mapped;

import com.mojang.datafixers.DataFixUtils;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class Class7480 {
   private final Class1660 field32171;
   private final DimensionGeneratorSettings field32172;

   public Class7480(Class1660 var1, DimensionGeneratorSettings var2) {
      this.field32171 = var1;
      this.field32172 = var2;
   }

   public Class7480 method24339(Class1691 var1) {
      if (var1.method6970() == this.field32171) {
         return new Class7480(var1, this.field32172);
      } else {
         throw new IllegalStateException("Using invalid feature manager (source level: " + var1.method6970() + ", region: " + var1);
      }
   }

   public Stream<? extends Class5444<?>> method24340(Class2002 var1, Structure<?> var2) {
      return this.field32171
         .getChunk(var1.method8410(), var1.method8412(), ChunkStatus.field42135)
         .method7099(var2)
         .stream()
         .<Class2002>map(var0 -> Class2002.method8391(new Class7481(var0), 0))
         .<Class5444<?>>map(var2x -> this.method24341(var2x, var2, this.field32171.getChunk(var2x.method8410(), var2x.method8412(), ChunkStatus.field42134)))
         .filter(var0 -> var0 != null && var0.method17117());
   }

   @Nullable
   public Class5444<?> method24341(Class2002 var1, Structure<?> var2, Class1671 var3) {
      return var3.method7097(var2);
   }

   public void method24342(Class2002 var1, Structure<?> var2, Class5444<?> var3, Class1671 var4) {
      var4.method7098(var2, var3);
   }

   public void method24343(Class2002 var1, Structure<?> var2, long var3, Class1671 var5) {
      var5.method7100(var2, var3);
   }

   public boolean method24344() {
      return this.field32172.method26260();
   }

   public Class5444<?> method24345(BlockPos var1, boolean var2, Structure<?> var3) {
      return (Class5444<?>)DataFixUtils.orElse(
         this.method24340(Class2002.method8390(var1), var3)
            .filter(var1x -> var1x.method17110().method38396(var1))
            .filter(var2x -> !var2 || var2x.method17111().stream().anyMatch(var1xx -> var1xx.method12915().method38396(var1)))
            .findFirst(),
         Class5444.field24194
      );
   }
}
