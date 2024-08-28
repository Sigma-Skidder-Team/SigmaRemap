package mapped;

import java.util.stream.Collectors;

public class Class9443 {
   private static String[] field43871;
   private static volatile Class8933 field43872 = Class8933.method32664(
      Class7984.<Block>method27142(Class7645.method25116().stream().collect(Collectors.toMap(Class7610::method24929, var0 -> (Class7608<Block>)var0))),
      Class7984.<Class3257>method27142(Class5985.method18562().stream().collect(Collectors.toMap(Class7610::method24929, var0 -> (Class7608<Class3257>)var0))),
      Class7984.<Class7631>method27142(Class8953.method32717().stream().collect(Collectors.toMap(Class7610::method24929, var0 -> (Class7608<Class7631>)var0))),
      Class7984.<Class8992<?>>method27142(
         Class8613.method30862().stream().collect(Collectors.toMap(Class7610::method24929, var0 -> (Class7608<Class8992<?>>)var0))
      )
   );

   public static Class8933 method36296() {
      return field43872;
   }

   public static void method36297(Class8933 var0) {
      field43872 = var0;
   }
}
