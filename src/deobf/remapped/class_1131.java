package remapped;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class class_1131 {
   public static final Codec<class_1131> field_6447 = class_8669.field_44432.dispatch(class_1131::method_4970, class_7027::method_32060);
   public final int field_6446;
   public final int field_6444;
   public final int field_6445;

   public static <P extends class_1131> P3<Mu<P>, Integer, Integer, Integer> method_4972(Instance<P> var0) {
      return var0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter(var0x -> var0x.field_6446),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(var0x -> var0x.field_6444),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(var0x -> var0x.field_6445)
      );
   }

   public class_1131(int var1, int var2, int var3) {
      this.field_6446 = var1;
      this.field_6444 = var2;
      this.field_6445 = var3;
   }

   public abstract class_7027<?> method_4970();

   public abstract List<class_8070> method_4966(class_6755 var1, Random var2, int var3, class_1331 var4, Set<class_1331> var5, class_9616 var6, class_1297 var7);

   public int method_4973(Random var1) {
      return this.field_6446 + var1.nextInt(this.field_6444 + 1) + var1.nextInt(this.field_6445 + 1);
   }

   public static void method_4967(class_1678 var0, class_1331 var1, class_2522 var2, class_9616 var3) {
      class_8739.method_40128(var0, var1, var2);
      var3.method_44392(new class_9616(var1, var1));
   }

   private static boolean method_4971(class_8308 var0, class_1331 var1) {
      return var0.method_38320(var1, var0x -> {
         class_6414 var3 = var0x.method_8360();
         return class_4285.method_19910(var3) && !var0x.method_8350(class_4783.field_23259) && !var0x.method_8350(class_4783.field_23162);
      });
   }

   public static void method_4969(class_6755 var0, class_1331 var1) {
      if (!method_4971(var0, var1)) {
         class_8739.method_40128(var0, var1, class_4783.field_23592.method_29260());
      }
   }

   public static boolean method_4974(class_6755 var0, Random var1, class_1331 var2, Set<class_1331> var3, class_9616 var4, class_1297 var5) {
      if (!class_8739.method_40126(var0, var2)) {
         return false;
      } else {
         method_4967(var0, var2, var5.field_7145.method_35002(var1, var2), var4);
         var3.add(var2.method_6072());
         return true;
      }
   }

   public static void method_4968(class_6755 var0, Random var1, class_2921 var2, Set<class_1331> var3, class_9616 var4, class_1297 var5) {
      if (class_8739.method_40122(var0, var2)) {
         method_4974(var0, var1, var2, var3, var4, var5);
      }
   }
}
