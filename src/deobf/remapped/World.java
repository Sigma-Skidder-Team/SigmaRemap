package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class World implements class_9379, AutoCloseable {
   public static final Logger field_33046 = LogManager.getLogger();
   public static final Codec<class_5621<World>> field_33043 = Identifier.field_22655
      .xmap(class_5621.<World>method_25495(class_8669.field_44372), class_5621::method_25499);
   public static final class_5621<World> field_33048 = class_5621.<World>method_25497(class_8669.field_44372, new Identifier("overworld"));
   public static final class_5621<World> field_33029 = class_5621.<World>method_25497(class_8669.field_44372, new Identifier("the_nether"));
   public static final class_5621<World> field_33038 = class_5621.<World>method_25497(class_8669.field_44372, new Identifier("the_end"));
   private static final Direction[] field_33052 = Direction.values();
   public final List<class_3757> field_33053 = Lists.newArrayList();
   public final List<class_3757> field_33031 = Lists.newArrayList();
   public final List<class_3757> field_33030 = Lists.newArrayList();
   public final List<class_3757> field_33037 = Lists.newArrayList();
   private final Thread field_33036;
   private final boolean field_33039;
   private int field_33034;
   public int field_33051 = new Random().nextInt();
   public final int field_33056 = 1013904223;
   public float field_33049;
   public float field_33050;
   public float field_33040;
   public float field_33045;
   public final Random field_33033 = new Random();
   private final class_8760 field_33047;
   public final class_1137 field_33035;
   private final Supplier<class_3492> field_33041;
   public final boolean field_33055;
   public boolean field_33054;
   private final class_2098 field_33032;
   private final class_859 field_33042;
   private final class_5621<World> field_33044;

   public World(class_1137 var1, class_5621<World> var2, class_8760 var3, Supplier<class_3492> var4, boolean var5, boolean var6, long var7) {
      this.field_33041 = var4;
      this.field_33035 = var1;
      this.field_33047 = var3;
      this.field_33044 = var2;
      this.field_33055 = var5;
      if (var3.method_40223() == 1.0) {
         this.field_33032 = new class_2098();
      } else {
         this.field_33032 = new class_6189(this, var3);
      }

      this.field_33036 = Thread.currentThread();
      this.field_33042 = new class_859(this, var7, var3.method_40246());
      this.field_33039 = var6;
   }

   @Override
   public boolean method_22567() {
      return this.field_33055;
   }

   @Nullable
   public class_341 method_29522() {
      return null;
   }

   public static boolean method_29586(class_1331 var0) {
      return !method_29556(var0) && method_29592(var0);
   }

   public static boolean method_29593(class_1331 var0) {
      return !method_29595(var0.method_12165()) && method_29592(var0);
   }

   private static boolean method_29592(class_1331 var0) {
      return var0.method_12173() >= -30000000 && var0.method_12185() >= -30000000 && var0.method_12173() < 30000000 && var0.method_12185() < 30000000;
   }

   private static boolean method_29595(int var0) {
      return var0 < -20000000 || var0 >= 20000000;
   }

   public static boolean method_29556(class_1331 var0) {
      return method_29571(var0.method_12165());
   }

   public static boolean method_29571(int var0) {
      return var0 < 0 || var0 >= 256;
   }

   public class_2654 method_29542(class_1331 var1) {
      return this.method_29554(var1.method_12173() >> 4, var1.method_12185() >> 4);
   }

   public class_2654 method_29554(int var1, int var2) {
      return (class_2654)this.method_22554(var1, var2, class_7335.field_37514);
   }

   @Override
   public class_5990 method_22555(int var1, int var2, class_7335 var3, boolean var4) {
      class_5990 var7 = this.method_43363().method_14819(var1, var2, var3, var4);
      if (var7 == null && var4) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return var7;
      }
   }

   @Override
   public boolean method_7513(class_1331 var1, class_2522 var2, int var3) {
      return this.method_7514(var1, var2, var3, 512);
   }

   @Override
   public boolean method_7514(class_1331 var1, class_2522 var2, int var3, int var4) {
      if (method_29556(var1)) {
         return false;
      } else if (!this.field_33055 && this.method_29581()) {
         return false;
      } else {
         class_2654 var7 = this.method_29542(var1);
         class_6414 var8 = var2.method_8360();
         class_2522 var9 = var7.method_27348(var1, var2, (var3 & 64) != 0);
         if (var9 == null) {
            return false;
         } else {
            class_2522 var10 = this.method_28262(var1);
            if ((var3 & 128) == 0
               && var10 != var9
               && (
                  var10.method_8320(this, var1) != var9.method_8320(this, var1)
                     || var10.method_8339() != var9.method_8339()
                     || var10.method_8358()
                     || var9.method_8358()
               )) {
               this.method_29599().method_16056("queueCheckLight");
               this.method_43363().method_14813().method_21566(var1);
               this.method_29599().method_16054();
            }

            if (var10 == var2) {
               if (var9 != var10) {
                  this.method_29567(var1, var9, var10);
               }

               if ((var3 & 2) != 0
                  && (!this.field_33055 || (var3 & 4) == 0)
                  && (this.field_33055 || var7.method_11999() != null && var7.method_11999().method_34447(class_7581.field_38632))) {
                  this.method_29572(var1, var9, var2, var3);
               }

               if ((var3 & 1) != 0) {
                  this.method_43369(var1, var9.method_8360());
                  if (!this.field_33055 && var2.method_8344()) {
                     this.method_29523(var1, var8);
                  }
               }

               if ((var3 & 16) == 0 && var4 > 0) {
                  int var11 = var3 & -34;
                  var9.method_8304(this, var1, var11, var4 - 1);
                  var2.method_8368(this, var1, var11, var4 - 1);
                  var2.method_8304(this, var1, var11, var4 - 1);
               }

               this.method_29550(var1, var9, var10);
            }

            return true;
         }
      }
   }

   public void method_29550(class_1331 var1, class_2522 var2, class_2522 var3) {
   }

   @Override
   public boolean method_7508(class_1331 var1, boolean var2) {
      class_4774 var5 = this.method_28258(var1);
      return this.method_7513(var1, var5.method_22006(), 3 | (!var2 ? 0 : 64));
   }

   @Override
   public boolean method_7512(class_1331 var1, boolean var2, Entity var3, int var4) {
      class_2522 var7 = this.method_28262(var1);
      if (!var7.method_8345()) {
         class_4774 var8 = this.method_28258(var1);
         if (!(var7.method_8360() instanceof class_9476)) {
            this.method_43364(2001, var1, class_6414.method_29285(var7));
         }

         if (var2) {
            class_3757 var9 = !var7.method_8360().method_10802() ? null : this.method_28260(var1);
            class_6414.method_29295(var7, this, var1, var9, var3, class_6098.field_31203);
         }

         return this.method_7514(var1, var8.method_22006(), 3, var4);
      } else {
         return false;
      }
   }

   public boolean method_29594(class_1331 var1, class_2522 var2) {
      return this.method_7513(var1, var2, 3);
   }

   public abstract void method_29572(class_1331 var1, class_2522 var2, class_2522 var3, int var4);

   public void method_29567(class_1331 var1, class_2522 var2, class_2522 var3) {
   }

   public void method_29563(class_1331 var1, class_6414 var2) {
      this.method_29520(var1.method_6108(), var2, var1);
      this.method_29520(var1.method_6090(), var2, var1);
      this.method_29520(var1.method_6100(), var2, var1);
      this.method_29520(var1.method_6081(), var2, var1);
      this.method_29520(var1.method_6094(), var2, var1);
      this.method_29520(var1.method_6073(), var2, var1);
   }

   public void method_29526(class_1331 var1, class_6414 var2, Direction var3) {
      if (var3 != Direction.field_809) {
         this.method_29520(var1.method_6108(), var2, var1);
      }

      if (var3 != Direction.field_804) {
         this.method_29520(var1.method_6090(), var2, var1);
      }

      if (var3 != Direction.field_802) {
         this.method_29520(var1.method_6100(), var2, var1);
      }

      if (var3 != Direction.field_817) {
         this.method_29520(var1.method_6081(), var2, var1);
      }

      if (var3 != Direction.field_818) {
         this.method_29520(var1.method_6094(), var2, var1);
      }

      if (var3 != Direction.field_800) {
         this.method_29520(var1.method_6073(), var2, var1);
      }
   }

   public void method_29520(class_1331 var1, class_6414 var2, class_1331 var3) {
      if (!this.field_33055) {
         class_2522 var6 = this.method_28262(var1);

         try {
            var6.method_8343(this, var1, var2, var3, false);
         } catch (Throwable var10) {
            class_159 var8 = class_159.method_643(var10, "Exception while updating neighbours");
            class_6544 var9 = var8.method_639("Block being updated");
            var9.method_29851("Source block type", () -> {
               try {
                  return String.format("ID #%s (%s // %s)", class_8669.field_44462.method_39797(var2), var2.method_29271(), var2.getClass().getCanonicalName());
               } catch (Throwable var4) {
                  return "ID #" + class_8669.field_44462.method_39797(var2);
               }
            });
            class_6544.method_29843(var9, var1, var6);
            throw new class_3297(var8);
         }
      }
   }

   @Override
   public int method_22562(class_3801 var1, int var2, int var3) {
      int var6;
      if (var2 >= -30000000 && var3 >= -30000000 && var2 < 30000000 && var3 < 30000000) {
         if (!this.method_22560(var2 >> 4, var3 >> 4)) {
            var6 = 0;
         } else {
            var6 = this.method_29554(var2 >> 4, var3 >> 4).method_27367(var1, var2 & 15, var3 & 15) + 1;
         }
      } else {
         var6 = this.method_22552() + 1;
      }

      return var6;
   }

   @Override
   public class_4663 method_25264() {
      return this.method_43363().method_14813();
   }

   @Override
   public class_2522 method_28262(class_1331 var1) {
      if (!method_29556(var1)) {
         class_2654 var4 = this.method_29554(var1.method_12173() >> 4, var1.method_12185() >> 4);
         return var4.method_28262(var1);
      } else {
         return class_4783.field_23424.method_29260();
      }
   }

   @Override
   public class_4774 method_28258(class_1331 var1) {
      if (!method_29556(var1)) {
         class_2654 var4 = this.method_29542(var1);
         return var4.method_28258(var1);
      } else {
         return class_8532.field_43673.method_10710();
      }
   }

   public boolean method_29602() {
      return !this.method_22572().method_40228() && this.field_33034 < 4;
   }

   public boolean method_29544() {
      return !this.method_22572().method_40228() && !this.method_29602();
   }

   @Override
   public void method_43359(class_704 var1, class_1331 var2, class_8461 var3, class_562 var4, float var5, float var6) {
      this.method_29528(var1, (double)var2.method_12173() + 0.5, (double)var2.method_12165() + 0.5, (double)var2.method_12185() + 0.5, var3, var4, var5, var6);
   }

   public abstract void method_29528(class_704 var1, double var2, double var4, double var6, class_8461 var8, class_562 var9, float var10, float var11);

   public abstract void method_29540(class_704 var1, Entity var2, class_8461 var3, class_562 var4, float var5, float var6);

   public void method_29527(double var1, double var3, double var5, class_8461 var7, class_562 var8, float var9, float var10, boolean var11) {
   }

   @Override
   public void method_43361(class_5079 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   public void method_29543(class_5079 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   public void method_29551(class_5079 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   public void method_29552(class_5079 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   public float method_29553(float var1) {
      float var4 = this.method_13578(var1);
      return var4 * (float) (Math.PI * 2);
   }

   public boolean method_29539(class_3757 var1) {
      if (this.field_33054) {
         field_33046.error(
            "Adding block entity while ticking: {} @ {}",
            new org.apache.logging.log4j.util.Supplier[]{() -> class_8669.field_44426.method_39797(var1.method_17405()), var1::method_17399}
         );
      }

      boolean var4 = this.field_33053.add(var1);
      if (var4 && var1 instanceof class_3745) {
         this.field_33031.add(var1);
      }

      if (this.field_33055) {
         class_1331 var5 = var1.method_17399();
         class_2522 var6 = this.method_28262(var5);
         this.method_29572(var5, var6, var6, 2);
      }

      return var4;
   }

   public void method_29531(Collection<class_3757> var1) {
      if (!this.field_33054) {
         for (class_3757 var5 : var1) {
            this.method_29539(var5);
         }
      } else {
         this.field_33030.addAll(var1);
      }
   }

   public void method_29547() {
      class_3492 var3 = this.method_29599();
      var3.method_16056("blockEntities");
      if (!this.field_33037.isEmpty()) {
         this.field_33031.removeAll(this.field_33037);
         this.field_33053.removeAll(this.field_33037);
         this.field_33037.clear();
      }

      this.field_33054 = true;
      Iterator var4 = this.field_33031.iterator();

      while (var4.hasNext()) {
         class_3757 var5 = (class_3757)var4.next();
         if (!var5.method_17395() && var5.method_17392()) {
            class_1331 var6 = var5.method_17399();
            if (this.method_43363().method_14815(var6) && this.method_6673().method_9813(var6)) {
               try {
                  var3.method_16057(() -> String.valueOf(class_133.method_445(var5.method_17405())));
                  if (var5.method_17405().method_448(this.method_28262(var6).method_8360())) {
                     ((class_3745)var5).method_17353();
                  } else {
                     var5.method_17411();
                  }

                  var3.method_16054();
               } catch (Throwable var10) {
                  class_159 var8 = class_159.method_643(var10, "Ticking block entity");
                  class_6544 var9 = var8.method_639("Block entity being ticked");
                  var5.method_17398(var9);
                  throw new class_3297(var8);
               }
            }
         }

         if (var5.method_17395()) {
            var4.remove();
            this.field_33053.remove(var5);
            if (this.method_22559(var5.method_17399())) {
               this.method_29542(var5.method_17399()).method_27370(var5.method_17399());
            }
         }
      }

      this.field_33054 = false;
      var3.method_16050("pendingBlockEntities");
      if (!this.field_33030.isEmpty()) {
         for (int var11 = 0; var11 < this.field_33030.size(); var11++) {
            class_3757 var12 = this.field_33030.get(var11);
            if (!var12.method_17395()) {
               if (!this.field_33053.contains(var12)) {
                  this.method_29539(var12);
               }

               if (this.method_22559(var12.method_17399())) {
                  class_2654 var7 = this.method_29542(var12.method_17399());
                  class_2522 var13 = var7.method_28262(var12.method_17399());
                  var7.method_27346(var12.method_17399(), var12);
                  this.method_29572(var12.method_17399(), var13, var13, 3);
               }
            }
         }

         this.field_33030.clear();
      }

      var3.method_16054();
   }

   public void method_29532(Consumer<Entity> var1, Entity var2) {
      try {
         var1.accept(var2);
      } catch (Throwable var8) {
         class_159 var6 = class_159.method_643(var8, "Ticking entity");
         class_6544 var7 = var6.method_639("Entity being ticked");
         var2.method_37331(var7);
         throw new class_3297(var6);
      }
   }

   public class_2730 method_29573(Entity var1, double var2, double var4, double var6, float var8, class_7298 var9) {
      return this.method_29575(var1, (class_6199)null, (class_7571)null, var2, var4, var6, var8, false, var9);
   }

   public class_2730 method_29574(Entity var1, double var2, double var4, double var6, float var8, boolean var9, class_7298 var10) {
      return this.method_29575(var1, (class_6199)null, (class_7571)null, var2, var4, var6, var8, var9, var10);
   }

   public class_2730 method_29575(
           Entity var1, class_6199 var2, class_7571 var3, double var4, double var6, double var8, float var10, boolean var11, class_7298 var12
   ) {
      class_2730 var15 = new class_2730(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var15.method_12266();
      var15.method_12272(true);
      return var15;
   }

   public String method_29580() {
      return this.method_43363().method_14814();
   }

   @Nullable
   @Override
   public class_3757 method_28260(class_1331 var1) {
      if (!method_29556(var1)) {
         if (!this.field_33055 && Thread.currentThread() != this.field_33036) {
            return null;
         } else {
            class_3757 var4 = null;
            if (this.field_33054) {
               var4 = this.method_29598(var1);
            }

            if (var4 == null) {
               var4 = this.method_29542(var1).method_11988(var1, class_1628.field_8478);
            }

            if (var4 == null) {
               var4 = this.method_29598(var1);
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   @Nullable
   private class_3757 method_29598(class_1331 var1) {
      for (int var4 = 0; var4 < this.field_33030.size(); var4++) {
         class_3757 var5 = this.field_33030.get(var4);
         if (!var5.method_17395() && var5.method_17399().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method_29558(class_1331 var1, class_3757 var2) {
      if (!method_29556(var1) && var2 != null && !var2.method_17395()) {
         if (!this.field_33054) {
            this.method_29542(var1).method_27346(var1, var2);
            this.method_29539(var2);
         } else {
            var2.method_17393(this, var1);
            Iterator var5 = this.field_33030.iterator();

            while (var5.hasNext()) {
               class_3757 var6 = (class_3757)var5.next();
               if (var6.method_17399().equals(var1)) {
                  var6.method_17406();
                  var5.remove();
               }
            }

            this.field_33030.add(var2);
         }
      }
   }

   public void method_29597(class_1331 var1) {
      class_3757 var4 = this.method_28260(var1);
      if (var4 != null && this.field_33054) {
         var4.method_17406();
         this.field_33030.remove(var4);
      } else {
         if (var4 != null) {
            this.field_33030.remove(var4);
            this.field_33053.remove(var4);
            this.field_33031.remove(var4);
         }

         this.method_29542(var1).method_27370(var1);
      }
   }

   public boolean method_29585(class_1331 var1) {
      return !method_29556(var1) ? this.method_43363().method_14816(var1.method_12173() >> 4, var1.method_12185() >> 4) : false;
   }

   public boolean method_29566(class_1331 var1, Entity var2, Direction var3) {
      if (!method_29556(var1)) {
         class_5990 var6 = this.method_22555(var1.method_12173() >> 4, var1.method_12185() >> 4, class_7335.field_37514, false);
         return var6 != null ? var6.method_28262(var1).method_8338(this, var1, var2, var3) : false;
      } else {
         return false;
      }
   }

   public boolean method_29518(class_1331 var1, Entity var2) {
      return this.method_29566(var1, var2, Direction.field_817);
   }

   public void method_29541() {
      double var3 = 1.0 - (double)(this.method_29578(1.0F) * 5.0F) / 16.0;
      double var5 = 1.0 - (double)(this.method_29601(1.0F) * 5.0F) / 16.0;
      double var7 = 0.5 + 2.0 * class_9299.method_42827((double)class_9299.method_42840(this.method_13578(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.field_33034 = (int)((1.0 - var7 * var3 * var5) * 11.0);
   }

   public void method_29555(boolean var1, boolean var2) {
      this.method_43363().method_14821(var1, var2);
   }

   public void method_29525() {
      if (this.field_33035.method_8664()) {
         this.field_33050 = 1.0F;
         if (this.field_33035.method_8663()) {
            this.field_33045 = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.method_43363().close();
   }

   @Nullable
   @Override
   public class_6163 method_6675(int var1, int var2) {
      return this.method_22555(var1, var2, class_7335.field_37514, false);
   }

   @Override
   public List<Entity> method_25867(Entity var1, class_4092 var2, Predicate<? super Entity> var3) {
      this.method_29599().method_16055("getEntities");
      ArrayList var6 = Lists.newArrayList();
      int var7 = class_9299.method_42847((var2.field_19941 - 2.0) / 16.0);
      int var8 = class_9299.method_42847((var2.field_19940 + 2.0) / 16.0);
      int var9 = class_9299.method_42847((var2.field_19938 - 2.0) / 16.0);
      int var10 = class_9299.method_42847((var2.field_19942 + 2.0) / 16.0);
      class_3232 var11 = this.method_43363();

      for (int var12 = var7; var12 <= var8; var12++) {
         for (int var13 = var9; var13 <= var10; var13++) {
            class_2654 var14 = var11.method_14820(var12, var13, false);
            if (var14 != null) {
               var14.method_11990(var1, var2, var6, var3);
            }
         }
      }

      return var6;
   }

   public <T extends Entity> List<T> method_29583(class_6629<T> var1, class_4092 var2, Predicate<? super T> var3) {
      this.method_29599().method_16055("getEntities");
      int var6 = class_9299.method_42847((var2.field_19941 - 2.0) / 16.0);
      int var7 = class_9299.method_42815((var2.field_19940 + 2.0) / 16.0);
      int var8 = class_9299.method_42847((var2.field_19938 - 2.0) / 16.0);
      int var9 = class_9299.method_42815((var2.field_19942 + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();

      for (int var11 = var6; var11 < var7; var11++) {
         for (int var12 = var8; var12 < var9; var12++) {
            class_2654 var13 = this.method_43363().method_14820(var11, var12, false);
            if (var13 != null) {
               var13.method_11998(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Override
   public <T extends Entity> List<T> method_25869(Class<? extends T> var1, class_4092 var2, Predicate<? super T> var3) {
      this.method_29599().method_16055("getEntities");
      int var6 = class_9299.method_42847((var2.field_19941 - 2.0) / 16.0);
      int var7 = class_9299.method_42815((var2.field_19940 + 2.0) / 16.0);
      int var8 = class_9299.method_42847((var2.field_19938 - 2.0) / 16.0);
      int var9 = class_9299.method_42815((var2.field_19942 + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();
      class_3232 var11 = this.method_43363();

      for (int var12 = var6; var12 < var7; var12++) {
         for (int var13 = var8; var13 < var9; var13++) {
            class_2654 var14 = var11.method_14820(var12, var13, false);
            if (var14 != null) {
               var14.method_11994(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Override
   public <T extends Entity> List<T> method_25875(Class<? extends T> var1, class_4092 var2, Predicate<? super T> var3) {
      this.method_29599().method_16055("getLoadedEntities");
      int var6 = class_9299.method_42847((var2.field_19941 - 2.0) / 16.0);
      int var7 = class_9299.method_42815((var2.field_19940 + 2.0) / 16.0);
      int var8 = class_9299.method_42847((var2.field_19938 - 2.0) / 16.0);
      int var9 = class_9299.method_42815((var2.field_19942 + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();
      class_3232 var11 = this.method_43363();

      for (int var12 = var6; var12 < var7; var12++) {
         for (int var13 = var8; var13 < var9; var13++) {
            class_2654 var14 = var11.method_14822(var12, var13);
            if (var14 != null) {
               var14.method_11994(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Nullable
   public abstract Entity method_29534(int var1);

   public void method_29557(class_1331 var1, class_3757 var2) {
      if (this.method_22559(var1)) {
         this.method_29542(var1).method_11992();
      }
   }

   @Override
   public int method_22552() {
      return 63;
   }

   public int method_29530(class_1331 var1) {
      int var4 = 0;
      var4 = Math.max(var4, this.method_22551(var1.method_6100(), Direction.field_802));
      if (var4 < 15) {
         var4 = Math.max(var4, this.method_22551(var1.method_6081(), Direction.field_817));
         if (var4 < 15) {
            var4 = Math.max(var4, this.method_22551(var1.method_6094(), Direction.field_818));
            if (var4 < 15) {
               var4 = Math.max(var4, this.method_22551(var1.method_6073(), Direction.field_800));
               if (var4 < 15) {
                  var4 = Math.max(var4, this.method_22551(var1.method_6108(), Direction.field_809));
                  if (var4 < 15) {
                     var4 = Math.max(var4, this.method_22551(var1.method_6090(), Direction.field_804));
                     return var4 < 15 ? var4 : var4;
                  } else {
                     return var4;
                  }
               } else {
                  return var4;
               }
            } else {
               return var4;
            }
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public boolean method_29588(class_1331 var1, Direction var2) {
      return this.method_29577(var1, var2) > 0;
   }

   public int method_29577(class_1331 var1, Direction var2) {
      class_2522 var5 = this.method_28262(var1);
      int var6 = var5.method_8327(this, var1, var2);
      return !var5.method_8356(this, var1) ? var6 : Math.max(var6, this.method_29530(var1));
   }

   public boolean method_29576(class_1331 var1) {
      if (this.method_29577(var1.method_6100(), Direction.field_802) <= 0) {
         if (this.method_29577(var1.method_6081(), Direction.field_817) <= 0) {
            if (this.method_29577(var1.method_6094(), Direction.field_818) <= 0) {
               if (this.method_29577(var1.method_6073(), Direction.field_800) <= 0) {
                  return this.method_29577(var1.method_6108(), Direction.field_809) <= 0
                     ? this.method_29577(var1.method_6090(), Direction.field_804) > 0
                     : true;
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public int method_29565(class_1331 var1) {
      int var4 = 0;

      for (Direction var8 : field_33052) {
         int var9 = this.method_29577(var1.method_6098(var8), var8);
         if (var9 >= 15) {
            return 15;
         }

         if (var9 > var4) {
            var4 = var9;
         }
      }

      return var4;
   }

   public void method_29519() {
   }

   public long method_29546() {
      return this.field_33035.method_8658();
   }

   public long method_29584() {
      return this.field_33035.method_8666();
   }

   public boolean method_29538(class_704 var1, class_1331 var2) {
      return true;
   }

   public void method_29587(Entity var1, byte var2) {
   }

   public void method_29521(class_1331 var1, class_6414 var2, int var3, int var4) {
      this.method_28262(var1).method_8354(this, var1, var3, var4);
   }

   @Override
   public class_1906 method_43366() {
      return this.field_33035;
   }

   public class_291 method_29537() {
      return this.field_33035.method_8653();
   }

   public float method_29601(float var1) {
      return class_9299.method_42795(var1, this.field_33040, this.field_33045) * this.method_29578(var1);
   }

   public void method_29560(float var1) {
      this.field_33040 = var1;
      this.field_33045 = var1;
   }

   public float method_29578(float var1) {
      return class_9299.method_42795(var1, this.field_33049, this.field_33050);
   }

   public void method_29582(float var1) {
      this.field_33049 = var1;
      this.field_33050 = var1;
   }

   public boolean method_29570() {
      return this.method_22572().method_40229() && !this.method_22572().method_40244() ? (double)this.method_29601(1.0F) > 0.9 : false;
   }

   public boolean method_29561() {
      return (double)this.method_29578(1.0F) > 0.2;
   }

   public boolean method_29569(class_1331 var1) {
      if (!this.method_29561()) {
         return false;
      } else if (this.method_25263(var1)) {
         if (this.method_22563(class_3801.field_18595, var1).method_12165() > var1.method_12165()) {
            return false;
         } else {
            class_6325 var4 = this.method_22561(var1);
            return var4.method_28866() == class_6750.field_34844 && var4.method_28865(var1) >= 0.15F;
         }
      } else {
         return false;
      }
   }

   public boolean method_29529(class_1331 var1) {
      class_6325 var4 = this.method_22561(var1);
      return var4.method_28881();
   }

   @Nullable
   public abstract class_2134 method_29533(String var1);

   public abstract void method_29524(class_2134 var1);

   public abstract int method_29564();

   public void method_29589(int var1, class_1331 var2, int var3) {
   }

   public class_6544 method_29548(class_159 var1) {
      class_6544 var4 = var1.method_642("Affected level", 1);
      var4.method_29851("All players", () -> this.method_25873().size() + " total; " + this.method_25873());
      var4.method_29851("Chunk stats", this.method_43363()::method_14814);
      var4.method_29851("Level dimension", () -> this.method_29545().method_25499().toString());

      try {
         this.field_33035.method_8656(var4);
      } catch (Throwable var6) {
         var4.method_29848("Level Data Unobtainable", var6);
      }

      return var4;
   }

   public abstract void method_29568(int var1, class_1331 var2, int var3);

   public void method_29536(double var1, double var3, double var5, double var7, double var9, double var11, class_5734 var13) {
   }

   public abstract class_1097 method_29562();

   public void method_29523(class_1331 var1, class_6414 var2) {
      for (Direction var6 : class_9594.field_48893) {
         class_1331 var7 = var1.method_6098(var6);
         if (this.method_22559(var7)) {
            class_2522 var8 = this.method_28262(var7);
            if (!var8.method_8350(class_4783.field_23166)) {
               if (var8.method_8356(this, var7)) {
                  var7 = var7.method_6098(var6);
                  var8 = this.method_28262(var7);
                  if (var8.method_8350(class_4783.field_23166)) {
                     var8.method_8343(this, var7, var2, var1, false);
                  }
               }
            } else {
               var8.method_8343(this, var7, var2, var1, false);
            }
         }
      }
   }

   @Override
   public class_9589 method_43368(class_1331 var1) {
      long var4 = 0L;
      float var6 = 0.0F;
      if (this.method_22559(var1)) {
         var6 = this.method_13576();
         var4 = this.method_29542(var1).method_27340();
      }

      return new class_9589(this.method_43370(), this.method_29584(), var4, var6);
   }

   @Override
   public int method_22557() {
      return this.field_33034;
   }

   public void method_29591(int var1) {
   }

   @Override
   public class_2098 method_6673() {
      return this.field_33032;
   }

   public void method_29535(Packet<?> var1) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public class_8760 method_22572() {
      return this.field_33047;
   }

   public class_5621<World> method_29545() {
      return this.field_33044;
   }

   @Override
   public Random method_43360() {
      return this.field_33033;
   }

   @Override
   public boolean method_38320(class_1331 var1, Predicate<class_2522> var2) {
      return var2.test(this.method_28262(var1));
   }

   public abstract class_5023 method_29549();

   public abstract class_6437 method_29600();

   public class_1331 method_29596(int var1, int var2, int var3, int var4) {
      this.field_33051 = this.field_33051 * 3 + 1013904223;
      int var7 = this.field_33051 >> 2;
      return new class_1331(var1 + (var7 & 15), var2 + (var7 >> 16 & var4), var3 + (var7 >> 8 & 15));
   }

   public boolean method_29590() {
      return false;
   }

   public class_3492 method_29599() {
      return this.field_33041.get();
   }

   public Supplier<class_3492> method_29559() {
      return this.field_33041;
   }

   @Override
   public class_859 method_22564() {
      return this.field_33042;
   }

   public final boolean method_29581() {
      return this.field_33039;
   }
}
