// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.win32;

import java.lang.reflect.Method;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.NativeMappedConverter;
import com.sun.jna.NativeMapped;
import com.sun.jna.FunctionMapper;

public class StdCallFunctionMapper implements FunctionMapper
{
    public int getArgumentNativeStackSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls.isArray()) {
            return Pointer.SIZE;
        }
        try {
            return Native.getNativeSize(cls);
        }
        catch (final IllegalArgumentException ex) {
            throw new IllegalArgumentException("Unknown native stack allocation size for " + cls);
        }
    }
    
    @Override
    public String getFunctionName(final NativeLibrary library, final Method method) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //     4: astore          5
        //     6: iconst_0       
        //     7: istore          6
        //     9: aload_2         /* method */
        //    10: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //    13: astore          7
        //    15: aload           7
        //    17: astore          8
        //    19: aload           8
        //    21: arraylength    
        //    22: istore          9
        //    24: iconst_0       
        //    25: istore          10
        //    27: iload           10
        //    29: iload           9
        //    31: if_icmpge       58
        //    34: aload           8
        //    36: iload           10
        //    38: aaload         
        //    39: astore          11
        //    41: iload           argTypes
        //    43: aload_0         /* this */
        //    44: aload           11
        //    46: invokevirtual   com/sun/jna/win32/StdCallFunctionMapper.getArgumentNativeStackSize:(Ljava/lang/Class;)I
        //    49: iadd           
        //    50: istore          argTypes
        //    52: iinc            cls, 1
        //    55: goto            27
        //    58: new             Ljava/lang/StringBuilder;
        //    61: dup            
        //    62: invokespecial   java/lang/StringBuilder.<init>:()V
        //    65: aload           pop
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: ldc             "@"
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: iload           argTypes
        //    77: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    80: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    83: astore          8
        //    85: bipush          63
        //    87: istore          9
        //    89: aload_1         /* library */
        //    90: aload           conv
        //    92: iload           9
        //    94: invokevirtual   com/sun/jna/NativeLibrary.getFunction:(Ljava/lang/String;I)Lcom/sun/jna/Function;
        //    97: astore          10
        //    99: aload           10
        //   101: invokevirtual   com/sun/jna/Function.getName:()Ljava/lang/String;
        //   104: astore          pop
        //   106: goto            151
        //   109: astore          10
        //   111: aload_1         /* library */
        //   112: new             Ljava/lang/StringBuilder;
        //   115: dup            
        //   116: invokespecial   java/lang/StringBuilder.<init>:()V
        //   119: ldc             "_"
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: aload           conv
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   132: iload           e
        //   134: invokevirtual   com/sun/jna/NativeLibrary.getFunction:(Ljava/lang/String;I)Lcom/sun/jna/Function;
        //   137: astore          11
        //   139: aload           11
        //   141: invokevirtual   com/sun/jna/Function.getName:()Ljava/lang/String;
        //   144: astore          pop
        //   146: goto            151
        //   149: astore          11
        //   151: aload           pop
        //   153: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  89     106    109    151    Ljava/lang/UnsatisfiedLinkError;
        //  111    146    149    151    Ljava/lang/UnsatisfiedLinkError;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot read field "references" because "newVariable" is null
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2945)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
