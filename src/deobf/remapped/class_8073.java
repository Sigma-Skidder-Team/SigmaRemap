package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8073 {
   private static final Logger field_41294 = LogManager.getLogger();
   private static final Map<Class<? extends Entity>, Integer> field_41302 = Maps.newHashMap();
   private final Entity field_41298;
   private final Map<Integer, class_9659<?>> field_41295 = Maps.newHashMap();
   private final ReadWriteLock field_41293 = new ReentrantReadWriteLock();
   private boolean field_41299 = true;
   private boolean field_41297;
   public class_6325 field_41296 = class_5630.field_28568;
   public class_1331 field_41301 = class_1331.field_7306;

   public class_8073(Entity var1) {
      this.field_41298 = var1;
   }

   public static <T> class_7821<T> method_36641(Class<? extends Entity> var0, class_1720<T> var1) {
      if (field_41294.isDebugEnabled()) {
         try {
            Class var4 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            if (!var4.equals(var0)) {
               field_41294.debug("defineId called for: {} from {}", var0, var4, new RuntimeException());
            }
         } catch (ClassNotFoundException var7) {
         }
      }

      int var8;
      if (field_41302.containsKey(var0)) {
         var8 = field_41302.get(var0) + 1;
      } else {
         int var5 = 0;
         Class var6 = var0;

         while (var6 != Entity.class) {
            var6 = var6.getSuperclass();
            if (field_41302.containsKey(var6)) {
               var5 = field_41302.get(var6) + 1;
               break;
            }
         }

         var8 = var5;
      }

      if (var8 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + var8 + "! (Max is " + 254 + ")");
      } else {
         field_41302.put(var0, var8);
         return var1.method_7707(var8);
      }
   }

   public <T> void method_36634(class_7821<T> var1, T var2) {
      int var5 = var1.method_35423();
      if (var5 <= 254) {
         if (!this.field_41295.containsKey(var5)) {
            if (class_2734.method_12300(var1.method_35421()) >= 0) {
               this.method_36636(var1, var2);
            } else {
               throw new IllegalArgumentException("Unregistered serializer " + var1.method_35421() + " for " + var5 + "!");
            }
         } else {
            throw new IllegalArgumentException("Duplicate id value for " + var5 + "!");
         }
      } else {
         throw new IllegalArgumentException("Data value id is too big with " + var5 + "! (Max is " + 254 + ")");
      }
   }

   private <T> void method_36636(class_7821<T> var1, T var2) {
      class_9659 var5 = new class_9659<Object>(var1, var2);
      this.field_41293.writeLock().lock();
      this.field_41295.put(var1.method_35423(), var5);
      this.field_41299 = false;
      this.field_41293.writeLock().unlock();
   }

   private <T> class_9659<T> method_36639(class_7821<T> var1) {
      this.field_41293.readLock().lock();

      class_9659 var4;
      try {
         var4 = this.field_41295.get(var1.method_35423());
      } catch (Throwable var11) {
         class_159 var6 = class_159.method_643(var11, "Getting synched entity data");
         class_6544 var7 = var6.method_639("Synched entity data");
         var7.method_29850("Data ID", var1);
         throw new class_3297(var6);
      } finally {
         this.field_41293.readLock().unlock();
      }

      return var4;
   }

   public <T> T method_36640(class_7821<T> var1) {
      return this.<T>method_36639(var1).method_44585();
   }

   public <T> void method_36633(class_7821<T> var1, T var2) {
      class_9659 var5 = this.method_36639(var1);
      if (ObjectUtils.notEqual(var2, var5.method_44585())) {
         var5.method_44588(var2);
         this.field_41298.method_37191(var1);
         var5.method_44581(true);
         this.field_41297 = true;
      }
   }

   public boolean method_36643() {
      return this.field_41297;
   }

   public static void method_36632(List<class_9659<?>> var0, class_8248 var1) throws IOException {
      if (var0 != null) {
         int var4 = 0;

         for (int var5 = var0.size(); var4 < var5; var4++) {
            method_36645(var1, (class_9659)var0.get(var4));
         }
      }

      var1.writeByte(255);
   }

   @Nullable
   public List<class_9659<?>> method_36635() {
      ArrayList var3 = null;
      if (this.field_41297) {
         this.field_41293.readLock().lock();

         for (class_9659 var5 : this.field_41295.values()) {
            if (var5.method_44587()) {
               var5.method_44581(false);
               if (var3 == null) {
                  var3 = Lists.newArrayList();
               }

               var3.add(var5.method_44583());
            }
         }

         this.field_41293.readLock().unlock();
      }

      this.field_41297 = false;
      return var3;
   }

   @Nullable
   public List<class_9659<?>> method_36629() {
      ArrayList var3 = null;
      this.field_41293.readLock().lock();

      for (class_9659 var5 : this.field_41295.values()) {
         if (var3 == null) {
            var3 = Lists.newArrayList();
         }

         var3.add(var5.method_44583());
      }

      this.field_41293.readLock().unlock();
      return var3;
   }

   private static <T> void method_36645(class_8248 var0, class_9659<T> var1) throws IOException {
      class_7821 var4 = var1.method_44582();
      int var5 = class_2734.method_12300(var4.method_35421());
      if (var5 >= 0) {
         var0.writeByte(var4.method_35423());
         var0.method_37743(var5);
         var4.method_35421().method_7708(var0, var1.method_44585());
      } else {
         throw new EncoderException("Unknown serializer type " + var4.method_35421());
      }
   }

   @Nullable
   public static List<class_9659<?>> method_36630(class_8248 var0) throws IOException {
      ArrayList var3 = null;

      short var4;
      while ((var4 = var0.readUnsignedByte()) != 255) {
         if (var3 == null) {
            var3 = Lists.newArrayList();
         }

         int var5 = var0.method_37778();
         class_1720 var6 = class_2734.method_12301(var5);
         if (var6 == null) {
            throw new DecoderException("Unknown serializer type " + var5);
         }

         var3.add(method_36644(var0, var4, var6));
      }

      return var3;
   }

   private static <T> class_9659<T> method_36644(class_8248 var0, int var1, class_1720<T> var2) {
      return new class_9659<T>(var2.method_7707(var1), (T)var2.method_7710(var0));
   }

   public void method_36642(List<class_9659<?>> var1) {
      this.field_41293.writeLock().lock();

      for (class_9659 var5 : var1) {
         class_9659 var6 = this.field_41295.get(var5.method_44582().method_35423());
         if (var6 != null) {
            this.method_36638(var6, var5);
            this.field_41298.method_37191(var5.method_44582());
         }
      }

      this.field_41293.writeLock().unlock();
      this.field_41297 = true;
   }

   private <T> void method_36638(class_9659<T> var1, class_9659<?> var2) {
      if (Objects.equals(class_9659.method_44584(var2).method_35421(), class_9659.method_44584(var1).method_35421())) {
         var1.method_44588(var2.method_44585());
      } else {
         throw new IllegalStateException(
            String.format(
               "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)",
               class_9659.method_44584(var1).method_35423(),
               this.field_41298,
               class_9659.method_44580(var1),
               class_9659.method_44580(var1).getClass(),
               class_9659.method_44580(var2),
               class_9659.method_44580(var2).getClass()
            )
         );
      }
   }

   public boolean method_36637() {
      return this.field_41299;
   }

   public void method_36646() {
      this.field_41297 = false;
      this.field_41293.readLock().lock();

      for (class_9659 var4 : this.field_41295.values()) {
         var4.method_44581(false);
      }

      this.field_41293.readLock().unlock();
   }
}
