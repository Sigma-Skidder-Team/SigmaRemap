package com.sun.jna;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

public class Function extends Pointer {
   public static final int MAX_NARGS = 256;
   public static final int C_CONVENTION = 0;
   public static final int ALT_CONVENTION = 63;
   private static final int MASK_CC = 63;
   public static final int THROW_LAST_ERROR = 64;
   public static final int USE_VARARGS = 384;
   public static final Integer INTEGER_TRUE = -1;
   public static final Integer INTEGER_FALSE = 0;
   private NativeLibrary library;
   private final String functionName;
   public final String encoding;
   public final int callFlags;
   public final Map<String, ?> options;
   public static final String OPTION_INVOKING_METHOD = "invoking-method";
   private static final VarArgsChecker IS_VARARGS = VarArgsChecker.create();

   public static Function getFunction(String libraryName, String functionName) {
      return NativeLibrary.getInstance(libraryName).getFunction(functionName);
   }

   public static Function getFunction(String libraryName, String functionName, int callFlags) {
      return NativeLibrary.getInstance(libraryName).getFunction(functionName, callFlags, null);
   }

   public static Function getFunction(String libraryName, String functionName, int callFlags, String encoding) {
      return NativeLibrary.getInstance(libraryName).getFunction(functionName, callFlags, encoding);
   }

   public static Function getFunction(Pointer p) {
      return getFunction(p, 0, null);
   }

   public static Function getFunction(Pointer p, int callFlags) {
      return getFunction(p, callFlags, null);
   }

   public static Function getFunction(Pointer p, int callFlags, String encoding) {
      return new Function(p, callFlags, encoding);
   }

   public Function(NativeLibrary library, String functionName, int callFlags, String encoding) {
      this.checkCallingConvention(callFlags & 63);
      if (functionName == null) {
         throw new NullPointerException("Function name must not be null");
      } else {
         this.library = library;
         this.functionName = functionName;
         this.callFlags = callFlags;
         this.options = library.options;
         this.encoding = encoding != null ? encoding : Native.getDefaultStringEncoding();

         try {
            this.peer = library.getSymbolAddress(functionName);
         } catch (UnsatisfiedLinkError var8) {
            throw new UnsatisfiedLinkError("Error looking up function '" + functionName + "': " + var8.getMessage());
         }
      }
   }

   public Function(Pointer functionAddress, int callFlags, String encoding) {
      this.checkCallingConvention(callFlags & 63);
      if (functionAddress != null && functionAddress.peer != 0L) {
         this.functionName = functionAddress.toString();
         this.callFlags = callFlags;
         this.peer = functionAddress.peer;
         this.options = Collections.EMPTY_MAP;
         this.encoding = encoding != null ? encoding : Native.getDefaultStringEncoding();
      } else {
         throw new NullPointerException("Function address may not be null");
      }
   }

   private void checkCallingConvention(int convention) throws IllegalArgumentException {
      if ((convention & 63) != convention) {
         throw new IllegalArgumentException("Unrecognized calling convention: " + convention);
      }
   }

   public String getName() {
      return this.functionName;
   }

   public int getCallingConvention() {
      return this.callFlags & 63;
   }

   public Object invoke(Class<?> returnType, Object[] inArgs) {
      return this.invoke(returnType, inArgs, this.options);
   }

   public Object invoke(Class<?> returnType, Object[] inArgs, Map<String, ?> options) {
      Method paramTypes = (Method)options.get("invoking-method");
      Class[] var7 = paramTypes != null ? paramTypes.getParameterTypes() : null;
      return this.invoke(paramTypes, var7, returnType, inArgs, options);
   }

