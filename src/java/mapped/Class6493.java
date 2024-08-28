package mapped;

import com.mentalfrostbyte.jello.unmapped.Class8005;

import java.util.HashSet;
import java.util.Set;

public class Class6493 extends Class6490 {

   public Class6493() {
      super(Class3411.class);
   }

   @Override
   public Set<Class8189> method19687(BlockPos var1, Class7380 var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      if (Class8005.method27349() == Class5989.field26129.method18582() && this.field28457.method1528() != null) {
         var6.add(new Class8189(var1, Blocks.AIR.method11579()));
         return var6;
      } else {
         return var6;
      }
   }
}
