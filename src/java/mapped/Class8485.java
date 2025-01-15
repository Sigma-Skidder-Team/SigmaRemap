// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.lang.reflect.Method;

public class Class8485
{
    private static Method field34825;
    private static Method field34826;
    private static Method field34827;
    
    public static List<Object> method28335(final ByteToMessageDecoder obj, final ChannelHandlerContext channelHandlerContext, final Object o) throws InvocationTargetException {
        final ArrayList list = new ArrayList();
        try {
            Class8485.field34825.invoke(obj, channelHandlerContext, o, list);
        }
        catch (final IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public static void method28336(final MessageToByteEncoder obj, final ChannelHandlerContext channelHandlerContext, final Object o, final ByteBuf byteBuf) throws InvocationTargetException {
        try {
            Class8485.field34826.invoke(obj, channelHandlerContext, o, byteBuf);
        }
        catch (final IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }
    
    public static List<Object> method28337(final MessageToMessageDecoder obj, final ChannelHandlerContext channelHandlerContext, final Object o) throws InvocationTargetException {
        final ArrayList list = new ArrayList();
        try {
            Class8485.field34827.invoke(obj, channelHandlerContext, o, list);
        }
        catch (final IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public static boolean method28338(Throwable cause, final Class<? extends Throwable> clazz) {
        while (true) {
            if (cause != null) {
                if (clazz.isAssignableFrom(cause.getClass())) {
                    return true;
                }
                cause = cause.getCause();
            }
            if (cause != null) {
                continue;
            }
            return false;
        }
    }
    
    public static ChannelHandlerContext method28339(final String anotherString, final ChannelPipeline channelPipeline) {
        int n = 0;
        for (final String s : channelPipeline.names()) {
            if (n != 0) {
                return channelPipeline.context(channelPipeline.get(s));
            }
            if (!s.equalsIgnoreCase(anotherString)) {
                continue;
            }
            n = 1;
        }
        return null;
    }
    
    public static ChannelHandlerContext method28340(final String anObject, final ChannelPipeline channelPipeline) {
        String s = null;
        for (final String s2 : channelPipeline.toMap().keySet()) {
            if (s2.equals(anObject)) {
                return channelPipeline.context(s);
            }
            s = s2;
        }
        return null;
    }
    
    static {
        try {
            (Class8485.field34825 = ByteToMessageDecoder.class.getDeclaredMethod("decode", ChannelHandlerContext.class, ByteBuf.class, List.class)).setAccessible(true);
        }
        catch (final NoSuchMethodException ex) {
            ex.printStackTrace();
        }
        try {
            (Class8485.field34826 = MessageToByteEncoder.class.getDeclaredMethod("encode", ChannelHandlerContext.class, Object.class, ByteBuf.class)).setAccessible(true);
        }
        catch (final NoSuchMethodException ex2) {
            ex2.printStackTrace();
        }
        try {
            (Class8485.field34827 = MessageToMessageDecoder.class.getDeclaredMethod("decode", ChannelHandlerContext.class, Object.class, List.class)).setAccessible(true);
        }
        catch (final NoSuchMethodException ex3) {
            ex3.printStackTrace();
        }
    }
}
