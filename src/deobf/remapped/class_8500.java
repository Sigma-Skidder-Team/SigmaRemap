package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import javax.annotation.Nullable;

public class class_8500 {
   private static String[] field_43528;
   private static final Int2ObjectMap<class_8500> field_43531 = new Int2ObjectOpenHashMap();
   public static final class_8500 field_43527 = method_39164(new class_8500(1, GZIPInputStream::new, GZIPOutputStream::new));
   public static final class_8500 field_43530 = method_39164(new class_8500(2, InflaterInputStream::new, DeflaterOutputStream::new));
   public static final class_8500 field_43532 = method_39164(new class_8500(3, var0 -> var0, var0 -> var0));
   private final int field_43526;
   private final class_2679<InputStream> field_43529;
   private final class_2679<OutputStream> field_43525;

   private class_8500(int var1, class_2679<InputStream> var2, class_2679<OutputStream> var3) {
      this.field_43526 = var1;
      this.field_43529 = var2;
      this.field_43525 = var3;
   }

   private static class_8500 method_39164(class_8500 var0) {
      field_43531.put(var0.field_43526, var0);
      return var0;
   }

   @Nullable
   public static class_8500 method_39169(int var0) {
      return (class_8500)field_43531.get(var0);
   }

   public static boolean method_39168(int var0) {
      return field_43531.containsKey(var0);
   }

   public int method_39165() {
      return this.field_43526;
   }

   public OutputStream method_39163(OutputStream var1) throws IOException {
      return this.field_43525.method_12057(var1);
   }

   public InputStream method_39167(InputStream var1) throws IOException {
      return this.field_43529.method_12057(var1);
   }
}
