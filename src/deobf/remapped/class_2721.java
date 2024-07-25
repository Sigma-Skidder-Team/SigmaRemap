package remapped;

import java.util.function.IntConsumer;
import org.apache.commons.lang3.Validate;

public class class_2721 {
   private static final int[] field_13309 = new int[]{
      -1,
      -1,
      0,
      Integer.MIN_VALUE,
      0,
      0,
      1431655765,
      1431655765,
      0,
      Integer.MIN_VALUE,
      0,
      1,
      858993459,
      858993459,
      0,
      715827882,
      715827882,
      0,
      613566756,
      613566756,
      0,
      Integer.MIN_VALUE,
      0,
      2,
      477218588,
      477218588,
      0,
      429496729,
      429496729,
      0,
      390451572,
      390451572,
      0,
      357913941,
      357913941,
      0,
      330382099,
      330382099,
      0,
      306783378,
      306783378,
      0,
      286331153,
      286331153,
      0,
      Integer.MIN_VALUE,
      0,
      3,
      252645135,
      252645135,
      0,
      238609294,
      238609294,
      0,
      226050910,
      226050910,
      0,
      214748364,
      214748364,
      0,
      204522252,
      204522252,
      0,
      195225786,
      195225786,
      0,
      186737708,
      186737708,
      0,
      178956970,
      178956970,
      0,
      171798691,
      171798691,
      0,
      165191049,
      165191049,
      0,
      159072862,
      159072862,
      0,
      153391689,
      153391689,
      0,
      148102320,
      148102320,
      0,
      143165576,
      143165576,
      0,
      138547332,
      138547332,
      0,
      Integer.MIN_VALUE,
      0,
      4,
      130150524,
      130150524,
      0,
      126322567,
      126322567,
      0,
      122713351,
      122713351,
      0,
      119304647,
      119304647,
      0,
      116080197,
      116080197,
      0,
      113025455,
      113025455,
      0,
      110127366,
      110127366,
      0,
      107374182,
      107374182,
      0,
      104755299,
      104755299,
      0,
      102261126,
      102261126,
      0,
      99882960,
      99882960,
      0,
      97612893,
      97612893,
      0,
      95443717,
      95443717,
      0,
      93368854,
      93368854,
      0,
      91382282,
      91382282,
      0,
      89478485,
      89478485,
      0,
      87652393,
      87652393,
      0,
      85899345,
      85899345,
      0,
      84215045,
      84215045,
      0,
      82595524,
      82595524,
      0,
      81037118,
      81037118,
      0,
      79536431,
      79536431,
      0,
      78090314,
      78090314,
      0,
      76695844,
      76695844,
      0,
      75350303,
      75350303,
      0,
      74051160,
      74051160,
      0,
      72796055,
      72796055,
      0,
      71582788,
      71582788,
      0,
      70409299,
      70409299,
      0,
      69273666,
      69273666,
      0,
      68174084,
      68174084,
      0,
      Integer.MIN_VALUE,
      0,
      5
   };
   private final long[] field_13303;
   private final int field_13301;
   private final long field_13306;
   private final int field_13307;
   private final int field_13308;
   private final int field_13302;
   private final int field_13300;
   private final int field_13305;

   public class_2721(int var1, int var2) {
      this(var1, var2, (long[])null);
   }

   public class_2721(int var1, int var2, long[] var3) {
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      this.field_13307 = var2;
      this.field_13301 = var1;
      this.field_13306 = (1L << var1) - 1L;
      this.field_13308 = (char)(64 / var1);
      int var6 = 3 * (this.field_13308 - 1);
      this.field_13302 = field_13309[var6 + 0];
      this.field_13300 = field_13309[var6 + 1];
      this.field_13305 = field_13309[var6 + 2];
      int var7 = (var2 + this.field_13308 - 1) / this.field_13308;
      if (var3 == null) {
         this.field_13303 = new long[var7];
      } else {
         if (var3.length != var7) {
            throw (RuntimeException) Util.method_44658(
               new RuntimeException("Invalid length given for storage, got: " + var3.length + " but expected: " + var7)
            );
         }

         this.field_13303 = var3;
      }
   }

   private int method_12250(int var1) {
      long var4 = Integer.toUnsignedLong(this.field_13302);
      long var6 = Integer.toUnsignedLong(this.field_13300);
      return (int)((long)var1 * var4 + var6 >> 32 >> this.field_13305);
   }

   public int method_12245(int var1, int var2) {
      Validate.inclusiveBetween(0L, (long)(this.field_13307 - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.field_13306, (long)var2);
      int var5 = this.method_12250(var1);
      long var6 = this.field_13303[var5];
      int var8 = (var1 - var5 * this.field_13308) * this.field_13301;
      int var9 = (int)(var6 >> var8 & this.field_13306);
      this.field_13303[var5] = var6 & ~(this.field_13306 << var8) | ((long)var2 & this.field_13306) << var8;
      return var9;
   }

   public void method_12248(int var1, int var2) {
      Validate.inclusiveBetween(0L, (long)(this.field_13307 - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.field_13306, (long)var2);
      int var5 = this.method_12250(var1);
      long var6 = this.field_13303[var5];
      int var8 = (var1 - var5 * this.field_13308) * this.field_13301;
      this.field_13303[var5] = var6 & ~(this.field_13306 << var8) | ((long)var2 & this.field_13306) << var8;
   }

   public int method_12247(int var1) {
      Validate.inclusiveBetween(0L, (long)(this.field_13307 - 1), (long)var1);
      int var4 = this.method_12250(var1);
      long var5 = this.field_13303[var4];
      int var7 = (var1 - var4 * this.field_13308) * this.field_13301;
      return (int)(var5 >> var7 & this.field_13306);
   }

   public long[] method_12246() {
      return this.field_13303;
   }

   public int method_12244() {
      return this.field_13307;
   }

   public void method_12249(IntConsumer var1) {
      int var4 = 0;

      for (long var8 : this.field_13303) {
         for (int var10 = 0; var10 < this.field_13308; var10++) {
            var1.accept((int)(var8 & this.field_13306));
            var8 >>= this.field_13301;
            if (++var4 >= this.field_13307) {
               return;
            }
         }
      }
   }
}
