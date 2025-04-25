// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;

import com.mentalfrostbyte.Client;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.Chunk;
import org.lwjgl.BufferUtils;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;

public class Class7658
{
    private Minecraft field30396;
    private List<ChunkPos> field30397;
    private List<ChunkPos> field30398;
    private List<Class8124> field30399;
    private boolean field30400;
    private int field30401;
    private String field30402;
    public HashMap<Long, Class8537> field30403;
    public int field30404;
    public List<Class2420> field30405;
    public HashMap<Long, ByteBuffer> field30406;
    public ByteBuffer field30407;
    
    public Class7658() {
        this.field30396 = Minecraft.getInstance();
        this.field30397 = new ArrayList<ChunkPos>();
        this.field30398 = new ArrayList<ChunkPos>();
        this.field30399 = new ArrayList<Class8124>();
        this.field30400 = false;
        this.field30401 = 10;
        this.field30402 = null;
        this.field30403 = new HashMap<Long, Class8537>();
        this.field30404 = 0;
        this.field30405 = new ArrayList<Class2420>();
        this.field30406 = new HashMap<Long, ByteBuffer>();
        this.field30407 = BufferUtils.createByteBuffer(this.field30401 * 16 * this.field30401 * 16 * 3);
    }
    
    public void method24261() {
        Client.getInstance().getEventBus().register2(this);
        final int n = -7687425;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                this.field30407.put((byte)(n >> 16 & 0xFF));
                this.field30407.put((byte)(n >> 8 & 0xFF));
                this.field30407.put((byte)(n & 0xFF));
            }
        }
        this.field30407.flip();
    }
    
    public List<Class8124> method24262() {
        if (!this.field30400) {
            this.method24265();
        }
        return this.field30399;
    }
    
    public void method24263(final Class8124 class8124) {
        this.field30399.add(class8124);
        this.method24264();
    }
    
    public void method24264() {
        if (this.field30402 == null) {
            return;
        }
        final File file = new File(this.field30402 + "/waypoints.json");
        final JSONArray JSONArray = new JSONArray();
        final Iterator<Class8124> iterator = this.field30399.iterator();
        while (iterator.hasNext()) {
            JSONArray.put(iterator.next().method26749());
        }
        final JSONObject class89 = new JSONObject();
        class89.put("waypoints", JSONArray);
        try {
            Class9532.method35585(class89, file);
        }
        catch (final JSONException | IOException ex) {
            Client.getInstance().getLogger().error(((Throwable)ex).getMessage());
        }
    }
    
    private void method24265() {
        final File file = new File(this.field30402 + "/waypoints.json");
        try {
            final JSONObject method35586 = Class9532.method35586(file);
            if (!method35586.has("waypoints")) {
                method35586.put("waypoints", new JSONArray());
            }
            final Iterator<Object> iterator = method35586.getJSONArray("waypoints").iterator();
            while (iterator.hasNext()) {
                this.field30399.add(new Class8124(iterator.next()));
            }
            this.field30400 = true;
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void method24266(final Class8124 class8124) {
        this.field30399.remove(class8124);
    }
    
    @EventListener
    public void method24267(final Class5732 class5732) {
        try {
            this.method24264();
            this.method24270();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        this.field30402 = this.method24272();
        this.field30403.clear();
        this.field30397.clear();
        this.field30398.clear();
        this.field30400 = false;
        this.field30399.clear();
    }
    
    @EventListener
    private void method24268(final Class5743 class5743) {
        if (this.field30396.world == null) {
            return;
        }
        if (this.field30402 == null) {
            return;
        }
        if (false) {
            return;
        }
        if (this.field30396.player.ticksExisted % 120 == 0) {
            final Class2420 method28644 = Class8537.method28644(this.field30396.world.method6965(this.field30396.player.method1894()).method7019());
            final Iterator<Map.Entry<Long, Class8537>> iterator = this.field30403.entrySet().iterator();
            while (iterator.hasNext()) {
                final Map.Entry<Long, V> entry = (Map.Entry<Long, V>)iterator.next();
                final Class2420 class5744 = new Class2420(entry.getKey());
                final double n = method28644.field14319 - class5744.field14319;
                final double n2 = method28644.field14320 - class5744.field14320;
                if (Math.sqrt(n * n + n2 * n2) > 2.0) {
                    try {
                        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.method24274(this.field30402, (Class8537)entry.getValue())));
                        ((Class8537)entry.getValue()).method28642(objectOutputStream);
                        objectOutputStream.close();
                    }
                    catch (final IOException ex) {
                        ex.printStackTrace();
                    }
                    this.field30404 = Math.max(0, this.field30404 - ((Class8537)entry.getValue()).field35828.size());
                    iterator.remove();
                }
            }
        }
        final ArrayList list = new ArrayList();
        final String field30402 = this.field30402;
        int n3 = 0;
        for (int i = 0; i < this.field30396.world.method6835().field10344.field39563.length(); ++i) {
            final Chunk class5745 = this.field30396.world.method6835().field10344.field39563.get(i);
            if (class5745 != null) {
                final boolean contains = this.field30397.contains(class5745.method7019());
                final boolean contains2 = this.field30398.contains(class5745.method7019());
                if (!contains || contains2) {
                    if (!class5745.method7062()) {
                        if (this.field30396.world.method6835().isChunkLoaded(class5745.method7019())) {
                            if (!(this.field30396.world.method6959(this.field30396.player.method1894()) instanceof Class3158)) {
                                if (!(this.field30396.world.method6959(this.field30396.player.method1894()) instanceof Class3150)) {
                                    if (!contains) {
                                        this.field30397.add(class5745.method7019());
                                    }
                                    final boolean method28645 = this.method24277(class5745);
                                    if (!method28645 && !contains2) {
                                        this.field30398.add(class5745.method7019());
                                    }
                                    else if (method28645 && contains2) {
                                        this.field30398.remove(class5745.method7019());
                                    }
                                    else if (!method28645 && contains2) {
                                        continue;
                                    }
                                    new Thread(() -> {
                                        try {
                                            new File(pathname).mkdirs();
                                            final File file = new File(this.method24275(pathname, class5746));
                                            Class8537.method28644(class5746.method7019());
                                            final Class2420 class5748;
                                            final Class8537 class5747 = this.field30403.get(class5748.method9723());
                                            this.method24278(class5746, this.method24277(class5746));
                                            if (class5747 != null) {
                                                final ByteBuffer byteBuffer;
                                                class5747.method28638(byteBuffer, class5746.method7019());
                                            }
                                            else if (!file.exists()) {
                                                final Class8537 value = new Class8537(class5748.field14319, class5748.field14320);
                                                final ByteBuffer byteBuffer;
                                                value.method28638(byteBuffer, class5746.method7019());
                                                this.field30403.put(class5748.method9723(), value);
                                                this.field30405.clear();
                                            }
                                            else if (this.method24269(class5748)) {
                                                final ByteBuffer byteBuffer;
                                                this.field30403.get(class5748.method9723()).method28638(byteBuffer, class5746.method7019());
                                            }
                                            ++this.field30404;
                                        }
                                        catch (final IOException ex3) {
                                            ex3.printStackTrace();
                                        }
                                        return;
                                    }).start();
                                    if (++n3 > 6) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.field30404 > 32) {
            this.field30404 = 0;
            try {
                this.method24270();
            }
            catch (final IOException ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public boolean method24269(final Class2420 class2420) throws IOException {
        if (this.field30405.contains(class2420)) {
            return false;
        }
        final File file = new File(this.method24273(this.field30402, class2420));
        if (file.exists()) {
            final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            final Class8537 value = new Class8537(class2420.field14319, class2420.field14320);
            value.method28643(objectInputStream);
            this.field30403.put(class2420.method9723(), value);
            return true;
        }
        this.field30405.add(class2420);
        return false;
    }
    
    public void method24270() throws FileNotFoundException, IOException {
        if (this.field30402 != null) {
            final String field30402 = this.field30402;
            for (final Map.Entry<K, Class8537> entry : this.field30403.entrySet()) {
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.method24274(field30402, entry.getValue())));
                entry.getValue().method28642(objectOutputStream);
                objectOutputStream.close();
            }
        }
    }
    
    public String method24271() {
        String s = "local/local";
        if (this.field30396.method5285() == null && this.field30396.method5282() != null) {
            s = "server/" + this.field30396.method5282().field41613.replace("/", ":");
        }
        else if (this.field30396.method5285() != null) {
            s = "local/" + this.field30396.method5285().method1501();
        }
        return s;
    }
    
    public String method24272() {
        return new File("jello") + "/maps/" + this.method24271();
    }
    
    public String method24273(final String str, final Class2420 class2420) throws FileNotFoundException {
        return str + "/" + class2420.field14319 + "c" + class2420.field14320 + ".jmap";
    }
    
    public String method24274(final String str, final Class8537 class8537) throws FileNotFoundException {
        return str + "/" + class8537.field35826 + "c" + class8537.field35827 + ".jmap";
    }
    
    public String method24275(final String str, final Chunk class1862) throws FileNotFoundException {
        final Class2420 method28644 = Class8537.method28644(class1862.method7019());
        return str + "/" + method28644.field14319 + "c" + method28644.field14320 + ".jmap";
    }
    
    public Class7666 method24276(final ChunkPos class7859, final int n) {
        final ArrayList list = new ArrayList();
        for (int i = -n / 2; i < n / 2; ++i) {
            for (int j = -n / 2; j < n / 2; ++j) {
                list.add(new ChunkPos(class7859.field32290 + i, class7859.field32291 + j));
            }
        }
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(n * 16 * n * 16 * 3);
        int n2 = 0;
        int position = byteBuffer.position();
        final String field30402 = this.field30402;
        for (final ChunkPos class7860 : list) {
            ByteBuffer byteBuffer2 = this.field30407.duplicate();
            ChunkPos.method25423(class7860.field32290, class7860.field32291);
            byteBuffer2.position();
            final Class2420 method28644 = Class8537.method28644(class7860);
            final Class8537 class7861 = this.field30403.get(method28644.method9723());
            if (class7861 != null) {
                final ByteBuffer method28645 = class7861.method28639(class7860);
                if (method28645 != null) {
                    byteBuffer2 = method28645.duplicate();
                }
            }
            else {
                try {
                    if (this.method24269(method28644)) {
                        final ByteBuffer method28646 = this.field30403.get(method28644.method9723()).method28639(class7860);
                        if (method28646 != null) {
                            byteBuffer2 = method28646.duplicate();
                        }
                    }
                }
                catch (final IOException ex) {
                    ex.printStackTrace();
                }
            }
            int position2 = byteBuffer.position();
            final int position3 = byteBuffer.position();
            for (int k = 0; k < 16; ++k) {
                for (int l = 0; l < 16; ++l) {
                    byteBuffer.put(byteBuffer2.get());
                    byteBuffer.put(byteBuffer2.get());
                    byteBuffer.put(byteBuffer2.get());
                }
                position2 += 16 * n * 3;
                if (position2 < byteBuffer.limit()) {
                    byteBuffer.position();
                }
            }
            position += 48;
            if (position3 + 48 < byteBuffer.limit()) {
                byteBuffer.position();
            }
            if (n2 != position / (48 * n)) {
                n2 = position / (48 * n);
                if (256 * n * 3 * n2 < byteBuffer.limit()) {
                    byteBuffer.position();
                }
            }
            byteBuffer2.position();
        }
        byteBuffer.position();
        byteBuffer.flip();
        return new Class7666(byteBuffer, 16 * n, 16 * n);
    }
    
    private boolean method24277(final Chunk class1862) {
        final Chunk method6686 = this.field30396.world.method6686(class1862.method7019().field32290, class1862.method7019().field32291 + 1);
        final Chunk method6687 = this.field30396.world.method6686(class1862.method7019().field32290, class1862.method7019().field32291 - 1);
        if (method6686 != null) {
            if (!method6686.method7062()) {
                if (method6687 != null) {
                    if (!method6687.method7062()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public ByteBuffer method24278(final Chunk class1862, final boolean b) {
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(768);
        final int n = class1862.method7019().field32290 * 16;
        final int n2 = class1862.method7019().field32291 * 16;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final BlockPos class1863 = new BlockPos(n + i, 64, n2 + j);
                final int method24279 = this.method24279(new BlockPos(class1863.getX(), class1862.method7017(HeightmapType.field11522).method35713(i, j) - 1, class1863.getZ()), b);
                byteBuffer.put((byte)(method24279 >> 16 & 0xFF));
                byteBuffer.put((byte)(method24279 >> 8 & 0xFF));
                byteBuffer.put((byte)(method24279 & 0xFF));
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }
    
    public int method24279(BlockPos method1139, final boolean b) {
        if (this.field30396.world.getBlockState(method1139).method21696() == Blocks.AIR) {
            method1139 = method1139.method1139();
        }
        int n = this.field30396.world.getBlockState(method1139).method21697().method26446().field37084;
        final Material method1140 = this.field30396.world.getBlockState(method1139.method1137()).method21697();
        if (method1140 != Material.SNOW) {
            if (method1140 == Material.LAVA) {
                n = method1140.method26446().colorValue;
            }
        }
        else {
            n = -1;
        }
        if (this.field30396.world.getBlockState(method1139).method21771((IProperty<Comparable>)Class8970.field37747)) {
            n = Material.WATER.method26446().colorValue;
        }
        int rgba = new Color((n & 0xFF0000) >> 16, (n & 0xFF00) >> 8, n & 0xFF).getRGB();
        boolean b2 = Math.abs(method1139.getZ() % 16) != 15 && Math.abs(method1139.getZ() % 16) != 0;
        if (method1139.getZ() < 0) {
            b2 = (Math.abs(method1139.getZ() % 16) != 16 && Math.abs(method1139.getZ() % 16) != 0);
        }
        if (b || b2) {
            final Material method1141 = this.field30396.world.getBlockState(method1139.method1141()).method21697();
            final Material method1142 = this.field30396.world.getBlockState(method1139.method1143()).method21697();
            if (method1141 != Material.AIR && method1141 != Material.SNOW) {
                if (method1142 == Material.AIR || method1142 == Material.SNOW) {
                    rgba = ColorUtils.method19109(new Color(rgba, true), Color.WHITE, 0.6f).getRGB();
                }
            }
            else {
                rgba = ColorUtils.method19109(new Color(rgba, true), Color.BLACK, 0.6f).getRGB();
            }
        }
        int rgb;
        if (rgba != -16777216) {
            rgb = new Color(rgba, true).getRGB();
        }
        else {
            rgb = -7687425;
        }
        return rgb;
    }
}
