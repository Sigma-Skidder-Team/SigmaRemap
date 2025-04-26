// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.IOException;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.opengl.renderer.Renderer;
import slick2d.Texture;

public class Class7764 implements Class7763
{
    public static final int field31721 = 0;
    public static final int field31722 = 1;
    public static final int field31723 = 2;
    public static final int field31724 = 3;
    public static SGL field31725;
    public static Class7764 field31726;
    public static final int field31727 = 1;
    public static final int field31728 = 2;
    public Texture field31729;
    public int field31730;
    public int field31731;
    public float field31732;
    public float field31733;
    public float field31734;
    public float field31735;
    public float field31736;
    public float field31737;
    public String field31738;
    public boolean field31739;
    public byte[] field31740;
    public boolean field31741;
    public float field31742;
    public float field31743;
    public String field31744;
    public Color[] field31745;
    private int field31746;
    private boolean field31747;
    private Color field31748;
    
    public Class7764(final Class7764 class7764) {
        this.field31737 = 1.0f;
        this.field31739 = false;
        this.field31746 = 9729;
        this.field31730 = class7764.method24843();
        this.field31731 = class7764.method24844();
        this.field31729 = class7764.field31729;
        this.field31732 = class7764.field31732;
        this.field31733 = class7764.field31733;
        this.field31738 = class7764.field31738;
        this.field31734 = class7764.field31734;
        this.field31735 = class7764.field31735;
        this.field31742 = (float)(this.field31730 / 2);
        this.field31743 = (float)(this.field31731 / 2);
        this.field31739 = true;
    }
    
    public Class7764() {
        this.field31737 = 1.0f;
        this.field31739 = false;
        this.field31746 = 9729;
    }
    
    public Class7764(final Texture field31729) {
        this.field31737 = 1.0f;
        this.field31739 = false;
        this.field31746 = 9729;
        this.field31729 = field31729;
        this.field31738 = field31729.toString();
        this.method24807();
    }
    
    public Class7764(final String s) throws SlickException {
        this(s, false);
    }
    
    public Class7764(final String s, final Color color) throws SlickException {
        this(s, false, 1, color);
    }
    
    public Class7764(final String s, final boolean b) throws SlickException {
        this(s, b, 1);
    }
    
    public Class7764(final String s, final boolean b, final int n) throws SlickException {
        this(s, b, n, null);
    }
    
    public Class7764(final String s, final boolean field31747, final int n, final Color field31748) throws SlickException {
        this.field31737 = 1.0f;
        this.field31739 = false;
        this.field31746 = 9729;
        this.field31746 = ((n == 1) ? 9729 : 9728);
        this.field31748 = field31748;
        this.field31747 = field31747;
        try {
            this.field31738 = s;
            int[] array = null;
            if (field31748 != null) {
                array = new int[] { (int)(field31748.r * 255.0f), (int)(field31748.g * 255.0f), (int)(field31748.b * 255.0f) };
            }
            this.field31729 = Class7649.method24214().method24225(s, field31747, this.field31746, array);
        }
        catch (final IOException ex) {
            Class8452.method28203(ex);
            throw new Class2324("Failed to load image from: " + s, ex);
        }
    }
    
    public void method24800(final int n) {
        this.field31746 = ((n != 1) ? 9728 : 9729);
        this.field31729.bind();
        Class7764.field31725.glTexParameteri(3553, 10241, this.field31746);
        Class7764.field31725.glTexParameteri(3553, 10240, this.field31746);
    }
    
    public Class7764(final int n, final int n2) throws SlickException {
        this(n, n2, 2);
    }
    
    public Class7764(final int i, final int j, final int n) throws SlickException {
        this.field31737 = 1.0f;
        this.field31739 = false;
        this.field31746 = 9729;
        this.field31738 = super.toString();
        this.field31746 = ((n == 1) ? 9729 : 9728);
        try {
            this.field31729 = Class7649.method24214().method24230(i, j, this.field31746);
        }
        catch (final IOException ex) {
            Class8452.method28203(ex);
            throw new Class2324("Failed to create empty image " + i + "x" + j);
        }
        this.method24813();
    }
    
