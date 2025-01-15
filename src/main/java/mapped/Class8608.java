// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Iterators;
import java.io.Writer;
import java.io.IOException;
import java.util.Iterator;
import java.io.Reader;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonParseException;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.List;
import com.google.common.io.Files;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Calendar;
import java.util.Date;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.Agent;
import com.google.gson.GsonBuilder;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.ParameterizedType;
import java.io.File;
import com.google.gson.Gson;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.GameProfile;
import java.util.Deque;
import java.util.UUID;
import java.util.Map;
import java.text.SimpleDateFormat;

public class Class8608
{
    public static final SimpleDateFormat field36124;
    private static boolean field36125;
    private final Map<String, Class8426> field36126;
    private final Map<UUID, Class8426> field36127;
    private final Deque<GameProfile> field36128;
    private final GameProfileRepository field36129;
    public final Gson field36130;
    private final File field36131;
    private static final ParameterizedType field36132;
    
    public Class8608(final GameProfileRepository field36129, final File field36130) {
        this.field36126 = Maps.newHashMap();
        this.field36127 = Maps.newHashMap();
        this.field36128 = Lists.newLinkedList();
        this.field36129 = field36129;
        this.field36131 = field36130;
        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter((Class)Class8426.class, (Object)new Class5991(this, null));
        this.field36130 = gsonBuilder.create();
        this.method29198();
    }
    
    private static GameProfile method29190(final GameProfileRepository gameProfileRepository, final String s) {
        final GameProfile[] array = { null };
        final Class9148 class9148 = new Class9148(array);
        gameProfileRepository.findProfilesByNames(new String[] { s }, Agent.MINECRAFT, (ProfileLookupCallback)class9148);
        if (!method29192()) {
            if (array[0] == null) {
                ((ProfileLookupCallback)class9148).onProfileLookupSucceeded(new GameProfile(Class512.method2893(new GameProfile((UUID)null, s)), s));
            }
        }
        return array[0];
    }
    
    public static void method29191(final boolean field36125) {
        Class8608.field36125 = field36125;
    }
    
    private static boolean method29192() {
        return Class8608.field36125;
    }
    
    public void method29193(final GameProfile gameProfile) {
        this.method29194(gameProfile, null);
    }
    
    private void method29194(final GameProfile gameProfile, Date time) {
        final UUID id = gameProfile.getId();
        if (time == null) {
            final Calendar instance = Calendar.getInstance();
            instance.setTime(new Date());
            instance.add(2, 1);
            time = instance.getTime();
        }
        final Class8426 class8426 = new Class8426(this, gameProfile, time, null);
        if (this.field36127.containsKey(id)) {
            this.field36126.remove(this.field36127.get(id).method28143().getName().toLowerCase(Locale.ROOT));
            this.field36128.remove(gameProfile);
        }
        this.field36126.put(gameProfile.getName().toLowerCase(Locale.ROOT), class8426);
        this.field36127.put(id, class8426);
        this.field36128.addFirst(gameProfile);
        this.method29199();
    }
    
    @Nullable
    public GameProfile method29195(final String s) {
        final String lowerCase = s.toLowerCase(Locale.ROOT);
        Class8426 class8426 = this.field36126.get(lowerCase);
        if (class8426 != null) {
            if (new Date().getTime() >= Class8426.method28145(class8426).getTime()) {
                this.field36127.remove(class8426.method28143().getId());
                this.field36126.remove(class8426.method28143().getName().toLowerCase(Locale.ROOT));
                this.field36128.remove(class8426.method28143());
                class8426 = null;
            }
        }
        if (class8426 == null) {
            final GameProfile method29190 = method29190(this.field36129, lowerCase);
            if (method29190 != null) {
                this.method29193(method29190);
                class8426 = this.field36126.get(lowerCase);
            }
        }
        else {
            final GameProfile method29191 = class8426.method28143();
            this.field36128.remove(method29191);
            this.field36128.addFirst(method29191);
        }
        this.method29199();
        return (class8426 != null) ? class8426.method28143() : null;
    }
    
    @Nullable
    public GameProfile method29196(final UUID uuid) {
        final Class8426 class8426 = this.field36127.get(uuid);
        return (class8426 != null) ? class8426.method28143() : null;
    }
    
    private Class8426 method29197(final UUID uuid) {
        final Class8426 class8426 = this.field36127.get(uuid);
        if (class8426 != null) {
            final GameProfile method28143 = class8426.method28143();
            this.field36128.remove(method28143);
            this.field36128.addFirst(method28143);
        }
        return class8426;
    }
    
    public void method29198() {
        Reader reader = null;
        try {
            reader = Files.newReader(this.field36131, StandardCharsets.UTF_8);
            final List list = Class9583.method35926(this.field36130, reader, Class8608.field36132);
            this.field36126.clear();
            this.field36127.clear();
            this.field36128.clear();
            if (list != null) {
                for (final Class8426 class8426 : Lists.reverse((List)list)) {
                    if (class8426 != null) {
                        this.method29194(class8426.method28143(), class8426.method28144());
                    }
                }
            }
        }
        catch (final FileNotFoundException ex) {}
        catch (final JsonParseException ex2) {}
        finally {
            IOUtils.closeQuietly(reader);
        }
    }
    
    public void method29199() {
        final String json = this.field36130.toJson((Object)this.method29200(1000));
        Writer writer = null;
        try {
            writer = Files.newWriter(this.field36131, StandardCharsets.UTF_8);
            writer.write(json);
        }
        catch (final FileNotFoundException ex) {}
        catch (final IOException ex2) {}
        finally {
            IOUtils.closeQuietly(writer);
        }
    }
    
    private List<Class8426> method29200(final int n) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator iterator = Lists.newArrayList(Iterators.limit((Iterator)this.field36128.iterator(), n)).iterator();
        while (iterator.hasNext()) {
            final Class8426 method29197 = this.method29197(((GameProfile)iterator.next()).getId());
            if (method29197 == null) {
                continue;
            }
            arrayList.add(method29197);
        }
        return arrayList;
    }
    
    static {
        field36124 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        field36132 = new Class8360();
    }
}
