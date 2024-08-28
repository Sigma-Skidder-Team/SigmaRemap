package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6489 extends Class6490 {
   private static String[] field28455;

   public Class6489() {
      super(Class3222.class);
   }

   @Override
   public Set<Class8189> method19687(BlockPos var1, Class7380 var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      Class7380 var7 = Minecraft.getInstance().field1338.method6738(var1);
      if (var7.method23383() instanceof Class3222) {
         var6.add(new Class8189(var1, var7.method23465(Class3222.field18651, var2.<Integer>method23463(Class3222.field18651))));
      }

      return var6;
   }

   @Override
   public Set<Class8189> method19688(BlockPos var1, Class7380 var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      Class8711 var7 = new Class8711(new Vector3d(0.0, 0.0, 0.0), Direction.field673, var1, false);
      Class5909 var8 = new Class5909(this.field28457.field1338, this.field28457.field1339, Class79.field182, new Class8848(var2.method23383()), var7);
      var8.field25717 = var1;
      var8.field25718 = false;
      Class7380 var9 = var2.method23383().method11495(var8);
      var6.add(new Class8189(var1, var9.method23465(Class3222.field18651, var2.<Integer>method23463(Class3222.field18651))));
      return var6;
   }
}
