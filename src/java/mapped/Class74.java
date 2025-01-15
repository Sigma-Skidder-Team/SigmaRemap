// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.DataInput;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class74 extends Class61 implements Iterable<Class61>
{
    private Map<String, Class61> field166;
    
    public Class74(final String s) {
        this(s, new LinkedHashMap<String, Class61>());
    }
    
    public Class74(final String s, final Map<String, Class61> m) {
        super(s);
        this.field166 = new LinkedHashMap<String, Class61>(m);
    }
    
    public Map<String, Class61> method415() {
        return new LinkedHashMap<String, Class61>(this.field166);
    }
    
    public void method416(final Map<String, Class61> m) {
        this.field166 = new LinkedHashMap<String, Class61>(m);
    }
    
    public boolean method417() {
        return this.field166.isEmpty();
    }
    
    public boolean method418(final String s) {
        return this.field166.containsKey(s);
    }
    
    public <T extends Class61> T method419(final String s) {
        return (T)this.field166.get(s);
    }
    
    public <T extends Class61> T method420(final T t) {
        return (T)this.field166.put(t.method375(), t);
    }
    
    public <T extends Class61> T method421(final String s) {
        return (T)this.field166.remove(s);
    }
    
    public Set<String> method422() {
        return this.field166.keySet();
    }
    
    public Collection<Class61> values() {
        return this.field166.values();
    }
    
    public int method423() {
        return this.field166.size();
    }
    
    public void method424() {
        this.field166.clear();
    }
    
    @Override
    public Iterator<Class61> iterator() {
        return this.values().iterator();
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        final ArrayList list = new ArrayList();
        try {
            Class61 method26579;
            while ((method26579 = Class8089.method26579(dataInput)) != null) {
                list.add(method26579);
            }
        }
        catch (final EOFException ex) {
            throw new IOException("Closing EndTag was not found!");
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.method420(iterator.next());
        }
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        final Iterator<Class61> iterator = this.field166.values().iterator();
        while (iterator.hasNext()) {
            Class8089.method26582(dataOutput, iterator.next());
        }
        dataOutput.writeByte(0);
    }
    
    @Override
    public Class74 clone() {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map.Entry<Object, V> entry : this.field166.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((Class61)entry.getValue()).clone());
        }
        return new Class74(this.method375(), linkedHashMap);
    }
}
