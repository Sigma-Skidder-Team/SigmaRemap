package remapped;

import com.mojang.serialization.Codec;

public class class_8783<P extends class_6291> {
   public static final class_8783<class_4838> field_44950 = method_40373("trunk_vine", class_4838.field_24144);
   public static final class_8783<class_1985> field_44947 = method_40373("leave_vine", class_1985.field_10055);
   public static final class_8783<class_1424> field_44944 = method_40373("cocoa", class_1424.field_7702);
   public static final class_8783<class_9061> field_44949 = method_40373("beehive", class_9061.field_46378);
   public static final class_8783<class_7391> field_44948 = method_40373("alter_ground", class_7391.field_37744);
   private final Codec<P> field_44945;

   private static <P extends class_6291> class_8783<P> method_40373(String var0, Codec<P> var1) {
      return class_8669.<class_8783<P>>method_39791(class_8669.field_44454, var0, new class_8783<P>(var1));
   }

   private class_8783(Codec<P> var1) {
      this.field_44945 = var1;
   }

   public Codec<P> method_40372() {
      return this.field_44945;
   }
}
