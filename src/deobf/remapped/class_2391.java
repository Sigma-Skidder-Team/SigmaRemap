package remapped;

import java.util.HashMap;
import java.util.Map;

public enum class_2391 {
   field_11921((byte)0, (byte)0, (byte)-1, class_414.field_1762),
   field_11930((byte)0, (byte)0, (byte)1, class_414.field_1762),
   field_11927((byte)1, (byte)0, (byte)0, class_414.field_1761),
   field_11928((byte)-1, (byte)0, (byte)0, class_414.field_1761),
   field_11924((byte)0, (byte)1, (byte)0, class_414.field_1760),
   field_11922((byte)0, (byte)-1, (byte)0, class_414.field_1760);

   private static final Map<class_2391, class_2391> field_11931 = new HashMap<class_2391, class_2391>();
   private final byte field_11919;
   private final byte field_11926;
   private final byte field_11925;
   private final class_414 field_11923;

   private class_2391(byte var3, byte var4, byte var5, class_414 var6) {
      this.field_11919 = var3;
      this.field_11926 = var4;
      this.field_11925 = var5;
      this.field_11923 = var6;
   }

   public class_2391 method_10900() {
      return field_11931.get(this);
   }

   public byte method_10896() {
      return this.field_11919;
   }

   public byte method_10898() {
      return this.field_11926;
   }

   public byte method_10899() {
      return this.field_11925;
   }

   public class_414 method_10901() {
      return this.field_11923;
   }

   static {
      field_11931.put(field_11921, field_11930);
      field_11931.put(field_11930, field_11921);
      field_11931.put(field_11927, field_11928);
      field_11931.put(field_11928, field_11927);
      field_11931.put(field_11924, field_11922);
      field_11931.put(field_11922, field_11924);
   }
}
