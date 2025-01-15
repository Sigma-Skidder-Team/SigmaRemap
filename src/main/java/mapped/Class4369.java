// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import javax.annotation.Nullable;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.ArgumentBuilder;
import java.util.HashMap;
import java.util.Map;
import com.mojang.brigadier.tree.CommandNode;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayDeque;
import com.mojang.brigadier.tree.RootCommandNode;

public class Class4369 implements Class4252<Class5800>
{
    private RootCommandNode<Class7491> field19568;
    
    public Class4369() {
    }
    
    public Class4369(final RootCommandNode<Class7491> field19568) {
        this.field19568 = field19568;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        final Class8624[] array = new Class8624[class8654.method29501()];
        final ArrayDeque arrayDeque = new ArrayDeque(array.length);
        for (int i = 0; i < array.length; ++i) {
            arrayDeque.add((Object)(array[i] = this.method13136(class8654)));
        }
        while (!arrayDeque.isEmpty()) {
            int n = 0;
            final Iterator iterator = arrayDeque.iterator();
            while (iterator.hasNext()) {
                if (!((Class8624)iterator.next()).method29264(array)) {
                    continue;
                }
                iterator.remove();
                n = 1;
            }
            if (n != 0) {
                continue;
            }
            throw new IllegalStateException("Server sent an impossible command tree");
        }
        this.field19568 = (RootCommandNode<Class7491>)Class8624.method29266(array[class8654.method29501()]);
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        final HashMap hashMap = Maps.newHashMap();
        final ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.field19568);
        while (!arrayDeque.isEmpty()) {
            final CommandNode commandNode = (CommandNode)arrayDeque.pollFirst();
            if (hashMap.containsKey(commandNode)) {
                continue;
            }
            hashMap.put(commandNode, hashMap.size());
            arrayDeque.addAll(commandNode.getChildren());
            if (commandNode.getRedirect() == null) {
                continue;
            }
            arrayDeque.add(commandNode.getRedirect());
        }
        final CommandNode[] array = new CommandNode[hashMap.size()];
        for (final Map.Entry<K, Integer> entry : hashMap.entrySet()) {
            array[entry.getValue()] = (CommandNode)entry.getKey();
        }
        class8654.method29505(array.length);
        final CommandNode[] array2 = array;
        for (int length = array2.length, i = 0; i < length; ++i) {
            this.method13138(class8654, (CommandNode<Class7491>)array2[i], hashMap);
        }
        class8654.method29505((int)hashMap.get(this.field19568));
    }
    
    private Class8624 method13136(final Class8654 class8654) {
        final byte byte1 = class8654.readByte();
        return new Class8624(this.method13137(class8654, byte1), byte1, 0, class8654.method29489(), null);
    }
    
    @Nullable
    private ArgumentBuilder<Class7491, ?> method13137(final Class8654 class8654, final byte b) {
        final int n = b & 0x3;
        if (n != 2) {
            return (ArgumentBuilder<Class7491, ?>)((n != 1) ? null : LiteralArgumentBuilder.literal(class8654.method29513(32767)));
        }
        final String method29513 = class8654.method29513(32767);
        final ArgumentType<?> method29514 = Class8381.method27935(class8654);
        if (method29514 != null) {
            final RequiredArgumentBuilder argument = RequiredArgumentBuilder.argument(method29513, (ArgumentType)method29514);
            if ((b & 0x10) != 0x0) {
                argument.suggests((SuggestionProvider)Class8533.method28625(class8654.method29516()));
            }
            return (ArgumentBuilder<Class7491, ?>)argument;
        }
        return null;
    }
    
    private void method13138(final Class8654 class8654, final CommandNode<Class7491> obj, final Map<CommandNode<Class7491>, Integer> map) {
        byte b = 0;
        if (obj.getRedirect() != null) {
            b |= 0x8;
        }
        if (obj.getCommand() != null) {
            b |= 0x4;
        }
        byte b2;
        if (!(obj instanceof RootCommandNode)) {
            if (!(obj instanceof ArgumentCommandNode)) {
                if (!(obj instanceof LiteralCommandNode)) {
                    throw new UnsupportedOperationException("Unknown node type " + obj);
                }
                b2 = (byte)(b | 0x1);
            }
            else {
                b2 = (byte)(b | 0x2);
                if (((ArgumentCommandNode)obj).getCustomSuggestions() != null) {
                    b2 |= 0x10;
                }
            }
        }
        else {
            b2 = (byte)(b | 0x0);
        }
        class8654.writeByte(b2);
        class8654.method29505(obj.getChildren().size());
        final Iterator iterator = obj.getChildren().iterator();
        while (iterator.hasNext()) {
            class8654.method29505(map.get(iterator.next()));
        }
        if (obj.getRedirect() != null) {
            class8654.method29505(map.get(obj.getRedirect()));
        }
        if (!(obj instanceof ArgumentCommandNode)) {
            if (obj instanceof LiteralCommandNode) {
                class8654.method29514(((LiteralCommandNode)obj).getLiteral());
            }
        }
        else {
            final ArgumentCommandNode argumentCommandNode = (ArgumentCommandNode)obj;
            class8654.method29514(argumentCommandNode.getName());
            Class8381.method27934(class8654, argumentCommandNode.getType());
            if (argumentCommandNode.getCustomSuggestions() != null) {
                class8654.method29517(Class8533.method28626((SuggestionProvider<Class7491>)argumentCommandNode.getCustomSuggestions()));
            }
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17324(this);
    }
    
    public RootCommandNode<Class7491> method13139() {
        return this.field19568;
    }
}
