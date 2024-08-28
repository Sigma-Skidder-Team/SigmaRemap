package mapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Class5647 extends Class5646 {
   private static String[] field24990;
   public static final Codec<Class5647> field24991 = Class8611.<Class8907>method30859(Class2348.field16106)
      .xmap(Class5647::new, Class5647::method17834)
      .stable()
      .codec();
   private static final List<Class7380> field24992 = StreamSupport.<Block>stream(Class2348.field16072.spliterator(), false)
      .<Class7380>flatMap(var0 -> var0.method11577().method35392().stream())
      .collect(Collectors.<Class7380>toList());
   private static final int field24993 = Class9679.method37773(Class9679.method37765((float)field24992.size()));
   private static final int field24994 = Class9679.method37773((float)field24992.size() / (float)field24993);
   public static final Class7380 field24995 = Blocks.AIR.method11579();
   public static final Class7380 field24996 = Blocks.field36765.method11579();
   private final Class2348<Class8907> field24997;

   public Class5647(Class2348<Class8907> var1) {
      super(new Class1688(var1.method9189(Class9495.field44122)), new Class9763(false));
      this.field24997 = var1;
   }

   public Class2348<Class8907> method17834() {
      return this.field24997;
   }

   @Override
   public Codec<? extends Class5646> method17790() {
      return field24991;
   }

   @Override
   public Class5646 method17791(long var1) {
      return this;
   }

   @Override
   public void method17801(Class1691 var1, Class1670 var2) {
   }

   @Override
   public void method17819(long var1, Class6668 var3, Class1670 var4, Class97 var5) {
   }

   @Override
   public void method17821(Class1691 var1, Class7480 var2) {
      Mutable var5 = new Mutable();
      int var6 = var1.method7241();
      int var7 = var1.method7242();

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            int var10 = (var6 << 4) + var8;
            int var11 = (var7 << 4) + var9;
            var1.method6725(var5.method8372(var10, 60, var11), field24996, 2);
            Class7380 var12 = method17835(var10, var11);
            if (var12 != null) {
               var1.method6725(var5.method8372(var10, 70, var11), var12, 2);
            }
         }
      }
   }

   @Override
   public void method17803(Class1660 var1, Class7480 var2, Class1670 var3) {
   }

   @Override
   public int method17797(int var1, int var2, Class101 var3) {
      return 0;
   }

   @Override
   public Class1665 method17798(int var1, int var2) {
      return new Class1669(new Class7380[0]);
   }

   public static Class7380 method17835(int var0, int var1) {
      Class7380 var4 = field24995;
      if (var0 > 0 && var1 > 0 && var0 % 2 != 0 && var1 % 2 != 0) {
         var0 /= 2;
         var1 /= 2;
         if (var0 <= field24993 && var1 <= field24994) {
            int var5 = Class9679.method37772(var0 * field24993 + var1);
            if (var5 < field24992.size()) {
               var4 = field24992.get(var5);
            }
         }
      }

      return var4;
   }
}
