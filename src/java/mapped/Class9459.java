package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.function.Supplier;

public final class Class9459 {
   public static final Codec<Class9459> field43951 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class9535.field44379.fieldOf("type").forGetter(Class9459::method36411),
               Class5646.field24984.fieldOf("generator").forGetter(Class9459::method36413)
            )
            .apply(var0, var0.stable(Class9459::new))
   );
   public static final Class8705<Class9459> field43952 = Class8705.<Class9459>method31395(Class2348.field16068, new ResourceLocation("overworld"));
   public static final Class8705<Class9459> field43953 = Class8705.<Class9459>method31395(Class2348.field16068, new ResourceLocation("the_nether"));
   public static final Class8705<Class9459> field43954 = Class8705.<Class9459>method31395(Class2348.field16068, new ResourceLocation("the_end"));
   private static final LinkedHashSet<Class8705<Class9459>> field43955 = Sets.newLinkedHashSet(ImmutableList.of(field43952, field43953, field43954));
   private final Supplier<Class9535> field43956;
   private final Class5646 field43957;

   public Class9459(Supplier<Class9535> var1, Class5646 var2) {
      this.field43956 = var1;
      this.field43957 = var2;
   }

   public Supplier<Class9535> method36411() {
      return this.field43956;
   }

   public Class9535 method36412() {
      return this.field43956.get();
   }

   public Class5646 method36413() {
      return this.field43957;
   }

   public static Class2350<Class9459> method36414(Class2350<Class9459> var0) {
      Class2350<Class9459> var3 = new Class2350<>(Class2348.field16068, Lifecycle.experimental());

      for (Class8705<Class9459> var5 : field43955) {
         Class9459 var6 = var0.method9183(var5);
         if (var6 != null) {
            var3.method9250(var5, var6, var0.method9185(var6));
         }
      }

      for (Entry<Class8705<Class9459>, Class9459> var8 : var0.method9191()) {
         Class8705<Class9459> var9 = var8.getKey();
         if (!field43955.contains(var9)) {
            var3.method9250(var9, var8.getValue(), var0.method9185(var8.getValue()));
         }
      }

      return var3;
   }

   public static boolean method36415(long var0, Class2350<Class9459> var2) {
      ArrayList var5 = Lists.newArrayList(var2.method9191());
      if (var5.size() == field43955.size()) {
         Entry var6 = (Entry)var5.get(0);
         Entry var7 = (Entry)var5.get(1);
         Entry var8 = (Entry)var5.get(2);
         if (var6.getKey() != field43952 || var7.getKey() != field43953 || var8.getKey() != field43954) {
            return false;
         } else if (!((Class9459)var6.getValue()).method36412().method36893(Class9535.field44374)
            && ((Class9459)var6.getValue()).method36412() != Class9535.field44378) {
            return false;
         } else if (!((Class9459)var7.getValue()).method36412().method36893(Class9535.field44375)) {
            return false;
         } else if (!((Class9459)var8.getValue()).method36412().method36893(Class9535.field44376)) {
            return false;
         } else if (((Class9459)var7.getValue()).method36413() instanceof Class5645 && ((Class9459)var8.getValue()).method36413() instanceof Class5645) {
            Class5645 var9 = (Class5645)((Class9459)var7.getValue()).method36413();
            Class5645 var10 = (Class5645)((Class9459)var8.getValue()).method36413();
            if (!var9.method17792(var0, Class9309.field43232)) {
               return false;
            } else if (!var10.method17792(var0, Class9309.field43233)) {
               return false;
            } else if (var9.method17824() instanceof Class1686) {
               Class1686 var11 = (Class1686)var9.method17824();
               if (!var11.method7210(var0)) {
                  return false;
               } else if (var10.method17824() instanceof Class1690) {
                  Class1690 var12 = (Class1690)var10.method17824();
                  return var12.method7236(var0);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