   public Object invoke(Method invokingMethod, Class<?>[] paramTypes, Class<?> returnType, Object[] inArgs, Map<String, ?> options) {
      Object[] mapper = new Object[0];
      if (inArgs != null) {
         if (inArgs.length > 256) {
            throw new UnsupportedOperationException("Maximum argument count is 256");
         }

         mapper = new Object[inArgs.length];
         System.arraycopy(inArgs, 0, mapper, 0, mapper.length);
      }

      TypeMapper allowObjects = (TypeMapper)options.get("type-mapper");
      boolean isVarArgs = Boolean.TRUE.equals(options.get("allow-objects"));
      boolean fixedArgs = mapper.length > 0 && invokingMethod != null ? isVarArgs(invokingMethod) : false;
      int nativeReturnType = mapper.length > 0 && invokingMethod != null ? fixedArgs(invokingMethod) : 0;

      for (int resultConverter = 0; resultConverter < mapper.length; resultConverter++) {
         Class result = invokingMethod != null
            ? (fixedArgs && resultConverter >= paramTypes.length - 1 ? paramTypes[paramTypes.length - 1].getComponentType() : paramTypes[resultConverter])
            : null;
         mapper[resultConverter] = this.convertArgument(mapper, resultConverter, invokingMethod, allowObjects, isVarArgs, result);
      }

      Class var23 = returnType;
      Object var24 = null;
      if (NativeMapped.class.isAssignableFrom(returnType)) {
         NativeMappedConverter i = NativeMappedConverter.getInstance(returnType);
         var24 = i;
         var23 = i.nativeType();
      } else if (allowObjects != null) {
         var24 = allowObjects.getFromNativeConverter(returnType);
         if (var24 != null) {
            var23 = ((FromNativeConverter)var24).nativeType();
         }
      }

      Object var25 = this.invoke(mapper, var23, isVarArgs, nativeReturnType);
      if (var24 != null) {
         Object inArg;
         if (invokingMethod != null) {
            inArg = new MethodResultContext(returnType, this, inArgs, invokingMethod);
         } else {
            inArg = new FunctionResultContext(returnType, this, inArgs);
         }

         var25 = ((FromNativeConverter)var24).fromNative(var25, (FromNativeContext)inArg);
      }

      if (inArgs != null) {
         for (int var26 = 0; var26 < inArgs.length; var26++) {
            Object array = inArgs[var26];
            if (array != null) {
               if (array instanceof Structure) {
                  if (!(array instanceof Structure$class_23)) {
                     ((Structure)array).autoRead();
                  }
               } else if (mapper[var26] instanceof Function$class_12) {
                  ((Function$class_12)mapper[var26]).read();
                  if (mapper[var26] instanceof Function$class_11) {
                     Function$class_11 type = (Function$class_11)mapper[var26];
                     if (Structure$class_22[].class.isAssignableFrom(array.getClass())) {
                        Class ss = array.getClass().getComponentType();
                        Structure[] si = (Structure[])array;

                        for (int p = 0; p < si.length; p++) {
                           Pointer var22 = type.getPointer((long)(Pointer.SIZE * p));
                           si[p] = Structure.updateStructureByReference(ss, si[p], var22);
                        }
                     }
                  }
               } else if (Structure[].class.isAssignableFrom(array.getClass())) {
                  Structure.autoRead((Structure[])array);
               }
            }
         }
      }

      return var25;
   }

   public Object invoke(Object[] args, Class<?> returnType, boolean allowObjects) {
      return this.invoke(args, returnType, allowObjects, 0);
   }

   public Object invoke(Object[] args, Class<?> returnType, boolean allowObjects, int fixedArgs) {
      Object callFlags = null;
      int p = this.callFlags | (fixedArgs & 3) << 7;
      if (returnType == null || returnType == void.class || returnType == Void.class) {
         Native.invokeVoid(this, this.peer, p, args);
         callFlags = null;
      } else if (returnType == boolean.class || returnType == Boolean.class) {
         callFlags = valueOf(Native.invokeInt(this, this.peer, p, args) != 0);
      } else if (returnType == byte.class || returnType == Byte.class) {
         callFlags = (byte)Native.invokeInt(this, this.peer, p, args);
      } else if (returnType == short.class || returnType == Short.class) {
         callFlags = (short)Native.invokeInt(this, this.peer, p, args);
      } else if (returnType == char.class || returnType == Character.class) {
         callFlags = (char)Native.invokeInt(this, this.peer, p, args);
      } else if (returnType == int.class || returnType == Integer.class) {
         callFlags = Native.invokeInt(this, this.peer, p, args);
      } else if (returnType == long.class || returnType == Long.class) {
         callFlags = Native.invokeLong(this, this.peer, p, args);
      } else if (returnType == float.class || returnType == Float.class) {
         callFlags = Native.invokeFloat(this, this.peer, p, args);
      } else if (returnType == double.class || returnType == Double.class) {
         callFlags = Native.invokeDouble(this, this.peer, p, args);
      } else if (returnType == String.class) {
         callFlags = this.invokeString(p, args, false);
      } else if (returnType == WString.class) {
         String arr = this.invokeString(p, args, true);
         if (arr != null) {
            callFlags = new WString(arr);
         }
      } else {
         if (Pointer.class.isAssignableFrom(returnType)) {
            return this.invokePointer(p, args);
         }

         if (Structure.class.isAssignableFrom(returnType)) {
            if (Structure$class_23.class.isAssignableFrom(returnType)) {
               Structure var13 = Native.invokeStructure(this, this.peer, p, args, Structure.newInstance(returnType));
               var13.autoRead();
               callFlags = var13;
            } else {
               callFlags = this.invokePointer(p, args);
               if (callFlags != null) {
                  Structure var14 = Structure.newInstance(returnType, (Pointer)callFlags);
                  var14.conditionalAutoRead();
                  callFlags = var14;
               }
            }
         } else if (Callback.class.isAssignableFrom(returnType)) {
            callFlags = this.invokePointer(p, args);
            if (callFlags != null) {
               callFlags = CallbackReference.getCallback(returnType, (Pointer)callFlags);
            }
         } else if (returnType == String[].class) {
            Pointer var15 = this.invokePointer(p, args);
            if (var15 != null) {
               callFlags = var15.getStringArray(0L, this.encoding);
            }
         } else if (returnType == WString[].class) {
            Pointer var16 = this.invokePointer(p, args);
            if (var16 != null) {
               String[] warr = var16.getWideStringArray(0L);
               WString[] i = new WString[warr.length];

               for (int var12 = 0; var12 < warr.length; var12++) {
                  i[var12] = new WString(warr[var12]);
               }

               callFlags = i;
            }
         } else if (returnType == Pointer[].class) {
            Pointer var17 = this.invokePointer(p, args);
            if (var17 != null) {
               callFlags = var17.getPointerArray(0L);
            }
         } else {
            if (!allowObjects) {
               throw new IllegalArgumentException("Unsupported return type " + returnType + " in function " + this.getName());
            }

            callFlags = Native.invokeObject(this, this.peer, p, args);
            if (callFlags != null && !returnType.isAssignableFrom(callFlags.getClass())) {
               throw new ClassCastException("Return type " + returnType + " does not match result " + callFlags.getClass());
            }
         }
      }

      return callFlags;
   }