    public Class7764(final InputStream inputStream, final String s, final boolean b) throws SlickException {
        this(inputStream, s, b, 1);
    }
    
    public Class7764(final InputStream inputStream, final String s, final boolean b, final int n) throws SlickException {
        this.field31737 = 1.0f;
        this.field31739 = false;
        this.field31746 = 9729;
        this.method24810(inputStream, s, b, n, null);
    }
    
    public Class7764(final Class5335 class5335) {
        this(class5335, 1);
        Class7777.method24930();
    }
    
    public Class7764(final Class5335 class5335, final int n) {
        this((Class5336)class5335, n);
        Class7777.method24930();
    }
    
    public Class7764(final Class5336 class5336) {
        this(class5336, 1);
    }
    
    public Class7764(final Class5336 class5336, final int n) {
        this.field31737 = 1.0f;
        this.field31739 = false;
        this.field31746 = 9729;
        try {
            this.field31746 = ((n == 1) ? 9729 : 9728);
            this.field31729 = Class7649.method24214().method24231(class5336, this.field31746);
            this.field31738 = this.field31729.toString();
        }
        catch (final IOException ex) {
            Class8452.method28203(ex);
        }
    }
    
    public int method24801() {
        return this.field31746;
    }
    
    public String method24802() {
        return this.field31738;
    }
    
    public void method24803(final float n, final float n2, final float n3, final float n4) {
        this.method24805(0, n, n2, n3, n4);
        this.method24805(1, n, n2, n3, n4);
        this.method24805(3, n, n2, n3, n4);
        this.method24805(2, n, n2, n3, n4);
    }
    
    public void method24804(final float n, final float n2, final float n3) {
        this.method24806(0, n, n2, n3);
        this.method24806(1, n, n2, n3);
        this.method24806(3, n, n2, n3);
        this.method24806(2, n, n2, n3);
    }
    
    public void method24805(final int n, final float field14368, final float field14369, final float field14370, final float field14371) {
        if (this.field31745 == null) {
            this.field31745 = new Color[] { new Color(1.0f, 1.0f, 1.0f, 1.0f), new Color(1.0f, 1.0f, 1.0f, 1.0f), new Color(1.0f, 1.0f, 1.0f, 1.0f), new Color(1.0f, 1.0f, 1.0f, 1.0f) };
        }
        this.field31745[n].r = field14368;
        this.field31745[n].g = field14369;
        this.field31745[n].b = field14370;
        this.field31745[n].a = field14371;
    }
    
    public void method24806(final int n, final float field14368, final float field14369, final float field14370) {
        if (this.field31745 == null) {
            this.field31745 = new Color[] { new Color(1.0f, 1.0f, 1.0f, 1.0f), new Color(1.0f, 1.0f, 1.0f, 1.0f), new Color(1.0f, 1.0f, 1.0f, 1.0f), new Color(1.0f, 1.0f, 1.0f, 1.0f) };
        }
        this.field31745[n].r = field14368;
        this.field31745[n].g = field14369;
        this.field31745[n].b = field14370;
    }
    
    public void method24807() {
        if (!Class7764.field31725.canTextureMirrorClamp()) {
            Class7764.field31725.glTexParameteri(3553, 10242, 10496);
            Class7764.field31725.glTexParameteri(3553, 10243, 10496);
        }
        else {
            Class7764.field31725.glTexParameteri(3553, 10242, 34627);
            Class7764.field31725.glTexParameteri(3553, 10243, 34627);
        }
    }
    
    public void method24808(final String field31744) {
        this.field31744 = field31744;
    }
    
    public String method24809() {
        return this.field31744;
    }
    
    private void method24810(final InputStream inputStream, final String s, final boolean b, final int n, final Color color) throws SlickException {
        this.field31746 = ((n == 1) ? 9729 : 9728);
        try {
            this.field31738 = s;
            int[] array = null;
            if (color != null) {
                array = new int[] { (int)(color.r * 255.0f), (int)(color.g * 255.0f), (int)(color.b * 255.0f) };
            }
            this.field31729 = Class7649.method24214().method24227(inputStream, s, b, this.field31746, array);
        }
        catch (final IOException ex) {
            Class8452.method28203(ex);
            throw new Class2324("Failed to load image from: " + s, ex);
        }
    }
    
