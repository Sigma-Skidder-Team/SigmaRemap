package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7481 implements class_5990 {
   private static final Logger field_38188 = LogManager.getLogger();
   private final class_2034 field_38177;
   private volatile boolean field_38185;
   private class_546 field_38174;
   private volatile class_4663 field_38173;
   private final Map<class_3801, class_2131> field_38183 = Maps.newEnumMap(class_3801.class);
   private volatile class_7335 field_38182 = class_7335.field_37504;
   private final Map<class_1331, class_3757> field_38187 = Maps.newHashMap();
   private final Map<class_1331, class_5734> field_38180 = Maps.newHashMap();
   private final class_1315[] field_38175 = new class_1315[16];
   private final List<class_5734> field_38179 = Lists.newArrayList();
   private final List<class_1331> field_38171 = Lists.newArrayList();
   private final ShortList[] field_38178 = new ShortList[16];
   private final Map<class_5390<?>, class_3200<?>> field_38189 = Maps.newHashMap();
   private final Map<class_5390<?>, LongSet> field_38172 = Maps.newHashMap();
   private final class_6397 field_38186;
   private final class_2080<class_6414> field_38190;
   private final class_2080<class_2340> field_38170;
   private long field_38184;
   private final Map<class_6033, BitSet> field_38176 = new Object2ObjectArrayMap();
   private volatile boolean field_38191;

   public class_7481(class_2034 var1, class_6397 var2) {
      this(
         var1,
         var2,
         (class_1315[])null,
         new class_2080<class_6414>(var0 -> var0 == null || var0.method_29260().method_8345(), var1),
         new class_2080<class_2340>(var0 -> var0 == null || var0 == class_8532.field_43673, var1)
      );
   }

   public class_7481(class_2034 var1, class_6397 var2, class_1315[] var3, class_2080<class_6414> var4, class_2080<class_2340> var5) {
      this.field_38177 = var1;
      this.field_38186 = var2;
      this.field_38190 = var4;
      this.field_38170 = var5;
      if (var3 != null) {
         if (this.field_38175.length != var3.length) {
            field_38188.warn("Could not set level chunk sections, array length is {} instead of {}", var3.length, this.field_38175.length);
         } else {
            System.arraycopy(var3, 0, this.field_38175, 0, this.field_38175.length);
         }
      }
   }

   @Override
   public class_2522 method_28262(class_1331 var1) {
      int var4 = var1.method_12165();
      if (!class_6486.method_29571(var4)) {
         class_1315 var5 = this.method_27349()[var4 >> 4];
         return !class_1315.method_6003(var5)
            ? var5.method_5999(var1.method_12173() & 15, var4 & 15, var1.method_12185() & 15)
            : class_4783.field_23184.method_29260();
      } else {
         return class_4783.field_23424.method_29260();
      }
   }

   @Override
   public class_4774 method_28258(class_1331 var1) {
      int var4 = var1.method_12165();
      if (!class_6486.method_29571(var4)) {
         class_1315 var5 = this.method_27349()[var4 >> 4];
         return !class_1315.method_6003(var5)
            ? var5.method_5986(var1.method_12173() & 15, var4 & 15, var1.method_12185() & 15)
            : class_8532.field_43673.method_10710();
      } else {
         return class_8532.field_43673.method_10710();
      }
   }

   @Override
   public Stream<class_1331> method_27360() {
      return this.field_38171.stream();
   }

   public ShortList[] method_34029() {
      ShortList[] var3 = new ShortList[16];

      for (class_1331 var5 : this.field_38171) {
         class_5990.method_27337(var3, var5.method_12165() >> 4).add(method_34024(var5));
      }

      return var3;
   }

   public void method_34018(short var1, int var2) {
      this.method_34021(method_34017(var1, var2, this.field_38177));
   }

   public void method_34021(class_1331 var1) {
      this.field_38171.add(var1.method_6072());
   }

   @Nullable
   @Override
   public class_2522 method_27348(class_1331 var1, class_2522 var2, boolean var3) {
      int var6 = var1.method_12173();
      int var7 = var1.method_12165();
      int var8 = var1.method_12185();
      if (var7 >= 0 && var7 < 256) {
         if (this.field_38175[var7 >> 4] == class_2654.field_13073 && var2.method_8350(class_4783.field_23184)) {
            return var2;
         } else {
            if (var2.method_8339() > 0) {
               this.field_38171.add(new class_1331((var6 & 15) + this.method_27352().method_9535(), var7, (var8 & 15) + this.method_27352().method_9545()));
            }

            class_1315 var9 = this.method_34031(var7 >> 4);
            class_2522 var10 = var9.method_5988(var6 & 15, var7 & 15, var8 & 15, var2);
            if (this.field_38182.method_33453(class_7335.field_37499)
               && var2 != var10
               && (
                  var2.method_8320(this, var1) != var10.method_8320(this, var1)
                     || var2.method_8339() != var10.method_8339()
                     || var2.method_8358()
                     || var10.method_8358()
               )) {
               class_4663 var11 = this.method_34026();
               var11.method_21566(var1);
            }

            EnumSet var16 = this.method_27364().method_33447();
            EnumSet var12 = null;

            for (class_3801 var14 : var16) {
               class_2131 var15 = this.field_38183.get(var14);
               if (var15 == null) {
                  if (var12 == null) {
                     var12 = EnumSet.<class_3801>noneOf(class_3801.class);
                  }

                  var12.add(var14);
               }
            }

            if (var12 != null) {
               class_2131.method_9953(this, var12);
            }

            for (class_3801 var18 : var16) {
               this.field_38183.get(var18).method_9958(var6 & 15, var7, var8 & 15, var2);
            }

            return var10;
         }
      } else {
         return class_4783.field_23424.method_29260();
      }
   }

   public class_1315 method_34031(int var1) {
      if (this.field_38175[var1] == class_2654.field_13073) {
         this.field_38175[var1] = new class_1315(var1 << 4);
      }

      return this.field_38175[var1];
   }

   @Override
   public void method_27346(class_1331 var1, class_3757 var2) {
      var2.method_17390(var1);
      this.field_38187.put(var1, var2);
   }

   @Override
   public Set<class_1331> method_27366() {
      HashSet var3 = Sets.newHashSet(this.field_38180.keySet());
      var3.addAll(this.field_38187.keySet());
      return var3;
   }

   @Nullable
   @Override
   public class_3757 method_28260(class_1331 var1) {
      return this.field_38187.get(var1);
   }

   public Map<class_1331, class_3757> method_34025() {
      return this.field_38187;
   }

   public void method_34020(class_5734 var1) {
      this.field_38179.add(var1);
   }

   @Override
   public void method_27342(class_8145 var1) {
      if (!var1.method_37070()) {
         class_5734 var4 = new class_5734();
         var1.method_37350(var4);
         this.method_34020(var4);
      }
   }

   public List<class_5734> method_34027() {
      return this.field_38179;
   }

   public void method_34032(class_546 var1) {
      this.field_38174 = var1;
   }

   @Nullable
   @Override
   public class_546 method_27356() {
      return this.field_38174;
   }

   @Override
   public void method_27361(boolean var1) {
      this.field_38185 = var1;
   }

   @Override
   public boolean method_27358() {
      return this.field_38185;
   }

   @Override
   public class_7335 method_27364() {
      return this.field_38182;
   }

   public void method_34030(class_7335 var1) {
      this.field_38182 = var1;
      this.method_27361(true);
   }

   @Override
   public class_1315[] method_27349() {
      return this.field_38175;
   }

   @Nullable
   public class_4663 method_34026() {
      return this.field_38173;
   }

   @Override
   public Collection<Entry<class_3801, class_2131>> method_27354() {
      return Collections.<Entry<class_3801, class_2131>>unmodifiableSet(this.field_38183.entrySet());
   }

   @Override
   public void method_27357(class_3801 var1, long[] var2) {
      this.method_27353(var1).method_9955(var2);
   }

   @Override
   public class_2131 method_27353(class_3801 var1) {
      return this.field_38183.computeIfAbsent(var1, var1x -> new class_2131(this, var1x));
   }

   @Override
   public int method_27367(class_3801 var1, int var2, int var3) {
      class_2131 var6 = this.field_38183.get(var1);
      if (var6 == null) {
         class_2131.method_9953(this, EnumSet.<class_3801>of(var1));
         var6 = this.field_38183.get(var1);
      }

      return var6.method_9957(var2 & 15, var3 & 15) - 1;
   }

   @Override
   public class_2034 method_27352() {
      return this.field_38177;
   }

   @Override
   public void method_27344(long var1) {
   }

   @Nullable
   @Override
   public class_3200<?> method_15062(class_5390<?> var1) {
      return this.field_38189.get(var1);
   }

   @Override
   public void method_15064(class_5390<?> var1, class_3200<?> var2) {
      this.field_38189.put(var1, var2);
      this.field_38185 = true;
   }

   @Override
   public Map<class_5390<?>, class_3200<?>> method_27363() {
      return Collections.<class_5390<?>, class_3200<?>>unmodifiableMap(this.field_38189);
   }

   @Override
   public void method_27351(Map<class_5390<?>, class_3200<?>> var1) {
      this.field_38189.clear();
      this.field_38189.putAll(var1);
      this.field_38185 = true;
   }

   @Override
   public LongSet method_15067(class_5390<?> var1) {
      return this.field_38172.computeIfAbsent(var1, var0 -> new LongOpenHashSet());
   }

   @Override
   public void method_15063(class_5390<?> var1, long var2) {
      this.field_38172.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
      this.field_38185 = true;
   }

   @Override
   public Map<class_5390<?>, LongSet> method_15066() {
      return Collections.<class_5390<?>, LongSet>unmodifiableMap(this.field_38172);
   }

   @Override
   public void method_15065(Map<class_5390<?>, LongSet> var1) {
      this.field_38172.clear();
      this.field_38172.putAll(var1);
      this.field_38185 = true;
   }

   public static short method_34024(class_1331 var0) {
      int var3 = var0.method_12173();
      int var4 = var0.method_12165();
      int var5 = var0.method_12185();
      int var6 = var3 & 15;
      int var7 = var4 & 15;
      int var8 = var5 & 15;
      return (short)(var6 | var7 << 4 | var8 << 8);
   }

   public static class_1331 method_34017(short var0, int var1, class_2034 var2) {
      int var5 = (var0 & 15) + (var2.field_10328 << 4);
      int var6 = (var0 >>> 4 & 15) + (var1 << 4);
      int var7 = (var0 >>> 8 & 15) + (var2.field_10327 << 4);
      return new class_1331(var5, var6, var7);
   }

   @Override
   public void method_27365(class_1331 var1) {
      if (!class_6486.method_29556(var1)) {
         class_5990.method_27337(this.field_38178, var1.method_12165() >> 4).add(method_34024(var1));
      }
   }

   @Override
   public ShortList[] method_27359() {
      return this.field_38178;
   }

   @Override
   public void method_27341(short var1, int var2) {
      class_5990.method_27337(this.field_38178, var2).add(var1);
   }

   public class_2080<class_6414> method_34015() {
      return this.field_38190;
   }

   public class_2080<class_2340> method_34016() {
      return this.field_38170;
   }

   @Override
   public class_6397 method_27343() {
      return this.field_38186;
   }

   @Override
   public void method_27369(long var1) {
      this.field_38184 = var1;
   }

   @Override
   public long method_27340() {
      return this.field_38184;
   }

   @Override
   public void method_27347(class_5734 var1) {
      this.field_38180.put(new class_1331(var1.method_25947("x"), var1.method_25947("y"), var1.method_25947("z")), var1);
   }

   public Map<class_1331, class_5734> method_34022() {
      return Collections.<class_1331, class_5734>unmodifiableMap(this.field_38180);
   }

   @Override
   public class_5734 method_27355(class_1331 var1) {
      return this.field_38180.get(var1);
   }

   @Nullable
   @Override
   public class_5734 method_27345(class_1331 var1) {
      class_3757 var4 = this.method_28260(var1);
      return var4 == null ? this.field_38180.get(var1) : var4.method_17396(new class_5734());
   }

   @Override
   public void method_27370(class_1331 var1) {
      this.field_38187.remove(var1);
      this.field_38180.remove(var1);
   }

   @Nullable
   public BitSet method_34023(class_6033 var1) {
      return this.field_38176.get(var1);
   }

   public BitSet method_34019(class_6033 var1) {
      return this.field_38176.computeIfAbsent(var1, var0 -> new BitSet(65536));
   }

   public void method_34014(class_6033 var1, BitSet var2) {
      this.field_38176.put(var1, var2);
   }

   public void method_34033(class_4663 var1) {
      this.field_38173 = var1;
   }

   @Override
   public boolean method_27339() {
      return this.field_38191;
   }

   @Override
   public void method_27362(boolean var1) {
      this.field_38191 = var1;
      this.method_27361(true);
   }
}