   private Pointer invokePointer(int callFlags, Object[] args) {
      long var5 = Native.invokePointer(this, this.peer, callFlags, args);
      return var5 == 0L ? null : new Pointer(var5);
   }

   private Object convertArgument(Object[] args, int index, Method invokingMethod, TypeMapper mapper, boolean allowObjects, Class<?> expectedType) {
      Object argClass = args[index];
      if (argClass != null) {
         Class ss = argClass.getClass();
         Object type = null;
         if (NativeMapped.class.isAssignableFrom(ss)) {
            type = NativeMappedConverter.getInstance(ss);
         } else if (mapper != null) {
            type = mapper.getToNativeConverter(ss);
         }

         if (type != null) {
            Object byRef;
            if (invokingMethod != null) {
               byRef = new MethodParameterContext(this, args, index, invokingMethod);
            } else {
               byRef = new FunctionParameterContext(this, args, index);
            }

            argClass = ((ToNativeConverter)type).toNative(argClass, (ToNativeContext)byRef);
         }
      }

      if (argClass != null && !this.isPrimitiveArray(argClass.getClass())) {
         Class var16 = argClass.getClass();
         if (argClass instanceof Structure) {
            Structure var18 = (Structure)argClass;
            var18.autoWrite();
            if (var18 instanceof Structure$class_23) {
               Class var20 = var18.getClass();
               if (invokingMethod != null) {
                  Class[] var21 = invokingMethod.getParameterTypes();
                  if (IS_VARARGS.isVarArgs(invokingMethod)) {
                     if (index < var21.length - 1) {
                        var20 = var21[index];
                     } else {
                        Class var23 = var21[var21.length - 1].getComponentType();
                        if (var23 != Object.class) {
                           var20 = var23;
                        }
                     }
                  } else {
                     var20 = var21[index];
                  }
               }

               if (Structure$class_23.class.isAssignableFrom(var20)) {
                  return var18;
               }
            }

            return var18.getPointer();
         } else if (argClass instanceof Callback) {
            return CallbackReference.getFunctionPointer((Callback)argClass);
         } else if (argClass instanceof String) {
            return new NativeString((String)argClass, false).getPointer();
         } else if (argClass instanceof WString) {
            return new NativeString(argClass.toString(), true).getPointer();
         } else if (argClass instanceof Boolean) {
            return Boolean.TRUE.equals(argClass) ? INTEGER_TRUE : INTEGER_FALSE;
         } else if (String[].class == var16) {
            return new StringArray((String[])argClass, this.encoding);
         } else if (WString[].class == var16) {
            return new StringArray((WString[])argClass);
         } else if (Pointer[].class == var16) {
            return new Function$class_11((Pointer[])argClass);
         } else if (NativeMapped[].class.isAssignableFrom(var16)) {
            return new Function$class_10((NativeMapped[])argClass);
         } else if (Structure[].class.isAssignableFrom(var16)) {
            Structure[] var17 = (Structure[])argClass;
            Class var19 = var16.getComponentType();
            boolean pointers = Structure$class_22.class.isAssignableFrom(var19);
            if (expectedType != null && !Structure$class_22[].class.isAssignableFrom(expectedType)) {
               if (pointers) {
                  throw new IllegalArgumentException(
                     "Function " + this.getName() + " declared Structure[] at parameter " + index + " but array of " + var19 + " was passed"
                  );
               }

               for (int i = 0; i < var17.length; i++) {
                  if (var17[i] instanceof Structure$class_22) {
                     throw new IllegalArgumentException(
                        "Function "
                           + this.getName()
                           + " declared Structure[] at parameter "
                           + index
                           + " but element "
                           + i
                           + " is of Structure.ByReference type"
                     );
                  }
               }
            }

            if (pointers) {
               Structure.autoWrite(var17);
               Pointer[] var22 = new Pointer[var17.length + 1];

               for (int var15 = 0; var15 < var17.length; var15++) {
                  var22[var15] = var17[var15] != null ? var17[var15].getPointer() : null;
               }

               return new Function$class_11(var22);
            } else if (var17.length == 0) {
               throw new IllegalArgumentException("Structure array must have non-zero length");
            } else if (var17[0] == null) {
               Structure.newInstance(var19).toArray(var17);
               return var17[0].getPointer();
            } else {
               Structure.autoWrite(var17);
               return var17[0].getPointer();
            }
         } else if (var16.isArray()) {
            throw new IllegalArgumentException("Unsupported array argument type: " + var16.getComponentType());
         } else if (allowObjects) {
            return argClass;
         } else if (!Native.isSupportedNativeType(argClass.getClass())) {
            throw new IllegalArgumentException(
               "Unsupported argument type " + argClass.getClass().getName() + " at parameter " + index + " of function " + this.getName()
            );
         } else {
            return argClass;
         }
      } else {
         return argClass;
      }
   }

