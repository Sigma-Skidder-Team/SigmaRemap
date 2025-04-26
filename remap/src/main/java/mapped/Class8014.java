// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.opengl.renderer.Renderer;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.PrivilegedAction;
import java.security.AccessController;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

public class Class8014
{
    public SGL field32994;
    public static final int field32995 = 1;
    public static final int field32996 = 2;
    private static final int field32997 = 100;
    private ArrayList field32998;
    public HashMap field32999;
    public int field33000;
    public ArrayList field33001;
    public Class8777 field33002;
    private int field33003;
    private int field33004;
    private boolean field33005;
    private float field33006;
    private float field33007;
    private boolean field33008;
    private Class7764 field33009;
    private boolean field33010;
    private String field33011;
    private Color field33012;
    
    public static void method26229(final String s) {
        Class7395.method22708(s);
    }
    
    public Class8014(final Class7764 class7764) {
        this(class7764, 100);
    }
    
    public Class8014(final String s) {
        this(s, 100);
    }
    
    public void method26230() {
        final Iterator iterator = this.field32999.values().iterator();
        while (iterator.hasNext()) {
            ((Class8441)iterator.next()).method28176(this);
        }
        for (int i = 0; i < this.field33001.size(); ++i) {
            ((Class7394)this.field33001.get(i)).method22707();
        }
    }
    
    public boolean method26231() {
        return this.field33010;
    }
    
    public void method26232(final boolean field33010) {
        this.field33010 = field33010;
    }
    
    public void method26233(final boolean field33008) {
        this.field33008 = field33008;
    }
    
    public void method26234(final boolean field33005) {
        this.field33005 = field33005;
    }
    
    public boolean method26235() {
        return this.field33005;
    }
    
    public Class8014(final String s, final int n) {
        this(s, n, null);
    }
    
    public Class8014(final String s, final int field33000, final Color field33001) {
        this.field32994 = Renderer.get();
        this.field32998 = new ArrayList();
        this.field32999 = new HashMap();
        this.field33001 = new ArrayList();
        this.field33003 = 2;
        this.field33008 = true;
        this.field33010 = true;
        this.field33000 = field33000;
        this.field33012 = field33001;
        this.method26236(s);
        this.field33002 = this.method26238(this);
    }
    
    public Class8014(final Class7764 field33009, final int field33010) {
        this.field32994 = Renderer.get();
        this.field32998 = new ArrayList();
        this.field32999 = new HashMap();
        this.field33001 = new ArrayList();
        this.field33003 = 2;
        this.field33008 = true;
        this.field33010 = true;
        this.field33000 = field33010;
        this.field33009 = field33009;
        this.field33002 = this.method26238(this);
    }
    
    public void method26236(final String field33011) {
        this.field33011 = field33011;
        this.field33009 = null;
    }
    
    public int method26237() {
        return this.field33003;
    }
    
    public Class8777 method26238(final Class8014 class8014) {
        return new Class8777(class8014);
    }
    
    public void method26239(final int field33003) {
        this.field33003 = field33003;
    }
    
    public int method26240() {
        return this.field33001.size();
    }
    
    public Class7394 method26241(final int index) {
        return this.field33001.get(index);
    }
    
    public void method26242(final Class7394 class7394) {
        this.field33001.add(class7394);
        this.field32999.put(class7394, new Class8441(this, this, this.field33000));
    }
    
    public void method26243(final Class7394 class7394) {
        this.field33001.remove(class7394);
        this.field32999.remove(class7394);
    }
    
    public void method26244() {
        for (int i = 0; i < this.field33001.size(); --i, ++i) {
            this.method26243((Class7394)this.field33001.get(i));
        }
    }
    
    public float method26245() {
        return this.field33006;
    }
    
    public float method26246() {
        return this.field33007;
    }
    
    public void method26247(final float field33006, final float field33007) {
        this.field33006 = field33006;
        this.field33007 = field33007;
    }
    
    public void method26248() {
        this.method26249(this.field33006, this.field33007);
    }
    
