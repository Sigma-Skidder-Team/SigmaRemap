// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.io.Serializable;

public class Class2413 implements Serializable
{
    private static final long field14280 = -6024911025449780478L;
    private Throwable field14281;
    private List<Class2190> field14282;
    private List<Object[]> field14283;
    private Map<String, Object> field14284;
    
    public Class2413(final Throwable field14281) {
        this.field14281 = field14281;
        this.field14282 = new ArrayList<Class2190>();
        this.field14283 = new ArrayList<Object[]>();
        this.field14284 = new HashMap<String, Object>();
    }
    
    public Throwable method9651() {
        return this.field14281;
    }
    
    public void method9652(final Class2190 class2190, final Object... array) {
        this.field14282.add(class2190);
        this.field14283.add(Class9547.method35710(array));
    }
    
    public void method9653(final String s, final Object o) {
        this.field14284.put(s, o);
    }
    
    public Object method9654(final String s) {
        return this.field14284.get(s);
    }
    
    public Set<String> method9655() {
        return this.field14284.keySet();
    }
    
    public String method9656() {
        return this.method9658(Locale.US);
    }
    
    public String method9657() {
        return this.method9658(Locale.getDefault());
    }
    
    public String method9658(final Locale locale) {
        return this.method9660(locale, ": ");
    }
    
    public String method9659(final Locale locale, final String s) {
        return this.method9660(locale, s);
    }
    
    private String method9660(final Locale locale, final String str) {
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        for (int size = this.field14282.size(), i = 0; i < size; ++i) {
            sb.append(new MessageFormat(this.field14282.get(i).method8358(locale), locale).format(this.field14283.get(i)));
            if (++n < size) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
    
    private void method9661(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.field14281);
        this.method9663(objectOutputStream);
        this.method9665(objectOutputStream);
    }
    
    private void method9662(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.field14281 = (Throwable)objectInputStream.readObject();
        this.method9664(objectInputStream);
        this.method9666(objectInputStream);
    }
    
    private void method9663(final ObjectOutputStream objectOutputStream) throws IOException {
        final int size = this.field14282.size();
        objectOutputStream.writeInt(size);
        for (int i = 0; i < size; ++i) {
            objectOutputStream.writeObject(this.field14282.get(i));
            final Object[] array = this.field14283.get(i);
            final int length = array.length;
            objectOutputStream.writeInt(length);
            for (int j = 0; j < length; ++j) {
                if (!(array[j] instanceof Serializable)) {
                    objectOutputStream.writeObject(this.method9667(array[j]));
                }
                else {
                    objectOutputStream.writeObject(array[j]);
                }
            }
        }
    }
    
    private void method9664(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        final int int1 = objectInputStream.readInt();
        this.field14282 = new ArrayList<Class2190>(int1);
        this.field14283 = new ArrayList<Object[]>(int1);
        for (int i = 0; i < int1; ++i) {
            this.field14282.add((Class2190)objectInputStream.readObject());
            final int int2 = objectInputStream.readInt();
            final Object[] array = new Object[int2];
            for (int j = 0; j < int2; ++j) {
                array[j] = objectInputStream.readObject();
            }
            this.field14283.add(array);
        }
    }
    
    private void method9665(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.field14284.size());
        for (final String obj : this.field14284.keySet()) {
            objectOutputStream.writeObject(obj);
            final Object value = this.field14284.get(obj);
            if (!(value instanceof Serializable)) {
                objectOutputStream.writeObject(this.method9667(value));
            }
            else {
                objectOutputStream.writeObject(value);
            }
        }
    }
    
    private void method9666(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        final int int1 = objectInputStream.readInt();
        this.field14284 = new HashMap<String, Object>();
        for (int i = 0; i < int1; ++i) {
            this.field14284.put((String)objectInputStream.readObject(), objectInputStream.readObject());
        }
    }
    
    private String method9667(final Object o) {
        return "[Object could not be serialized: " + o.getClass().getName() + "]";
    }
}