    public void method24811() {
        this.field31729.bind();
    }
    
    public void method24812() {
        this.field31739 = false;
        this.method24813();
    }
    
    public final void method24813() {
        if (!this.field31739) {
            this.field31739 = true;
            if (this.field31729 != null) {
                this.field31730 = this.field31729.getImageWidth();
                this.field31731 = this.field31729.getImageHeight();
                this.field31734 = 0.0f;
                this.field31735 = 0.0f;
                this.field31732 = this.field31729.getWidth();
                this.field31733 = this.field31729.getHeight();
            }
            this.method24814();
            this.field31742 = (float)(this.field31730 / 2);
            this.field31743 = (float)(this.field31731 / 2);
        }
    }
    
    public void method24814() {
    }
    
    public void method24774() {
        this.method24775(0.0f, 0.0f);
    }
    
    public void method24815(final float n, final float n2) {
        this.method24775(n - this.method24843() / 2, n2 - this.method24844() / 2);
    }
    
    @Override
    public void method24775(final float n, final float n2) {
        this.method24813();
        this.method24777(n, n2, (float)this.field31730, (float)this.field31731);
    }
    
    public void method24776(final float n, final float n2, final Color color) {
        this.method24813();
        this.method24778(n, n2, (float)this.field31730, (float)this.field31731, color);
    }
    
    public void method24816(final float n, final float n2, final float n3, final float n4) {
        this.method24813();
        if (this.field31745 != null) {
            this.field31745[0].bind();
            Class7764.field31725.glTexCoord2f(this.field31734, this.field31735);
            Class7764.field31725.glVertex3f(n, n2, 0.0f);
            this.field31745[3].bind();
            Class7764.field31725.glTexCoord2f(this.field31734, this.field31735 + this.field31733);
            Class7764.field31725.glVertex3f(n, n2 + n4, 0.0f);
            this.field31745[2].bind();
            Class7764.field31725.glTexCoord2f(this.field31734 + this.field31732, this.field31735 + this.field31733);
            Class7764.field31725.glVertex3f(n + n3, n2 + n4, 0.0f);
            this.field31745[1].bind();
            Class7764.field31725.glTexCoord2f(this.field31734 + this.field31732, this.field31735);
            Class7764.field31725.glVertex3f(n + n3, n2, 0.0f);
        }
        else {
            Class7764.field31725.glTexCoord2f(this.field31734, this.field31735);
            Class7764.field31725.glVertex3f(n, n2, 0.0f);
            Class7764.field31725.glTexCoord2f(this.field31734, this.field31735 + this.field31733);
            Class7764.field31725.glVertex3f(n, n2 + n4, 0.0f);
            Class7764.field31725.glTexCoord2f(this.field31734 + this.field31732, this.field31735 + this.field31733);
            Class7764.field31725.glVertex3f(n + n3, n2 + n4, 0.0f);
            Class7764.field31725.glTexCoord2f(this.field31734 + this.field31732, this.field31735);
            Class7764.field31725.glVertex3f(n + n3, n2, 0.0f);
        }
    }
    
    public float method24817() {
        this.method24813();
        return this.field31734;
    }
    
    public float method24818() {
        this.method24813();
        return this.field31735;
    }
    
    public float method24819() {
        this.method24813();
        return this.field31732;
    }
    
    public float method24820() {
        this.method24813();
        return this.field31733;
    }
    
    public void method24821(final float n, final float n2, final float n3) {
        this.method24813();
        this.method24778(n, n2, this.field31730 * n3, this.field31731 * n3, Color.white);
    }
    
    public void method24822(final float n, final float n2, final float n3, final Color color) {
        this.method24813();
        this.method24778(n, n2, this.field31730 * n3, this.field31731 * n3, color);
    }
    
    public void method24777(final float n, final float n2, final float n3, final float n4) {
        this.method24813();
        this.method24778(n, n2, n3, n4, Color.white);
    }
    
    public void method24823(final float n, final float n2, final float n3, final float n4) {
        this.method24824(n, n2, n3, n4, Color.white);
    }
    
