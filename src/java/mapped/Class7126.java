// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import java.util.function.Supplier;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class Class7126
{
    public static void method21868() {
        Class8381.method27930("brigadier:bool", (Class<ArgumentType>)BoolArgumentType.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)BoolArgumentType::bool));
        Class8381.method27930("brigadier:float", (Class<ArgumentType>)FloatArgumentType.class, (Class6672<ArgumentType>)new Class6678());
        Class8381.method27930("brigadier:double", (Class<ArgumentType>)DoubleArgumentType.class, (Class6672<ArgumentType>)new Class6675());
        Class8381.method27930("brigadier:integer", (Class<ArgumentType>)IntegerArgumentType.class, (Class6672<ArgumentType>)new Class6676());
        Class8381.method27930("brigadier:long", (Class<ArgumentType>)LongArgumentType.class, (Class6672<ArgumentType>)new Class6673());
        Class8381.method27930("brigadier:string", (Class<ArgumentType>)StringArgumentType.class, (Class6672<ArgumentType>)new Class6679());
    }
    
    public static byte method21869(final boolean b, final boolean b2) {
        byte b3 = 0;
        if (b) {
            b3 |= 0x1;
        }
        if (b2) {
            b3 |= 0x2;
        }
        return b3;
    }
    
    public static boolean method21870(final byte b) {
        return false;
    }
    
    public static boolean method21871(final byte b) {
        return false;
    }
}
