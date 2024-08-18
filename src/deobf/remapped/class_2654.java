package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2654 implements class_5990 {
   private static final Logger field_13080 = LogManager.getLogger();
   public static final class_1315 field_13073 = null;
   private final class_1315[] field_13068 = new class_1315[16];
   private class_546 field_13076;
   private final Map<BlockPos, CompoundNBT> field_13082 = Maps.newHashMap();
   public boolean field_13081;
   private final World field_13074;
   private final Map<class_3801, class_2131> field_13066 = Maps.newEnumMap(class_3801.class);
   private final class_6397 field_13069;
   private final Map<BlockPos, class_3757> field_13088 = Maps.newHashMap();
   private final class_4722<Entity>[] field_13083;
   private final Map<class_5390<?>, class_3200<?>> field_13070 = Maps.newHashMap();
   private final Map<class_5390<?>, LongSet> field_13079 = Maps.newHashMap();
   private final ShortList[] field_13078 = new ShortList[16];
   private class_3065<class_6414> field_13085;
   private class_3065<class_2340> field_13072;
   private boolean field_13087;
   private long field_13071;
   private volatile boolean field_13065;
   private long field_13077;
   private Supplier<class_7581> field_13075;
   private Consumer<class_2654> field_13086;
   private final class_2034 field_13067;
   private volatile boolean field_13084;

   public class_2654(World var1, class_2034 var2, class_546 var3) {
      this(
         var1,
         var2,
         var3,
         class_6397.field_32658,
         class_5389.<class_6414>method_24539(),
         class_5389.<class_2340>method_24539(),
         0L,
         (class_1315[])null,
         (Consumer<class_2654>)null
      );
   }

   public class_2654(
      World var1,
      class_2034 var2,
      class_546 var3,
      class_6397 var4,
      class_3065<class_6414> var5,
      class_3065<class_2340> var6,
      long var7,
      class_1315[] var9,
      Consumer<class_2654> var10
   ) {
      this.field_13083 = new class_4722[16];
      this.field_13074 = var1;
      this.field_13067 = var2;
      this.field_13069 = var4;

      for (class_3801 var16 : class_3801.values()) {
         if (class_7335.field_37514.method_33447().contains(var16)) {
            this.field_13066.put(var16, new class_2131(this, var16));
         }
      }

      for (int var17 = 0; var17 < this.field_13083.length; var17++) {
         this.field_13083[var17] = new class_4722<Entity>(Entity.class);
      }

      this.field_13076 = var3;
      this.field_13085 = var5;
      this.field_13072 = var6;
      this.field_13077 = var7;
      this.field_13086 = var10;
      if (var9 != null) {
         if (this.field_13068.length != var9.length) {
            field_13080.warn("Could not set level chunk sections, array length is {} instead of {}", var9.length, this.field_13068.length);
         } else {
            System.arraycopy(var9, 0, this.field_13068, 0, this.field_13068.length);
         }
      }
   }

   public class_2654(World var1, class_7481 var2) {
      this(
         var1,
         var2.method_27352(),
         var2.method_27356(),
         var2.method_27343(),
         var2.method_34015(),
         var2.method_34016(),
         var2.method_27340(),
         var2.method_27349(),
         (Consumer<class_2654>)null
      );

      for (CompoundNBT var6 : var2.method_34027()) {
         EntityType.method_30455(var6, var1, var1x -> {
            this.method_27342(var1x);
            return var1x;
         });
      }

      for (class_3757 var10 : var2.method_34025().values()) {
         this.method_11982(var10);
      }

      this.field_13082.putAll(var2.method_34022());

      for (int var8 = 0; var8 < var2.method_27359().length; var8++) {
         this.field_13078[var8] = var2.method_27359()[var8];
      }

      this.method_27351(var2.method_27363());
      this.method_15065(var2.method_15066());

      for (Entry var11 : var2.method_27354()) {
         if (class_7335.field_37514.method_33447().contains(var11.getKey())) {
            this.method_27353((class_3801)var11.getKey()).method_9955(((class_2131)var11.getValue()).method_9954());
         }
      }

      this.method_27362(var2.method_27339());
      this.field_13065 = true;
   }

   @Override
   public class_2131 method_27353(class_3801 var1) {
      return this.field_13066.computeIfAbsent(var1, var1x -> new class_2131(this, var1x));
   }

   @Override
   public Set<BlockPos> method_27366() {
      HashSet var3 = Sets.newHashSet(this.field_13082.keySet());
      var3.addAll(this.field_13088.keySet());
      return var3;
   }

   @Override
   public class_1315[] method_27349() {
      return this.field_13068;
   }

   @Override
   public class_2522 method_28262(BlockPos var1) {
      int var4 = var1.getX();
      int var5 = var1.getY();
      int var6 = var1.getZ();
      if (this.field_13074.method_29581()) {
         class_2522 var11 = null;
         if (var5 == 60) {
            var11 = class_4783.field_23207.method_29260();
         }

         if (var5 == 70) {
            var11 = class_8510.method_39186(var4, var6);
         }

         return var11 == null ? class_4783.field_23184.method_29260() : var11;
      } else {
         try {
            if (var5 >= 0 && var5 >> 4 < this.field_13068.length) {
               class_1315 var7 = this.field_13068[var5 >> 4];
               if (!class_1315.method_6003(var7)) {
                  return var7.method_5999(var4 & 15, var5 & 15, var6 & 15);
               }
            }

            return class_4783.field_23184.method_29260();
         } catch (Throwable var10) {
            class_159 var8 = class_159.method_643(var10, "Getting block state");
            class_6544 var9 = var8.method_639("Block being got");
            var9.method_29851("Location", () -> class_6544.method_29845(var4, var5, var6));
            throw new class_3297(var8);
         }
      }
   }

   @Override
   public class_4774 method_28258(BlockPos var1) {
      return this.method_11985(var1.getX(), var1.getY(), var1.getZ());
   }

   public class_4774 method_11985(int var1, int var2, int var3) {
      try {
         if (var2 >= 0 && var2 >> 4 < this.field_13068.length) {
            class_1315 var6 = this.field_13068[var2 >> 4];
            if (!class_1315.method_6003(var6)) {
               return var6.method_5986(var1 & 15, var2 & 15, var3 & 15);
            }
         }

         return class_8532.field_43673.method_10710();
      } catch (Throwable var9) {
         class_159 var7 = class_159.method_643(var9, "Getting fluid state");
         class_6544 var8 = var7.method_639("Block being got");
         var8.method_29851("Location", () -> class_6544.method_29845(var1, var2, var3));
         throw new class_3297(var7);
      }
   }

   @Nullable
   @Override
   public class_2522 method_27348(BlockPos var1, class_2522 var2, boolean var3) {
      int var6 = var1.getX() & 15;
      int var7 = var1.getY();
      int var8 = var1.getZ() & 15;
      class_1315 var9 = this.field_13068[var7 >> 4];
      if (var9 == field_13073) {
         if (var2.method_8345()) {
            return null;
         }

         var9 = new class_1315(var7 >> 4 << 4);
         this.field_13068[var7 >> 4] = var9;
      }

      boolean var10 = var9.method_6002();
      class_2522 var11 = var9.method_5988(var6, var7 & 15, var8, var2);
      if (var11 != var2) {
         class_6414 var12 = var2.method_8360();
         class_6414 var13 = var11.method_8360();
         this.field_13066.get(class_3801.field_18595).method_9958(var6, var7, var8, var2);
         this.field_13066.get(class_3801.field_18590).method_9958(var6, var7, var8, var2);
         this.field_13066.get(class_3801.field_18599).method_9958(var6, var7, var8, var2);
         this.field_13066.get(class_3801.field_18592).method_9958(var6, var7, var8, var2);
         boolean var14 = var9.method_6002();
         if (var10 != var14) {
            this.field_13074.method_43363().method_14813().method_34831(var1, var14);
         }

         if (this.field_13074.field_33055) {
            if (var13 != var12 && var13 instanceof class_724) {
               this.field_13074.method_29597(var1);
            }
         } else {
            var11.method_8301(this.field_13074, var1, var2, var3);
         }

         if (var9.method_5999(var6, var7 & 15, var8).method_8350(var12)) {
            if (var13 instanceof class_724) {
               class_3757 var15 = this.method_11988(var1, class_1628.field_8476);
               if (var15 != null) {
                  var15.method_17400();
               }
            }

            if (!this.field_13074.field_33055) {
               var2.method_8363(this.field_13074, var1, var11, var3);
            }

            if (var12 instanceof class_724) {
               class_3757 var16 = this.method_11988(var1, class_1628.field_8476);
               if (var16 != null) {
                  var16.method_17400();
               } else {
                  var16 = ((class_724)var12).method_3281(this.field_13074);
                  this.field_13074.method_29558(var1, var16);
               }
            }

            this.field_13065 = true;
            return var11;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Nullable
   public class_4663 method_11983() {
      return this.field_13074.method_43363().method_14813();
   }

   @Override
   public void method_27342(Entity var1) {
      this.field_13087 = true;
      int var4 = MathHelper.floor(var1.getPosX() / 16.0);
      int var5 = MathHelper.floor(var1.getPosZ() / 16.0);
      if (var4 != this.field_13067.field_10328 || var5 != this.field_13067.field_10327) {
         field_13080.warn("Wrong location! ({}, {}) should be ({}, {}), {}", var4, var5, this.field_13067.field_10328, this.field_13067.field_10327, var1);
         var1.removed = true;
      }

      int var6 = MathHelper.floor(var1.method_37309() / 16.0);
      if (var6 < 0) {
         var6 = 0;
      }

      if (var6 >= this.field_13083.length) {
         var6 = this.field_13083.length - 1;
      }

      var1.field_41727 = true;
      var1.field_41742 = this.field_13067.field_10328;
      var1.field_41747 = var6;
      var1.field_41714 = this.field_13067.field_10327;
      this.field_13083[var6].add(var1);
   }

   @Override
   public void method_27357(class_3801 var1, long[] var2) {
      this.field_13066.get(var1).method_9955(var2);
   }

   public void method_11995(Entity var1) {
      this.method_12000(var1, var1.field_41747);
   }

   public void method_12000(Entity var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= this.field_13083.length) {
         var2 = this.field_13083.length - 1;
      }

      this.field_13083[var2].remove(var1);
   }

   @Override
   public int method_27367(class_3801 var1, int var2, int var3) {
      return this.field_13066.get(var1).method_9957(var2 & 15, var3 & 15) - 1;
   }

   @Nullable
   private class_3757 method_11991(BlockPos var1) {
      class_2522 var4 = this.method_28262(var1);
      class_6414 var5 = var4.method_8360();
      return var5.method_10802() ? ((class_724)var5).method_3281(this.field_13074) : null;
   }

   @Nullable
   @Override
   public class_3757 method_28260(BlockPos var1) {
      return this.method_11988(var1, class_1628.field_8476);
   }

   @Nullable
   public class_3757 method_11988(BlockPos var1, class_1628 var2) {
      class_3757 var5 = this.field_13088.get(var1);
      if (var5 == null) {
         CompoundNBT var6 = this.field_13082.remove(var1);
         if (var6 != null) {
            class_3757 var7 = this.method_11980(var1, var6);
            if (var7 != null) {
               return var7;
            }
         }
      }

      if (var5 != null) {
         if (var5.method_17395()) {
            this.field_13088.remove(var1);
            return null;
         }
      } else if (var2 == class_1628.field_8478) {
         var5 = this.method_11991(var1);
         this.field_13074.method_29558(var1, var5);
      }

      return var5;
   }

   public void method_11982(class_3757 var1) {
      this.method_27346(var1.method_17399(), var1);
      if (this.field_13081 || this.field_13074.method_22567()) {
         this.field_13074.method_29558(var1.method_17399(), var1);
      }
   }

   @Override
   public void method_27346(BlockPos var1, class_3757 var2) {
      if (this.method_28262(var1).method_8360() instanceof class_724) {
         var2.method_17393(this.field_13074, var1);
         var2.method_17412();
         class_3757 var5 = this.field_13088.put(var1.method_6072(), var2);
         if (var5 != null && var5 != var2) {
            var5.method_17406();
         }
      }
   }

   @Override
   public void method_27347(CompoundNBT var1) {
      this.field_13082.put(new BlockPos(var1.method_25947("x"), var1.method_25947("y"), var1.method_25947("z")), var1);
   }

   @Nullable
   @Override
   public CompoundNBT method_27345(BlockPos var1) {
      class_3757 var4 = this.method_28260(var1);
      if (var4 != null && !var4.method_17395()) {
         CompoundNBT var6 = var4.method_17396(new CompoundNBT());
         var6.putBoolean("keepPacked", false);
         return var6;
      } else {
         CompoundNBT var5 = this.field_13082.get(var1);
         if (var5 != null) {
            var5 = var5.method_25944();
            var5.putBoolean("keepPacked", true);
         }

         return var5;
      }
   }

   @Override
   public void method_27370(BlockPos var1) {
      if (this.field_13081 || this.field_13074.method_22567()) {
         class_3757 var4 = this.field_13088.remove(var1);
         if (var4 != null) {
            var4.method_17406();
         }
      }
   }

   public void method_12002() {
      if (this.field_13086 != null) {
         this.field_13086.accept(this);
         this.field_13086 = null;
      }
   }

   public void method_11992() {
      this.field_13065 = true;
   }

   public void method_11990(Entity var1, Box var2, List<Entity> var3, Predicate<? super Entity> var4) {
      int var7 = MathHelper.floor((var2.field_19937 - 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.field_19939 + 2.0) / 16.0);
      var7 = MathHelper.clamp(var7, 0, this.field_13083.length - 1);
      var8 = MathHelper.clamp(var8, 0, this.field_13083.length - 1);

      for (int var9 = var7; var9 <= var8; var9++) {
         class_4722 var10 = this.field_13083[var9];
         List var11 = var10.method_21834();
         int var12 = var11.size();

         for (int var13 = 0; var13 < var12; var13++) {
            Entity var14 = (Entity)var11.get(var13);
            if (var14.getBoundingBox().method_18909(var2) && var14 != var1) {
               if (var4 == null || var4.test(var14)) {
                  var3.add(var14);
               }

               if (var14 instanceof class_2770) {
                  for (class_5708 var18 : ((class_2770)var14).method_12615()) {
                     if (var18 != var1 && var18.getBoundingBox().method_18909(var2) && (var4 == null || var4.test(var18))) {
                        var3.add(var18);
                     }
                  }
               }
            }
         }
      }
   }

   public <T extends Entity> void method_11998(EntityType<?> var1, Box var2, List<? super T> var3, Predicate<? super T> var4) {
      int var7 = MathHelper.floor((var2.field_19937 - 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.field_19939 + 2.0) / 16.0);
      var7 = MathHelper.clamp(var7, 0, this.field_13083.length - 1);
      var8 = MathHelper.clamp(var8, 0, this.field_13083.length - 1);

      for (int var9 = var7; var9 <= var8; var9++) {
         for (Entity var11 : this.field_13083[var9].<Entity>method_21835(Entity.class)) {
            if ((var1 == null || var11.getType() == var1) && var11.getBoundingBox().method_18909(var2) && var4.test(var11)) {
               var3.add(var11);
            }
         }
      }
   }

   public <T extends Entity> void method_11994(Class<? extends T> var1, Box var2, List<T> var3, Predicate<? super T> var4) {
      int var7 = MathHelper.floor((var2.field_19937 - 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.field_19939 + 2.0) / 16.0);
      var7 = MathHelper.clamp(var7, 0, this.field_13083.length - 1);
      var8 = MathHelper.clamp(var8, 0, this.field_13083.length - 1);

      for (int var9 = var7; var9 <= var8; var9++) {
         for (Entity var11 : this.field_13083[var9].method_21835(var1)) {
            if (var11.getBoundingBox().method_18909(var2) && (var4 == null || var4.test(var11))) {
               var3.add(var11);
            }
         }
      }
   }

   public boolean method_12003() {
      return false;
   }

   @Override
   public class_2034 method_27352() {
      return this.field_13067;
   }

   public void method_11984(class_546 var1, class_8248 var2, CompoundNBT var3, int var4) {
      boolean var7 = var1 != null;
      Predicate var8 = !var7 ? var1x -> (var4 & 1 << (var1x.method_12165() >> 4)) != 0 : var0 -> true;
      Sets.newHashSet(this.field_13088.keySet()).stream().filter(var8).forEach(this.field_13074::method_29597);

      for (int var9 = 0; var9 < this.field_13068.length; var9++) {
         class_1315 var10 = this.field_13068[var9];
         if ((var4 & 1 << var9) != 0) {
            if (var10 == field_13073) {
               var10 = new class_1315(var9 << 4);
               this.field_13068[var9] = var10;
            }

            var10.method_6001(var2);
         } else if (var7 && var10 != field_13073) {
            this.field_13068[var9] = field_13073;
         }
      }

      if (var1 != null) {
         this.field_13076 = var1;
      }

      for (class_3801 var12 : class_3801.values()) {
         String var13 = var12.method_17676();
         if (var3.contains(var13, 12)) {
            this.method_27357(var12, var3.method_25942(var13));
         }
      }

      for (class_3757 var17 : this.field_13088.values()) {
         var17.method_17400();
      }
   }

   @Override
   public class_546 method_27356() {
      return this.field_13076;
   }

   public void method_11981(boolean var1) {
      this.field_13081 = var1;
   }

   public World method_11997() {
      return this.field_13074;
   }

   @Override
   public Collection<Entry<class_3801, class_2131>> method_27354() {
      return Collections.<Entry<class_3801, class_2131>>unmodifiableSet(this.field_13066.entrySet());
   }

   public Map<BlockPos, class_3757> method_12004() {
      return this.field_13088;
   }

   public class_4722<Entity>[] method_11979() {
      return this.field_13083;
   }

   @Override
   public CompoundNBT method_27355(BlockPos var1) {
      return this.field_13082.get(var1);
   }

   @Override
   public Stream<BlockPos> method_27360() {
      return StreamSupport.<BlockPos>stream(
            BlockPos.method_6075(
                  this.field_13067.method_9535(), 0, this.field_13067.method_9545(), this.field_13067.method_9536(), 255, this.field_13067.method_9538()
               )
               .spliterator(),
            false
         )
         .filter(var1 -> this.method_28262(var1).method_8339() != 0);
   }

   @Override
   public class_3065<class_6414> method_27335() {
      return this.field_13085;
   }

   @Override
   public class_3065<class_2340> method_27336() {
      return this.field_13072;
   }

   @Override
   public void method_27361(boolean var1) {
      this.field_13065 = var1;
   }

   @Override
   public boolean method_27358() {
      return this.field_13065 || this.field_13087 && this.field_13074.method_29546() != this.field_13071;
   }

   public void method_11996(boolean var1) {
      this.field_13087 = var1;
   }

   @Override
   public void method_27344(long var1) {
      this.field_13071 = var1;
   }

   @Nullable
   @Override
   public class_3200<?> method_15062(class_5390<?> var1) {
      return this.field_13070.get(var1);
   }

   @Override
   public void method_15064(class_5390<?> var1, class_3200<?> var2) {
      this.field_13070.put(var1, var2);
   }

   @Override
   public Map<class_5390<?>, class_3200<?>> method_27363() {
      return this.field_13070;
   }

   @Override
   public void method_27351(Map<class_5390<?>, class_3200<?>> var1) {
      this.field_13070.clear();
      this.field_13070.putAll(var1);
   }

   @Override
   public LongSet method_15067(class_5390<?> var1) {
      return this.field_13079.computeIfAbsent(var1, var0 -> new LongOpenHashSet());
   }

   @Override
   public void method_15063(class_5390<?> var1, long var2) {
      this.field_13079.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
   }

   @Override
   public Map<class_5390<?>, LongSet> method_15066() {
      return this.field_13079;
   }

   @Override
   public void method_15065(Map<class_5390<?>, LongSet> var1) {
      this.field_13079.clear();
      this.field_13079.putAll(var1);
   }

   @Override
   public long method_27340() {
      return this.field_13077;
   }

   @Override
   public void method_27369(long var1) {
      this.field_13077 = var1;
   }

   public void method_11986() {
      class_2034 var3 = this.method_27352();

      for (int var4 = 0; var4 < this.field_13078.length; var4++) {
         if (this.field_13078[var4] != null) {
            ShortListIterator var5 = this.field_13078[var4].iterator();

            while (var5.hasNext()) {
               Short var6 = (Short)var5.next();
               BlockPos var7 = class_7481.method_34017(var6, var4, var3);
               class_2522 var8 = this.method_28262(var7);
               class_2522 var9 = class_6414.method_29274(var8, this.field_13074, var7);
               this.field_13074.method_7513(var7, var9, 20);
            }

            this.field_13078[var4].clear();
         }
      }

      this.method_11989();

      for (BlockPos var11 : Sets.newHashSet(this.field_13082.keySet())) {
         this.method_28260(var11);
      }

      this.field_13082.clear();
      this.field_13069.method_29207(this);
   }

   @Nullable
   private class_3757 method_11980(BlockPos var1, CompoundNBT var2) {
      class_2522 var5 = this.method_28262(var1);
      class_3757 var6;
      if (!"DUMMY".equals(var2.method_25965("id"))) {
         var6 = class_3757.method_17410(var5, var2);
      } else {
         class_6414 var7 = var5.method_8360();
         if (!(var7 instanceof class_724)) {
            var6 = null;
            field_13080.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", var1, var5);
         } else {
            var6 = ((class_724)var7).method_3281(this.field_13074);
         }
      }

      if (var6 == null) {
         field_13080.warn("Tried to load a block entity for block {} but failed at location {}", var5, var1);
      } else {
         var6.method_17393(this.field_13074, var1);
         this.method_11982(var6);
      }

      return var6;
   }

   @Override
   public class_6397 method_27343() {
      return this.field_13069;
   }

   @Override
   public ShortList[] method_27359() {
      return this.field_13078;
   }

   public void method_11989() {
      if (!(this.field_13085 instanceof class_2080)) {
         if (this.field_13085 instanceof class_968) {
            ((class_968)this.field_13085).method_4245(this.field_13074.method_43367());
            this.field_13085 = class_5389.<class_6414>method_24539();
         }
      } else {
         ((class_2080)this.field_13085).method_9708(this.field_13074.method_43367(), var1 -> this.method_28262(var1).method_8360());
         this.field_13085 = class_5389.<class_6414>method_24539();
      }

      if (!(this.field_13072 instanceof class_2080)) {
         if (this.field_13072 instanceof class_968) {
            ((class_968)this.field_13072).method_4245(this.field_13074.method_43362());
            this.field_13072 = class_5389.<class_2340>method_24539();
         }
      } else {
         ((class_2080)this.field_13072).method_9708(this.field_13074.method_43362(), var1 -> this.method_28258(var1).method_22005());
         this.field_13072 = class_5389.<class_2340>method_24539();
      }
   }

   public void method_11993(class_6331 var1) {
      if (this.field_13085 == class_5389.method_24539()) {
         this.field_13085 = new class_968<class_6414>(
            class_8669.field_44462::method_39797, var1.method_28968().method_13095(this.field_13067, true, false), var1.method_29546()
         );
         this.method_27361(true);
      }

      if (this.field_13072 == class_5389.method_24539()) {
         this.field_13072 = new class_968<class_2340>(
            class_8669.field_44447::method_39797, var1.method_28940().method_13095(this.field_13067, true, false), var1.method_29546()
         );
         this.method_27361(true);
      }
   }

   @Override
   public class_7335 method_27364() {
      return class_7335.field_37514;
   }

   public class_7581 method_11999() {
      return this.field_13075 != null ? this.field_13075.get() : class_7581.field_38630;
   }

   public void method_11987(Supplier<class_7581> var1) {
      this.field_13075 = var1;
   }

   @Override
   public boolean method_27339() {
      return this.field_13084;
   }

   @Override
   public void method_27362(boolean var1) {
      this.field_13084 = var1;
      this.method_27361(true);
   }
}
