// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.io.Writer;
import org.apache.commons.io.IOUtils;
import com.google.common.io.Files;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import java.io.IOException;
import com.google.gson.GsonBuilder;
import com.google.common.collect.Maps;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.io.File;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class8006<K, V extends Class6022<K>>
{
    public static final Logger field32969;
    public final Gson field32970;
    private final File field32971;
    private final Map<String, V> field32972;
    private boolean field32973;
    private static final ParameterizedType field32974;
    
    public Class8006(final File field32971) {
        this.field32972 = Maps.newHashMap();
        this.field32973 = true;
        this.field32971 = field32971;
        final GsonBuilder setPrettyPrinting = new GsonBuilder().setPrettyPrinting();
        setPrettyPrinting.registerTypeHierarchyAdapter(Class6022.class, new Class5989(this, null));
        this.field32970 = setPrettyPrinting.create();
    }
    
    public boolean method26203() {
        return this.field32973;
    }
    
    public void method26204(final boolean field32973) {
        this.field32973 = field32973;
    }
    
    public File method26205() {
        return this.field32971;
    }
    
    public void method26206(final V v) {
        this.field32972.put(this.method26212(v.method17942()), v);
        try {
            this.method26217();
        }
        catch (final IOException ex) {
            Class8006.field32969.warn("Could not save the list after adding a user.", ex);
        }
    }
    
    @Nullable
    public V method26207(final K k) {
        this.method26214();
        return this.field32972.get(this.method26212(k));
    }
    
    public void method26208(final K k) {
        this.field32972.remove(this.method26212(k));
        try {
            this.method26217();
        }
        catch (final IOException ex) {
            Class8006.field32969.warn("Could not save the list after removing a user.", ex);
        }
    }
    
    public void method26209(final Class6022<K> class6022) {
        this.method26208(class6022.method17942());
    }
    
    public String[] method26210() {
        return this.field32972.keySet().toArray(new String[this.field32972.size()]);
    }
    
    public boolean method26211() {
        return this.field32972.size() < 1;
    }
    
    public String method26212(final K k) {
        return k.toString();
    }
    
    public boolean method26213(final K k) {
        return this.field32972.containsKey(this.method26212(k));
    }
    
    private void method26214() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class6022<K> class6022 : this.field32972.values()) {
            if (!class6022.method17943()) {
                continue;
            }
            arrayList.add(class6022.method17942());
        }
        final Iterator iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            this.field32972.remove(this.method26212(iterator2.next()));
        }
    }
    
    public Class6022<K> method26215(final JsonObject jsonObject) {
        return new Class6022<K>(null, jsonObject);
    }
    
    public Collection<V> method26216() {
        return this.field32972.values();
    }
    
    public void method26217() throws IOException {
        final String json = this.field32970.toJson(this.field32972.values());
        Writer writer = null;
        try {
            writer = Files.newWriter(this.field32971, StandardCharsets.UTF_8);
            writer.write(json);
        }
        finally {
            IOUtils.closeQuietly(writer);
        }
    }
    
    public void method26218() throws FileNotFoundException {
        if (this.field32971.exists()) {
            Reader reader = null;
            try {
                reader = Files.newReader(this.field32971, StandardCharsets.UTF_8);
                final Collection collection = Class9583.method35926(this.field32970, reader, Class8006.field32974);
                if (collection != null) {
                    this.field32972.clear();
                    for (final Class6022<K> class6022 : collection) {
                        if (class6022.method17942() != null) {
                            this.field32972.put(this.method26212(class6022.method17942()), (V)class6022);
                        }
                    }
                }
            }
            finally {
                IOUtils.closeQuietly(reader);
            }
        }
    }
    
    static {
        field32969 = LogManager.getLogger();
        field32974 = new Class8362();
    }
}
