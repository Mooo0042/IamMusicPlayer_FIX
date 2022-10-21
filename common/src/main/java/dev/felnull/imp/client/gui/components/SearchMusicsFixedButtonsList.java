package dev.felnull.imp.client.gui.components;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.felnull.imp.client.gui.IIMPSmartRender;
import dev.felnull.imp.client.gui.screen.monitor.music_manager.MusicManagerMonitor;
import dev.felnull.imp.client.music.media.MusicMediaResult;
import dev.felnull.imp.client.renderer.PlayImageRenderer;
import dev.felnull.otyacraftengine.client.gui.components.FixedButtonsList;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SearchMusicsFixedButtonsList extends FixedButtonsList<MusicMediaResult> implements IIMPSmartRender {
    public SearchMusicsFixedButtonsList(int x, int y, int w, int h, int num, Component name, List<MusicMediaResult> list, PressEntry<MusicMediaResult> onPressEntry) {
        super(x, y, w, h, MusicManagerMonitor.WIDGETS_TEXTURE, 0, 20, 256, 256, num, name, list, n -> Component.literal(n.name()), onPressEntry);
    }

    @Override
    protected void renderOneButton(PoseStack poseStack, MusicMediaResult item, int lnum, int bnum, int x, int y, int mx, int my, float parTick) {
        drawSmartButtonBox(poseStack, x, y, getOneButtonWidth(), getOneButtonHeight(), this.getYImage(this.isHoveredOrFocused(bnum)));
        var img = item.imageInfo();
        float sx = 1;

        if (!img.isEmpty()) {
            sx += getOneButtonHeight() - 2 + 1;
            PlayImageRenderer.getInstance().draw(img, poseStack, x + 1, y + 1, getOneButtonHeight() - 2, false);
        }
        drawSmartFixedWidthText(poseStack, Component.literal(item.name()), x + sx, y + 2, getOneButtonWidth() - sx - 2);
        drawSmartFixedWidthText(poseStack, Component.literal(item.author()), x + sx, y + 12, getOneButtonWidth() - sx - 2);

    }
}
