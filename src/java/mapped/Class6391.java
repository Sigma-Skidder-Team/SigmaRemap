package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class6391 {
   private static String[] field27972;
   public static final Class6391 field27973 = new Class6391();
   private final List<Class7781> field27974 = Lists.newArrayList();
   private final List<Class7202> field27975;
   private Class7704 field27976;
   public static ResourceLocation field27977 = null;

   private Class6391() {
      this.field27975 = Collections.<Class7202>emptyList();
   }

   public Class6391(Class8968 var1, Class7496 var2, Function<ResourceLocation, Class7495> var3, List<Class7781> var4) {
      this(var1, var2, var3, var1.method32857()::method7289, var4);
   }

   public Class6391(Class8968 var1, Class7495 var2, Function<ResourceLocation, Class7495> var3, Function<Class7826, Class1713> var4, List<Class7781> var5) {
      this.field27975 = var5.stream().<Class7202>map(var4x -> {
         Class7495 var7 = (Class7495)var3.apply(var4x.method25780());
         return !Objects.equals(var7, var2) ? var1.method32848(var4x.method25780(), Class1901.field11159, var4) : null;
      }).collect(Collectors.<Class7202>toList());
      Collections.reverse(this.field27975);

      for (int var8 = var5.size() - 1; var8 >= 0; var8--) {
         this.field27974.add((Class7781)var5.get(var8));
      }

      if (this.field27974.size() > 65) {
         this.field27976 = Class7704.method25460(this.field27974);
      }
   }

   @Nullable
   public Class7202 method19424(Class7202 var1, Class8848 var2, Class1656 var3, Class880 var4) {
      boolean var7 = Class7944.method26953();
      if (var7) {
         field27977 = null;
      }

      if (!this.field27974.isEmpty()) {
         if (this.field27976 != null) {
            Integer var8 = this.field27976.method25457(var2, var3, var4);
            if (var8 != null) {
               int var12 = var8;
               if (var12 >= 0 && var12 < this.field27975.size()) {
                  if (var7) {
                     field27977 = this.field27974.get(var12).method25780();
                  }

                  Class7202 var13 = this.field27975.get(var12);
                  if (var13 != null) {
                     return var13;
                  }
               }

               return var1;
            }
         }

         for (int var11 = 0; var11 < this.field27974.size(); var11++) {
            Class7781 var9 = this.field27974.get(var11);
            if (var9.method25781(var2, var3, var4)) {
               Class7202 var10 = this.field27975.get(var11);
               if (var7) {
                  field27977 = var9.method25780();
               }

               if (this.field27976 != null) {
                  this.field27976.method25458(var2, var3, var4, var11);
               }

               if (var10 != null) {
                  return var10;
               }

               return var1;
            }
         }

         if (this.field27976 != null) {
            this.field27976.method25458(var2, var3, var4, Class7704.field33087);
         }
      }

      return var1;
   }

   public ImmutableList<Class7781> method19425() {
      return ImmutableList.copyOf(this.field27974);
   }
}
