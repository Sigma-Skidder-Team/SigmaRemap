package remapped;

import com.mojang.serialization.Codec;

public class class_2427 extends class_8583<class_2427> implements class_5079 {
   private static String[] field_12083;
   private static final class_7981<class_2427> field_12085 = new class_9488();
   private final Codec<class_2427> field_12084 = Codec.unit(this::method_11075);

   public class_2427(boolean var1) {
      super(var1, field_12085);
   }

   public class_2427 method_11075() {
      return this;
   }

   @Override
   public Codec<class_2427> method_39481() {
      return this.field_12084;
   }

   @Override
   public void method_23359(class_8248 var1) {
   }

   @Override
   public String method_23358() {
      return class_8669.field_44387.method_39797(this).toString();
   }
}
