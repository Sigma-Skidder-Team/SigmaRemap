package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Random;
import javax.annotation.Nullable;

public final class class_4774 extends class_2243<class_2340, class_4774> {
   private static String[] field_23135;
   public static final Codec<class_4774> field_23136 = method_10312(class_8669.field_44447, class_2340::method_10710).stable();

   public class_4774(class_2340 var1, ImmutableMap<class_5019<?>, Comparable<?>> var2, MapCodec<class_4774> var3) {
      super(var1, var2, var3);
   }

   public class_2340 method_22005() {
      return this.field_11166;
   }

   public boolean method_21993() {
      return this.method_22005().method_10719(this);
   }

   public boolean method_22001() {
      return this.method_22005().method_10727();
   }

   public float method_22008(class_6163 var1, BlockPos var2) {
      return this.method_22005().method_10707(this, var1, var2);
   }

   public float method_21998() {
      return this.method_22005().method_10713(this);
   }

   public int method_21996() {
      return this.method_22005().method_10729(this);
   }

   public boolean method_21997(class_6163 var1, BlockPos var2) {
      for (int var5 = -1; var5 <= 1; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            BlockPos var7 = var2.method_6104(var5, 0, var6);
            class_4774 var8 = var1.method_28258(var7);
            if (!var8.method_22005().method_10723(this.method_22005()) && !var1.method_28262(var7).method_8321(var1, var7)) {
               return true;
            }
         }
      }

      return false;
   }

   public void method_22004(World var1, BlockPos var2) {
      this.method_22005().method_10718(var1, var2, this);
   }

   public void method_22002(World var1, BlockPos var2, Random var3) {
      this.method_22005().method_10722(var1, var2, this, var3);
   }

   public boolean method_22000() {
      return this.method_22005().method_10715();
   }

   public void method_21999(World var1, BlockPos var2, Random var3) {
      this.method_22005().method_10706(var1, var2, this, var3);
   }

   public Vector3d method_22003(class_6163 var1, BlockPos var2) {
      return this.method_22005().method_10725(var1, var2, this);
   }

   public class_2522 method_22006() {
      return this.method_22005().method_10726(this);
   }

   @Nullable
   public class_5079 method_22010() {
      return this.method_22005().method_10714();
   }

   public boolean method_22007(class_2307<class_2340> var1) {
      return this.method_22005().method_10724(var1);
   }

   public float method_21995() {
      return this.method_22005().method_10716();
   }

   public boolean method_22009(class_6163 var1, BlockPos var2, class_2340 var3, Direction var4) {
      return this.method_22005().method_10709(this, var1, var2, var3, var4);
   }

   public class_4190 method_21994(class_6163 var1, BlockPos var2) {
      return this.method_22005().method_10712(this, var1, var2);
   }
}