    public void method26249(final float n, final float n2) {
        if (this.field33009 == null) {
            if (this.field33011 != null) {
                this.method26250();
            }
        }
        if (this.field33010) {
            this.field32994.glTranslatef(n, n2, 0.0f);
            if (this.field33003 == 1) {
                this.field32994.glBlendFunc(770, 1);
            }
            if (this.method26235()) {
                this.field32994.glEnable(2832);
                Class7777.method24930();
            }
            for (int i = 0; i < this.field33001.size(); ++i) {
                final Class7394 key = this.field33001.get(i);
                if (key.method22699()) {
                    if (key.method22702()) {
                        this.field32994.glBlendFunc(770, 1);
                    }
                    final Class8441 class8441 = this.field32999.get(key);
                    Class7764 class8442 = key.method22703();
                    if (class8442 == null) {
                        class8442 = this.field33009;
                    }
                    if (!key.method22705()) {
                        if (!key.method22704(this)) {
                            class8442.method24851();
                        }
                    }
                    for (int j = 0; j < class8441.field34694.length; ++j) {
                        if (class8441.field34694[j].method30490()) {
                            class8441.field34694[j].method30491();
                        }
                    }
                    if (!key.method22705()) {
                        if (!key.method22704(this)) {
                            class8442.method24850();
                        }
                    }
                    if (key.method22702()) {
                        this.field32994.glBlendFunc(770, 771);
                    }
                }
            }
            if (this.method26235()) {
                this.field32994.glDisable(2832);
            }
            if (this.field33003 == 1) {
                this.field32994.glBlendFunc(770, 771);
            }
            Color.white.bind();
            this.field32994.glTranslatef(-n, -n2, 0.0f);
        }
    }
    
    private void method26250() {
        AccessController.doPrivileged((PrivilegedAction<Object>)new Class2430(this));
    }
    
    public void method26251(final int n) {
        if (this.field33009 == null) {
            if (this.field33011 != null) {
                this.method26250();
            }
        }
        this.field32998.clear();
        final ArrayList list = new ArrayList(this.field33001);
        for (int i = 0; i < list.size(); ++i) {
            final Class7394 class7394 = list.get(i);
            if (class7394.method22699()) {
                class7394.method22697(this, n);
                if (this.field33008) {
                    if (class7394.method22701()) {
                        this.field32998.add(class7394);
                        this.field32999.remove(class7394);
                    }
                }
            }
        }
        this.field33001.removeAll(this.field32998);
        this.field33004 = 0;
        if (!this.field32999.isEmpty()) {
            for (final Class7394 key : this.field32999.keySet()) {
                if (!key.method22699()) {
                    continue;
                }
                final Class8441 class7395 = this.field32999.get(key);
                for (int j = 0; j < class7395.field34694.length; ++j) {
                    if (class7395.field34694[j].field36903 > 0.0f) {
                        class7395.field34694[j].method30492(n);
                        ++this.field33004;
                    }
                }
            }
        }
    }
    
    public int method26252() {
        return this.field33004;
    }
    
    public Class8777 method26253(final Class7394 key, final float n) {
        final ArrayList field34695 = this.field32999.get(key).field34695;
        if (field34695.size() <= 0) {
            Class8452.method28205("Ran out of particles (increase the limit)!");
            return this.field33002;
        }
        final Class8777 class8777 = field34695.remove(field34695.size() - 1);
        class8777.method30493(key, n);
        class8777.method30487(this.field33009);
        return class8777;
    }
    
    public void method26254(final Class8777 e) {
        if (e != this.field33002) {
            this.field32999.get(e.method30511()).field34695.add(e);
        }
    }
    
    public void method26255(final Class7394 class7394) {
        if (!this.field32999.isEmpty()) {
            for (final Class8441 class7395 : this.field32999.values()) {
                for (int i = 0; i < class7395.field34694.length; ++i) {
                    if (class7395.field34694[i].method30490()) {
                        if (class7395.field34694[i].method30511() == class7394) {
                            class7395.field34694[i].method30499(-1.0f);
                            this.method26254(class7395.field34694[i]);
                        }
                    }
                }
            }
        }
    }
    
    public void method26256(final Class7394 key, final float n, final float n2) {
        final Class8441 class8441 = this.field32999.get(key);
        for (int i = 0; i < class8441.field34694.length; ++i) {
            if (class8441.field34694[i].method30490()) {
                class8441.field34694[i].method30484(n, n2);
            }
        }
    }
    
    public Class8014 method26257() throws SlickException {
        for (int i = 0; i < this.field33001.size(); ++i) {
            if (!(this.field33001.get(i) instanceof Class7395)) {
                throw new Class2324("Only systems contianing configurable emitters can be duplicated");
            }
        }
        Class8014 method33089;
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Class9125.method33095(byteArrayOutputStream, this);
            method33089 = Class9125.method33089(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        }
        catch (final IOException ex) {
            Class8452.method28204("Failed to duplicate particle system");
            throw new Class2324("Unable to duplicated particle system", ex);
        }
        return method33089;
    }
}
