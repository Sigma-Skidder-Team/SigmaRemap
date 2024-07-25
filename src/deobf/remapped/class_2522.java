package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.concurrent.atomic.AtomicInteger;

public class class_2522 extends class_1873 {
   public static final Codec<class_2522> field_12489 = method_10312(class_8669.field_44462, class_6414::method_29260).stable();
   private int field_12495 = -1;
   private int field_12490 = -1;
   private Identifier field_12492;
   private int field_12493 = -1;
   private static final AtomicInteger field_12491 = new AtomicInteger(0);

   public int method_11477() {
      if (this.field_12495 < 0) {
         this.field_12495 = class_8669.field_44462.method_14041(this.method_8360());
      }

      return this.field_12495;
   }

   public int method_11473() {
      if (this.field_12490 < 0) {
         this.field_12490 = class_9451.method_43707(this);
         if (this.field_12490 < 0) {
            Config.method_14317("Metadata not found, block: " + this.method_11474());
            this.field_12490 = 0;
         }
      }

      return this.field_12490;
   }

   public Identifier method_11474() {
      if (this.field_12492 == null) {
         this.field_12492 = class_8669.field_44462.method_39797(this.method_8360());
      }

      return this.field_12492;
   }

   public int method_11472() {
      if (this.field_12493 < 0) {
         this.field_12493 = field_12491.incrementAndGet();
      }

      return this.field_12493;
   }

   public int method_11478(class_6163 var1, class_1331 var2) {
      return this.method_8339();
   }

   public boolean method_11475() {
      return this.field_9491 != null && this.field_9491.field_3748;
   }

   public boolean method_11476() {
      return this.field_9491 != null && this.field_9491.field_3749;
   }

   public class_2522(class_6414 var1, ImmutableMap<class_5019<?>, Comparable<?>> var2, MapCodec<class_2522> var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_2522 method_8336() {
      return this;
   }
}