    public void method24824(final float n, final float n2, final float n3, final float n4, Color field14355) {
        if (this.field31737 != 1.0f) {
            if (field14355 == null) {
                field14355 = Color.white;
            }
            final Color color;
            field14355 = (color = new Color(field14355));
            color.a *= this.field31737;
        }
        if (field14355 != null) {
            field14355.bind();
        }
        this.field31729.bind();
        Class7764.field31725.glTranslatef(n, n2, 0.0f);
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glBegin(7);
        this.method24813();
        Class7764.field31725.glTexCoord2f(this.field31734, this.field31735);
        Class7764.field31725.glVertex3f(0.0f, 0.0f, 0.0f);
        Class7764.field31725.glTexCoord2f(this.field31734, this.field31735 + this.field31733);
        Class7764.field31725.glVertex3f(n3, (float)this.field31731, 0.0f);
        Class7764.field31725.glTexCoord2f(this.field31734 + this.field31732, this.field31735 + this.field31733);
        Class7764.field31725.glVertex3f(this.field31730 + n3, this.field31731 + n4, 0.0f);
        Class7764.field31725.glTexCoord2f(this.field31734 + this.field31732, this.field31735);
        Class7764.field31725.glVertex3f((float)this.field31730, n4, 0.0f);
        Class7764.field31725.glEnd();
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(-this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glTranslatef(-n, -n2, 0.0f);
    }
    
    public void method24778(final float n, final float n2, final float n3, final float n4, Color field14355) {
        if (this.field31737 != 1.0f) {
            if (field14355 == null) {
                field14355 = Color.white;
            }
            final Color color;
            field14355 = (color = new Color(field14355));
            color.a *= this.field31737;
        }
        if (field14355 != null) {
            field14355.bind();
        }
        this.field31729.bind();
        Class7764.field31725.glTranslatef(n, n2, 0.0f);
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glBegin(7);
        this.method24816(0.0f, 0.0f, n3, n4);
        Class7764.field31725.glEnd();
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(-this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glTranslatef(-n, -n2, 0.0f);
    }
    
    public void method24825(final float n, final float n2, final float n3, final float n4) {
        this.method24829(n, n2, n3, n4, Color.white);
    }
    
    public void method24826(final float field31742, final float field31743) {
        this.field31742 = field31742;
        this.field31743 = field31743;
    }
    
    public float method24827() {
        this.method24813();
        return this.field31742;
    }
    
    public float method24828() {
        this.method24813();
        return this.field31743;
    }
    
    public void method24829(final float n, final float n2, final float n3, final float n4, final Color color) {
        this.method24813();
        color.bind();
        this.field31729.bind();
        if (Class7764.field31725.canSecondaryColor()) {
            Class7764.field31725.glEnable(33880);
            Class7764.field31725.glSecondaryColor3ubEXT((byte)(color.r * 255.0f), (byte)(color.g * 255.0f), (byte)(color.b * 255.0f));
        }
        Class7764.field31725.glTexEnvi(8960, 8704, 8448);
        Class7764.field31725.glTranslatef(n, n2, 0.0f);
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glBegin(7);
        this.method24816(0.0f, 0.0f, n3, n4);
        Class7764.field31725.glEnd();
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(-this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glTranslatef(-n, -n2, 0.0f);
        if (Class7764.field31725.canSecondaryColor()) {
            Class7764.field31725.glDisable(33880);
        }
    }
    
    public void method24830(final float n, final float n2) {
        this.method24825(n, n2, (float)this.method24843(), (float)this.method24844());
    }
    
    public void method24831(final float n) {
        this.field31736 = n % 360.0f;
    }
    
    public float method24832() {
        return this.field31736;
    }
    
    public float method24833() {
        return this.field31737;
    }
    
    public void method24834(final float field31737) {
        this.field31737 = field31737;
    }
    
    public void method24835(final float n) {
        this.field31736 += n;
        this.field31736 %= 360.0f;
    }
    
    public Class7764 method24836(final int n, final int n2, final int field31730, final int field31731) {
        this.method24813();
        final float field31732 = n / (float)this.field31730 * this.field31732 + this.field31734;
        final float field31733 = n2 / (float)this.field31731 * this.field31733 + this.field31735;
        final float field31734 = field31730 / (float)this.field31730 * this.field31732;
        final float field31735 = field31731 / (float)this.field31731 * this.field31733;
        final Class7764 class7764 = new Class7764();
        class7764.field31739 = true;
        class7764.field31729 = this.field31729;
        class7764.field31734 = field31732;
        class7764.field31735 = field31733;
        class7764.field31732 = field31734;
        class7764.field31733 = field31735;
        class7764.field31730 = field31730;
        class7764.field31731 = field31731;
        class7764.field31738 = this.field31738;
        class7764.field31742 = (float)(field31730 / 2);
        class7764.field31743 = (float)(field31731 / 2);
        return class7764;
    }
    
    public void method24837(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.method24838(n, n2, n + this.field31730, n2 + this.field31731, n3, n4, n5, n6);
    }
    
    public void method24838(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        this.method24839(n, n2, n3, n4, n5, n6, n7, n8, Color.white);
    }
    
    public void method24839(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, Color field14355) {
        this.method24813();
        if (this.field31737 != 1.0f) {
            if (field14355 == null) {
                field14355 = Color.white;
            }
            final Color color;
            field14355 = (color = new Color(field14355));
            color.a *= this.field31737;
        }
        field14355.bind();
        this.field31729.bind();
        Class7764.field31725.glTranslatef(n, n2, 0.0f);
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glBegin(7);
        this.method24840(0.0f, 0.0f, n3 - n, n4 - n2, n5, n6, n7, n8);
        Class7764.field31725.glEnd();
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(-this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glTranslatef(-n, -n2, 0.0f);
    }
    
    public void method24840(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        this.method24841(n, n2, n3, n4, n5, n6, n7, n8, null);
    }
    
    public void method24841(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final Color color) {
        if (color != null) {
            color.bind();
        }
        final float n9 = n3 - n;
        final float n10 = n4 - n2;
        final float n11 = n7 - n5;
        final float n12 = n8 - n6;
        final float n13 = n5 / this.field31730 * this.field31732 + this.field31734;
        final float n14 = n6 / this.field31731 * this.field31733 + this.field31735;
        final float n15 = n11 / this.field31730 * this.field31732;
        final float n16 = n12 / this.field31731 * this.field31733;
        Class7764.field31725.glTexCoord2f(n13, n14);
        Class7764.field31725.glVertex3f(n, n2, 0.0f);
        Class7764.field31725.glTexCoord2f(n13, n14 + n16);
        Class7764.field31725.glVertex3f(n, n2 + n10, 0.0f);
        Class7764.field31725.glTexCoord2f(n13 + n15, n14 + n16);
        Class7764.field31725.glVertex3f(n + n9, n2 + n10, 0.0f);
        Class7764.field31725.glTexCoord2f(n13 + n15, n14);
        Class7764.field31725.glVertex3f(n + n9, n2, 0.0f);
    }
    
    public void method24842(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        Color.white.bind();
        this.field31729.bind();
        Class7764.field31725.glTranslatef(n, n2, 0.0f);
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glBegin(7);
        this.method24813();
        Class7764.field31725.glTexCoord2f(this.field31734, this.field31735);
        Class7764.field31725.glVertex3f(0.0f, 0.0f, 0.0f);
        Class7764.field31725.glTexCoord2f(this.field31734, this.field31735 + this.field31733);
        Class7764.field31725.glVertex3f(n3 - n, n4 - n2, 0.0f);
        Class7764.field31725.glTexCoord2f(this.field31734 + this.field31732, this.field31735 + this.field31733);
        Class7764.field31725.glVertex3f(n5 - n, n6 - n2, 0.0f);
        Class7764.field31725.glTexCoord2f(this.field31734 + this.field31732, this.field31735);
        Class7764.field31725.glVertex3f(n7 - n, n8 - n2, 0.0f);
        Class7764.field31725.glEnd();
        if (this.field31736 != 0.0f) {
            Class7764.field31725.glTranslatef(this.field31742, this.field31743, 0.0f);
            Class7764.field31725.glRotatef(-this.field31736, 0.0f, 0.0f, 1.0f);
            Class7764.field31725.glTranslatef(-this.field31742, -this.field31743, 0.0f);
        }
        Class7764.field31725.glTranslatef(-n, -n2, 0.0f);
    }
    
    public int method24843() {
        this.method24813();
        return this.field31730;
    }
    
    public int method24844() {
        this.method24813();
        return this.field31731;
    }
    
    public Class7764 method24845() {
        this.method24813();
        return this.method24836(0, 0, this.field31730, this.field31731);
    }
    
    public Class7764 method24846(final float n) {
        this.method24813();
        return this.method24847((int)(this.field31730 * n), (int)(this.field31731 * n));
    }
    
    public Class7764 method24847(final int field31730, final int field31731) {
        this.method24813();
        final Class7764 method24845 = this.method24845();
        method24845.field31730 = field31730;
        method24845.field31731 = field31731;
        method24845.field31742 = (float)(field31730 / 2);
        method24845.field31743 = (float)(field31731 / 2);
        return method24845;
    }
    
    public void method24848() {
        if (this.field31733 > 0.0f) {
            this.field31735 += this.field31733;
            this.field31733 = -this.field31733;
        }
    }
    
    public Class7764 method24849(final boolean b, final boolean b2) {
        this.method24813();
        final Class7764 method24845 = this.method24845();
        if (b) {
            method24845.field31734 = this.field31734 + this.field31732;
            method24845.field31732 = -this.field31732;
        }
        if (b2) {
            method24845.field31735 = this.field31735 + this.field31733;
            method24845.field31733 = -this.field31733;
        }
        return method24845;
    }
    
    public void method24850() {
        if (Class7764.field31726 == this) {
            Class7764.field31726 = null;
            Class7764.field31725.glEnd();
            return;
        }
        throw new RuntimeException("The sprite sheet is not currently in use");
    }
    
    public void method24851() {
        if (Class7764.field31726 == null) {
            (Class7764.field31726 = this).method24813();
            Color.white.bind();
            this.field31729.bind();
            Class7764.field31725.glBegin(7);
            return;
        }
        throw new RuntimeException("Attempt to start use of a sprite sheet before ending use with another - see endUse()");
    }
    
    @Override
    public String toString() {
        this.method24813();
        return "[Image " + this.field31738 + " " + this.field31730 + "x" + this.field31731 + "  " + this.field31734 + "," + this.field31735 + "," + this.field31732 + "," + this.field31733 + "]";
    }
    
    public Texture method24852() {
        return this.field31729;
    }
    
    public void method24853(final Texture field31729) {
        this.field31729 = field31729;
        this.method24812();
    }
    
    private int method24854(final byte b) {
        if (b >= 0) {
            return b;
        }
        return 256 + b;
    }
    
    public Color method24855(int n, int n2) {
        if (this.field31740 == null) {
            this.field31740 = this.field31729.getTextureData();
        }
        final int n3 = (int)(this.field31734 * this.field31729.getTextureWidth());
        final int n4 = (int)(this.field31735 * this.field31729.getTextureHeight());
        if (this.field31732 >= 0.0f) {
            n += n3;
        }
        else {
            n = n3 - n;
        }
        if (this.field31733 >= 0.0f) {
            n2 += n4;
        }
        else {
            n2 = n4 - n2;
        }
        final int n5 = (n + n2 * this.field31729.getTextureWidth()) * (this.field31729.hasAlpha() ? 4 : 3);
        if (!this.field31729.hasAlpha()) {
            return new Color(this.method24854(this.field31740[n5]), this.method24854(this.field31740[n5 + 1]), this.method24854(this.field31740[n5 + 2]));
        }
        return new Color(this.method24854(this.field31740[n5]), this.method24854(this.field31740[n5 + 1]), this.method24854(this.field31740[n5 + 2]), this.method24854(this.field31740[n5 + 3]));
    }
    
    public boolean method24856() {
        return this.field31741;
    }
    
    public void method24857() throws SlickException {
        if (!this.method24856()) {
            this.field31741 = true;
            this.field31729.release();
        }
    }
    
    public void method24858() {
        this.field31740 = null;
    }
    
    static {
        Class7764.field31725 = Renderer.get();
    }
}
