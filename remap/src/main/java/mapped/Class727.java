// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.ListIterator;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class727 extends Screen
{
    private final PlayerEntity field3959;
    private final ItemStack field3960;
    private boolean field3961;
    private boolean field3962;
    private int field3963;
    private int field3964;
    private final List<String> field3965;
    private String field3966;
    private int field3967;
    private int field3968;
    private long field3969;
    private int field3970;
    private Class680 field3971;
    private Class680 field3972;
    private Class654 field3973;
    private Class654 field3974;
    private Class654 field3975;
    private Class654 field3976;
    private final Class316 field3977;
    
    public Class727(final PlayerEntity field3959, final ItemStack field3960, final Class316 field3961) {
        super(NarratorChatListener.EMPTY);
        this.field3965 = Lists.newArrayList();
        this.field3966 = "";
        this.field3970 = -1;
        this.field3959 = field3959;
        this.field3960 = field3960;
        this.field3977 = field3961;
        final CompoundNBT method27657 = field3960.method27657();
        if (method27657 != null) {
            final ListNBT method27658 = method27657.getList("pages", 8).copy();
            for (int i = 0; i < method27658.size(); ++i) {
                this.field3965.add(method27658.method353(i));
            }
        }
        if (this.field3965.isEmpty()) {
            this.field3965.add("");
        }
    }
    
    private int method3990() {
        return this.field3965.size();
    }
    
    @Override
    public void tick() {
        super.tick();
        ++this.field3963;
    }
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        this.field3974 = this.addButton(new Class654(this.width / 2 - 100, 196, 98, 20, Class8822.method30773("book.signButton"), class654 -> {
            this.field3962 = true;
            this.method3994();
        }));
        this.field3973 = this.addButton(new Class654(this.width / 2 + 2, 196, 98, 20, Class8822.method30773("gui.done"), class654 -> {
            this.minecraft.displayGuiScreen(null);
            this.method3996(false);
        }));
        this.field3975 = this.addButton(new Class654(this.width / 2 - 100, 196, 98, 20, Class8822.method30773("book.finalizeButton"), class654 -> {
            if (this.field3962) {
                this.method3996(true);
                this.minecraft.displayGuiScreen(null);
            }
        }));
        this.field3976 = this.addButton(new Class654(this.width / 2 + 2, 196, 98, 20, Class8822.method30773("gui.cancel"), class654 -> {
            if (this.field3962) {
                this.field3962 = false;
            }
            this.method3994();
        }));
        final int n = (this.width - 192) / 2;
        this.field3971 = this.addButton(new Class680(n + 116, 159, true, class654 -> this.method3993(), true));
        this.field3972 = this.addButton(new Class680(n + 43, 159, false, class654 -> this.method3992(), true));
        this.method3994();
    }
    
    private String method3991(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (final char c : s.toCharArray()) {
            if (c != '§') {
                if (c != '\u007f') {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
    
    private void method3992() {
        if (this.field3964 > 0) {
            --this.field3964;
            this.field3967 = 0;
            this.field3968 = this.field3967;
        }
        this.method3994();
    }
    
    private void method3993() {
        if (this.field3964 >= this.method3990() - 1) {
            this.method3997();
            if (this.field3964 < this.method3990() - 1) {
                ++this.field3964;
            }
            this.field3967 = 0;
            this.field3968 = this.field3967;
        }
        else {
            ++this.field3964;
            this.field3967 = 0;
            this.field3968 = this.field3967;
        }
        this.method3994();
    }
    
    @Override
    public void removed() {
        this.minecraft.field4651.method22505(false);
    }
    
    private void method3994() {
        this.field3972.field3432 = (!this.field3962 && this.field3964 > 0);
        this.field3971.field3432 = !this.field3962;
        this.field3973.field3432 = !this.field3962;
        this.field3974.field3432 = !this.field3962;
        this.field3976.field3432 = this.field3962;
        this.field3975.field3432 = this.field3962;
        this.field3975.field3431 = !this.field3966.trim().isEmpty();
    }
    
    private void method3995() {
        final ListIterator<String> listIterator = this.field3965.listIterator(this.field3965.size());
        while (listIterator.hasPrevious() && listIterator.previous().isEmpty()) {
            listIterator.remove();
        }
    }
    
    private void method3996(final boolean b) {
        if (this.field3961) {
            this.method3995();
            final ListNBT class52 = new ListNBT();
            this.field3965.stream().map((Function<? super Object, ?>) StringNBT::method290).forEach(class52::add);
            if (!this.field3965.isEmpty()) {
                this.field3960.method27676("pages", class52);
            }
            if (b) {
                this.field3960.method27676("author", StringNBT.method290(this.field3959.method2844().getName()));
                this.field3960.method27676("title", StringNBT.method290(this.field3966.trim()));
            }
            this.minecraft.method5269().method17292(new Class4314(this.field3960, b, this.field3977));
        }
    }
    
    private void method3997() {
        if (this.method3990() < 100) {
            this.field3965.add("");
            this.field3961 = true;
        }
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        return super.keyPressed(keyCode, n2, n3) || (this.field3962 ? this.method4009(keyCode, n2, n3) : this.method3998(keyCode, n2, n3));
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        if (super.charTyped(c, n)) {
            return true;
        }
        if (!this.field3962) {
            if (!Class9528.method35576(c)) {
                return false;
            }
            this.method4012(Character.toString(c));
            return true;
        }
        else {
            if (this.field3966.length() < 16 && Class9528.method35576(c)) {
                this.field3966 += Character.toString(c);
                this.method3994();
                return this.field3961 = true;
            }
            return false;
        }
    }
    
    private boolean method3998(final int n, final int n2, final int n3) {
        final String method4010 = this.method4010();
        if (Screen.method3052(n)) {
            this.field3968 = 0;
            this.field3967 = method4010.length();
            return true;
        }
        if (Screen.method3051(n)) {
            this.minecraft.field4651.method22508(this.method4015());
            return true;
        }
        if (Screen.method3050(n)) {
            this.method4012(this.method3991(TextFormatting.getTextWithoutFormattingCodes(this.minecraft.field4651.method22507().replaceAll("\\r", ""))));
            this.field3968 = this.field3967;
            return true;
        }
        if (Screen.method3049(n)) {
            this.minecraft.field4651.method22508(this.method4015());
            this.method4007();
            return true;
        }
        switch (n) {
            case 257:
            case 335: {
                this.method4012("\n");
                return true;
            }
            case 259: {
                this.method3999(method4010);
                return true;
            }
            case 261: {
                this.method4000(method4010);
                return true;
            }
            case 262: {
                this.method4002(method4010);
                return true;
            }
            case 263: {
                this.method4001(method4010);
                return true;
            }
            case 264: {
                this.method4004(method4010);
                return true;
            }
            case 265: {
                this.method4003(method4010);
                return true;
            }
            case 266: {
                this.field3972.method3705();
                return true;
            }
            case 267: {
                this.field3971.method3705();
                return true;
            }
            case 268: {
                this.method4005(method4010);
                return true;
            }
            case 269: {
                this.method4006(method4010);
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private void method3999(final String str) {
        if (!str.isEmpty()) {
            if (this.field3968 == this.field3967) {
                if (this.field3967 > 0) {
                    this.method4011(new StringBuilder(str).deleteCharAt(Math.max(0, this.field3967 - 1)).toString());
                    this.field3967 = Math.max(0, this.field3967 - 1);
                    this.field3968 = this.field3967;
                }
            }
            else {
                this.method4007();
            }
        }
    }
    
    private void method4000(final String str) {
        if (!str.isEmpty()) {
            if (this.field3968 == this.field3967) {
                if (this.field3967 < str.length()) {
                    this.method4011(new StringBuilder(str).deleteCharAt(Math.max(0, this.field3967)).toString());
                }
            }
            else {
                this.method4007();
            }
        }
    }
    
    private void method4001(final String s) {
        final int n = this.font.method6630() ? 1 : -1;
        if (!Screen.method3046()) {
            this.field3967 = Math.max(0, this.field3967 + n);
        }
        else {
            this.field3967 = this.font.method6629(s, n, this.field3967, true);
        }
        if (!Screen.hasShiftDown()) {
            this.field3968 = this.field3967;
        }
    }
    
    private void method4002(final String s) {
        final int n = this.font.method6630() ? -1 : 1;
        if (!Screen.method3046()) {
            this.field3967 = Math.min(s.length(), this.field3967 + n);
        }
        else {
            this.field3967 = this.font.method6629(s, n, this.field3967, true);
        }
        if (!Screen.hasShiftDown()) {
            this.field3968 = this.field3967;
        }
    }
    
    private void method4003(final String s) {
        if (!s.isEmpty()) {
            final Class7116 method4018 = this.method4018(s, this.field3967);
            if (Class7116.method21844(method4018) != 0) {
                final int method4019 = this.method4023(s, new Class7116(this, Class7116.method21845(method4018) + this.method4008(s, this.field3967) / 3, Class7116.method21844(method4018) - 9));
                if (method4019 >= 0) {
                    this.field3967 = method4019;
                    if (!Screen.hasShiftDown()) {
                        this.field3968 = this.field3967;
                    }
                }
            }
            else {
                this.field3967 = 0;
                if (!Screen.hasShiftDown()) {
                    this.field3968 = this.field3967;
                }
            }
        }
    }
    
    private void method4004(final String str) {
        if (!str.isEmpty()) {
            final Class7116 method4018 = this.method4018(str, this.field3967);
            if (Class7116.method21844(method4018) + 9 != this.font.method6624(str + TextFormatting.BLACK + "_", 114)) {
                final int method4019 = this.method4023(str, new Class7116(this, Class7116.method21845(method4018) + this.method4008(str, this.field3967) / 3, Class7116.method21844(method4018) + 9));
                if (method4019 >= 0) {
                    this.field3967 = method4019;
                    if (!Screen.hasShiftDown()) {
                        this.field3968 = this.field3967;
                    }
                }
            }
            else {
                this.field3967 = str.length();
                if (!Screen.hasShiftDown()) {
                    this.field3968 = this.field3967;
                }
            }
        }
    }
    
    private void method4005(final String s) {
        this.field3967 = this.method4023(s, new Class7116(this, 0, Class7116.method21844(this.method4018(s, this.field3967))));
        if (!Screen.hasShiftDown()) {
            this.field3968 = this.field3967;
        }
    }
    
    private void method4006(final String s) {
        this.field3967 = this.method4023(s, new Class7116(this, 113, Class7116.method21844(this.method4018(s, this.field3967))));
        if (!Screen.hasShiftDown()) {
            this.field3968 = this.field3967;
        }
    }
    
    private void method4007() {
        if (this.field3968 != this.field3967) {
            final String method4010 = this.method4010();
            final int min = Math.min(this.field3967, this.field3968);
            final String string = method4010.substring(0, min) + method4010.substring(Math.max(this.field3967, this.field3968));
            this.field3967 = min;
            this.field3968 = this.field3967;
            this.method4011(string);
        }
    }
    
    private int method4008(final String s, final int n) {
        return (int)this.font.method6618(s.charAt(MathHelper.method35651(n, 0, s.length() - 1)));
    }
    
    private boolean method4009(final int n, final int n2, final int n3) {
        switch (n) {
            case 257:
            case 335: {
                if (!this.field3966.isEmpty()) {
                    this.method3996(true);
                    this.minecraft.displayGuiScreen(null);
                }
                return true;
            }
            case 259: {
                if (!this.field3966.isEmpty()) {
                    this.field3966 = this.field3966.substring(0, this.field3966.length() - 1);
                    this.method3994();
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private String method4010() {
        return (this.field3964 >= 0 && this.field3964 < this.field3965.size()) ? this.field3965.get(this.field3964) : "";
    }
    
    private void method4011(final String s) {
        if (this.field3964 >= 0) {
            if (this.field3964 < this.field3965.size()) {
                this.field3965.set(this.field3964, s);
                this.field3961 = true;
            }
        }
    }
    
    private void method4012(final String str) {
        if (this.field3968 != this.field3967) {
            this.method4007();
        }
        final String method4010 = this.method4010();
        this.field3967 = MathHelper.method35651(this.field3967, 0, method4010.length());
        final String string = new StringBuilder(method4010).insert(this.field3967, str).toString();
        if (this.font.method6624(string + TextFormatting.BLACK + "_", 114) <= 128) {
            if (string.length() < 1024) {
                this.method4011(string);
                final int min = Math.min(this.method4010().length(), this.field3967 + str.length());
                this.field3967 = min;
                this.field3968 = min;
            }
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.setFocused(null);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class723.field3947);
        final int n4 = (this.width - 192) / 2;
        this.blit(n4, 2, 0, 0, 192, 192);
        if (!this.field3962) {
            final String method30773 = Class8822.method30773("book.pageIndicator", this.field3964 + 1, this.method3990());
            final String method30774 = this.method4010();
            this.font.method6610(method30773, (float)(n4 - this.method4013(method30773) + 192 - 44), 18.0f, 0);
            this.font.method6622(method30774, n4 + 36, 32, 114, 0);
            this.method4016(method30774);
            if (this.field3963 / 6 % 2 == 0) {
                final Class7116 method30775 = this.method4018(method30774, this.field3967);
                if (this.font.method6630()) {
                    this.method4019(method30775);
                    Class7116.method21846(method30775, Class7116.method21845(method30775) - 4);
                }
                this.method4021(method30775);
                if (this.field3967 >= method30774.length()) {
                    this.font.method6610("_", (float)Class7116.method21845(method30775), (float)Class7116.method21844(method30775), 0);
                }
                else {
                    AbstractGui.fill(Class7116.method21845(method30775), Class7116.method21844(method30775) - 1, Class7116.method21845(method30775) + 1, Class7116.method21844(method30775) + 9, -16777216);
                }
            }
        }
        else {
            final String field3966 = this.field3966;
            String s;
            if (this.field3963 / 6 % 2 != 0) {
                s = field3966 + TextFormatting.GRAY + "_";
            }
            else {
                s = field3966 + TextFormatting.BLACK + "_";
            }
            final String method30776 = Class8822.method30773("book.editTitle");
            this.font.method6610(method30776, (float)(n4 + 36 + (114 - this.method4013(method30776)) / 2), 34.0f, 0);
            this.font.method6610(s, (float)(n4 + 36 + (114 - this.method4013(s)) / 2), 50.0f, 0);
            final String method30777 = Class8822.method30773("book.byAuthor", this.field3959.getName().getString());
            this.font.method6610(TextFormatting.DARK_GRAY + method30777, (float)(n4 + 36 + (114 - this.method4013(method30777)) / 2), 60.0f, 0);
            this.font.method6622(Class8822.method30773("book.finalizeWarning"), n4 + 36, 82, 114, 0);
        }
        super.render(n, n2, n3);
    }
    
    private int method4013(final String s) {
        return this.font.getStringWidth(this.font.method6630() ? this.font.method6611(s) : s);
    }
    
    private int method4014(final String s, final int n) {
        return this.font.method6628(s, n);
    }
    
    private String method4015() {
        return this.method4010().substring(Math.min(this.field3967, this.field3968), Math.max(this.field3967, this.field3968));
    }
    
    private void method4016(final String s) {
        if (this.field3968 != this.field3967) {
            final int min = Math.min(this.field3967, this.field3968);
            final int max = Math.max(this.field3967, this.field3968);
            String s2 = s.substring(min, max);
            String s3 = s.substring(min, this.font.method6629(s, 1, max, true));
            final Class7116 method4018 = this.method4018(s, min);
            final Class7116 class7116 = new Class7116(this, Class7116.method21845(method4018), Class7116.method21844(method4018) + 9);
            while (!s2.isEmpty()) {
                final int method4019 = this.method4014(s3, 114 - Class7116.method21845(method4018));
                if (s2.length() <= method4019) {
                    Class7116.method21846(class7116, Class7116.method21845(method4018) + this.method4013(s2));
                    this.method4017(method4018, class7116);
                    break;
                }
                final int min2 = Math.min(method4019, s2.length() - 1);
                final String substring = s2.substring(0, min2);
                final char char1 = s2.charAt(min2);
                final int n = (char1 == ' ' || char1 == '\n') ? 1 : 0;
                s2 = TextFormatting.getFormatString(substring) + s2.substring(min2 + n);
                s3 = TextFormatting.getFormatString(substring) + s3.substring(min2 + n);
                Class7116.method21846(class7116, Class7116.method21845(method4018) + this.method4013(substring + " "));
                this.method4017(method4018, class7116);
                Class7116.method21846(method4018, 0);
                Class7116.method21847(method4018, Class7116.method21844(method4018) + 9);
                Class7116.method21847(class7116, Class7116.method21844(class7116) + 9);
            }
        }
    }
    
    private void method4017(final Class7116 class7116, final Class7116 class7117) {
        final Class7116 class7118 = new Class7116(this, Class7116.method21845(class7116), Class7116.method21844(class7116));
        final Class7116 class7119 = new Class7116(this, Class7116.method21845(class7117), Class7116.method21844(class7117));
        if (this.font.method6630()) {
            this.method4019(class7118);
            this.method4019(class7119);
            final int method21845 = Class7116.method21845(class7119);
            Class7116.method21846(class7119, Class7116.method21845(class7118));
            Class7116.method21846(class7118, method21845);
        }
        this.method4021(class7118);
        this.method4021(class7119);
        final Tessellator method21846 = Tessellator.getInstance();
        final BufferBuilder method21847 = method21846.getBuffer();
        RenderSystem.method30068(0.0f, 0.0f, 255.0f, 255.0f);
        RenderSystem.disableTexture();
        RenderSystem.method30036();
        RenderSystem.method30038(Class2188.field12992);
        method21847.begin(7, DefaultVertexFormats.field39614);
        method21847.pos(Class7116.method21845(class7118), Class7116.method21844(class7119), 0.0).endVertex();
        method21847.pos(Class7116.method21845(class7119), Class7116.method21844(class7119), 0.0).endVertex();
        method21847.pos(Class7116.method21845(class7119), Class7116.method21844(class7118), 0.0).endVertex();
        method21847.pos(Class7116.method21845(class7118), Class7116.method21844(class7118), 0.0).endVertex();
        method21846.draw();
        RenderSystem.method30037();
        RenderSystem.enableTexture();
    }
    
    private Class7116 method4018(final String s, final int n) {
        final Class7116 class7116 = new Class7116(this);
        int n2 = 0;
        int n3 = 0;
        String string = s;
        while (!string.isEmpty()) {
            final int method4014 = this.method4014(string, 114);
            if (string.length() <= method4014) {
                Class7116.method21846(class7116, Class7116.method21845(class7116) + this.method4013(string.substring(0, Math.min(Math.max(n - n3, 0), string.length()))));
                break;
            }
            final String substring = string.substring(0, method4014);
            final char char1 = string.charAt(method4014);
            final int n4 = (char1 == ' ' || char1 == '\n') ? 1 : 0;
            string = TextFormatting.getFormatString(substring) + string.substring(method4014 + n4);
            n2 += substring.length() + n4;
            if (n2 - 1 >= n) {
                Class7116.method21846(class7116, Class7116.method21845(class7116) + this.method4013(substring.substring(0, Math.min(Math.max(n - n3, 0), substring.length()))));
                break;
            }
            Class7116.method21847(class7116, Class7116.method21844(class7116) + 9);
            n3 = n2;
        }
        return class7116;
    }
    
    private void method4019(final Class7116 class7116) {
        if (this.font.method6630()) {
            Class7116.method21846(class7116, 114 - Class7116.method21845(class7116));
        }
    }
    
    private void method4020(final Class7116 class7116) {
        Class7116.method21846(class7116, Class7116.method21845(class7116) - (this.width - 192) / 2 - 36);
        Class7116.method21847(class7116, Class7116.method21844(class7116) - 32);
    }
    
    private void method4021(final Class7116 class7116) {
        Class7116.method21846(class7116, Class7116.method21845(class7116) + (this.width - 192) / 2 + 36);
        Class7116.method21847(class7116, Class7116.method21844(class7116) + 32);
    }
    
    private int method4022(final String str, final int n) {
        if (n >= 0) {
            float n2 = 0.0f;
            int n3 = 0;
            final String string = str + " ";
            for (int i = 0; i < string.length(); ++i) {
                final char char1 = string.charAt(i);
                float method6618 = this.font.method6618(char1);
                if (char1 == '§') {
                    if (i < string.length() - 1) {
                        ++i;
                        final char char2 = string.charAt(i);
                        if (char2 != 'l' && char2 != 'L') {
                            if (char2 == 'r' || char2 == 'R') {
                                n3 = 0;
                            }
                        }
                        else {
                            n3 = 1;
                        }
                        method6618 = 0.0f;
                    }
                }
                final float n4 = n2;
                n2 += method6618;
                if (n3 != 0) {
                    if (method6618 > 0.0f) {
                        ++n2;
                    }
                }
                if (n >= n4 && n < n2) {
                    return i;
                }
            }
            return (n < n2) ? -1 : (string.length() - 1);
        }
        return 0;
    }
    
    private int method4023(final String s, final Class7116 class7116) {
        final int n = 144;
        if (Class7116.method21844(class7116) <= n) {
            int n2 = Integer.MIN_VALUE;
            int n3 = 9;
            int n4 = 0;
            for (String string = s; !string.isEmpty() && n2 < n; n2 = n3, n3 += 9) {
                final int method4014 = this.method4014(string, 114);
                if (method4014 >= string.length()) {
                    if (Class7116.method21844(class7116) >= n2) {
                        if (Class7116.method21844(class7116) < n3) {
                            final int method4015 = this.method4022(string, Class7116.method21845(class7116));
                            return (method4015 >= 0) ? (n4 + method4015) : -1;
                        }
                    }
                }
                else {
                    final String substring = string.substring(0, method4014);
                    if (Class7116.method21844(class7116) >= n2 && Class7116.method21844(class7116) < n3) {
                        final int method4016 = this.method4022(substring, Class7116.method21845(class7116));
                        return (method4016 >= 0) ? (n4 + method4016) : -1;
                    }
                    final char char1 = string.charAt(method4014);
                    final int n5 = (char1 == ' ' || char1 == '\n') ? 1 : 0;
                    string = TextFormatting.getFormatString(substring) + string.substring(method4014 + n5);
                    n4 += substring.length() + n5;
                }
            }
            return s.length();
        }
        return -1;
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            final long method27837 = Util.method27837();
            final String method27838 = this.method4010();
            if (!method27838.isEmpty()) {
                final Class7116 class7116 = new Class7116(this, (int)n, (int)n2);
                this.method4020(class7116);
                this.method4019(class7116);
                final int method27839 = this.method4023(method27838, class7116);
                if (method27839 >= 0) {
                    if (method27839 == this.field3970 && method27837 - this.field3969 < 250L) {
                        if (this.field3968 != this.field3967) {
                            this.field3968 = 0;
                            this.field3967 = this.method4010().length();
                        }
                        else {
                            this.field3968 = this.font.method6629(method27838, -1, method27839, false);
                            this.field3967 = this.font.method6629(method27838, 1, method27839, false);
                        }
                    }
                    else {
                        this.field3967 = method27839;
                        if (!Screen.hasShiftDown()) {
                            this.field3968 = this.field3967;
                        }
                    }
                }
                this.field3970 = method27839;
            }
            this.field3969 = method27837;
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (n3 == 0) {
            if (this.field3964 >= 0) {
                if (this.field3964 < this.field3965.size()) {
                    final String s = this.field3965.get(this.field3964);
                    final Class7116 class7116 = new Class7116(this, (int)n, (int)n2);
                    this.method4020(class7116);
                    this.method4019(class7116);
                    final int method4023 = this.method4023(s, class7116);
                    if (method4023 >= 0) {
                        this.field3967 = method4023;
                    }
                }
            }
        }
        return super.mouseDragged(n, n2, n3, n4, n5);
    }
}
