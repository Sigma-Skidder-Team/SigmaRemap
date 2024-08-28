package mapped;

import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class7486 extends Class7487 {
   public static final Codec<Class7486> field32181 = Codec.unit(() -> Class7486.field32182);
   public static final Class7486 field32182 = new Class7486();

   private Class7486() {
      super(Class109.field366);
   }

   @Override
   public List<Class8266> method24374(Class8761 var1, BlockPos var2, Class80 var3, Random var4) {
      return Collections.<Class8266>emptyList();
   }

   @Override
   public Class9764 method24375(Class8761 var1, BlockPos var2, Class80 var3) {
      return Class9764.method38386();
   }

   @Override
   public boolean method24376(
           Class8761 var1, Class1658 var2, Class7480 var3, Class5646 var4, BlockPos var5, BlockPos var6, Class80 var7, Class9764 var8, Random var9, boolean var10
   ) {
      return true;
   }

   @Override
   public Class8325<?> method24377() {
      return Class8325.field35773;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
