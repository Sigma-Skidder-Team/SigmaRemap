package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Random;
import javax.annotation.Nullable;

public final class Class7379 extends Class7378<Class7631, Class7379> {
   private static String[] field31583;
   public static final Codec<Class7379> field31584 = method23469(Registry.field16070, Class7631::method25049).stable();

   public Class7379(Class7631 var1, ImmutableMap<Class8550<?>, Comparable<?>> var2, MapCodec<Class7379> var3) {
      super(var1, var2, var3);
   }

   public Class7631 method23472() {
      return this.field31579;
   }

   public boolean method23473() {
      return this.method23472().method25064(this);
   }

   public boolean method23474() {
      return this.method23472().method25059();
   }

   public float method23475(Class1665 var1, BlockPos var2) {
      return this.method23472().method25061(this, var1, var2);
   }

   public float method23476() {
      return this.method23472().method25062(this);
   }

   public int method23477() {
      return this.method23472().method25065(this);
   }

   public boolean method23478(Class1665 var1, BlockPos var2) {
      for (int var5 = -1; var5 <= 1; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            BlockPos var7 = var2.method8336(var5, 0, var6);
            Class7379 var8 = var1.method6739(var7);
            if (!var8.method23472().method25066(this.method23472()) && !var1.getBlockState(var7).method23409(var1, var7)) {
               return true;
            }
         }
      }

      return false;
   }

   public void method23479(World var1, BlockPos var2) {
      this.method23472().method25052(var1, var2, this);
   }

   public void method23480(World var1, BlockPos var2, Random var3) {
      this.method23472().method25051(var1, var2, this, var3);
   }

   public boolean method23481() {
      return this.method23472().method25058();
   }

   public void method23482(World var1, BlockPos var2, Random var3) {
      this.method23472().method25053(var1, var2, this, var3);
   }

   public Vector3d method23483(Class1665 var1, BlockPos var2) {
      return this.method23472().method25056(var1, var2, this);
   }

   public BlockState method23484() {
      return this.method23472().method25063(this);
   }

   @Nullable
   public Class7436 method23485() {
      return this.method23472().method25054();
   }

   public boolean method23486(Class7608<Class7631> var1) {
      return this.method23472().method25067(var1);
   }

   public float method23487() {
      return this.method23472().method25060();
   }

   public boolean method23488(Class1665 var1, BlockPos var2, Class7631 var3, Direction var4) {
      return this.method23472().method25055(this, var1, var2, var3, var4);
   }

   public Class6408 method23489(Class1665 var1, BlockPos var2) {
      return this.method23472().method25068(this, var1, var2);
   }
}
