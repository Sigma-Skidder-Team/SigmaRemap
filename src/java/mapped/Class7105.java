package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class Class7105 {
   private static final List<Class9127<Class8812>> field30617 = Lists.newArrayList();
   private static final List<Class9127<Class3257>> field30618 = Lists.newArrayList();
   private static final List<Class120> field30619 = Lists.newArrayList();
   private static final Predicate<Class8848> field30620 = var0 -> {
      for (Class120 var4 : field30619) {
         if (var4.test(var0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean method22132(Class8848 var0) {
      return method22133(var0) || method22134(var0);
   }

   public static boolean method22133(Class8848 var0) {
      int var3 = 0;

      for (int var4 = field30618.size(); var3 < var4; var3++) {
         if (Class9127.method34059(field30618.get(var3)).test(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method22134(Class8848 var0) {
      int var3 = 0;

      for (int var4 = field30617.size(); var3 < var4; var3++) {
         if (Class9127.method34059(field30617.get(var3)).test(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method22135(Class8812 var0) {
      int var3 = 0;

      for (int var4 = field30617.size(); var3 < var4; var3++) {
         if (Class9127.method34060(field30617.get(var3)) == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean method22136(Class8848 var0, Class8848 var1) {
      return !field30620.test(var0) ? false : method22137(var0, var1) || method22138(var0, var1);
   }

   public static boolean method22137(Class8848 var0, Class8848 var1) {
      Class3257 var4 = var0.method32107();
      int var5 = 0;

      for (int var6 = field30618.size(); var5 < var6; var5++) {
         Class9127 var7 = field30618.get(var5);
         if (Class9127.method34061(var7) == var4 && Class9127.method34059(var7).test(var1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method22138(Class8848 var0, Class8848 var1) {
      Class8812 var4 = Class9741.method38185(var0);
      int var5 = 0;

      for (int var6 = field30617.size(); var5 < var6; var5++) {
         Class9127 var7 = field30617.get(var5);
         if (Class9127.method34061(var7) == var4 && Class9127.method34059(var7).test(var1)) {
            return true;
         }
      }

      return false;
   }

   public static Class8848 method22139(Class8848 var0, Class8848 var1) {
      if (!var1.method32105()) {
         Class8812 var4 = Class9741.method38185(var1);
         Class3257 var5 = var1.method32107();
         int var6 = 0;

         for (int var7 = field30618.size(); var6 < var7; var6++) {
            Class9127 var8 = field30618.get(var6);
            if (Class9127.method34061(var8) == var5 && Class9127.method34059(var8).test(var0)) {
               return Class9741.method38187(new Class8848((Class3303)Class9127.method34060(var8)), var4);
            }
         }

         var6 = 0;

         for (int var10 = field30617.size(); var6 < var10; var6++) {
            Class9127 var11 = field30617.get(var6);
            if (Class9127.method34061(var11) == var4 && Class9127.method34059(var11).test(var0)) {
               return Class9741.method38187(new Class8848(var5), (Class8812)Class9127.method34060(var11));
            }
         }
      }

      return var1;
   }

   public static void method22140() {
      method22142(Class8514.field37971);
      method22142(Class8514.field38115);
      method22142(Class8514.field38118);
      method22141(Class8514.field37971, Class8514.field37840, Class8514.field38115);
      method22141(Class8514.field38115, Class8514.field38114, Class8514.field38118);
      method22143(Class8137.field34977, Class8514.field37980, Class8137.field34978);
      method22143(Class8137.field34977, Class8514.field37968, Class8137.field34978);
      method22143(Class8137.field34977, Class8514.field38080, Class8137.field34978);
      method22143(Class8137.field34977, Class8514.field37975, Class8137.field34978);
      method22143(Class8137.field34977, Class8514.field37973, Class8137.field34978);
      method22143(Class8137.field34977, Class8514.field37936, Class8137.field34978);
      method22143(Class8137.field34977, Class8514.field37976, Class8137.field34978);
      method22143(Class8137.field34977, Class8514.field37908, Class8137.field34979);
      method22143(Class8137.field34977, Class8514.field37887, Class8137.field34978);
      method22143(Class8137.field34977, Class8514.field37970, Class8137.field34980);
      method22143(Class8137.field34980, Class8514.field38057, Class8137.field34981);
      method22143(Class8137.field34981, Class8514.field37887, Class8137.field34982);
      method22143(Class8137.field34981, Class8514.field37974, Class8137.field34983);
      method22143(Class8137.field34982, Class8514.field37974, Class8137.field34984);
      method22143(Class8137.field34983, Class8514.field37887, Class8137.field34984);
      method22143(Class8137.field34980, Class8514.field37976, Class8137.field34988);
      method22143(Class8137.field34988, Class8514.field37887, Class8137.field34989);
      method22143(Class8137.field34980, Class8514.field38080, Class8137.field34985);
      method22143(Class8137.field34985, Class8514.field37887, Class8137.field34986);
      method22143(Class8137.field34985, Class8514.field37908, Class8137.field34987);
      method22143(Class8137.field34985, Class8514.field37974, Class8137.field34993);
      method22143(Class8137.field34986, Class8514.field37974, Class8137.field34994);
      method22143(Class8137.field34993, Class8514.field37887, Class8137.field34994);
      method22143(Class8137.field34993, Class8514.field37908, Class8137.field34995);
      method22143(Class8137.field34980, Class8514.field37792, Class8137.field34996);
      method22143(Class8137.field34996, Class8514.field37887, Class8137.field34997);
      method22143(Class8137.field34996, Class8514.field37908, Class8137.field34998);
      method22143(Class8137.field34990, Class8514.field37974, Class8137.field34993);
      method22143(Class8137.field34991, Class8514.field37974, Class8137.field34994);
      method22143(Class8137.field34980, Class8514.field37936, Class8137.field34990);
      method22143(Class8137.field34990, Class8514.field37887, Class8137.field34991);
      method22143(Class8137.field34990, Class8514.field37908, Class8137.field34992);
      method22143(Class8137.field34980, Class8514.field37912, Class8137.field34999);
      method22143(Class8137.field34999, Class8514.field37887, Class8137.field35000);
      method22143(Class8137.field34980, Class8514.field37980, Class8137.field35001);
      method22143(Class8137.field35001, Class8514.field37908, Class8137.field35002);
      method22143(Class8137.field35001, Class8514.field37974, Class8137.field35003);
      method22143(Class8137.field35002, Class8514.field37974, Class8137.field35004);
      method22143(Class8137.field35003, Class8514.field37908, Class8137.field35004);
      method22143(Class8137.field35005, Class8514.field37974, Class8137.field35003);
      method22143(Class8137.field35006, Class8514.field37974, Class8137.field35003);
      method22143(Class8137.field35007, Class8514.field37974, Class8137.field35004);
      method22143(Class8137.field34980, Class8514.field37973, Class8137.field35005);
      method22143(Class8137.field35005, Class8514.field37887, Class8137.field35006);
      method22143(Class8137.field35005, Class8514.field37908, Class8137.field35007);
      method22143(Class8137.field34980, Class8514.field37968, Class8137.field35008);
      method22143(Class8137.field35008, Class8514.field37887, Class8137.field35009);
      method22143(Class8137.field35008, Class8514.field37908, Class8137.field35010);
      method22143(Class8137.field34980, Class8514.field37975, Class8137.field35011);
      method22143(Class8137.field35011, Class8514.field37887, Class8137.field35012);
      method22143(Class8137.field35011, Class8514.field37908, Class8137.field35013);
      method22143(Class8137.field34977, Class8514.field37974, Class8137.field35014);
      method22143(Class8137.field35014, Class8514.field37887, Class8137.field35015);
      method22143(Class8137.field34980, Class8514.field38145, Class8137.field35017);
      method22143(Class8137.field35017, Class8514.field37887, Class8137.field35018);
   }

   private static void method22141(Class3257 var0, Class3257 var1, Class3257 var2) {
      if (var0 instanceof Class3323) {
         if (var2 instanceof Class3323) {
            field30618.add(new Class9127<Class3257>(var0, Class120.method339(var1), var2));
         } else {
            throw new IllegalArgumentException("Expected a potion, got: " + Class2348.field16075.method9181(var2));
         }
      } else {
         throw new IllegalArgumentException("Expected a potion, got: " + Class2348.field16075.method9181(var0));
      }
   }

   private static void method22142(Class3257 var0) {
      if (var0 instanceof Class3323) {
         field30619.add(Class120.method339(var0));
      } else {
         throw new IllegalArgumentException("Expected a potion, got: " + Class2348.field16075.method9181(var0));
      }
   }

   private static void method22143(Class8812 var0, Class3257 var1, Class8812 var2) {
      field30617.add(new Class9127<Class8812>(var0, Class120.method339(var1), var2));
   }
}
