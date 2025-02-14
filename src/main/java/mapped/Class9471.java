package mapped;

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

public class Class9471 {
   private static String[] field44006;
   private static final Int2ObjectMap<Class9471> field44007 = new Int2ObjectOpenHashMap();
   public static final Class9471 field44008 = method36522(new Class9471(1, GZIPInputStream::new, GZIPOutputStream::new));
   public static final Class9471 field44009 = method36522(new Class9471(2, InflaterInputStream::new, DeflaterOutputStream::new));
   public static final Class9471 field44010 = method36522(new Class9471(3, var0 -> var0, var0 -> var0));
   private final int field44011;
   private final Class7767<InputStream> field44012;
   private final Class7767<OutputStream> field44013;

   private Class9471(int var1, Class7767<InputStream> var2, Class7767<OutputStream> var3) {
      this.field44011 = var1;
      this.field44012 = var2;
      this.field44013 = var3;
   }

   private static Class9471 method36522(Class9471 var0) {
      field44007.put(var0.field44011, var0);
      return var0;
   }

   @Nullable
   public static Class9471 method36523(int var0) {
      return (Class9471)field44007.get(var0);
   }

   public static boolean method36524(int var0) {
      return field44007.containsKey(var0);
   }

   public int method36525() {
      return this.field44011;
   }

   public OutputStream method36526(OutputStream var1) throws IOException {
      return this.field44013.method25744(var1);
   }

   public InputStream method36527(InputStream var1) throws IOException {
      return this.field44012.method25744(var1);
   }
}