   private boolean isPrimitiveArray(Class<?> argClass) {
      return argClass.isArray() && argClass.getComponentType().isPrimitive();
   }

   public void invoke(Object[] args) {
      this.invoke(Void.class, args);
   }

   private String invokeString(int callFlags, Object[] args, boolean wide) {
      Pointer s = this.invokePointer(callFlags, args);
      String var7 = null;
      if (s != null) {
         if (wide) {
            var7 = s.getWideString(0L);
         } else {
            var7 = s.getString(0L, this.encoding);
         }
      }

      return var7;
   }

   @Override
   public String toString() {
      return this.library != null
         ? "native function " + this.functionName + "(" + this.library.getName() + ")@0x" + Long.toHexString(this.peer)
         : "native function@0x" + Long.toHexString(this.peer);
   }

   public Object invokeObject(Object[] args) {
      return this.invoke(Object.class, args);
   }

   public Pointer invokePointer(Object[] args) {
      return (Pointer)this.invoke(Pointer.class, args);
   }

   public String invokeString(Object[] args, boolean wide) {
      Object var5 = this.invoke(wide ? WString.class : String.class, args);
      return var5 != null ? var5.toString() : null;
   }

   public int invokeInt(Object[] args) {
      return (Integer)this.invoke(Integer.class, args);
   }

   public long invokeLong(Object[] args) {
      return (Long)this.invoke(Long.class, args);
   }

   public float invokeFloat(Object[] args) {
      return (Float)this.invoke(Float.class, args);
   }

   public double invokeDouble(Object[] args) {
      return (Double)this.invoke(Double.class, args);
   }

   public void invokeVoid(Object[] args) {
      this.invoke(Void.class, args);
   }

   @Override
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (o == null) {
         return false;
      } else if (o.getClass() != this.getClass()) {
         return false;
      } else {
         Function var4 = (Function)o;
         return var4.callFlags == this.callFlags && var4.options.equals(this.options) && var4.peer == this.peer;
      }
   }

   @Override
   public int hashCode() {
      return this.callFlags + this.options.hashCode() + super.hashCode();
   }

   public static Object[] concatenateVarArgs(Object[] inArgs) {
      if (inArgs != null && inArgs.length > 0) {
         Object argType = inArgs[inArgs.length - 1];
         Class varArgs = argType != null ? argType.getClass() : null;
         if (varArgs != null && varArgs.isArray()) {
            Object[] fullArgs = (Object[])argType;

            for (int var6 = 0; var6 < fullArgs.length; var6++) {
               if (fullArgs[var6] instanceof Float) {
                  fullArgs[var6] = (double)((Float)fullArgs[var6]).floatValue();
               }
            }

            Object[] var7 = new Object[inArgs.length + fullArgs.length];
            System.arraycopy(inArgs, 0, var7, 0, inArgs.length - 1);
            System.arraycopy(fullArgs, 0, var7, inArgs.length - 1, fullArgs.length);
            var7[var7.length - 1] = null;
            inArgs = var7;
         }
      }

      return inArgs;
   }

   public static boolean isVarArgs(Method m) {
      return IS_VARARGS.isVarArgs(m);
   }

   public static int fixedArgs(Method m) {
      return IS_VARARGS.fixedArgs(m);
   }

   public static Boolean valueOf(boolean b) {
      return b ? Boolean.TRUE : Boolean.FALSE;
   }
}
