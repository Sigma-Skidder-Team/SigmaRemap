package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class class_3844 {
   private static Method field_18761;
   private static Method field_18763;
   private static Method field_18760;

   public static List<Object> method_17839(ByteToMessageDecoder var0, ChannelHandlerContext var1, Object var2) throws InvocationTargetException {
      ArrayList var5 = new ArrayList();

      try {
         field_18761.invoke(var0, var1, var2, var5);
      } catch (IllegalAccessException var7) {
         var7.printStackTrace();
      }

      return var5;
   }

   public static void method_17843(MessageToByteEncoder var0, ChannelHandlerContext var1, Object var2, ByteBuf var3) throws InvocationTargetException {
      try {
         field_18763.invoke(var0, var1, var2, var3);
      } catch (IllegalAccessException var7) {
         var7.printStackTrace();
      }
   }

   public static List<Object> method_17840(MessageToMessageDecoder var0, ChannelHandlerContext var1, Object var2) throws InvocationTargetException {
      ArrayList var5 = new ArrayList();

      try {
         field_18760.invoke(var0, var1, var2, var5);
      } catch (IllegalAccessException var7) {
         var7.printStackTrace();
      }

      return var5;
   }

   public static boolean method_17837(Throwable var0, Class<?> var1) {
      while (var0 != null) {
         if (var1.isAssignableFrom(var0.getClass())) {
            return true;
         }

         var0 = var0.getCause();
      }

      return false;
   }

   public static ChannelHandlerContext method_17838(String var0, ChannelPipeline var1) {
      boolean var4 = false;

      for (String var6 : var1.names()) {
         if (var4) {
            return var1.context(var1.get(var6));
         }

         if (var6.equalsIgnoreCase(var0)) {
            var4 = true;
         }
      }

      return null;
   }

   public static ChannelHandlerContext method_17842(String var0, ChannelPipeline var1) {
      String var4 = null;

      for (String var6 : var1.toMap().keySet()) {
         if (var6.equals(var0)) {
            return var1.context(var4);
         }

         var4 = var6;
      }

      return null;
   }

   static {
      try {
         field_18761 = ByteToMessageDecoder.class.getDeclaredMethod("decode", ChannelHandlerContext.class, ByteBuf.class, List.class);
         field_18761.setAccessible(true);
      } catch (NoSuchMethodException var9) {
         var9.printStackTrace();
      }

      try {
         field_18763 = MessageToByteEncoder.class.getDeclaredMethod("encode", ChannelHandlerContext.class, Object.class, ByteBuf.class);
         field_18763.setAccessible(true);
      } catch (NoSuchMethodException var8) {
         var8.printStackTrace();
      }

      try {
         field_18760 = MessageToMessageDecoder.class.getDeclaredMethod("decode", ChannelHandlerContext.class, Object.class, List.class);
         field_18760.setAccessible(true);
      } catch (NoSuchMethodException var7) {
         var7.printStackTrace();
      }
   }
}
