package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Class3268 extends Class3264 {
   private static String[] field18763;
   private static final Set<Class3209> field18764 = ImmutableSet.of(
      Class8487.field36728,
      Class8487.field36420,
      Class8487.field36399,
      Class8487.field36479,
      Class8487.field36537,
      Class8487.field36536,
      new Class3209[]{
         Class8487.field36478,
         Class8487.field36521,
         Class8487.field36418,
         Class8487.field36421,
         Class8487.field36572,
         Class8487.field36522,
         Class8487.field36419,
         Class8487.field36456,
         Class8487.field36455,
         Class8487.field36526,
         Class8487.field36580,
         Class8487.field36796,
         Class8487.field37006,
         Class8487.field36550,
         Class8487.field36567,
         Class8487.field36458,
         Class8487.field36459,
         Class8487.field36460,
         Class8487.field36836,
         Class8487.field36837,
         Class8487.field36835,
         Class8487.field36388,
         Class8487.field36389,
         Class8487.field36390,
         Class8487.field36391,
         Class8487.field36392,
         Class8487.field36393,
         Class8487.field36394,
         Class8487.field36845,
         Class8487.field36846,
         Class8487.field36847,
         Class8487.field36849,
         Class8487.field36850,
         Class8487.field36851,
         Class8487.field36852,
         Class8487.field36853,
         Class8487.field36854,
         Class8487.field36855,
         Class8487.field36857,
         Class8487.field36860,
         Class8487.field36861,
         Class8487.field36859,
         Class8487.field36858,
         Class8487.field36570,
         Class8487.field36559,
         Class8487.field37028,
         Class8487.field37029,
         Class8487.field37030,
         Class8487.field37031,
         Class8487.field37032,
         Class8487.field37033,
         Class8487.field37034,
         Class8487.field37035,
         Class8487.field37036,
         Class8487.field37037,
         Class8487.field37038,
         Class8487.field37039,
         Class8487.field37040,
         Class8487.field36896,
         Class8487.field36912,
         Class8487.field36908,
         Class8487.field36909,
         Class8487.field36906,
         Class8487.field36904,
         Class8487.field36910,
         Class8487.field36900,
         Class8487.field36905,
         Class8487.field36902,
         Class8487.field36899,
         Class8487.field36898,
         Class8487.field36903,
         Class8487.field36907,
         Class8487.field36911,
         Class8487.field36897,
         Class8487.field36901,
         Class8487.field36487,
         Class8487.field36480,
         Class8487.field36488
      }
   );

   public Class3268(Class2283 var1, int var2, float var3, Class5643 var4) {
      super((float)var2, var3, var1, field18764, var4);
   }

   @Override
   public boolean method11715(Class7380 var1) {
      int var4 = this.method11783().method9013();
      if (var1.method23448(Class8487.field36527)
         || var1.method23448(Class8487.field37123)
         || var1.method23448(Class8487.field37121)
         || var1.method23448(Class8487.field37124)
         || var1.method23448(Class8487.field37122)) {
         return var4 >= 3;
      } else if (var1.method23448(Class8487.field36537)
         || var1.method23448(Class8487.field36536)
         || var1.method23448(Class8487.field36656)
         || var1.method23448(Class8487.field36660)
         || var1.method23448(Class8487.field36521)
         || var1.method23448(Class8487.field36418)
         || var1.method23448(Class8487.field36567)) {
         return var4 >= 2;
      } else if (!var1.method23448(Class8487.field36522)
         && !var1.method23448(Class8487.field36419)
         && !var1.method23448(Class8487.field36456)
         && !var1.method23448(Class8487.field36455)) {
         Class8649 var5 = var1.method23384();
         return var5 == Class8649.field38966 || var5 == Class8649.field38967 || var5 == Class8649.field38969 || var1.method23448(Class8487.field36421);
      } else {
         return var4 >= 1;
      }
   }

   @Override
   public float method11708(Class8848 var1, Class7380 var2) {
      Class8649 var5 = var2.method23384();
      return var5 != Class8649.field38967 && var5 != Class8649.field38969 && var5 != Class8649.field38966 ? super.method11708(var1, var2) : this.field18752;
   }
}
