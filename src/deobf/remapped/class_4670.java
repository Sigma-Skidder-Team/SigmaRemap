package remapped;

import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;

public class class_4670 implements class_4608 {
   private static String[] field_22768;
   private long field_22769;
   private long field_22766;
   private Object2LongOpenHashMap<String> field_22767 = new Object2LongOpenHashMap();

   private class_4670() {
   }

   @Override
   public long method_21362() {
      return this.field_22769;
   }

   @Override
   public long method_21361() {
      return this.field_22766;
   }

   @Override
   public Object2LongMap<String> method_21360() {
      return Object2LongMaps.unmodifiable(this.field_22767);
   }
}
