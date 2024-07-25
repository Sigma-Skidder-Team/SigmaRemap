package remapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6414 extends class_2353 implements class_8525 {
   public static final Logger field_32753 = LogManager.getLogger();
   public static final class_95<class_2522> field_32758 = new class_95<class_2522>();
   private static final LoadingCache<class_4190, Boolean> field_32750 = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new class_4628());
   public final class_8021<class_6414, class_2522> field_32751;
   private class_2522 field_32755;
   private String field_32757;
   private class_2451 field_32752;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<class_5071>> field_32756 = ThreadLocal.<Object2ByteLinkedOpenHashMap<class_5071>>withInitial(
      () -> {
         class_4649 var2 = new class_4649(2048, 0.25F);
         var2.defaultReturnValue((byte)127);
         return var2;
      }
   );

   public static int method_29285(class_2522 var0) {
      if (var0 != null) {
         int var3 = field_32758.method_14041(var0);
         return var3 != -1 ? var3 : 0;
      } else {
         return 0;
      }
   }

   public static class_2522 method_29293(int var0) {
      class_2522 var3 = field_32758.method_14040(var0);
      return var3 != null ? var3 : class_4783.field_23184.method_29260();
   }

   public static class_6414 method_29269(class_2451 var0) {
      return !(var0 instanceof class_6201) ? class_4783.field_23184 : ((class_6201)var0).method_28392();
   }

   public static class_2522 method_29277(class_2522 var0, class_2522 var1, World var2, class_1331 var3) {
      class_4190 var6 = class_3370.method_15529(var0.method_8324(var2, var3), var1.method_8324(var2, var3), class_8529.field_43654)
         .method_19496((double)var3.method_12173(), (double)var3.method_12165(), (double)var3.method_12185());

      for (Entity var8 : var2.method_25870((Entity)null, var6.method_19483())) {
         double var9 = class_3370.method_15520(class_9249.field_47216, var8.method_37241().method_18918(0.0, 1.0, 0.0), Stream.<class_4190>of(var6), -1.0);
         var8.method_37254(var8.method_37302(), var8.method_37309() + 1.0 + var9, var8.method_37156());
      }

      return var1;
   }

   public static class_4190 method_29292(double var0, double var2, double var4, double var6, double var8, double var10) {
      return class_3370.method_15522(var0 / 16.0, var2 / 16.0, var4 / 16.0, var6 / 16.0, var8 / 16.0, var10 / 16.0);
   }

   public boolean method_29299(class_2307<class_6414> var1) {
      return var1.method_10609(this);
   }

   public boolean method_29270(class_6414 var1) {
      return this == var1;
   }

   public static class_2522 method_29274(class_2522 var0, class_9379 var1, class_1331 var2) {
      class_2522 var5 = var0;
      class_2921 var6 = new class_2921();

      for (Direction var10 : field_11817) {
         var6.method_13371(var2, var10);
         var5 = var5.method_8359(var10, var1.method_28262(var6), var1, var2, var6);
      }

      return var5;
   }

   public static void method_29305(class_2522 var0, class_2522 var1, class_9379 var2, class_1331 var3, int var4) {
      method_29291(var0, var1, var2, var3, var4, 512);
   }

   public static void method_29291(class_2522 var0, class_2522 var1, class_9379 var2, class_1331 var3, int var4, int var5) {
      if (var1 != var0) {
         if (!var1.method_8345()) {
            var2.method_7514(var3, var1, var4 & -33, var5);
         } else if (!var2.method_22567()) {
            var2.method_7512(var3, (var4 & 32) == 0, (Entity)null, var5);
         }
      }
   }

   public class_6414(class_3073 var1) {
      super(var1);
      class_2203 var4 = new class_2203(this);
      this.method_29282(var4);
      this.field_32751 = var4.method_10164(class_6414::method_29260, class_2522::new);
      this.method_29284(this.field_32751.method_36446());
   }

   public static boolean method_29262(class_6414 var0) {
      return var0 instanceof class_4423
         || var0 == class_4783.field_23207
         || var0 == class_4783.field_23281
         || var0 == class_4783.field_23855
         || var0 == class_4783.field_23261
         || var0 == class_4783.field_23871
         || var0.method_29299(class_2351.field_11793);
   }

   public boolean method_29300(class_2522 var1) {
      return this.field_11818;
   }

   public static boolean method_29283(class_2522 var0, class_6163 var1, class_1331 var2, Direction var3) {
      class_1331 var6 = var2.method_6098(var3);
      class_2522 var7 = var1.method_28262(var6);
      class_3310 var8 = new class_3310(var0);
      SigmaMainClass.getInstance().getEventManager().call(var8);
      if (!var8.method_29716()) {
         if (!var8.method_15184()) {
            if (!var0.method_8347(var7, var3)) {
               if (!var7.method_8302()) {
                  return true;
               } else {
                  class_5071 var9 = new class_5071(var0, var7, var3);
                  Object2ByteLinkedOpenHashMap var10 = field_32756.get();
                  byte var11 = var10.getAndMoveToFirst(var9);
                  if (var11 == 127) {
                     class_4190 var12 = var0.method_8346(var1, var2, var3);
                     class_4190 var13 = var7.method_8346(var1, var6, var3.method_1046());
                     boolean var14 = class_3370.method_15537(var12, var13, class_8529.field_43656);
                     if (var10.size() == 2048) {
                        var10.removeLastByte();
                     }

                     var10.putAndMoveToFirst(var9, (byte)(!var14 ? 0 : 1));
                     return var14;
                  } else {
                     return var11 != 0;
                  }
               }
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean method_29273(class_6163 var0, class_1331 var1) {
      return var0.method_28262(var1).method_8312(var0, var1, Direction.field_817, class_3397.field_16731);
   }

   public static boolean method_29266(class_4924 var0, class_1331 var1, Direction var2) {
      class_2522 var5 = var0.method_28262(var1);
      return var2 == Direction.field_802 && var5.method_8349(class_2351.field_11773) ? false : var5.method_8312(var0, var1, var2, class_3397.field_16730);
   }

   public static boolean method_29303(class_4190 var0, Direction var1) {
      class_4190 var4 = var0.method_19494(var1);
      return method_29301(var4);
   }

   public static boolean method_29301(class_4190 var0) {
      return (Boolean)field_32750.getUnchecked(var0);
   }

   public boolean method_29275(class_2522 var1, class_6163 var2, class_1331 var3) {
      return !method_29301(var1.method_8334(var2, var3)) && var1.method_8364().method_22001();
   }

   public void method_29280(class_2522 var1, World var2, class_1331 var3, Random var4) {
   }

   public void method_29290(class_9379 var1, class_1331 var2, class_2522 var3) {
   }

   public static List<class_6098> method_29288(class_2522 var0, class_6331 var1, class_1331 var2, class_3757 var3) {
      class_8480 var6 = new class_8480(var1)
         .method_39068(var1.field_33033)
         .method_39065(class_8712.field_44671, class_1343.method_6216(var2))
         .method_39065(class_8712.field_44670, class_6098.field_31203)
         .method_39069(class_8712.field_44673, var3);
      return var0.method_8333(var6);
   }

   public static List<class_6098> method_29289(class_2522 var0, class_6331 var1, class_1331 var2, class_3757 var3, Entity var4, class_6098 var5) {
      class_8480 var8 = new class_8480(var1)
         .method_39068(var1.field_33033)
         .method_39065(class_8712.field_44671, class_1343.method_6216(var2))
         .method_39065(class_8712.field_44670, var5)
         .method_39069(class_8712.field_44676, var4)
         .method_39069(class_8712.field_44673, var3);
      return var0.method_8333(var8);
   }

   public static void method_29294(class_2522 var0, World var1, class_1331 var2) {
      if (var1 instanceof class_6331) {
         method_29288(var0, (class_6331)var1, var2, (class_3757)null).forEach(var2x -> method_29267(var1, var2, var2x));
         var0.method_8310((class_6331)var1, var2, class_6098.field_31203);
      }
   }

   public static void method_29296(class_2522 var0, class_9379 var1, class_1331 var2, class_3757 var3) {
      if (var1 instanceof class_6331) {
         method_29288(var0, (class_6331)var1, var2, var3).forEach(var2x -> method_29267((class_6331)var1, var2, var2x));
         var0.method_8310((class_6331)var1, var2, class_6098.field_31203);
      }
   }

   public static void method_29295(class_2522 var0, World var1, class_1331 var2, class_3757 var3, Entity var4, class_6098 var5) {
      if (var1 instanceof class_6331) {
         method_29289(var0, (class_6331)var1, var2, var3, var4, var5).forEach(var2x -> method_29267(var1, var2, var2x));
         var0.method_8310((class_6331)var1, var2, var5);
      }
   }

   public static void method_29267(World var0, class_1331 var1, class_6098 var2) {
      if (!var0.field_33055 && !var2.method_28022() && var0.method_29537().method_1285(class_291.field_1058)) {
         float var5 = 0.5F;
         double var6 = (double)(var0.field_33033.nextFloat() * 0.5F) + 0.25;
         double var8 = (double)(var0.field_33033.nextFloat() * 0.5F) + 0.25;
         double var10 = (double)(var0.field_33033.nextFloat() * 0.5F) + 0.25;
         class_91 var12 = new class_91(var0, (double)var1.method_12173() + var6, (double)var1.method_12165() + var8, (double)var1.method_12185() + var10, var2);
         var12.method_257();
         var0.method_7509(var12);
      }
   }

   public void method_29304(class_6331 var1, class_1331 var2, int var3) {
      if (var1.method_29537().method_1285(class_291.field_1058)) {
         while (var3 > 0) {
            int var6 = class_5614.method_25476(var3);
            var3 -= var6;
            var1.method_7509(
               new class_5614(var1, (double)var2.method_12173() + 0.5, (double)var2.method_12165() + 0.5, (double)var2.method_12185() + 0.5, var6)
            );
         }
      }
   }

   public float method_29264() {
      return this.field_11824;
   }

   public void method_29279(World var1, class_1331 var2, class_2730 var3) {
   }

   public void method_29286(World var1, class_1331 var2, Entity var3) {
   }

   @Nullable
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260();
   }

   public void method_29298(World var1, class_704 var2, class_1331 var3, class_2522 var4, class_3757 var5, class_6098 var6) {
      var2.method_3211(class_6234.field_31905.method_43790(this));
      var2.method_3170(0.005F);
      method_29295(var4, var1, var3, var5, var2, var6);
   }

   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
   }

   public boolean method_29278() {
      return !this.field_11820.method_24499() && !this.field_11820.method_24494();
   }

   public IFormattableTextComponent method_29307() {
      return new TranslationTextComponent(this.method_29271());
   }

   public String method_29271() {
      if (this.field_32757 == null) {
         this.field_32757 = Util.createTranslationKey("block", class_8669.field_44462.method_39797(this));
      }

      return this.field_32757;
   }

   public void method_29263(World var1, class_1331 var2, Entity var3, float var4) {
      var3.method_37270(var4, 1.0F);
   }

   public void method_29297(class_6163 var1, Entity var2) {
      var2.method_37215(var2.method_37098().method_6210(1.0, 0.0, 1.0));
   }

   public class_6098 method_29276(class_6163 var1, class_1331 var2, class_2522 var3) {
      return new class_6098(this);
   }

   public void method_29268(class_8230 var1, class_2831<class_6098> var2) {
      var2.add(new class_6098(this));
   }

   public float method_29308() {
      return this.field_11816;
   }

   public float method_29287() {
      return this.field_11814;
   }

   public float method_29258() {
      return this.field_11825;
   }

   public void method_29265(World var1, class_1331 var2, class_2522 var3, class_704 var4) {
      var1.method_43365(var4, 2001, var2, method_29285(var3));
      if (this.method_29299(class_2351.field_11792)) {
         class_134.method_474(var4, false);
      }
   }

   public void method_29259(World var1, class_1331 var2) {
   }

   public boolean method_29256(class_2730 var1) {
      return true;
   }

   public void method_29282(class_2203<class_6414, class_2522> var1) {
   }

   public class_8021<class_6414, class_2522> method_29306() {
      return this.field_32751;
   }

   public final void method_29284(class_2522 var1) {
      this.field_32755 = var1;
   }

   public final class_2522 method_29260() {
      return this.field_32755;
   }

   public class_4618 method_29261(class_2522 var1) {
      return this.field_11819;
   }

   @Override
   public class_2451 method_10803() {
      if (this.field_32752 == null) {
         this.field_32752 = class_2451.method_11225(this);
      }

      return this.field_32752;
   }

   public boolean method_29281() {
      return this.field_11823;
   }

   @Override
   public String toString() {
      return "Block{" + class_8669.field_44462.method_39797(this) + "}";
   }

   public void method_29272(class_6098 var1, class_6163 var2, List<ITextComponent> var3, class_4605 var4) {
   }

   @Override
   public class_6414 method_10792() {
      return this;
   }
}
