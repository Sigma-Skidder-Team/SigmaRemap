package com.sun.jna;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class Structure {
   public static final int ALIGN_DEFAULT = 0;
   public static final int ALIGN_NONE = 1;
   public static final int ALIGN_GNUC = 2;
   public static final int ALIGN_MSVC = 3;
   public static final int CALCULATE_SIZE = -1;
   public static final Map<Class<?>, Structure$class_27> layoutInfo = new WeakHashMap<Class<?>, Structure$class_27>();
   public static final Map<Class<?>, List<String>> fieldOrder = new WeakHashMap<Class<?>, List<String>>();
   private Pointer memory;
   private int size = -1;
   private int alignType;
   private String encoding;
   private int actualAlignType;
   private int structAlignment;
   private Map<String, Structure$class_28> structFields;
   private final Map<String, Object> nativeStrings = new HashMap<String, Object>();
   private TypeMapper typeMapper;
   private long typeInfo;
   private boolean autoRead = true;
   private boolean autoWrite = true;
   private Structure[] array;
   private boolean readCalled;
   private static final ThreadLocal<Map<Pointer, Structure>> reads = new Structure$1();
   private static final ThreadLocal<Set<Structure>> busy = new Structure$2();
   private static final Pointer PLACEHOLDER_MEMORY = new Structure$3(0L);

   public Structure() {
      this(0);
   }

   public Structure(TypeMapper mapper) {
      this(null, 0, mapper);
   }

   public Structure(int alignType) {
      this(null, alignType);
   }

   public Structure(int alignType, TypeMapper mapper) {
      this(null, alignType, mapper);
   }

   public Structure(Pointer p) {
      this(p, 0);
   }

   public Structure(Pointer p, int alignType) {
      this(p, alignType, null);
   }

   public Structure(Pointer p, int alignType, TypeMapper mapper) {
      this.setAlignType(alignType);
      this.setStringEncoding(Native.getStringEncoding(this.getClass()));
      this.initializeTypeMapper(mapper);
      this.validateFields();
      if (p != null) {
         this.useMemory(p, 0, true);
      } else {
         this.allocateMemory(-1);
      }

      this.initializeFields();
   }

   public Map<String, Structure$class_28> fields() {
      return this.structFields;
   }

   public TypeMapper getTypeMapper() {
      return this.typeMapper;
   }

   private void initializeTypeMapper(TypeMapper mapper) {
      if (mapper == null) {
         mapper = Native.getTypeMapper(this.getClass());
      }

      this.typeMapper = mapper;
      this.layoutChanged();
   }

   private void layoutChanged() {
      if (this.size != -1) {
         this.size = -1;
         if (this.memory instanceof Structure$class_21) {
            this.memory = null;
         }

         this.ensureAllocated();
      }
   }

   public void setStringEncoding(String encoding) {
      this.encoding = encoding;
   }

   public String getStringEncoding() {
      return this.encoding;
   }

   public void setAlignType(int alignType) {
      this.alignType = alignType;
      if (alignType == 0) {
         alignType = Native.getStructureAlignment(this.getClass());
         if (alignType == 0) {
            if (Platform.isWindows()) {
               alignType = 3;
            } else {
               alignType = 2;
            }
         }
      }

      this.actualAlignType = alignType;
      this.layoutChanged();
   }

   public Memory autoAllocate(int size) {
      return new Structure$class_21(size);
   }

   public void useMemory(Pointer m) {
      this.useMemory(m, 0);
   }

   public void useMemory(Pointer m, int offset) {
      this.useMemory(m, offset, false);
   }

   public void useMemory(Pointer m, int offset, boolean force) {
      try {
         this.nativeStrings.clear();
         if (this instanceof Structure$class_23 && !force) {
            byte[] var6 = new byte[this.size()];
            m.read(0L, var6, 0, var6.length);
            this.memory.write(0L, var6, 0, var6.length);
         } else {
            this.memory = m.share((long)offset);
            if (this.size == -1) {
               this.size = this.calculateSize(false);
            }

            if (this.size != -1) {
               this.memory = m.share((long)offset, (long)this.size);
            }
         }

         this.array = null;
         this.readCalled = false;
      } catch (IndexOutOfBoundsException var7) {
         throw new IllegalArgumentException("Structure exceeds provided memory bounds", var7);
      }
   }

   public void ensureAllocated() {
      this.ensureAllocated(false);
   }

   private void ensureAllocated(boolean avoidFFIType) {
      if (this.memory == null) {
         this.allocateMemory(avoidFFIType);
      } else if (this.size == -1) {
         this.size = this.calculateSize(true, avoidFFIType);
         if (!(this.memory instanceof Structure$class_21)) {
            try {
               this.memory = this.memory.share(0L, (long)this.size);
            } catch (IndexOutOfBoundsException var5) {
               throw new IllegalArgumentException("Structure exceeds provided memory bounds", var5);
            }
         }
      }
   }

   public void allocateMemory() {
      this.allocateMemory(false);
   }

   private void allocateMemory(boolean avoidFFIType) {
      this.allocateMemory(this.calculateSize(true, avoidFFIType));
   }

   public void allocateMemory(int size) {
      if (size == -1) {
         size = this.calculateSize(false);
      } else if (size <= 0) {
         throw new IllegalArgumentException("Structure size must be greater than zero: " + size);
      }

      if (size != -1) {
         if (this.memory == null || this.memory instanceof Structure$class_21) {
            this.memory = this.autoAllocate(size);
         }

         this.size = size;
      }
   }

   public int size() {
      this.ensureAllocated();
      return this.size;
   }

   public void clear() {
      this.ensureAllocated();
      this.memory.clear((long)this.size());
   }

   public Pointer getPointer() {
      this.ensureAllocated();
      return this.memory;
   }

   public static Set<Structure> busy() {
      return busy.get();
   }

   public static Map<Pointer, Structure> reading() {
      return reads.get();
   }

   public void conditionalAutoRead() {
      if (!this.readCalled) {
         this.autoRead();
      }
   }

   public void read() {
      if (this.memory != PLACEHOLDER_MEMORY) {
         this.readCalled = true;
         this.ensureAllocated();
         if (!busy().contains(this)) {
            busy().add(this);
            if (this instanceof Structure$class_22) {
               reading().put(this.getPointer(), this);
            }

            try {
               for (Structure$class_28 var4 : this.fields().values()) {
                  this.readField(var4);
               }
            } finally {
               busy().remove(this);
               if (reading().get(this.getPointer()) == this) {
                  reading().remove(this.getPointer());
               }
            }
         }
      }
   }

   public int fieldOffset(String name) {
      this.ensureAllocated();
      Structure$class_28 var4 = this.fields().get(name);
      if (var4 == null) {
         throw new IllegalArgumentException("No such field: " + name);
      } else {
         return var4.offset;
      }
   }

   public Object readField(String name) {
      this.ensureAllocated();
      Structure$class_28 var4 = this.fields().get(name);
      if (var4 == null) {
         throw new IllegalArgumentException("No such field: " + name);
      } else {
         return this.readField(var4);
      }
   }

   public Object getFieldValue(Field field) {
      try {
         return field.get(this);
      } catch (Exception var5) {
         throw new Error("Exception reading field '" + field.getName() + "' in " + this.getClass(), var5);
      }
   }

   public void setFieldValue(Field field, Object value) {
      this.setFieldValue(field, value, false);
   }

   private void setFieldValue(Field field, Object value, boolean overrideFinal) {
      try {
         field.set(this, value);
      } catch (IllegalAccessException var8) {
         int var7 = field.getModifiers();
         if (Modifier.isFinal(var7)) {
            if (overrideFinal) {
               throw new UnsupportedOperationException(
                  "This VM does not support Structures with final fields (field '" + field.getName() + "' within " + this.getClass() + ")", var8
               );
            } else {
               throw new UnsupportedOperationException("Attempt to write to read-only field '" + field.getName() + "' within " + this.getClass(), var8);
            }
         } else {
            throw new Error("Unexpectedly unable to write to field '" + field.getName() + "' within " + this.getClass(), var8);
         }
      }
   }

   public static Structure updateStructureByReference(Class<?> type, Structure s, Pointer address) {
      if (address == null) {
         s = null;
      } else if (s != null && address.equals(s.getPointer())) {
         s.autoRead();
      } else {
         Structure var5 = reading().get(address);
         if (var5 != null && type.equals(var5.getClass())) {
            s = var5;
            var5.autoRead();
         } else {
            s = newInstance(type, address);
            s.conditionalAutoRead();
         }
      }

      return s;
   }

   public Object readField(Structure$class_28 structField) {
      int fieldType = structField.offset;
      Class readConverter = structField.type;
      FromNativeConverter currentValue = structField.readConverter;
      if (currentValue != null) {
         readConverter = currentValue.nativeType();
      }

      Object p = !Structure.class.isAssignableFrom(readConverter)
            && !Callback.class.isAssignableFrom(readConverter)
            && (!Platform.HAS_BUFFERS || !Buffer.class.isAssignableFrom(readConverter))
            && !Pointer.class.isAssignableFrom(readConverter)
            && !NativeMapped.class.isAssignableFrom(readConverter)
            && !readConverter.isArray()
         ? null
         : this.getFieldValue(structField.field);
      Object var9;
      if (readConverter == String.class) {
         Pointer result = this.memory.getPointer((long)fieldType);
         var9 = result == null ? null : result.getString(0L, this.encoding);
      } else {
         var9 = this.memory.getValue((long)fieldType, readConverter, p);
      }

      if (currentValue != null) {
         var9 = currentValue.fromNative(var9, structField.context);
         if (p != null && p.equals(var9)) {
            var9 = p;
         }
      }

      if (readConverter.equals(String.class) || readConverter.equals(WString.class)) {
         this.nativeStrings.put(structField.name + ".ptr", this.memory.getPointer((long)fieldType));
         this.nativeStrings.put(structField.name + ".val", var9);
      }

      this.setFieldValue(structField.field, var9, true);
      return var9;
   }

   public void write() {
      if (this.memory != PLACEHOLDER_MEMORY) {
         this.ensureAllocated();
         if (this instanceof Structure$class_23) {
            this.getTypeInfo();
         }

         if (!busy().contains(this)) {
            busy().add(this);

            try {
               for (Structure$class_28 var4 : this.fields().values()) {
                  if (!var4.isVolatile) {
                     this.writeField(var4);
                  }
               }
            } finally {
               busy().remove(this);
            }
         }
      }
   }

   public void writeField(String name) {
      this.ensureAllocated();
      Structure$class_28 var4 = this.fields().get(name);
      if (var4 == null) {
         throw new IllegalArgumentException("No such field: " + name);
      } else {
         this.writeField(var4);
      }
   }

   public void writeField(String name, Object value) {
      this.ensureAllocated();
      Structure$class_28 var5 = this.fields().get(name);
      if (var5 == null) {
         throw new IllegalArgumentException("No such field: " + name);
      } else {
         this.setFieldValue(var5.field, value);
         this.writeField(var5);
      }
   }

   public void writeField(Structure$class_28 structField) {
      if (!structField.isReadOnly) {
         int value = structField.offset;
         Object fieldType = this.getFieldValue(structField.field);
         Class converter = structField.type;
         ToNativeConverter e = structField.writeConverter;
         if (e != null) {
            fieldType = e.toNative(fieldType, new StructureWriteContext(this, structField.field));
            converter = e.nativeType();
         }

         if (String.class == converter || WString.class == converter) {
            boolean msg = converter == WString.class;
            if (fieldType != null) {
               if (this.nativeStrings.containsKey(structField.name + ".ptr") && fieldType.equals(this.nativeStrings.get(structField.name + ".val"))) {
                  return;
               }

               NativeString var9 = msg ? new NativeString(fieldType.toString(), true) : new NativeString(fieldType.toString(), this.encoding);
               this.nativeStrings.put(structField.name, var9);
               fieldType = var9.getPointer();
            } else {
               this.nativeStrings.remove(structField.name);
            }

            this.nativeStrings.remove(structField.name + ".ptr");
            this.nativeStrings.remove(structField.name + ".val");
         }

         try {
            this.memory.setValue((long)value, fieldType, converter);
         } catch (IllegalArgumentException var10) {
            String var11 = "Structure field \""
               + structField.name
               + "\" was declared as "
               + structField.type
               + (structField.type == converter ? "" : " (native type " + converter + ")")
               + ", which is not supported within a Structure";
            throw new IllegalArgumentException(var11, var10);
         }
      }
   }

   public abstract List<String> getFieldOrder();

   @Deprecated
   public final void setFieldOrder(String[] fields) {
      throw new Error("This method is obsolete, use getFieldOrder() instead");
   }

   public void sortFields(List<Field> fields, List<String> names) {
      for (int name = 0; name < names.size(); name++) {
         String f = names.get(name);

         for (int field = 0; field < fields.size(); field++) {
            Field var8 = fields.get(field);
            if (f.equals(var8.getName())) {
               Collections.swap(fields, name, field);
               break;
            }
         }
      }
   }

   public List<Field> getFieldList() {
      ArrayList cls = new ArrayList();

      for (Class classFields = this.getClass(); !classFields.equals(Structure.class); classFields = classFields.getSuperclass()) {
         ArrayList fields = new ArrayList();
         Field[] i = classFields.getDeclaredFields();

         for (int modifiers = 0; modifiers < i.length; modifiers++) {
            int var8 = i[modifiers].getModifiers();
            if (!Modifier.isStatic(var8) && Modifier.isPublic(var8)) {
               fields.add(i[modifiers]);
            }
         }

         cls.addAll(0, fields);
      }

      return cls;
   }

   private List<String> fieldOrder() {
      Class var3 = this.getClass();
      synchronized (fieldOrder) {
         List var5 = fieldOrder.get(var3);
         if (var5 == null) {
            var5 = this.getFieldOrder();
            fieldOrder.put(var3, var5);
         }

         return var5;
      }
   }

   public static List<String> createFieldsOrder(List<String> baseFields, String... extraFields) {
      return createFieldsOrder(baseFields, Arrays.<String>asList(extraFields));
   }

   public static List<String> createFieldsOrder(List<String> baseFields, List<String> extraFields) {
      ArrayList var4 = new ArrayList(baseFields.size() + extraFields.size());
      var4.addAll(baseFields);
      var4.addAll(extraFields);
      return Collections.<String>unmodifiableList(var4);
   }

   public static List<String> createFieldsOrder(String field) {
      return Collections.<String>unmodifiableList(Collections.singletonList(field));
   }

   public static List<String> createFieldsOrder(String... fields) {
      return Collections.<String>unmodifiableList(Arrays.asList(fields));
   }

   private static <T extends Comparable<T>> List<T> sort(Collection<? extends T> c) {
      ArrayList var3 = new ArrayList<T>(c);
      Collections.sort(var3);
      return var3;
   }

   public List<Field> getFields(boolean force) {
      List names = this.getFieldList();
      HashSet fieldOrder = new HashSet();

      for (Field var7 : names) {
         fieldOrder.add(var7.getName());
      }

      List var8 = this.fieldOrder();
      if (var8.size() == names.size() || names.size() <= 1) {
         HashSet var9 = new HashSet(var8);
         if (!var9.equals(fieldOrder)) {
            throw new Error(
               "Structure.getFieldOrder() on "
                  + this.getClass()
                  + " returns names ("
                  + sort(var8)
                  + ") which do not match declared field names ("
                  + sort(fieldOrder)
                  + ")"
            );
         } else {
            this.sortFields(names, var8);
            return names;
         }
      } else if (force) {
         throw new Error(
            "Structure.getFieldOrder() on "
               + this.getClass()
               + " does not provide enough names ["
               + var8.size()
               + "] ("
               + sort(var8)
               + ") to match declared fields ["
               + names.size()
               + "] ("
               + sort(fieldOrder)
               + ")"
         );
      } else {
         return null;
      }
   }

   public int calculateSize(boolean force) {
      return this.calculateSize(force, false);
   }

   public static int size(Class<?> type) {
      return size(type, null);
   }

   public static int size(Class<?> type, Structure value) {
      Structure$class_27 var5;
      synchronized (layoutInfo) {
         var5 = layoutInfo.get(type);
      }

      Structure$class_27 var8 = var5 != null && !Structure$class_27.access$000(var5) ? Structure$class_27.access$100(var5) : -1;
      if (var8 == -1) {
         if (value == null) {
            value = newInstance(type, PLACEHOLDER_MEMORY);
         }

         var8 = value.size();
      }

      return var8;
   }

   public int calculateSize(boolean force, boolean avoidFFIType) {
      int clazz = -1;
      Class var6 = this.getClass();
      Structure$class_27 var8;
      synchronized (layoutInfo) {
         var8 = layoutInfo.get(var6);
      }

      if (var8 == null || this.alignType != Structure$class_27.access$200(var8) || this.typeMapper != Structure$class_27.access$300(var8)) {
         var8 = this.deriveLayout(force, avoidFFIType);
      }

      if (var8 != null) {
         this.structAlignment = Structure$class_27.access$400(var8);
         this.structFields = Structure$class_27.access$500(var8);
         if (!Structure$class_27.access$000(var8)) {
            synchronized (layoutInfo) {
               if (!layoutInfo.containsKey(var6) || this.alignType != 0 || this.typeMapper != null) {
                  layoutInfo.put(var6, var8);
               }
            }
         }

         clazz = Structure$class_27.access$100(var8);
      }

      return clazz;
   }

   private void validateField(String name, Class<?> type) {
      if (this.typeMapper != null) {
         ToNativeConverter msg = this.typeMapper.getToNativeConverter(type);
         if (msg != null) {
            this.validateField(name, msg.nativeType());
            return;
         }
      }

      if (type.isArray()) {
         this.validateField(name, type.getComponentType());
      } else {
         try {
            this.getNativeSize(type);
         } catch (IllegalArgumentException var7) {
            String var6 = "Invalid Structure field in " + this.getClass() + ", field name '" + name + "' (" + type + "): " + var7.getMessage();
            throw new IllegalArgumentException(var6, var7);
         }
      }
   }

   private void validateFields() {
      for (Field var5 : this.getFieldList()) {
         this.validateField(var5.getName(), var5.getType());
      }
   }

   private Structure$class_27 deriveLayout(boolean force, boolean avoidFFIType) {
      int fields = 0;
      List info = this.getFields(force);
      if (info == null) {
         return null;
      } else {
         Structure$class_27 firstField = new Structure$class_27(null);
         Structure$class_27.access$202(firstField, this.alignType);
         Structure$class_27.access$302(firstField, this.typeMapper);
         boolean size = true;

         for (Field modifiers : info) {
            int type = modifiers.getModifiers();
            Class structField = modifiers.getType();
            if (structField.isArray()) {
               Structure$class_27.access$002(firstField, true);
            }

            Structure$class_28 fieldAlignment = new Structure$class_28();
            fieldAlignment.isVolatile = Modifier.isVolatile(type);
            fieldAlignment.isReadOnly = Modifier.isFinal(type);
            if (fieldAlignment.isReadOnly) {
               if (!Platform.RO_FIELDS) {
                  throw new IllegalArgumentException(
                     "This VM does not support read-only fields (field '" + modifiers.getName() + "' within " + this.getClass() + ")"
                  );
               }

               modifiers.setAccessible(true);
            }

            fieldAlignment.field = modifiers;
            fieldAlignment.name = modifiers.getName();
            fieldAlignment.type = structField;
            if (Callback.class.isAssignableFrom(structField) && !structField.isInterface()) {
               throw new IllegalArgumentException("Structure Callback field '" + modifiers.getName() + "' must be an interface");
            }

            if (structField.isArray() && Structure.class.equals(structField.getComponentType())) {
               String var23 = "Nested Structure arrays must use a derived Structure type so that the size of the elements can be determined";
               throw new IllegalArgumentException(var23);
            }

            int value = 1;
            if (Modifier.isPublic(modifiers.getModifiers())) {
               Object nativeType = this.getFieldValue(fieldAlignment.field);
               if (nativeType == null && structField.isArray()) {
                  if (force) {
                     throw new IllegalStateException("Array fields must be initialized");
                  }

                  return null;
               }

               Class e = structField;
               if (NativeMapped.class.isAssignableFrom(structField)) {
                  NativeMappedConverter var24 = NativeMappedConverter.getInstance(structField);
                  e = var24.nativeType();
                  fieldAlignment.writeConverter = var24;
                  fieldAlignment.readConverter = var24;
                  fieldAlignment.context = new StructureReadContext(this, modifiers);
               } else if (this.typeMapper != null) {
                  ToNativeConverter msg = this.typeMapper.getToNativeConverter(structField);
                  FromNativeConverter msgx = this.typeMapper.getFromNativeConverter(structField);
                  if (msg != null && msgx != null) {
                     nativeType = msg.toNative(nativeType, new StructureWriteContext(this, fieldAlignment.field));
                     e = nativeType != null ? nativeType.getClass() : Pointer.class;
                     fieldAlignment.writeConverter = msg;
                     fieldAlignment.readConverter = msgx;
                     fieldAlignment.context = new StructureReadContext(this, modifiers);
                  } else if (msg != null || msgx != null) {
                     String var19 = "Structures require bidirectional type conversion for " + structField;
                     throw new IllegalArgumentException(var19);
                  }
               }

               if (nativeType == null) {
                  nativeType = this.initializeField(fieldAlignment.field, structField);
               }

               try {
                  fieldAlignment.size = this.getNativeSize(e, nativeType);
                  value = this.getNativeAlignment(e, nativeType, size);
               } catch (IllegalArgumentException var20) {
                  if (!force && this.typeMapper == null) {
                     return null;
                  }

                  String var25 = "Invalid Structure field in "
                     + this.getClass()
                     + ", field name '"
                     + fieldAlignment.name
                     + "' ("
                     + fieldAlignment.type
                     + "): "
                     + var20.getMessage();
                  throw new IllegalArgumentException(var25, var20);
               }

               if (value == 0) {
                  throw new Error("Field alignment is zero for field '" + fieldAlignment.name + "' within " + this.getClass());
               }

               Structure$class_27.access$402(firstField, Math.max(Structure$class_27.access$400(firstField), value));
               if (fields % value != 0) {
                  fields += value - fields % value;
               }

               if (this instanceof Union) {
                  fieldAlignment.offset = 0;
                  fields = Math.max(fields, fieldAlignment.size);
               } else {
                  fieldAlignment.offset = fields;
                  fields += fieldAlignment.size;
               }

               Structure$class_27.access$500(firstField).put(fieldAlignment.name, fieldAlignment);
               if (Structure$class_27.access$700(firstField) == null
                  || Structure$class_27.access$700(firstField).size < fieldAlignment.size
                  || Structure$class_27.access$700(firstField).size == fieldAlignment.size && Structure.class.isAssignableFrom(fieldAlignment.type)) {
                  Structure$class_27.access$702(firstField, fieldAlignment);
               }
            }

            size = false;
         }

         if (fields > 0) {
            int var21 = this.addPadding(fields, Structure$class_27.access$400(firstField));
            if (this instanceof Structure$class_23 && !avoidFFIType) {
               this.getTypeInfo();
            }

            Structure$class_27.access$102(firstField, var21);
            return firstField;
         } else {
            throw new IllegalArgumentException("Structure " + this.getClass() + " has unknown or zero size (ensure all fields are public)");
         }
      }
   }

   private void initializeFields() {
      for (Field e : this.getFieldList()) {
         try {
            Object var6 = e.get(this);
            if (var6 == null) {
               this.initializeField(e, e.getType());
            }
         } catch (Exception var7) {
            throw new Error("Exception reading field '" + e.getName() + "' in " + this.getClass(), var7);
         }
      }
   }

   private Object initializeField(Field field, Class<?> type) {
      Object tc = null;
      if (Structure.class.isAssignableFrom(type) && !Structure$class_22.class.isAssignableFrom(type)) {
         try {
            tc = newInstance(type, PLACEHOLDER_MEMORY);
            this.setFieldValue(field, tc);
         } catch (IllegalArgumentException var8) {
            String var7 = "Can't determine size of nested structure";
            throw new IllegalArgumentException(var7, var8);
         }
      } else if (NativeMapped.class.isAssignableFrom(type)) {
         NativeMappedConverter msg = NativeMappedConverter.getInstance(type);
         tc = msg.defaultValue();
         this.setFieldValue(field, tc);
      }

      return tc;
   }

   private int addPadding(int calculatedSize) {
      return this.addPadding(calculatedSize, this.structAlignment);
   }

   private int addPadding(int calculatedSize, int alignment) {
      if (this.actualAlignType != 1 && calculatedSize % alignment != 0) {
         calculatedSize += alignment - calculatedSize % alignment;
      }

      return calculatedSize;
   }

   public int getStructAlignment() {
      if (this.size == -1) {
         this.calculateSize(true);
      }

      return this.structAlignment;
   }

   public int getNativeAlignment(Class<?> type, Object value, boolean isFirstElement) {
      int size = 1;
      if (NativeMapped.class.isAssignableFrom(type)) {
         NativeMappedConverter var7 = NativeMappedConverter.getInstance(type);
         type = var7.nativeType();
         value = var7.toNative(value, new ToNativeContext());
      }

      int var9 = Native.getNativeSize(type, value);
      if (!type.isPrimitive()
         && Long.class != type
         && Integer.class != type
         && Short.class != type
         && Character.class != type
         && Byte.class != type
         && Boolean.class != type
         && Float.class != type
         && Double.class != type) {
         if ((!Pointer.class.isAssignableFrom(type) || Function.class.isAssignableFrom(type))
            && (!Platform.HAS_BUFFERS || !Buffer.class.isAssignableFrom(type))
            && !Callback.class.isAssignableFrom(type)
            && WString.class != type
            && String.class != type) {
            if (Structure.class.isAssignableFrom(type)) {
               if (Structure$class_22.class.isAssignableFrom(type)) {
                  size = Pointer.SIZE;
               } else {
                  if (value == null) {
                     value = newInstance(type, PLACEHOLDER_MEMORY);
                  }

                  size = ((Structure)value).getStructAlignment();
               }
            } else {
               if (!type.isArray()) {
                  throw new IllegalArgumentException("Type " + type + " has unknown native alignment");
               }

               size = this.getNativeAlignment(type.getComponentType(), null, isFirstElement);
            }
         } else {
            size = Pointer.SIZE;
         }
      } else {
         size = var9;
      }

      if (this.actualAlignType == 1) {
         size = 1;
      } else if (this.actualAlignType == 3) {
         size = Math.min(8, size);
      } else if (this.actualAlignType == 2) {
         if (!isFirstElement || !Platform.isMac() || !Platform.isPPC()) {
            size = Math.min(Native.MAX_ALIGNMENT, size);
         }

         if (!isFirstElement && Platform.isAIX() && (type == double.class || type == Double.class)) {
            size = 4;
         }
      }

      return size;
   }

   @Override
   public String toString() {
      return this.toString(Boolean.getBoolean("jna.dump_memory"));
   }

   public String toString(boolean debug) {
      return this.toString(0, true, debug);
   }

   private String format(Class<?> type) {
      String dot = type.getName();
      int var5 = dot.lastIndexOf(".");
      return dot.substring(var5 + 1);
   }

   private String toString(int indent, boolean showContents, boolean dumpMemory) {
      this.ensureAllocated();
      String name = System.getProperty("line.separator");
      String prefix = this.format(this.getClass()) + "(" + this.getPointer() + ")";
      if (!(this.getPointer() instanceof Memory)) {
         prefix = prefix + " (" + this.size() + " bytes)";
      }

      String contents = "";

      for (int BYTES_PER_ROW = 0; BYTES_PER_ROW < indent; BYTES_PER_ROW++) {
         contents = contents + "  ";
      }

      String var15 = name;
      if (!showContents) {
         var15 = "...}";
      } else {
         Iterator buf = this.fields().values().iterator();

         while (buf.hasNext()) {
            Structure$class_28 i = (Structure$class_28)buf.next();
            Object type = this.getFieldValue(i.field);
            String index = this.format(i.type);
            String var14 = "";
            var15 = var15 + contents;
            if (i.type.isArray() && type != null) {
               index = this.format(i.type.getComponentType());
               var14 = "[" + Array.getLength(type) + "]";
            }

            var15 = var15 + "  " + index + " " + i.name + var14 + "@" + Integer.toHexString(i.offset);
            if (type instanceof Structure) {
               type = ((Structure)type).toString(indent + 1, !(type instanceof Structure$class_22), dumpMemory);
            }

            var15 = var15 + "=";
            if (type instanceof Long) {
               var15 = var15 + Long.toHexString((Long)type);
            } else if (type instanceof Integer) {
               var15 = var15 + Integer.toHexString((Integer)type);
            } else if (type instanceof Short) {
               var15 = var15 + Integer.toHexString((Short)type);
            } else if (type instanceof Byte) {
               var15 = var15 + Integer.toHexString((Byte)type);
            } else {
               var15 = var15 + String.valueOf(type).trim();
            }

            var15 = var15 + name;
            if (!buf.hasNext()) {
               var15 = var15 + contents + "}";
            }
         }
      }

      if (indent == 0 && dumpMemory) {
         byte var21 = 4;
         var15 = var15 + name + "memory dump" + name;
         byte[] var22 = this.getPointer().getByteArray(0L, this.size());

         for (int var23 = 0; var23 < var22.length; var23++) {
            if (var23 % 4 == 0) {
               var15 = var15 + "[";
            }

            if (var22[var23] >= 0 && var22[var23] < 16) {
               var15 = var15 + "0";
            }

            var15 = var15 + Integer.toHexString(var22[var23] & 255);
            if (var23 % 4 == 3 && var23 < var22.length - 1) {
               var15 = var15 + "]" + name;
            }
         }

         var15 = var15 + "]";
      }

      return prefix + " {" + var15;
   }

   public Structure[] toArray(Structure[] array) {
      this.ensureAllocated();
      if (this.memory instanceof Structure$class_21) {
         Memory i = (Memory)this.memory;
         int var5 = array.length * this.size();
         if (i.size() < (long)var5) {
            this.useMemory(this.autoAllocate(var5));
         }
      }

      array[0] = this;
      int var6 = this.size();

      for (int var7 = 1; var7 < array.length; var7++) {
         array[var7] = newInstance(this.getClass(), this.memory.share((long)(var7 * var6), (long)var6));
         array[var7].conditionalAutoRead();
      }

      if (!(this instanceof Structure$class_23)) {
         this.array = array;
      }

      return array;
   }

   public Structure[] toArray(int size) {
      return this.toArray((Structure[])Array.newInstance(this.getClass(), size));
   }

   private Class<?> baseClass() {
      return (this instanceof Structure$class_22 || this instanceof Structure$class_23) && Structure.class.isAssignableFrom(this.getClass().getSuperclass())
         ? this.getClass().getSuperclass()
         : this.getClass();
   }

   public boolean dataEquals(Structure s) {
      return this.dataEquals(s, false);
   }

   public boolean dataEquals(Structure s, boolean clear) {
      if (clear) {
         s.getPointer().clear((long)s.size());
         s.write();
         this.getPointer().clear((long)this.size());
         this.write();
      }

      byte[] ref = s.getPointer().getByteArray(0L, s.size());
      byte[] i = this.getPointer().getByteArray(0L, this.size());
      if (ref.length == i.length) {
         for (int var7 = 0; var7 < ref.length; var7++) {
            if (ref[var7] != i[var7]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean equals(Object o) {
      return o instanceof Structure && o.getClass() == this.getClass() && ((Structure)o).getPointer().equals(this.getPointer());
   }

   @Override
   public int hashCode() {
      Pointer var3 = this.getPointer();
      return var3 != null ? this.getPointer().hashCode() : this.getClass().hashCode();
   }

   public void cacheTypeInfo(Pointer p) {
      this.typeInfo = p.peer;
   }

   public Pointer getFieldTypeInfo(Structure$class_28 f) {
      Class value = f.type;
      Object nc = this.getFieldValue(f.field);
      if (this.typeMapper != null) {
         ToNativeConverter var6 = this.typeMapper.getToNativeConverter(value);
         if (var6 != null) {
            value = var6.nativeType();
            nc = var6.toNative(nc, new ToNativeContext());
         }
      }

      return Structure$class_24.access$800(nc, value);
   }

   public Pointer getTypeInfo() {
      Pointer var3 = getTypeInfo(this);
      this.cacheTypeInfo(var3);
      return var3;
   }

   public void setAutoSynch(boolean auto) {
      this.setAutoRead(auto);
      this.setAutoWrite(auto);
   }

   public void setAutoRead(boolean auto) {
      this.autoRead = auto;
   }

   public boolean getAutoRead() {
      return this.autoRead;
   }

   public void setAutoWrite(boolean auto) {
      this.autoWrite = auto;
   }

   public boolean getAutoWrite() {
      return this.autoWrite;
   }

   public static Pointer getTypeInfo(Object obj) {
      return Structure$class_24.get(obj);
   }

   private static Structure newInstance(Class<?> type, long init) {
      try {
         Structure var5 = newInstance(type, init == 0L ? PLACEHOLDER_MEMORY : new Pointer(init));
         if (init != 0L) {
            var5.conditionalAutoRead();
         }

         return var5;
      } catch (Throwable var6) {
         System.err.println("JNA: Error creating structure: " + var6);
         return null;
      }
   }

   public static Structure newInstance(Class<?> type, Pointer init) throws IllegalArgumentException {
      try {
         Constructor var11 = type.getConstructor(Pointer.class);
         return (Structure)var11.newInstance(init);
      } catch (NoSuchMethodException var6) {
      } catch (SecurityException var7) {
      } catch (InstantiationException var8) {
         String var13 = "Can't instantiate " + type;
         throw new IllegalArgumentException(var13, var8);
      } catch (IllegalAccessException var9) {
         String var12 = "Instantiation of " + type + " (Pointer) not allowed, is it public?";
         throw new IllegalArgumentException(var12, var9);
      } catch (InvocationTargetException var10) {
         String var5 = "Exception thrown while instantiating an instance of " + type;
         var10.printStackTrace();
         throw new IllegalArgumentException(var5, var10);
      }

      Structure msg = newInstance(type);
      if (init != PLACEHOLDER_MEMORY) {
         msg.useMemory(init);
      }

      return msg;
   }

   public static Structure newInstance(Class<?> type) throws IllegalArgumentException {
      try {
         Structure msg = (Structure)type.newInstance();
         if (msg instanceof Structure$class_23) {
            msg.allocateMemory();
         }

         return msg;
      } catch (InstantiationException var5) {
         String var7 = "Can't instantiate " + type;
         throw new IllegalArgumentException(var7, var5);
      } catch (IllegalAccessException var6) {
         String var4 = "Instantiation of " + type + " not allowed, is it public?";
         throw new IllegalArgumentException(var4, var6);
      }
   }

   public Structure$class_28 typeInfoField() {
      Structure$class_27 var4;
      synchronized (layoutInfo) {
         var4 = layoutInfo.get(this.getClass());
      }

      return var4 != null ? Structure$class_27.access$700(var4) : null;
   }

   private static void structureArrayCheck(Structure[] ss) {
      if (!Structure$class_22[].class.isAssignableFrom(ss.getClass())) {
         Pointer size = ss[0].getPointer();
         int si = ss[0].size();

         for (int msg = 1; msg < ss.length; msg++) {
            if (ss[msg].getPointer().peer != size.peer + (long)(si * msg)) {
               String var6 = "Structure array elements must use contiguous memory (bad backing address at Structure array index " + msg + ")";
               throw new IllegalArgumentException(var6);
            }
         }
      }
   }

   public static void autoRead(Structure[] ss) {
      structureArrayCheck(ss);
      if (ss[0].array == ss) {
         ss[0].autoRead();
      } else {
         for (int var3 = 0; var3 < ss.length; var3++) {
            if (ss[var3] != null) {
               ss[var3].autoRead();
            }
         }
      }
   }

   public void autoRead() {
      if (this.getAutoRead()) {
         this.read();
         if (this.array != null) {
            for (int var3 = 1; var3 < this.array.length; var3++) {
               this.array[var3].autoRead();
            }
         }
      }
   }

   public static void autoWrite(Structure[] ss) {
      structureArrayCheck(ss);
      if (ss[0].array == ss) {
         ss[0].autoWrite();
      } else {
         for (int var3 = 0; var3 < ss.length; var3++) {
            if (ss[var3] != null) {
               ss[var3].autoWrite();
            }
         }
      }
   }

   public void autoWrite() {
      if (this.getAutoWrite()) {
         this.write();
         if (this.array != null) {
            for (int var3 = 1; var3 < this.array.length; var3++) {
               this.array[var3].autoWrite();
            }
         }
      }
   }

   public int getNativeSize(Class<?> nativeType) {
      return this.getNativeSize(nativeType, null);
   }

   public int getNativeSize(Class<?> nativeType, Object value) {
      return Native.getNativeSize(nativeType, value);
   }

   public static void validate(Class<?> cls) {
      newInstance(cls, PLACEHOLDER_MEMORY);
   }
}
