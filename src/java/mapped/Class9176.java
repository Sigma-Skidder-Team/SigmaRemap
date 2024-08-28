package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class Class9176 {
   private static final EnumSet<Class101> field42130 = EnumSet.<Class101>of(Class101.field297, Class101.field295);
   private static final EnumSet<Class101> field42131 = EnumSet.<Class101>of(Class101.field298, Class101.field296, Class101.field299, Class101.field300);
   private static final Class9241 field42132 = (var0, var1, var2, var3, var4, var5) -> {
      if (var5 instanceof Class1672 && !var5.method7080().method34306(var0)) {
         ((Class1672)var5).method7111(var0);
      }

      return CompletableFuture.completedFuture(Either.left(var5));
   };
   public static final Class9176 field42133 = method34289("empty", (Class9176)null, -1, field42130, Class2076.field13524, (var0, var1, var2, var3) -> {
   });
   public static final Class9176 field42134 = method34290(
      "structure_starts", field42133, 0, field42130, Class2076.field13524, (var0, var1, var2, var3, var4, var5, var6, var7) -> {
         if (!var7.method7080().method34306(var0)) {
            if (var1.method6715().method1436().method20087().method26260()) {
               var2.method17825(var1.method6867(), var1.method6893(), var7, var3, var1.method6967());
            }

            if (var7 instanceof Class1672) {
               ((Class1672)var7).method7111(var0);
            }
         }

         return CompletableFuture.completedFuture(Either.left(var7));
      }
   );
   public static final Class9176 field42135 = method34289(
      "structure_references", field42134, 8, field42130, Class2076.field13524, (var0, var1, var2, var3) -> {
         Class1691 var6 = new Class1691(var0, var2);
         var1.method17827(var6, var0.method6893().method24339(var6), var3);
      }
   );
   public static final Class9176 field42136 = method34289(
      "biomes",
      field42135,
      0,
      field42130,
      Class2076.field13524,
      (var0, var1, var2, var3) -> var1.method17818(var0.method6867().<Class8907>method32453(Class2348.field16106), var3)
   );
   public static final Class9176 field42137 = method34289("noise", field42136, 8, field42130, Class2076.field13524, (var0, var1, var2, var3) -> {
      Class1691 var6 = new Class1691(var0, var2);
      var1.method17803(var6, var0.method6893().method24339(var6), var3);
   });
   public static final Class9176 field42138 = method34289(
      "surface", field42137, 0, field42130, Class2076.field13524, (var0, var1, var2, var3) -> var1.method17801(new Class1691(var0, var2), var3)
   );
   public static final Class9176 field42139 = method34289(
      "carvers",
      field42138,
      0,
      field42130,
      Class2076.field13524,
      (var0, var1, var2, var3) -> var1.method17819(var0.method6967(), var0.method6822(), var3, Class97.field259)
   );
   public static final Class9176 field42140 = method34289(
      "liquid_carvers",
      field42139,
      0,
      field42131,
      Class2076.field13524,
      (var0, var1, var2, var3) -> var1.method17819(var0.method6967(), var0.method6822(), var3, Class97.field260)
   );
   public static final Class9176 field42141 = method34290(
      "features", field42140, 8, field42131, Class2076.field13524, (var0, var1, var2, var3, var4, var5, var6, var7) -> {
         Class1672 var10 = (Class1672)var7;
         var10.method7119(var4);
         if (!var7.method7080().method34306(var0)) {
            Class7527.method24577(var7, EnumSet.<Class101>of(Class101.field299, Class101.field300, Class101.field298, Class101.field296));
            Class1691 var11 = new Class1691(var1, var6);
            var2.method17821(var11, var1.method6893().method24339(var11));
            var10.method7111(var0);
         }

         return CompletableFuture.completedFuture(Either.left(var7));
      }
   );
   public static final Class9176 field42142 = method34291(
      "light",
      field42141,
      1,
      field42131,
      Class2076.field13524,
      (var0, var1, var2, var3, var4, var5, var6, var7) -> method34288(var0, var4, var7),
      (var0, var1, var2, var3, var4, var5) -> method34288(var0, var3, var5)
   );
   public static final Class9176 field42143 = method34289(
      "spawn", field42142, 0, field42131, Class2076.field13524, (var0, var1, var2, var3) -> var1.method17809(new Class1691(var0, var2))
   );
   public static final Class9176 field42144 = method34289("heightmaps", field42143, 0, field42131, Class2076.field13524, (var0, var1, var2, var3) -> {
   });
   public static final Class9176 field42145 = method34291(
      "full",
      field42144,
      0,
      field42131,
      Class2076.field13525,
      (var0, var1, var2, var3, var4, var5, var6, var7) -> var5.apply(var7),
      (var0, var1, var2, var3, var4, var5) -> var4.apply(var5)
   );
   private static final List<Class9176> field42146 = ImmutableList.of(
      field42145, field42141, field42140, field42134, field42134, field42134, field42134, field42134, field42134, field42134, field42134
   );
   private static final IntList field42147 = Util.<IntList>method38508(new IntArrayList(method34292().size()), var0 -> {
      int var3 = 0;

      for (int var4 = method34292().size() - 1; var4 >= 0; var4--) {
         while (var3 + 1 < field42146.size() && var4 <= field42146.get(var3 + 1).method34297()) {
            var3++;
         }

         var0.add(0, var3);
      }
   });
   private final String field42148;
   private final int field42149;
   private final Class9176 field42150;
   private final Class6965 field42151;
   private final Class9241 field42152;
   private final int field42153;
   private final Class2076 field42154;
   private final EnumSet<Class101> field42155;

   private static CompletableFuture<Either<Class1670, Class7022>> method34288(Class9176 var0, Class195 var1, Class1670 var2) {
      boolean var5 = method34293(var0, var2);
      if (!var2.method7080().method34306(var0)) {
         ((Class1672)var2).method7111(var0);
      }

      return var1.method610(var2, var5).thenApply(Either::left);
   }

   private static Class9176 method34289(String var0, Class9176 var1, int var2, EnumSet<Class101> var3, Class2076 var4, Class6964 var5) {
      return method34290(var0, var1, var2, var3, var4, var5);
   }

   private static Class9176 method34290(String var0, Class9176 var1, int var2, EnumSet<Class101> var3, Class2076 var4, Class6965 var5) {
      return method34291(var0, var1, var2, var3, var4, var5, field42132);
   }

   private static Class9176 method34291(String var0, Class9176 var1, int var2, EnumSet<Class101> var3, Class2076 var4, Class6965 var5, Class9241 var6) {
      return Class2348.<Class9176>method9194(Class2348.field16081, var0, new Class9176(var0, var1, var2, var3, var4, var5, var6));
   }

   public static List<Class9176> method34292() {
      ArrayList var2 = Lists.newArrayList();

      Class9176 var3;
      for (var3 = field42145; var3.method34299() != var3; var3 = var3.method34299()) {
         var2.add(var3);
      }

      var2.add(var3);
      Collections.reverse(var2);
      return var2;
   }

   private static boolean method34293(Class9176 var0, Class1670 var1) {
      return var1.method7080().method34306(var0) && var1.method7095();
   }

   public static Class9176 method34294(int var0) {
      if (var0 < field42146.size()) {
         return var0 >= 0 ? field42146.get(var0) : field42145;
      } else {
         return field42133;
      }
   }

   public static int method34295() {
      return field42146.size();
   }

   public static int method34296(Class9176 var0) {
      return field42147.getInt(var0.method34297());
   }

   public Class9176(String var1, Class9176 var2, int var3, EnumSet<Class101> var4, Class2076 var5, Class6965 var6, Class9241 var7) {
      this.field42148 = var1;
      this.field42150 = var2 != null ? var2 : this;
      this.field42151 = var6;
      this.field42152 = var7;
      this.field42153 = var3;
      this.field42154 = var5;
      this.field42155 = var4;
      this.field42149 = var2 != null ? var2.method34297() + 1 : 0;
   }

   public int method34297() {
      return this.field42149;
   }

   public String method34298() {
      return this.field42148;
   }

   public Class9176 method34299() {
      return this.field42150;
   }

   public CompletableFuture<Either<Class1670, Class7022>> method34300(
      ServerWorld var1,
      Class5646 var2,
      Class8761 var3,
      Class195 var4,
      Function<Class1670, CompletableFuture<Either<Class1670, Class7022>>> var5,
      List<Class1670> var6
   ) {
      return this.field42151.method21487(this, var1, var2, var3, var4, var5, var6, (Class1670)var6.get(var6.size() / 2));
   }

   public CompletableFuture<Either<Class1670, Class7022>> method34301(
           ServerWorld var1, Class8761 var2, Class195 var3, Function<Class1670, CompletableFuture<Either<Class1670, Class7022>>> var4, Class1670 var5
   ) {
      return this.field42152.method34754(this, var1, var2, var3, var4, var5);
   }

   public int method34302() {
      return this.field42153;
   }

   public Class2076 method34303() {
      return this.field42154;
   }

   public static Class9176 method34304(String var0) {
      return Class2348.field16081.method9184(ResourceLocation.method8289(var0));
   }

   public EnumSet<Class101> method34305() {
      return this.field42155;
   }

   public boolean method34306(Class9176 var1) {
      return this.method34297() >= var1.method34297();
   }

   @Override
   public String toString() {
      return Class2348.field16081.method9181(this).toString();
   }
}
